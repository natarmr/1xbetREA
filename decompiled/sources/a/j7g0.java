package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class j7g0 extends i3t0 {
    public final i1w0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7g0(String str, i1w0 i1w0Var, r9u r9uVar, mne mneVar, hnu hnuVar) {
        super(null, new gvb0(hnuVar, str, (byte) 27), new i7g0(r9uVar, (byte) 0), cvm0.p(mneVar.c, mneVar.f22085a), null);
        str.getClass();
        i1w0Var.getClass();
        r9uVar.getClass();
        this.o = i1w0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        z6g0 z6g0Var = (z6g0) obj;
        z6g0Var.getClass();
        if (!z6g0Var.equals(z6g0.f43865a)) {
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
