package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class d4q0 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final String o;
    public final long p;
    public final ctf0 q;
    public final mne r;
    public final i1w0 s;
    public final abu t;
    public final psc u;
    public final m1e v;
    public final jwu w;
    public final fhj x;
    public bby y;
    public bby z;

    public d4q0(String str, long j, ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, abu abuVar, jru jruVar, psc pscVar, ocl oclVar, m1e m1eVar, jwu jwuVar, f7u f7uVar, weu weuVar, qzt qztVar, fhj fhjVar, uyu uyuVar, wyu wyuVar, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        xvo xvoVar = new xvo(weuVar, str, qztVar, ctf0Var, fhjVar, j, wyuVar, (byte) 7);
        tla0 tla0Var = new tla0(r9uVar, ctf0Var, oclVar);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, xvoVar, tla0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = ctf0Var;
        this.r = mneVar;
        this.s = i1w0Var;
        this.t = abuVar;
        this.u = pscVar;
        this.v = m1eVar;
        this.w = jwuVar;
        this.x = fhjVar;
        yje yjeVar = null;
        sac.T(new fnq(vtb.M(((ugm0) ((cyu) jruVar.b).b).f35633a), new a4q0(this, yjeVar, (byte) 0), (byte) 4), jiu0.a(this), b4q0.h);
        sac.T(new fnq(uyuVar.f36509a.h(), new a4q0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), rwjVar), c4q0.h);
        sac.T(new fnq(f7uVar.n(str), new otp0(this, qztVar.a(), (yje) null, (byte) 1), (byte) 4), jiu0.a(this), z3q0.h);
    }

    public final void M(boolean z) {
        d4q0 d4q0Var;
        bby bbyVarV;
        Object value;
        bby bbyVar = this.y;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            if (z) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, s3q0.a((s3q0) value, false, true, false, 0, null, null, null, 125)));
            }
            boolean z2 = ((s3q0) D()).f31572a;
            yje yjeVar = null;
            mne mneVar = this.r;
            if (z2) {
                bbyVarV = sac.Y(jiu0.a(this), 30L, mneVar.b, null, new x3q0(this, yjeVar, (byte) 0), 8);
                d4q0Var = this;
            } else {
                d4q0Var = this;
                bbyVarV = sac.V(jiu0.a(this), new g0p0(1, d4q0Var, d4q0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, mneVar.b, new x3q0(d4q0Var, yjeVar, b), 10);
            }
            d4q0Var.y = bbyVarV;
        }
    }

    @Override // a.diu0
    public final void v() {
        ((ugm0) ((cyu) this.u.b).b).f35633a.i();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        g3q0 g3q0Var = (g3q0) obj;
        g3q0Var.getClass();
        if (g3q0Var instanceof c3q0) {
            M(true);
            return;
        }
        if (!g3q0Var.equals(b3q0.f1921a)) {
            if (g3q0Var instanceof d3q0) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, s3q0.a((s3q0) value, false, false, false, ((d3q0) g3q0Var).f5416a, null, null, null, 119)));
                return;
            }
            yje yjeVar = null;
            if (!(g3q0Var instanceof e3q0)) {
                if (g3q0Var instanceof f3q0) {
                    sac.T(new fnq(this.v.a(), new x3q0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), this.r.f22085a), y3q0.h);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            bby bbyVar = this.z;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            bby bbyVar2 = this.y;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
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
