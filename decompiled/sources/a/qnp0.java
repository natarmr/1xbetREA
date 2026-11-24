package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class qnp0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final vzg0 o;
    public final String p;
    public final xfu q;
    public final duj r;
    public final mne s;
    public final i1w0 t;
    public bby u;
    public final c4m0 v;

    public qnp0(vzg0 vzg0Var, String str, xfu xfuVar, m1e m1eVar, ocl oclVar, duj dujVar, mne mneVar, i1w0 i1w0Var, ctf0 ctf0Var, pru pruVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        ck60 ck60Var = new ck60(str, vzg0Var, pruVar, (byte) 20);
        gpb0 gpb0Var = new gpb0(oclVar, ctf0Var, (byte) 14);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, ck60Var, gpb0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = vzg0Var;
        this.p = str;
        this.q = xfuVar;
        this.r = dujVar;
        this.s = mneVar;
        this.t = i1w0Var;
        c4m0 c4m0Var = this.v;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.v = sac.T(new fnq(m1eVar.b(), new pnp0(this, null, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new ssl0(this, (yje) null, (byte) 17));
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
            } while (!p7m0Var.m(value, knp0.a((knp0) value, true, false, null, 0, 57)));
            this.u = sac.V(jiu0.a(this), new ttn0(this, (byte) 28), null, this.s.f22085a, new pnp0(this, null, (byte) 0), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        fnp0 fnp0Var = (fnp0) obj;
        fnp0Var.getClass();
        super.x(fnp0Var);
        if (!(fnp0Var instanceof cnp0)) {
            if (fnp0Var instanceof dnp0) {
                M();
                return;
            }
            if (!(fnp0Var instanceof enp0)) {
                t9f.b();
                return;
            }
            this.o.e("KEY_CURRENT_TAB", Integer.valueOf(((enp0) fnp0Var).f8106a));
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, knp0.a((knp0) value, false, false, null, ((enp0) fnp0Var).f8106a, 47)));
            return;
        }
        i1w0 i1w0Var = this.t;
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
