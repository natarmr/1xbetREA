package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a9t extends w46 {
    public boolean A;
    public boolean B;
    public s9t C;
    public List D;
    public bby E;
    public bby F;
    public bby G;
    public final fq b;
    public final i5m0 c;
    public final xcc d;
    public final gwt e;
    public final zn00 f;
    public final lzt g;
    public final hyg0 h;
    public final vcu i;
    public final fpi0 j;
    public final mne k;
    public final s7t0 l;
    public final ztt m;
    public final t0u n;
    public final p7m0 o;
    public final p7m0 p;
    public final p7m0 q;
    public final p7m0 r;
    public final p7m0 s;
    public final p7m0 t;
    public k7t u;
    public List v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public a9t(fq fqVar, i5m0 i5m0Var, xcc xccVar, gwt gwtVar, zn00 zn00Var, qa60 qa60Var, lzt lztVar, hyg0 hyg0Var, vcu vcuVar, fpi0 fpi0Var, mne mneVar, s7t0 s7t0Var, ztt zttVar, t0u t0uVar) {
        fqVar.getClass();
        i5m0Var.getClass();
        xccVar.getClass();
        gwtVar.getClass();
        qa60Var.getClass();
        lztVar.getClass();
        hyg0Var.getClass();
        vcuVar.getClass();
        fpi0Var.getClass();
        s7t0Var.getClass();
        zttVar.getClass();
        t0uVar.getClass();
        this.b = fqVar;
        this.c = i5m0Var;
        this.d = xccVar;
        this.e = gwtVar;
        this.f = zn00Var;
        this.g = lztVar;
        this.h = hyg0Var;
        this.i = vcuVar;
        this.j = fpi0Var;
        this.k = mneVar;
        this.l = s7t0Var;
        this.m = zttVar;
        this.n = t0uVar;
        this.o = q7m0.a(Boolean.FALSE);
        this.p = q7m0.a(n8t.f23105a);
        iun iunVar = iun.f15405a;
        this.q = q7m0.a(new m8t(iunVar, false, false));
        this.r = q7m0.a(t8t.f33528a);
        this.s = q7m0.a(f8t.f9123a);
        this.t = q7m0.a(h8t.f12644a);
        this.v = iunVar;
        this.y = true;
        this.C = s9t.h;
        this.D = new ArrayList();
        yje yjeVar = null;
        slb.U(new dnq(new fnq(qa60Var.a(), new j0s(this, yjeVar, (byte) 11), (byte) 4), new ko0((Object) this, yjeVar, (byte) 17), (byte) 1), jiu0.a(this));
    }

    public final void A(boolean z, boolean z2) {
        p7m0 p7m0Var;
        Object value;
        m8t m8tVarA;
        if (z2) {
            this.y = true;
        } else if (this.x) {
            this.y = false;
        }
        do {
            p7m0Var = this.q;
            value = p7m0Var.getValue();
            m8tVarA = (m8t) value;
            if (!m8tVarA.f21385a) {
                m8tVarA = m8t.a(m8tVarA, true, null, z, 2);
            }
        } while (!p7m0Var.m(value, m8tVarA));
    }

    public final void B() {
        boolean zIsEmpty = this.v.isEmpty();
        p7m0 p7m0Var = this.t;
        if (zIsEmpty) {
            p7m0Var.getClass();
            p7m0Var.o(null, k8t.f17887a);
        } else {
            i8t i8tVar = new i8t(this.v);
            p7m0Var.getClass();
            p7m0Var.o(null, i8tVar);
        }
        if (this.w) {
            return;
        }
        w();
        if (this.i.a().a()) {
            z();
        }
    }

    public final void w() {
        bby bbyVar = this.E;
        if (bbyVar == null || !bbyVar.isActive()) {
            k7t k7tVar = this.u;
            yje yjeVar = null;
            if (k7tVar == null) {
                this.E = sac.i0(jiu0.a(this), "GamesManiaGameViewModel.getCard", 5, 5L, q3d.j(oqt0.class, ff5.class, zhi0.class, qct.class), null, new atj(this, yjeVar, (byte) 13), new jcs(this, (byte) 14), this.k.b, new t3t(this, (byte) 2), null, 528);
            } else {
                u8t u8tVar = new u8t(k7tVar, this.D, true ^ this.B);
                p7m0 p7m0Var = this.r;
                p7m0Var.getClass();
                p7m0Var.o(null, u8tVar);
            }
        }
    }

    public final void x(Throwable th) {
        sac.V(jiu0.a(this), x8t.f40478a, null, this.k.f22085a, new cbq(this, th, null, (byte) 24), 10);
    }

    public final void y() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.p;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, o8t.f24848a));
    }

    public final void z() {
        if (this.i.a() == vrs.f37917a) {
            return;
        }
        sac.V(jiu0.a(this), new h2s(1, this, a9t.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, this.k.f22085a, new y8t(this, null, (byte) 0), 10);
    }
}
