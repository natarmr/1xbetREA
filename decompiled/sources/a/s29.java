package a;

import android.javax.sip.message.Response;
import java.util.List;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class s29 extends i3t0 {
    public static final String Y = m19.class.getSimpleName();
    public final kb0 A;
    public final au0 B;
    public final wyu C;
    public final wti D;
    public final erc E;
    public final pyt F;
    public final ytt G;
    public final jut H;
    public final xmt I;
    public final peg0 J;
    public final i1w0 K;
    public final cmt L;
    public final sff0 M;
    public fk80 N;
    public c4m0 O;
    public bby P;
    public bby Q;
    public bby R;
    public bby S;
    public bby T;
    public bby U;
    public bby V;
    public bby W;
    public final qoj0 X;
    public final vzg0 o;
    public final long p;
    public final boolean q;
    public final duj r;
    public final oeg0 s;
    public final s31 t;
    public final cyu u;
    public final s91 v;
    public final mne w;
    public final u58 x;
    public final gg5 y;
    public final nc0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public s29(vzg0 vzg0Var, long j, boolean z, duj dujVar, oeg0 oeg0Var, s31 s31Var, pw70 pw70Var, cyu cyuVar, m1e m1eVar, s91 s91Var, mne mneVar, u58 u58Var, gg5 gg5Var, nc0 nc0Var, kb0 kb0Var, au0 au0Var, wyu wyuVar, wti wtiVar, uyu uyuVar, pru pruVar, bzt bztVar, erc ercVar, kc60 kc60Var, pyt pytVar, ytt yttVar, iqt iqtVar, jut jutVar, xmt xmtVar, peg0 peg0Var, i1w0 i1w0Var, cmt cmtVar, ctf0 ctf0Var, dmt dmtVar) {
        oeg0Var.getClass();
        pw70Var.getClass();
        m1eVar.getClass();
        s91Var.getClass();
        wyuVar.getClass();
        ctf0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new b29((byte) 0, j, pruVar, vzg0Var, iqtVar, dmtVar, bztVar), g090VarP, new ep4(ctf0Var, (byte) 10), (yzn0) null);
        this.o = vzg0Var;
        this.p = j;
        this.q = z;
        this.r = dujVar;
        this.s = oeg0Var;
        this.t = s31Var;
        this.u = cyuVar;
        this.v = s91Var;
        this.w = mneVar;
        this.x = u58Var;
        this.y = gg5Var;
        this.z = nc0Var;
        this.A = kb0Var;
        this.B = au0Var;
        this.C = wyuVar;
        this.D = wtiVar;
        this.E = ercVar;
        this.F = pytVar;
        this.G = yttVar;
        this.H = jutVar;
        this.I = xmtVar;
        this.J = peg0Var;
        this.K = i1w0Var;
        this.L = cmtVar;
        this.M = pruVar.a();
        qoj0 qoj0VarB = roj0.b(0, 0, null, 7);
        this.X = qoj0VarB;
        dvj dvjVar = mneVar.b;
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        byte b = 4;
        i3t0.F(this, kb0Var, null, new c29(this, (byte) 0), new im8(b), 117);
        emq0[] emq0VarArr = emq0.f8061a;
        sac.T(new fnq(sj3.S(qoj0VarB, 200L), new h29(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), dvjVar), q29.h);
        byte b2 = 3;
        sac.T(new fnq(dtb.z(m1eVar.b(), 1), new k29(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), dvjVar), o29.h);
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new h29(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), dvjVar), p29.h);
        sac.T(new fnq(dtb.z(uyuVar.f36509a.h(), 1), new i29(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), dvjVar), r29.h);
        P(true, true);
    }

    public final List M() {
        return q3d.j(this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, null);
    }

    public final void N() {
        lr lrVar;
        Object value;
        byte b;
        byte b2;
        yje yjeVar;
        if (this.M.O0) {
            lrVar = new lr(this.F.b(mvc.CMS_CODE_CASINO_BRAND), (byte) 27);
        } else {
            lrVar = new lr(this.I.a(nw80.v.getId()), (byte) 28);
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            b = 1;
            b2 = 0;
            yjeVar = null;
        } while (!p7m0Var.m(value, ay3.M((x19) value, true, false, null, 26)));
        sac.T(new fnq(u1c.J(lrVar), new h29(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), this.w.b), new h29(this, yjeVar, b));
    }

    public final void O() {
        c4m0 c4m0Var = this.O;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        fk80 fk80Var = this.N;
        if (fk80Var != null) {
            fk80Var.d();
        }
        String strB = r7x.B(((x19) D()).g);
        String str = ((x19) D()).f40110a.c;
        boolean z = this.M.b.f13233a.k;
        boolean z2 = !h97.A(this.C, uaq0.f35345a);
        th1 th1Var = ((x19) D()).c.e;
        k06 k06VarA = this.H.a(0L, strB, str, z, z2, th1Var == th1.BRAND_S_EXTENDED || th1Var == th1.BRAND_M || th1Var == th1.BRAND_M_EXTENDED);
        bvc bvcVarA = jiu0.a(this);
        mne mneVar = this.w;
        fk80 fk80Var2 = new fk80(k06VarA, bvcVarA, mneVar.b);
        this.O = sac.T(new fnq(dtb.z(fk80Var2.g, 1), new c48(2, this, s29.class, "onPagingStateChange", "onPagingStateChange(Lorg/xplatform/aggregator/core/paging/presentation/PagingLoadState;)V", 4, (byte) 4), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new h29(this, yjeVar, (byte) 2));
        this.N = fk80Var2;
    }

    public final void P(boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = z || ((x19) D()).b.d == null || ((x19) D()).b.c;
        if (!z2 && !((x19) D()).c.c) {
            z3 = false;
        }
        if (z4 && z3) {
            H(new im8((byte) 3));
            N();
            O();
        } else {
            if (z4) {
                N();
            }
            if (z3) {
                O();
            }
        }
    }

    public final void Q(s5d0 s5d0Var) {
        long j = Long.parseLong(s5d0Var.f31650a);
        String str = s5d0Var.d;
        String str2 = s5d0Var.i;
        if (str2 == null) {
            str2 = "";
        }
        this.v.c(new AggregatorScreenModel(null, null, 0L, new xl1(8122, 0L, j, str, str2, s5d0Var.g, s5d0Var.f, this.M.b.f13233a.k || s5d0Var.e == gz8.b, false), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        y09 y09Var = (y09) obj;
        y09Var.getClass();
        super.x(y09Var);
        if (y09Var.equals(f09.f8706a)) {
            E();
            return;
        }
        boolean zEquals = y09Var.equals(h09.f12222a);
        byte b = 2;
        erc ercVar = this.E;
        byte b2 = 1;
        byte b3 = 0;
        yje yjeVar = null;
        mne mneVar = this.w;
        if (zEquals) {
            if (((x19) D()).i <= 0) {
                ercVar.a(true);
                return;
            } else {
                ercVar.a(false);
                sac.V(jiu0.a(this), n29.f22787a, null, mneVar.b, new k29(this, yjeVar, b), 10);
                return;
            }
        }
        if (y09Var.equals(g09.f10447a)) {
            ercVar.a(false);
            return;
        }
        if (y09Var.equals(i09.f13938a)) {
            this.P = bww.R(jiu0.a(this), this.P, M(), mneVar.b, null, null, new i29(this, yjeVar, b3), 56);
            return;
        }
        if (y09Var.equals(p09.f26137a)) {
            i3t0.A(this, this.A, eb0.f7494a, mneVar.b, null, 4);
            return;
        }
        if (y09Var.equals(w09.f38339a)) {
            this.Q = bww.R(jiu0.a(this), this.Q, M(), mneVar.b, null, null, new i29(this, yjeVar, b2), 56);
            return;
        }
        if (y09Var.equals(j09.f15672a)) {
            this.R = bww.R(jiu0.a(this), this.R, M(), mneVar.b, null, null, new i29(this, yjeVar, b), 56);
            return;
        }
        byte b4 = 3;
        if (y09Var.equals(u09.f34844a)) {
            this.S = bww.R(jiu0.a(this), this.S, M(), mneVar.b, null, null, new i29(this, yjeVar, b4), 56);
            return;
        }
        if (y09Var.equals(o09.f24410a)) {
            this.T = bww.R(jiu0.a(this), this.T, M(), mneVar.b, j29.f15770a, null, new k29(this, yjeVar, b3), 40);
            return;
        }
        if (y09Var.equals(q09.f27885a)) {
            this.U = bww.R(jiu0.a(this), this.U, M(), mneVar.b, l29.f19296a, null, new k29(this, yjeVar, b2), 40);
            return;
        }
        boolean zEquals2 = y09Var.equals(s09.f31401a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals2) {
            this.t.g(wgh0.AGGREGATOR_BRANDS);
            this.u.C("providers_page");
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, ay3.N((x19) value, true, null, null, 6)));
            return;
        }
        if (y09Var instanceof t09) {
            sac.V(jiu0.a(this), m29.f21045a, null, mneVar.f22085a, new d09(this, ((t09) y09Var).f33108a, yjeVar, b4), 10);
            return;
        }
        if (y09Var.equals(n09.f22690a)) {
            fk80 fk80Var = this.N;
            if (fk80Var != null) {
                fk80Var.a(false);
                return;
            }
            return;
        }
        if (y09Var instanceof k09) {
            this.V = bww.R(jiu0.a(this), this.V, M(), mneVar.f22085a, null, null, new bh0(this, ((k09) y09Var).f17453a, yjeVar, (byte) 5), 56);
            return;
        }
        if (y09Var instanceof l09) {
            this.W = bww.R(jiu0.a(this), this.W, M(), mneVar.f22085a, null, null, new yp6(this, ((l09) y09Var).f19187a, yjeVar, (byte) 18), 56);
            return;
        }
        if (!(y09Var instanceof v09)) {
            if (y09Var.equals(r09.f29620a)) {
                P(false, true);
                return;
            }
            boolean zEquals3 = y09Var.equals(x09.f40061a);
            q19 q19Var = q19.f27941a;
            if (zEquals3) {
                G(q19Var);
                return;
            } else if (y09Var.equals(m09.f20942a)) {
                G(q19Var);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        uzb0 uzb0Var = ((v09) y09Var).f36570a;
        this.o.e("SORT_TYPE_KEY", uzb0Var);
        if (((x19) D()).g != uzb0Var) {
            String strA = r7x.A(uzb0Var);
            u58 u58Var = this.x;
            u58Var.getClass();
            i8i.D("option", strA, u58Var.f35083a, "provbrand_sort");
            String strA2 = r7x.A(uzb0Var);
            au0 au0Var = this.B;
            au0Var.getClass();
            au0Var.f1455a.a(cui0.b(new j1p(strA2, (byte) 0)), 10956L);
            b2 = ((x19) D()).g == uzb0Var ? (byte) 0 : (byte) 1;
            p7m0 p7m0Var2 = ocjVar.f25029a;
            while (true) {
                Object value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
                uzb0 uzb0Var2 = uzb0Var;
                if (p7m0Var2.m(value2, x19.a((x19) value2, null, null, null, false, null, uzb0Var2, 447))) {
                    break;
                } else {
                    uzb0Var = uzb0Var2;
                }
            }
            if (b2 != 0) {
                O();
            }
        }
    }
}
