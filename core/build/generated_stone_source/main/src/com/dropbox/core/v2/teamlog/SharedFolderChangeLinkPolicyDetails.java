/* DO NOT EDIT */
/* This file was generated from team_log_generated.stone */

package com.dropbox.core.v2.teamlog;

import com.dropbox.core.stone.StoneDeserializerLogger;
import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;
import com.dropbox.core.v2.sharing.SharedLinkPolicy;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.util.Arrays;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Changed who can access shared folder via link.
 */
public class SharedFolderChangeLinkPolicyDetails {
    // struct team_log.SharedFolderChangeLinkPolicyDetails (team_log_generated.stone)

    @Nonnull
    protected final SharedLinkPolicy newValue;
    @Nullable
    protected final SharedLinkPolicy previousValue;

    /**
     * Changed who can access shared folder via link.
     *
     * @param newValue  New shared folder link policy. Must not be {@code null}.
     * @param previousValue  Previous shared folder link policy. Might be
     *     missing due to historical data gap.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public SharedFolderChangeLinkPolicyDetails(@Nonnull SharedLinkPolicy newValue, @Nullable SharedLinkPolicy previousValue) {
        if (newValue == null) {
            throw new IllegalArgumentException("Required value for 'newValue' is null");
        }
        this.newValue = newValue;
        this.previousValue = previousValue;
    }

    /**
     * Changed who can access shared folder via link.
     *
     * <p> The default values for unset fields will be used. </p>
     *
     * @param newValue  New shared folder link policy. Must not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public SharedFolderChangeLinkPolicyDetails(@Nonnull SharedLinkPolicy newValue) {
        this(newValue, null);
    }

    /**
     * New shared folder link policy.
     *
     * @return value for this field, never {@code null}.
     */
    @Nonnull
    public SharedLinkPolicy getNewValue() {
        return newValue;
    }

    /**
     * Previous shared folder link policy. Might be missing due to historical
     * data gap.
     *
     * @return value for this field, or {@code null} if not present.
     */
    @Nullable
    public SharedLinkPolicy getPreviousValue() {
        return previousValue;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            newValue,
            previousValue
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
            SharedFolderChangeLinkPolicyDetails other = (SharedFolderChangeLinkPolicyDetails) obj;
            return ((this.newValue == other.newValue) || (this.newValue.equals(other.newValue)))
                && ((this.previousValue == other.previousValue) || (this.previousValue != null && this.previousValue.equals(other.previousValue)))
                ;
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
    static class Serializer extends StructSerializer<SharedFolderChangeLinkPolicyDetails> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(SharedFolderChangeLinkPolicyDetails value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("new_value");
            SharedLinkPolicy.Serializer.INSTANCE.serialize(value.newValue, g);
            if (value.previousValue != null) {
                g.writeFieldName("previous_value");
                StoneSerializers.nullable(SharedLinkPolicy.Serializer.INSTANCE).serialize(value.previousValue, g);
            }
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public SharedFolderChangeLinkPolicyDetails deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            SharedFolderChangeLinkPolicyDetails value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                SharedLinkPolicy f_newValue = null;
                SharedLinkPolicy f_previousValue = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("new_value".equals(field)) {
                        f_newValue = SharedLinkPolicy.Serializer.INSTANCE.deserialize(p);
                    }
                    else if ("previous_value".equals(field)) {
                        f_previousValue = StoneSerializers.nullable(SharedLinkPolicy.Serializer.INSTANCE).deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_newValue == null) {
                    throw new JsonParseException(p, "Required field \"new_value\" missing.");
                }
                value = new SharedFolderChangeLinkPolicyDetails(f_newValue, f_previousValue);
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
