package android.gov.nist.javax.sip.address;

import android.javax.sip.address.SipURI;

/* JADX INFO: loaded from: classes.dex */
public interface SipURIExt extends SipURI {
    boolean hasGrParam();

    @Override // android.javax.sip.address.SipURI
    boolean hasLrParam();

    void removeHeader(String str);

    void removeHeaders();

    void setGrParam(String str);

    @Override // android.javax.sip.address.SipURI
    void setLrParam();
}
