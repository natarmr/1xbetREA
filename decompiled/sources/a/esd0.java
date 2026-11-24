package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class esd0 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final vzg0 o;
    public final duj p;
    public final i1w0 q;
    public final String r;
    public final mne s;
    public final b8u t;
    public bby u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esd0(vzg0 vzg0Var, duj dujVar, m1e m1eVar, i1w0 i1w0Var, ocl oclVar, ctf0 ctf0Var, String str, mne mneVar, b8u b8uVar) {
        super(null, new wg2(vzg0Var, (byte) 10), new gpb0(ctf0Var, oclVar, (byte) 1), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = vzg0Var;
        this.p = dujVar;
        this.q = i1w0Var;
        this.r = str;
        this.s = mneVar;
        this.t = b8uVar;
        sac.T(new fnq(m1eVar.b(), new dsd0(this, null, (byte) 0), (byte) 4), d5c.S(d5c.S(jiu0.a(this), mneVar.b), new ax5(this)), foe.h);
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.u;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, yrd0.a((yrd0) value, true, false, null, 0L, 12)));
            this.u = sac.V(jiu0.a(this), new v6d0(this, (byte) 11), null, this.s.b, new dsd0(this, null, b), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        prd0 prd0Var = (prd0) obj;
        prd0Var.getClass();
        super.x(prd0Var);
        if (!prd0Var.equals(mrd0.f22266a)) {
            if (prd0Var.equals(ord0.f25730a)) {
                M();
                return;
            }
            if (!(prd0Var instanceof nrd0)) {
                t9f.b();
                return;
            }
            long j = ((nrd0) prd0Var).f23997a;
            this.o.e("SELECTED_CHIP", Long.valueOf(j));
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, yrd0.a((yrd0) value, false, false, null, j, 7)));
            return;
        }
        i1w0 i1w0Var = this.q;
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
