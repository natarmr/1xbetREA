package a;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel;
import org.xplatform.coupon.impl.make_bet.presentation.model.CoefStepInputUiModel;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class h620 extends w46 {
    public final khf0 A;
    public final trm0 B;
    public final uqx C;
    public final znt D;
    public final gg5 E;
    public final ih5 F;
    public final vzg0 G;
    public final rxu H;
    public final ot I;
    public final r4v J;
    public final svu K;
    public final dnv L;
    public final fqc M;
    public final tqc N;
    public final ert O;
    public final x1u P;
    public final ih5 Q;
    public final l7k R;
    public final cmt S;
    public final p7m0 T;
    public final qoj0 U;
    public final p7m0 V;
    public final p7m0 W;
    public bby X;
    public bby Y;
    public bby Z;
    public bby a0;
    public final boolean b;
    public c4m0 b0;
    public final mne c;
    public c4m0 c0;
    public final v88 d;
    public final c4m0 d0;
    public final duj e;
    public final nwo0 e0;
    public final i1w0 f;
    public final ol60 f0;
    public final hsj g;
    public final qoj0 g0;
    public final a6u h;
    public final p7m0 h0;
    public final ctf0 i;
    public final p7m0 i0;
    public final m1e j;
    public final p7m0 j0;
    public final kxu k;
    public final p7m0 k0;
    public final cl5 l;
    public final p7m0 l0;
    public final ert m;
    public final p7m0 m0;
    public final j9c n;
    public final p7m0 n0;
    public final g320 o;
    public final p7m0 o0;
    public final daf p;
    public final ol60 p0;
    public final zlt0 q;
    public final p7m0 q0;
    public final o4a r;
    public final mpc s;
    public final ni9 t;
    public final j9c u;
    public final w5z v;
    public final u4a w;
    public final pyu x;
    public final reu y;
    public final mpc z;

    public h620(boolean z, mne mneVar, v88 v88Var, duj dujVar, i1w0 i1w0Var, hsj hsjVar, a6u a6uVar, ctf0 ctf0Var, m1e m1eVar, kxu kxuVar, gs gsVar, cl5 cl5Var, ert ertVar, j9c j9cVar, g320 g320Var, daf dafVar, zlt0 zlt0Var, o4a o4aVar, mpc mpcVar, ni9 ni9Var, j9c j9cVar2, k52 k52Var, w5z w5zVar, b8u b8uVar, u4a u4aVar, pyu pyuVar, reu reuVar, mpc mpcVar2, khf0 khf0Var, trm0 trm0Var, uqx uqxVar, znt zntVar, gg5 gg5Var, ih5 ih5Var, vzg0 vzg0Var, rxu rxuVar, ot otVar, r4v r4vVar, svu svuVar, dnv dnvVar, fqc fqcVar, tqc tqcVar, ert ertVar2, x1u x1uVar, ih5 ih5Var2, l7k l7kVar, cmt cmtVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = z;
        this.c = mneVar;
        this.d = v88Var;
        this.e = dujVar;
        this.f = i1w0Var;
        this.g = hsjVar;
        this.h = a6uVar;
        this.i = ctf0Var;
        this.j = m1eVar;
        this.k = kxuVar;
        this.l = cl5Var;
        this.m = ertVar;
        this.n = j9cVar;
        this.o = g320Var;
        this.p = dafVar;
        this.q = zlt0Var;
        this.r = o4aVar;
        this.s = mpcVar;
        this.t = ni9Var;
        this.u = j9cVar2;
        this.v = w5zVar;
        this.w = u4aVar;
        this.x = pyuVar;
        this.y = reuVar;
        this.z = mpcVar2;
        this.A = khf0Var;
        this.B = trm0Var;
        this.C = uqxVar;
        this.D = zntVar;
        this.E = gg5Var;
        this.F = ih5Var;
        this.G = vzg0Var;
        this.H = rxuVar;
        this.I = otVar;
        this.J = r4vVar;
        this.K = svuVar;
        this.L = dnvVar;
        this.M = fqcVar;
        this.N = tqcVar;
        this.O = ertVar2;
        this.P = x1uVar;
        this.Q = ih5Var2;
        this.R = l7kVar;
        this.S = cmtVar;
        this.T = q7m0.a(0L);
        i99 i99Var = i99.b;
        byte b = 0;
        byte b2 = 1;
        this.U = roj0.a(0, 1, i99Var);
        this.V = q7m0.a(ub50.f35363a);
        this.W = q7m0.a(km5.f18522a);
        nwo0 nwo0VarC = reuVar.c();
        this.e0 = nwo0VarC;
        this.f0 = new ol60(3);
        this.g0 = roj0.a(1, 1, i99Var);
        CoefStepInputUiModel coefStepInputUiModel = (CoefStepInputUiModel) vzg0Var.a("SAVED_STATE_COEF_KEY");
        this.h0 = q7m0.a(coefStepInputUiModel == null ? new CoefStepInputUiModel(new BigDecimal(String.valueOf(-1.0d)), new BigDecimal(String.valueOf(-1.0d)), new BigDecimal(String.valueOf(0.1d)), new BigDecimal(String.valueOf(1.01d)), new BigDecimal("9999999999999.999"), false, false, false, false) : coefStepInputUiModel);
        StepInputUiModel stepInputUiModel = (StepInputUiModel) vzg0Var.a("SAVED_STATE_BET_SUM_KEY");
        p7m0 p7m0VarA = q7m0.a(stepInputUiModel == null ? new StepInputUiModel(-1.0d, 0.0d, 1.0d, 0.0d, 0.0d, "", false, false, new AutoMaxUiModel(0.0d, false), true, true, false, false, false, false, false, true, false) : stepInputUiModel);
        this.i0 = p7m0VarA;
        this.j0 = q7m0.a(nwo0VarC.f24244a ? cwo0.f5091a : awo0.f1585a);
        this.k0 = q7m0.a(Boolean.TRUE);
        this.l0 = q7m0.a(hnb0.f13344a);
        this.m0 = q7m0.a(zq00.f44786a);
        this.n0 = q7m0.a(ia20.f14416a);
        this.o0 = q7m0.a(0L);
        ol60 ol60Var = new ol60(3);
        this.p0 = ol60Var;
        this.q0 = q7m0.a(bh5.f2588a);
        bm5 bm5Var = bm5.i;
        yje yjeVar = null;
        sac.T(new p6d(new fnq(i120.W(b8uVar.a(bm5Var)), new mt00((Object) this, yjeVar, (byte) 7)), m1eVar.b(), new kh1((Object) this, yjeVar, (byte) 11), b2), jiu0.a(this), new xr10((Object) this, yjeVar, (byte) 4));
        int i = 2;
        sac.T(new fnq(new fnq(((ave) gsVar.f11805a.c).o, new y520(this, yjeVar, b)), new y520(this, yjeVar, b2), (byte) 4), jiu0.a(this), new p23(i, yjeVar, (byte) 9));
        sac.T(new fnq(k52Var.a(), new yg1((Object) this, yjeVar, (byte) 17), (byte) 4), jiu0.a(this), new sax(i, yjeVar, (byte) 10));
        this.d0 = sac.T(new fnq(ol60Var, new a620(this, yjeVar, b), (byte) 4), jiu0.a(this), b620.h);
        sac.T(new p6d(p7m0VarA, b8uVar.a(bm5Var), new wx4((Object) this, yjeVar, (byte) 21), b2), jiu0.a(this), e620.h);
    }

    public static boolean C(StepInputUiModel stepInputUiModel, CoefStepInputUiModel coefStepInputUiModel) {
        boolean z = stepInputUiModel.g;
        double d = stepInputUiModel.d;
        double d2 = stepInputUiModel.f46474a;
        boolean z2 = z && d2 >= d;
        double d3 = stepInputUiModel.e;
        if ((d <= d2 && d2 <= d3) || z2) {
            BigDecimal bigDecimal = coefStepInputUiModel.d;
            BigDecimal bigDecimal2 = coefStepInputUiModel.e;
            BigDecimal bigDecimal3 = coefStepInputUiModel.f46473a;
            if (bigDecimal3.compareTo(bigDecimal) >= 0 && bigDecimal3.compareTo(bigDecimal2) <= 0) {
                return true;
            }
        }
        return false;
    }

    public static BigDecimal w(BigDecimal bigDecimal, CoefStepInputUiModel coefStepInputUiModel) {
        BigDecimal bigDecimal2 = coefStepInputUiModel.f46473a;
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

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012f, code lost:
    
        if (r31.M.a(r7) == r8) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(a.pa20 r32, a.zje r33) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h620.A(a.pa20, a.zje):java.lang.Object");
    }

    public final void B(kuw kuwVar, String str) {
        jdk0 jdk0Var = jdk0.f16332a;
        pek0 pek0Var = pek0.f26859a;
        yje yjeVar = null;
        sac.V(jiu0.a(this), x520.f40293a, null, null, new wn2((Object) this, (Object) kuwVar, yjeVar, (byte) 18), 14);
        i2o i2oVar = i2o.NeedToConfirmEula;
        duj dujVar = this.e;
        if (kuwVar == i2oVar) {
            dujVar.d();
            return;
        }
        if (kuwVar == i2o.IdentificationNotPassed2) {
            dujVar.c(str);
            return;
        }
        i2o i2oVar2 = i2o.q;
        ol60 ol60Var = this.f0;
        if (kuwVar == i2oVar2) {
            ol60Var.f(new dw4(str));
            return;
        }
        if (kuwVar == i2o.BetExistsError) {
            ol60Var.f(new cw4(str));
            return;
        }
        i2o i2oVar3 = i2o.CoefficientBlockCode;
        byte b = 1;
        mne mneVar = this.c;
        if (kuwVar == i2oVar3 || kuwVar == i2o.GameLocked || kuwVar == i2o.Locked) {
            ol60Var.f(new gw4(new xdk0(pek0Var, this.i.f(R.string.bet_error_coef_block, new Object[0]), null, null, jdk0Var, Integer.valueOf(R.drawable.ic_snack_lock), 76)));
            sac.V(jiu0.a(this), new r520((byte) 1), null, mneVar.b, new w520(this, yjeVar, (byte) 0), 10);
        } else if (kuwVar != i2o.A && kuwVar != i2o.GameIsNotInLine && kuwVar != i2o.EventParameterChanged) {
            ol60Var.f(new gw4(new xdk0(rek0.b, str, null, null, null, null, 124)));
        } else {
            ol60Var.f(new gw4(new xdk0(pek0Var, str, null, null, jdk0Var, null, 108)));
            sac.V(jiu0.a(this), new p610((byte) 27), null, mneVar.b, new w520(this, yjeVar, b), 10);
        }
    }

    public final void D(boolean z) {
        sac.V(jiu0.a(this), new yw10(1, this, h620.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, this.c.b, new lv((Object) this, z, (yje) null, (byte) 10), 10);
    }

    public final void E(hwo0 hwo0Var) {
        bby bbyVar;
        if (!(hwo0Var instanceof cwo0) && (bbyVar = this.Z) != null) {
            v3c.N(bbyVar);
        }
        p7m0 p7m0Var = this.j0;
        p7m0Var.getClass();
        p7m0Var.o(null, hwo0Var);
    }

    public final void x(StepInputUiModel stepInputUiModel, CoefStepInputUiModel coefStepInputUiModel, hxu hxuVar, q4f q4fVar) {
        this.Y = sac.V(jiu0.a(this), new p520(this, (byte) 0), null, this.c.b, new c43((diu0) this, (Object) hxuVar, (Object) q4fVar, (Object) stepInputUiModel, (Object) coefStepInputUiModel, (yje) null, (byte) 7), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object y(hxu hxuVar, q4f q4fVar, StepInputUiModel stepInputUiModel, CoefStepInputUiModel coefStepInputUiModel, zje zjeVar) {
        t520 t520Var;
        boolean z;
        boolean z2;
        double d;
        cl5 cl5Var;
        hxu hxuVar2;
        StepInputUiModel stepInputUiModel2;
        int i;
        q4f q4fVar2;
        double d2;
        double d3;
        if (zjeVar instanceof t520) {
            t520Var = (t520) zjeVar;
            int i2 = t520Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t520Var.t = i2 - Integer.MIN_VALUE;
            } else {
                t520Var = new t520(this, zjeVar);
            }
        } else {
            t520Var = new t520(this, zjeVar);
        }
        Object obj = t520Var.r;
        wne wneVar = wne.f39444a;
        int i3 = t520Var.t;
        if (i3 == 0) {
            z1x.P(obj);
            int i4 = (this.e0.f24244a || !Intrinsics.d(hxuVar, hxu.h)) ? 1 : 0;
            double d4 = stepInputUiModel.f46474a;
            double dDoubleValue = coefStepInputUiModel.f46473a.doubleValue();
            double d5 = ((lye) this.z.f22172a.f10647a).f20858a.j;
            boolean z3 = this.m.a().k;
            p7m0 p7m0VarB = this.O.b();
            t520Var.i = hxuVar;
            t520Var.j = q4fVar;
            t520Var.k = stepInputUiModel;
            cl5 cl5Var2 = this.l;
            t520Var.l = cl5Var2;
            t520Var.m = i4;
            t520Var.n = d4;
            t520Var.o = dDoubleValue;
            t520Var.p = d5;
            t520Var.q = z3;
            z = true;
            t520Var.t = 1;
            Object objM = ntb.M(p7m0VarB, t520Var);
            if (objM == wneVar) {
                return wneVar;
            }
            z2 = z3;
            d = d4;
            cl5Var = cl5Var2;
            hxuVar2 = hxuVar;
            stepInputUiModel2 = stepInputUiModel;
            i = i4;
            obj = objM;
            q4fVar2 = q4fVar;
            d2 = dDoubleValue;
            d3 = d5;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z4 = t520Var.q;
            double d6 = t520Var.p;
            double d7 = t520Var.o;
            double d8 = t520Var.n;
            i = t520Var.m;
            cl5 cl5Var3 = t520Var.l;
            stepInputUiModel2 = t520Var.k;
            q4f q4fVar3 = t520Var.j;
            hxuVar2 = t520Var.i;
            z1x.P(obj);
            z2 = z4;
            z = true;
            d2 = d7;
            d3 = d6;
            d = d8;
            cl5Var = cl5Var3;
            q4fVar2 = q4fVar3;
        }
        en7 en7Var = (en7) obj;
        int i5 = en7Var != null ? en7Var.b : 0;
        cl5Var.getClass();
        double dT = cl5.t(d, d2, d3, z2, i5, q4fVar2);
        boolean z5 = i != 0 ? z : false;
        String str = stepInputUiModel2.f;
        double d9 = hxuVar2.f.b;
        str.getClass();
        ctf0 ctf0Var = this.i;
        ctf0Var.getClass();
        String strG = gfx.G(q4fVar2, z5, false, ctf0Var);
        int i6 = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        if (z5) {
            dT = d9;
        }
        String strE = cy7.e(pn40.p(str, dT));
        ArrayList arrayList = new ArrayList();
        bnk0 bnk0Var = new bnk0();
        pzw.E(bnk0Var, strG.concat(Separators.SP), 0, 0, 0, R.attr.uikitTextPrimary, 30);
        pzw.E(bnk0Var, strE, 0, 0, 1, R.attr.uikitCommerce, 14);
        return new inb0(w6x.l(arrayList, bnk0Var.f2888a, arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(zje zjeVar) {
        u520 u520Var;
        if (zjeVar instanceof u520) {
            u520Var = (u520) zjeVar;
            int i = u520Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u520Var.k = i - Integer.MIN_VALUE;
            } else {
                u520Var = new u520(this, zjeVar);
            }
        } else {
            u520Var = new u520(this, zjeVar);
        }
        Object objG = u520Var.i;
        wne wneVar = wne.f39444a;
        int i2 = u520Var.k;
        if (i2 == 0) {
            z1x.P(objG);
            bm5 bm5Var = bm5.i;
            u520Var.k = 1;
            objG = khf0.G(this.A, bm5Var, u520Var);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        this.B.l(bm5.i, (ql5) objG);
        return objG;
    }
}
