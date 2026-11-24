package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class iph0 extends w46 {
    public final i1w0 A;
    public final sek B;
    public final au0 C;
    public final p7m0 D;
    public bby E;
    public bby F;
    public bby G;
    public bby H;
    public boolean I;
    public final ol60 J;
    public final p7m0 K;
    public final n0o0 L;
    public final n0o0 M;
    public final qu b;
    public final ik4 c;
    public final phf0 d;
    public final cyh e;
    public final zlt0 f;
    public final jof0 g;
    public final bzt h;
    public final pru i;
    public final rou j;
    public final z4w0 k;
    public final vd1 l;
    public final zg m;
    public final vd1 n;
    public final zn00 o;
    public final jh70 p;
    public final mi70 q;
    public final abu r;
    public final mne s;
    public final g2v t;
    public final duj u;
    public final ctf0 v;
    public final m1e w;
    public final jh70 x;
    public final svs0 y;
    public final qgd z;

    public iph0(zg zgVar, qu quVar, au0 au0Var, vd1 vd1Var, vd1 vd1Var2, ik4 ik4Var, qgd qgdVar, m1e m1eVar, mne mneVar, cyh cyhVar, duj dujVar, sek sekVar, bzt bztVar, abu abuVar, rou rouVar, pru pruVar, g2v g2vVar, zn00 zn00Var, jh70 jh70Var, jh70 jh70Var2, mi70 mi70Var, phf0 phf0Var, jof0 jof0Var, ctf0 ctf0Var, vzg0 vzg0Var, svs0 svs0Var, zlt0 zlt0Var, i1w0 i1w0Var, z4w0 z4w0Var) {
        i1w0Var.getClass();
        this.b = quVar;
        this.c = ik4Var;
        this.d = phf0Var;
        this.e = cyhVar;
        this.f = zlt0Var;
        this.g = jof0Var;
        this.h = bztVar;
        this.i = pruVar;
        this.j = rouVar;
        this.k = z4w0Var;
        this.l = vd1Var;
        this.m = zgVar;
        this.n = vd1Var2;
        this.o = zn00Var;
        this.p = jh70Var;
        this.q = mi70Var;
        this.r = abuVar;
        this.s = mneVar;
        this.t = g2vVar;
        this.u = dujVar;
        this.v = ctf0Var;
        this.w = m1eVar;
        this.x = jh70Var2;
        this.y = svs0Var;
        this.z = qgdVar;
        this.A = i1w0Var;
        this.B = sekVar;
        this.C = au0Var;
        this.D = q7m0.a(Boolean.FALSE);
        this.J = new ol60(3);
        this.K = q7m0.a(cph0.f4747a);
        this.L = maz.b(new roh0(this, (byte) 0));
        this.M = maz.b(new roh0(this, (byte) 1));
    }

    public final void w() {
        v3c.N(this.E);
        this.E = sac.V(jiu0.a(this), new jjh0(1, this, iph0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, this.s.f22085a, new fph0(this, null, (byte) 0), 10);
    }

    public final void x() {
        Boolean bool = Boolean.TRUE;
        p7m0 p7m0Var = this.D;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
        w();
    }

    public final void y(noh0 noh0Var, boolean z) {
        a4x a4xVar;
        int iIndexOf;
        if (noh0Var instanceof moh0) {
            p7m0 p7m0Var = this.K;
            Object value = p7m0Var.getValue();
            aph0 aph0Var = value instanceof aph0 ? (aph0) value : null;
            if (aph0Var != null && (iIndexOf = (a4xVar = aph0Var.b).indexOf(noh0Var)) >= 0) {
                ArrayList arrayList = new ArrayList(a4xVar);
                moh0 moh0Var = (moh0) noh0Var;
                boolean z2 = !moh0Var.h;
                ssh0 ssh0Var = moh0Var.f22134a;
                boolean z3 = moh0Var.b;
                int i = moh0Var.c;
                long j = moh0Var.d;
                long j2 = moh0Var.e;
                String str = moh0Var.g;
                String str2 = moh0Var.i;
                str.getClass();
                str2.getClass();
                arrayList.set(iIndexOf, new moh0(ssh0Var, z3, i, j, j2, z, str, z2, str2));
                aph0 aph0VarA = aph0.a(aph0Var, dyb.o0(arrayList));
                p7m0Var.getClass();
                p7m0Var.o(null, aph0VarA);
            }
        }
    }
}
