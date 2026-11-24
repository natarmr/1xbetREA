package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.Header;

/* JADX INFO: loaded from: classes.dex */
public interface PAssertedServiceHeader extends Header {
    public static final String NAME = "P-Asserted-Service";

    String getApplicationIdentifiers();

    String getSubserviceIdentifiers();

    void setApplicationIdentifiers(String str);

    void setSubserviceIdentifiers(String str);
}
