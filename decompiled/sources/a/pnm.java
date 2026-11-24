package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pnm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uts0 f27295a = ro4.m0(100, 0, hhn.c, 2);

    public static final void a(lxl lxlVar, syl sylVar, jyl jylVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        long primary;
        y3d y3dVar;
        int iIntValue;
        fet fetVar2 = fetVar;
        y3d y3dVar2 = jylVar.c;
        y3d y3dVar3 = jylVar.b;
        lxlVar.getClass();
        long j = lxlVar.f20819a;
        sylVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(-728278161);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(lxlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.e(sylVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(jylVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            cwl cwlVar = lxlVar.f;
            uxl uxlVar = lxlVar.e;
            dyl dylVar = lxlVar.b;
            boolean zF = fetVar2.f(j);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new pmm(function1, lxlVar, (byte) 2);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zF2 = fetVar2.f(j);
            Object objP2 = fetVar2.P();
            if (zF2 || objP2 == cl5Var) {
                objP2 = new pmm(function2, lxlVar, (byte) 3);
                fetVar2.o0(objP2);
            }
            Function0 function3 = (Function0) objP2;
            boolean zE = fetVar2.e(uxlVar.ordinal());
            Object objP3 = fetVar2.P();
            if (zE || objP3 == cl5Var) {
                objP3 = Boolean.valueOf(lxlVar.c());
                fetVar2.o0(objP3);
            }
            boolean zBooleanValue = ((Boolean) objP3).booleanValue();
            boolean zE2 = fetVar2.e(uxlVar.ordinal());
            Object objP4 = fetVar2.P();
            if (zE2 || objP4 == cl5Var) {
                objP4 = Boolean.valueOf(lxlVar.b());
                fetVar2.o0(objP4);
            }
            boolean zBooleanValue2 = ((Boolean) objP4).booleanValue();
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            int i4 = i3 & 896;
            boolean zH = (i4 == 256) | fetVar2.h(zBooleanValue2);
            Object objP5 = fetVar2.P();
            if (zH || objP5 == cl5Var) {
                if (!zBooleanValue2 || (y3dVar = jylVar.f17364a) == null) {
                    primary = zBooleanValue2 ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getBackgroundContent();
                } else {
                    primary = y3dVar.f41946a;
                }
                objP5 = dw9.e(primary, fetVar2);
            }
            long j2 = ((y3d) objP5).f41946a;
            boolean zH2 = fetVar2.h(zBooleanValue2) | fetVar2.g(dylVar) | (i4 == 256);
            Object objP6 = fetVar2.P();
            if (zH2 || objP6 == cl5Var) {
                long textPrimary = ((dylVar instanceof zxl) || (dylVar instanceof yxl) || !zBooleanValue2) ? s6t0.b().f33626a.getTextPrimary() : s6t0.b().f33626a.getPrimaryForeground();
                objP6 = dw9.e(textPrimary, fetVar2);
            }
            long j3 = ((y3d) objP6).f41946a;
            boolean zH3 = fetVar2.h(zBooleanValue2) | (i4 == 256);
            Object objP7 = fetVar2.P();
            if (zH3 || objP7 == cl5Var) {
                objP7 = dw9.e(zBooleanValue2 ? s6t0.b().f33626a.getPrimaryForeground() : s6t0.b().f33626a.getTextPrimary(), fetVar2);
            }
            long j4 = ((y3d) objP7).f41946a;
            boolean zH4 = fetVar2.h(zBooleanValue2) | (i4 == 256);
            Object objP8 = fetVar2.P();
            if (zH4 || objP8 == cl5Var) {
                objP8 = dw9.e(sac.P(zBooleanValue2, y3dVar3, y3dVar2, bbc.c), fetVar2);
            }
            long j5 = ((y3d) objP8).f41946a;
            boolean zH5 = fetVar2.h(zBooleanValue2) | (i4 == 256);
            Object objP9 = fetVar2.P();
            if (zH5 || objP9 == cl5Var) {
                objP9 = dw9.e(sac.P(zBooleanValue2, null, null, bbc.c), fetVar2);
            }
            long j6 = ((y3d) objP9).f41946a;
            boolean zH6 = (i4 == 256) | fetVar2.h(zBooleanValue2);
            Object objP10 = fetVar2.P();
            if (zH6 || objP10 == cl5Var) {
                objP10 = dw9.e(sac.P(zBooleanValue2, y3dVar3, y3dVar2, bbc.d), fetVar2);
            }
            long j7 = ((y3d) objP10).f41946a;
            uts0 uts0Var = f27295a;
            l7m0 l7m0VarB = m5k0.b(j2, uts0Var, fetVar2, 48, 12);
            l7m0 l7m0VarB2 = m5k0.b(backgroundContent, uts0Var, fetVar, 48, 12);
            l7m0 l7m0VarB3 = m5k0.b(j3, uts0Var, fetVar, 48, 12);
            m5k0.b(j4, uts0Var, fetVar, 48, 12);
            l7m0 l7m0VarB4 = m5k0.b(j5, uts0Var, fetVar, 48, 12);
            l7m0 l7m0VarB5 = m5k0.b(j6, uts0Var, fetVar, 48, 12);
            l7m0 l7m0VarB6 = m5k0.b(j7, uts0Var, fetVar, 48, 12);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objP11 = fetVar.P();
            if (z || objP11 == cl5Var) {
                int iOrdinal = sylVar.ordinal();
                if (iOrdinal == 0) {
                    iIntValue = 1;
                } else if (iOrdinal != 1) {
                    t9f.b();
                    return;
                } else {
                    Integer numD = lxlVar.d();
                    iIntValue = numD != null ? numD.intValue() : Integer.MAX_VALUE;
                }
                objP11 = Integer.valueOf(iIntValue);
                fetVar.o0(objP11);
            }
            int iIntValue2 = ((Number) objP11).intValue();
            boolean zG = fetVar.g(null) | fetVar.h(zBooleanValue);
            Object objP12 = fetVar.P();
            if (zG || objP12 == cl5Var) {
                fetVar.o0(null);
                objP12 = null;
            }
            xdr xdrVar = (xdr) objP12;
            boolean zG2 = fetVar.g(cwlVar) | fetVar.h(zBooleanValue);
            Object objP13 = fetVar.P();
            if (zG2 || objP13 == cl5Var) {
                ugd ugdVar = cwlVar != null ? new ugd(15352961, true, new qmm(zBooleanValue, cwlVar, (byte) 1)) : null;
                fetVar.o0(ugdVar);
                objP13 = ugdVar;
            }
            xdr xdrVar2 = (xdr) objP13;
            if (dylVar != null) {
                if (dylVar instanceof xxl) {
                    fetVar.e0(2046340812);
                    ibc.b(((xxl) dylVar).f41664a, zBooleanValue, ((y3d) l7m0VarB.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, iIntValue2, zBooleanValue2, function0, xdrVar, xdrVar2, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (dylVar instanceof ayl) {
                    fetVar.e0(2046747315);
                    ayl aylVar = (ayl) dylVar;
                    obc.c(aylVar.f1673a, aylVar.b, aylVar.c, ((y3d) l7m0VarB4.getValue()).f41946a, lxlVar.c(), ((y3d) l7m0VarB.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, aylVar.d, aylVar.e, zBooleanValue2, function0, xdrVar, xdrVar2, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (dylVar instanceof cyl) {
                    fetVar.e0(2047359999);
                    cyl cylVar = (cyl) dylVar;
                    o0x o0xVar = cylVar.f5182a;
                    Integer num = cylVar.c;
                    m0x m0xVar = cylVar.b;
                    long j8 = ((y3d) l7m0VarB4.getValue()).f41946a;
                    y3d y3dVar4 = (y3d) l7m0VarB5.getValue();
                    long j9 = y3dVar4.f41946a;
                    long j10 = ((y3d) l7m0VarB.getValue()).f41946a;
                    boolean zC = lxlVar.c();
                    Boolean bool = Boolean.FALSE;
                    vbc.d(o0xVar, m0xVar, j8, j10, zC, y3dVar4, bool, bool, num, zBooleanValue2, function0, xdrVar, xdrVar2, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (dylVar instanceof byl) {
                    fetVar.e0(2048646189);
                    byl bylVar = (byl) dylVar;
                    qbc.c(bylVar.f3425a, bylVar.b, ((y3d) l7m0VarB5.getValue()).f41946a, lxlVar.c(), ((y3d) l7m0VarB.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, bylVar.c, bylVar.d, zBooleanValue2, function0, xdrVar, xdrVar2, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (dylVar instanceof yxl) {
                    fetVar.e0(2049286959);
                    yxl yxlVar = (yxl) dylVar;
                    kbc.c(yxlVar.f43428a, yxlVar.b, yxlVar.c, ((y3d) l7m0VarB6.getValue()).f41946a, ((y3d) l7m0VarB2.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, lxlVar.c(), sylVar, yxlVar.d, null, Boolean.FALSE, zBooleanValue2, function3, xdrVar, xdrVar2, fetVar, (i3 << 24) & 1879048192, 4096);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (dylVar instanceof zxl) {
                    fetVar.e0(2050214696);
                    zxl zxlVar = (zxl) dylVar;
                    mbc.a(zxlVar.f45165a, zxlVar.b, lxlVar.c(), ((y3d) l7m0VarB2.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, null, zxlVar.c, zBooleanValue2, function3, xdrVar, xdrVar2, fetVar, 0, 128);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
            }
            throw b1j.f(204560536, fetVar, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new onm(lxlVar, sylVar, jylVar, function1, function2, i, (byte) 0);
        }
    }
}
