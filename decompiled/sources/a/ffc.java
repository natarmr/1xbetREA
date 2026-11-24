package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ffc extends i3t0 {
    public final atu o;
    public final ugf0 p;
    public final i1w0 q;
    public final iqt r;
    public final pmi0 s;

    public ffc(vzg0 vzg0Var, atu atuVar, ugf0 ugf0Var, ctf0 ctf0Var, i1w0 i1w0Var, iqt iqtVar, pmi0 pmi0Var, mne mneVar) {
        ctf0Var.getClass();
        zxb zxbVar = new zxb((byte) 10);
        ep4 ep4Var = new ep4(ctf0Var, (byte) 18);
        rwj rwjVar = mneVar.f22085a;
        super(null, zxbVar, ep4Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = atuVar;
        this.p = ugf0Var;
        this.q = i1w0Var;
        this.r = iqtVar;
        this.s = pmi0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        zec zecVar = (zec) obj;
        zecVar.getClass();
        super.x(zecVar);
        boolean zEquals = zecVar.equals(vec.f37278a);
        i1w0 i1w0Var = this.q;
        if (zEquals) {
            if (!this.r.f15225a.a()) {
                sac.V(jiu0.a(this), efc.f7716a, null, null, new wib(this, null, (byte) 6), 14);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(pmi0.b(this.s, false))), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (zecVar.equals(wec.f39012a)) {
                return;
            }
            if (zecVar instanceof yec) {
                e1q0 e1q0Var = ((yec) zecVar).f42479a;
                String str = e1q0Var.f7048a;
                String str2 = e1q0Var.b;
                ugf0 ugf0Var = this.p;
                ugf0Var.getClass();
                str.getClass();
                str2.getClass();
                g1q0 g1q0Var = (g1q0) ugf0Var.f35622a;
                d1q0 d1q0Var = new d1q0(str, str2);
                g1q0Var.getClass();
                a1q0 a1q0Var = g1q0Var.f10528a;
                a1q0Var.getClass();
                a1q0Var.c = d1q0Var;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                ListIterator listIteratorP2 = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if (!zecVar.equals(xec.f40738a)) {
                    t9f.b();
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                }
            }
        }
    }
}
