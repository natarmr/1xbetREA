package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class gx50 extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public c4m0 A;
    public final String o;
    public final long p;
    public final mne q;
    public final i1w0 r;
    public final ctf0 s;
    public final xfu t;
    public final m1e u;
    public final jwu v;
    public final fhj w;
    public final wyu x;
    public bby y;
    public bby z;

    public gx50(String str, long j, mne mneVar, i1w0 i1w0Var, ctf0 ctf0Var, xfu xfuVar, ocl oclVar, m1e m1eVar, jwu jwuVar, f7u f7uVar, weu weuVar, qzt qztVar, fhj fhjVar, uyu uyuVar, wyu wyuVar, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        xvo xvoVar = new xvo(weuVar, str, qztVar, ctf0Var, fhjVar, j, wyuVar, (byte) 4);
        xuh xuhVar = new xuh(oclVar, r9uVar, (byte) 9);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, xvoVar, xuhVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = mneVar;
        this.r = i1w0Var;
        this.s = ctf0Var;
        this.t = xfuVar;
        this.u = m1eVar;
        this.v = jwuVar;
        this.w = fhjVar;
        this.x = wyuVar;
        M();
        N();
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new xr10((Object) this, yjeVar, (byte) 28), (byte) 4), d5c.S(jiu0.a(this), rwjVar), fx50.h);
        sac.T(new fnq(f7uVar.n(str), new khx((Object) this, (Object) qztVar.a(), yjeVar, (byte) 19), (byte) 4), jiu0.a(this), ex50.h);
    }

    public final void M() {
        bby bbyVar = this.y;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.y = sac.V(jiu0.a(this), new jw50(1, this, gx50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, this.q.b, new cx50(this, null, (byte) 0), 10);
        }
    }

    public final void N() {
        c4m0 c4m0Var = this.A;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.A = sac.T(new fnq(this.u.a(), new cx50(this, null, b), (byte) 4), d5c.S(jiu0.a(this), this.q.f22085a), dx50.h);
        }
    }

    public final void O() {
        bby bbyVar = this.z;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.z = sac.a0(jiu0.a(this), ibc.w0(30L, bfn.SECONDS), null, null, new cx50(this, yjeVar, (byte) 3), 6);
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
        Object value;
        on50 on50Var = (on50) obj;
        on50Var.getClass();
        if (on50Var instanceof kn50) {
            M();
            O();
            return;
        }
        if (!on50Var.equals(jn50.f16797a)) {
            if (on50Var instanceof ln50) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, pw50.a((pw50) value, false, false, false, ((ln50) on50Var).f20328a, null, null, null, 119)));
                return;
            }
            if (!(on50Var instanceof mn50)) {
                if (on50Var instanceof nn50) {
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
