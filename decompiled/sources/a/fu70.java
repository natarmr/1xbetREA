package a;

import android.net.sip.SipAudioCall;
import android.net.sip.SipManager;
import android.net.sip.SipProfile;
import android.net.sip.SipRegistrationListener;

/* JADX INFO: loaded from: classes4.dex */
public final class fu70 implements SipRegistrationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gu70 f10149a;

    public fu70(gu70 gu70Var) {
        this.f10149a = gu70Var;
    }

    @Override // android.net.sip.SipRegistrationListener
    public final void onRegistering(String str) {
        str.getClass();
        this.f10149a.c.a("tryingRegisterProfile", "profileUri - ".concat(str));
    }

    @Override // android.net.sip.SipRegistrationListener
    public final void onRegistrationDone(String str, long j) {
        String localizedMessage;
        str.getClass();
        gu70 gu70Var = this.f10149a;
        n6k0 n6k0Var = gu70Var.c;
        n6k0Var.a("registrationProfileDone", "profileUri - " + str + " expiryTime - " + j);
        if (gu70Var.f == null) {
            try {
                n6k0Var.a("tryingDomain", "domain - " + gu70Var.h);
                SipManager sipManager = gu70Var.f11916a;
                SipProfile sipProfile = gu70Var.e;
                gu70Var.f = sipManager.makeAudioCall(sipProfile != null ? sipProfile.getUriString() : null, gu70Var.h, (SipAudioCall.Listener) gu70Var.s.getValue(), 30);
            } catch (Exception e) {
                xiz xizVar = gu70Var.n;
                if (xizVar != null) {
                    xizVar.invoke();
                }
                e.printStackTrace();
                Throwable cause = e.getCause();
                if (cause != null && (localizedMessage = cause.getLocalizedMessage()) != null) {
                    n6k0Var.a("errorCall", "error - ".concat(localizedMessage));
                }
                gu70Var.a();
            }
        }
        xiz xizVar2 = gu70Var.k;
        if (xizVar2 != null) {
            xizVar2.invoke();
        }
    }

    @Override // android.net.sip.SipRegistrationListener
    public final void onRegistrationFailed(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        gu70 gu70Var = this.f10149a;
        n6k0 n6k0Var = gu70Var.c;
        StringBuilder sbP = kng0.p(i, "profileUri - ", str, " errorCode - ", " errorMessage - ");
        sbP.append(str2);
        n6k0Var.a("registrationProfileFailed", sbP.toString());
        if (i != -9) {
            if (i != -5) {
                xiz xizVar = gu70Var.m;
                if (xizVar != null) {
                    xizVar.invoke();
                    return;
                }
                return;
            }
            xiz xizVar2 = gu70Var.l;
            if (xizVar2 != null) {
                xizVar2.invoke();
            }
        }
    }
}
