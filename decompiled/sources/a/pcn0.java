package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class pcn0 extends i3t0 {
    public final vzg0 o;
    public final i1w0 p;

    public pcn0(vzg0 vzg0Var, mne mneVar, ctf0 ctf0Var, i1w0 i1w0Var) {
        ctf0Var.getClass();
        lit litVar = new lit(ctf0Var, vzg0Var, (byte) 2);
        f8l0 f8l0Var = new f8l0((byte) 24);
        rwj rwjVar = mneVar.f22085a;
        super(null, litVar, f8l0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = vzg0Var;
        this.p = i1w0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        ecn0 ecn0Var = (ecn0) obj;
        ecn0Var.getClass();
        boolean z = ecn0Var instanceof acn0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, ncn0.a((ncn0) value2, ((acn0) ecn0Var).f637a, 0, 13)));
            return;
        }
        if (!(ecn0Var instanceof bcn0)) {
            if (ecn0Var instanceof dcn0) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, ncn0.a((ncn0) value, false, ((dcn0) ecn0Var).f5854a, 11)));
                this.o.e("SELECTED_TAB_KEY", Integer.valueOf(((dcn0) ecn0Var).f5854a));
                return;
            }
            if (!(ecn0Var instanceof ccn0)) {
                if (ecn0Var instanceof zbn0) {
                    E();
                    return;
                }
                return;
            }
            int i = ((ncn0) D()).c;
            if (i == 0) {
                G(kcn0.f18070a);
                return;
            } else {
                if (i != 1) {
                    return;
                }
                G(lcn0.f19807a);
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
