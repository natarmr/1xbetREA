package android.gov.nist.javax.sip.header;

import android.javax.sip.header.ProxyAuthorizationHeader;

/* JADX INFO: loaded from: classes.dex */
public class ProxyAuthorization extends AuthenticationHeader implements ProxyAuthorizationHeader {
    private static final long serialVersionUID = -6374966905199799098L;

    public ProxyAuthorization() {
        super("Proxy-Authorization");
    }
}
