package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class yrr0 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final mne o;
    public final ctf0 p;
    public final i1w0 q;
    public final lsn r;
    public final sa10 s;
    public final duj t;
    public final pru u;
    public final edu v;
    public final prc w;
    public final c4m0 x;
    public bby y;
    public bby z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrr0(mne mneVar, ctf0 ctf0Var, i1w0 i1w0Var, lsn lsnVar, sa10 sa10Var, m1e m1eVar, duj dujVar, pru pruVar, edu eduVar, prc prcVar) {
        super(null, new yqr0((byte) 3), xrr0.f41383a, cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = mneVar;
        this.p = ctf0Var;
        this.q = i1w0Var;
        this.r = lsnVar;
        this.s = sa10Var;
        this.t = dujVar;
        this.u = pruVar;
        this.v = eduVar;
        this.w = prcVar;
        c4m0 c4m0Var = this.x;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
        this.x = sac.T(new fnq(m1eVar.b(), new z2n0(this, null, (byte) 27), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new k5r0(2, this, yrr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 4, (byte) 6));
        M(true);
    }

    public final void M(boolean z) {
        bby bbyVar = this.y;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        this.y = sac.g0(jiu0.a(this), "TotoJackpotTirageUdfViewModel_loadTirage()", this.o.b, new mjr0(1, this, yrr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 5), new xj1((byte) 22, (yje) null, (i3t0) this, z), 70);
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void x(srr0 srr0Var) {
        Object value;
        srr0Var.getClass();
        super.x(srr0Var);
        boolean zEquals = srr0Var.equals(orr0.f25749a);
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.q;
        if (zEquals) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (srr0Var.equals(prr0.f27480a)) {
                E();
                return;
            }
            if (srr0Var.equals(qrr0.f29224a)) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, wrr0.a((wrr0) value, null, null, 10000L, 11)));
                M(true);
                return;
            }
            if (!srr0Var.equals(rrr0.f30998a)) {
                t9f.b();
                return;
            }
            hqr0 hqr0Var = (hqr0) ((pzu) this.w.b).b;
            p7m0 p7m0Var2 = hqr0Var.b;
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            p7m0Var2.o(null, lunVar);
            hqr0Var.f13498a.n(krr0.n);
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
