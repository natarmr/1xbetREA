package a;

import android.javax.sip.message.Response;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rf6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30371a;

    static {
        zcl zclVar = qmk.f28987a;
        f30371a = 32.0f;
    }

    public static final void a(mm40 mm40Var, String str, boolean z, boolean z2, Function1 function1, Function0 function0, fet fetVar, int i) {
        int i2;
        Object objJ;
        int i3;
        Function0 function2;
        Function1 function3 = function1;
        fet fetVar2 = fetVar;
        tf6 tf6Var = tf6.f33852a;
        str.getClass();
        function3.getClass();
        fetVar2.g0(691489307);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.e(1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function0) ? 1048576 : 524288;
        }
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            oms0 oms0VarZ = phu0.Z(Boolean.valueOf(z), null, fetVar2, (i2 >> 6) & 14, 2);
            Object objY0 = oms0VarZ.f25519a.y0();
            boolean zG = fetVar2.g(oms0VarZ) | ((i2 & 3670016) == 1048576);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new cm3(oms0VarZ, function0, null, (byte) 24);
                fetVar2.o0(objP);
            }
            m0x0.t(fetVar2, objY0, (Function2) objP);
            cms0 cms0VarC = c(oms0VarZ, 500, 500, fetVar2, 432, 4);
            cms0 cms0VarC2 = c(oms0VarZ, 500, 100, fetVar, 432, 4);
            cms0 cms0VarC3 = c(oms0VarZ, 150, 100, fetVar, 3504, 0);
            oms0 oms0VarZ2 = phu0.Z(Boolean.valueOf(z2), null, fetVar, (i2 >> 12) & 14, 2);
            p4 p4Var = oms0VarZ2.f25519a;
            lxs0 lxs0Var = hp4.j;
            if (oms0VarZ2.h()) {
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG2 = fetVar.g(oms0VarZ2);
                objJ = fetVar.P();
                if (zG2 || objJ == cl5Var) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY1 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar.o0(objY1);
                        objJ = objY1;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar.r(false);
            }
            boolean zBooleanValue = ((Boolean) objJ).booleanValue();
            fetVar.e0(1999537243);
            float f = zBooleanValue ? 1.0f : 0.0f;
            fetVar.r(false);
            Float fValueOf = Float.valueOf(f);
            boolean zG3 = fetVar.g(oms0VarZ2);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == cl5Var) {
                objP2 = jgk0.b(new gb3(oms0VarZ2, (byte) 16));
                fetVar.o0(objP2);
            }
            boolean zBooleanValue2 = ((Boolean) ((l7m0) objP2).getValue()).booleanValue();
            fetVar.e0(1999537243);
            float f2 = zBooleanValue2 ? 1.0f : 0.0f;
            fetVar.r(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zG4 = fetVar.g(oms0VarZ2);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == cl5Var) {
                objP3 = jgk0.b(new gb3(oms0VarZ2, (byte) 17));
                fetVar.o0(objP3);
            }
            ((ams0) ((l7m0) objP3).getValue()).getClass();
            fetVar.e0(-2016806944);
            uts0 uts0VarM0 = ro4.m0(100, 0, hhn.b, 2);
            fetVar.r(false);
            cms0 cms0VarE = phu0.E(oms0VarZ2, fValueOf, fValueOf2, uts0VarM0, lxs0Var, fetVar, 0);
            pz40 pz40Var = s6t0.f31722a;
            boolean zG5 = fetVar.g(s6t0.b()) | ((i2 & 7168) == 2048);
            Object objP4 = fetVar.P();
            if (zG5 || objP4 == cl5Var) {
                StaticColors staticColors = StaticColors.INSTANCE;
                objP4 = new pf6(staticColors.m127getWhite300d7_KjU(), staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), staticColors.m62getBlack0d7_KjU());
                fetVar.o0(objP4);
            }
            pf6 pf6Var = (pf6) objP4;
            cms0 cms0VarB = b(oms0VarZ, pf6Var.b, pf6Var.f26886a, fetVar);
            cms0 cms0VarB2 = b(oms0VarZ, pf6Var.d, pf6Var.c, fetVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            int i4 = i2;
            mm40 mm40VarH = phu0.H(jm40Var, null, 1);
            boolean z4 = !z;
            int i5 = i4 & 458752;
            boolean z5 = i5 == 131072;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new fj4(function3, (byte) 28);
                fetVar.o0(objP5);
            }
            mm40 mm40VarW = y860.W(mm40VarH, null, null, z4, null, (Function0) objP5, 24);
            boolean zG6 = fetVar.g(cms0VarC);
            Object objP6 = fetVar.P();
            if (zG6 || objP6 == cl5Var) {
                objP6 = new qf6(cms0VarC, (byte) 0);
                fetVar.o0(objP6);
            }
            tj30 tj30Var = (tj30) objP6;
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarK = lgb.K(mrv.k0(jm40Var, "BetBuilderButton"));
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarK, 32.0f);
            boolean zG7 = fetVar.g(cms0VarB);
            Object objP7 = fetVar.P();
            if (zG7 || objP7 == cl5Var) {
                objP7 = new yd1(cms0VarB, (byte) 19);
                fetVar.o0(objP7);
            }
            mm40 mm40VarK2 = rq8.K(mm40VarE, (Function1) objP7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarK2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, f30371a);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            ebc.b(null, ((y3d) ((hgk0) cms0VarB2.j).getValue()).f41946a, 0.0f, false, new m0x(R.drawable.ic_glyph_constructor, null, 6), null, null, null, null, null, null, null, null, null, fetVar, 0, 3072, 8169);
            fetVar.r(true);
            mm40 mm40VarN2 = s5x0.N(new x7z(1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean zG8 = fetVar.g(cms0VarC2);
            Object objP8 = fetVar.P();
            if (zG8 || objP8 == cl5Var) {
                objP8 = new yd1(cms0VarC2, (byte) 20);
                fetVar.o0(objP8);
            }
            mm40 mm40VarT = i4w0.T(mm40VarN2, (Function1) objP8);
            hgk0 hgk0Var = (hgk0) cms0VarB2.j;
            v8q0.a(str, mm40VarT, ((y3d) hgk0Var.getValue()).f41946a, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (i4 >> 3) & 14, 24960, 110584);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11);
            boolean zG9 = fetVar.g(cms0VarC3);
            Object objP9 = fetVar.P();
            if (zG9 || objP9 == cl5Var) {
                objP9 = new yd1(cms0VarC3, (byte) 21);
                fetVar.o0(objP9);
            }
            mm40 mm40VarT2 = i4w0.T(mm40VarN3, (Function1) objP9);
            m0x m0xVar = new m0x(R.drawable.ic_glyph_cancel, null, 6);
            long j = ((y3d) hgk0Var.getValue()).f41946a;
            if (!z || oms0VarZ.g()) {
                function3 = function1;
                i3 = 0;
                fetVar.e0(-1519207030);
                fetVar.r(false);
                function2 = null;
            } else {
                fetVar.e0(-1519292683);
                boolean z6 = i5 == 131072;
                Object objP10 = fetVar.P();
                if (z6 || objP10 == cl5Var) {
                    function3 = function1;
                    objP10 = new fj4(function3, (byte) 29);
                    fetVar.o0(objP10);
                } else {
                    function3 = function1;
                }
                i3 = 0;
                fetVar.r(false);
                function2 = (Function0) objP10;
            }
            ebc.b(mm40VarT2, j, 0.0f, false, null, null, null, null, m0xVar, null, null, null, null, function2, fetVar, 0, 0, 7928);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            Object objP11 = fetVar2.P();
            if (objP11 == cl5Var) {
                objP11 = new qf5(2, new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()));
                fetVar2.o0(objP11);
            }
            qf5 qf5Var = (qf5) objP11;
            mm40 mm40VarQ = ffb0.Q(jr8.f16991a.b(jm40Var, gqw0.c), 0.0f, -2.0f);
            boolean zG10 = fetVar2.g(cms0VarE);
            Object objP12 = fetVar2.P();
            if (zG10 || objP12 == cl5Var) {
                objP12 = new yd1(cms0VarE, (byte) 22);
                fetVar2.o0(objP12);
            }
            thb.f(i4w0.T(mm40VarQ, (Function1) objP12), qf5Var, fetVar2, 48, i3);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ag(mm40Var, str, z, z2, function3, function0, i);
        }
    }

    public static final cms0 b(oms0 oms0Var, long j, long j2, fet fetVar) {
        Object objJ;
        pz40 pz40Var = oms0Var.d;
        p4 p4Var = oms0Var.f25519a;
        boolean zBooleanValue = ((Boolean) ((hgk0) pz40Var).getValue()).booleanValue();
        fetVar.e0(168228757);
        long j3 = zBooleanValue ? j : j2;
        fetVar.r(false);
        y4d y4dVarF = y3d.f(j3);
        boolean zG = fetVar.g(y4dVarF);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zG || objP == cl5Var) {
            objP = kng0.d(qja.j, new s43(y4dVarF, (byte) 2), fetVar);
        }
        lxs0 lxs0Var = (lxs0) objP;
        if (oms0Var.h()) {
            objJ = vqd.j(fetVar, 1666827533, false, p4Var);
        } else {
            fetVar.e0(1666573488);
            boolean zG2 = fetVar.g(oms0Var);
            objJ = fetVar.P();
            if (zG2 || objJ == cl5Var) {
                rfk0 rfk0VarJ = vdx.J();
                Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                try {
                    Object objY0 = p4Var.y0();
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    fetVar.o0(objY0);
                    objJ = objY0;
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    throw th;
                }
            }
            fetVar.r(false);
        }
        boolean zBooleanValue2 = ((Boolean) objJ).booleanValue();
        fetVar.e0(168228757);
        y3d y3dVarF = dw9.f(fetVar, false, zBooleanValue2 ? j : j2);
        boolean zG3 = fetVar.g(oms0Var);
        Object objP2 = fetVar.P();
        if (zG3 || objP2 == cl5Var) {
            objP2 = jgk0.b(new gb3(oms0Var, (byte) 18));
            fetVar.o0(objP2);
        }
        boolean zBooleanValue3 = ((Boolean) ((l7m0) objP2).getValue()).booleanValue();
        fetVar.e0(168228757);
        if (!zBooleanValue3) {
            j = j2;
        }
        y3d y3dVarF2 = dw9.f(fetVar, false, j);
        boolean zG4 = fetVar.g(oms0Var);
        Object objP3 = fetVar.P();
        if (zG4 || objP3 == cl5Var) {
            objP3 = jgk0.b(new gb3(oms0Var, (byte) 19));
            fetVar.o0(objP3);
        }
        ams0 ams0Var = (ams0) ((l7m0) objP3).getValue();
        ams0Var.getClass();
        fetVar.e0(13573289);
        uts0 uts0VarM0 = ((Boolean) ams0Var.b()).booleanValue() ? ro4.m0(100, 0, hhn.b, 2) : ro4.m0(500, 0, hhn.b, 2);
        fetVar.r(false);
        return phu0.E(oms0Var, y3dVarF, y3dVarF2, uts0VarM0, lxs0Var, fetVar, 0);
    }

    public static final cms0 c(oms0 oms0Var, int i, int i2, fet fetVar, int i3, int i4) {
        Object objJ;
        int i5 = (i4 & 4) != 0 ? 100 : Response.BUSY_EVERYWHERE;
        lxs0 lxs0Var = hp4.j;
        boolean zH = oms0Var.h();
        p4 p4Var = oms0Var.f25519a;
        cl5 cl5Var = ukd.f35823a;
        if (zH) {
            objJ = vqd.j(fetVar, 1666827533, false, p4Var);
        } else {
            fetVar.e0(1666573488);
            boolean zG = fetVar.g(oms0Var);
            objJ = fetVar.P();
            if (zG || objJ == cl5Var) {
                rfk0 rfk0VarJ = vdx.J();
                Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                try {
                    Object objY0 = p4Var.y0();
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    fetVar.o0(objY0);
                    objJ = objY0;
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    throw th;
                }
            }
            fetVar.r(false);
        }
        boolean zBooleanValue = ((Boolean) objJ).booleanValue();
        fetVar.e0(1622412288);
        float f = zBooleanValue ? 1.0f : 0.0f;
        fetVar.r(false);
        Float fValueOf = Float.valueOf(f);
        boolean zG2 = fetVar.g(oms0Var);
        Object objP = fetVar.P();
        if (zG2 || objP == cl5Var) {
            objP = jgk0.b(new gb3(oms0Var, (byte) 20));
            fetVar.o0(objP);
        }
        boolean zBooleanValue2 = ((Boolean) ((l7m0) objP).getValue()).booleanValue();
        fetVar.e0(1622412288);
        float f2 = zBooleanValue2 ? 1.0f : 0.0f;
        fetVar.r(false);
        Float fValueOf2 = Float.valueOf(f2);
        boolean zG3 = fetVar.g(oms0Var);
        Object objP2 = fetVar.P();
        if (zG3 || objP2 == cl5Var) {
            objP2 = jgk0.b(new gb3(oms0Var, (byte) 21));
            fetVar.o0(objP2);
        }
        ams0 ams0Var = (ams0) ((l7m0) objP2).getValue();
        ams0Var.getClass();
        fetVar.e0(2146437125);
        uts0 uts0Var = ((Boolean) ams0Var.b()).booleanValue() ? new uts0(i, i5, hhn.b) : ro4.m0(i2, 0, hhn.b, 2);
        fetVar.r(false);
        return phu0.E(oms0Var, fValueOf, fValueOf2, uts0Var, lxs0Var, fetVar, 0);
    }
}
