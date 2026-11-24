package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class qqw extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final String o;
    public final long p;
    public final yfu q;
    public final do20 r;
    public final jwu s;
    public final fhj t;
    public final ctf0 u;
    public final m1e v;
    public final mne w;
    public final i1w0 x;
    public bby y;
    public c4m0 z;

    public qqw(String str, long j, yfu yfuVar, do20 do20Var, jwu jwuVar, qzt qztVar, fhj fhjVar, uyu uyuVar, wyu wyuVar, ocl oclVar, ctf0 ctf0Var, m1e m1eVar, mne mneVar, i1w0 i1w0Var, r9u r9uVar) {
        wyuVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        b29 b29Var = new b29(qztVar, ctf0Var, fhjVar, str, j, wyuVar);
        xuh xuhVar = new xuh(oclVar, r9uVar, (byte) 5);
        rwj rwjVar = mneVar.f22085a;
        super(null, b29Var, xuhVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = yfuVar;
        this.r = do20Var;
        this.s = jwuVar;
        this.t = fhjVar;
        this.u = ctf0Var;
        this.v = m1eVar;
        this.w = mneVar;
        this.x = i1w0Var;
        sac.T(new fnq(uyuVar.f36509a.h(), new kaw(this, null, (byte) 7), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), oqw.h);
    }

    public final void M(boolean z) {
        mie0 mie0Var = new mie0();
        sac.V(jiu0.a(this), new okw(mie0Var, this, (byte) 7), null, this.w.b, new ys8((Object) mie0Var, (Object) this, z, (yje) null, (byte) 15), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        aqw aqwVar = (aqw) obj;
        aqwVar.getClass();
        boolean zEquals = aqwVar.equals(vpw.f37828a);
        byte b = 0;
        i1w0 i1w0Var = this.x;
        if (!zEquals) {
            if (aqwVar.equals(xpw.f41286a)) {
                M(true);
                return;
            }
            yje yjeVar = null;
            if (aqwVar.equals(ypw.f43052a)) {
                c4m0 c4m0Var = this.z;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.z = sac.T(new fnq(this.v.b(), new mqw(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.w.b), nqw.h);
                    return;
                }
                return;
            }
            if (aqwVar instanceof wpw) {
                gqw gqwVar = ((wpw) aqwVar).f39563a;
                if (gqwVar instanceof eqw) {
                    i1w0Var.d(new adw(this, (byte) 3));
                    return;
                } else {
                    if (gqwVar instanceof fqw) {
                        return;
                    }
                    t9f.b();
                    return;
                }
            }
            if (!aqwVar.equals(zpw.f44781a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var2 = this.z;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            bby bbyVar = this.y;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
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
