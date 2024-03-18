/* DO NOT EDIT */
/* This file was generated from team_log_generated.stone */

package com.dropbox.core.v2.teamlog;

import com.dropbox.core.stone.StoneDeserializerLogger;
import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.util.Arrays;

import javax.annotation.Nonnull;

/**
 * Team's logged information.
 */
public class TeamLogInfo {
    // struct team_log.TeamLogInfo (team_log_generated.stone)

    @Nonnull
    protected final String displayName;

    /**
     * Team's logged information.
     *
     * @param displayName  Team display name. Must not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public TeamLogInfo(@Nonnull String displayName) {
        if (displayName == null) {
            throw new IllegalArgumentException("Required value for 'displayName' is null");
        }
        this.displayName = displayName;
    }

    /**
     * Team display name.
     *
     * @return value for this field, never {@code null}.
     */
    @Nonnull
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            displayName
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
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            TeamLogInfo other = (TeamLogInfo) obj;
            return (this.displayName == other.displayName) || (this.displayName.equals(other.displayName));
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
    static class Serializer extends StructSerializer<TeamLogInfo> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(TeamLogInfo value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("display_name");
            StoneSerializers.string().serialize(value.displayName, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public TeamLogInfo deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            TeamLogInfo value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                String f_displayName = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("display_name".equals(field)) {
                        f_displayName = StoneSerializers.string().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_displayName == null) {
                    throw new JsonParseException(p, "Required field \"display_name\" missing.");
                }
                value = new TeamLogInfo(f_displayName);
            }
            else {
                throw new JsonParseException(p, "No subtype found that matches tag: \"" + tag + "\"");
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            StoneDeserializerLogger.log(value, value.toStringMultiline());
            return value;
        }
    }
}
