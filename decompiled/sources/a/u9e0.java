package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class u9e0 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final i1w0 o;
    public final m1e p;
    public final x4u q;
    public final uxs0 r;
    public c4m0 s;
    public bby t;

    /* JADX WARN: Illegal instructions before constructor call */
    public u9e0(i1w0 i1w0Var, m1e m1eVar, x4u x4uVar, pru pruVar, g2v g2vVar, ctf0 ctf0Var, uxs0 uxs0Var, mne mneVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new p2e0(pruVar, (byte) 1), cvm0.p(rwjVar, rwjVar), new o20(g2vVar, ctf0Var, (byte) 23), (yzn0) null);
        this.o = i1w0Var;
        this.p = m1eVar;
        this.q = x4uVar;
        this.r = uxs0Var;
    }

    public final void M() {
        e3c.n(this.s);
        this.s = i3t0.L(this, new fnq(i120.W(this.p.b()), new coc0(this, null, (byte) 10), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        kgz kgzVar;
        Object value;
        i3e0 i3e0Var = (i3e0) obj;
        i3e0Var.getClass();
        super.x(i3e0Var);
        if (i3e0Var instanceof c3e0) {
            c3e0 c3e0Var = (c3e0) i3e0Var;
            if (c3e0Var.equals(z2e0.f43667a)) {
                E();
                return;
            }
            if (c3e0Var.equals(a3e0.f168a)) {
                e3c.n(this.t);
                e3c.n(this.s);
                return;
            } else if (c3e0Var.equals(b3e0.f1899a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!(i3e0Var instanceof h3e0)) {
            t9f.b();
            return;
        }
        h3e0 h3e0Var = (h3e0) i3e0Var;
        boolean zEquals = h3e0Var.equals(d3e0.f5399a);
        i1w0 i1w0Var = this.o;
        if (!zEquals) {
            if (h3e0Var instanceof e3e0) {
                i1w0Var.d(new oac0(this, (e3e0) h3e0Var, (byte) 22));
                return;
            }
            if (h3e0Var.equals(f3e0.f8858a)) {
                M();
                return;
            }
            if (!(h3e0Var instanceof g3e0)) {
                t9f.b();
                return;
            }
            int i = ((g3e0) h3e0Var).f10606a;
            g7e0 g7e0Var = g7e0.c;
            f7e0 f7e0Var = f7e0.c;
            h7e0 h7e0Var = i == 0 ? f7e0Var : g7e0Var;
            if (h7e0Var.equals(f7e0Var)) {
                kgzVar = kgz.MALE;
            } else {
                if (!h7e0Var.equals(g7e0Var)) {
                    t9f.b();
                    return;
                }
                kgzVar = kgz.FEMALE;
            }
            kgz kgzVar2 = kgzVar;
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, o7e0.a((o7e0) value, h7e0Var, kgzVar2, null, false, 25)));
            bby bbyVar = this.t;
            yje yjeVar = null;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.t = i3t0.K(this, null, null, new hhb0(this, yjeVar, (byte) 1), 3);
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
