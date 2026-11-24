package android.gov.nist.javax.sip.header;

import android.javax.sip.address.URI;

/* JADX INFO: loaded from: classes.dex */
public interface SipRequestLine {
    String getMethod();

    String getSipVersion();

    URI getUri();

    String getVersionMajor();

    String getVersionMinor();

    void setMethod(String str);

    void setSipVersion(String str);

    void setUri(URI uri);
}
