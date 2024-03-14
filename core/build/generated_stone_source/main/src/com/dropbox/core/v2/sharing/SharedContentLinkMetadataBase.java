/* DO NOT EDIT */
/* This file was generated from shared_content_links.stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.stone.StoneDeserializerLogger;
import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;
import com.dropbox.core.util.LangUtil;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SharedContentLinkMetadataBase {
    // struct sharing.SharedContentLinkMetadataBase (shared_content_links.stone)

    protected final AccessLevel accessLevel;
    protected final List<LinkAudience> audienceOptions;
    protected final AudienceRestrictingSharedFolder audienceRestrictingSharedFolder;
    protected final LinkAudience currentAudience;
    protected final Date expiry;
    protected final List<LinkPermission> linkPermissions;
    protected final boolean passwordProtected;

    /**
     * Use {@link newBuilder} to create instances of this class without
     * specifying values for all optional fields.
     *
     * @param audienceOptions  The audience options that are available for the
     *     content. Some audience options may be unavailable. For example,
     *     team_only may be unavailable if the content is not owned by a user on
     *     a team. The 'default' audience option is always available if the user
     *     can modify link settings. Must not contain a {@code null} item and
     *     not be {@code null}.
     * @param currentAudience  The current audience of the link. Must not be
     *     {@code null}.
     * @param linkPermissions  A list of permissions for actions you can perform
     *     on the link. Must not contain a {@code null} item and not be {@code
     *     null}.
     * @param passwordProtected  Whether the link is protected by a password.
     * @param accessLevel  The access level on the link for this file.
     * @param audienceRestrictingSharedFolder  The shared folder that prevents
     *     the link audience for this link from being more restrictive.
     * @param expiry  Whether the link has an expiry set on it. A link with an
     *     expiry will have its  audience changed to members when the expiry is
     *     reached.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public SharedContentLinkMetadataBase(List<LinkAudience> audienceOptions, LinkAudience currentAudience, List<LinkPermission> linkPermissions, boolean passwordProtected, AccessLevel accessLevel, AudienceRestrictingSharedFolder audienceRestrictingSharedFolder, Date expiry) {
        this.accessLevel = accessLevel;
        if (audienceOptions == null) {
            throw new IllegalArgumentException("Required value for 'audienceOptions' is null");
        }
        for (LinkAudience x : audienceOptions) {
            if (x == null) {
                throw new IllegalArgumentException("An item in list 'audienceOptions' is null");
            }
        }
        this.audienceOptions = audienceOptions;
        this.audienceRestrictingSharedFolder = audienceRestrictingSharedFolder;
        if (currentAudience == null) {
            throw new IllegalArgumentException("Required value for 'currentAudience' is null");
        }
        this.currentAudience = currentAudience;
        this.expiry = LangUtil.truncateMillis(expiry);
        if (linkPermissions == null) {
            throw new IllegalArgumentException("Required value for 'linkPermissions' is null");
        }
        for (LinkPermission x : linkPermissions) {
            if (x == null) {
                throw new IllegalArgumentException("An item in list 'linkPermissions' is null");
            }
        }
        this.linkPermissions = linkPermissions;
        this.passwordProtected = passwordProtected;
    }

    /**
     * None
     *
     * <p> The default values for unset fields will be used. </p>
     *
     * @param audienceOptions  The audience options that are available for the
     *     content. Some audience options may be unavailable. For example,
     *     team_only may be unavailable if the content is not owned by a user on
     *     a team. The 'default' audience option is always available if the user
     *     can modify link settings. Must not contain a {@code null} item and
     *     not be {@code null}.
     * @param currentAudience  The current audience of the link. Must not be
     *     {@code null}.
     * @param linkPermissions  A list of permissions for actions you can perform
     *     on the link. Must not contain a {@code null} item and not be {@code
     *     null}.
     * @param passwordProtected  Whether the link is protected by a password.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public SharedContentLinkMetadataBase(List<LinkAudience> audienceOptions, LinkAudience currentAudience, List<LinkPermission> linkPermissions, boolean passwordProtected) {
        this(audienceOptions, currentAudience, linkPermissions, passwordProtected, null, null, null);
    }

    /**
     * The audience options that are available for the content. Some audience
     * options may be unavailable. For example, team_only may be unavailable if
     * the content is not owned by a user on a team. The 'default' audience
     * option is always available if the user can modify link settings.
     *
     * @return value for this field, never {@code null}.
     */
    @javax.annotation.Nonnull
    public List<LinkAudience> getAudienceOptions() {
        return audienceOptions;
    }

    /**
     * The current audience of the link.
     *
     * @return value for this field, never {@code null}.
     */
    @javax.annotation.Nonnull
    public LinkAudience getCurrentAudience() {
        return currentAudience;
    }

    /**
     * A list of permissions for actions you can perform on the link.
     *
     * @return value for this field, never {@code null}.
     */
    @javax.annotation.Nonnull
    public List<LinkPermission> getLinkPermissions() {
        return linkPermissions;
    }

    /**
     * Whether the link is protected by a password.
     *
     * @return value for this field.
     */
    public boolean getPasswordProtected() {
        return passwordProtected;
    }

    /**
     * The access level on the link for this file.
     *
     * @return value for this field, or {@code null} if not present.
     */
    @javax.annotation.Nullable
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * The shared folder that prevents the link audience for this link from
     * being more restrictive.
     *
     * @return value for this field, or {@code null} if not present.
     */
    @javax.annotation.Nullable
    public AudienceRestrictingSharedFolder getAudienceRestrictingSharedFolder() {
        return audienceRestrictingSharedFolder;
    }

    /**
     * Whether the link has an expiry set on it. A link with an expiry will have
     * its  audience changed to members when the expiry is reached.
     *
     * @return value for this field, or {@code null} if not present.
     */
    @javax.annotation.Nullable
    public Date getExpiry() {
        return expiry;
    }

    /**
     * Returns a new builder for creating an instance of this class.
     *
     * @param audienceOptions  The audience options that are available for the
     *     content. Some audience options may be unavailable. For example,
     *     team_only may be unavailable if the content is not owned by a user on
     *     a team. The 'default' audience option is always available if the user
     *     can modify link settings. Must not contain a {@code null} item and
     *     not be {@code null}.
     * @param currentAudience  The current audience of the link. Must not be
     *     {@code null}.
     * @param linkPermissions  A list of permissions for actions you can perform
     *     on the link. Must not contain a {@code null} item and not be {@code
     *     null}.
     * @param passwordProtected  Whether the link is protected by a password.
     *
     * @return builder for this class.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public static Builder newBuilder(List<LinkAudience> audienceOptions, LinkAudience currentAudience, List<LinkPermission> linkPermissions, boolean passwordProtected) {
        return new Builder(audienceOptions, currentAudience, linkPermissions, passwordProtected);
    }

    /**
     * Builder for {@link SharedContentLinkMetadataBase}.
     */
    public static class Builder {
        protected final List<LinkAudience> audienceOptions;
        protected final LinkAudience currentAudience;
        protected final List<LinkPermission> linkPermissions;
        protected final boolean passwordProtected;

        protected AccessLevel accessLevel;
        protected AudienceRestrictingSharedFolder audienceRestrictingSharedFolder;
        protected Date expiry;

        protected Builder(List<LinkAudience> audienceOptions, LinkAudience currentAudience, List<LinkPermission> linkPermissions, boolean passwordProtected) {
            if (audienceOptions == null) {
                throw new IllegalArgumentException("Required value for 'audienceOptions' is null");
            }
            for (LinkAudience x : audienceOptions) {
                if (x == null) {
                    throw new IllegalArgumentException("An item in list 'audienceOptions' is null");
                }
            }
            this.audienceOptions = audienceOptions;
            if (currentAudience == null) {
                throw new IllegalArgumentException("Required value for 'currentAudience' is null");
            }
            this.currentAudience = currentAudience;
            if (linkPermissions == null) {
                throw new IllegalArgumentException("Required value for 'linkPermissions' is null");
            }
            for (LinkPermission x : linkPermissions) {
                if (x == null) {
                    throw new IllegalArgumentException("An item in list 'linkPermissions' is null");
                }
            }
            this.linkPermissions = linkPermissions;
            this.passwordProtected = passwordProtected;
            this.accessLevel = null;
            this.audienceRestrictingSharedFolder = null;
            this.expiry = null;
        }

        /**
         * Set value for optional field.
         *
         * @param accessLevel  The access level on the link for this file.
         *
         * @return this builder
         */
        public Builder withAccessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /**
         * Set value for optional field.
         *
         * @param audienceRestrictingSharedFolder  The shared folder that
         *     prevents the link audience for this link from being more
         *     restrictive.
         *
         * @return this builder
         */
        public Builder withAudienceRestrictingSharedFolder(AudienceRestrictingSharedFolder audienceRestrictingSharedFolder) {
            this.audienceRestrictingSharedFolder = audienceRestrictingSharedFolder;
            return this;
        }

        /**
         * Set value for optional field.
         *
         * @param expiry  Whether the link has an expiry set on it. A link with
         *     an expiry will have its  audience changed to members when the
         *     expiry is reached.
         *
         * @return this builder
         */
        public Builder withExpiry(Date expiry) {
            this.expiry = LangUtil.truncateMillis(expiry);
            return this;
        }

        /**
         * Builds an instance of {@link SharedContentLinkMetadataBase}
         * configured with this builder's values
         *
         * @return new instance of {@link SharedContentLinkMetadataBase}
         */
        public SharedContentLinkMetadataBase build() {
            return new SharedContentLinkMetadataBase(audienceOptions, currentAudience, linkPermissions, passwordProtected, accessLevel, audienceRestrictingSharedFolder, expiry);
        }
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            accessLevel,
            audienceOptions,
            audienceRestrictingSharedFolder,
            currentAudience,
            expiry,
            linkPermissions,
            passwordProtected
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
            SharedContentLinkMetadataBase other = (SharedContentLinkMetadataBase) obj;
            return ((this.audienceOptions == other.audienceOptions) || (this.audienceOptions.equals(other.audienceOptions)))
                && ((this.currentAudience == other.currentAudience) || (this.currentAudience.equals(other.currentAudience)))
                && ((this.linkPermissions == other.linkPermissions) || (this.linkPermissions.equals(other.linkPermissions)))
                && (this.passwordProtected == other.passwordProtected)
                && ((this.accessLevel == other.accessLevel) || (this.accessLevel != null && this.accessLevel.equals(other.accessLevel)))
                && ((this.audienceRestrictingSharedFolder == other.audienceRestrictingSharedFolder) || (this.audienceRestrictingSharedFolder != null && this.audienceRestrictingSharedFolder.equals(other.audienceRestrictingSharedFolder)))
                && ((this.expiry == other.expiry) || (this.expiry != null && this.expiry.equals(other.expiry)))
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
    private static class Serializer extends StructSerializer<SharedContentLinkMetadataBase> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(SharedContentLinkMetadataBase value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("audience_options");
            StoneSerializers.list(LinkAudience.Serializer.INSTANCE).serialize(value.audienceOptions, g);
            g.writeFieldName("current_audience");
            LinkAudience.Serializer.INSTANCE.serialize(value.currentAudience, g);
            g.writeFieldName("link_permissions");
            StoneSerializers.list(LinkPermission.Serializer.INSTANCE).serialize(value.linkPermissions, g);
            g.writeFieldName("password_protected");
            StoneSerializers.boolean_().serialize(value.passwordProtected, g);
            if (value.accessLevel != null) {
                g.writeFieldName("access_level");
                StoneSerializers.nullable(AccessLevel.Serializer.INSTANCE).serialize(value.accessLevel, g);
            }
            if (value.audienceRestrictingSharedFolder != null) {
                g.writeFieldName("audience_restricting_shared_folder");
                StoneSerializers.nullableStruct(AudienceRestrictingSharedFolder.Serializer.INSTANCE).serialize(value.audienceRestrictingSharedFolder, g);
            }
            if (value.expiry != null) {
                g.writeFieldName("expiry");
                StoneSerializers.nullable(StoneSerializers.timestamp()).serialize(value.expiry, g);
            }
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public SharedContentLinkMetadataBase deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            SharedContentLinkMetadataBase value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                List<LinkAudience> f_audienceOptions = null;
                LinkAudience f_currentAudience = null;
                List<LinkPermission> f_linkPermissions = null;
                Boolean f_passwordProtected = null;
                AccessLevel f_accessLevel = null;
                AudienceRestrictingSharedFolder f_audienceRestrictingSharedFolder = null;
                Date f_expiry = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("audience_options".equals(field)) {
                        f_audienceOptions = StoneSerializers.list(LinkAudience.Serializer.INSTANCE).deserialize(p);
                    }
                    else if ("current_audience".equals(field)) {
                        f_currentAudience = LinkAudience.Serializer.INSTANCE.deserialize(p);
                    }
                    else if ("link_permissions".equals(field)) {
                        f_linkPermissions = StoneSerializers.list(LinkPermission.Serializer.INSTANCE).deserialize(p);
                    }
                    else if ("password_protected".equals(field)) {
                        f_passwordProtected = StoneSerializers.boolean_().deserialize(p);
                    }
                    else if ("access_level".equals(field)) {
                        f_accessLevel = StoneSerializers.nullable(AccessLevel.Serializer.INSTANCE).deserialize(p);
                    }
                    else if ("audience_restricting_shared_folder".equals(field)) {
                        f_audienceRestrictingSharedFolder = StoneSerializers.nullableStruct(AudienceRestrictingSharedFolder.Serializer.INSTANCE).deserialize(p);
                    }
                    else if ("expiry".equals(field)) {
                        f_expiry = StoneSerializers.nullable(StoneSerializers.timestamp()).deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_audienceOptions == null) {
                    throw new JsonParseException(p, "Required field \"audience_options\" missing.");
                }
                if (f_currentAudience == null) {
                    throw new JsonParseException(p, "Required field \"current_audience\" missing.");
                }
                if (f_linkPermissions == null) {
                    throw new JsonParseException(p, "Required field \"link_permissions\" missing.");
                }
                if (f_passwordProtected == null) {
                    throw new JsonParseException(p, "Required field \"password_protected\" missing.");
                }
                value = new SharedContentLinkMetadataBase(f_audienceOptions, f_currentAudience, f_linkPermissions, f_passwordProtected, f_accessLevel, f_audienceRestrictingSharedFolder, f_expiry);
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