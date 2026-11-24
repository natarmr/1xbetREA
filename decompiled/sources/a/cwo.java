package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class cwo extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public c4m0 A;
    public final String o;
    public final long p;
    public final mne q;
    public final ctf0 r;
    public final i1w0 s;
    public final x4u t;
    public final m1e u;
    public final jwu v;
    public final fhj w;
    public final wyu x;
    public bby y;
    public bby z;

    public cwo(String str, long j, mne mneVar, ctf0 ctf0Var, i1w0 i1w0Var, x4u x4uVar, ocl oclVar, m1e m1eVar, uyu uyuVar, jwu jwuVar, f7u f7uVar, weu weuVar, qzt qztVar, fhj fhjVar, wyu wyuVar, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        xvo xvoVar = new xvo(weuVar, str, qztVar, ctf0Var, fhjVar, j, wyuVar, (byte) 0);
        xuh xuhVar = new xuh(oclVar, r9uVar, (byte) 1);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, xvoVar, xuhVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = mneVar;
        this.r = ctf0Var;
        this.s = i1w0Var;
        this.t = x4uVar;
        this.u = m1eVar;
        this.v = jwuVar;
        this.w = fhjVar;
        this.x = wyuVar;
        M();
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new sxk(this, yjeVar, (byte) 8), (byte) 4), d5c.S(jiu0.a(this), rwjVar), bwo.h);
        N();
        sac.T(new fnq(f7uVar.n(str), new g6g((Object) this, (Object) qztVar.a(), yjeVar, (byte) 11), (byte) 4), jiu0.a(this), awo.h);
    }

    public final void M() {
        bby bbyVar = this.y;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.y = sac.V(jiu0.a(this), new hin(1, this, cwo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, this.q.b, new yvo(this, null, (byte) 0), 10);
        }
    }

    public final void N() {
        c4m0 c4m0Var = this.A;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.A = sac.T(new fnq(this.u.a(), new yvo(this, null, b), (byte) 4), d5c.S(jiu0.a(this), this.q.f22085a), zvo.h);
        }
    }

    public final void O() {
        bby bbyVar = this.z;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.z = sac.a0(jiu0.a(this), ibc.w0(30L, bfn.SECONDS), null, null, new yvo(this, yjeVar, (byte) 3), 6);
    }

    @Override // a.diu0
    public final void v() {
        bby bbyVar = this.y;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.z;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        c4m0 c4m0Var = this.A;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        gvo gvoVar = (gvo) obj;
        gvoVar.getClass();
        if (gvoVar instanceof dvo) {
            M();
            O();
            return;
        }
        if (!gvoVar.equals(cvo.f5040a)) {
            if (!(gvoVar instanceof evo)) {
                if (gvoVar instanceof fvo) {
                    N();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            bby bbyVar = this.y;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            bby bbyVar2 = this.z;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            c4m0 c4m0Var = this.A;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
                return;
            }
            return;
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
