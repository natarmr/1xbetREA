package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class yow extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final String o;
    public final xfu p;
    public final duj q;
    public final i1w0 r;
    public final m1e s;
    public final mne t;
    public c4m0 u;

    public yow(String str, xfu xfuVar, duj dujVar, ocl oclVar, i1w0 i1w0Var, m1e m1eVar, ctf0 ctf0Var, mne mneVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        kdw kdwVar = new kdw((byte) 9);
        cz czVar = new cz(ctf0Var, oclVar, (byte) 16);
        rwj rwjVar = mneVar.f22085a;
        super(null, kdwVar, czVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = str;
        this.p = xfuVar;
        this.q = dujVar;
        this.r = i1w0Var;
        this.s = m1eVar;
        this.t = mneVar;
    }

    public final void M(boolean z) {
        mie0 mie0Var = new mie0();
        sac.V(jiu0.a(this), new okw(mie0Var, this, (byte) 5), null, this.t.b, new ys8((Object) mie0Var, (Object) this, z, (yje) null, (byte) 14), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        xnw xnwVar = (xnw) obj;
        xnwVar.getClass();
        byte b = 0;
        if (!xnwVar.equals(tnw.f34256a)) {
            if (xnwVar.equals(unw.f35982a)) {
                M(true);
                return;
            }
            yje yjeVar = null;
            if (xnwVar.equals(vnw.f37737a)) {
                c4m0 c4m0Var = this.u;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.u = sac.T(new fnq(this.s.b(), new xow(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.t.b), new kaw(this, yjeVar, (byte) 6));
                    return;
                }
                return;
            }
            if (!xnwVar.equals(wnw.f39467a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var2 = this.u;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
                return;
            }
            return;
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
