package android.gov.nist.javax.sip.header;

import android.javax.sip.address.URI;
import android.javax.sip.header.ProxyAuthenticateHeader;

/* JADX INFO: loaded from: classes.dex */
public class ProxyAuthenticate extends AuthenticationHeader implements ProxyAuthenticateHeader {
    private static final long serialVersionUID = 3826145955463251116L;

    public ProxyAuthenticate() {
        super("Proxy-Authenticate");
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader, android.javax.sip.header.WWWAuthenticateHeader
    public URI getURI() {
        return null;
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader, android.javax.sip.header.WWWAuthenticateHeader
    public void setURI(URI uri) {
    }
}
