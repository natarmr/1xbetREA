package a;

import java.util.HashSet;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r4b0 extends w46 {
    public final vzg0 b;
    public final i1w0 c;
    public final qv2 d;
    public final vjp e;
    public final ivn f;
    public final g2v g;
    public final lbu h;
    public final nvu i;
    public final fvt0 j;
    public final nv20 k;
    public final f4b0 l;
    public final m1e m;
    public final mne n;
    public final rkt0 o;
    public final luu p;
    public final h3c q;
    public final y3v r;
    public final xae0 s;
    public final ol60 t;
    public final p7m0 u;
    public c4m0 v;
    public bby w;
    public bby x;
    public boolean y;

    public r4b0(vzg0 vzg0Var, i1w0 i1w0Var, qv2 qv2Var, vjp vjpVar, ivn ivnVar, g2v g2vVar, lbu lbuVar, nvu nvuVar, fvt0 fvt0Var, nv20 nv20Var, f4b0 f4b0Var, m1e m1eVar, mne mneVar, rkt0 rkt0Var, luu luuVar, h3c h3cVar, y3v y3vVar) {
        m1eVar.getClass();
        this.b = vzg0Var;
        this.c = i1w0Var;
        this.d = qv2Var;
        this.e = vjpVar;
        this.f = ivnVar;
        this.g = g2vVar;
        this.h = lbuVar;
        this.i = nvuVar;
        this.j = fvt0Var;
        this.k = nv20Var;
        this.l = f4b0Var;
        this.m = m1eVar;
        this.n = mneVar;
        this.o = rkt0Var;
        this.p = luuVar;
        this.q = h3cVar;
        this.r = y3vVar;
        this.s = vzg0Var.c(xun.f41520a, "EXPANDED_IDS_SHARED_KEY");
        this.t = new ol60(3);
        this.u = q7m0.a(new l4b0(true));
        this.y = true;
    }

    public final void w(i4b0 i4b0Var) {
        boolean z;
        p7m0 p7m0Var = this.u;
        n4b0 n4b0Var = (n4b0) p7m0Var.getValue();
        i4b0 i4b0Var2 = i4b0.b;
        byte b = 1;
        if (i4b0Var == i4b0Var2) {
            c4m0 c4m0Var = this.v;
            if (c4m0Var != null && c4m0Var.isActive()) {
                return;
            }
            if (n4b0Var instanceof k4b0) {
                Throwable th = ((k4b0) n4b0Var).f17660a;
                if (!hic.C(th) && !(th instanceof hr30)) {
                    return;
                }
            }
        }
        v3c.N(this.v);
        mne mneVar = this.n;
        byte b2 = 0;
        yje yjeVar = null;
        if (i4b0Var == i4b0Var2 && ((n4b0Var instanceof k4b0) || (n4b0Var instanceof m4b0))) {
            l4b0 l4b0Var = new l4b0(false);
            p7m0Var.getClass();
            p7m0Var.o(null, l4b0Var);
            bby bbyVar = this.x;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.x = sac.V(jiu0.a(this), new kma0((byte) 13), null, mneVar.b, new q4b0(this, yjeVar, b2), 10);
        } else if (!(n4b0Var instanceof j4b0)) {
            l4b0 l4b0Var2 = new l4b0(true);
            p7m0Var.getClass();
            p7m0Var.o(null, l4b0Var2);
        }
        boolean z2 = i4b0Var == i4b0.f14140a;
        int iOrdinal = this.l.ordinal();
        if (iOrdinal == 0) {
            z = true;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            z = false;
        }
        this.v = sac.T(new p6d(this.i.G(z2, z), this.s, new p4b0(this, yjeVar, b2), b), d5c.S(jiu0.a(this), mneVar.b), new o4b0(this, yjeVar, b));
    }

    public final void x(long j) {
        HashSet hashSetJ0 = CollectionsKt.J0((Iterable) this.s.f40549a.getValue());
        if (hashSetJ0.contains(Long.valueOf(j))) {
            hashSetJ0.remove(Long.valueOf(j));
        } else {
            hashSetJ0.add(Long.valueOf(j));
        }
        this.b.e("EXPANDED_IDS_SHARED_KEY", hashSetJ0);
    }
}
