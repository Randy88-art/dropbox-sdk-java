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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Non team member's logged information.
 */
public class NonTeamMemberLogInfo extends UserLogInfo {
    // struct team_log.NonTeamMemberLogInfo (team_log_generated.stone)


    /**
     * Non team member's logged information.
     *
     * <p> Use {@link newBuilder} to create instances of this class without
     * specifying values for all optional fields. </p>
     *
     * @param accountId  User unique ID. Must have length of at least 40 and
     *     have length of at most 40.
     * @param displayName  User display name.
     * @param email  User email address. Must have length of at most 255.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public NonTeamMemberLogInfo(@Nullable String accountId, @Nullable String displayName, @Nullable String email) {
        super(accountId, displayName, email);
    }

    /**
     * Non team member's logged information.
     *
     * <p> The default values for unset fields will be used. </p>
     */
    public NonTeamMemberLogInfo() {
        this(null, null, null);
    }

    /**
     * User unique ID.
     *
     * @return value for this field, or {@code null} if not present.
     */
    @Nullable
    public String getAccountId() {
        return accountId;
    }

    /**
     * User display name.
     *
     * @return value for this field, or {@code null} if not present.
     */
    @Nullable
    public String getDisplayName() {
        return displayName;
    }

    /**
     * User email address.
     *
     * @return value for this field, or {@code null} if not present.
     */
    @Nullable
    public String getEmail() {
        return email;
    }

    /**
     * Returns a new builder for creating an instance of this class.
     *
     * @return builder for this class.
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Builder for {@link NonTeamMemberLogInfo}.
     */
    public static class Builder extends UserLogInfo.Builder {

        protected Builder() {
        }

        /**
         * Set value for optional field.
         *
         * @param accountId  User unique ID. Must have length of at least 40 and
         *     have length of at most 40.
         *
         * @return this builder
         *
         * @throws IllegalArgumentException  If any argument does not meet its
         *     preconditions.
         */
        public Builder withAccountId(String accountId) {
            super.withAccountId(accountId);
            return this;
        }

        /**
         * Set value for optional field.
         *
         * @param displayName  User display name.
         *
         * @return this builder
         */
        public Builder withDisplayName(String displayName) {
            super.withDisplayName(displayName);
            return this;
        }

        /**
         * Set value for optional field.
         *
         * @param email  User email address. Must have length of at most 255.
         *
         * @return this builder
         *
         * @throws IllegalArgumentException  If any argument does not meet its
         *     preconditions.
         */
        public Builder withEmail(String email) {
            super.withEmail(email);
            return this;
        }

        /**
         * Builds an instance of {@link NonTeamMemberLogInfo} configured with
         * this builder's values
         *
         * @return new instance of {@link NonTeamMemberLogInfo}
         */
        public NonTeamMemberLogInfo build() {
            return new NonTeamMemberLogInfo(accountId, displayName, email);
        }
    }

    @Override
    public int hashCode() {
        // attempt to deal with inheritance
        return getClass().toString().hashCode();
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
            NonTeamMemberLogInfo other = (NonTeamMemberLogInfo) obj;
            return ((this.accountId == other.accountId) || (this.accountId != null && this.accountId.equals(other.accountId)))
                && ((this.displayName == other.displayName) || (this.displayName != null && this.displayName.equals(other.displayName)))
                && ((this.email == other.email) || (this.email != null && this.email.equals(other.email)))
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
    static class Serializer extends StructSerializer<NonTeamMemberLogInfo> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(NonTeamMemberLogInfo value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            writeTag("non_team_member", g);
            if (value.accountId != null) {
                g.writeFieldName("account_id");
                StoneSerializers.nullable(StoneSerializers.string()).serialize(value.accountId, g);
            }
            if (value.displayName != null) {
                g.writeFieldName("display_name");
                StoneSerializers.nullable(StoneSerializers.string()).serialize(value.displayName, g);
            }
            if (value.email != null) {
                g.writeFieldName("email");
                StoneSerializers.nullable(StoneSerializers.string()).serialize(value.email, g);
            }
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public NonTeamMemberLogInfo deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            NonTeamMemberLogInfo value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
                if ("non_team_member".equals(tag)) {
                    tag = null;
                }
            }
            if (tag == null) {
                String f_accountId = null;
                String f_displayName = null;
                String f_email = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("account_id".equals(field)) {
                        f_accountId = StoneSerializers.nullable(StoneSerializers.string()).deserialize(p);
                    }
                    else if ("display_name".equals(field)) {
                        f_displayName = StoneSerializers.nullable(StoneSerializers.string()).deserialize(p);
                    }
                    else if ("email".equals(field)) {
                        f_email = StoneSerializers.nullable(StoneSerializers.string()).deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                value = new NonTeamMemberLogInfo(f_accountId, f_displayName, f_email);
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
