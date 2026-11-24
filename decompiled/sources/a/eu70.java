package a;

import android.net.sip.SipAudioCall;
import android.net.sip.SipProfile;

/* JADX INFO: loaded from: classes4.dex */
public final class eu70 extends SipAudioCall.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gu70 f8406a;

    public eu70(gu70 gu70Var) {
        this.f8406a = gu70Var;
    }

    @Override // android.net.sip.SipAudioCall.Listener
    public final void onCallBusy(SipAudioCall sipAudioCall) {
        SipProfile localProfile;
        SipProfile peerProfile;
        super.onCallBusy(sipAudioCall);
        n6k0 n6k0Var = this.f8406a.c;
        String strB = null;
        String strB2 = (sipAudioCall == null || (peerProfile = sipAudioCall.getPeerProfile()) == null) ? null : gu70.b(peerProfile);
        if (sipAudioCall != null && (localProfile = sipAudioCall.getLocalProfile()) != null) {
            strB = gu70.b(localProfile);
        }
        n6k0Var.a("onCallBusySip", ua80.i("peerProfile ", strB2, " localProfile ", strB));
    }

    @Override // android.net.sip.SipAudioCall.Listener
    public final void onCallEnded(SipAudioCall sipAudioCall) {
        sipAudioCall.getClass();
        gu70 gu70Var = this.f8406a;
        n6k0 n6k0Var = gu70Var.c;
        SipProfile peerProfile = sipAudioCall.getPeerProfile();
        String strB = peerProfile != null ? gu70.b(peerProfile) : null;
        SipProfile localProfile = sipAudioCall.getLocalProfile();
        n6k0Var.a("onCallEndedSip", ua80.i("peerProfile ", strB, " localProfile ", localProfile != null ? gu70.b(localProfile) : null));
        xiz xizVar = gu70Var.p;
        if (xizVar != null) {
            xizVar.invoke();
        }
        sipAudioCall.close();
        gu70Var.f = null;
    }

    @Override // android.net.sip.SipAudioCall.Listener
    public final void onCallEstablished(SipAudioCall sipAudioCall) {
        sipAudioCall.getClass();
        super.onCallEstablished(sipAudioCall);
        gu70 gu70Var = this.f8406a;
        n6k0 n6k0Var = gu70Var.c;
        SipProfile peerProfile = sipAudioCall.getPeerProfile();
        String strB = peerProfile != null ? gu70.b(peerProfile) : null;
        SipProfile localProfile = sipAudioCall.getLocalProfile();
        n6k0Var.a("onCallEstablishedSip", ua80.i("peerProfile ", strB, " localProfile ", localProfile != null ? gu70.b(localProfile) : null));
        sipAudioCall.startAudio();
        xiz xizVar = gu70Var.o;
        if (xizVar != null) {
            xizVar.invoke();
        }
    }

    @Override // android.net.sip.SipAudioCall.Listener
    public final void onCallHeld(SipAudioCall sipAudioCall) {
        SipProfile localProfile;
        SipProfile peerProfile;
        super.onCallHeld(sipAudioCall);
        n6k0 n6k0Var = this.f8406a.c;
        String strB = null;
        String strB2 = (sipAudioCall == null || (peerProfile = sipAudioCall.getPeerProfile()) == null) ? null : gu70.b(peerProfile);
        if (sipAudioCall != null && (localProfile = sipAudioCall.getLocalProfile()) != null) {
            strB = gu70.b(localProfile);
        }
        n6k0Var.a("onCallHeldSip", ua80.i("peerProfile ", strB2, " localProfile ", strB));
    }

    @Override // android.net.sip.SipAudioCall.Listener
    public final void onCalling(SipAudioCall sipAudioCall) {
        SipProfile localProfile;
        SipProfile peerProfile;
        super.onCalling(sipAudioCall);
        n6k0 n6k0Var = this.f8406a.c;
        String strB = null;
        String strB2 = (sipAudioCall == null || (peerProfile = sipAudioCall.getPeerProfile()) == null) ? null : gu70.b(peerProfile);
        if (sipAudioCall != null && (localProfile = sipAudioCall.getLocalProfile()) != null) {
            strB = gu70.b(localProfile);
        }
        n6k0Var.a("onCallingSip", ua80.i("peerProfile ", strB2, " localProfile ", strB));
    }

    @Override // android.net.sip.SipAudioCall.Listener
    public final void onChanged(SipAudioCall sipAudioCall) {
        SipProfile localProfile;
        SipProfile peerProfile;
        super.onChanged(sipAudioCall);
        n6k0 n6k0Var = this.f8406a.c;
        String strB = null;
        String strB2 = (sipAudioCall == null || (peerProfile = sipAudioCall.getPeerProfile()) == null) ? null : gu70.b(peerProfile);
        if (sipAudioCall != null && (localProfile = sipAudioCall.getLocalProfile()) != null) {
            strB = gu70.b(localProfile);
        }
        n6k0Var.a("onChangedSip", ua80.i("peerProfile ", strB2, " localProfile ", strB));
    }

    @Override // android.net.sip.SipAudioCall.Listener
    public final void onError(SipAudioCall sipAudioCall, int i, String str) {
        SipProfile localProfile;
        SipProfile peerProfile;
        gu70 gu70Var = this.f8406a;
        n6k0 n6k0Var = gu70Var.c;
        String strB = null;
        String strB2 = (sipAudioCall == null || (peerProfile = sipAudioCall.getPeerProfile()) == null) ? null : gu70.b(peerProfile);
        if (sipAudioCall != null && (localProfile = sipAudioCall.getLocalProfile()) != null) {
            strB = gu70.b(localProfile);
        }
        n6k0Var.a("onCallErrorSip", rw2.o(vqd.r(i, "errorCode ", ", errorMessage ", str, " peerProfile "), strB2, "  localProfile ", strB));
        xiz xizVar = gu70Var.q;
        if (xizVar != null) {
            xizVar.invoke();
        }
        super.onError(sipAudioCall, i, str);
    }

    @Override // android.net.sip.SipAudioCall.Listener
    public final void onReadyToCall(SipAudioCall sipAudioCall) {
        SipProfile localProfile;
        SipProfile peerProfile;
        super.onReadyToCall(sipAudioCall);
        n6k0 n6k0Var = this.f8406a.c;
        String strB = null;
        String strB2 = (sipAudioCall == null || (peerProfile = sipAudioCall.getPeerProfile()) == null) ? null : gu70.b(peerProfile);
        if (sipAudioCall != null && (localProfile = sipAudioCall.getLocalProfile()) != null) {
            strB = gu70.b(localProfile);
        }
        n6k0Var.a("onReadyToCallSip", ua80.i("peerProfile ", strB2, " localProfile ", strB));
    }

    @Override // android.net.sip.SipAudioCall.Listener
    public final void onRinging(SipAudioCall sipAudioCall, SipProfile sipProfile) {
        SipProfile localProfile;
        SipProfile peerProfile;
        super.onRinging(sipAudioCall, sipProfile);
        n6k0 n6k0Var = this.f8406a.c;
        String strB = null;
        String strB2 = (sipAudioCall == null || (peerProfile = sipAudioCall.getPeerProfile()) == null) ? null : gu70.b(peerProfile);
        if (sipAudioCall != null && (localProfile = sipAudioCall.getLocalProfile()) != null) {
            strB = gu70.b(localProfile);
        }
        n6k0Var.a("onRingingSip", ua80.i("peerProfile ", strB2, " localProfile ", strB));
    }

    @Override // android.net.sip.SipAudioCall.Listener
    public final void onRingingBack(SipAudioCall sipAudioCall) {
        SipProfile localProfile;
        SipProfile peerProfile;
        super.onRingingBack(sipAudioCall);
        n6k0 n6k0Var = this.f8406a.c;
        String strB = null;
        String strB2 = (sipAudioCall == null || (peerProfile = sipAudioCall.getPeerProfile()) == null) ? null : gu70.b(peerProfile);
        if (sipAudioCall != null && (localProfile = sipAudioCall.getLocalProfile()) != null) {
            strB = gu70.b(localProfile);
        }
        n6k0Var.a("onRingingBackSip", ua80.i("peerProfile ", strB2, " localProfile ", strB));
    }
}
