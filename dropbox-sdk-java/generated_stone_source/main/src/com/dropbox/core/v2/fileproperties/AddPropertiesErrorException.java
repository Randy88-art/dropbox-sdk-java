/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.fileproperties;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link AddPropertiesError}
 * error.
 *
 * <p> This exception is raised by {@link
 * DbxUserFilePropertiesRequests#propertiesAdd(String,java.util.List)} and
 * {@link
 * com.dropbox.core.v2.files.DbxUserFilesRequests#propertiesAdd(String,java.util.List)}.
 * </p>
 */
public class AddPropertiesErrorException extends DbxApiException {
    // exception for routes:
    //     2/file_properties/properties/add
    //     2/files/properties/add

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserFilePropertiesRequests#propertiesAdd(String,java.util.List)} and
     * {@link
     * com.dropbox.core.v2.files.DbxUserFilesRequests#propertiesAdd(String,java.util.List)}.
     */
    public final AddPropertiesError errorValue;

    public AddPropertiesErrorException(String routeName, String requestId, LocalizedText userMessage, AddPropertiesError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}