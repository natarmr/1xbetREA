package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class qg20 extends w46 {
    public final kxu A;
    public final nvu A0;
    public final gs B;
    public final r4v B0;
    public final lbu C;
    public final gs C0;
    public final dzu D;
    public final xre D0;
    public final zlt0 E;
    public final m0u E0;
    public final ert F;
    public final gs F0;
    public final j9c G;
    public final ipc G0;
    public final lsn H;
    public final reu H0;
    public final pv00 I;
    public final ih5 I0;
    public final ymv J;
    public final l7k J0;
    public final gr00 K;
    public final cmt K0;
    public final hst L;
    public bby L0;
    public final rq M;
    public bby M0;
    public final tqc N;
    public c4m0 N0;
    public final mpc O;
    public bby O0;
    public final phf0 P;
    public bby P0;
    public final hst Q;
    public c4m0 Q0;
    public final tqc R;
    public c4m0 R0;
    public final ort S;
    public c4m0 S0;
    public final u4a T;
    public final nwo0 T0;
    public final j9c U;
    public final p7m0 U0;
    public final o4a V;
    public final p7m0 V0;
    public final mpc W;
    public final ol60 W0;
    public final ni9 X;
    public final p7m0 X0;
    public final pyu Y;
    public final p7m0 Y0;
    public final q4u Z;
    public final p7m0 Z0;
    public final pyu a0;
    public final p7m0 a1;
    public final boolean b;
    public final reu b0;
    public final p7m0 b1;
    public final khf0 c;
    public final w5z c0;
    public final ol60 c1;
    public final mne d;
    public final svu d0;
    public final p7m0 d1;
    public final v88 e;
    public final b8u e0;
    public final p7m0 e1;
    public final i1w0 f;
    public final yk5 f0;
    public final p7m0 f1;
    public final ctf0 g;
    public final ni9 g0;
    public final p7m0 g1;
    public final a6u h;
    public final mpc h0;
    public final p7m0 h1;
    public final j9c i;
    public final uqx i0;
    public final qoj0 i1;
    public final g2v j;
    public final tqc j0;
    public final qoj0 j1;
    public final onv k;
    public final vzg0 k0;
    public final qoj0 k1;
    public final g320 l;
    public final u0u l0;
    public final p7m0 l1;
    public final daf m;
    public final dnv m0;
    public final p7m0 m1;
    public final wdu n;
    public final fqc n0;
    public final p7m0 n1;
    public final o3c o;
    public final bsu o0;
    public final p7m0 o1;
    public final ieu p;
    public final urt p0;
    public final p7m0 p1;
    public final eti0 q;
    public final mii0 q0;
    public final qoj0 q1;
    public final ni9 r;
    public final ih5 r0;
    public final p7m0 r1;
    public final znt s;
    public final gg5 s0;
    public final p7m0 s1;
    public final duj t;
    public final x20 t0;
    public final ctj t1;
    public final tmt u;
    public final rxu u0;
    public final p7m0 u1;
    public final pru v;
    public final ot v0;
    public final hsj w;
    public final jyg0 w0;
    public final m1e x;
    public final fl70 x0;
    public final cl5 y;
    public final bst y0;
    public final ert z;
    public final es z0;

    public qg20(boolean z, khf0 khf0Var, mne mneVar, v88 v88Var, i1w0 i1w0Var, ctf0 ctf0Var, a6u a6uVar, j9c j9cVar, g2v g2vVar, onv onvVar, g320 g320Var, daf dafVar, wdu wduVar, o3c o3cVar, ieu ieuVar, eti0 eti0Var, ni9 ni9Var, znt zntVar, duj dujVar, tmt tmtVar, pru pruVar, gs gsVar, hsj hsjVar, m1e m1eVar, cl5 cl5Var, ert ertVar, kxu kxuVar, gs gsVar2, lbu lbuVar, dzu dzuVar, zlt0 zlt0Var, ert ertVar2, j9c j9cVar2, lsn lsnVar, pv00 pv00Var, ymv ymvVar, gr00 gr00Var, hst hstVar, rq rqVar, tqc tqcVar, mpc mpcVar, phf0 phf0Var, hst hstVar2, tqc tqcVar2, ort ortVar, u4a u4aVar, j9c j9cVar3, k52 k52Var, o4a o4aVar, mpc mpcVar2, ni9 ni9Var2, pyu pyuVar, q4u q4uVar, pyu pyuVar2, reu reuVar, w5z w5zVar, svu svuVar, b8u b8uVar, yk5 yk5Var, ni9 ni9Var3, mpc mpcVar3, b8u b8uVar2, uqx uqxVar, tqc tqcVar3, vzg0 vzg0Var, u0u u0uVar, dnv dnvVar, fqc fqcVar, bsu bsuVar, urt urtVar, mii0 mii0Var, ih5 ih5Var, gg5 gg5Var, x20 x20Var, rxu rxuVar, ot otVar, jyg0 jyg0Var, fl70 fl70Var, bst bstVar, es esVar, nvu nvuVar, r4v r4vVar, gs gsVar3, xre xreVar, m0u m0uVar, gs gsVar4, ipc ipcVar, reu reuVar2, ih5 ih5Var2, l7k l7kVar, cmt cmtVar) {
        rwj rwjVar = mneVar.f22085a;
        dvj dvjVar = mneVar.b;
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = z;
        this.c = khf0Var;
        this.d = mneVar;
        this.e = v88Var;
        this.f = i1w0Var;
        this.g = ctf0Var;
        this.h = a6uVar;
        this.i = j9cVar;
        this.j = g2vVar;
        this.k = onvVar;
        this.l = g320Var;
        this.m = dafVar;
        this.n = wduVar;
        this.o = o3cVar;
        this.p = ieuVar;
        this.q = eti0Var;
        this.r = ni9Var;
        this.s = zntVar;
        this.t = dujVar;
        this.u = tmtVar;
        this.v = pruVar;
        this.w = hsjVar;
        this.x = m1eVar;
        this.y = cl5Var;
        this.z = ertVar;
        this.A = kxuVar;
        this.B = gsVar2;
        this.C = lbuVar;
        this.D = dzuVar;
        this.E = zlt0Var;
        this.F = ertVar2;
        this.G = j9cVar2;
        this.H = lsnVar;
        this.I = pv00Var;
        this.J = ymvVar;
        this.K = gr00Var;
        this.L = hstVar;
        this.M = rqVar;
        this.N = tqcVar;
        this.O = mpcVar;
        this.P = phf0Var;
        this.Q = hstVar2;
        this.R = tqcVar2;
        this.S = ortVar;
        this.T = u4aVar;
        this.U = j9cVar3;
        this.V = o4aVar;
        this.W = mpcVar2;
        this.X = ni9Var2;
        this.Y = pyuVar;
        this.Z = q4uVar;
        this.a0 = pyuVar2;
        this.b0 = reuVar;
        this.c0 = w5zVar;
        this.d0 = svuVar;
        this.e0 = b8uVar;
        this.f0 = yk5Var;
        this.g0 = ni9Var3;
        this.h0 = mpcVar3;
        this.i0 = uqxVar;
        this.j0 = tqcVar3;
        this.k0 = vzg0Var;
        this.l0 = u0uVar;
        this.m0 = dnvVar;
        this.n0 = fqcVar;
        this.o0 = bsuVar;
        this.p0 = urtVar;
        this.q0 = mii0Var;
        this.r0 = ih5Var;
        this.s0 = gg5Var;
        this.t0 = x20Var;
        this.u0 = rxuVar;
        this.v0 = otVar;
        this.w0 = jyg0Var;
        this.x0 = fl70Var;
        this.y0 = bstVar;
        this.z0 = esVar;
        this.A0 = nvuVar;
        this.B0 = r4vVar;
        this.C0 = gsVar3;
        this.D0 = xreVar;
        this.E0 = m0uVar;
        this.F0 = gsVar4;
        this.G0 = ipcVar;
        this.H0 = reuVar2;
        this.I0 = ih5Var2;
        this.J0 = l7kVar;
        this.K0 = cmtVar;
        nwo0 nwo0VarC = reuVar.c();
        this.T0 = nwo0VarC;
        this.U0 = q7m0.a(km5.f18522a);
        this.V0 = q7m0.a(0L);
        this.W0 = new ol60(3);
        this.X0 = q7m0.a(zq00.f44786a);
        this.Y0 = q7m0.a(p40.f26325a);
        this.Z0 = q7m0.a(new a40("", -1.0d));
        this.a1 = q7m0.a(ia20.f14416a);
        this.b1 = q7m0.a(ub50.f35363a);
        this.c1 = new ol60(3);
        StepInputUiModel stepInputUiModel = new StepInputUiModel(-1.0d, 0.0d, 1.0d, 0.0d, 0.0d, "", false, false, new AutoMaxUiModel(0.0d, false), true, true, true, false, true, false, false, true, false);
        StepInputUiModel stepInputUiModel2 = (StepInputUiModel) vzg0Var.a("SAVED_STATE_STEP_INPUT_KEY");
        p7m0 p7m0VarA = q7m0.a(stepInputUiModel2 != null ? stepInputUiModel2 : stepInputUiModel);
        this.d1 = p7m0VarA;
        this.e1 = q7m0.a(nwo0VarC.f24244a ? cwo0.f5091a : awo0.f1585a);
        this.f1 = q7m0.a(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.g1 = q7m0.a(bool);
        this.h1 = q7m0.a(hnb0.f13344a);
        i99 i99Var = i99.b;
        qoj0 qoj0VarA = roj0.a(1, 1, i99Var);
        this.i1 = qoj0VarA;
        this.j1 = roj0.a(0, 1, i99Var);
        this.k1 = roj0.a(0, 1, i99Var);
        this.l1 = q7m0.a(new fxo(new ixo("", 0.0d), new ixo("", 0.0d), new ixo("", 0.0d), false, false, false, true, false));
        this.m1 = q7m0.a(bool);
        this.n1 = q7m0.a(new rn20(false, false, false));
        this.o1 = q7m0.a(g920.CUSTOM);
        this.p1 = q7m0.a(0L);
        this.q1 = roj0.a(1, 1, i99Var);
        yje yjeVar = null;
        p7m0 p7m0VarA2 = q7m0.a(null);
        this.r1 = p7m0VarA2;
        this.s1 = q7m0.a(bh5.f2588a);
        ctj ctjVar = new ctj(0.0d, false);
        this.t1 = ctjVar;
        this.u1 = q7m0.a(ctjVar);
        sac.V(jiu0.a(this), gg20.f11232a, null, mneVar.f22085a, new ff20(this, yjeVar, (byte) 6), 10);
        bm5 bm5Var = bm5.i;
        byte b = 4;
        sac.T(new p6d(new fnq(i120.W(new fnq(b8uVar2.a(bm5Var), new o3s(this, yjeVar, (byte) 17), b)), new mt00((Object) this, yjeVar, (byte) 9)), m1eVar.b(), new vnu(this, null), (byte) 1), d5c.S(jiu0.a(this), dvjVar), new jf20(this, yjeVar, (byte) 0));
        sac.V(jiu0.a(this), new r520((byte) 10), null, mneVar.f22085a, new ff20(this, yjeVar, (byte) 3), 10);
        byte b2 = 2;
        sac.T(new fnq(((ave) gsVar.f11805a.c).o, new kf20(this, yjeVar, (byte) 0), b), d5c.S(jiu0.a(this), dvjVar), new sax(b2, yjeVar, (byte) 14));
        sac.T(new fnq(qoj0VarA, new kf20(this, yjeVar, b2), b), d5c.S(jiu0.a(this), dvjVar), new sax(b2, yjeVar, (byte) 17));
        sac.T(new fnq(i120.W(k52Var.a()), new yg1((Object) this, yjeVar, (byte) 19), b), d5c.S(jiu0.a(this), dvjVar), cg20.h);
        sac.T(new p6d(new fnq(m1eVar.b(), new ff20(this, yjeVar, (byte) 5), b), i120.W(new h2c(p7m0VarA, (byte) 15)), new jr9(this, yjeVar, b2), (byte) 1), d5c.S(jiu0.a(this), rwjVar), bg20.h);
        byte b3 = 22;
        sac.T(new fnq(new i89(p7m0VarA2, b3), new jf20(this, yjeVar, b2), b), d5c.S(jiu0.a(this), rwjVar), new jf20(this, yjeVar, (byte) 3));
        sac.T(new p6d(p7m0VarA, b8uVar2.a(bm5Var), new wx4(this, yjeVar, b3), (byte) 1), d5c.S(jiu0.a(this), rwjVar), wf20.h);
    }

    public static ank0 H(txu txuVar, StepInputUiModel stepInputUiModel) {
        ArrayList arrayList = new ArrayList();
        u400 u400Var = new u400(txuVar, stepInputUiModel, (byte) 26);
        bnk0 bnk0Var = new bnk0();
        u400Var.invoke(bnk0Var);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public final void A(hxu hxuVar, StepInputUiModel stepInputUiModel, q4f q4fVar, double d, ozc ozcVar, txu txuVar) {
        double d2 = stepInputUiModel.f46474a;
        double d3 = stepInputUiModel.d;
        double dB = stepInputUiModel.b();
        boolean z = stepInputUiModel.g;
        boolean zBooleanValue = ((Boolean) this.m1.getValue()).booleanValue();
        double d4 = stepInputUiModel.b;
        this.x0.getClass();
        if (fl70.c(d, d2, d3, dB, z, zBooleanValue, d4)) {
            this.y0.getClass();
            if (bst.g(q4fVar)) {
                this.O0 = sac.V(jiu0.a(this), new cd20(this, (byte) 2), null, this.d.b, new s6d(this, hxuVar, ozcVar, stepInputUiModel, txuVar, q4fVar, (yje) null), 10);
                return;
            }
        }
        e0(hnb0.f13344a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object B(hxu hxuVar, ozc ozcVar, StepInputUiModel stepInputUiModel, txu txuVar, q4f q4fVar, zje zjeVar) {
        pe20 pe20Var;
        double dK;
        hxu hxuVar2;
        ozc ozcVar2;
        txu txuVar2;
        boolean z;
        Object objM;
        double d;
        q4f q4fVar2;
        cl5 cl5Var;
        double d2;
        boolean z2;
        StepInputUiModel stepInputUiModel2;
        ivo0 ivo0Var;
        if (zjeVar instanceof pe20) {
            pe20Var = (pe20) zjeVar;
            int i = pe20Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                pe20Var.u = i - Integer.MIN_VALUE;
            } else {
                pe20Var = new pe20(this, zjeVar);
            }
        } else {
            pe20Var = new pe20(this, zjeVar);
        }
        Object obj = pe20Var.s;
        wne wneVar = wne.f39444a;
        int i2 = pe20Var.u;
        if (i2 == 0) {
            z1x.P(obj);
            double d3 = stepInputUiModel.f46474a;
            dK = K(this.w.i());
            double d4 = ((lye) this.h0.f22172a.f10647a).f20858a.j;
            boolean z3 = this.z.a().k;
            p7m0 p7m0VarB = this.F.b();
            hxuVar2 = hxuVar;
            pe20Var.i = hxuVar2;
            ozcVar2 = ozcVar;
            pe20Var.j = ozcVar2;
            pe20Var.k = stepInputUiModel;
            txuVar2 = txuVar;
            pe20Var.l = txuVar2;
            pe20Var.m = q4fVar;
            cl5 cl5Var2 = this.y;
            pe20Var.n = cl5Var2;
            pe20Var.o = d3;
            pe20Var.p = dK;
            pe20Var.q = d4;
            pe20Var.r = z3;
            z = true;
            pe20Var.u = 1;
            objM = ntb.M(p7m0VarB, pe20Var);
            if (objM == wneVar) {
                return wneVar;
            }
            d = d4;
            q4fVar2 = q4fVar;
            cl5Var = cl5Var2;
            d2 = d3;
            z2 = z3;
            stepInputUiModel2 = stepInputUiModel;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z4 = pe20Var.r;
            double d5 = pe20Var.q;
            dK = pe20Var.p;
            double d6 = pe20Var.o;
            cl5 cl5Var3 = pe20Var.n;
            q4f q4fVar3 = pe20Var.m;
            txu txuVar3 = pe20Var.l;
            StepInputUiModel stepInputUiModel3 = pe20Var.k;
            ozc ozcVar3 = pe20Var.j;
            hxu hxuVar3 = pe20Var.i;
            z1x.P(obj);
            objM = obj;
            stepInputUiModel2 = stepInputUiModel3;
            ozcVar2 = ozcVar3;
            txuVar2 = txuVar3;
            hxuVar2 = hxuVar3;
            d2 = d6;
            z2 = z4;
            z = true;
            d = d5;
            cl5Var = cl5Var3;
            q4fVar2 = q4fVar3;
        }
        double d7 = dK;
        double d8 = d;
        en7 en7Var = (en7) objM;
        int i3 = en7Var != null ? en7Var.b : 0;
        cl5Var.getClass();
        double dT = cl5.t(d2, d7, d8, z2, i3, q4fVar2);
        String str = stepInputUiModel2.f;
        boolean zY = y();
        nwo0 nwo0Var = this.T0;
        boolean z5 = (nwo0Var.f24244a || (nwo0Var.b && !Intrinsics.d(hxuVar2, hxu.h))) ? z : false;
        boolean z6 = ((StepInputUiModel) this.d1.getValue()).r;
        str.getClass();
        hxuVar2.getClass();
        ozcVar2.getClass();
        ctf0 ctf0Var = this.g;
        ctf0Var.getClass();
        String strF = gfx.F(ozcVar2, (z5 || ((txuVar2 == null || (ivo0Var = txuVar2.g) == null || (ivo0Var.b > 0.0d ? 1 : (ivo0Var.b == 0.0d ? 0 : -1)) <= 0) ? false : z)) ? z : false, z6, zY, ctf0Var);
        String strW = xdx.w(dT, str, hxuVar2, txuVar2);
        ArrayList arrayList = new ArrayList();
        bnk0 bnk0Var = new bnk0();
        pzw.E(bnk0Var, strF.concat(Separators.SP), 0, 0, 0, 0, 62);
        pzw.E(bnk0Var, strW, 0, 0, 1, R.attr.uikitCommerce, 14);
        return new inb0(w6x.l(arrayList, bnk0Var.f2888a, arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object C(long j, double d, boolean z, String str, boolean z2, zje zjeVar) {
        se20 se20Var;
        long j2;
        double d2;
        boolean z3;
        ieu ieuVar;
        boolean z4;
        if (zjeVar instanceof se20) {
            se20Var = (se20) zjeVar;
            int i = se20Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                se20Var.p = i - Integer.MIN_VALUE;
            } else {
                se20Var = new se20(this, zjeVar);
            }
        } else {
            se20Var = new se20(this, zjeVar);
        }
        se20 se20Var2 = se20Var;
        Object obj = se20Var2.n;
        wne wneVar = wne.f39444a;
        int i2 = se20Var2.p;
        if (i2 == 0) {
            z1x.P(obj);
            ieu ieuVar2 = this.p;
            se20Var2.m = ieuVar2;
            se20Var2.i = j;
            se20Var2.j = d;
            se20Var2.k = z;
            se20Var2.l = z2;
            se20Var2.p = 1;
            Object objF = this.m.F(d, j, null, se20Var2, null, str, z, z2);
            if (objF != wneVar) {
                j2 = j;
                d2 = d;
                z3 = z;
                ieuVar = ieuVar2;
                obj = objF;
                z4 = z2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z4 = se20Var2.l;
        z3 = se20Var2.k;
        d2 = se20Var2.j;
        j2 = se20Var2.i;
        ieuVar = se20Var2.m;
        z1x.P(obj);
        byte b = this.v.a().I1.f26017a;
        se20Var2.m = null;
        se20Var2.i = j2;
        se20Var2.j = d2;
        se20Var2.k = z3;
        se20Var2.l = z4;
        se20Var2.p = 2;
        Object objP = ieuVar.p((ouj0) obj, 0L, b, se20Var2);
        return objP == wneVar ? wneVar : objP;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object D(long j, double d, boolean z, String str, boolean z2, zje zjeVar) {
        te20 te20Var;
        long j2;
        double d2;
        boolean z3;
        g320 g320Var;
        boolean z4;
        if (zjeVar instanceof te20) {
            te20Var = (te20) zjeVar;
            int i = te20Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                te20Var.p = i - Integer.MIN_VALUE;
            } else {
                te20Var = new te20(this, zjeVar);
            }
        } else {
            te20Var = new te20(this, zjeVar);
        }
        te20 te20Var2 = te20Var;
        Object obj = te20Var2.n;
        wne wneVar = wne.f39444a;
        int i2 = te20Var2.p;
        if (i2 == 0) {
            z1x.P(obj);
            g320 g320Var2 = this.l;
            te20Var2.m = g320Var2;
            te20Var2.i = j;
            te20Var2.j = d;
            te20Var2.k = z;
            te20Var2.l = z2;
            te20Var2.p = 1;
            Object objF = this.m.F(d, j, null, te20Var2, null, str, z, z2);
            if (objF != wneVar) {
                j2 = j;
                d2 = d;
                z3 = z;
                g320Var = g320Var2;
                obj = objF;
                z4 = z2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z4 = te20Var2.l;
        z3 = te20Var2.k;
        d2 = te20Var2.j;
        j2 = te20Var2.i;
        g320Var = te20Var2.m;
        z1x.P(obj);
        byte b = this.v.a().I1.f26017a;
        te20Var2.m = null;
        te20Var2.i = j2;
        te20Var2.j = d2;
        te20Var2.k = z3;
        te20Var2.l = z4;
        te20Var2.p = 2;
        Object objB = g320Var.b((ouj0) obj, 0L, b, te20Var2);
        return objB == wneVar ? wneVar : objB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r0 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (r0 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(a.q4f r13, long r14, double r16, double r18, boolean r20, boolean r21, java.lang.String r22, a.zje r23) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r23
            boolean r1 = r0 instanceof a.ue20
            if (r1 == 0) goto L16
            r1 = r0
            a.ue20 r1 = (a.ue20) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.k = r2
        L14:
            r10 = r1
            goto L1c
        L16:
            a.ue20 r1 = new a.ue20
            r1.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r10.i
            a.wne r1 = a.wne.f39444a
            int r2 = r10.k
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            a.z1x.P(r0)
            goto L63
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            r12 = 0
            return r12
        L38:
            a.z1x.P(r0)
            goto L97
        L3d:
            a.z1x.P(r0)
            return r0
        L41:
            a.z1x.P(r0)
            int r13 = r13.ordinal()
            r0 = 10
            if (r13 == r0) goto L84
            r0 = 11
            if (r13 == r0) goto L6f
            r10.k = r3
            r2 = r12
            r3 = r14
            r5 = r16
            r9 = r20
            r7 = r21
            r8 = r22
            java.lang.Object r0 = r2.D(r3, r5, r7, r8, r9, r10)
            if (r0 != r1) goto L63
            goto L96
        L63:
            java.util.List r12 = kotlin.collections.a.c(r0)
            a.iun r13 = a.iun.f15405a
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r12, r13)
            return r14
        L6f:
            r10.k = r5
            r2 = r12
            r3 = r14
            r5 = r16
            r7 = r18
            r9 = r20
            r11 = r10
            r10 = r22
            java.io.Serializable r12 = r2.F(r3, r5, r7, r9, r10, r11)
            if (r12 != r1) goto L83
            goto L96
        L83:
            return r12
        L84:
            r10.k = r4
            r2 = r12
            r3 = r14
            r5 = r16
            r9 = r20
            r7 = r21
            r8 = r22
            java.lang.Object r0 = r2.C(r3, r5, r7, r8, r9, r10)
            if (r0 != r1) goto L97
        L96:
            return r1
        L97:
            java.util.List r12 = kotlin.collections.a.c(r0)
            a.iun r13 = a.iun.f15405a
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qg20.E(a.q4f, long, double, double, boolean, boolean, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Serializable F(long j, double d, double d2, boolean z, String str, zje zjeVar) throws Throwable {
        ve20 ve20Var;
        long j2;
        double d3;
        double d4;
        boolean z2;
        ArrayList arrayList;
        if (zjeVar instanceof ve20) {
            ve20Var = (ve20) zjeVar;
            int i = ve20Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ve20Var.p = i - Integer.MIN_VALUE;
            } else {
                ve20Var = new ve20(this, zjeVar);
            }
        } else {
            ve20Var = new ve20(this, zjeVar);
        }
        ve20 ve20Var2 = ve20Var;
        Object objN = ve20Var2.n;
        wne wneVar = wne.f39444a;
        int i2 = ve20Var2.p;
        if (i2 != 0) {
            if (i2 == 1) {
                z2 = ve20Var2.l;
                d4 = ve20Var2.k;
                d3 = ve20Var2.j;
                j2 = ve20Var2.i;
                z1x.P(objN);
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = ve20Var2.m;
                z1x.P(objN);
            }
            return new Pair(objN, arrayList);
        }
        z1x.P(objN);
        ve20Var2.i = j;
        ve20Var2.j = d;
        ve20Var2.k = d2;
        ve20Var2.l = z;
        ve20Var2.p = 1;
        objN = this.o.n(j, d, d2, z, str, ve20Var2);
        if (objN != wneVar) {
            j2 = j;
            d3 = d;
            d4 = d2;
            z2 = z;
        }
        return wneVar;
        nw40 nw40Var = (nw40) objN;
        List list = nw40Var.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList2, ((ouj0) it.next()).e);
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            axq.t(((ru6) it2.next()).d, arrayList3);
        }
        ve20Var2.m = arrayList3;
        ve20Var2.i = j2;
        ve20Var2.j = d3;
        ve20Var2.k = d4;
        ve20Var2.l = z2;
        ve20Var2.p = 2;
        wdu wduVar = this.n;
        ((ha20) wduVar.b).c.m.clear();
        ((ave) ((g45) wduVar.i).c).n.clear();
        objN = wduVar.J(nw40Var, 0L, ve20Var2);
        if (objN != wneVar) {
            arrayList = arrayList3;
            return new Pair(objN, arrayList);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(zje zjeVar) {
        ze20 ze20Var;
        if (zjeVar instanceof ze20) {
            ze20Var = (ze20) zjeVar;
            int i = ze20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ze20Var.k = i - Integer.MIN_VALUE;
            } else {
                ze20Var = new ze20(this, zjeVar);
            }
        } else {
            ze20Var = new ze20(this, zjeVar);
        }
        Object objG = ze20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ze20Var.k;
        if (i2 == 0) {
            z1x.P(objG);
            bm5 bm5Var = bm5.i;
            ze20Var.k = 1;
            objG = khf0.G(this.c, bm5Var, ze20Var);
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
        this.v0.a(bm5.i, (ql5) objG);
        return objG;
    }

    public final xuj0 I() {
        int iA = ((hst) this.j.f10580a).a();
        ctf0 ctf0Var = this.g;
        if (iA < 3) {
            return new uuj0(new xdk0(pek0.f26859a, ctf0Var.f(R.string.need_more_blocks_for_multibet, new Object[0]), null, null, null, null, 124));
        }
        if (this.k.r()) {
            return null;
        }
        return new ruj0(ctf0Var.f(R.string.uncorrect_multibet, new Object[0]));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J(q4f q4fVar, zje zjeVar) {
        af20 af20Var;
        if (zjeVar instanceof af20) {
            af20Var = (af20) zjeVar;
            int i = af20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                af20Var.k = i - Integer.MIN_VALUE;
            } else {
                af20Var = new af20(this, zjeVar);
            }
        } else {
            af20Var = new af20(this, zjeVar);
        }
        Object objM = af20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = af20Var.k;
        if (i2 == 0) {
            z1x.P(objM);
            if (q3d.j(q4f.c, q4f.d).contains(q4fVar)) {
                p7m0 p7m0Var = ((lye) ((khf0) this.H0.b).b).q;
                af20Var.k = 1;
                objM = ntb.M(p7m0Var, af20Var);
                if (objM == wneVar) {
                    return wneVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objM);
        d680 d680Var = (d680) objM;
        if (d680Var != null) {
            if (d680Var.f5540a == 0.0d) {
                d680Var = null;
            }
            if (d680Var != null) {
                return d680Var.b;
            }
        }
        return null;
    }

    public final double K(double d) {
        if (((StepInputUiModel) this.d1.getValue()).r) {
            double d2 = this.U.c().e0;
            if (d2 != 0.0d) {
                return d2;
            }
        }
        return d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object L(oa20 oa20Var, q4f q4fVar, boolean z, zje zjeVar) {
        bf20 bf20Var;
        pn40 pn40Var;
        double d;
        cl5 cl5Var;
        boolean z2;
        double d2;
        double d3;
        q4f q4fVar2;
        if (zjeVar instanceof bf20) {
            bf20Var = (bf20) zjeVar;
            int i = bf20Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                bf20Var.r = i - Integer.MIN_VALUE;
            } else {
                bf20Var = new bf20(this, zjeVar);
            }
        } else {
            bf20Var = new bf20(this, zjeVar);
        }
        Object obj = bf20Var.p;
        wne wneVar = wne.f39444a;
        int i2 = bf20Var.r;
        if (i2 == 0) {
            z1x.P(obj);
            if (!z) {
                this.y0.getClass();
                if (bst.g(q4fVar)) {
                    pn40Var = pn40.f27267a;
                    d = ((StepInputUiModel) this.d1.getValue()).f46474a;
                    double dK = K(oa20Var.f);
                    double d4 = ((lye) this.h0.f22172a.f10647a).f20858a.j;
                    boolean z3 = this.z.a().k;
                    p7m0 p7m0VarB = this.F.b();
                    bf20Var.i = q4fVar;
                    bf20Var.j = pn40Var;
                    cl5 cl5Var2 = this.y;
                    bf20Var.k = cl5Var2;
                    bf20Var.m = d;
                    bf20Var.n = dK;
                    bf20Var.o = d4;
                    bf20Var.l = z3;
                    bf20Var.r = 1;
                    Object objM = ntb.M(p7m0VarB, bf20Var);
                    if (objM == wneVar) {
                        return wneVar;
                    }
                    cl5Var = cl5Var2;
                    z2 = z3;
                    obj = objM;
                    d2 = dK;
                    d3 = d4;
                    q4fVar2 = q4fVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z4 = bf20Var.l;
        double d5 = bf20Var.o;
        double d6 = bf20Var.n;
        d = bf20Var.m;
        cl5Var = bf20Var.k;
        pn40Var = bf20Var.j;
        q4f q4fVar3 = bf20Var.i;
        z1x.P(obj);
        z2 = z4;
        q4fVar2 = q4fVar3;
        d3 = d5;
        d2 = d6;
        double d7 = d;
        en7 en7Var = (en7) obj;
        int i3 = en7Var != null ? en7Var.b : 0;
        cl5Var.getClass();
        double dT = cl5.t(d7, d2, d3, z2, i3, q4fVar2);
        pn40Var.getClass();
        return pn40.o(dT);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object M(List list, q4f q4fVar, long j, boolean z, zje zjeVar) {
        ef20 ef20Var;
        if (zjeVar instanceof ef20) {
            ef20Var = (ef20) zjeVar;
            int i = ef20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ef20Var.k = i - Integer.MIN_VALUE;
            } else {
                ef20Var = new ef20(this, zjeVar);
            }
        } else {
            ef20Var = new ef20(this, zjeVar);
        }
        ef20 ef20Var2 = ef20Var;
        Object obj = ef20Var2.i;
        Object obj2 = wne.f39444a;
        int i2 = ef20Var2.k;
        if (i2 == 0) {
            ArrayList arrayListT = twn.t(obj);
            for (Object obj3 : list) {
                if (obj3 instanceof oa20) {
                    arrayListT.add(obj3);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof na20) {
                    arrayList.add(obj4);
                }
            }
            if (q4fVar != q4f.m) {
                if (arrayList.isEmpty()) {
                    ((ave) this.F0.f11805a.c).n.clear();
                } else {
                    this.C0.c(arrayList);
                }
            }
            boolean zIsEmpty = arrayListT.isEmpty();
            ctf0 ctf0Var = this.g;
            if (zIsEmpty && !arrayList.isEmpty()) {
                na20 na20Var = (na20) CollectionsKt.U(arrayList);
                kuw kuwVar = na20Var.b;
                String strA = na20Var.c;
                if (StringsKt.W(strA)) {
                    strA = ctf0Var.b.a(R.string.bet_not_processed, Arrays.copyOf(new Object[0], 0));
                }
                O(kuwVar, strA, true);
            } else if (arrayListT.isEmpty()) {
                this.W0.f(new uuj0(new xdk0(rek0.b, ctf0Var.f(R.string.bet_not_processed, new Object[0]), null, null, null, null, 124)));
                c0();
            } else {
                ef20Var2.k = 1;
                if (P(q4fVar, j, arrayListT, arrayList, z, ef20Var2) == obj2) {
                    return obj2;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        c0();
        return Unit.f46060a;
    }

    public final void N(boolean z) {
        g0(V(z) ? xvo0.f41571a : awo0.f1585a);
    }

    public final void O(kuw kuwVar, String str, boolean z) {
        jdk0 jdk0Var = jdk0.f16332a;
        pek0 pek0Var = pek0.f26859a;
        rek0 rek0Var = rek0.b;
        boolean zIsEmpty = ((ave) this.r.f23572a.c).n.isEmpty();
        yje yjeVar = null;
        mne mneVar = this.d;
        if (!zIsEmpty) {
            sac.V(jiu0.a(this), rf20.f30366a, null, mneVar.b, new ff20(this, yjeVar, (byte) 4), 10);
        }
        i2o i2oVar = i2o.NeedToConfirmEula;
        duj dujVar = this.t;
        if (kuwVar == i2oVar) {
            c0();
            dujVar.d();
            return;
        }
        byte b = 0;
        ctf0 ctf0Var = this.g;
        ol60 ol60Var = this.W0;
        if (z && kuwVar != i2o.q && this.i.a() == q4f.m) {
            c0();
            ol60Var.f(new uuj0(new xdk0(rek0Var, ctf0Var.b.a(R.string.bet_not_processed, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124)));
            return;
        }
        if (kuwVar == i2o.IdentificationNotPassed2) {
            c0();
            dujVar.c(str);
            return;
        }
        if (kuwVar == i2o.q) {
            c0();
            ol60Var.f(new quj0(str));
            return;
        }
        if (kuwVar == i2o.BetExistsError) {
            ol60Var.f(new puj0(str));
            return;
        }
        if (kuwVar == i2o.CoefficientBlockCode || kuwVar == i2o.GameLocked || kuwVar == i2o.Locked) {
            c0();
            ol60Var.f(new uuj0(new xdk0(pek0Var, ctf0Var.f(R.string.bet_error_coef_block, new Object[0]), null, null, jdk0Var, Integer.valueOf(R.drawable.ic_snack_lock), 76)));
            sac.V(jiu0.a(this), new r520((byte) 7), null, mneVar.b, new ff20(this, yjeVar, b), 10);
            return;
        }
        if (kuwVar == i2o.CoefficientChangeCode) {
            c0();
            sac.V(jiu0.a(this), new r520((byte) 6), new dd20(this, b), mneVar.b, new ff20(this, yjeVar, (byte) 1), 8);
            return;
        }
        if (kuwVar != i2o.A && kuwVar != i2o.GameIsNotInLine && kuwVar != i2o.WrongGameBet) {
            c0();
            ol60Var.f(new uuj0(new xdk0(rek0Var, str, null, null, null, null, 124)));
        } else {
            c0();
            ol60Var.f(new uuj0(new xdk0(pek0Var, str, null, null, jdk0Var, null, 108)));
            sac.V(jiu0.a(this), new r520((byte) 8), null, mneVar.b, new ff20(this, yjeVar, (byte) 2), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:48:0x0123  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131 A[LOOP:0: B:49:0x012b->B:51:0x0131, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0151  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0175  */
    /* JADX WARN: Code duplicated, block: B:65:0x0178  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016f, code lost:
    
        if (r19.n0.a(r4) == r5) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(a.q4f r20, long r21, java.util.ArrayList r23, java.util.ArrayList r24, boolean r25, a.zje r26) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qg20.P(a.q4f, long, java.util.ArrayList, java.util.ArrayList, boolean, a.zje):java.lang.Object");
    }

    public final void Q(boolean z) {
        Object g0g0Var;
        Object obj;
        p40 p40Var = p40.f26325a;
        p7m0 p7m0Var = this.Y0;
        bby bbyVar = this.M0;
        if (bbyVar == null || !bbyVar.isActive()) {
            try {
                e0g0 e0g0Var = j0g0.b;
                boolean z2 = this.v.a().f32117a.f12063a.b;
                if (z2 && z) {
                    obj = n40.f22874a;
                } else {
                    obj = (!z2 || z) ? p40Var : l40.f19380a;
                }
                p7m0Var.getClass();
                p7m0Var.o(null, obj);
                g0g0Var = Unit.f46060a;
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            Throwable thA = j0g0.a(g0g0Var);
            if (thA != null) {
                thA.printStackTrace();
                p7m0Var.getClass();
                p7m0Var.o(null, p40Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(ql5 ql5Var, zje zjeVar) {
        lf20 lf20Var;
        if (zjeVar instanceof lf20) {
            lf20Var = (lf20) zjeVar;
            int i = lf20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lf20Var.k = i - Integer.MIN_VALUE;
            } else {
                lf20Var = new lf20(this, zjeVar);
            }
        } else {
            lf20Var = new lf20(this, zjeVar);
        }
        Object objA = lf20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = lf20Var.k;
        p7m0 p7m0Var = this.u1;
        if (i2 == 0) {
            z1x.P(objA);
            if (Intrinsics.d(p7m0Var.getValue(), this.t1)) {
                lf20Var.k = 1;
                objA = this.Z.f28119a.a(ql5Var, lf20Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        ctj ctjVar = new ctj(((c3j0) objA).b, this.Y.k());
        p7m0Var.getClass();
        p7m0Var.o(null, ctjVar);
        return Unit.f46060a;
    }

    public final void S() {
        sac.V(jiu0.a(this), new cd20(this, (byte) 3), null, this.d.b, new fhq(this, null, (byte) 24), 10);
    }

    public final boolean T(StepInputUiModel stepInputUiModel) {
        double d = stepInputUiModel.d;
        double dB = stepInputUiModel.b();
        double d2 = stepInputUiModel.f46474a;
        if ((d > d2 || d2 > dB) && d2 != stepInputUiModel.b) {
            return (stepInputUiModel.g || ((Boolean) this.m1.getValue()).booleanValue()) && d2 > stepInputUiModel.b();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U(q4f q4fVar, double d, ytb0 ytb0Var, zje zjeVar) {
        mf20 mf20Var;
        if (zjeVar instanceof mf20) {
            mf20Var = (mf20) zjeVar;
            int i = mf20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                mf20Var.l = i - Integer.MIN_VALUE;
            } else {
                mf20Var = new mf20(this, zjeVar);
            }
        } else {
            mf20Var = new mf20(this, zjeVar);
        }
        Object objX = mf20Var.j;
        Object obj = wne.f39444a;
        int i2 = mf20Var.l;
        if (i2 == 0) {
            z1x.P(objX);
            mf20Var.i = ytb0Var;
            mf20Var.l = 1;
            objX = x(q4fVar, d, mf20Var);
            if (objX == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ytb0Var = mf20Var.i;
            z1x.P(objX);
        }
        return Boolean.valueOf(((Boolean) objX).booleanValue() && !ytb0Var.b);
    }

    public final boolean V(boolean z) {
        nwo0 nwo0Var = this.T0;
        return (nwo0Var.f24244a || (nwo0Var.b && ((Boolean) this.f1.getValue()).booleanValue())) && z;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:40:0x0136  */
    /* JADX WARN: Code duplicated, block: B:44:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0166 -> B:53:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01c6 -> B:52:0x01cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object W(java.util.List r28, java.util.List r29, a.q4f r30, boolean r31, a.zje r32) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qg20.W(java.util.List, java.util.List, a.q4f, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0166  */
    /* JADX WARN: Code duplicated, block: B:51:0x0190  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01db, code lost:
    
        if (r25.c0.V(r4, r5, r6, r7, r12, r10, r11, r15, r14) == r2) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(java.util.List r26, java.util.List r27, boolean r28, a.zje r29) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qg20.X(java.util.List, java.util.List, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:38:0x0117 A[PHI: r2 r4 r6 r7 r8
  0x0117: PHI (r2v13 double) = (r2v12 double), (r2v12 double), (r2v19 double) binds: [B:40:0x013c, B:36:0x0114, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r4v7 java.util.List) = (r4v6 java.util.List), (r4v6 java.util.List), (r4v12 java.util.List) binds: [B:40:0x013c, B:36:0x0114, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r6v6 a.ytb0) = (r6v5 a.ytb0), (r6v5 a.ytb0), (r6v12 a.ytb0) binds: [B:40:0x013c, B:36:0x0114, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r7v7 a.ql5) = (r7v6 a.ql5), (r7v6 a.ql5), (r7v12 a.ql5) binds: [B:40:0x013c, B:36:0x0114, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r8v5 a.q4f) = (r8v4 a.q4f), (r8v4 a.q4f), (r8v8 a.q4f) binds: [B:40:0x013c, B:36:0x0114, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0119  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015b, code lost:
    
        if (M(r1, r8, r4, r0, r11) == r12) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(a.q4f r21, a.ql5 r22, double r23, a.ytb0 r25, a.zje r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qg20.Y(a.q4f, a.ql5, double, a.ytb0, a.zje):java.lang.Object");
    }

    public final void Z(double d) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.d1;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, StepInputUiModel.a((StepInputUiModel) value, d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, false, 258046)));
        g920 g920Var = g920.FAST;
        p7m0 p7m0Var2 = this.o1;
        p7m0Var2.getClass();
        p7m0Var2.o(null, g920Var);
        ytb0 ytb0Var = new ytb0(false, false, false);
        p7m0 p7m0Var3 = this.r1;
        p7m0Var3.getClass();
        p7m0Var3.o(null, ytb0Var);
    }

    public final void a0() {
        g920 g920Var = g920.CUSTOM;
        p7m0 p7m0Var = this.o1;
        p7m0Var.getClass();
        p7m0Var.o(null, g920Var);
        ytb0 ytb0Var = new ytb0(false, false, false);
        p7m0 p7m0Var2 = this.r1;
        p7m0Var2.getClass();
        p7m0Var2.o(null, ytb0Var);
    }

    public final void b0() {
        byte b = 1;
        sac.V(jiu0.a(this), new cd20(this, b), new dd20(this, b), this.d.b, new mt00((Object) this, (yje) null, (byte) 11), 8);
    }

    public final void c0() {
        this.r1.n(null);
    }

    public final void d0() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.l1;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, fxo.a((fxo) value, false, false, true, 15)));
    }

    public final void e0(jnb0 jnb0Var) {
        if (this.i.a() == q4f.h) {
            jnb0Var = hnb0.f13344a;
        }
        this.h1.n(jnb0Var);
    }

    public final void f0(StepInputUiModel stepInputUiModel, txu txuVar, hxu hxuVar, boolean z) {
        if (txuVar.g.b > 0.0d) {
            g0(new ewo0(H(txuVar, stepInputUiModel), rsm0.r(txuVar, stepInputUiModel.f, this.g)));
        } else if (txuVar.d.b > 0.0d || txuVar.f34720a.b > 0.0d) {
            g0(new ewo0(H(txuVar, stepInputUiModel), rsm0.q(hxuVar, stepInputUiModel.f)));
        } else {
            N(z);
        }
    }

    public final void g0(hwo0 hwo0Var) {
        bby bbyVar;
        if (!(hwo0Var instanceof cwo0) && (bbyVar = this.P0) != null) {
            v3c.N(bbyVar);
        }
        p7m0 p7m0Var = this.e1;
        p7m0Var.getClass();
        p7m0Var.o(null, hwo0Var);
    }

    public final void h0() {
        c0();
        pek0 pek0Var = pek0.f26859a;
        ctf0 ctf0Var = this.g;
        this.W0.f(new uuj0(new xdk0(pek0Var, ctf0Var.f(R.string.no_connection_title_with_hyphen, new Object[0]), ctf0Var.f(R.string.no_connection_description, new Object[0]), null, null, null, 120)));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0150  */
    /* JADX WARN: Code duplicated, block: B:55:0x0153  */
    /* JADX WARN: Code duplicated, block: B:58:0x0161  */
    /* JADX WARN: Code duplicated, block: B:60:0x016f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0172  */
    /* JADX WARN: Code duplicated, block: B:63:0x0175  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object i0(oa20 oa20Var, q4f q4fVar, boolean z, zje zjeVar) {
        hg20 hg20Var;
        double dDoubleValue;
        String strF;
        q4f q4fVar2;
        String str;
        String str2;
        String str3;
        oa20 oa20Var2;
        String str4;
        String str5;
        String str6;
        double d;
        String str7;
        boolean z2;
        jnb0 jnb0Var;
        String strF2;
        String strA;
        zmk0 zmk0Var;
        oa20 oa20Var3 = oa20Var;
        boolean z3 = z;
        if (zjeVar instanceof hg20) {
            hg20Var = (hg20) zjeVar;
            int i = hg20Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                hg20Var.s = i - Integer.MIN_VALUE;
            } else {
                hg20Var = new hg20(this, zjeVar);
            }
        } else {
            hg20Var = new hg20(this, zjeVar);
        }
        Object obj = hg20Var.q;
        Object obj2 = wne.f39444a;
        int i2 = hg20Var.s;
        ctf0 ctf0Var = this.g;
        p7m0 p7m0Var = this.d1;
        if (i2 == 0) {
            z1x.P(obj);
            Double d2 = new Double(oa20Var3.j);
            if (d2.doubleValue() == 0.0d) {
                d2 = null;
            }
            if (d2 != null) {
                dDoubleValue = d2.doubleValue();
            } else {
                StepInputUiModel stepInputUiModel = (StepInputUiModel) p7m0Var.getValue();
                dDoubleValue = stepInputUiModel.f46474a * (stepInputUiModel.r ? 2.0d : 1.0d);
            }
            if (q4fVar == q4f.d || q4fVar == q4f.c || q4fVar == q4f.i || (q4fVar == q4f.e && !z3)) {
                strF = oa20Var3.g;
                if (strF.equals("0")) {
                    strF = null;
                }
                if (strF == null) {
                    strF = ctf0Var.f(R.string.sp_coef, new Object[0]);
                }
            } else {
                strF = "";
            }
            pn40 pn40Var = pn40.f27267a;
            String strC = pn40.c(dDoubleValue, p3u0.g);
            String str8 = ((StepInputUiModel) p7m0Var.getValue()).f;
            ((lye) this.g0.f23572a.f10647a).getClass();
            hg20Var.i = oa20Var3;
            hg20Var.j = q4fVar;
            hg20Var.k = strF;
            hg20Var.l = strC;
            hg20Var.m = str8;
            hg20Var.o = z3;
            hg20Var.p = dDoubleValue;
            hg20Var.s = 1;
            Object objJ = J(q4fVar, hg20Var);
            if (objJ != obj2) {
                q4fVar2 = q4fVar;
                str = strC;
                str2 = str8;
                str3 = strF;
                obj = objJ;
            }
            return obj2;
        }
        if (i2 == 1) {
            double d3 = hg20Var.p;
            z3 = hg20Var.o;
            str2 = hg20Var.m;
            String str9 = hg20Var.l;
            str3 = hg20Var.k;
            q4fVar2 = hg20Var.j;
            oa20 oa20Var4 = hg20Var.i;
            z1x.P(obj);
            oa20Var3 = oa20Var4;
            str = str9;
            dDoubleValue = d3;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = hg20Var.p;
            String str10 = hg20Var.n;
            String str11 = hg20Var.m;
            String str12 = hg20Var.l;
            String str13 = hg20Var.k;
            q4fVar2 = hg20Var.j;
            oa20Var2 = hg20Var.i;
            z1x.P(obj);
            str5 = str10;
            str6 = str11;
            str4 = str12;
            str7 = str13;
        }
        q4f q4fVar3 = q4fVar2;
        String str14 = (String) obj;
        long j = oa20Var2.e;
        String str15 = oa20Var2.f24910a;
        en7 en7Var = (en7) this.F.b().getValue();
        if (d > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        jnb0Var = (jnb0) this.h1.getValue();
        if (jnb0Var instanceof inb0) {
            zmk0Var = (zmk0) CollectionsKt.firstOrNull(((inb0) jnb0Var).f15066a.f1159a);
            if (zmk0Var != null) {
                strF2 = zmk0Var.f44630a;
            } else {
                strF2 = null;
            }
            if (strF2 == null) {
                strF2 = "";
            }
        } else {
            strF2 = gfx.F(this.U.c().U, this.T0.f24244a, ((StepInputUiModel) p7m0Var.getValue()).r, y(), ctf0Var);
        }
        String strR = kotlin.text.c.r(strF2, Separators.COLON, "", false);
        boolean z4 = this.b0.c().f24244a;
        if (this.v.a().f32117a.c.h) {
            strA = ctf0Var.b.a(R.string.share, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = null;
        }
        ka20 ka20Var = new ka20(str4, str7, j, strR, str14, str6, q4fVar3, en7Var, str15, z2, z4, str5, strA);
        p7m0 p7m0Var2 = this.a1;
        p7m0Var2.getClass();
        p7m0Var2.o(null, ka20Var);
        return Unit.f46060a;
        String str16 = (String) obj;
        hg20Var.i = oa20Var3;
        hg20Var.j = q4fVar2;
        hg20Var.k = str3;
        hg20Var.l = str;
        hg20Var.m = str2;
        hg20Var.n = str16;
        hg20Var.o = z3;
        hg20Var.p = dDoubleValue;
        hg20Var.s = 2;
        Object objL = L(oa20Var3, q4fVar2, z3, hg20Var);
        if (objL != obj2) {
            oa20Var2 = oa20Var3;
            str4 = str;
            str5 = str16;
            str6 = str2;
            d = dDoubleValue;
            str7 = str3;
            obj = objL;
            q4f q4fVar4 = q4fVar2;
            String str17 = (String) obj;
            long j2 = oa20Var2.e;
            String str18 = oa20Var2.f24910a;
            en7 en7Var2 = (en7) this.F.b().getValue();
            if (d > 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            jnb0Var = (jnb0) this.h1.getValue();
            if (jnb0Var instanceof inb0) {
                zmk0Var = (zmk0) CollectionsKt.firstOrNull(((inb0) jnb0Var).f15066a.f1159a);
                if (zmk0Var != null) {
                    strF2 = zmk0Var.f44630a;
                } else {
                    strF2 = null;
                }
                if (strF2 == null) {
                    strF2 = "";
                }
            } else {
                strF2 = gfx.F(this.U.c().U, this.T0.f24244a, ((StepInputUiModel) p7m0Var.getValue()).r, y(), ctf0Var);
            }
            String strR2 = kotlin.text.c.r(strF2, Separators.COLON, "", false);
            boolean z5 = this.b0.c().f24244a;
            if (this.v.a().f32117a.c.h) {
                strA = ctf0Var.b.a(R.string.share, Arrays.copyOf(new Object[0], 0));
            } else {
                strA = null;
            }
            ka20 ka20Var2 = new ka20(str4, str7, j2, strR2, str17, str6, q4fVar4, en7Var2, str18, z2, z5, str5, strA);
            p7m0 p7m0Var3 = this.a1;
            p7m0Var3.getClass();
            p7m0Var3.o(null, ka20Var2);
            return Unit.f46060a;
        }
        return obj2;
    }

    public final double j0(double d, double d2, double d3) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(d2));
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d3));
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        bigDecimalAdd.getClass();
        return (bigDecimalAdd.compareTo(bigDecimal3) <= 0 || ((Boolean) this.m1.getValue()).booleanValue()) ? bigDecimalAdd.doubleValue() : d3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r6.Q.b(r7, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r6.G0.a(r7, r9, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(double r7, a.zje r9, boolean r10) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof a.lg20
            if (r0 == 0) goto L13
            r0 = r9
            a.lg20 r0 = (a.lg20) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.lg20 r0 = new a.lg20
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 == r4) goto L29
            if (r2 != r3) goto L2f
        L29:
            double r7 = r0.j
            a.z1x.P(r9)
            goto L8e
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L36:
            double r7 = r0.j
            boolean r10 = r0.i
            a.z1x.P(r9)
            goto L52
        L3e:
            a.z1x.P(r9)
            if (r10 == 0) goto L98
            r0.i = r10
            r0.j = r7
            r0.m = r5
            a.qoj0 r9 = r6.i1
            java.lang.Object r9 = a.ntb.K(r9, r0)
            if (r9 != r1) goto L52
            goto L8d
        L52:
            a.q4f r9 = (a.q4f) r9
            int r9 = r9.ordinal()
            r2 = 6
            if (r9 == r2) goto L6f
            r2 = 11
            if (r9 == r2) goto L60
            goto L8e
        L60:
            r0.i = r10
            r0.j = r7
            r0.m = r3
            a.hst r9 = r6.Q
            java.lang.Object r9 = r9.b(r7, r0)
            if (r9 != r1) goto L8e
            goto L8d
        L6f:
            a.hst r9 = r6.L
            a.oif0 r9 = r9.f13600a
            java.util.List r9 = r9.n()
            java.lang.Object r9 = kotlin.collections.CollectionsKt.U(r9)
            a.hf6 r9 = (a.hf6) r9
            int r9 = r9.f12958a
            r0.i = r10
            r0.j = r7
            r0.m = r4
            a.ipc r10 = r6.G0
            java.lang.Object r9 = r10.a(r7, r9, r0)
            if (r9 != r1) goto L8e
        L8d:
            return r1
        L8e:
            a.tqc r6 = r6.R
            a.g45 r6 = r6.f34374a
            java.lang.Object r6 = r6.c
            a.ave r6 = (a.ave) r6
            r6.g = r7
        L98:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qg20.k0(double, a.zje, boolean):java.lang.Object");
    }

    public final void l0(double d) {
        qg20 qg20Var;
        double d2;
        if (this.i.a() == q4f.m) {
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = this.d.f22085a;
            qg20Var = this;
            d2 = d;
            sac.V(bvcVarA, mg20.f21721a, null, rwjVar, new vdc(d, (diu0) qg20Var, (yje) null, (byte) 2), 10);
        } else {
            qg20Var = this;
            d2 = d;
        }
        ((ave) qg20Var.R.f34374a.c).g = d2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m0(zje zjeVar) {
        og20 og20Var;
        p7m0 p7m0Var;
        Object value;
        if (zjeVar instanceof og20) {
            og20Var = (og20) zjeVar;
            int i = og20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                og20Var.k = i - Integer.MIN_VALUE;
            } else {
                og20Var = new og20(this, zjeVar);
            }
        } else {
            og20Var = new og20(this, zjeVar);
        }
        Object objZ = og20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = og20Var.k;
        if (i2 == 0) {
            z1x.P(objZ);
            og20Var.k = 1;
            objZ = this.K.z(og20Var);
            if (objZ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objZ);
        }
        boolean zBooleanValue = ((Boolean) objZ).booleanValue();
        do {
            p7m0Var = this.n1;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, rn20.a((rn20) value, zBooleanValue, false, false, 6)));
        return Unit.f46060a;
    }

    public final Object n0(q4f q4fVar, bnn0 bnn0Var) {
        int iOrdinal = q4fVar.ordinal();
        if (iOrdinal == 6) {
            Object objM0 = m0(bnn0Var);
            return objM0 == wne.f39444a ? objM0 : Unit.f46060a;
        }
        if (iOrdinal != 11) {
            return Unit.f46060a;
        }
        Object objO0 = o0(bnn0Var);
        return objO0 == wne.f39444a ? objO0 : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[PHI: r1 r4
  0x0088: PHI (r1v17 java.util.Iterator) = (r1v5 java.util.Iterator), (r1v19 java.util.Iterator) binds: [B:32:0x0084, B:57:0x00fd] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r4v10 int) = (r4v3 int), (r4v12 int) binds: [B:32:0x0084, B:57:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c7 -> B:54:0x00f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d4 -> B:54:0x00f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00eb -> B:52:0x00ed). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o0(a.zje r34) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qg20.o0(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object w(double d, q4f q4fVar, hxu hxuVar, zje zjeVar) {
        le20 le20Var;
        duw duwVarB;
        hxu hxuVar2;
        double d2;
        boolean z;
        double d3;
        double d4;
        q4f q4fVar2;
        yk5 yk5Var;
        cl5 cl5Var;
        if (zjeVar instanceof le20) {
            le20Var = (le20) zjeVar;
            int i = le20Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                le20Var.t = i - Integer.MIN_VALUE;
            } else {
                le20Var = new le20(this, zjeVar);
            }
        } else {
            le20Var = new le20(this, zjeVar);
        }
        Object obj = le20Var.r;
        wne wneVar = wne.f39444a;
        int i2 = le20Var.t;
        if (i2 == 0) {
            z1x.P(obj);
            duwVarB = this.e0.b();
            double dI = this.w.i();
            double d5 = ((lye) this.h0.f22172a.f10647a).f20858a.j;
            boolean z2 = this.z.a().k;
            p7m0 p7m0VarB = this.F.b();
            le20Var.l = q4fVar;
            le20Var.m = duwVarB;
            hxuVar2 = hxuVar;
            le20Var.n = hxuVar2;
            yk5 yk5Var2 = this.f0;
            le20Var.o = yk5Var2;
            cl5 cl5Var2 = this.y;
            le20Var.p = cl5Var2;
            d2 = d;
            le20Var.i = d2;
            le20Var.j = dI;
            le20Var.k = d5;
            le20Var.q = z2;
            le20Var.t = 1;
            Object objM = ntb.M(p7m0VarB, le20Var);
            if (objM == wneVar) {
                return wneVar;
            }
            z = z2;
            obj = objM;
            d3 = dI;
            d4 = d5;
            q4fVar2 = q4fVar;
            yk5Var = yk5Var2;
            cl5Var = cl5Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = le20Var.q;
            double d6 = le20Var.k;
            double d7 = le20Var.j;
            double d8 = le20Var.i;
            cl5Var = le20Var.p;
            yk5Var = le20Var.o;
            hxuVar2 = le20Var.n;
            duwVarB = le20Var.m;
            q4f q4fVar3 = le20Var.l;
            z1x.P(obj);
            z = z3;
            q4fVar2 = q4fVar3;
            d4 = d6;
            d3 = d7;
            d2 = d8;
        }
        en7 en7Var = (en7) obj;
        int i3 = en7Var != null ? en7Var.b : 0;
        cl5Var.getClass();
        double dT = cl5.t(d2, d3, d4, z, i3, q4fVar2);
        int i4 = duwVarB.f6716a;
        double d9 = duwVarB.b;
        double d10 = duwVarB.c;
        yk5Var.getClass();
        return ozb.h0(hxuVar2, yk5.i(dT, i4, d9, d10), duwVarB.f6716a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(q4f q4fVar, double d, zje zjeVar) {
        me20 me20Var;
        q4f q4fVar2;
        qg20 qg20Var;
        if (zjeVar instanceof me20) {
            me20Var = (me20) zjeVar;
            int i = me20Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                me20Var.n = i - Integer.MIN_VALUE;
            } else {
                me20Var = new me20(this, zjeVar);
            }
        } else {
            me20Var = new me20(this, zjeVar);
        }
        Object objG = me20Var.l;
        wne wneVar = wne.f39444a;
        int i2 = me20Var.n;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objG);
            me20Var.i = q4fVar;
            me20Var.j = this;
            me20Var.k = d;
            me20Var.n = 1;
            objG = G(me20Var);
            if (objG == wneVar) {
                return wneVar;
            }
            q4fVar2 = q4fVar;
            qg20Var = this;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = me20Var.k;
            qg20Var = me20Var.j;
            q4fVar2 = me20Var.i;
            z1x.P(objG);
        }
        double d2 = ((ql5) objG).b;
        double d3 = ((a40) this.Z0.getValue()).f198a;
        boolean z2 = qg20Var.v.a().f32117a.f12063a.b;
        boolean z3 = d3 > 0.0d;
        if (q4fVar2 != q4f.m) {
            boolean z4 = d3 + d2 >= d;
            if (d <= d2 || !z4 || !z3 || !z2) {
                z = false;
            }
        } else if (qg20Var.z0.l(d) <= d2 || !z3 || !z2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final boolean y() {
        q4f q4fVarA = this.i.a();
        return q4fVarA == q4f.e || q4fVarA == q4f.m;
    }

    public final inb0 z() {
        ArrayList arrayList = new ArrayList();
        bnk0 bnk0Var = new bnk0();
        pzw.E(bnk0Var, gfx.F(this.U.c().U, this.T0.f24244a, ((StepInputUiModel) this.d1.getValue()).r, y(), this.g), 0, 0, 0, R.attr.uikitTextPrimary, 30);
        return new inb0(w6x.l(arrayList, bnk0Var.f2888a, arrayList));
    }
}
