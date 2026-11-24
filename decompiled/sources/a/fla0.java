package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class fla0 extends i3t0 {
    public final i1w0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fla0(i1w0 i1w0Var, f7u f7uVar, ocl oclVar, mne mneVar) {
        super(null, new l3a0(f7uVar, (byte) 25), new yar(oclVar, (byte) 9), cvm0.p(mneVar.c, mneVar.f22085a), null);
        i1w0Var.getClass();
        this.o = i1w0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        yka0 yka0Var = (yka0) obj;
        yka0Var.getClass();
        super.x(yka0Var);
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
