package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import android.javax.sip.header.AuthorizationHeader;

/* JADX INFO: loaded from: classes.dex */
public class Authorization extends AuthenticationHeader implements AuthorizationHeader, AuthorizationHeaderIms {
    private static final long serialVersionUID = -8897770321892281348L;

    public Authorization() {
        super("Authorization");
    }
}
