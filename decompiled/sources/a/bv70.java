package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class bv70 extends i3t0 {
    public static final /* synthetic */ int g0 = 0;
    public final mo00 A;
    public final a6u B;
    public final qmu C;
    public final omu D;
    public final pmu E;
    public final vuy F;
    public final vkt0 G;
    public final t4v H;
    public final vri0 I;
    public final uqc J;
    public final ukt0 K;
    public final xpx L;
    public final iyg0 M;
    public final pv00 N;
    public final xfu O;
    public final do20 P;
    public final iqi Q;
    public final nv20 R;
    public final p4u S;
    public c4m0 T;
    public c4m0 U;
    public bby V;
    public c4m0 W;
    public bby X;
    public c4m0 Y;
    public c4m0 Z;
    public c4m0 a0;
    public c4m0 b0;
    public c4m0 c0;
    public bby d0;
    public bby e0;
    public c4m0 f0;
    public final i1w0 o;
    public final mne p;
    public final uq70 q;
    public final m1e r;
    public final pzt s;
    public final hqx t;
    public final irx u;
    public final cqx v;
    public final wri0 w;
    public final uti0 x;
    public final aqi0 y;
    public final tgu z;

    public bv70(i1w0 i1w0Var, mne mneVar, uq70 uq70Var, m1e m1eVar, pzt pztVar, hqx hqxVar, irx irxVar, cqx cqxVar, wri0 wri0Var, uti0 uti0Var, aqi0 aqi0Var, tgu tguVar, mo00 mo00Var, a6u a6uVar, qmu qmuVar, omu omuVar, pmu pmuVar, vuy vuyVar, vkt0 vkt0Var, t4v t4vVar, wyu wyuVar, vri0 vri0Var, uqc uqcVar, ukt0 ukt0Var, xpx xpxVar, iyg0 iyg0Var, pv00 pv00Var, xfu xfuVar, do20 do20Var, iqi iqiVar, nv20 nv20Var, p4u p4uVar) {
        uq70Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        pl70 pl70Var = new pl70(wyuVar, (byte) 2);
        lu70 lu70Var = lu70.f20660a;
        rwj rwjVar = mneVar.f22085a;
        super(null, pl70Var, lu70Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = i1w0Var;
        this.p = mneVar;
        this.q = uq70Var;
        this.r = m1eVar;
        this.s = pztVar;
        this.t = hqxVar;
        this.u = irxVar;
        this.v = cqxVar;
        this.w = wri0Var;
        this.x = uti0Var;
        this.y = aqi0Var;
        this.z = tguVar;
        this.A = mo00Var;
        this.B = a6uVar;
        this.C = qmuVar;
        this.D = omuVar;
        this.E = pmuVar;
        this.F = vuyVar;
        this.G = vkt0Var;
        this.H = t4vVar;
        this.I = vri0Var;
        this.J = uqcVar;
        this.K = ukt0Var;
        this.L = xpxVar;
        this.M = iyg0Var;
        this.N = pv00Var;
        this.O = xfuVar;
        this.P = do20Var;
        this.Q = iqiVar;
        this.R = nv20Var;
        this.S = p4uVar;
    }

    public static wuy O(wuy wuyVar) {
        int iOrdinal = wuyVar.ordinal();
        if (iOrdinal == 0) {
            return wuy.b;
        }
        if (iOrdinal == 1) {
            return wuy.c;
        }
        if (iOrdinal == 2) {
            return wuy.d;
        }
        if (iOrdinal == 3) {
            return wuy.f39812a;
        }
        t9f.b();
        return null;
    }

    public final void M() {
        e3c.n(this.e0);
        this.e0 = sac.V(jiu0.a(this), new ku70(this, (byte) 0), null, this.p.c, new mu70(this, null, (byte) 0), 10);
    }

    public final void N() {
        c4m0 c4m0Var = this.Z;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.Z = sac.T(new dnq(new fnq(this.s.a(), new qu70(this, yjeVar, (byte) 0), (byte) 4), new ou70(this, yjeVar, b), (byte) 0), d5c.S(jiu0.a(this), this.p.f22085a), ru70.h);
        }
    }

    public final void P() {
        Object value;
        oyg0 oyg0Var;
        Object value2;
        ocj ocjVar = this.i;
        p7m0 p7m0Var = ocjVar.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            oyg0Var = this.f;
            oyg0Var.getClass();
        } while (!p7m0Var.m(value, hu70.a((hu70) value, 0, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, null, null, false, 1048575)));
        c4m0 c4m0Var = this.Z;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        this.w.a(false);
        this.y.a(true);
        this.x.a(false);
        uq70 uq70Var = this.q;
        uq70Var.a();
        uq70Var.close();
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value2, hu70.a((hu70) value2, 0, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, null, null, false, 2097148)));
        G(new vt70(false));
        Object obj = ((xs70) this.S.f26374a).f41403a.b.get();
        obj.getClass();
        ks70 ks70Var = (ks70) obj;
        String str = ks70Var.f18800a;
        js70 js70Var = ((xs70) this.P.f6397a).f41403a;
        js70Var.b.set(js70Var.f17037a);
        if (!ks70Var.b || StringsKt.W(str)) {
            return;
        }
        G(new au70(str));
    }

    public final void Q() {
        long j;
        wuy wuyVar = ((hu70) D()).t.f32841a;
        int iOrdinal = wuyVar.ordinal();
        byte b = 2;
        mne mneVar = this.p;
        yje yjeVar = null;
        if (iOrdinal == 0) {
            c4m0 c4m0Var = this.W;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                e3c.n(this.V);
                this.V = sac.V(jiu0.a(this), tu70.f34537a, null, mneVar.f22085a, new mu70(this, yjeVar, b), 10);
                return;
            }
            return;
        }
        vkt0 vkt0Var = this.G;
        if (iOrdinal == 1) {
            vkt0Var.a(O(wuyVar));
            return;
        }
        if (iOrdinal == 2) {
            vkt0Var.a(O(wuyVar));
            Q();
            return;
        }
        if (iOrdinal != 3) {
            t9f.b();
            return;
        }
        c4m0 c4m0Var2 = this.W;
        if (c4m0Var2 == null || !c4m0Var2.isActive()) {
            e3c.n(this.V);
            long jCurrentTimeMillis = System.currentTimeMillis();
            suy suyVar = ((hu70) D()).t;
            boolean z = suyVar.e;
            long j2 = suyVar.c;
            if (z && j2 > jCurrentTimeMillis) {
                j = j2 - jCurrentTimeMillis;
            } else if (!z || j2 >= jCurrentTimeMillis) {
                j = suyVar.b ? 3 * suyVar.d : 300000L;
            } else {
                j = 0;
            }
            long jC = si30.c(j / 1000) * 1000;
            this.W = sac.T(new fnq(new fnq(e3c.t(6, jC), new l87(this, jC, jCurrentTimeMillis, null, (byte) 4)), new yg1((Object) this, yjeVar, (byte) 21), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), nu70.h);
        }
    }

    public final void R() {
        Object value;
        hu70 hu70Var;
        oyg0 oyg0Var;
        Object value2;
        Object value3;
        ocj ocjVar = this.i;
        p7m0 p7m0Var = ocjVar.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            hu70Var = (hu70) value;
            oyg0Var = this.f;
            oyg0Var.getClass();
        } while (!p7m0Var.m(value, hu70.a(hu70Var, hu70Var.f13666a + 1, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, null, null, false, 2097150)));
        if (((hu70) D()).f13666a <= 5) {
            this.q.a();
            M();
            return;
        }
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value2, hu70.a((hu70) value2, 0, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, null, null, false, 2097150)));
        this.w.a(false);
        G(new vt70(false));
        p7m0 p7m0Var3 = ocjVar.f25029a;
        do {
            value3 = p7m0Var3.getValue();
            value3.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var3.m(value3, hu70.a((hu70) value3, 0, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, null, null, false, 1048575)));
    }

    public final void S() {
        Object value;
        if (!((hu70) D()).m) {
            G(zt70.f44943a);
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, hu70.a((hu70) value, 0, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, null, null, true, 1048575)));
        iqi iqiVar = this.Q;
        iqiVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((yfu) iqiVar.c).j();
        String str = jCurrentTimeMillis + "1_" + ttm0.M(4, String.valueOf(((x1u) iqiVar.b).a()));
        pv00 pv00Var = this.N;
        pv00Var.getClass();
        xs70 xs70Var = (xs70) pv00Var.f27640a;
        xs70Var.getClass();
        js70 js70Var = xs70Var.f41403a;
        js70Var.getClass();
        js70Var.b.set(new ks70(str, false));
        c4m0 c4m0Var = this.f0;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.f0 = sac.T(new fnq(this.q.h(), new qu70(this, null, b), (byte) 4), d5c.S(jiu0.a(this), this.p.f22085a), su70.h);
        }
        M();
    }

    @Override // a.diu0
    public final void v() {
        uq70 uq70Var = this.q;
        this.w.a(uq70Var.g() || uq70Var.f());
        uq70Var.d(false);
        this.x.a(false);
        this.y.a(true);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        pq70 pq70Var = (pq70) obj;
        pq70Var.getClass();
        super.x(pq70Var);
        if (pq70Var instanceof oq70) {
            S();
            return;
        }
        if (pq70Var instanceof mq70) {
            uq70 uq70Var = this.q;
            if (uq70Var.g()) {
                uq70Var.c();
            }
            P();
            return;
        }
        if (pq70Var instanceof jq70) {
            if (((suy) this.L.f41287a.f36323a.c.getValue()).f32841a != wuy.c) {
                G(ut70.f36244a);
                return;
            } else {
                Q();
                G(yt70.f43204a);
                return;
            }
        }
        if (pq70Var instanceof nq70) {
            int i = ((nq70) pq70Var).f23947a;
            Q();
            nr70 nr70Var = this.I.f37900a;
            nr70Var.b.f13702a.f(i, "CURRENT_LANGUAGE_ID_KEY");
            p7m0 p7m0Var = nr70Var.f23987a.b;
            do {
                value2 = p7m0Var.getValue();
            } while (!p7m0Var.m(value2, Integer.valueOf(i)));
            return;
        }
        if (pq70Var instanceof kq70) {
            this.y.a(!((hu70) D()).f);
            return;
        }
        if (pq70Var instanceof lq70) {
            this.x.a(!((hu70) D()).g);
            return;
        }
        if (!(pq70Var instanceof iq70)) {
            if (pq70Var instanceof gq70) {
                c4m0 c4m0Var = this.T;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.T = sac.T(new fnq(this.r.b(), new mu70(this, null, (byte) 4), (byte) 4), d5c.S(jiu0.a(this), this.p.f22085a), xu70.h);
                    return;
                }
                return;
            }
            if (pq70Var instanceof dq70) {
                G(new vt70(false));
                this.M.a();
                e3c.n(this.e0);
                e3c.n(this.f0);
                e3c.n(this.X);
                e3c.n(this.Y);
                e3c.n(this.T);
                e3c.n(this.U);
                e3c.n(this.a0);
                e3c.n(this.b0);
                e3c.n(this.c0);
                return;
            }
            if (pq70Var instanceof eq70) {
                G(st70.f32760a);
                return;
            }
            if (pq70Var instanceof hq70) {
                G(new bu70(((hq70) pq70Var).f13472a));
                return;
            }
            if (!(pq70Var instanceof cq70)) {
                if (pq70Var instanceof fq70) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            p7m0 p7m0Var2 = this.i.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var2.m(value, hu70.a((hu70) value, 0, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, null, null, false, 2096895)));
            S();
            return;
        }
        i1w0 i1w0Var = this.o;
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
