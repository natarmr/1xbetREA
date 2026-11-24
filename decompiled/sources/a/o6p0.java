package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class o6p0 extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public bby A;
    public bby B;
    public c4m0 C;
    public bby D;
    public final xsu o;
    public final String p;
    public final long q;
    public final duj r;
    public final mne s;
    public final f7u t;
    public final jwu u;
    public final qzt v;
    public final ctf0 w;
    public final fhj x;
    public final wyu y;
    public final i1w0 z;

    public o6p0(xsu xsuVar, m1e m1eVar, ocl oclVar, String str, long j, duj dujVar, uyu uyuVar, mne mneVar, f7u f7uVar, jwu jwuVar, weu weuVar, qzt qztVar, ctf0 ctf0Var, fhj fhjVar, wyu wyuVar, i1w0 i1w0Var, r9u r9uVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        xvo xvoVar = new xvo(j, weuVar, str, qztVar, ctf0Var, fhjVar, wyuVar);
        tla0 tla0Var = new tla0(oclVar, ctf0Var, r9uVar, (byte) 5);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, xvoVar, tla0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = xsuVar;
        this.p = str;
        this.q = j;
        this.r = dujVar;
        this.s = mneVar;
        this.t = f7uVar;
        this.u = jwuVar;
        this.v = qztVar;
        this.w = ctf0Var;
        this.x = fhjVar;
        this.y = wyuVar;
        this.z = i1w0Var;
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new l6p0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), rwjVar), n6p0.h);
        sac.T(new fnq(m1eVar.b(), new j6p0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new l6p0(this, yjeVar, (byte) 0));
        N();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, z5p0.a((z5p0) value, null, null, true, false, false, false, null, 199)));
            this.B = i3t0.K(this, null, new ttn0(this, (byte) 19), new hhb0(this, null, (byte) 19), 1);
        }
    }

    public final void N() {
        c4m0 c4m0Var;
        bby bbyVar;
        bby bbyVar2 = this.A;
        byte b = 1;
        yje yjeVar = null;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.A) != null) {
            bbyVar.cancel(null);
        }
        boolean z = ((z5p0) D()).g;
        mne mneVar = this.s;
        this.A = z ? sac.X(jiu0.a(this), 30L, mneVar.b, i6p0.f14253a, new j6p0(this, yjeVar, (byte) 0)) : sac.V(jiu0.a(this), k6p0.f17781a, null, mneVar.b, new j6p0(this, yjeVar, b), 10);
        c4m0 c4m0Var2 = this.C;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.C) != null) {
            c4m0Var.cancel(null);
        }
        this.C = sac.T(new fnq(this.t.n(this.p), new qkb0(this, this.v.a(), (yje) null, (byte) 27), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), m6p0.h);
        M();
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void x(p5p0 p5p0Var) {
        p5p0Var.getClass();
        super.x(p5p0Var);
        if (!p5p0Var.equals(n5p0.f22955a)) {
            if (p5p0Var.equals(o5p0.f24698a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0Var = this.z;
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
