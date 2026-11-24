package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class tmv0 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final n4u o;
    public final mne p;
    public final i1w0 q;
    public final duj r;
    public final String s;
    public final c4m0 t;
    public bby u;

    public tmv0(n4u n4uVar, m1e m1eVar, mne mneVar, i1w0 i1w0Var, duj dujVar, ocl oclVar, ctf0 ctf0Var, String str) {
        m1eVar.getClass();
        ctf0Var.getClass();
        l00 l00Var = new l00(str, (byte) 12);
        gpb0 gpb0Var = new gpb0(oclVar, ctf0Var, (byte) 22);
        rwj rwjVar = mneVar.f22085a;
        super(null, l00Var, gpb0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = n4uVar;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = dujVar;
        this.s = str;
        c4m0 c4m0Var = this.t;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.t = sac.T(new fnq(m1eVar.b(), new smv0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new rtq0(this, yjeVar, (byte) 29));
        }
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.u;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, mmv0.a((mmv0) value, true, false, false, null, 24)));
            this.u = sac.V(jiu0.a(this), new gdv0((Object) this, (byte) 3), null, this.p.b, new smv0(this, null, (byte) 0), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        hmv0 hmv0Var = (hmv0) obj;
        hmv0Var.getClass();
        super.x(hmv0Var);
        if (!hmv0Var.equals(fmv0.f9804a)) {
            if (hmv0Var.equals(gmv0.f11560a)) {
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
