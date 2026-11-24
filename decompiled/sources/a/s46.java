package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class s46 extends i3t0 {
    public final i1w0 o;

    public s46(vzg0 vzg0Var, mne mneVar, i1w0 i1w0Var) {
        super(null, new o85((byte) 21), new h26((byte) 5), cvm0.p(mneVar.c, mneVar.f22085a), null);
        this.o = i1w0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        i46 i46Var = (i46) obj;
        i46Var.getClass();
        super.x(i46Var);
        if (!i46Var.equals(i46.f14131a)) {
            t9f.b();
            return;
        }
        i1w0 i1w0Var = this.o;
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
