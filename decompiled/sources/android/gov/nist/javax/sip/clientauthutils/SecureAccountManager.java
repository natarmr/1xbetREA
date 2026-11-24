package android.gov.nist.javax.sip.clientauthutils;

import android.javax.sip.ClientTransaction;

/* JADX INFO: loaded from: classes.dex */
public interface SecureAccountManager {
    UserCredentialHash getCredentialHash(ClientTransaction clientTransaction, String str);
}
