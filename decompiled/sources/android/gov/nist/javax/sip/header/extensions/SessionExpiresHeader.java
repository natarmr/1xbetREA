package android.gov.nist.javax.sip.header.extensions;

import android.javax.sip.header.ExtensionHeader;
import android.javax.sip.header.Header;
import android.javax.sip.header.Parameters;

/* JADX INFO: loaded from: classes.dex */
public interface SessionExpiresHeader extends Parameters, Header, ExtensionHeader {
    public static final String NAME = "Session-Expires";

    int getExpires();

    String getRefresher();

    void setExpires(int i);

    void setRefresher(String str);
}
