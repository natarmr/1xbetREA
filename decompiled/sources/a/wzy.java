package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class wzy extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final duj o;
    public final reu p;
    public final i1w0 q;
    public final kki r;
    public final String s;
    public final long t;
    public final mne u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzy(duj dujVar, reu reuVar, m1e m1eVar, i1w0 i1w0Var, kki kkiVar, ocl oclVar, String str, long j, mne mneVar, r9u r9uVar) {
        super(null, new pcy((byte) 15), new mz0((Object) r9uVar, (Object) oclVar, j, (byte) 19), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        r9uVar.getClass();
        this.o = dujVar;
        this.p = reuVar;
        this.q = i1w0Var;
        this.r = kkiVar;
        this.s = str;
        this.t = j;
        this.u = mneVar;
        sac.T(new fnq(m1eVar.b(), new slx(this, null, (byte) 8), (byte) 4), d5c.S(d5c.S(jiu0.a(this), mneVar.b), new ax5(this)), foe.h);
        M();
    }

    public final void M() {
        Object value;
        byte b;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            b = 1;
        } while (!p7m0Var.m(value, rzy.a((rzy) value, true, false, false)));
        sac.V(jiu0.a(this), new adw(this, (byte) 23), null, this.u.b, new juy(this, null, b), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        nzy nzyVar = (nzy) obj;
        nzyVar.getClass();
        super.x(nzyVar);
        if (!nzyVar.equals(kzy.f19171a)) {
            if (!(nzyVar instanceof lzy)) {
                if (nzyVar.equals(mzy.f22673a)) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            uzy uzyVar = ((lzy) nzyVar).f20925a;
            if (uzyVar instanceof szy) {
                i3t0.K(this, null, null, new ffd(this, uzyVar, null, (byte) 15), 3);
                return;
            }
            return;
        }
        i1w0 i1w0Var = this.q;
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
