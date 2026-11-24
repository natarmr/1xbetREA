package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class gfd extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final duj o;
    public final lsn p;
    public final i1w0 q;
    public final kki r;
    public final String s;
    public final mne t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfd(duj dujVar, lsn lsnVar, m1e m1eVar, i1w0 i1w0Var, kki kkiVar, ocl oclVar, ctf0 ctf0Var, boolean z, vjp vjpVar, String str, r9u r9uVar, mne mneVar) {
        super(null, new a7d((byte) 9), new cw6((Object) vjpVar, (Object) r9uVar, z, (Object) oclVar, (Object) ctf0Var, (byte) 3), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.o = dujVar;
        this.p = lsnVar;
        this.q = i1w0Var;
        this.r = kkiVar;
        this.s = str;
        this.t = mneVar;
        sac.T(new fnq(m1eVar.b(), new efd(this, null, (byte) 0), (byte) 4), d5c.S(d5c.S(jiu0.a(this), mneVar.b), new ax5(this)), foe.h);
        M();
    }

    public final void M() {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, cfd.a((cfd) value, 0L, true, false, false, null, 17)));
        sac.V(jiu0.a(this), new lya(this, (byte) 27), null, this.t.b, new efd(this, null, (byte) 1), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        wed wedVar = (wed) obj;
        wedVar.getClass();
        super.x(wedVar);
        byte b = 0;
        if (!wedVar.equals(ted.f33815a)) {
            if (wedVar instanceof ued) {
                xdd xddVar = ((ued) wedVar).f35521a;
                if (xddVar instanceof vdd) {
                    i3t0.K(this, null, null, new ffd(this, xddVar, null, b), 3);
                    return;
                }
                return;
            }
            if (wedVar.equals(ved.f37280a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
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
