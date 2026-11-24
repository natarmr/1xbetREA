package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.header.ims.WWWAuthenticateHeaderIms;
import android.javax.sip.address.URI;
import android.javax.sip.header.WWWAuthenticateHeader;

/* JADX INFO: loaded from: classes.dex */
public class WWWAuthenticate extends AuthenticationHeader implements WWWAuthenticateHeader, WWWAuthenticateHeaderIms {
    private static final long serialVersionUID = 115378648697363486L;

    public WWWAuthenticate() {
        super("WWW-Authenticate");
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader, android.javax.sip.header.WWWAuthenticateHeader
    public URI getURI() {
        return null;
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader, android.javax.sip.header.WWWAuthenticateHeader
    public void setURI(URI uri) {
    }
}
