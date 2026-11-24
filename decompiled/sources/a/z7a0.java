package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class z7a0 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final b8u o;
    public final mne p;
    public final i1w0 q;
    public final duj r;
    public final String s;
    public final c4m0 t;
    public bby u;

    public z7a0(b8u b8uVar, m1e m1eVar, mne mneVar, i1w0 i1w0Var, duj dujVar, String str, ocl oclVar, ctf0 ctf0Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wm90 wm90Var = new wm90((byte) 24);
        cz czVar = new cz(oclVar, ctf0Var, (byte) 27);
        rwj rwjVar = mneVar.f22085a;
        super(null, wm90Var, czVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = b8uVar;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = dujVar;
        this.s = str;
        c4m0 c4m0Var = this.t;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.t = sac.T(new fnq(m1eVar.b(), new y7a0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new s980(this, yjeVar, (byte) 18));
        }
        M();
    }

    public final void M() {
        Object value;
        byte b;
        bby bbyVar = this.u;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                b = 0;
            } while (!p7m0Var.m(value, s7a0.a((s7a0) value, true, false)));
            this.u = sac.V(jiu0.a(this), new yr80(this, (byte) 8), null, this.p.b, new y7a0(this, null, b), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        n7a0 n7a0Var = (n7a0) obj;
        n7a0Var.getClass();
        super.x(n7a0Var);
        if (!n7a0Var.equals(l7a0.f19550a)) {
            if (n7a0Var.equals(m7a0.f21311a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
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
