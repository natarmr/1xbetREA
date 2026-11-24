package android.gov.nist.javax.sip.clientauthutils;

import android.javax.sip.ClientTransaction;
import android.javax.sip.SipProvider;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes.dex */
public interface AuthenticationHelper {
    ClientTransaction handleChallenge(Response response, ClientTransaction clientTransaction, SipProvider sipProvider, int i);

    ClientTransaction handleChallenge(Response response, ClientTransaction clientTransaction, SipProvider sipProvider, int i, boolean z);

    void removeCachedAuthenticationHeaders(String str);

    void setAuthenticationHeaders(Request request);
}
