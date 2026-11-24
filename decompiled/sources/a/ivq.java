package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class ivq extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public c4m0 A;
    public final x4u o;
    public final String p;
    public final long q;
    public final duj r;
    public final mne s;
    public final fhj t;
    public final wyu u;
    public final jwu v;
    public final ctf0 w;
    public final m1e x;
    public final i1w0 y;
    public bby z;

    public ivq(x4u x4uVar, String str, long j, duj dujVar, ocl oclVar, mne mneVar, weu weuVar, fhj fhjVar, qzt qztVar, wyu wyuVar, f7u f7uVar, jwu jwuVar, ctf0 ctf0Var, uyu uyuVar, m1e m1eVar, i1w0 i1w0Var, r9u r9uVar) {
        wyuVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        xvo xvoVar = new xvo(weuVar, str, qztVar, ctf0Var, fhjVar, j, wyuVar, (byte) 1);
        xuh xuhVar = new xuh(oclVar, r9uVar, (byte) 2);
        rwj rwjVar = mneVar.f22085a;
        yje yjeVar = null;
        super(null, xvoVar, xuhVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = x4uVar;
        this.p = str;
        this.q = j;
        this.r = dujVar;
        this.s = mneVar;
        this.t = fhjVar;
        this.u = wyuVar;
        this.v = jwuVar;
        this.w = ctf0Var;
        this.x = m1eVar;
        this.y = i1w0Var;
        M();
        sac.T(new fnq(uyuVar.f36509a.h(), new sxk(this, yjeVar, (byte) 26), (byte) 4), d5c.S(jiu0.a(this), rwjVar), hvq.h);
        sac.T(new fnq(f7uVar.n(str), new g6g((Object) this, (Object) qztVar.a(), yjeVar, (byte) 19), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), gvq.h);
    }

    public final void M() {
        sac.V(jiu0.a(this), new g7p((Object) this, (byte) 11), null, this.s.b, new cvq(this, null, (byte) 0), 10);
    }

    public final void N() {
        bby bbyVarV;
        bby bbyVar = this.z;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        boolean z = ((suq) D()).i;
        mne mneVar = this.s;
        if (z) {
            bbyVarV = sac.X(jiu0.a(this), 30L, mneVar.b, dvq.f6758a, new cvq(this, yjeVar, (byte) 1));
        } else {
            bbyVarV = sac.V(jiu0.a(this), evq.f8483a, null, mneVar.b, new cvq(this, yjeVar, (byte) 2), 10);
        }
        this.z = bbyVarV;
    }

    @Override // a.diu0
    public final void v() {
        c4m0 c4m0Var = this.A;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.A = null;
        bby bbyVar = this.z;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.z = null;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        duq duqVar = (duq) obj;
        duqVar.getClass();
        super.x(duqVar);
        if (!duqVar.equals(ztq.f44973a)) {
            if (duqVar.equals(auq.f1490a)) {
                M();
                N();
                return;
            }
            yje yjeVar = null;
            if (duqVar.equals(buq.f3244a)) {
                c4m0 c4m0Var = this.A;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.A = sac.T(new fnq(this.x.a(), new cvq(this, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), this.s.f22085a), fvq.h);
                    return;
                }
                return;
            }
            if (!duqVar.equals(cuq.f4998a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var2 = this.A;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            this.A = null;
            bby bbyVar = this.z;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.z = null;
            return;
        }
        i1w0 i1w0Var = this.y;
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
