package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.ufc.api.weight_class_rating.UfcWeightClassRatingParams;

/* JADX INFO: loaded from: classes6.dex */
public final class c8v0 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final UfcWeightClassRatingParams o;
    public final i1w0 p;
    public final m1e q;
    public final x4u r;
    public final kys0 s;
    public c4m0 t;
    public bby u;

    /* JADX WARN: Illegal instructions before constructor call */
    public c8v0(UfcWeightClassRatingParams ufcWeightClassRatingParams, i1w0 i1w0Var, m1e m1eVar, x4u x4uVar, g2v g2vVar, ctf0 ctf0Var, mne mneVar, kys0 kys0Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new o1u0((byte) 28), cvm0.p(rwjVar, rwjVar), new m8s0(ufcWeightClassRatingParams, g2vVar, ctf0Var, (byte) 10), (yzn0) null);
        this.o = ufcWeightClassRatingParams;
        this.p = i1w0Var;
        this.q = m1eVar;
        this.r = x4uVar;
        this.s = kys0Var;
    }

    public final void M() {
        e3c.n(this.t);
        this.t = i3t0.L(this, new fnq(i120.W(this.q.b()), new k6s0(this, null, (byte) 24), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        o7v0 o7v0Var = (o7v0) obj;
        o7v0Var.getClass();
        super.x(o7v0Var);
        if (!(o7v0Var instanceof n7v0)) {
            if (!(o7v0Var instanceof j7v0)) {
                t9f.b();
                return;
            }
            j7v0 j7v0Var = (j7v0) o7v0Var;
            if (j7v0Var.equals(g7v0.f10835a)) {
                E();
                return;
            }
            if (!j7v0Var.equals(h7v0.f12595a)) {
                if (j7v0Var.equals(i7v0.f14313a)) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            bby bbyVar = this.u;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            c4m0 c4m0Var = this.t;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
                return;
            }
            return;
        }
        n7v0 n7v0Var = (n7v0) o7v0Var;
        boolean zEquals = n7v0Var.equals(k7v0.f17843a);
        i1w0 i1w0Var = this.p;
        if (!zEquals) {
            if (n7v0Var.equals(m7v0.f21338a)) {
                M();
                return;
            } else if (n7v0Var instanceof l7v0) {
                i1w0Var.d(new xis0((Object) this, n7v0Var, (byte) 27));
                return;
            } else {
                t9f.b();
                return;
            }
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
