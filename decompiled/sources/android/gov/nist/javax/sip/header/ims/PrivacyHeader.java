package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.Header;

/* JADX INFO: loaded from: classes.dex */
public interface PrivacyHeader extends Header {
    public static final String NAME = "Privacy";

    String getPrivacy();

    void setPrivacy(String str);
}
