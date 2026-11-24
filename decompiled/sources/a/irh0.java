package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class irh0 extends w46 {
    public final sek A;
    public final ik4 B;
    public final au0 C;
    public final p7m0 D;
    public bby E;
    public bby F;
    public bby G;
    public boolean H;
    public final ol60 I;
    public final p7m0 J;
    public final xae0 K;
    public final qu b;
    public final phf0 c;
    public final cyh d;
    public final zlt0 e;
    public final jof0 f;
    public final bzt g;
    public final pru h;
    public final rou i;
    public final z4w0 j;
    public final vd1 k;
    public final zg l;
    public final abu m;
    public final vd1 n;
    public final zn00 o;
    public final jh70 p;
    public final mi70 q;
    public final mne r;
    public final g2v s;
    public final duj t;
    public final ctf0 u;
    public final m1e v;
    public final jh70 w;
    public final svs0 x;
    public final qgd y;
    public final i1w0 z;

    public irh0(zg zgVar, qu quVar, au0 au0Var, vd1 vd1Var, vd1 vd1Var2, ik4 ik4Var, qgd qgdVar, m1e m1eVar, mne mneVar, cyh cyhVar, duj dujVar, sek sekVar, bzt bztVar, abu abuVar, rou rouVar, pru pruVar, g2v g2vVar, zn00 zn00Var, jh70 jh70Var, jh70 jh70Var2, mi70 mi70Var, phf0 phf0Var, jof0 jof0Var, ctf0 ctf0Var, vzg0 vzg0Var, svs0 svs0Var, zlt0 zlt0Var, i1w0 i1w0Var, z4w0 z4w0Var) {
        i1w0Var.getClass();
        this.b = quVar;
        this.c = phf0Var;
        this.d = cyhVar;
        this.e = zlt0Var;
        this.f = jof0Var;
        this.g = bztVar;
        this.h = pruVar;
        this.i = rouVar;
        this.j = z4w0Var;
        this.k = vd1Var;
        this.l = zgVar;
        this.m = abuVar;
        this.n = vd1Var2;
        this.o = zn00Var;
        this.p = jh70Var;
        this.q = mi70Var;
        this.r = mneVar;
        this.s = g2vVar;
        this.t = dujVar;
        this.u = ctf0Var;
        this.v = m1eVar;
        this.w = jh70Var2;
        this.x = svs0Var;
        this.y = qgdVar;
        this.z = i1w0Var;
        this.A = sekVar;
        this.B = ik4Var;
        this.C = au0Var;
        this.D = q7m0.a(Boolean.FALSE);
        this.I = new ol60(3);
        brh0 brh0Var = brh0.f3081a;
        p7m0 p7m0VarA = q7m0.a(brh0Var);
        this.J = p7m0VarA;
        yje yjeVar = null;
        this.K = vtb.h0(new dnq(new s6n0(p7m0VarA, new hrh0(this, yjeVar, (byte) 3)), new sye0(this, yjeVar, (byte) 4), (byte) 0), jiu0.a(this), new o6m0(Long.MAX_VALUE), brh0Var);
    }

    public final void w(bvc bvcVar, Function2 function2) {
        sac.V(bvcVar, drh0.f6559a, null, this.r.f22085a, new due0(2, function2, Function2.class, "invoke", "invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 20), 10);
    }

    public final void x() {
        v3c.N(this.E);
        this.E = sac.V(jiu0.a(this), new jjh0(1, this, irh0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, this.r.f22085a, new frh0(this, null, (byte) 0), 10);
    }

    public final void y() {
        Boolean bool = Boolean.TRUE;
        p7m0 p7m0Var = this.D;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
        x();
    }

    public final void z(hqh0 hqh0Var, boolean z) {
        List list;
        int iIndexOf;
        if (hqh0Var instanceof gqh0) {
            p7m0 p7m0Var = this.J;
            Object value = p7m0Var.getValue();
            zqh0 zqh0Var = value instanceof zqh0 ? (zqh0) value : null;
            if (zqh0Var != null && (iIndexOf = (list = zqh0Var.f44807a).indexOf(hqh0Var)) >= 0) {
                ArrayList arrayList = new ArrayList(list);
                gqh0 gqh0Var = (gqh0) hqh0Var;
                arrayList.set(iIndexOf, new gqh0(gqh0Var.f11733a, gqh0Var.b, z, gqh0Var.d, !gqh0Var.e, gqh0Var.f));
                zqh0 zqh0Var2 = new zqh0(arrayList);
                p7m0Var.getClass();
                p7m0Var.o(null, zqh0Var2);
            }
        }
    }
}
