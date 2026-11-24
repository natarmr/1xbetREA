package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.AuthorizationHeader;

/* JADX INFO: loaded from: classes.dex */
public interface AuthorizationHeaderIms extends AuthorizationHeader {
    public static final String NO = "no";
    public static final String YES = "yes";

    String getIntegrityProtected();

    void setIntegrityProtected(String str);
}
