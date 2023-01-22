package com.dropbox.stone.java

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.SourceSet

/**
 * Stone Plugin
 *
 * Allows us to apply a Stone Plugin and utilize StoneTask.
 */
public class StonePlugin : Plugin<Project> {

    private lateinit var project: Project

    override fun apply(target: Project) {
        this.project = target
        val javaPluginExtension = project.extensions.getByType(JavaPluginExtension::class.java)

        // add generateStone task for all source sets (e.g. generateTestStone, etc)
        javaPluginExtension.sourceSets.forEach { sourceSet: SourceSet ->
            createTaskForSourceSet(project, sourceSet)
        }
    }

    private fun createTaskForSourceSet(
        project: Project,
        sourceSet: SourceSet
    ) {
        val isMainSourceSet = sourceSet.name == "main"
        val taskName: String = if (isMainSourceSet) {
            "generateStone"
        } else {
            "generate${sourceSet.name.capitalize()}Stone"
        }

        project.tasks.register(taskName, StoneTask::class.java){
            description = "Generate Stone Java source files for ${sourceSet.name}."

            val routeWhitelistFilterPropName = "com.dropbox.api.${sourceSet.name}.routeWhitelistFilter"
            val routeWhitelistFilterValue: String? = project.properties[routeWhitelistFilterPropName] as String?
            routeWhitelistFilterValue?.let {
                routeWhitelistFilter(it)
            }

            val specDirPropName = "com.dropbox.api.${sourceSet.name}.specDir"
            val specDirPropNameValue: String? = project.properties[specDirPropName] as String?
            val mySpecDir: String = specDirPropNameValue ?: "src/${sourceSet.name}/stone"

            specDir(mySpecDir)
            generatorDir("${project.projectDir.absoluteFile}/generator/java")
            stoneDir("stone")
            pythonCommand("python")
            outputDir("${project.buildDir}/generated/source/stone/${sourceSet.name}")
            inputs
                .dir { project.fileTree(this.getGeneratorDir()) { filter { !it.name.endsWith(".pyc") } } }
                .withPropertyName("stone")
                .withPathSensitivity(PathSensitivity.RELATIVE)

            val specDir = this.getSpecDir().get()
            inputs
                .dir(this.getSpecFiles(project.objects, specDir))
                .withPathSensitivity(PathSensitivity.RELATIVE)
                .withPropertyName("stoneSpec")
                .skipWhenEmpty(true)
            outputs
                .dir { this.getOutputDir() }
                .withPropertyName("generatedStone")
            outputs.cacheIf { true }

            val compileJava: Task = project.tasks.getByName(sourceSet.getCompileTaskName("java"))
            compileJava.dependsOn(project.tasks.named(taskName))
            val compileKotlin: Task = project.tasks.getByName(sourceSet.getCompileTaskName("kotlin"))
            compileKotlin.dependsOn(project.tasks.named(taskName))

            sourceSet.java.srcDir("${getOutputDir().get()}/src")
        }
    }
}
