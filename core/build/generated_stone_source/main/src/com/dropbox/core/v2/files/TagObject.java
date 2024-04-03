/* DO NOT EDIT */
/* This file was generated from file_tagging.stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.stone.StoneDeserializerLogger;
import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.util.Arrays;

/**
 * Tag that can be added in multiple ways.
 *
 * <p> This class is an open tagged union.  Tagged unions instances are always
 * associated to a specific tag.  This means only one of the {@code isAbc()}
 * methods will return {@code true}. You can use {@link #tag()} to determine the
 * tag associated with this instance. </p>
 *
 * <p> Open unions may be extended in the future with additional tags. If a new
 * tag is introduced that this SDK does not recognized, the {@link #OTHER} value
 * will be used. </p>
 */
public final class TagObject {
    // union files.Tag (file_tagging.stone)

    /**
     * Discriminating tag type for {@link TagObject}.
     */
    public enum Tag {
        /**
         * Tag generated by the user.
         */
        USER_GENERATED_TAG, // UserGeneratedTag
        /**
         * Catch-all used for unknown tag values returned by the Dropbox
         * servers.
         *
         * <p> Receiving a catch-all value typically indicates this SDK version
         * is not up to date. Consider updating your SDK version to handle the
         * new tags. </p>
         */
        OTHER; // *catch_all
    }

    /**
     * Catch-all used for unknown tag values returned by the Dropbox servers.
     *
     * <p> Receiving a catch-all value typically indicates this SDK version is
     * not up to date. Consider updating your SDK version to handle the new
     * tags. </p>
     */
    public static final TagObject OTHER = new TagObject().withTag(Tag.OTHER);

    private Tag _tag;
    private UserGeneratedTag userGeneratedTagValue;

    /**
     * Private default constructor, so that object is uninitializable publicly.
     */
    private TagObject() {
    }


    /**
     * Tag that can be added in multiple ways.
     *
     * @param _tag  Discriminating tag for this instance.
     */
    private TagObject withTag(Tag _tag) {
        TagObject result = new TagObject();
        result._tag = _tag;
        return result;
    }

    /**
     * Tag that can be added in multiple ways.
     *
     * @param userGeneratedTagValue  Tag generated by the user. Must not be
     *     {@code null}.
     * @param _tag  Discriminating tag for this instance.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    private TagObject withTagAndUserGeneratedTag(Tag _tag, UserGeneratedTag userGeneratedTagValue) {
        TagObject result = new TagObject();
        result._tag = _tag;
        result.userGeneratedTagValue = userGeneratedTagValue;
        return result;
    }

    /**
     * Returns the tag for this instance.
     *
     * <p> This class is a tagged union.  Tagged unions instances are always
     * associated to a specific tag.  This means only one of the {@code isXyz()}
     * methods will return {@code true}. Callers are recommended to use the tag
     * value in a {@code switch} statement to properly handle the different
     * values for this {@code TagObject}. </p>
     *
     * <p> If a tag returned by the server is unrecognized by this SDK, the
     * {@link Tag#OTHER} value will be used. </p>
     *
     * @return the tag for this instance.
     */
    public Tag tag() {
        return _tag;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#USER_GENERATED_TAG}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#USER_GENERATED_TAG}, {@code false} otherwise.
     */
    public boolean isUserGeneratedTag() {
        return this._tag == Tag.USER_GENERATED_TAG;
    }

    /**
     * Returns an instance of {@code TagObject} that has its tag set to {@link
     * Tag#USER_GENERATED_TAG}.
     *
     * <p> Tag generated by the user. </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code TagObject} with its tag set to {@link
     *     Tag#USER_GENERATED_TAG}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static TagObject userGeneratedTag(UserGeneratedTag value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new TagObject().withTagAndUserGeneratedTag(Tag.USER_GENERATED_TAG, value);
    }

    /**
     * Tag generated by the user.
     *
     * <p> This instance must be tagged as {@link Tag#USER_GENERATED_TAG}. </p>
     *
     * @return The {@link UserGeneratedTag} value associated with this instance
     *     if {@link #isUserGeneratedTag} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isUserGeneratedTag} is {@code
     *     false}.
     */
    public UserGeneratedTag getUserGeneratedTagValue() {
        if (this._tag != Tag.USER_GENERATED_TAG) {
            throw new IllegalStateException("Invalid tag: required Tag.USER_GENERATED_TAG, but was Tag." + this._tag.name());
        }
        return userGeneratedTagValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#OTHER},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link Tag#OTHER},
     *     {@code false} otherwise.
     */
    public boolean isOther() {
        return this._tag == Tag.OTHER;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            this._tag,
            this.userGeneratedTagValue
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        else if (obj instanceof TagObject) {
            TagObject other = (TagObject) obj;
            if (this._tag != other._tag) {
                return false;
            }
            switch (_tag) {
                case USER_GENERATED_TAG:
                    return (this.userGeneratedTagValue == other.userGeneratedTagValue) || (this.userGeneratedTagValue.equals(other.userGeneratedTagValue));
                case OTHER:
                    return true;
                default:
                    return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static class Serializer extends UnionSerializer<TagObject> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(TagObject value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value.tag()) {
                case USER_GENERATED_TAG: {
                    g.writeStartObject();
                    writeTag("user_generated_tag", g);
                    UserGeneratedTag.Serializer.INSTANCE.serialize(value.userGeneratedTagValue, g, true);
                    g.writeEndObject();
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public TagObject deserialize(JsonParser p) throws IOException, JsonParseException {
            TagObject value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException(p, "Required field missing: " + TAG_FIELD);
            }
            else if ("user_generated_tag".equals(tag)) {
                UserGeneratedTag fieldValue = null;
                fieldValue = UserGeneratedTag.Serializer.INSTANCE.deserialize(p, true);
                value = TagObject.userGeneratedTag(fieldValue);
            }
            else {
                value = TagObject.OTHER;
            }
            if (!collapsed) {
                skipFields(p);
                expectEndObject(p);
            }
            return value;
        }
    }
}
