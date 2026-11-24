package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kbk extends i3t0 {
    public final cei0 o;
    public final i1w0 p;
    public final mne q;
    public final duj r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbk(cei0 cei0Var, i1w0 i1w0Var, ctf0 ctf0Var, mne mneVar, duj dujVar) {
        super(null, new owd(ctf0Var, (byte) 2), new ep4(ctf0Var, (byte) 28), cvm0.p(mneVar.c, mneVar.f22085a), null);
        cei0Var.getClass();
        ctf0Var.getClass();
        this.o = cei0Var;
        this.p = i1w0Var;
        this.q = mneVar;
        this.r = dujVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        uak uakVar = (uak) obj;
        uakVar.getClass();
        boolean zEquals = uakVar.equals(rak.f30138a);
        byte b = 13;
        byte b2 = 15;
        yje yjeVar = null;
        mne mneVar = this.q;
        if (zEquals) {
            sac.V(jiu0.a(this), new e3j(this, b2), null, mneVar.b, new u88((Object) this, true, yjeVar, b), 10);
            return;
        }
        boolean z = false;
        if (uakVar.equals(qak.f28398a)) {
            sac.V(jiu0.a(this), new e3j(this, b2), null, mneVar.b, new u88(this, z, yjeVar, b), 10);
        } else {
            if (!uakVar.equals(sak.f31892a)) {
                if (uakVar.equals(tak.f33615a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
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
}
