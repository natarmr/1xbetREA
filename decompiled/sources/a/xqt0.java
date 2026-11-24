package a;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xqt0 extends vw5 {
    public final o8f d;
    public final iqt e;
    public final hse0 f;
    public final reu g;
    public final kt2 h;
    public final rqj0 i;
    public final nr j;
    public final s64 k;
    public final yox l;
    public final g860 m;
    public final mne n;
    public final cu o;
    public final kh3 p;
    public final hst0 q;
    public final p7m0 r;
    public Function0 s;
    public Function2 t;
    public final n0o0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqt0(pru pruVar, o8f o8fVar, iqt iqtVar, hse0 hse0Var, reu reuVar, rqt rqtVar, bst bstVar, kt2 kt2Var, rqj0 rqj0Var, nr nrVar, s64 s64Var, yox yoxVar, g860 g860Var, mne mneVar, cu cuVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        hse0Var.getClass();
        kt2Var.getClass();
        this.d = o8fVar;
        this.e = iqtVar;
        this.f = hse0Var;
        this.g = reuVar;
        this.h = kt2Var;
        this.i = rqj0Var;
        this.j = nrVar;
        this.k = s64Var;
        this.l = yoxVar;
        this.m = g860Var;
        this.n = mneVar;
        this.o = cuVar;
        this.p = kh3.USER;
        this.q = hst0.USER;
        this.r = q7m0.a(i8d.f14333a);
        this.u = maz.b(new p2e0(pruVar, (byte) 7));
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.r.o(null, i8d.b);
        sac.V(sjeVar, new wqt0(this, sjeVar, (byte) 0), null, this.n.b, new wbl0(this, sjeVar, null, (byte) 15), 10);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.p;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.r;
    }

    @Override // a.vw5
    public final List d() {
        return null;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.q;
    }

    public final void h() {
        Function0 function0;
        if (!((sff0) this.u.getValue()).N.m && (function0 = this.s) != null) {
            function0.invoke();
        }
        this.r.o(null, i8d.c);
    }
}
