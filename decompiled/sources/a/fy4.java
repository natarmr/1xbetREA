package a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;
import org.xplatform.make_bet.impl.presentation.model.CoefStepInputUiModel;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class fy4 extends w46 {
    public final ms2 A;
    public final pmi B;
    public final x20 C;
    public final yo4 D;
    public final vqc E;
    public final gg5 F;
    public final ih5 G;
    public final ih5 H;
    public final l7k I;
    public final loi0 J;
    public final loi0 K;
    public final rpt L;
    public final sd60 M;
    public final rou N;
    public final cl5 O;
    public final k7u P;
    public final x1u Q;
    public final cmt R;
    public bby S;
    public bby T;
    public final c4m0 U;
    public c4m0 V;
    public final nwo0 W;
    public final p7m0 X;
    public final p7m0 Y;
    public final ol60 Z;
    public final ol60 a0;
    public final m0k0 b;
    public final p7m0 b0;
    public final v88 c;
    public final p7m0 c0;
    public final phf0 d;
    public final ol60 d0;
    public final khf0 e;
    public final ol60 e0;
    public final ot f;
    public final p7m0 f0;
    public final mne g;
    public final p7m0 g0;
    public final i1w0 h;
    public final p7m0 h0;
    public final duj i;
    public final p7m0 i0;
    public final f3c j;
    public final zlt0 k;
    public final ctf0 l;
    public final g320 m;
    public final nhf0 n;
    public final nw20 o;
    public final r4v p;
    public final u4a q;
    public final m1e r;
    public final hru s;
    public final mpt t;
    public final clc u;
    public final ouu v;
    public final mii0 w;
    public final pyu x;
    public final uyn y;
    public final vzg0 z;

    public fy4(m0k0 m0k0Var, v88 v88Var, phf0 phf0Var, khf0 khf0Var, ot otVar, mne mneVar, i1w0 i1w0Var, duj dujVar, f3c f3cVar, zlt0 zlt0Var, ctf0 ctf0Var, g320 g320Var, nhf0 nhf0Var, nw20 nw20Var, r4v r4vVar, u4a u4aVar, m1e m1eVar, hru hruVar, mpt mptVar, clc clcVar, ouu ouuVar, mii0 mii0Var, b8u b8uVar, pyu pyuVar, uyn uynVar, vzg0 vzg0Var, reu reuVar, rxu rxuVar, ms2 ms2Var, pmi pmiVar, x20 x20Var, yo4 yo4Var, vqc vqcVar, gg5 gg5Var, ih5 ih5Var, ih5 ih5Var2, l7k l7kVar, loi0 loi0Var, loi0 loi0Var2, rpt rptVar, sd60 sd60Var, rou rouVar, cl5 cl5Var, k7u k7uVar, x1u x1uVar, edo edoVar, cmt cmtVar) {
        dvj dvjVar = mneVar.b;
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        edoVar.getClass();
        this.b = m0k0Var;
        this.c = v88Var;
        this.d = phf0Var;
        this.e = khf0Var;
        this.f = otVar;
        this.g = mneVar;
        this.h = i1w0Var;
        this.i = dujVar;
        this.j = f3cVar;
        this.k = zlt0Var;
        this.l = ctf0Var;
        this.m = g320Var;
        this.n = nhf0Var;
        this.o = nw20Var;
        this.p = r4vVar;
        this.q = u4aVar;
        this.r = m1eVar;
        this.s = hruVar;
        this.t = mptVar;
        this.u = clcVar;
        this.v = ouuVar;
        this.w = mii0Var;
        this.x = pyuVar;
        this.y = uynVar;
        this.z = vzg0Var;
        this.A = ms2Var;
        this.B = pmiVar;
        this.C = x20Var;
        this.D = yo4Var;
        this.E = vqcVar;
        this.F = gg5Var;
        this.G = ih5Var;
        this.H = ih5Var2;
        this.I = l7kVar;
        this.J = loi0Var;
        this.K = loi0Var2;
        this.L = rptVar;
        this.M = sd60Var;
        this.N = rouVar;
        this.O = cl5Var;
        this.P = k7uVar;
        this.Q = x1uVar;
        this.R = cmtVar;
        nwo0 nwo0VarC = reuVar.c();
        this.W = nwo0VarC;
        p7m0 p7m0VarA = q7m0.a(jm5.f16748a);
        this.X = p7m0VarA;
        this.Y = q7m0.a(0L);
        this.Z = new ol60(3);
        this.a0 = new ol60(3);
        CoefStepInputUiModel coefStepInputUiModel = (CoefStepInputUiModel) vzg0Var.a("SAVED_STATE_COEF_KEY");
        p7m0 p7m0VarA2 = q7m0.a(coefStepInputUiModel == null ? new CoefStepInputUiModel(new BigDecimal(String.valueOf(-1.0d)), new BigDecimal(String.valueOf(-1.0d)), new BigDecimal(String.valueOf(0.1d)), new BigDecimal(String.valueOf(1.01d)), new BigDecimal("999.999"), false, false, false, false) : coefStepInputUiModel);
        this.b0 = p7m0VarA2;
        StepInputUiModel stepInputUiModel = (StepInputUiModel) vzg0Var.a("SAVED_STATE_BET_SUM_KEY");
        byte b = 0;
        p7m0 p7m0VarA3 = q7m0.a(stepInputUiModel == null ? new StepInputUiModel(-1.0d, 0.0d, 1.0d, -1.0d, -1.0d, "", false, false, new AutoMaxUiModel(-1.0d, false), true, false, false, false, false, false, true, false) : stepInputUiModel);
        this.c0 = p7m0VarA3;
        this.d0 = new ol60(3);
        this.e0 = new ol60(3);
        this.f0 = q7m0.a(nwo0VarC.f24244a ? bwo0.f3335a : zvo0.f45068a);
        this.g0 = q7m0.a(Boolean.TRUE);
        this.h0 = q7m0.a(onb0.f25539a);
        this.i0 = q7m0.a(zg5.f44327a);
        yje yjeVar = null;
        byte b2 = 1;
        sac.T(new p6d(new fnq(b8uVar.a(bm5.b), new ex1((Object) this, yjeVar, (byte) 5)), m1eVar.b(), new fe0(this, yjeVar, b2), (byte) 1), d5c.S(jiu0.a(this), dvjVar), new yx4(this, yjeVar, b));
        sac.T(new p6d(p7m0VarA3, p7m0VarA, new wx4(this, yjeVar, b2), (byte) 1), jiu0.a(this), by4.h);
        sac.V(jiu0.a(this), new sx4(this, b), null, mneVar.b, new zx4(this, yjeVar, b), 10);
        c4m0 c4m0Var = this.U;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.U = sac.T(dub.e0(p7m0VarA2, p7m0VarA3, uynVar.h(), rxuVar.a(), new cy4(this, null)), d5c.S(jiu0.a(this), dvjVar), new yx4(this, yjeVar, b2));
        }
        I();
    }

    public static boolean B(StepInputUiModel stepInputUiModel, CoefStepInputUiModel coefStepInputUiModel) {
        boolean z = stepInputUiModel.g;
        double d = stepInputUiModel.d;
        double d2 = stepInputUiModel.f46773a;
        boolean z2 = z && d2 >= d;
        double d3 = stepInputUiModel.e;
        if ((d <= d2 && d2 <= d3) || z2) {
            BigDecimal bigDecimal = coefStepInputUiModel.d;
            BigDecimal bigDecimal2 = coefStepInputUiModel.e;
            BigDecimal bigDecimal3 = coefStepInputUiModel.f46771a;
            if (bigDecimal3.compareTo(bigDecimal) >= 0 && bigDecimal3.compareTo(bigDecimal2) <= 0) {
                return true;
            }
        }
        return false;
    }

    public static BigDecimal w(BigDecimal bigDecimal, CoefStepInputUiModel coefStepInputUiModel) {
        BigDecimal bigDecimal2 = coefStepInputUiModel.f46771a;
        BigDecimal bigDecimal3 = coefStepInputUiModel.d;
        BigDecimal bigDecimal4 = coefStepInputUiModel.e;
        if (Intrinsics.d(bigDecimal2, new BigDecimal(String.valueOf(0.0d)))) {
            return coefStepInputUiModel.b;
        }
        if (bigDecimal.compareTo(bigDecimal4) > 0 || bigDecimal.compareTo(bigDecimal3) < 0) {
            return bigDecimal.compareTo(bigDecimal4) > 0 ? bigDecimal4 : bigDecimal3;
        }
        return bigDecimal;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:73:0x014d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0152  */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:80:0x0171  */
    /* JADX WARN: Code duplicated, block: B:81:0x0174  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object A(long j, m97 m97Var, oa20 oa20Var, zje zjeVar) {
        xx4 xx4Var;
        oa20 oa20Var2;
        long j2;
        Long lT0;
        long j3;
        long j4;
        oa20 oa20Var3;
        nw20 nw20Var;
        long j5;
        long[] jArr;
        oa20 oa20Var4;
        String str;
        Double dValueOf;
        p7m0 p7m0Var;
        double dDoubleValue;
        boolean z;
        if (zjeVar instanceof xx4) {
            xx4Var = (xx4) zjeVar;
            int i = xx4Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                xx4Var.p = i - Integer.MIN_VALUE;
            } else {
                xx4Var = new xx4(this, zjeVar);
            }
        } else {
            xx4Var = new xx4(this, zjeVar);
        }
        xx4 xx4Var2 = xx4Var;
        Object obj = xx4Var2.n;
        wne wneVar = wne.f39444a;
        int i2 = xx4Var2.p;
        if (i2 == 0) {
            z1x.P(obj);
            long j6 = m97Var.i;
            oa20Var2 = oa20Var;
            xx4Var2.l = oa20Var2;
            j2 = j;
            xx4Var2.i = j2;
            xx4Var2.p = 1;
            if (C(-1, j6) != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            long j7 = xx4Var2.i;
            oa20 oa20Var5 = xx4Var2.l;
            z1x.P(obj);
            oa20Var2 = oa20Var5;
            j2 = j7;
        } else {
            if (i2 == 2) {
                long j8 = xx4Var2.k;
                long j9 = xx4Var2.j;
                long j10 = xx4Var2.i;
                nw20Var = xx4Var2.m;
                oa20 oa20Var6 = xx4Var2.l;
                z1x.P(obj);
                j3 = j8;
                j4 = j10;
                j5 = j9;
                oa20Var3 = oa20Var6;
                jArr = new long[]{j5};
                xx4Var2.l = oa20Var3;
                xx4Var2.m = null;
                xx4Var2.i = j4;
                xx4Var2.j = j5;
                xx4Var2.p = 3;
                if (nw20Var.m(j3, (ql5) obj, jArr, xx4Var2) != wneVar) {
                    oa20Var4 = oa20Var3;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oa20Var4 = xx4Var2.l;
            z1x.P(obj);
        }
        oa20Var2 = oa20Var4;
        str = this.t.a().f20609a;
        if (str.length() > 0 && (this.v.t() instanceof za50)) {
            this.w.M(str);
            this.C.j(str);
            ((t47) ((mii0) this.u.b).e).b = null;
        }
        this.p.b(oa20Var2);
        double d = oa20Var2.j;
        dValueOf = d != 0.0d ? Double.valueOf(d) : null;
        p7m0Var = this.c0;
        if (dValueOf != null) {
            dDoubleValue = dValueOf.doubleValue();
        } else {
            dDoubleValue = ((StepInputUiModel) p7m0Var.getValue()).f46773a;
        }
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(dDoubleValue, p3u0.g);
        String str2 = oa20Var2.g;
        long j11 = oa20Var2.e;
        String str3 = oa20Var2.f24910a;
        if (dDoubleValue > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        this.e0.f(new ja20(strC, str2, j11, ((StepInputUiModel) p7m0Var.getValue()).f, str3, z, new gnb0(this.l.b.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), pn40.o(x(dDoubleValue, oa20Var2.f, ((StepInputUiModel) p7m0Var.getValue()).e))), null, null));
        return Unit.f46060a;
        long j12 = this.b.Y;
        ms2 ms2Var = this.A;
        if (ms2Var != null && ((ms2Var instanceof lq2) || (ms2Var instanceof jr2) || (ms2Var instanceof fr2) || (ms2Var instanceof rq2) || (ms2Var instanceof uq2) || (ms2Var instanceof tq2) || (ms2Var instanceof sq2) || (ms2Var instanceof jq2) || (ms2Var instanceof kq2))) {
            this.E.k(pzb.C(new ux4(j12, ms2Var, (byte) 0)));
        }
        if (this.k.n() && (lT0 = StringsKt.t0(oa20Var2.f24910a)) != null) {
            long jLongValue = lT0.longValue();
            i89 i89VarM = this.d.m();
            xx4Var2.l = oa20Var2;
            nw20 nw20Var2 = this.o;
            xx4Var2.m = nw20Var2;
            xx4Var2.i = j2;
            xx4Var2.j = jLongValue;
            xx4Var2.k = j2;
            xx4Var2.p = 2;
            Object objK = ntb.K(i89VarM, xx4Var2);
            if (objK != wneVar) {
                j3 = j2;
                j4 = j3;
                oa20Var3 = oa20Var2;
                obj = objK;
                nw20Var = nw20Var2;
                j5 = jLongValue;
                jArr = new long[]{j5};
                xx4Var2.l = oa20Var3;
                xx4Var2.m = null;
                xx4Var2.i = j4;
                xx4Var2.j = j5;
                xx4Var2.p = 3;
                if (nw20Var.m(j3, (ql5) obj, jArr, xx4Var2) != wneVar) {
                    oa20Var4 = oa20Var3;
                    oa20Var2 = oa20Var4;
                }
            }
            return wneVar;
        }
        str = this.t.a().f20609a;
        if (str.length() > 0) {
            this.w.M(str);
            this.C.j(str);
            ((t47) ((mii0) this.u.b).e).b = null;
        }
        this.p.b(oa20Var2);
        double d2 = oa20Var2.j;
        if (d2 != 0.0d) {
        }
        p7m0Var = this.c0;
        if (dValueOf != null) {
            dDoubleValue = dValueOf.doubleValue();
        } else {
            dDoubleValue = ((StepInputUiModel) p7m0Var.getValue()).f46773a;
        }
        pn40 pn40Var2 = pn40.f27267a;
        String strC2 = pn40.c(dDoubleValue, p3u0.g);
        String str4 = oa20Var2.g;
        long j13 = oa20Var2.e;
        String str5 = oa20Var2.f24910a;
        if (dDoubleValue > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        this.e0.f(new ja20(strC2, str4, j13, ((StepInputUiModel) p7m0Var.getValue()).f, str5, z, new gnb0(this.l.b.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), pn40.o(x(dDoubleValue, oa20Var2.f, ((StepInputUiModel) p7m0Var.getValue()).e))), null, null));
        return Unit.f46060a;
    }

    public final Unit C(int i, long j) {
        ms2 ms2Var = this.A;
        int i2 = ms2Var instanceof ds2 ? ((ds2) ms2Var).f6590a : -1;
        m0k0 m0k0Var = this.b;
        this.D.q(m0k0Var.f20959a, m0k0Var.B, ms2Var, j, "coeff", i, this.Q.a(), i2, "");
        ms2 ms2Var2 = this.A;
        this.C.w(m0k0Var.f20959a, m0k0Var.B, i2, ms2Var2 instanceof ds2 ? g1x.v((ds2) ms2Var2) : kpb.v0(ms2Var2), j, "coeff", i, "");
        return Unit.f46060a;
    }

    public final void D() {
        c4m0 c4m0Var = this.V;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.V = sac.T(new p6d(this.y.h(), this.r.b(), new ko0((Object) this, (yje) null, (byte) 2), (byte) 1), d5c.S(jiu0.a(this), this.g.b), new vp3(2, this, fy4.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 9));
        }
    }

    public final void E() {
        ms2 ms2Var = this.A;
        ms2Var.getClass();
        boolean z = ms2Var instanceof vq2;
        this.H.f(z ? k7k.PlayerDuel : k7k.PlacementBet);
        this.I.b((z ? y1p.PLAYER_DUEL : y1p.PLACEMENT_BET).f41868a, this.R.g());
        sac.V(jiu0.a(this), new sx4(this, (byte) 4), null, this.g.f22085a, new ac4(this, null), 10);
    }

    public final void F() {
        String str = this.A instanceof vq2 ? "duel" : "regular_bet";
        this.G.c(str);
        this.F.i(str);
        this.Z.f(dx4.f6829a);
    }

    public final void G(boolean z) {
        sac.V(jiu0.a(this), new j94(1, this, fy4.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, this.g.b, new dy4(this, z, null), 10);
    }

    public final void H(gwo0 gwo0Var) {
        bby bbyVar;
        if (!(gwo0Var instanceof bwo0) && (bbyVar = this.T) != null) {
            v3c.N(bbyVar);
        }
        p7m0 p7m0Var = this.f0;
        p7m0Var.getClass();
        p7m0Var.o(null, gwo0Var);
    }

    public final void I() {
        p7m0 p7m0Var;
        Object value;
        StepInputUiModel stepInputUiModel;
        do {
            p7m0Var = this.c0;
            value = p7m0Var.getValue();
            stepInputUiModel = (StepInputUiModel) value;
        } while (!p7m0Var.m(value, StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, AutoMaxUiModel.a(stepInputUiModel.i, this.k.j(), 0.0d, 2), false, false, false, false, false, false, 130815)));
    }

    public final void J(Function1 function1) {
        sac.V(jiu0.a(this), new j94(1, this, fy4.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 21), new gj4(this, function1), this.g.b, new zx4(this, null, (byte) 1), 8);
    }

    public final double x(double d, double d2, double d3) {
        boolean z = this.L.g().T && this.P.f17841a.b() == jvn.f;
        q4f q4fVar = q4f.c;
        this.O.getClass();
        return cl5.t(d, d2, d3, z, 0, q4fVar);
    }

    public final qnb0 y() {
        if (((StepInputUiModel) this.c0.getValue()).f46773a == -1.0d) {
            return onb0.f25539a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        return new pnb0(axq.d(arrayList2, new zmk0(efx.s(this.l, this.W.f24244a, false), (62 & 4) != 0 ? -1 : 0, -1.0f, (62 & 8) != 0 ? -1 : 0, (62 & 16) != 0 ? -1 : 0, (62 & 32) != 0 ? -1 : 0), arrayList, arrayList2, arrayList));
    }

    public final void z(Throwable th) {
        this.i.b(th, new tx4(this, (byte) 1));
        this.d0.f(uq00.f36094a);
    }
}
