package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class d650 extends w46 {
    public static final long j1;
    public static final /* synthetic */ int k1 = 0;
    public final nr A;
    public final trm0 A0;
    public final ouu B;
    public final p7m0 B0;
    public final a6u C;
    public final LinkedHashMap C0;
    public final xex D;
    public bby D0;
    public final zn00 E;
    public bby E0;
    public final pw70 F;
    public bby F0;
    public final nc0 G;
    public bby G0;
    public final s91 H;
    public c4m0 H0;
    public final oeg0 I;
    public bby I0;
    public final u58 J;
    public bby J0;
    public final gg5 K;
    public bby K0;
    public final mne L;
    public bby L0;
    public final ctf0 M;
    public bby M0;
    public final s64 N;
    public bby N0;
    public final cmt O;
    public bby O0;
    public final a6u P;
    public bby P0;
    public final f7u Q;
    public bby Q0;
    public final p4u R;
    public bby R0;
    public final xfu S;
    public bby S0;
    public final lrc T;
    public bby T0;
    public final wgu U;
    public bby U0;
    public final yfu V;
    public bby V0;
    public final erc W;
    public bby W0;
    public final f3j X;
    public bby X0;
    public final m1e Y;
    public bby Y0;
    public final duj Z;
    public bby Z0;
    public final qu a0;
    public final String a1;
    public final s91 b;
    public final ix0 b0;
    public final sff0 b1;
    public final duj c;
    public final vd1 c0;
    public final boolean c1;
    public final v88 d;
    public final ix0 d0;
    public final boolean d1;
    public final iqt e;
    public final ih5 e0;
    public final a550 e1;
    public final s31 f;
    public final gg5 f0;
    public final p7m0 f1;
    public final ih5 g;
    public final rou g0;
    public final p7m0 g1;
    public final oeg0 h;
    public final hsj h0;
    public final ol60 h1;
    public final mne i;
    public final cu i0;
    public final p7m0 i1;
    public final trm0 j;
    public final ytt j0;
    public final ahu k;
    public final yo4 k0;
    public final khf0 l;
    public final pmi l0;
    public final ctf0 m;
    public final x0u m0;
    public final l7k n;
    public final a6u n0;
    public final cyu o;
    public final dgu o0;
    public final dmt p;
    public final f7u p0;
    public final g2v q;
    public final soc q0;
    public final kd30 r;
    public final iqt r0;
    public final cmt s;
    public final ytt s0;
    public long t;
    public final r8i t0;
    public final bm5 u;
    public final eyg0 u0;
    public final p7m0 v;
    public final xfu v0;
    public final List w;
    public final bwl w0;
    public final xmt x;
    public final e41 x0;
    public final pyt y;
    public final s31 y0;
    public final phf0 z;
    public final ahu z0;

    static {
        uen uenVar = wen.b;
        j1 = ibc.v0(15, bfn.SECONDS);
    }

    public d650(kc60 kc60Var, xmt xmtVar, pyt pytVar, phf0 phf0Var, nr nrVar, ouu ouuVar, a6u a6uVar, xex xexVar, zn00 zn00Var, pw70 pw70Var, nc0 nc0Var, s91 s91Var, oeg0 oeg0Var, u58 u58Var, gg5 gg5Var, mne mneVar, ctf0 ctf0Var, s64 s64Var, cmt cmtVar, a6u a6uVar2, f7u f7uVar, p4u p4uVar, xfu xfuVar, lrc lrcVar, wgu wguVar, yfu yfuVar, erc ercVar, f3j f3jVar, m1e m1eVar, duj dujVar, qu quVar, ix0 ix0Var, vd1 vd1Var, ix0 ix0Var2, ih5 ih5Var, gg5 gg5Var2, rou rouVar, hsj hsjVar, cu cuVar, ytt yttVar, yo4 yo4Var, pmi pmiVar, x0u x0uVar, a6u a6uVar3, dgu dguVar, f7u f7uVar2, soc socVar, iqt iqtVar, ytt yttVar2, r8i r8iVar, eyg0 eyg0Var, xfu xfuVar2, bwl bwlVar, e41 e41Var, s31 s31Var, ahu ahuVar, trm0 trm0Var, bzt bztVar, q250 q250Var, s31 s31Var2, ih5 ih5Var2, khf0 khf0Var, v88 v88Var, l7k l7kVar, cyu cyuVar, g2v g2vVar, pru pruVar, b8u b8uVar, dmt dmtVar, kd30 kd30Var) {
        byte b;
        int i;
        pw70Var.getClass();
        s91Var.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        wguVar.getClass();
        m1eVar.getClass();
        List listC = kotlin.collections.a.c(f3jVar);
        s91Var.getClass();
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        listC.getClass();
        s91Var.getClass();
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        this.b = s91Var;
        this.c = dujVar;
        this.d = v88Var;
        this.e = iqtVar;
        this.f = s31Var2;
        this.g = ih5Var2;
        this.h = oeg0Var;
        this.i = mneVar;
        this.j = trm0Var;
        this.k = ahuVar;
        this.l = khf0Var;
        this.m = ctf0Var;
        this.n = l7kVar;
        this.o = cyuVar;
        this.p = dmtVar;
        this.q = g2vVar;
        this.r = kd30Var;
        this.s = cmtVar;
        bm5 bm5Var = bm5.e;
        this.u = bm5Var;
        roj0.b(0, 0, null, 7);
        i99 i99Var = i99.f14377a;
        new LinkedBlockingDeque();
        maz.b(new th50((byte) 24));
        roj0.a(0, Integer.MAX_VALUE, i99.f14377a);
        this.v = q7m0.a(jv5.f17191a);
        yje yjeVar = null;
        roj0.b(0, 0, null, 7);
        sac.T(new fnq(new fnq(b8uVar.a(bm5Var), new ex1((Object) this, yjeVar, (byte) 7)), new cm3(this, yjeVar, (byte) 20), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new vp3(2, dujVar, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 19));
        this.w = listC;
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            ((eiu0) it.next()).u(this, new vzg0());
        }
        gst0 gst0Var = iqtVar.f15225a;
        dvj dvjVar = mneVar.b;
        this.x = xmtVar;
        this.y = pytVar;
        this.z = phf0Var;
        this.A = nrVar;
        this.B = ouuVar;
        this.C = a6uVar;
        this.D = xexVar;
        this.E = zn00Var;
        this.F = pw70Var;
        this.G = nc0Var;
        this.H = s91Var;
        this.I = oeg0Var;
        this.J = u58Var;
        this.K = gg5Var;
        this.L = mneVar;
        this.M = ctf0Var;
        this.N = s64Var;
        this.O = cmtVar;
        this.P = a6uVar2;
        this.Q = f7uVar;
        this.R = p4uVar;
        this.S = xfuVar;
        this.T = lrcVar;
        this.U = wguVar;
        this.V = yfuVar;
        this.W = ercVar;
        this.X = f3jVar;
        this.Y = m1eVar;
        this.Z = dujVar;
        this.a0 = quVar;
        this.b0 = ix0Var;
        this.c0 = vd1Var;
        this.d0 = ix0Var2;
        this.e0 = ih5Var;
        this.f0 = gg5Var2;
        this.g0 = rouVar;
        this.h0 = hsjVar;
        this.i0 = cuVar;
        this.j0 = yttVar;
        this.k0 = yo4Var;
        this.l0 = pmiVar;
        this.m0 = x0uVar;
        this.n0 = a6uVar3;
        this.o0 = dguVar;
        this.p0 = f7uVar2;
        this.q0 = socVar;
        this.r0 = iqtVar;
        this.s0 = yttVar2;
        this.t0 = r8iVar;
        this.u0 = eyg0Var;
        this.v0 = xfuVar2;
        this.w0 = bwlVar;
        this.x0 = e41Var;
        this.y0 = s31Var;
        this.z0 = ahuVar;
        this.A0 = trm0Var;
        this.B0 = q7m0.a(kotlin.collections.a.c(q250Var));
        this.C0 = new LinkedHashMap();
        this.a1 = o450.class.getSimpleName();
        sff0 sff0VarA = pruVar.a();
        this.b1 = sff0VarA;
        hl1 hl1Var = sff0VarA.b;
        boolean z = hl1Var.C;
        this.c1 = z;
        this.d1 = hl1Var.I;
        int iOrdinal = dmtVar.b().ordinal();
        if (iOrdinal == 0) {
            b = 4;
            i = R.style.Widget_DSAccountSelection_Primary;
        } else if (iOrdinal == 1) {
            b = 4;
            i = R.style.Widget_DSAccountSelection_Secondary;
        } else if (iOrdinal == 2) {
            b = 4;
            i = R.style.Widget_DSAccountSelection_Tertiary;
        } else if (iOrdinal != 3) {
            b = 4;
            if (iOrdinal != 4) {
                t9f.b();
                throw null;
            }
            i = 2132018976;
        } else {
            b = 4;
            i = R.style.Widget_DSAccountSelection_Quaternary;
        }
        this.e1 = new a550(i, z ? new jq5() : x2x.n0(hl1Var.f), wb.Q(hl1Var.t), x4d0.g0(hl1Var.l));
        p7m0 p7m0VarA = q7m0.a(gst0Var.a() ? new v7r0(pbj.f26710a) : u7r0.f35200a);
        this.f1 = p7m0VarA;
        p7m0 p7m0VarA2 = q7m0.a(h8x.t(hl1Var.K, hl1Var.J, hl1Var.z, sff0VarA.l.n, hl1Var.f13233a.c, hl1Var.I, gst0Var.a(), z));
        this.g1 = p7m0VarA2;
        this.h1 = new ol60(1, i99.b);
        Integer numValueOf = z ? null : Integer.valueOf(R.string.my_casino);
        String strA = ctf0Var.b.a(numValueOf != null ? numValueOf.intValue() : R.string.my_virtual, Arrays.copyOf(new Object[0], 0));
        c8r0 c8r0VarT = egm0.t((w7r0) p7m0VarA.getValue(), i, new f340(1, this, d650.class, "getBalanceTitle", "getBalanceTitle(Lorg/xplatform/balance/model/BalanceModel;)Ljava/lang/String;", 0, (byte) 17), ctf0Var);
        lak0 lak0Var = lak0.c;
        int i2 = bztVar.f3488a.a().r;
        xuz xuzVar = pb10.c;
        pb10 pb10Var = pb10.g;
        xuzVar.getClass();
        this.i1 = q7m0.a(new b550(strA, c8r0VarT, lak0Var, new mdm(xuz.a(pb10Var, i2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), false));
        w();
        yje yjeVar2 = null;
        sac.T(new fnq(p7m0VarA, new r550(this, yjeVar2, b), b), d5c.S(jiu0.a(this), dvjVar), t550.h);
        sac.T(new fnq(new i89(new dnq(p7m0VarA2, new wx4((Object) this, yjeVar2, (byte) 24), (byte) 2), (byte) 22), new r550(this, yjeVar2, (byte) 7), b), d5c.S(jiu0.a(this), dvjVar), c650.h);
        byte b2 = 6;
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new r550(this, yjeVar2, b2), b), d5c.S(jiu0.a(this), dvjVar), b650.h);
        sac.T(new fnq(m1eVar.b(), new g550(this, yjeVar2, b2), b), d5c.S(jiu0.a(this), dvjVar), a650.h);
    }

    public static long B(x4t x4tVar) {
        if (x4tVar == null) {
            return 0L;
        }
        if (x4tVar instanceof v4t) {
            return 8114L;
        }
        if (x4tVar instanceof p4t) {
            return 8124L;
        }
        if (x4tVar instanceof s4t) {
            return 8116L;
        }
        if (x4tVar instanceof l4t) {
            return 8118L;
        }
        return x4tVar instanceof i4t ? 8119L : 0L;
    }

    public static String C(x4t x4tVar) {
        if (x4tVar instanceof v4t) {
            return "mc_recommended";
        }
        if (x4tVar instanceof p4t) {
            return "mc_favorite";
        }
        if (x4tVar instanceof s4t) {
            return "last_played";
        }
        if (x4tVar instanceof l4t) {
            return "slots_popular";
        }
        if (x4tVar instanceof i4t) {
            return "live_aggregator_popular";
        }
        if (x4tVar instanceof o4t) {
            return "crash_popular";
        }
        return null;
    }

    public static int D(x4t x4tVar) {
        if (x4tVar == null) {
            return 0;
        }
        if (x4tVar instanceof v4t) {
            return 8114;
        }
        if (x4tVar instanceof p4t) {
            return 8124;
        }
        if (x4tVar instanceof s4t) {
            return 8116;
        }
        if (x4tVar instanceof l4t) {
            return 8118;
        }
        return x4tVar instanceof i4t ? 8119 : 0;
    }

    public final mlr A(long j, x4t x4tVar) {
        Object next;
        Iterator it = z(x4tVar).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((mlr) next).f22006a == j) {
                return (mlr) next;
            }
        }
        next = null;
        return (mlr) next;
    }

    public final List E() {
        return q3d.j(this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, this.W0, this.X0, this.Y0, this.Z0);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    public final String F() {
        Object next;
        m2c0 m2c0Var;
        Iterator it = ((Iterable) this.g1.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((ef40) next) instanceof bf40));
        ef40 ef40Var = (ef40) next;
        if (ef40Var != null) {
            vbj vbjVar = ((bf40) ef40Var).f2484a;
            rbj rbjVar = vbjVar instanceof rbj ? (rbj) vbjVar : null;
            if (rbjVar != null) {
                m2c0Var = (m2c0) rbjVar.f30189a;
            } else {
                m2c0Var = null;
            }
        } else {
            m2c0Var = null;
        }
        if (m2c0Var == null) {
            return "";
        }
        String str = m2c0Var.U;
        String strValueOf = str.length() > 0 ? str : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(m2c0Var.S);
        }
        return strValueOf == null ? "" : strValueOf;
    }

    public final void G(Throwable th) {
        this.Z.b(th, new ba30(this, th, (byte) 17));
    }

    public final void H() {
        this.X0 = bww.R(jiu0.a(this), this.X0, E(), this.L.f22085a, null, null, new l550(this, null, (byte) 3), 56);
    }

    public final boolean I(String str) {
        bby bbyVar = (bby) this.C0.get(str);
        return bbyVar != null && bbyVar.isActive();
    }

    public final void J(String str, x4t x4tVar, boolean z) {
        bby bbyVar;
        boolean z2 = x4tVar instanceof p4t;
        byte b = 2;
        byte b2 = 4;
        LinkedHashMap linkedHashMap = this.C0;
        mne mneVar = this.L;
        yje yjeVar = null;
        if (z2) {
            if (I(str)) {
                return;
            }
            this.q0.b();
            linkedHashMap.put(str, sac.T(new fnq(this.P.t(), new r550(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new s550(this, str, yjeVar, b)));
            return;
        }
        byte b3 = 3;
        if (x4tVar instanceof s4t) {
            byte b4 = ((s4t) x4tVar).f31624a;
            if (z && (bbyVar = (bby) linkedHashMap.get(str)) != null) {
                v3c.N(bbyVar);
            }
            if (I(str)) {
                return;
            }
            linkedHashMap.put(str, sac.T(new fnq(this.C.u(new omu0(b4)), new r550(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new s550(this, str, yjeVar, b3)));
            return;
        }
        if (x4tVar instanceof v4t) {
            byte b5 = ((v4t) x4tVar).f36796a;
            if (I(str)) {
                return;
            }
            linkedHashMap.put(str, sac.V(jiu0.a(this), new c550(this, (byte) 9), new d550(this, str, (byte) 6), mneVar.b, new n550(this, b5, yjeVar, b3), 8));
            return;
        }
        byte b6 = 1;
        byte b7 = 7;
        if (x4tVar instanceof l4t) {
            byte b8 = ((l4t) x4tVar).f19425a;
            if (I(str)) {
                return;
            }
            linkedHashMap.put(str, sac.V(jiu0.a(this), new c550(this, b7), new d550(this, str, (byte) 3), mneVar.b, new n550(this, b8, yjeVar, b6), 8));
            return;
        }
        if (x4tVar instanceof i4t) {
            byte b9 = ((i4t) x4tVar).f14161a;
            if (I(str)) {
                return;
            }
            linkedHashMap.put(str, sac.V(jiu0.a(this), new c550(this, (byte) 8), new d550(this, str, (byte) 4), mneVar.b, new n550(this, b9, yjeVar, (byte) 0), 8));
            return;
        }
        if (x4tVar instanceof o4t) {
            byte b10 = ((o4t) x4tVar).f24656a;
            if (I(str)) {
                return;
            }
            linkedHashMap.put(str, sac.V(jiu0.a(this), new c550(this, (byte) 11), new d550(this, str, (byte) 7), mneVar.b, new n550(this, b10, yjeVar, b), 8));
            return;
        }
        byte b11 = 10;
        if (x4tVar instanceof r4t) {
            long j = ((r4t) x4tVar).f29854a;
            if (I(str)) {
                return;
            }
            linkedHashMap.put(str, sac.V(jiu0.a(this), new qi4(this, j, b11), new d550(this, str, (byte) 5), mneVar.b, new o550(this, j, yjeVar, (byte) 0), 8));
            return;
        }
        if (!(x4tVar instanceof u4t)) {
            t9f.b();
            return;
        }
        bby bbyVar2 = this.G0;
        if (bbyVar2 == null || !bbyVar2.isActive()) {
            this.G0 = sac.V(jiu0.a(this), new c550(this, b11), null, mneVar.b, new g550(this, yjeVar, b2), 10);
        }
    }

    public final void K(String str) {
        if (I(str)) {
            return;
        }
        this.C0.put(str, sac.V(jiu0.a(this), new c550(this, (byte) 5), new d550(this, str, (byte) 2), this.L.b, new mt00((Object) this, (yje) null, (byte) 22), 8));
    }

    public final void L(String str) {
        if (I(str)) {
            return;
        }
        this.C0.put(str, sac.V(jiu0.a(this), new c550(this, (byte) 12), new d550(this, str, (byte) 8), this.L.b, new lv((diu0) this, (yje) null, (byte) 11), 8));
    }

    public final void M(String str) {
        if (I(str)) {
            return;
        }
        yje yjeVar = null;
        this.C0.put(str, sac.T(new fnq(this.g1, new p550(this, str, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.L.b), new l550(this, yjeVar, (byte) 7)));
    }

    public final void N(String str) {
        if (I(str)) {
            return;
        }
        yje yjeVar = null;
        this.C0.put(str, sac.T(new fnq(this.g1, new p550(this, str, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), this.L.b), new l550(this, yjeVar, (byte) 8)));
    }

    public final void O(String str) {
        if (I(str)) {
            return;
        }
        this.C0.put(str, sac.V(jiu0.a(this), new c550(this, (byte) 1), new d550(this, str, (byte) 0), this.L.b, new fhq(this, null, (byte) 28), 8));
    }

    public final void P() {
        if (I("GUEST_RECOMMENDED_KEY")) {
            return;
        }
        this.C0.put("GUEST_RECOMMENDED_KEY", sac.V(jiu0.a(this), new c550(this, (byte) 2), new e550(this, (byte) 0), this.L.b, new g550(this, null, (byte) 1), 8));
    }

    public final void Q() {
        if (I("GUEST_RECOMMENDED_KEY")) {
            return;
        }
        this.C0.put("GUEST_RECOMMENDED_KEY", sac.V(jiu0.a(this), new c550(this, (byte) 4), new e550(this, (byte) 1), this.L.b, new g550(this, null, (byte) 2), 8));
    }

    public final void R(String str) {
        if (I(str)) {
            return;
        }
        this.C0.put(str, sac.V(jiu0.a(this), new c550(this, (byte) 3), new d550(this, str, (byte) 1), this.L.b, new eoe(this, null), 8));
    }

    public final void S(String str) {
        if (I(str)) {
            return;
        }
        this.C0.put(str, sac.V(jiu0.a(this), new c550(this, (byte) 13), new d550(this, str, (byte) 9), this.L.b, new g550(this, null, (byte) 3), 8));
    }

    public final void T(String str) {
        if (I(str)) {
            return;
        }
        yje yjeVar = null;
        this.C0.put(str, sac.T(new fnq(this.n0.v(), new p550(this, str, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), this.L.b), new p550(this, str, yjeVar, (byte) 3)));
    }

    public final void U(mlr mlrVar, x4t x4tVar, String str) {
        long jB = B(x4tVar);
        int iD = D(x4tVar);
        long j = mlrVar.f22006a;
        List listZ = x4tVar != null ? z(x4tVar) : null;
        if (listZ == null) {
            listZ = iun.f15405a;
        }
        Iterator it = listZ.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((mlr) it.next()).f22006a == j) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            numValueOf = null;
        }
        Integer numE = numValueOf != null ? kng0.e(1, numValueOf) : null;
        this.b0.a((int) j, iD, numE, "my_aggregator", str);
        this.J.q("my_aggregator", jB, mlrVar.f22006a, numE, str);
    }

    public final void V(String str) {
        wk30 wk30Var;
        if (I(str)) {
            return;
        }
        if (this.b1.O0) {
            wk30Var = new wk30(this.y.b(c9x.O(y())), (byte) 2);
        } else {
            wk30Var = new wk30(this.x.a(y()), (byte) 3);
        }
        yje yjeVar = null;
        byte b = 0;
        this.C0.put(str, sac.T(new fnq(wk30Var, new r550(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.L.b), new s550(this, str, yjeVar, b)));
    }

    public final void W(String str) {
        if (I(str)) {
            return;
        }
        yje yjeVar = null;
        byte b = 1;
        this.C0.put(str, sac.T(new fnq((xae0) this.X.r, new r550(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.L.b), new s550(this, str, yjeVar, b)));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01e7  */
    public final void X(j450 j450Var) {
        Object next;
        lr5 lr5Var;
        g8y g8yVar;
        boolean z = j450Var instanceof f350;
        yje yjeVar = null;
        mne mneVar = this.L;
        if (z) {
            this.K0 = bww.R(jiu0.a(this), this.K0, E(), mneVar.f22085a, null, null, new bh0(this, ((f350) j450Var).f8845a, yjeVar, (byte) 17), 56);
            return;
        }
        if (j450Var instanceof i350) {
            this.L0 = bww.R(jiu0.a(this), this.L0, E(), mneVar.f22085a, null, null, new xr10(this, ((i350) j450Var).f14081a, yjeVar, (byte) 19), 56);
            return;
        }
        byte b = 0;
        if (j450Var instanceof j350) {
            this.M0 = bww.R(jiu0.a(this), this.M0, E(), mneVar.f22085a, u550.f35078a, null, new v550(this, ((j350) j450Var).f15815a, yjeVar, b), 40);
            return;
        }
        byte b2 = 1;
        if (j450Var instanceof t350) {
            this.N0 = bww.R(jiu0.a(this), this.N0, E(), mneVar.f22085a, null, null, new v550(this, ((t350) j450Var).f33250a, yjeVar, b2), 56);
            return;
        }
        if (j450Var instanceof z350) {
            z350 z350Var = (z350) j450Var;
            long j = z350Var.f43704a;
            boolean z2 = z350Var.b;
            x4t x4tVar = z350Var.c;
            mlr mlrVarA = A(j, x4tVar);
            if (mlrVarA != null) {
                long jB = B(x4tVar);
                int iD = D(x4tVar);
                String strC = C(x4tVar);
                boolean z3 = !z2;
                this.J.j(j, z3, Integer.valueOf((int) jB), "my_aggregator", strC);
                this.b0.h((int) j, Integer.valueOf(iD), "my_aggregator", strC, z3);
                if (this.Y.c()) {
                    sac.V(jiu0.a(this), new f340(1, this, d650.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, mneVar.b, new lv(x4tVar, this, mlrVarA, z2, (yje) null), 10);
                    return;
                }
                return;
            }
            return;
        }
        if (j450Var instanceof a450) {
            a450 a450Var = (a450) j450Var;
            this.O0 = bww.R(jiu0.a(this), this.O0, E(), mneVar.f22085a, new f340(1, this, d650.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, new ir((Object) this, a450Var.f207a, (Object) a450Var.b, (yje) null, (byte) 22), 40);
            return;
        }
        if (j450Var instanceof i450) {
            this.P0 = bww.R(jiu0.a(this), this.P0, E(), mneVar.f22085a, new f340(1, this, d650.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, new o550(this, ((i450) j450Var).f14130a, yjeVar, (byte) 3), 40);
            return;
        }
        if (j450Var instanceof g450) {
            this.J.f35083a.c("my_aggregator_spin_anon");
            this.K.f11237a.a(xun.f41520a, 11111L);
            return;
        }
        boolean z4 = j450Var instanceof d450;
        p7m0 p7m0Var = this.g1;
        if (z4) {
            Iterator it = ((Iterable) p7m0Var.getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((ef40) next) instanceof se40));
            ef40 ef40Var = (ef40) next;
            if (ef40Var != null) {
                vbj vbjVar = ((se40) ef40Var).f32060a;
                qbj qbjVar = vbjVar instanceof qbj ? (qbj) vbjVar : null;
                if (qbjVar == null || (g8yVar = (g8y) qbjVar.f28448a) == null) {
                    lr5Var = null;
                } else {
                    lr5Var = g8yVar.b;
                }
            } else {
                lr5Var = null;
            }
            if (lr5Var == null) {
                return;
            }
            this.Q0 = bww.R(jiu0.a(this), this.Q0, E(), mneVar.f22085a, null, null, new xr10(this, lr5Var, yjeVar, (byte) 18), 56);
            return;
        }
        if (j450Var instanceof h450) {
            this.R0 = bww.R(jiu0.a(this), this.R0, E(), mneVar.f22085a, new f340(1, this, d650.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, new o550(this, ((h450) j450Var).f12419a, yjeVar, (byte) 2), 40);
            return;
        }
        if (j450Var instanceof y350) {
            y350 y350Var = (y350) j450Var;
            this.S0 = bww.R(jiu0.a(this), this.S0, E(), mneVar.f22085a, null, null, new zg0((Object) y350Var.b, (Object) this, y350Var.f41936a, (yje) null, (byte) 10), 56);
            return;
        }
        byte b3 = 4;
        byte b4 = 2;
        if (j450Var instanceof m350) {
            String strJ = sre0.f32672a.b(o450.class).J();
            if (strJ == null) {
                strJ = "";
            }
            long j2 = ((m350) j450Var).f21097a;
            f3j f3jVar = this.X;
            f3jVar.getClass();
            ((b4j) f3jVar.l).d(strJ);
            ((je) f3jVar.m).b(strJ);
            ((crt) f3jVar.h).b(wuo0.c.getId(), j2);
            c4m0 c4m0Var = (c4m0) f3jVar.n;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                byte b5 = 13;
                f3jVar.n = sac.T(new fnq(((rpt) f3jVar.i).f(), new e9g(f3jVar, yjeVar, b5), (byte) 4), d5c.S(jiu0.a(f3jVar.s()), f3jVar.d.c), new f1e(b4, yjeVar, b5));
                return;
            }
            return;
        }
        if (j450Var instanceof n350) {
            n350 n350Var = (n350) j450Var;
            this.T0 = bww.R(jiu0.a(this), this.T0, E(), mneVar.f22085a, null, null, new zg1(this, n350Var.f22834a, n350Var.b, null, (byte) 3), 56);
            return;
        }
        boolean z5 = j450Var instanceof f450;
        erc ercVar = this.W;
        if (z5) {
            Iterable iterable = (Iterable) p7m0Var.getValue();
            ArrayList<ef40> arrayList = new ArrayList();
            for (Object obj : iterable) {
                vbj state = ((ef40) obj).getState();
                state.getClass();
                if ((state instanceof obj) || (state instanceof nbj) || ((state instanceof qbj) && ((qbj) state).b)) {
                    arrayList.add(obj);
                }
            }
            for (ef40 ef40Var2 : arrayList) {
                if (ef40Var2 != null) {
                    if (ef40Var2 instanceof me40) {
                        V(((me40) ef40Var2).getKey());
                    } else if (ef40Var2 instanceof oe40) {
                        W(ef40Var2.getKey());
                    } else if (ef40Var2 instanceof ye40) {
                        O(ef40Var2.getKey());
                    } else if (ef40Var2 instanceof xe40) {
                        N(ef40Var2.getKey());
                    } else if (ef40Var2 instanceof ze40) {
                        Q();
                    } else if (ef40Var2 instanceof re40) {
                        if (this.r0.f15225a.a()) {
                            P();
                        } else {
                            Q();
                        }
                    } else if (ef40Var2 instanceof af40) {
                        R(ef40Var2.getKey());
                    } else if (ef40Var2 instanceof qe40) {
                        qe40 qe40Var = (qe40) ef40Var2;
                        x4t x4tVar2 = qe40Var.f28565a;
                        J(qe40Var.getKey(), x4tVar2, (x4tVar2 instanceof l4t) || (x4tVar2 instanceof i4t) || (x4tVar2 instanceof o4t) || (x4tVar2 instanceof s4t));
                    } else if (ef40Var2 instanceof te40) {
                        L(ef40Var2.getKey());
                    } else if (ef40Var2 instanceof we40) {
                        M(ef40Var2.getKey());
                    } else if (ef40Var2 instanceof cf40) {
                        T(ef40Var2.getKey());
                    } else if (ef40Var2 instanceof se40) {
                        K(ef40Var2.getKey());
                    } else if (ef40Var2 instanceof bf40) {
                        S(ef40Var2.getKey());
                    }
                }
                t9f.b();
                return;
            }
            ercVar.a(true);
            return;
        }
        if (j450Var instanceof e450) {
            ercVar.a(false);
            return;
        }
        if (j450Var.equals(o350.f24567a)) {
            this.U0 = bww.R(jiu0.a(this), this.U0, E(), mneVar.f22085a, null, null, new l550(this, yjeVar, b2), 56);
            return;
        }
        if (j450Var.equals(p350.f26284a)) {
            this.V0 = bww.R(jiu0.a(this), this.V0, E(), mneVar.f22085a, null, null, new l550(this, yjeVar, b4), 56);
            return;
        }
        byte b6 = 6;
        if (j450Var.equals(v350.f36719a)) {
            this.W0 = bww.R(jiu0.a(this), this.W0, E(), mneVar.f22085a, null, null, new l550(this, yjeVar, b6), 56);
            return;
        }
        if (j450Var.equals(x350.f40200a)) {
            this.I0 = bww.R(jiu0.a(this), this.I0, E(), mneVar.f22085a, null, null, new l550(this, yjeVar, (byte) 11), 56);
            return;
        }
        byte b7 = 5;
        if (j450Var.equals(k350.f17603a)) {
            this.J0 = bww.R(jiu0.a(this), this.J0, E(), mneVar.f22085a, new c550(this, b6), null, new g550(this, yjeVar, b7), 40);
            return;
        }
        boolean zEquals = j450Var.equals(l350.f19343a);
        mne mneVar2 = this.i;
        if (zEquals) {
            sac.V(jiu0.a(this), new os5(this, b2), null, mneVar2.b, new nv5(this, yjeVar, b), 10);
            return;
        }
        if (j450Var.equals(q350.f28035a)) {
            H();
            return;
        }
        if (j450Var.equals(b450.f1942a)) {
            sac.V(jiu0.a(this), new yj5(1, this.c, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, mneVar2.b, new nv5(this, yjeVar, b2), 10);
            sac.V(jiu0.a(this), new ij4((byte) 27), null, mneVar2.b, new nv5(this, yjeVar, b4), 10);
            return;
        }
        if (j450Var.equals(u350.f34981a)) {
            d0();
            return;
        }
        if (j450Var.equals(r350.f29771a)) {
            H();
            return;
        }
        if (j450Var.equals(g350.f10596a)) {
            c0();
            return;
        }
        if (!(j450Var instanceof s350)) {
            if (j450Var.equals(w350.f38485a)) {
                this.Z0 = bww.R(jiu0.a(this), this.Z0, E(), mneVar.f22085a, null, null, new l550(this, yjeVar, b), 56);
                return;
            }
            if (j450Var.equals(h350.f12369a)) {
                c0();
                return;
            }
            if (!j450Var.equals(c450.f3709a)) {
                t9f.b();
                return;
            }
            bby bbyVar = this.D0;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.D0 = sac.V(jiu0.a(this), q550.f28134a, null, mneVar.b, new l550(this, yjeVar, (byte) 10), 10);
                return;
            }
            return;
        }
        String str = ((s350) j450Var).f31540a;
        int iHashCode = str.hashCode();
        if (iHashCode == 782052589) {
            if (str.equals("BONUSES")) {
                this.Y0 = bww.R(jiu0.a(this), this.Y0, E(), mneVar.f22085a, null, null, new l550(this, yjeVar, b7), 56);
            }
        } else {
            if (iHashCode != 807116442) {
                if (iHashCode == 1489292093 && str.equals("PROMO_CODE")) {
                    this.Y0 = bww.R(jiu0.a(this), this.Y0, E(), mneVar.f22085a, null, null, new l550(this, yjeVar, b3), 56);
                    return;
                }
                return;
            }
            if (str.equals("CASHBACK")) {
                bby bbyVar2 = this.F0;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    this.F0 = sac.V(jiu0.a(this), new f340(1, this, d650.class, "handleClaimCashbackError", "handleClaimCashbackError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, mneVar.b, new g550(this, yjeVar, b), 10);
                }
            }
        }
    }

    public final void Y(myr0 myr0Var) {
        boolean z = myr0Var.d instanceof jyr0;
        if (myr0Var.b != z1s0.b || z) {
            this.H.c(new AggregatorScreenModel(null, null, 0L, new qm1(myr0Var.f22617a, s9s0.f31863a, myr0Var.f.f13873a, false), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
        } else {
            sac.V(jiu0.a(this), y550.f42032a, null, this.L.f22085a, new j940(this, myr0Var, null, (byte) 6), 10);
        }
    }

    public final String Z(Integer num, List list, String str) {
        return this.u0.k(new lu0(0L, num, str, list));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    public final String a0(long j, x4t x4tVar) {
        List listR;
        Integer num = null;
        List listZ = x4tVar != null ? z(x4tVar) : null;
        if (listZ == null) {
            listZ = iun.f15405a;
        }
        Iterator it = listZ.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((mlr) it.next()).f22006a == j) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            numValueOf = null;
        }
        Integer numE = numValueOf != null ? kng0.e(1, numValueOf) : null;
        iqt iqtVar = this.r0;
        if (numE != null && iqtVar.f15225a.a()) {
            num = numE;
        }
        if (x4tVar == null) {
            listR = iun.f15405a;
        } else if (x4tVar instanceof p4t) {
            listR = hne.r(825L, "category");
        } else if (x4tVar instanceof s4t) {
            listR = hne.r(0L, "recent");
        } else if (x4tVar instanceof v4t) {
            listR = hne.r(824L, "category");
        } else if (x4tVar instanceof r4t) {
            listR = iun.f15405a;
        } else {
            listR = iun.f15405a;
        }
        return Z(num, listR, iqtVar.f15225a.a() ? "my_aggregator" : "my_aggregator_anonim");
    }

    public final void b0(vbj vbjVar) {
        p7m0 p7m0Var;
        Object value;
        ArrayList arrayList;
        do {
            p7m0Var = this.g1;
            value = p7m0Var.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(r3d.q(list, 10));
            for (Object se40Var : list) {
                if (se40Var instanceof se40) {
                    se40Var = new se40(vbjVar);
                }
                arrayList.add(se40Var);
            }
        } while (!p7m0Var.m(value, arrayList));
    }

    public final void c0() {
        bby bbyVar = this.E0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.E0 = sac.V(jiu0.a(this), new c550(this, (byte) 0), null, this.L.b, new g550(this, null, (byte) 7), 10);
        }
    }

    public final void d0() {
        p7m0 p7m0Var;
        Object value;
        ArrayList arrayList;
        ef40 te40Var;
        do {
            p7m0Var = this.g1;
            value = p7m0Var.getValue();
            Iterable<ef40> iterable = (Iterable) p7m0Var.getValue();
            arrayList = new ArrayList(r3d.q(iterable, 10));
            for (ef40 bf40Var : iterable) {
                vbj state = bf40Var.getState();
                state.getClass();
                if ((state instanceof obj) || (state instanceof nbj) || (bf40Var.getState() instanceof nbj)) {
                    bby bbyVar = (bby) this.C0.remove(bf40Var.getKey());
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    boolean z = bf40Var instanceof me40;
                    ubj ubjVar = ubj.f35384a;
                    if (z) {
                        bf40Var = new me40(ubjVar);
                    } else if (bf40Var instanceof oe40) {
                        bf40Var = new oe40(ubjVar);
                    } else {
                        if (bf40Var instanceof qe40) {
                            te40Var = new qe40(((qe40) bf40Var).f28565a, ubjVar);
                        } else if (bf40Var instanceof xe40) {
                            bf40Var = new xe40(ubjVar);
                        } else if (bf40Var instanceof ye40) {
                            bf40Var = new ye40(ubjVar);
                        } else if (bf40Var instanceof ze40) {
                            bf40Var = new ze40(ubjVar);
                        } else if (bf40Var instanceof re40) {
                            bf40Var = new re40(ubjVar);
                        } else if (bf40Var instanceof af40) {
                            bf40Var = new af40(ubjVar);
                        } else if (bf40Var instanceof te40) {
                            te40Var = new te40(((te40) bf40Var).f33801a, ubjVar);
                        } else if (bf40Var instanceof cf40) {
                            bf40Var = new cf40(ubjVar);
                        } else if (bf40Var instanceof we40) {
                            bf40Var = new we40(ubjVar);
                        } else if (bf40Var instanceof se40) {
                            bf40Var = new se40(ubjVar);
                        } else {
                            if (!(bf40Var instanceof bf40)) {
                                t9f.b();
                                return;
                            }
                            bf40Var = new bf40(ubjVar);
                        }
                        bf40Var = te40Var;
                    }
                }
                arrayList.add(bf40Var);
            }
        } while (!p7m0Var.m(value, arrayList));
    }

    @Override // a.diu0
    public final void v() {
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ((eiu0) it.next()).t();
        }
    }

    public final void w() {
        p7m0 p7m0Var;
        Object value;
        ArrayList arrayList;
        do {
            d650 d650Var = this;
            p7m0Var = d650Var.B0;
            value = p7m0Var.getValue();
            Iterable<q250> iterable = (Iterable) p7m0Var.getValue();
            arrayList = new ArrayList();
            for (q250 q250Var : iterable) {
                if (q250Var != null) {
                    long j = q250Var.f27985a;
                    long j2 = q250Var.b;
                    sac.V(jiu0.a(d650Var), new f340(1, d650Var, d650.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, d650Var.L.b, new l87(j, this, j2, null), 10);
                    q250Var = null;
                }
                if (q250Var != null) {
                    arrayList.add(q250Var);
                }
                d650Var = this;
            }
        } while (!p7m0Var.m(value, arrayList));
    }

    public final String x(ql5 ql5Var) {
        ql5Var.getClass();
        String str = ql5Var.j;
        if (this.p.b() == kg.SECONDARY) {
            return this.m.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
        }
        return str.length() > 0 ? str : ql5Var.k;
    }

    public final long y() {
        boolean zA = this.r0.f15225a.a();
        if (this.c1) {
            return nw80.t.getId();
        }
        hl1 hl1Var = this.b1.b;
        if (hl1Var.K && zA) {
            return nw80.u.getId();
        }
        return (!hl1Var.J || zA) ? nw80.w.getId() : nw80.u.getId();
    }

    public final List z(x4t x4tVar) {
        Object next;
        List list;
        Iterator it = ((Iterable) this.g1.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ef40 ef40Var = (ef40) next;
            if ((ef40Var instanceof qe40) && ((qe40) ef40Var).f28565a.equals(x4tVar)) {
                break;
            }
        }
        ef40 ef40Var2 = (ef40) next;
        if (ef40Var2 != null) {
            if (ef40Var2 instanceof qe40) {
                vbj vbjVar = ((qe40) ef40Var2).b;
                if (vbjVar instanceof rbj) {
                    list = (List) ((rbj) vbjVar).f30189a;
                } else {
                    list = vbjVar instanceof qbj ? (List) ((qbj) vbjVar).f28448a : iun.f15405a;
                }
            } else {
                list = iun.f15405a;
            }
            if (list != null) {
                return list;
            }
        }
        return iun.f15405a;
    }
}
