package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zxl0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final xwl0 o;
    public final svu p;
    public final m1e q;
    public final i1w0 r;
    public final pru s;
    public final mne t;
    public bby u;
    public c4m0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxl0(xwl0 xwl0Var, svu svuVar, gst gstVar, ocl oclVar, m1e m1eVar, i1w0 i1w0Var, ctf0 ctf0Var, pru pruVar, mne mneVar) {
        super(null, new fzk0((byte) 21), new nej0(oclVar, ctf0Var, gstVar, xwl0Var), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = xwl0Var;
        this.p = svuVar;
        this.q = m1eVar;
        this.r = i1w0Var;
        this.s = pruVar;
        this.t = mneVar;
        M(true);
        N();
    }

    public final void M(boolean z) {
        bby bbyVar = this.u;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.u = sac.V(jiu0.a(this), new kcl0(1, this, zxl0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, this.t.b, new a220(z, (Object) this, (yje) null, (byte) 28), 10);
        }
    }

    public final void N() {
        c4m0 c4m0Var = this.v;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.v = sac.T(new fnq(this.q.a(), new yng0(this, null, (byte) 23), (byte) 4), d5c.S(jiu0.a(this), this.t.f22085a), yxl0.h);
        }
    }

    @Override // a.diu0
    public final void v() {
        bby bbyVar = this.u;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        c4m0 c4m0Var = this.v;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        hvl0 hvl0Var = (hvl0) obj;
        hvl0Var.getClass();
        if (hvl0Var.equals(cvl0.f5036a)) {
            M(false);
            return;
        }
        if (!hvl0Var.equals(avl0.f1532a)) {
            if (hvl0Var instanceof dvl0) {
                G(new sxl0(((dvl0) hvl0Var).f6749a));
                return;
            }
            if (hvl0Var instanceof gvl0) {
                H(new edk0(hvl0Var, (byte) 19));
                return;
            }
            if (hvl0Var.equals(evl0.f8475a)) {
                bby bbyVar = this.u;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                c4m0 c4m0Var = this.v;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                    return;
                }
                return;
            }
            if (hvl0Var.equals(fvl0.f10222a)) {
                N();
                return;
            } else if (hvl0Var.equals(bvl0.f3283a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0Var = this.r;
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
