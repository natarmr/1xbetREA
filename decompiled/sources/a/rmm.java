package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uts0 f30750a = ro4.m0(100, 0, hhn.c, 2);
    public static final jfk0 b = new jfk0();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(lxl lxlVar, syl sylVar, jyl jylVar, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        long jM127getWhite300d7_KjU;
        y3d y3dVar;
        int iIntValue;
        byte b2;
        Object ugdVar;
        boolean z2;
        fet fetVar3 = fetVar;
        y3d y3dVar2 = jylVar.c;
        y3d y3dVar3 = jylVar.b;
        lxlVar.getClass();
        long j = lxlVar.f20819a;
        sylVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar3.g0(362294611);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(lxlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.e(sylVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.g(jylVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar3.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar3.i(function2) ? 131072 : 65536;
        }
        if (fetVar3.U(i2 & 1, (74899 & i2) != 74898)) {
            cwl cwlVar = lxlVar.f;
            uxl uxlVar = lxlVar.e;
            Object obj = lxlVar.b;
            boolean zF = fetVar3.f(j);
            Object objP = fetVar3.P();
            Object obj2 = ukd.f35823a;
            if (zF || objP == obj2) {
                objP = new pmm(function1, lxlVar, (byte) 0);
                fetVar3.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zF2 = fetVar3.f(j);
            Object objP2 = fetVar3.P();
            if (zF2 || objP2 == obj2) {
                objP2 = new pmm(function2, lxlVar, (byte) 1);
                fetVar3.o0(objP2);
            }
            Function0 function3 = (Function0) objP2;
            boolean zE = fetVar3.e(uxlVar.ordinal());
            Object objP3 = fetVar3.P();
            if (zE || objP3 == obj2) {
                objP3 = Boolean.valueOf(lxlVar.c());
                fetVar3.o0(objP3);
            }
            boolean zBooleanValue = ((Boolean) objP3).booleanValue();
            boolean zE2 = fetVar3.e(uxlVar.ordinal()) | fetVar3.g(obj);
            Object objP4 = fetVar3.P();
            if (zE2 || objP4 == obj2) {
                objP4 = Boolean.valueOf(lxlVar.b());
                fetVar3.o0(objP4);
            }
            boolean zBooleanValue2 = ((Boolean) objP4).booleanValue();
            boolean z3 = (i2 & 7168) == 2048;
            Object objP5 = fetVar3.P();
            if (z3 || objP5 == obj2) {
                objP5 = z ? f30750a : b;
                fetVar3.o0(objP5);
            }
            j73 j73Var = (j73) objP5;
            int i3 = i2 & 896;
            boolean zH = fetVar3.h(zBooleanValue2) | (i3 == 256);
            Object objP6 = fetVar3.P();
            if (zH || objP6 == obj2) {
                if (zBooleanValue2 && (y3dVar = jylVar.f17364a) != null) {
                    jM127getWhite300d7_KjU = y3dVar.f41946a;
                } else if (zBooleanValue2) {
                    pz40 pz40Var = s6t0.f31722a;
                    jM127getWhite300d7_KjU = s6t0.b().f33626a.getPrimary();
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    jM127getWhite300d7_KjU = StaticColors.INSTANCE.m127getWhite300d7_KjU();
                }
                objP6 = dw9.e(jM127getWhite300d7_KjU, fetVar3);
            }
            long j2 = ((y3d) objP6).f41946a;
            pz40 pz40Var3 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM127getWhite300d7_KjU2 = staticColors.m127getWhite300d7_KjU();
            boolean z4 = i3 == 256;
            Object objP7 = fetVar3.P();
            if (z4 || objP7 == obj2) {
                objP7 = dw9.e(staticColors.m123getWhite0d7_KjU(), fetVar3);
            }
            long j3 = ((y3d) objP7).f41946a;
            boolean zH2 = fetVar3.h(zBooleanValue2) | fetVar3.g(obj) | (i3 == 256);
            Object objP8 = fetVar3.P();
            if (zH2 || objP8 == obj2) {
                objP8 = dw9.e(zBooleanValue2 ? staticColors.m123getWhite0d7_KjU() : staticColors.m123getWhite0d7_KjU(), fetVar3);
            }
            long j4 = ((y3d) objP8).f41946a;
            boolean zH3 = fetVar3.h(zBooleanValue2) | (i3 == 256);
            Object objP9 = fetVar3.P();
            if (zH3 || objP9 == obj2) {
                objP9 = dw9.e(zBooleanValue2 ? s6t0.b().f33626a.getPrimaryForeground() : staticColors.m123getWhite0d7_KjU(), fetVar3);
            }
            long j5 = ((y3d) objP9).f41946a;
            boolean zH4 = fetVar3.h(zBooleanValue2) | (i3 == 256);
            Object objP10 = fetVar3.P();
            if (zH4 || objP10 == obj2) {
                objP10 = dw9.e(sac.P(zBooleanValue2, y3dVar3, y3dVar2, bbc.h), fetVar3);
            }
            long j6 = ((y3d) objP10).f41946a;
            boolean zH5 = fetVar3.h(zBooleanValue2) | (i3 == 256);
            Object objP11 = fetVar3.P();
            int i4 = i2;
            if (zH5 || objP11 == obj2) {
                objP11 = dw9.e(sac.P(zBooleanValue2, null, null, bbc.h), fetVar3);
            }
            long j7 = ((y3d) objP11).f41946a;
            boolean zH6 = fetVar3.h(zBooleanValue2) | (i3 == 256);
            Object objP12 = fetVar3.P();
            if (zH6 || objP12 == obj2) {
                objP12 = dw9.e(sac.P(zBooleanValue2, y3dVar3, y3dVar2, bbc.i), fetVar3);
            }
            long j8 = ((y3d) objP12).f41946a;
            l7m0 l7m0VarB = m5k0.b(j2, j73Var, fetVar3, 0, 12);
            l7m0 l7m0VarB2 = m5k0.b(jM127getWhite300d7_KjU2, j73Var, fetVar, 0, 12);
            l7m0 l7m0VarB3 = m5k0.b(j4, j73Var, fetVar, 0, 12);
            m5k0.b(j5, j73Var, fetVar, 0, 12);
            l7m0 l7m0VarB4 = m5k0.b(j6, j73Var, fetVar, 0, 12);
            l7m0 l7m0VarB5 = m5k0.b(j7, j73Var, fetVar, 0, 12);
            l7m0 l7m0VarB6 = m5k0.b(j8, j73Var, fetVar, 0, 12);
            l7m0 l7m0VarB7 = m5k0.b(j3, j73Var, fetVar, 0, 12);
            boolean z5 = ((i4 & 112) == 32) | ((i4 & 14) == 4);
            Object objP13 = fetVar.P();
            if (z5 || objP13 == obj2) {
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
                objP13 = Integer.valueOf(iIntValue);
                fetVar.o0(objP13);
            }
            int iIntValue2 = ((Number) objP13).intValue();
            boolean zG = fetVar.g(cwlVar) | fetVar.h(zBooleanValue);
            Object objP14 = fetVar.P();
            if (zG || objP14 == obj2) {
                if (cwlVar != null) {
                    b2 = 0;
                    ugdVar = new ugd(-2050890651, true, new qmm(zBooleanValue, cwlVar, b2));
                } else {
                    b2 = 0;
                    ugdVar = null;
                }
                fetVar.o0(ugdVar);
            } else {
                ugdVar = objP14;
                b2 = 0;
            }
            xdr xdrVar = (xdr) ugdVar;
            boolean zG2 = fetVar.g(null) | fetVar.h(zBooleanValue);
            Object objP15 = fetVar.P();
            if (zG2 || objP15 == obj2) {
                fetVar.o0(null);
                objP15 = null;
            }
            xdr xdrVar2 = (xdr) objP15;
            if (obj == null) {
                z2 = b2;
            } else if (obj instanceof ayl) {
                fetVar.e0(-127691889);
                ayl aylVar = (ayl) obj;
                obc.c(aylVar.f1673a, aylVar.b, aylVar.c, ((y3d) l7m0VarB4.getValue()).f41946a, lxlVar.c(), ((y3d) l7m0VarB.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, aylVar.d, aylVar.e, zBooleanValue2, function0, xdrVar2, xdrVar, fetVar, 0);
                fet fetVar4 = fetVar;
                fetVar4.r(b2);
                fetVar2 = fetVar4;
            } else {
                boolean z6 = b2;
                if (obj instanceof cyl) {
                    fetVar.e0(-127079174);
                    cyl cylVar = (cyl) obj;
                    o0x o0xVar = cylVar.f5182a;
                    Integer num = cylVar.c;
                    m0x m0xVar = cylVar.b;
                    long j9 = ((y3d) l7m0VarB4.getValue()).f41946a;
                    y3d y3dVar4 = (y3d) l7m0VarB5.getValue();
                    long j10 = y3dVar4.f41946a;
                    long j11 = ((y3d) l7m0VarB.getValue()).f41946a;
                    boolean zC = lxlVar.c();
                    Boolean bool = Boolean.FALSE;
                    vbc.d(o0xVar, m0xVar, j9, j11, zC, y3dVar4, bool, bool, num, zBooleanValue2, function0, xdrVar2, xdrVar, fetVar, 0);
                    fet fetVar5 = fetVar;
                    fetVar5.r(z6);
                    fetVar2 = fetVar5;
                } else if (obj instanceof yxl) {
                    fetVar.e0(-125771532);
                    yxl yxlVar = (yxl) obj;
                    String str = yxlVar.f43428a;
                    n0x n0xVar = yxlVar.b;
                    Integer num2 = yxlVar.d;
                    m0x m0xVar2 = yxlVar.c;
                    long j12 = ((y3d) l7m0VarB6.getValue()).f41946a;
                    y3d y3dVar5 = (y3d) l7m0VarB7.getValue();
                    long j13 = y3dVar5.f41946a;
                    kbc.c(str, n0xVar, m0xVar2, j12, ((y3d) l7m0VarB2.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, lxlVar.c(), sylVar, num2, y3dVar5, Boolean.FALSE, zBooleanValue2, function3, xdrVar2, xdrVar, fetVar, (i4 << 24) & 1879048192, 0);
                    fet fetVar6 = fetVar;
                    fetVar6.r(z6);
                    fetVar2 = fetVar6;
                } else if (obj instanceof xxl) {
                    fetVar.e0(273068506);
                    ibc.b(((xxl) obj).f41664a, zBooleanValue, ((y3d) l7m0VarB.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, iIntValue2, zBooleanValue2, function0, xdrVar2, xdrVar, fetVar, 0);
                    fet fetVar7 = fetVar;
                    fetVar7.r(z6);
                    fetVar2 = fetVar7;
                } else if (obj instanceof byl) {
                    fetVar.e0(-124403223);
                    byl bylVar = (byl) obj;
                    qbc.c(bylVar.f3425a, bylVar.b, ((y3d) l7m0VarB5.getValue()).f41946a, lxlVar.c(), ((y3d) l7m0VarB.getValue()).f41946a, ((y3d) l7m0VarB3.getValue()).f41946a, bylVar.c, bylVar.d, zBooleanValue2, function0, xdrVar2, xdrVar, fetVar, 0);
                    fet fetVar8 = fetVar;
                    fetVar8.r(false);
                    fetVar2 = fetVar8;
                } else if (obj instanceof zxl) {
                    fetVar.e0(-123779379);
                    zxl zxlVar = (zxl) obj;
                    String str2 = zxlVar.f45165a;
                    n0x n0xVar2 = zxlVar.b;
                    boolean zC2 = lxlVar.c();
                    long j14 = ((y3d) l7m0VarB2.getValue()).f41946a;
                    y3d y3dVar6 = (y3d) l7m0VarB7.getValue();
                    long j15 = y3dVar6.f41946a;
                    mbc.a(str2, n0xVar2, zC2, j14, ((y3d) l7m0VarB3.getValue()).f41946a, y3dVar6, zxlVar.c, zBooleanValue2, function3, xdrVar2, xdrVar, fetVar, 0, 0);
                    fet fetVar9 = fetVar;
                    fetVar9.r(false);
                    fetVar2 = fetVar9;
                } else {
                    z2 = 0;
                }
            }
            throw b1j.f(272977291, fetVar, z2);
        }
        fetVar3.X();
        fetVar2 = fetVar3;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) lxlVar, (Object) sylVar, (Object) jylVar, z, function1, (wdr) function2, i, (byte) 11);
        }
    }
}
