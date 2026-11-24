package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class khp extends i3t0 {
    public static final /* synthetic */ int q = 0;
    public final dot o;
    public final i1w0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khp(ctf0 ctf0Var, mne mneVar, dot dotVar, dot dotVar2, i1w0 i1w0Var) {
        super(null, new dfp((byte) 6), new bcn(ctf0Var, (byte) 12), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = dotVar2;
        this.p = i1w0Var;
        sac.T(new fnq(dotVar.f6428a.f15748a.d, new sxk(this, null, (byte) 18), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), jhp.h);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        dhp dhpVar = (dhp) obj;
        dhpVar.getClass();
        super.x(dhpVar);
        if (!(dhpVar instanceof ahp)) {
            if (dhpVar instanceof bhp) {
                i3t0.K(this, null, null, new snn(((bhp) dhpVar).f2619a, this, null), 3);
                return;
            }
            if (!(dhpVar instanceof chp)) {
                t9f.b();
                return;
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, hhp.a((hhp) value, ((chp) dhpVar).f4371a, null, 2)));
            return;
        }
        i1w0 i1w0Var = this.p;
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
