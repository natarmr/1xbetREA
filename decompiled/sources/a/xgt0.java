package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class xgt0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final i1w0 o;
    public final String p;
    public final xsu q;
    public final duj r;
    public final kki s;
    public final mne t;
    public final long u;
    public bby v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgt0(i1w0 i1w0Var, String str, xsu xsuVar, duj dujVar, kki kkiVar, ocl oclVar, vjp vjpVar, mne mneVar, m1e m1eVar, long j, r9u r9uVar, ctf0 ctf0Var) {
        super(null, new xns0((byte) 24), new p1z(j, ctf0Var, oclVar, vjpVar, r9uVar), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        r9uVar.getClass();
        ctf0Var.getClass();
        this.o = i1w0Var;
        this.p = str;
        this.q = xsuVar;
        this.r = dujVar;
        this.s = kkiVar;
        this.t = mneVar;
        this.u = j;
        sac.T(new fnq(m1eVar.b(), new wgt0(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), new ax5(this)), foe.h);
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.v;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, sgt0.a((sgt0) value, true, false)));
            this.v = sac.V(jiu0.a(this), new vgt0(this, b), null, this.t.b, new wgt0(this, null, b), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        egt0 egt0Var = (egt0) obj;
        egt0Var.getClass();
        super.x(egt0Var);
        byte b = 0;
        if (!egt0Var.equals(bgt0.f2574a)) {
            yje yjeVar = null;
            if (egt0Var instanceof cgt0) {
                agt0 agt0Var = ((cgt0) egt0Var).f4330a;
                if (agt0Var instanceof yft0) {
                    i3t0.K(this, null, null, new gv60(this, agt0Var, yjeVar, (byte) 22), 3);
                    return;
                }
                return;
            }
            if (egt0Var.equals(dgt0.f6057a)) {
                i3t0.K(this, null, new vgt0(this, b), new m91(this, yjeVar, (byte) 25), 1);
                return;
            } else {
                t9f.b();
                return;
            }
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
