package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class po6 extends w46 {
    public final v88 A;
    public final ctf0 B;
    public final sa10 C;
    public final mne D;
    public final i1w0 E;
    public final duj F;
    public final ort G;
    public final nrt H;
    public final reu I;
    public final lk5 J;
    public final n0o0 K;
    public boolean L;
    public boolean M;
    public boolean N;
    public c4m0 O;
    public final c4m0 P;
    public Long Q;
    public final p7m0 R;
    public final p7m0 S;
    public final p7m0 T;
    public final p7m0 U;
    public final ol60 V;
    public final drt b;
    public final yk50 c;
    public final lhf0 d;
    public final f8u e;
    public final qtt f;
    public final usu g;
    public final dsi0 h;
    public final epi0 i;
    public final h03 j;
    public final uii k;
    public final yiu l;
    public final dsi0 m;
    public final x4u n;
    public final qtt o;
    public final oif0 p;
    public final yk50 q;
    public final vn7 r;
    public final r4v s;
    public final vpu t;
    public final lbu u;
    public final pwi v;
    public final buo0 w;
    public final pru x;
    public final bn6 y;
    public final au0 z;

    public po6(drt drtVar, yk50 yk50Var, lhf0 lhf0Var, f8u f8uVar, qtt qttVar, usu usuVar, dsi0 dsi0Var, epi0 epi0Var, h03 h03Var, uii uiiVar, yiu yiuVar, yfu yfuVar, dsi0 dsi0Var2, x4u x4uVar, qtt qttVar2, oif0 oif0Var, yk50 yk50Var2, vn7 vn7Var, r4v r4vVar, vpu vpuVar, vpu vpuVar2, lbu lbuVar, pwi pwiVar, buo0 buo0Var, pru pruVar, bn6 bn6Var, au0 au0Var, v88 v88Var, ctf0 ctf0Var, sa10 sa10Var, mne mneVar, i1w0 i1w0Var, duj dujVar, m1e m1eVar, ort ortVar, nrt nrtVar, reu reuVar, lk5 lk5Var) {
        ctf0Var.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        this.b = drtVar;
        this.c = yk50Var;
        this.d = lhf0Var;
        this.e = f8uVar;
        this.f = qttVar;
        this.g = usuVar;
        this.h = dsi0Var;
        this.i = epi0Var;
        this.j = h03Var;
        this.k = uiiVar;
        this.l = yiuVar;
        this.m = dsi0Var2;
        this.n = x4uVar;
        this.o = qttVar2;
        this.p = oif0Var;
        this.q = yk50Var2;
        this.r = vn7Var;
        this.s = r4vVar;
        this.t = vpuVar;
        this.u = lbuVar;
        this.v = pwiVar;
        this.w = buo0Var;
        this.x = pruVar;
        this.y = bn6Var;
        this.z = au0Var;
        this.A = v88Var;
        this.B = ctf0Var;
        this.C = sa10Var;
        this.D = mneVar;
        this.E = i1w0Var;
        this.F = dujVar;
        this.G = ortVar;
        this.H = nrtVar;
        this.I = reuVar;
        this.J = lk5Var;
        byte b = 0;
        this.K = maz.b(new io6(this, b));
        byte b2 = 1;
        this.L = true;
        this.N = true;
        this.R = q7m0.a(wv7.f39827a);
        this.S = q7m0.a(vn20.f37696a);
        this.T = q7m0.a(nlt0.f23744a);
        this.U = q7m0.a(jg7.i);
        byte b3 = 3;
        this.V = new ol60(3);
        yje yjeVar = null;
        sac.T(new fnq(m1eVar.b(), new lo6(this, yjeVar, b), (byte) 4), jiu0.a(this), new mo6(this, yjeVar, b));
        B(yk50Var2.g());
        c4m0 c4m0Var = this.P;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.P = sac.T(new fnq(vpuVar2.a(), new lo6(this, yjeVar, b2), (byte) 4), jiu0.a(this), new mo6(this, yjeVar, b2));
        }
        sac.T(new fnq(yfuVar.d(), new mo6(this, yjeVar, (byte) 2), (byte) 4), jiu0.a(this), new mo6(this, yjeVar, b3));
    }

    public final void A(boolean z) {
        sac.i0(jiu0.a(this), this + ".getBets", 5, 0L, null, null, new al6(this, z, null), null, this.D.b, new yj5(1, this, po6.class, "handleGetBetsExceptions", "handleGetBetsExceptions(Ljava/lang/Throwable;)V", 0, (byte) 19), null, Response.DOES_NOT_EXIST_ANYWHERE);
    }

    public final void B(boolean z) {
        olt0 olt0Var = new olt0(new il60(z ? R.drawable.ic_quick_bet_active : R.drawable.ic_quick_bet, z ? R.attr.uikitPrimary : R.attr.uikitSecondary));
        p7m0 p7m0Var = this.T;
        p7m0Var.getClass();
        p7m0Var.o(null, olt0Var);
    }

    @Override // a.diu0
    public final void v() {
        ((so6) this.i.b).b.f = true;
        ((so6) this.j.b).b.c.clear();
    }

    public final void w(Throwable th) {
        this.F.b(th, new sr1(this, th, (byte) 26));
    }

    public final ArrayList x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new npp0(this.L ? 0.0f : 180.0f));
        if (this.L) {
            bop0 bop0Var = bop0.FIRST;
            f8u f8uVar = this.e;
            arrayList.add(new gpp0(f8uVar.a(bop0Var), f8uVar.a(bop0.SECOND)));
        }
        return arrayList;
    }

    public final void y(dv7 dv7Var) {
        sac.V(jiu0.a(this), new yj5(1, this, po6.class, "emitShowSnackBarWithDefaultErrorMessage", "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V", 0, (byte) 12), null, null, new cm3(this, dv7Var, null, (byte) 26), 14);
    }

    public final void z(boolean z, long j) {
        this.Q = Long.valueOf(j);
        y(new yu7(true));
        sac.V(jiu0.a(this), oo6.f25578a, null, null, new lo6(this, null, (byte) 3), 14);
        sac.V(jiu0.a(this), new yj5(1, this, po6.class, "handleMakeBetException", "handleMakeBetException(Ljava/lang/Throwable;)V", 0, (byte) 13), null, this.D.b, new jo6((byte) 0, j, null, this, z), 10);
    }
}
