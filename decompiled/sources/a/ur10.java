package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ur10 extends i3t0 {
    public final i1w0 o;
    public final j910 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur10(vzg0 vzg0Var, ctf0 ctf0Var, i1w0 i1w0Var, mne mneVar, j910 j910Var) {
        super(null, new gf10((byte) 10), new v510(ctf0Var, (byte) 4), cvm0.p(mneVar.f22085a, mneVar.b), null);
        ctf0Var.getClass();
        i1w0Var.getClass();
        this.o = i1w0Var;
        this.p = j910Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        mr10 mr10Var = (mr10) obj;
        mr10Var.getClass();
        super.x(mr10Var);
        if (mr10Var instanceof ir10) {
            if (((ir10) mr10Var).equals(ir10.f15235a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!(mr10Var instanceof lr10)) {
            t9f.b();
            return;
        }
        lr10 lr10Var = (lr10) mr10Var;
        if (!lr10Var.equals(jr10.f16981a)) {
            if (!(lr10Var instanceof kr10)) {
                t9f.b();
                return;
            }
            int i = ((kr10) lr10Var).f18744a;
            this.p.w(i);
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, new rr10(i)));
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
