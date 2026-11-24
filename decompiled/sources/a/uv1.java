package a;

import android.javax.sip.message.Response;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class uv1 extends i3t0 {
    public static final /* synthetic */ int X = 0;
    public final ctf0 A;
    public final long B;
    public final String C;
    public final kb0 D;
    public final ieu E;
    public final qu F;
    public final u58 G;
    public final ix0 H;
    public final zr1 I;
    public final m0u J;
    public final eyg0 K;
    public final mne L;
    public final r2v M;
    public final cmt N;
    public c4m0 O;
    public bby P;
    public c4m0 Q;
    public bby R;
    public final c4m0 S;
    public c4m0 T;
    public bby U;
    public bby V;
    public fk80 W;
    public final wdu o;
    public final m1e p;
    public final zpu q;
    public final duj r;
    public final pw70 s;
    public final xr t;
    public final ali u;
    public final soc v;
    public final s91 w;
    public final gto0 x;
    public final ytt y;
    public final oeg0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public uv1(wdu wduVar, m1e m1eVar, zpu zpuVar, duj dujVar, pw70 pw70Var, xr xrVar, ali aliVar, soc socVar, s91 s91Var, kc60 kc60Var, gto0 gto0Var, ytt yttVar, oeg0 oeg0Var, ctf0 ctf0Var, final iqt iqtVar, final long j, final String str, final s9s0 s9s0Var, final boolean z, kb0 kb0Var, ieu ieuVar, qu quVar, u58 u58Var, ix0 ix0Var, zr1 zr1Var, m0u m0uVar, eyg0 eyg0Var, mne mneVar, r2v r2vVar, wiu wiuVar, final pru pruVar, final bzt bztVar, cmt cmtVar) {
        m1eVar.getClass();
        pw70Var.getClass();
        s91Var.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new Function0() { // from class: a.hv1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object next;
                sff0 sff0VarA = pruVar.a();
                v8d v8dVarA = bztVar.f3488a.a();
                hl1 hl1Var = sff0VarA.b;
                mum0 mum0Var = sff0VarA.g;
                bv1.c.getClass();
                Iterator it = bv1.g.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((bv1) next).b != s9s0Var);
                bv1 bv1Var = (bv1) next;
                if (bv1Var == null) {
                    bv1Var = bv1.DESCRIPTION;
                }
                bv1 bv1Var2 = bv1Var;
                pek0 pek0Var = qu1.b;
                String str2 = hl1Var.y.f39865a;
                pek0Var.getClass();
                for (Object obj2 : qu1.e) {
                    if (((qu1) obj2).f29327a.equalsIgnoreCase(str2)) {
                        obj = obj2;
                        break;
                    }
                }
                qu1 qu1Var = (qu1) obj;
                if (qu1Var == null) {
                    qu1Var = qu1.FIXED;
                }
                qu1 qu1Var2 = qu1Var;
                boolean zA = iqtVar.f15225a.a();
                zvh0 zvh0Var = mum0Var.x;
                int i = v8dVarA.r;
                boolean z2 = hl1Var.f13233a.f8987a;
                String str3 = hl1Var.v.f33940a;
                ot0 ot0Var = hl1Var.l;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                iun iunVar = iun.f15405a;
                xun xunVar = xun.f41520a;
                long j2 = j;
                String str4 = str;
                ct1 ct1Var = ct1.f4914a;
                return new yu1(j2, str4, bv1Var2, qu1Var2, zA, null, zvh0Var, ct1Var, ct1Var, ct1Var, ct1Var, i, z2, str3, ot0Var, null, lunVar, false, z, false, "", iunVar, lunVar, xunVar, xunVar);
            }
        }, g090VarP, new df1(ctf0Var, wiuVar, (byte) 7), (yzn0) null);
        this.o = wduVar;
        this.p = m1eVar;
        this.q = zpuVar;
        this.r = dujVar;
        this.s = pw70Var;
        this.t = xrVar;
        this.u = aliVar;
        this.v = socVar;
        this.w = s91Var;
        this.x = gto0Var;
        this.y = yttVar;
        this.z = oeg0Var;
        this.A = ctf0Var;
        this.B = j;
        this.C = str;
        this.D = kb0Var;
        this.E = ieuVar;
        this.F = quVar;
        this.G = u58Var;
        this.H = ix0Var;
        this.I = zr1Var;
        this.J = m0uVar;
        this.K = eyg0Var;
        this.L = mneVar;
        this.M = r2vVar;
        this.N = cmtVar;
        dvj dvjVar = mneVar.b;
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        i3t0.F(this, kb0Var, null, new iv1(this, (byte) 3), new xg1((byte) 14), 117);
        c4m0 c4m0Var = this.S;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        byte b = 1;
        this.S = sac.T(new fnq(dtb.z(new fnq(kc60Var.a(), new rv1(this, yjeVar, (byte) 2), (byte) 4), 1), new pv1(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), dvjVar), tv1.h);
        sac.V(jiu0.a(this), new dj1((byte) 9), null, dvjVar, new qv1(this, yjeVar, b), 10);
        R(true);
    }

    public final String M(long j, bv1 bv1Var) {
        String str;
        String str2;
        Iterator it = ((yu1) D()).q.entrySet().iterator();
        int i = 0;
        while (true) {
            str = null;
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                q3d.p();
                throw null;
            }
            if (((Number) ((Map.Entry) next).getKey()).longValue() == j) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i + 1);
        int iOrdinal = bv1Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                str = "tournament_game";
            } else if (iOrdinal != 2 && iOrdinal != 3) {
                t9f.b();
                return null;
            }
            str2 = str;
        } else {
            str2 = "tournament";
        }
        return this.K.k(new lu0(0L, numValueOf, str2, kotlin.collections.a.c(new g3z(this.B, "tournament"))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(gu1 gu1Var, zje zjeVar) {
        kv1 kv1Var;
        if (zjeVar instanceof kv1) {
            kv1Var = (kv1) zjeVar;
            int i = kv1Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                kv1Var.l = i - Integer.MIN_VALUE;
            } else {
                kv1Var = new kv1(this, zjeVar);
            }
        } else {
            kv1Var = new kv1(this, zjeVar);
        }
        Object objC = kv1Var.j;
        wne wneVar = wne.f39444a;
        int i2 = kv1Var.l;
        if (i2 == 0) {
            z1x.P(objC);
            long j = gu1Var.e.c;
            kv1Var.i = gu1Var;
            kv1Var.l = 1;
            objC = this.J.f20973a.c(j, kv1Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gu1Var = kv1Var.i;
            z1x.P(objC);
        }
        H(new sr1(gu1Var, ((xuf) objC).f));
        V();
        S();
        return Unit.f46060a;
    }

    public final void O(mlr mlrVar, bv1 bv1Var) {
        bby bbyVar = this.U;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.U = sac.V(jiu0.a(this), new ln1(1, this, uv1.class, "onHandleError", "onHandleError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, this.L.b, new y51(this, mlrVar, bv1Var, (yje) null), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object P(zje zjeVar) {
        mv1 mv1Var;
        Object value;
        if (zjeVar instanceof mv1) {
            mv1Var = (mv1) zjeVar;
            int i = mv1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mv1Var.k = i - Integer.MIN_VALUE;
            } else {
                mv1Var = new mv1(this, zjeVar);
            }
        } else {
            mv1Var = new mv1(this, zjeVar);
        }
        Object obj = mv1Var.i;
        wne wneVar = wne.f39444a;
        int i2 = mv1Var.k;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(obj);
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, yu1.a((yu1) value, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 33030143)));
            aue0 aue0Var = aue0.d;
            mv1Var.k = 1;
            if (this.y.a(aue0Var, mv1Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        this.z.c().d(new iv1(this, b));
        return Unit.f46060a;
    }

    public final void Q() {
        gu1 gu1Var;
        Object value;
        bby bbyVar = this.V;
        if ((bbyVar == null || !bbyVar.isActive()) && (gu1Var = ((yu1) D()).p) != null) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, yu1.a((yu1) value, null, false, null, null, null, null, null, null, null, false, false, true, null, null, null, null, null, 33030143)));
            this.V = sac.V(jiu0.a(this), new iv1(this, (byte) 4), null, this.L.b, new oa(this, gu1Var, null, (byte) 9), 10);
        }
    }

    public final void R(boolean z) {
        bby bbyVar = this.P;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.R;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        c4m0 c4m0Var = this.Q;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        fk80 fk80Var = this.W;
        if (fk80Var != null) {
            fk80Var.d();
        }
        this.P = sac.V(jiu0.a(this), new ln1(1, this, uv1.class, "onHandleContentError", "onHandleContentError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, this.L.b, new g21(z, this, null), 10);
    }

    public final void S() {
        Object value;
        int iOrdinal = ((yu1) D()).c.ordinal();
        byte b = 0;
        mne mneVar = this.L;
        yje yjeVar = null;
        if (iOrdinal != 1) {
            if (iOrdinal == 3 && (((yu1) D()).k instanceof ct1)) {
                bby bbyVar = this.R;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.R = sac.V(jiu0.a(this), new iv1(this, b), null, mneVar.b, new qv1(this, yjeVar, b), 10);
                return;
            }
            return;
        }
        if (((yu1) D()).i instanceof ct1) {
            c4m0 c4m0Var = this.Q;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            fk80 fk80Var = this.W;
            if (fk80Var != null) {
                fk80Var.d();
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, yu1.a((yu1) value, null, false, null, null, ct1.f4914a, null, null, null, null, false, false, false, null, null, null, null, null, 33554175)));
            gu1 gu1Var = ((yu1) D()).p;
            Long lP = gu1Var != null ? ny9.P(gu1Var) : null;
            ieu ieuVar = this.E;
            ieuVar.getClass();
            fk80 fk80Var2 = new fk80(new k06(new x860(16, false), new p2v(ieuVar, this.B, lP, null)), jiu0.a(this), mneVar.b);
            this.Q = sac.T(new fnq(new fnq(fk80Var2.g, new pd(2, yjeVar, (byte) 8), (byte) 1), new i8(2, this, uv1.class, "handleGamesPagingState", "handleGamesPagingState(Lorg/xplatform/aggregator/core/paging/presentation/PagingLoadState;)V", 4, (byte) 18), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new rv1(this, yjeVar, b));
            this.W = fk80Var2;
        }
    }

    public final void T(Throwable th) {
        this.r.b(th, new xg1((byte) 13));
    }

    public final void U(String str) {
        ctf0 ctf0Var = this.A;
        String strA = ctf0Var.b.a(R.string.tournamenet_dialor_title, Arrays.copyOf(new Object[0], 0));
        if (str.length() == 0) {
            str = ctf0Var.b.a(R.string.unknown_service_error, Arrays.copyOf(new Object[0], 0));
        }
        String strA2 = ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0));
        n12 n12Var = n12.f22727a;
        G(new uu1(strA, str, strA2));
    }

    public final void V() {
        Object value;
        if (((yu1) D()).s && ((yu1) D()).c == bv1.GAMES) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, yu1.a((yu1) value, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 33292287)));
            sac.V(jiu0.a(this), new ln1(1, this, uv1.class, "onHandleError", "onHandleError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, this.L.b, new qv1(this, null, (byte) 2), 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        char c;
        String str;
        v7s0 v7s0Var;
        Object value2;
        ts1 ts1Var = (ts1) obj;
        ts1Var.getClass();
        super.x(ts1Var);
        boolean z = ts1Var instanceof cs1;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            cs1 cs1Var = (cs1) ts1Var;
            if (cs1Var.equals(as1.f1370a)) {
                E();
                return;
            }
            if (!cs1Var.equals(bs1.f3105a)) {
                t9f.b();
                return;
            }
            if (((yu1) D()).r) {
                return;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, yu1.a((yu1) value2, null, false, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, 33423359)));
            R(false);
            return;
        }
        if (!(ts1Var instanceof ss1)) {
            t9f.b();
            return;
        }
        ss1 ss1Var = (ss1) ts1Var;
        if (ss1Var.equals(es1.f8307a)) {
            G(tu1.f34530a);
            return;
        }
        ds1 ds1Var = ds1.f6589a;
        boolean zEquals = ss1Var.equals(ds1Var);
        js1 js1Var = js1.f17028a;
        rs1 rs1Var = rs1.f31012a;
        ns1 ns1Var = ns1.f24032a;
        mne mneVar = this.L;
        if (zEquals || ss1Var.equals(ns1Var) || ss1Var.equals(rs1Var) || ss1Var.equals(js1Var)) {
            if (ss1Var.equals(ds1Var)) {
                i3t0.A(this, this.D, new cb0("AggregatorTournamentsFullInfoFragment", "AGGREGATOR_TOURNAMENTS_FULL_INFO"), null, null, 6);
                return;
            }
            if (ss1Var.equals(ns1Var) || ss1Var.equals(js1Var)) {
                i3t0.A(this, this.D, eb0.f7494a, mneVar.b, null, 4);
                return;
            } else {
                if (ss1Var.equals(rs1Var)) {
                    i3t0.A(this, this.D, new db0("AggregatorTournamentsFullInfoFragment", k7k.UNKNOWN, this.N.g()), mneVar.b, null, 4);
                    return;
                }
                return;
            }
        }
        boolean z2 = ss1Var instanceof qs1;
        byte b = 0;
        byte b2 = 2;
        long j = this.B;
        zr1 zr1Var = this.I;
        qu quVar = this.F;
        Object obj2 = null;
        Object[] objArr = 0;
        boolean z3 = true;
        if (!z2) {
            if (ss1Var.equals(os1.f25762a)) {
                R(true);
                return;
            }
            boolean zEquals2 = ss1Var.equals(fs1.f10043a);
            ctf0 ctf0Var = this.A;
            if (zEquals2) {
                gu1 gu1Var = ((yu1) D()).p;
                if (gu1Var == null) {
                    return;
                }
                switch (gu1Var.n.ordinal()) {
                    case 0:
                        Q();
                        break;
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                        break;
                    case 3:
                        lsm0 lsm0Var = ctf0Var.b;
                        lsm0 lsm0Var2 = ctf0Var.b;
                        String strA = lsm0Var.a(R.string.tournamenet_dialor_title, Arrays.copyOf(new Object[0], 0));
                        String strA2 = lsm0Var2.a(R.string.tournamenet_blocked_error, Arrays.copyOf(new Object[0], 0));
                        String strA3 = lsm0Var2.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0));
                        n12 n12Var = n12.f22727a;
                        G(new uu1(strA, strA2, strA3));
                        break;
                    case 5:
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value = p7m0Var2.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var2.m(value, yu1.a((yu1) value, bv1.GAMES, false, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 33292283)));
                        V();
                        S();
                        break;
                    case 6:
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        while (true) {
                            Object value3 = p7m0Var3.getValue();
                            value3.getClass();
                            oyg0Var.getClass();
                            boolean z4 = z3;
                            if (p7m0Var3.m(value3, yu1.a((yu1) value3, bv1.GAMES, false, null, null, null, null, null, null, null, false, z4, false, null, null, null, null, null, 33292283))) {
                                V();
                                S();
                            } else {
                                z3 = z4;
                            }
                            break;
                        }
                        break;
                    default:
                        t9f.b();
                        break;
                }
                return;
            }
            if (ss1Var instanceof is1) {
                is1 is1Var = (is1) ss1Var;
                mlr mlrVar = (mlr) ((yu1) D()).q.get(Long.valueOf(is1Var.f15283a));
                if (mlrVar != null) {
                    O(mlrVar, is1Var.b);
                    return;
                }
                return;
            }
            if (ss1Var instanceof hs1) {
                hs1 hs1Var = (hs1) ss1Var;
                sac.V(jiu0.a(this), new iv1(this, b2), null, mneVar.b, new lv1(this, hs1Var.f13558a, hs1Var.b, hs1Var.c, null, (byte) 0), 10);
                return;
            }
            boolean zEquals3 = ss1Var.equals(ms1.f22298a);
            String strA4 = this.C;
            s91 s91Var = this.w;
            if (zEquals3) {
                s91Var.c(new AggregatorScreenModel(null, null, 0L, new rm1(j, strA4), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                return;
            }
            if (ss1Var.equals(ls1.f20557a)) {
                h97.x("tournament_id", Long.valueOf(j), quVar.f29324a, "tournament_all_prize_call");
                h97.r(j, zr1Var.f44833a, 10570L);
                gu1 gu1Var2 = ((yu1) D()).p;
                if (gu1Var2 != null) {
                    strA4 = gu1Var2.f.e;
                }
                if (strA4.length() == 0) {
                    strA4 = ctf0Var.b.a(R.string.stocks_prizes, Arrays.copyOf(new Object[0], 0));
                }
                s91Var.c(new AggregatorScreenModel(null, null, 0L, new nm1(j, strA4), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                return;
            }
            if (ss1Var.equals(ps1.f27492a)) {
                s91Var.c(new AggregatorScreenModel(null, null, 0L, new pm1(j, strA4), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                return;
            }
            if (!(ss1Var instanceof gs1)) {
                if (!ss1Var.equals(ks1.f18792a)) {
                    t9f.b();
                    return;
                }
                fk80 fk80Var = this.W;
                if (fk80Var != null) {
                    fk80Var.a(false);
                    return;
                }
                return;
            }
            gs1 gs1Var = (gs1) ss1Var;
            yr1 yr1Var = gs1Var.f11806a;
            boolean z5 = gs1Var.b;
            H(new jv1(z5, yr1Var, b));
            if (yr1Var.equals(xr1.f41347a)) {
                return;
            }
            if (!(yr1Var instanceof wr1)) {
                t9f.b();
                return;
            }
            long j2 = ((wr1) yr1Var).f39617a;
            quVar.f29324a.a("tournament_rules_stage_call", xp20.f(new Pair("tournament_id", Long.valueOf(j)), new Pair("action", z5 ? "show" : "hide"), new Pair("option", Long.valueOf(j2))));
            zr1Var.f44833a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new i1p((byte) 0, j2), new j1p(z5 ? "show" : "hide", (byte) 0)}), 10569L);
            if (!z5 || ((yu1) D()).w.containsKey(Long.valueOf(j2))) {
                return;
            }
            sac.V(jiu0.a(this), new ln1(1, this, uv1.class, "onHandleError", "onHandleError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, mneVar.b, new ey((Object) this, j2, (yje) (objArr == true ? 1 : 0), (byte) 3), 10);
            return;
        }
        int i = ((qs1) ss1Var).f29236a;
        qek0 qek0Var = bv1.c;
        bv1 bv1Var = ((yu1) D()).c;
        qek0Var.getClass();
        bv1Var.getClass();
        Iterator it = bv1.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                c = 1;
                break;
            }
            Object next = it.next();
            c = 1;
            if (((bv1) next).f3260a == i) {
                obj2 = next;
                break;
            }
        }
        bv1 bv1Var2 = (bv1) obj2;
        if (bv1Var2 != null) {
            bv1Var = bv1Var2;
        }
        if (bv1Var == ((yu1) D()).c) {
            return;
        }
        s9s0 s9s0Var = bv1Var.b;
        quVar.getClass();
        int iOrdinal = s9s0Var.ordinal();
        if (iOrdinal == 0) {
            str = "description";
        } else if (iOrdinal == 1) {
            str = "games";
        } else if (iOrdinal == 2) {
            str = "result";
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return;
            }
            str = "rules";
        }
        quVar.f29324a.a("tournament_menu_call", xp20.f(new Pair("tournament_id", Long.valueOf(j)), new Pair("point", str)));
        int iOrdinal2 = bv1Var.ordinal();
        if (iOrdinal2 == 0) {
            v7s0Var = v7s0.DESCRIPTION;
        } else if (iOrdinal2 == 1) {
            v7s0Var = v7s0.GAMES;
        } else if (iOrdinal2 == 2) {
            v7s0Var = v7s0.RESULT;
        } else {
            if (iOrdinal2 != 3) {
                t9f.b();
                return;
            }
            v7s0Var = v7s0.RULES;
        }
        zr1Var.getClass();
        s1p s1pVar = zr1Var.f44833a;
        i1p i1pVar = new i1p((byte) 2, j);
        j1p j1pVar = new j1p(v7s0Var.f36945a, (byte) 0);
        k1p[] k1pVarArr = new k1p[2];
        k1pVarArr[0] = i1pVar;
        k1pVarArr[c] = j1pVar;
        s1pVar.a(tx3.l0(k1pVarArr), 10568L);
        p7m0 p7m0Var4 = ocjVar.f25029a;
        while (true) {
            Object value4 = p7m0Var4.getValue();
            value4.getClass();
            oyg0Var.getClass();
            bv1 bv1Var3 = bv1Var;
            if (p7m0Var4.m(value4, yu1.a((yu1) value4, bv1Var3, false, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 33554427))) {
                S();
                return;
            }
            bv1Var = bv1Var3;
        }
    }
}
