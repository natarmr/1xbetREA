package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ez extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final long o;
    public final ivn p;
    public final m1e q;
    public final mne r;
    public final duj s;
    public final i1w0 t;
    public bby u;
    public c4m0 v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(long j, ivn ivnVar, m1e m1eVar, mne mneVar, duj dujVar, ctf0 ctf0Var, ocl oclVar, i1w0 i1w0Var, r9u r9uVar) {
        super(null, new bz(r9uVar, (byte) 0), new cz(oclVar, ctf0Var, (byte) 0), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.o = j;
        this.p = ivnVar;
        this.q = m1eVar;
        this.r = mneVar;
        this.s = dujVar;
        this.t = i1w0Var;
    }

    public final void M() {
        bby bbyVar = this.u;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.u = sac.V(jiu0.a(this), new t1(this, (byte) 16), null, this.r.c, new dz(this, yjeVar, (byte) 0), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        px pxVar = (px) obj;
        pxVar.getClass();
        super.x(pxVar);
        if (!pxVar.equals(ix.f15515a)) {
            if (pxVar.equals(jx.f17277a)) {
                M();
                return;
            }
            yje yjeVar = null;
            if (pxVar.equals(kx.f19027a)) {
                c4m0 c4m0Var = this.v;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                    return;
                }
                return;
            }
            if (!pxVar.equals(lx.f20788a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var2 = this.v;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            this.v = slb.U(new fnq(this.q.b(), new dz(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), this.r.f22085a));
            return;
        }
        i1w0 i1w0Var = this.t;
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
}
