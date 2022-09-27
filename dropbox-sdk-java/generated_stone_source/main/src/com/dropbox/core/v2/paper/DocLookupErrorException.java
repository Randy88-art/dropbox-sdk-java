/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.paper;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link DocLookupError}
 * error.
 *
 * <p> This exception is raised by {@link
 * DbxUserPaperRequests#docsArchive(String)}, {@link
 * DbxUserPaperRequests#docsDownload(String,ExportFormat)}, {@link
 * DbxUserPaperRequests#docsFolderUsersList(String,int)}, {@link
 * DbxUserPaperRequests#docsGetFolderInfo(String)}, {@link
 * DbxUserPaperRequests#docsPermanentlyDelete(String)}, {@link
 * DbxUserPaperRequests#docsSharingPolicyGet(String)}, {@link
 * DbxUserPaperRequests#docsSharingPolicySet(String,SharingPolicy)}, {@link
 * DbxUserPaperRequests#docsUsersAdd(String,java.util.List)}, {@link
 * DbxUserPaperRequests#docsUsersList(String)}, and {@link
 * DbxUserPaperRequests#docsUsersRemove(String,com.dropbox.core.v2.sharing.MemberSelector)}.
 * </p>
 */
public class DocLookupErrorException extends DbxApiException {
    // exception for routes:
    //     2/paper/docs/archive
    //     2/paper/docs/download
    //     2/paper/docs/folder_users/list
    //     2/paper/docs/get_folder_info
    //     2/paper/docs/permanently_delete
    //     2/paper/docs/sharing_policy/get
    //     2/paper/docs/sharing_policy/set
    //     2/paper/docs/users/add
    //     2/paper/docs/users/list
    //     2/paper/docs/users/remove

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link DbxUserPaperRequests#docsArchive(String)},
     * {@link DbxUserPaperRequests#docsDownload(String,ExportFormat)}, {@link
     * DbxUserPaperRequests#docsFolderUsersList(String,int)}, {@link
     * DbxUserPaperRequests#docsGetFolderInfo(String)}, {@link
     * DbxUserPaperRequests#docsPermanentlyDelete(String)}, {@link
     * DbxUserPaperRequests#docsSharingPolicyGet(String)}, {@link
     * DbxUserPaperRequests#docsSharingPolicySet(String,SharingPolicy)}, {@link
     * DbxUserPaperRequests#docsUsersAdd(String,java.util.List)}, {@link
     * DbxUserPaperRequests#docsUsersList(String)}, and {@link
     * DbxUserPaperRequests#docsUsersRemove(String,com.dropbox.core.v2.sharing.MemberSelector)}.
     */
    public final DocLookupError errorValue;

    public DocLookupErrorException(String routeName, String requestId, LocalizedText userMessage, DocLookupError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}