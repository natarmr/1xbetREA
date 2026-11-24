package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class rhp0 extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final mne o;
    public final duj p;
    public final hnu q;
    public final String r;
    public final i1w0 s;

    public rhp0(m1e m1eVar, mne mneVar, ocl oclVar, duj dujVar, hnu hnuVar, String str, i1w0 i1w0Var) {
        m1eVar.getClass();
        mhp0 mhp0Var = new mhp0((byte) 1);
        yar yarVar = new yar(oclVar, (byte) 13);
        rwj rwjVar = mneVar.f22085a;
        dvj dvjVar = mneVar.b;
        super(null, mhp0Var, yarVar, cvm0.p(rwjVar, dvjVar), null);
        this.o = mneVar;
        this.p = dujVar;
        this.q = hnuVar;
        this.r = str;
        this.s = i1w0Var;
        J(new fnq(m1eVar.b(), new z2n0(this, null, (byte) 8), (byte) 4), dvjVar, new g0p0(1, this, rhp0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 11));
        M();
    }

    public final void M() {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, new ghp0(((ghp0) value).f11312a, true, false, false)));
        I(this.o.b, new ttn0(this, (byte) 25), new hhb0(this, null, (byte) 23));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        rgp0 rgp0Var = (rgp0) obj;
        rgp0Var.getClass();
        super.x(rgp0Var);
        if (!(rgp0Var instanceof pgp0)) {
            if (rgp0Var instanceof qgp0) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0Var = this.s;
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
