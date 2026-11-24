package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class mg4 extends i3t0 {
    public final i1w0 o;
    public final kf4 p;
    public final jqt q;
    public c4m0 r;

    public mg4(mne mneVar, i1w0 i1w0Var, kf4 kf4Var, jqt jqtVar) {
        a04 a04Var = new a04((byte) 8);
        or3 or3Var = new or3((byte) 23);
        vs10 vs10Var = mneVar.c;
        super(null, a04Var, or3Var, cvm0.p(vs10Var, vs10Var), null);
        this.o = i1w0Var;
        this.p = kf4Var;
        this.q = jqtVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        dg4 dg4Var = (dg4) obj;
        dg4Var.getClass();
        super.x(dg4Var);
        if (!dg4Var.equals(cg4.f4295a)) {
            if (dg4Var.equals(ag4.f811a)) {
                e3c.n(this.r);
                return;
            }
            if (!dg4Var.equals(bg4.f2537a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var = this.r;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.r = i3t0.L(this, new fnq(this.q.a(), new qv3(this, null, (byte) 3), (byte) 4), null, null, 3);
                return;
            }
            return;
        }
        i1w0 i1w0Var = this.o;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new e1w0(this.p.a())), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
