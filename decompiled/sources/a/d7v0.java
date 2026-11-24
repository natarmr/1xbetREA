package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class d7v0 extends w46 {
    public final i1w0 b;
    public final p6v c;
    public final uf3 d;
    public final mne e;
    public final duj f;
    public final pru g;
    public final uyn h;
    public final m1e i;
    public final sa10 j;
    public final ls k;
    public bby l;
    public pby m;
    public long n;
    public int o;
    public boolean p;
    public final qoj0 q;
    public final p7m0 r;
    public final p7m0 s;

    public d7v0(i1w0 i1w0Var, p6v p6vVar, uf3 uf3Var, mne mneVar, duj dujVar, pru pruVar, uyn uynVar, m1e m1eVar, sa10 sa10Var, ls lsVar) {
        i1w0Var.getClass();
        p6vVar.getClass();
        this.b = i1w0Var;
        this.c = p6vVar;
        this.d = uf3Var;
        this.e = mneVar;
        this.f = dujVar;
        this.g = pruVar;
        this.h = uynVar;
        this.i = m1eVar;
        this.j = sa10Var;
        this.k = lsVar;
        this.l = zvw.g();
        this.m = zvw.g();
        this.o = -1;
        this.q = ckb.F();
        this.r = q7m0.a(v6v0.f36894a);
        this.s = q7m0.a(r6v0.f29953a);
    }

    @Override // a.diu0
    public final void v() {
        this.p = false;
        this.m.cancel(null);
        this.l.cancel(null);
    }

    public final void w() {
        sac.i0(jiu0.a(this), d7v0.class.getName().concat(".loadData"), 5, 5L, kotlin.collections.a.c(oqt0.class), null, new vmq0(this, null, (byte) 5), null, this.e.b, new wzu0(1, this, d7v0.class, "handleErrorWithLottie", "handleErrorWithLottie(Ljava/lang/Throwable;)V", 0, (byte) 9), null, 592);
    }

    public final void x() {
        i1w0 i1w0Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void y(u6v0 u6v0Var) {
        sac.V(jiu0.a(this), new d4u0((byte) 20), null, this.e.c, new n7t0(this, u6v0Var, null, (byte) 16), 10);
    }

    public final void z(a7v0 a7v0Var) {
        sac.V(jiu0.a(this), new d4u0((byte) 19), null, this.e.c, new n7t0(this, a7v0Var, null, (byte) 14), 10);
    }
}
