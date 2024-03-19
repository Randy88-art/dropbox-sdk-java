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
 * Created a summary report for a hold.
 */
public class LegalHoldsReportAHoldDetails {
    // struct team_log.LegalHoldsReportAHoldDetails (team_log_generated.stone)

    @Nonnull
    protected final String legalHoldId;
    @Nonnull
    protected final String name;

    /**
     * Created a summary report for a hold.
     *
     * @param legalHoldId  Hold ID. Must not be {@code null}.
     * @param name  Hold name. Must not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public LegalHoldsReportAHoldDetails(@Nonnull String legalHoldId, @Nonnull String name) {
        if (legalHoldId == null) {
            throw new IllegalArgumentException("Required value for 'legalHoldId' is null");
        }
        this.legalHoldId = legalHoldId;
        if (name == null) {
            throw new IllegalArgumentException("Required value for 'name' is null");
        }
        this.name = name;
    }

    /**
     * Hold ID.
     *
     * @return value for this field, never {@code null}.
     */
    @Nonnull
    public String getLegalHoldId() {
        return legalHoldId;
    }

    /**
     * Hold name.
     *
     * @return value for this field, never {@code null}.
     */
    @Nonnull
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            legalHoldId,
            name
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
            LegalHoldsReportAHoldDetails other = (LegalHoldsReportAHoldDetails) obj;
            return ((this.legalHoldId == other.legalHoldId) || (this.legalHoldId.equals(other.legalHoldId)))
                && ((this.name == other.name) || (this.name.equals(other.name)))
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
    static class Serializer extends StructSerializer<LegalHoldsReportAHoldDetails> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(LegalHoldsReportAHoldDetails value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("legal_hold_id");
            StoneSerializers.string().serialize(value.legalHoldId, g);
            g.writeFieldName("name");
            StoneSerializers.string().serialize(value.name, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public LegalHoldsReportAHoldDetails deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            LegalHoldsReportAHoldDetails value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                String f_legalHoldId = null;
                String f_name = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("legal_hold_id".equals(field)) {
                        f_legalHoldId = StoneSerializers.string().deserialize(p);
                    }
                    else if ("name".equals(field)) {
                        f_name = StoneSerializers.string().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_legalHoldId == null) {
                    throw new JsonParseException(p, "Required field \"legal_hold_id\" missing.");
                }
                if (f_name == null) {
                    throw new JsonParseException(p, "Required field \"name\" missing.");
                }
                value = new LegalHoldsReportAHoldDetails(f_legalHoldId, f_name);
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
