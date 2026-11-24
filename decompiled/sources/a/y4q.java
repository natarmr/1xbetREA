package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class y4q extends i3t0 {
    public final yqt o;
    public final rdq p;
    public final rdq q;
    public final zqt r;
    public final w1u s;
    public final i1w0 t;

    public y4q(w1u w1uVar, w4u w4uVar, yqt yqtVar, rdq rdqVar, rdq rdqVar2, zqt zqtVar, w1u w1uVar2, ocl oclVar, ctf0 ctf0Var, i1w0 i1w0Var, mne mneVar) {
        ctf0Var.getClass();
        i1w0Var.getClass();
        g8l g8lVar = new g8l(yqtVar, w1uVar, w4uVar, (byte) 14);
        cz czVar = new cz(ctf0Var, oclVar, (byte) 13);
        rwj rwjVar = mneVar.f22085a;
        super(null, g8lVar, czVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = yqtVar;
        this.p = rdqVar;
        this.q = rdqVar2;
        this.r = zqtVar;
        this.s = w1uVar2;
        this.t = i1w0Var;
    }

    public final void M() {
        Object next;
        zzp0 zzp0VarA = this.o.a();
        lg30 lg30Var = zzp0VarA.b;
        int i = zzp0VarA.f45266a;
        rdq rdqVar = this.q;
        rdqVar.getClass();
        Iterator it = ((ArrayList) rdqVar.f30301a.f17481a.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            rgv0 rgv0Var = (rgv0) next;
            if (rgv0Var.f30457a == lg30Var && rgv0Var.b == i) {
                break;
            }
        }
        rgv0 rgv0Var2 = (rgv0) next;
        if (rgv0Var2 == null) {
            rgv0Var2 = rgv0.g;
        }
        zqt zqtVar = this.r;
        zqtVar.getClass();
        rgv0Var2.getClass();
        k0q0 k0q0Var = zqtVar.f44822a;
        k0q0Var.getClass();
        k0q0Var.f17481a.f12247a = rgv0Var2;
        i1w0 i1w0Var = this.t;
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

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        i4q i4qVar = (i4q) obj;
        i4qVar.getClass();
        if (!i4qVar.equals(b4q.f1971a)) {
            if (i4qVar.equals(d4q.f5467a)) {
                G(p4q.f26366a);
                return;
            }
            boolean zEquals = i4qVar.equals(e4q.f7195a);
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (zEquals) {
                h0q0 h0q0Var = this.s.f38418a.f17481a;
                h0q0Var.c = (zzp0) h0q0Var.d;
                zzp0 zzp0VarA = this.o.a();
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, t4q.a((t4q) value3, zzp0VarA)));
                M();
                return;
            }
            if (i4qVar.equals(a4q.f236a)) {
                M();
                return;
            }
            if (i4qVar.equals(h4q.f12446a)) {
                G(r4q.f29849a);
                return;
            }
            if (i4qVar.equals(g4q.f10680a)) {
                G(q4q.f28111a);
                return;
            }
            boolean z = i4qVar instanceof c4q;
            rdq rdqVar = this.p;
            if (z) {
                zzp0 zzp0VarA2 = zzp0.a(((t4q) D()).d, 0, ((c4q) i4qVar).f3738a, 1);
                rdqVar.a(zzp0VarA2);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, t4q.a((t4q) value2, zzp0VarA2)));
                return;
            }
            if (!(i4qVar instanceof f4q)) {
                if (i4qVar instanceof z3q) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            zzp0 zzp0VarA3 = zzp0.a(((t4q) D()).d, ((f4q) i4qVar).f8928a, null, 2);
            rdqVar.a(zzp0VarA3);
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, t4q.a((t4q) value, zzp0VarA3)));
            return;
        }
        i1w0 i1w0Var = this.t;
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
