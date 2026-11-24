package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class kfd extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final duj o;
    public final bwl p;
    public final i1w0 q;
    public final kki r;
    public final String s;
    public final long t;
    public final ax5 u;
    public c4m0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfd(duj dujVar, bwl bwlVar, m1e m1eVar, i1w0 i1w0Var, ctf0 ctf0Var, kki kkiVar, ocl oclVar, vjp vjpVar, String str, long j, r9u r9uVar, mne mneVar) {
        super(null, new a7d((byte) 10), new ifd(vjpVar, r9uVar, ctf0Var, oclVar), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.o = dujVar;
        this.p = bwlVar;
        this.q = i1w0Var;
        this.r = kkiVar;
        this.s = str;
        this.t = j;
        ax5 ax5Var = new ax5(this);
        this.u = ax5Var;
        sac.T(new fnq(m1eVar.b(), new jfd(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), ax5Var), foe.h);
        M();
    }

    public final void M() {
        Object value;
        c4m0 c4m0Var = this.v;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, sed.a((sed) value, true, false)));
            this.v = qjj.W(jiu0.a(this), this.u, null, new jfd(this, null, b), 2);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        eed eedVar = (eed) obj;
        eedVar.getClass();
        super.x(eedVar);
        if (!eedVar.equals(bed.f2444a)) {
            if (!(eedVar instanceof ced)) {
                if (eedVar.equals(ded.f5945a)) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            aed aedVar = ((ced) eedVar).f4205a;
            if (aedVar instanceof ydd) {
                i3t0.K(this, null, null, new ffd(this, aedVar, null, (byte) 1), 3);
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
