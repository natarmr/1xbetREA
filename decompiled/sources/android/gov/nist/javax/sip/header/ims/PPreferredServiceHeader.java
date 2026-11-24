package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.Header;

/* JADX INFO: loaded from: classes.dex */
public interface PPreferredServiceHeader extends Header {
    public static final String NAME = "P-Preferred-Service";

    String getApplicationIdentifiers();

    String getSubserviceIdentifiers();

    void setApplicationIdentifiers(String str);

    void setSubserviceIdentifiers(String str);
}
