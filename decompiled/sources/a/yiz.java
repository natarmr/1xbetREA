package a;

import android.net.sip.SipAudioCall;
import android.net.sip.SipException;
import android.net.sip.SipManager;
import android.net.sip.SipProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yiz implements uq70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gu70 f42719a;
    public final p7m0 b;
    public final p7m0 c;

    public yiz(gu70 gu70Var) {
        gu70Var.getClass();
        this.f42719a = gu70Var;
        p7m0 p7m0VarA = q7m0.a(cr70.f4830a);
        this.b = p7m0VarA;
        this.c = p7m0VarA;
    }

    @Override // a.uq70
    public final void a() throws SipException {
        gu70 gu70Var = this.f42719a;
        SipAudioCall sipAudioCall = gu70Var.f;
        if (sipAudioCall != null) {
            sipAudioCall.endCall();
            sipAudioCall.close();
        }
        gu70Var.f = null;
        this.b.o(null, cr70.f4830a);
    }

    @Override // a.uq70
    public final void b(xo9 xo9Var) {
        String localizedMessage;
        this.b.o(null, cr70.f4830a);
        String str = xo9Var.f41204a;
        gu70 gu70Var = this.f42719a;
        gu70Var.getClass();
        str.getClass();
        if (!Intrinsics.d(gu70Var.j, str)) {
            gu70Var.j = str;
        }
        String str2 = xo9Var.b;
        str2.getClass();
        if (!Intrinsics.d(gu70Var.i, str2)) {
            gu70Var.i = str2;
        }
        String str3 = xo9Var.c;
        str3.getClass();
        if (!Intrinsics.d(gu70Var.g, str3)) {
            gu70Var.g = str3;
        }
        String str4 = xo9Var.d;
        str4.getClass();
        if (!Intrinsics.d(gu70Var.h, str4)) {
            gu70Var.h = str4;
        }
        xiz xizVar = new xiz(this, (byte) 0);
        xiz xizVar2 = gu70Var.k;
        if (xizVar2 == null || xizVar2 != xizVar) {
            gu70Var.k = xizVar;
        }
        xiz xizVar3 = new xiz(this, (byte) 1);
        xiz xizVar4 = gu70Var.o;
        if (xizVar4 == null || xizVar4 != xizVar3) {
            gu70Var.o = xizVar3;
        }
        xiz xizVar5 = new xiz(this, (byte) 2);
        xiz xizVar6 = gu70Var.p;
        if (xizVar6 == null || xizVar6 != xizVar5) {
            gu70Var.p = xizVar5;
        }
        xiz xizVar7 = new xiz(this, (byte) 3);
        xiz xizVar8 = gu70Var.n;
        if (xizVar8 == null || xizVar8 != xizVar7) {
            gu70Var.n = xizVar7;
        }
        xiz xizVar9 = new xiz(this, (byte) 4);
        xiz xizVar10 = gu70Var.q;
        if (xizVar10 == null || xizVar10 != xizVar9) {
            gu70Var.q = xizVar9;
        }
        xiz xizVar11 = new xiz(this, (byte) 5);
        xiz xizVar12 = gu70Var.l;
        if (xizVar12 == null || xizVar12 != xizVar11) {
            gu70Var.l = xizVar11;
        }
        xiz xizVar13 = new xiz(this, (byte) 6);
        xiz xizVar14 = gu70Var.m;
        if (xizVar14 == null || xizVar14 != xizVar13) {
            gu70Var.m = xizVar13;
        }
        SipManager sipManager = gu70Var.f11916a;
        gu70Var.a();
        try {
            SipProfile.Builder builder = new SipProfile.Builder(gu70Var.j, gu70Var.g);
            builder.setDisplayName(gu70Var.i);
            builder.setPassword(gu70Var.b);
            SipProfile sipProfileBuild = builder.build();
            gu70Var.e = sipProfileBuild;
            sipManager.open(sipProfileBuild, gu70Var.d, null);
            sipManager.register(gu70Var.e, 30, (fu70) gu70Var.r.getValue());
        } catch (Exception e) {
            e.printStackTrace();
            Throwable cause = e.getCause();
            if (cause != null && (localizedMessage = cause.getLocalizedMessage()) != null) {
                gu70Var.c.a("initializeLocalProfileError", "error - ".concat(localizedMessage));
            }
            xiz xizVar15 = gu70Var.n;
            if (xizVar15 != null) {
                xizVar15.invoke();
            }
        }
    }

    @Override // a.uq70
    public final void c() {
        gu70 gu70Var = this.f42719a;
        n6k0 n6k0Var = gu70Var.c;
        SipProfile sipProfile = gu70Var.e;
        n6k0Var.a("onCallEndedByUser", "sipProfile " + (sipProfile != null ? gu70.b(sipProfile) : null));
    }

    @Override // a.uq70
    public final void close() {
        this.f42719a.a();
    }

    @Override // a.uq70
    public final void d(boolean z) {
        SipAudioCall sipAudioCall = this.f42719a.f;
        if (sipAudioCall != null) {
            sipAudioCall.setSpeakerMode(z);
        }
    }

    @Override // a.uq70
    public final void e(boolean z) {
        SipAudioCall sipAudioCall = this.f42719a.f;
        if (sipAudioCall == null || (!z) == sipAudioCall.isMuted()) {
            return;
        }
        sipAudioCall.toggleMute();
    }

    @Override // a.uq70
    public final boolean f() {
        gu70 gu70Var = this.f42719a;
        SipAudioCall sipAudioCall = gu70Var.f;
        if (sipAudioCall == null || sipAudioCall.getState() == 0) {
            return false;
        }
        SipAudioCall sipAudioCall2 = gu70Var.f;
        return sipAudioCall2 == null || sipAudioCall2.getState() != 101;
    }

    @Override // a.uq70
    public final boolean g() {
        SipAudioCall sipAudioCall = this.f42719a.f;
        return sipAudioCall != null && sipAudioCall.isInCall();
    }

    @Override // a.uq70
    public final gmq h() {
        return this.c;
    }

    public final void i(fr70 fr70Var) {
        this.b.o(null, fr70Var);
    }
}
