package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ty8 extends i3t0 {
    public static final String X = uw8.class.getSimpleName();
    public final ix0 A;
    public final xr B;
    public final ytt C;
    public final kd30 D;
    public final ali E;
    public final soc F;
    public final eyg0 G;
    public final dgu H;
    public final hut I;
    public final gut J;
    public final wsf0 K;
    public final cmt L;
    public c4m0 M;
    public fk80 N;
    public bby O;
    public bby P;
    public bby Q;
    public bby R;
    public bby S;
    public bby T;
    public bby U;
    public bby V;
    public final qoj0 W;
    public final vzg0 o;
    public final uc0 p;
    public final duj q;
    public final oeg0 r;
    public final ctf0 s;
    public final pw70 t;
    public final s91 u;
    public final mne v;
    public final u58 w;
    public final peg0 x;
    public final kb0 y;
    public final au0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty8(vzg0 vzg0Var, uc0 uc0Var, duj dujVar, oeg0 oeg0Var, ctf0 ctf0Var, pw70 pw70Var, m1e m1eVar, s91 s91Var, mne mneVar, u58 u58Var, peg0 peg0Var, kb0 kb0Var, au0 au0Var, ix0 ix0Var, bzt bztVar, pru pruVar, kc60 kc60Var, xr xrVar, ytt yttVar, kd30 kd30Var, ali aliVar, iqt iqtVar, soc socVar, eyg0 eyg0Var, dgu dguVar, dmt dmtVar, hut hutVar, gut gutVar, wsf0 wsf0Var, cmt cmtVar) {
        super(new pg1(uc0Var, ctf0Var, pruVar, vzg0Var, iqtVar, bztVar, dmtVar), cvm0.p(mneVar.c, mneVar.f22085a), new ep4(ctf0Var, (byte) 7), (yzn0) null);
        oeg0Var.getClass();
        ctf0Var.getClass();
        pw70Var.getClass();
        m1eVar.getClass();
        s91Var.getClass();
        yje yjeVar = null;
        this.o = vzg0Var;
        this.p = uc0Var;
        this.q = dujVar;
        this.r = oeg0Var;
        this.s = ctf0Var;
        this.t = pw70Var;
        this.u = s91Var;
        this.v = mneVar;
        this.w = u58Var;
        this.x = peg0Var;
        this.y = kb0Var;
        this.z = au0Var;
        this.A = ix0Var;
        this.B = xrVar;
        this.C = yttVar;
        this.D = kd30Var;
        this.E = aliVar;
        this.F = socVar;
        this.G = eyg0Var;
        this.H = dguVar;
        this.I = hutVar;
        this.J = gutVar;
        this.K = wsf0Var;
        this.L = cmtVar;
        qoj0 qoj0VarB = roj0.b(0, 0, null, 7);
        this.W = qoj0VarB;
        byte b = 1;
        boolean z = !((LinkedHashMap) vzg0Var.b.f38604a).containsKey("IS_INITIAL_CALL_KEY");
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        byte b2 = 2;
        sac.V(bvcVarA, null, new vb8((Object) this, (byte) 10), dvjVar, new xj1(b2, yjeVar, this, z), 9);
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        i3t0.F(this, kb0Var, null, new gy8(this, b), new im8(b), 117);
        byte b3 = 4;
        sac.T(new fnq(dtb.z(new fnq(kc60Var.a(), new hy8(this, yjeVar, b2), (byte) 4), 1), new hy8(this, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), dvjVar), qy8.h);
        sac.T(new fnq(dtb.z(m1eVar.b(), 1), new jy8(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), dvjVar), py8.h);
        emq0[] emq0VarArr = emq0.f8061a;
        sac.T(new fnq(sj3.S(qoj0VarB, 200L), new hy8(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), dvjVar), ry8.h);
        vzg0Var.e("IS_INITIAL_CALL_KEY", Boolean.FALSE);
    }

    public final List M() {
        return q3d.j(this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V);
    }

    public final boolean N() {
        return this.p.b == 126;
    }

    public final void O() {
        Object value;
        yx8 yx8Var;
        byte b;
        c4m0 c4m0Var = this.M;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        fk80 fk80Var = this.N;
        if (fk80Var != null) {
            fk80Var.d();
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            yx8Var = (yx8) value;
            this.f.getClass();
            b = 1;
        } while (!p7m0Var.m(value, yx8.b(yx8Var, yx8Var.f43408a.f39919a || yx8Var.b.f38188a, 0L, 6)));
        long id = nw80.t.getId();
        List listC = kotlin.collections.a.c(String.valueOf(((yx8) D()).b.c));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (!Intrinsics.d((String) obj, "0")) {
                arrayList.add(obj);
            }
        }
        List listC2 = kotlin.collections.a.c(String.valueOf(this.p.b));
        String str = ((yx8) D()).o;
        String str2 = str == null ? "" : str;
        String str3 = ((yx8) D()).p;
        k06 k06VarO = this.H.o(id, arrayList, listC2, str2, str3 == null ? "" : str3, ((yx8) D()).c.d, false, N() ? 36 : 16);
        bvc bvcVarA = jiu0.a(this);
        mne mneVar = this.v;
        fk80 fk80Var2 = new fk80(k06VarO, bvcVarA, mneVar.b);
        this.M = sac.T(new fnq(dtb.z(fk80Var2.g, 1), new c48(2, this, ty8.class, "onPagingStateChange", "onPagingStateChange(Lorg/xplatform/aggregator/core/paging/presentation/PagingLoadState;)V", 4, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new hy8(this, yjeVar, b));
        this.N = fk80Var2;
    }

    public final String P(int i) {
        Integer numValueOf = Integer.valueOf(i + 1);
        g3z g3zVar = new g3z(this.p.b, "brand");
        g3z g3zVar2 = new g3z(((yx8) D()).b.c, "category");
        if (((yx8) D()).b.c == 0) {
            g3zVar2 = null;
        }
        return this.G.k(new lu0(0L, numValueOf, "provbrand", tx3.z(new g3z[]{g3zVar, g3zVar2, ((yx8) D()).c.d.length() > 0 ? new g3z(0L, "search") : null})));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object obj2;
        Object value2;
        su8 su8Var = (su8) obj;
        su8Var.getClass();
        super.x(su8Var);
        boolean zEquals = su8Var.equals(zt8.f44944a);
        byte b = 0;
        yje yjeVar = null;
        mne mneVar = this.v;
        if (zEquals) {
            this.O = bww.R(jiu0.a(this), this.O, M(), mneVar.b, null, null, new jy8(this, yjeVar, b), 56);
            return;
        }
        boolean zEquals2 = su8Var.equals(lu8.f20661a);
        eb0 eb0Var = eb0.f7494a;
        if (zEquals2) {
            i3t0.A(this, this.y, eb0Var, mneVar.b, null, 4);
            return;
        }
        byte b2 = 1;
        if (su8Var.equals(qu8.f29335a)) {
            this.P = bww.R(jiu0.a(this), this.P, M(), mneVar.b, null, null, new jy8(this, yjeVar, b2), 56);
            return;
        }
        if (su8Var.equals(au8.f1465a)) {
            this.Q = bww.R(jiu0.a(this), this.Q, M(), mneVar.f22085a, null, null, new ky8(this, yjeVar, b), 56);
            return;
        }
        byte b3 = 2;
        if (su8Var.equals(iu8.f15384a)) {
            this.U = bww.R(jiu0.a(this), this.U, M(), mneVar.f22085a, null, null, new ky8(this, yjeVar, b3), 56);
            return;
        }
        boolean zEquals3 = su8Var.equals(ou8.f25865a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals3) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, yx8.c((yx8) value2, true)));
            return;
        }
        if (su8Var instanceof pu8) {
            sac.V(jiu0.a(this), oy8.f26049a, null, mneVar.f22085a, new xw5(this, ((pu8) su8Var).f27602a, yjeVar, (byte) 29), 10);
            return;
        }
        boolean zEquals4 = su8Var.equals(ku8.f18900a);
        u58 u58Var = this.w;
        if (zEquals4) {
            u58Var.f35083a.a("login_page_call", wp20.b(new Pair("screen", "provbrand")));
            this.S = bww.R(jiu0.a(this), this.S, M(), mneVar.b, my8.f22592a, null, new jy8(this, yjeVar, b3), 40);
            return;
        }
        byte b4 = 3;
        if (su8Var.equals(mu8.f22402a)) {
            u58Var.f35083a.a("reg_page_call", wp20.b(new Pair("screen", "provbrand")));
            this.T = bww.R(jiu0.a(this), this.T, M(), mneVar.b, ny8.f24317a, null, new jy8(this, yjeVar, b4), 40);
            return;
        }
        if (su8Var instanceof du8) {
            sac.V(jiu0.a(this), new gy8(this, b), null, mneVar.b, new ly8(this, ((du8) su8Var).f6688a, yjeVar, (byte) 0), 10);
            return;
        }
        if (su8Var instanceof fu8) {
            this.R = bww.R(jiu0.a(this), this.R, M(), mneVar.f22085a, null, null, new ly8(this, ((fu8) su8Var).f10150a, yjeVar, (byte) 1), 56);
            return;
        }
        if (su8Var.equals(ju8.f17140a)) {
            fk80 fk80Var = this.N;
            if (fk80Var != null) {
                fk80Var.a(false);
                return;
            }
            return;
        }
        if (su8Var.equals(nu8.f24137a)) {
            O();
            return;
        }
        boolean z = su8Var instanceof cu8;
        au0 au0Var = this.z;
        if (z) {
            long j = ((cu8) su8Var).f4975a;
            if (((yx8) D()).b.c != j) {
                if (j != 0) {
                    Iterator it = ((yx8) D()).b.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        Object next = it.next();
                        if (((gw80) next).f12015a == j) {
                            obj2 = next;
                            break;
                        }
                    }
                    gw80 gw80Var = (gw80) obj2;
                    String str = gw80Var != null ? gw80Var.b : null;
                    if (str == null) {
                        str = "";
                    }
                    u58Var.getClass();
                    u58Var.f35083a.a("provbrand_prov_chip_on", wp20.b(new Pair("option", str)));
                    au0Var.getClass();
                    b1j.v(str, au0Var.f1455a, 10961L);
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, yx8.b((yx8) value, false, j, 3)));
                this.o.e("SELECTED_PARTITION_KEY", Long.valueOf(((yx8) D()).b.c));
                O();
                return;
            }
            return;
        }
        if (su8Var.equals(bu8.f3219a)) {
            u58Var.f35083a.c("provbrand_info_back");
            au0Var.f1455a.a(xun.f41520a, 10963L);
            return;
        }
        if (su8Var.equals(gu8.f11917a)) {
            i3t0.A(this, this.y, eb0Var, null, null, 6);
            sac.V(jiu0.a(this), sy8.f33014a, null, mneVar.b, new jy8(this, yjeVar, (byte) 5), 10);
            return;
        }
        boolean zEquals5 = su8Var.equals(ru8.f31113a);
        lx8 lx8Var = lx8.f20802a;
        if (zEquals5) {
            G(lx8Var);
            return;
        }
        if (su8Var.equals(hu8.f13667a)) {
            G(lx8Var);
            return;
        }
        if (su8Var.equals(eu8.f8407a)) {
            this.V = bww.R(jiu0.a(this), this.V, M(), mneVar.f22085a, null, null, new ky8(this, yjeVar, b2), 56);
            return;
        }
        if (su8Var.equals(yt8.f43205a)) {
            i3t0.A(this, this.y, za0.f44045a, mneVar.b, null, 4);
            if (N()) {
                sac.V(jiu0.a(this), null, null, mneVar.b, new oa((Object) this, yjeVar, (byte) 28), 11);
                return;
            }
            return;
        }
        if (!(su8Var instanceof xt8)) {
            if (su8Var.equals(wt8.f39728a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        boolean z2 = ((xt8) su8Var).f41452a;
        p7m0 p7m0Var3 = ocjVar.f25029a;
        while (true) {
            Object value3 = p7m0Var3.getValue();
            value3.getClass();
            oyg0Var.getClass();
            boolean z3 = z2;
            if (p7m0Var3.m(value3, yx8.a((yx8) value3, null, null, null, false, null, null, null, null, z3, 786431))) {
                return;
            } else {
                z2 = z3;
            }
        }
    }
}
