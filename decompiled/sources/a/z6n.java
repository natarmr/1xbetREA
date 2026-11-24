package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class z6n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uts0 f43878a = ro4.m0(100, 0, hhn.c, 2);

    public static final void a(lxl lxlVar, syl sylVar, jyl jylVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        long backgroundLight60;
        y3d y3dVar;
        int iIntValue;
        fet fetVar2 = fetVar;
        lxlVar.getClass();
        long j = lxlVar.f20819a;
        sylVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(-98697239);
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
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            cwl cwlVar = lxlVar.f;
            uxl uxlVar = lxlVar.e;
            dyl dylVar = lxlVar.b;
            boolean zF = fetVar2.f(j);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new pmm(function1, lxlVar, (byte) 6);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zF2 = fetVar2.f(j);
            Object objP2 = fetVar2.P();
            if (zF2 || objP2 == cl5Var) {
                objP2 = new pmm(function2, lxlVar, (byte) 7);
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
            boolean zG = fetVar2.g(dylVar) | fetVar2.e(uxlVar.ordinal());
            Object objP4 = fetVar2.P();
            if (zG || objP4 == cl5Var) {
                objP4 = Boolean.valueOf(lxlVar.b());
                fetVar2.o0(objP4);
            }
            boolean zBooleanValue2 = ((Boolean) objP4).booleanValue();
            pz40 pz40Var = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
            int i3 = i2 & 896;
            boolean zH = fetVar2.h(zBooleanValue2) | (i3 == 256);
            Object objP5 = fetVar2.P();
            if (zH || objP5 == cl5Var) {
                if (!zBooleanValue2 || (y3dVar = jylVar.f17364a) == null) {
                    backgroundLight60 = zBooleanValue2 ? s6t0.b().f33626a.getBackgroundLight60() : s6t0.b().f33626a.getBackground();
                } else {
                    backgroundLight60 = y3dVar.f41946a;
                }
                objP5 = dw9.e(backgroundLight60, fetVar2);
            }
            long j2 = ((y3d) objP5).f41946a;
            boolean zH2 = fetVar2.h(zBooleanValue2) | fetVar2.g(dylVar) | (i3 == 256);
            Object objP6 = fetVar2.P();
            if (zH2 || objP6 == cl5Var) {
                long textPrimary = ((dylVar instanceof zxl) || (dylVar instanceof yxl)) ? s6t0.b().f33626a.getTextPrimary() : s6t0.b().f33626a.getTextPrimary();
                objP6 = dw9.e(textPrimary, fetVar2);
            }
            long j3 = ((y3d) objP6).f41946a;
            boolean zH3 = fetVar2.h(zBooleanValue2) | (i3 == 256);
            Object objP7 = fetVar2.P();
            if (zH3 || objP7 == cl5Var) {
                objP7 = dw9.e(s6t0.b().f33626a.getTextPrimary(), fetVar2);
            }
            long j4 = ((y3d) objP7).f41946a;
            boolean zH4 = fetVar2.h(zBooleanValue2) | (i3 == 256);
            Object objP8 = fetVar2.P();
            if (zH4 || objP8 == cl5Var) {
                objP8 = dw9.e(sac.P(zBooleanValue2, jylVar.b, jylVar.c, bbc.g), fetVar2);
            }
            long j5 = ((y3d) objP8).f41946a;
            boolean zH5 = fetVar2.h(zBooleanValue2) | (i3 == 256);
            Object objP9 = fetVar2.P();
            if (zH5 || objP9 == cl5Var) {
                objP9 = dw9.e(sac.P(zBooleanValue2, null, null, bbc.g), fetVar2);
            }
            long j6 = ((y3d) objP9).f41946a;
            uts0 uts0Var = f43878a;
            l7m0 l7m0VarB = m5k0.b(j2, uts0Var, fetVar2, 48, 12);
            l7m0 l7m0VarB2 = m5k0.b(background, uts0Var, fetVar, 48, 12);
            l7m0 l7m0VarB3 = m5k0.b(j3, uts0Var, fetVar, 48, 12);
            m5k0.b(j4, uts0Var, fetVar, 48, 12);
            l7m0 l7m0VarB4 = m5k0.b(j5, uts0Var, fetVar, 48, 12);
            l7m0 l7m0VarB5 = m5k0.b(j6, uts0Var, fetVar, 48, 12);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP10 = fetVar.P();
            if (z || objP10 == cl5Var) {
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
                objP10 = Integer.valueOf(iIntValue);
                fetVar.o0(objP10);
            }
            int iIntValue2 = ((Number) objP10).intValue();
            boolean zG2 = fetVar.g(cwlVar) | fetVar.h(zBooleanValue);
            Object objP11 = fetVar.P();
            if (zG2 || objP11 == cl5Var) {
                ugd ugdVar = cwlVar != null ? new ugd(1566239867, true, new qmm(zBooleanValue, cwlVar, (byte) 3)) : null;
                fetVar.o0(ugdVar);
                objP11 = ugdVar;
            }
            xdr xdrVar = (xdr) objP11;
            boolean zG3 = fetVar.g(null) | fetVar.h(zBooleanValue);
            Object objP12 = fetVar.P();
            if (zG3 || objP12 == cl5Var) {
                fetVar.o0(null);
                objP12 = null;
            }
            xdr xdrVar2 = (xdr) objP12;
            if (dylVar != null) {
                if (dylVar instanceof ayl) {
                    fetVar.e0(1768858681);
                    ayl aylVar = (ayl) dylVar;
                    obc.c(aylVar.f1673a, aylVar.b, aylVar.c, ((y3d) l7m0VarB4.getValue()).f41946a, lxlVar.c(), ((y3d) l7m0VarB.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, aylVar.d, aylVar.e, zBooleanValue2, function0, xdrVar2, xdrVar, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (dylVar instanceof cyl) {
                    fetVar.e0(1769471365);
                    cyl cylVar = (cyl) dylVar;
                    o0x o0xVar = cylVar.f5182a;
                    Integer num = cylVar.c;
                    m0x m0xVar = cylVar.b;
                    long j7 = ((y3d) l7m0VarB4.getValue()).f41946a;
                    y3d y3dVar2 = (y3d) l7m0VarB5.getValue();
                    long j8 = y3dVar2.f41946a;
                    long j9 = ((y3d) l7m0VarB.getValue()).f41946a;
                    boolean zC = lxlVar.c();
                    Boolean bool = Boolean.FALSE;
                    vbc.d(o0xVar, m0xVar, j7, j9, zC, y3dVar2, bool, bool, num, zBooleanValue2, function0, xdrVar2, xdrVar, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (dylVar instanceof yxl) {
                    fetVar.e0(1770776155);
                    yxl yxlVar = (yxl) dylVar;
                    kbc.c(yxlVar.f43428a, yxlVar.b, yxlVar.c, ((y3d) l7m0VarB4.getValue()).f41946a, ((y3d) l7m0VarB2.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, lxlVar.c(), sylVar, yxlVar.d, null, Boolean.FALSE, zBooleanValue2, function3, xdrVar2, xdrVar, fetVar, (i2 << 24) & 1879048192, 4096);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (dylVar instanceof xxl) {
                    fetVar.e0(-358491088);
                    ibc.b(((xxl) dylVar).f41664a, zBooleanValue, ((y3d) l7m0VarB.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, iIntValue2, zBooleanValue2, function0, xdrVar2, xdrVar, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (dylVar instanceof byl) {
                    fetVar.e0(1772085843);
                    byl bylVar = (byl) dylVar;
                    qbc.c(bylVar.f3425a, bylVar.b, ((y3d) l7m0VarB5.getValue()).f41946a, lxlVar.c(), ((y3d) l7m0VarB.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, bylVar.c, bylVar.d, zBooleanValue2, function0, xdrVar2, xdrVar, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (dylVar instanceof zxl) {
                    fetVar.e0(1772707982);
                    zxl zxlVar = (zxl) dylVar;
                    mbc.a(zxlVar.f45165a, zxlVar.b, lxlVar.c(), ((y3d) l7m0VarB2.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, null, zxlVar.c, zBooleanValue2, function3, xdrVar2, xdrVar, fetVar, 0, 128);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
            }
            throw b1j.f(-358580436, fetVar, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new onm(lxlVar, sylVar, jylVar, function1, function2, i, (byte) 2);
        }
    }
}
