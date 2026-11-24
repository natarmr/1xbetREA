package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class tj8 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final jtj o;
    public final pru p;
    public final mne q;
    public final duj r;
    public final i1w0 s;
    public c4m0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj8(jtj jtjVar, pru pruVar, mne mneVar, duj dujVar, i1w0 i1w0Var, ocl oclVar, ctf0 ctf0Var) {
        super(null, new hc0(pruVar, (byte) 13), new cz(oclVar, ctf0Var, (byte) 6), cvm0.p(mneVar.c, mneVar.f22085a), null);
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.o = jtjVar;
        this.p = pruVar;
        this.q = mneVar;
        this.r = dujVar;
        this.s = i1w0Var;
        M();
    }

    public final void M() {
        c4m0 c4m0Var = this.t;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.t = sac.R(jiu0.a(this), new d38(this, (byte) 8), null, this.q.b, new qv3(this, null, (byte) 18));
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        si8 si8Var = (si8) obj;
        si8Var.getClass();
        super.x(si8Var);
        if (!si8Var.equals(qi8.f28778a)) {
            if (si8Var.equals(ri8.f30528a)) {
                M();
                return;
            } else if (si8Var.equals(pi8.f27032a)) {
                E();
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
