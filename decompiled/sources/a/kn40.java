package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class kn40 extends i3t0 {
    public final i1w0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn40(ctf0 ctf0Var, mne mneVar, e1u e1uVar, i1w0 i1w0Var) {
        super(null, new np30(e1uVar, (byte) 12), new v510(ctf0Var, (byte) 10), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = i1w0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        an40 an40Var = (an40) obj;
        an40Var.getClass();
        super.x(an40Var);
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
