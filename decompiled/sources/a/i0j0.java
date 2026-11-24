package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class i0j0 extends i3t0 {
    public final gle0 o;
    public final azt p;
    public final yo4 q;
    public final i1w0 r;
    public final je s;

    /* JADX WARN: Illegal instructions before constructor call */
    public i0j0(vzg0 vzg0Var, gle0 gle0Var, k7u k7uVar, azt aztVar, yo4 yo4Var, i1w0 i1w0Var, mne mneVar, je jeVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, new rai0(k7uVar, (byte) 10), cvm0.p(rwjVar, rwjVar), new h0j0(ctf0Var, (byte) 0));
        this.o = gle0Var;
        this.p = aztVar;
        this.q = yo4Var;
        this.r = i1w0Var;
        this.s = jeVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        List list;
        b0j0 b0j0Var = (b0j0) obj;
        b0j0Var.getClass();
        boolean zEquals = b0j0Var.equals(yzi0.f43515a);
        i1w0 i1w0Var = this.r;
        if (!zEquals) {
            if (!(b0j0Var instanceof zzi0)) {
                if (b0j0Var.equals(a0j0.f27a)) {
                    i1w0Var.d(new rai0(this, (byte) 9));
                    return;
                } else if (b0j0Var.equals(xzi0.f41755a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            jvn jvnVar = ((zzi0) b0j0Var).f45255a;
            if (jvnVar != ((f0j0) D()).f8720a) {
                String strA = jvnVar.a();
                yo4 yo4Var = this.q;
                yo4Var.getClass();
                i8i.D("option", strA, yo4Var.f42966a, "acc_settings_coeff_set");
                String strA2 = jvnVar.a();
                je jeVar = this.s;
                jeVar.getClass();
                b1j.v(strA2, jeVar.f16351a, 3287L);
                azt aztVar = this.p;
                aztVar.getClass();
                aztVar.f1737a.f36530a.e(jvnVar.getId(), "COEF_TYPE_ID");
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                    list = ((f0j0) value).b;
                    list.getClass();
                } while (!p7m0Var.m(value, new f0j0(jvnVar, list)));
                return;
            }
            return;
        }
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
