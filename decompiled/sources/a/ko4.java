package a;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class ko4 extends BiometricPrompt$AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ro4 f18612a;

    public ko4(ro4 ro4Var) {
        this.f18612a = ro4Var;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ro4 ro4Var = this.f18612a;
        switch (ro4Var.f30818a) {
            case 0:
                uo4 uo4Var = (uo4) ro4Var.b.get();
                if (uo4Var != null) {
                    uo4Var.b.getClass();
                    uo4Var.c.getClass();
                }
                break;
            default:
                WeakReference weakReference = ro4Var.b;
                if (weakReference.get() != null && !((t58) weakReference.get()).n && ((t58) weakReference.get()).m) {
                    t58 t58Var = (t58) weakReference.get();
                    d58 d58Var = new d58(i, charSequence);
                    hy40 hy40Var = t58Var.t;
                    if (hy40Var == null) {
                        hy40Var = new hy40();
                        t58Var.t = hy40Var;
                    }
                    t58.z(hy40Var, d58Var);
                    break;
                }
                break;
        }
    }

    public final void onAuthenticationFailed() {
        ro4 ro4Var = this.f18612a;
        switch (ro4Var.f30818a) {
            case 0:
                uo4 uo4Var = (uo4) ro4Var.b.get();
                if (uo4Var != null) {
                    uo4Var.c.getClass();
                }
                break;
            default:
                WeakReference weakReference = ro4Var.b;
                if (weakReference.get() != null && ((t58) weakReference.get()).m) {
                    t58 t58Var = (t58) weakReference.get();
                    hy40 hy40Var = t58Var.v;
                    if (hy40Var == null) {
                        hy40Var = new hy40();
                        t58Var.v = hy40Var;
                    }
                    t58.z(hy40Var, Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        int iF;
        BiometricPrompt.CryptoObject cryptoObjectK;
        long jB;
        KeyAgreement keyAgreement;
        PresentationSession presentationSessionI;
        IdentityCredential identityCredentialG;
        q58 q58Var = null;
        if (authenticationResult != null && (cryptoObjectK = ia3.k(authenticationResult)) != null) {
            Cipher cipherJ = ia3.j(cryptoObjectK);
            if (cipherJ != null) {
                q58Var = new q58(cipherJ);
            } else {
                Signature signatureY = ia3.y(cryptoObjectK);
                if (signatureY != null) {
                    q58Var = new q58(signatureY);
                } else {
                    Mac macN = ia3.n(cryptoObjectK);
                    if (macN != null) {
                        q58Var = new q58(macN);
                    } else {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 30 && (identityCredentialG = e7.g(cryptoObjectK)) != null) {
                            q58Var = new q58(identityCredentialG);
                        } else if (i >= 33 && (presentationSessionI = f7.i(cryptoObjectK)) != null) {
                            q58Var = new q58(presentationSessionI);
                        } else if (i >= 36) {
                            if ((i < 36 ? 100000 * i : Build.VERSION.SDK_INT_FULL) >= 3600001 && (keyAgreement = cryptoObjectK.getKeyAgreement()) != null) {
                                q58Var = new q58(keyAgreement);
                            } else if (i >= 35) {
                                jB = qef.b(cryptoObjectK);
                                if (jB != 0) {
                                    q58Var = new q58(jB);
                                }
                            }
                        } else if (i >= 35) {
                            jB = qef.b(cryptoObjectK);
                            if (jB != 0) {
                                q58Var = new q58(jB);
                            }
                        }
                    }
                }
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            if (authenticationResult != null) {
                iF = e7.f(authenticationResult);
            } else {
                iF = -1;
            }
        } else if (i2 == 29) {
            iF = -1;
        } else {
            iF = 2;
        }
        p58 p58Var = new p58(q58Var, iF);
        ro4 ro4Var = this.f18612a;
        switch (ro4Var.f30818a) {
            case 0:
                uo4 uo4Var = (uo4) ro4Var.b.get();
                if (uo4Var != null) {
                    uo4Var.c.getClass();
                }
                break;
            default:
                WeakReference weakReference = ro4Var.b;
                if (weakReference.get() != null && ((t58) weakReference.get()).m) {
                    if (p58Var.b == -1) {
                        int i3 = ((t58) weakReference.get()).r;
                        p58Var = new p58(p58Var.f26393a, ((i3 & 32767) == 0 || hmw0.Z(i3)) ? -1 : 2);
                    }
                    t58 t58Var = (t58) weakReference.get();
                    hy40 hy40Var = t58Var.s;
                    if (hy40Var == null) {
                        hy40Var = new hy40();
                        t58Var.s = hy40Var;
                    }
                    t58.z(hy40Var, p58Var);
                    break;
                }
                break;
        }
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
