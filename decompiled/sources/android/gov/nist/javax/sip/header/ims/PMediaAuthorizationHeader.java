package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.Header;

/* JADX INFO: loaded from: classes.dex */
public interface PMediaAuthorizationHeader extends Header {
    public static final String NAME = "P-Media-Authorization";

    String getToken();

    void setMediaAuthorizationToken(String str);
}
