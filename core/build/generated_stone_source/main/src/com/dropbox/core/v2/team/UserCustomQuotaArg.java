/* DO NOT EDIT */
/* This file was generated from team_member_space_limits.stone */

package com.dropbox.core.v2.team;

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
 * User and their required custom quota in GB (1 TB = 1024 GB).
 */
public class UserCustomQuotaArg {
    // struct team.UserCustomQuotaArg (team_member_space_limits.stone)

    protected final UserSelectorArg user;
    protected final long quotaGb;

    /**
     * User and their required custom quota in GB (1 TB = 1024 GB).
     *
     * @param user  Must not be {@code null}.
     * @param quotaGb  Must be greater than or equal to 15.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public UserCustomQuotaArg(@Nonnull UserSelectorArg user, long quotaGb) {
        if (user == null) {
            throw new IllegalArgumentException("Required value for 'user' is null");
        }
        this.user = user;
        if (quotaGb < 15L) {
            throw new IllegalArgumentException("Number 'quotaGb' is smaller than 15L");
        }
        this.quotaGb = quotaGb;
    }

    /**
     *
     * @return value for this field, never {@code null}.
     */
    @Nonnull
    public UserSelectorArg getUser() {
        return user;
    }

    /**
     *
     * @return value for this field.
     */
    public long getQuotaGb() {
        return quotaGb;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            user,
            quotaGb
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
            UserCustomQuotaArg other = (UserCustomQuotaArg) obj;
            return ((this.user == other.user) || (this.user.equals(other.user)))
                && (this.quotaGb == other.quotaGb)
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
    static class Serializer extends StructSerializer<UserCustomQuotaArg> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(UserCustomQuotaArg value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("user");
            UserSelectorArg.Serializer.INSTANCE.serialize(value.user, g);
            g.writeFieldName("quota_gb");
            StoneSerializers.uInt32().serialize(value.quotaGb, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public UserCustomQuotaArg deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            UserCustomQuotaArg value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                UserSelectorArg f_user = null;
                Long f_quotaGb = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("user".equals(field)) {
                        f_user = UserSelectorArg.Serializer.INSTANCE.deserialize(p);
                    }
                    else if ("quota_gb".equals(field)) {
                        f_quotaGb = StoneSerializers.uInt32().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_user == null) {
                    throw new JsonParseException(p, "Required field \"user\" missing.");
                }
                if (f_quotaGb == null) {
                    throw new JsonParseException(p, "Required field \"quota_gb\" missing.");
                }
                value = new UserCustomQuotaArg(f_user, f_quotaGb);
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
