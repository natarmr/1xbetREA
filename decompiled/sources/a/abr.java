package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class abr extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final String o;
    public final rpt p;
    public final duj q;
    public final m1e r;
    public final mne s;
    public final i1w0 t;
    public c4m0 u;

    public abr(String str, rpt rptVar, duj dujVar, ocl oclVar, m1e m1eVar, mne mneVar, i1w0 i1w0Var) {
        m1eVar.getClass();
        s9r s9rVar = new s9r((byte) 5);
        yar yarVar = new yar(oclVar, (byte) 0);
        rwj rwjVar = mneVar.f22085a;
        super(null, s9rVar, yarVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = str;
        this.p = rptVar;
        this.q = dujVar;
        this.r = m1eVar;
        this.s = mneVar;
        this.t = i1w0Var;
    }

    public final void M(boolean z) {
        mie0 mie0Var = new mie0();
        sac.V(jiu0.a(this), new f5p(mie0Var, this, (byte) 15), null, this.s.b, new ys8((Object) mie0Var, (Object) this, z, (yje) null, (byte) 7), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        dar darVar = (dar) obj;
        darVar.getClass();
        byte b = 0;
        if (!darVar.equals(z9r.f44033a)) {
            if (darVar.equals(aar.f542a)) {
                M(true);
                return;
            }
            yje yjeVar = null;
            if (!darVar.equals(bar.f2274a)) {
                if (!darVar.equals(car.f4026a)) {
                    t9f.b();
                    return;
                }
                c4m0 c4m0Var = this.u;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                    return;
                }
                return;
            }
            c4m0 c4m0Var2 = this.u;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.u = sac.T(new fnq(this.r.b(), new zar(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.s.b), new pfl(2, this, abr.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 9));
                return;
            }
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
