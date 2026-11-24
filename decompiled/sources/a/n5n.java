package a;

import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n5n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f22952a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        zcl zclVar = qmk.f28987a;
        f22952a = 52.0f;
        b = 48.0f;
        c = 24.0f;
        d = 4.0f;
        e = 40.0f / (((float) Math.sqrt(1000.0d)) * 2.0f);
    }

    public static final void a(mm40 mm40Var, boolean z, l5n l5nVar, boolean z2, gy40 gy40Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        gy40 gy40Var2;
        jm40 jm40Var;
        mm40 mm40Var2;
        fet fetVar3;
        mm40 mm40Var3;
        l7m0 l7m0VarF;
        l7m0 l7m0Var;
        l7m0 l7m0VarF2;
        fetVar.g0(-146381261);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(l5nVar) : fetVar.i(l5nVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(gy40Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            omv omvVar = (omv) fetVar.k(bmd.l);
            cl5 cl5Var = ukd.f35823a;
            if (gy40Var == null) {
                fetVar.e0(-1452003512);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = dw9.j(fetVar);
                }
                gy40Var2 = (gy40) objP;
                fetVar.r(false);
            } else {
                fetVar.e0(1061539183);
                fetVar.r(false);
                gy40Var2 = gy40Var;
            }
            jm40 jm40Var2 = jm40.b;
            if (function1 != null) {
                fetVar.e0(-1451871390);
                ucg0 ucg0Var = new ucg0(2);
                boolean zI = ((i2 & 458752) == 131072) | fetVar.i(omvVar);
                Object objP2 = fetVar.P();
                if (zI || objP2 == cl5Var) {
                    objP2 = new dpl((Object) omvVar, (Object) function1, (byte) 21);
                    fetVar.o0(objP2);
                }
                mm40 mm40VarY = lv00.Y(jm40Var2, z, gy40Var2, z2, ucg0Var, (Function1) objP2);
                jm40Var = jm40Var2;
                fetVar.r(false);
                mm40Var2 = mm40VarY;
            } else {
                jm40Var = jm40Var2;
                fetVar.e0(-1451323465);
                fetVar.r(false);
                mm40Var2 = jm40Var;
            }
            if (z2) {
                fetVar.e0(-1480054968);
                mm40Var3 = mm40Var2;
                fetVar3 = fetVar;
                l7m0VarF = m5k0.b(z ? l5nVar.f19466a : l5nVar.b, null, fetVar3, 0, 14);
                fetVar3.r(false);
            } else {
                fetVar3 = fetVar;
                mm40Var3 = mm40Var2;
                fetVar3.e0(-1479905734);
                l7m0VarF = androidx.compose.runtime.e.f(new y3d(z ? l5nVar.e : l5nVar.f), fetVar3);
                fetVar3.r(false);
            }
            if (z2) {
                fetVar3.e0(1680988989);
                l7m0Var = l7m0VarF;
                l7m0VarF2 = m5k0.b(z ? l5nVar.c : l5nVar.d, null, fetVar3, 0, 14);
                fetVar3.r(false);
            } else {
                l7m0Var = l7m0VarF;
                fetVar3.e0(1681140207);
                l7m0VarF2 = androidx.compose.runtime.e.f(new y3d(z ? l5nVar.g : l5nVar.h), fetVar3);
                fetVar3.r(false);
            }
            w6k w6kVar = (w6k) fetVar3.k(bmd.h);
            float f = f22952a;
            float f2 = c;
            gy40 gy40Var3 = gy40Var2;
            float f3 = d;
            long jT = z ? ((long) w6kVar.T((f - f2) - (2.0f * f3))) << 32 : 0L;
            nul0 nul0VarG0 = ro4.g0(e, 1000.0f, null, 4);
            nul0 nul0Var = d43.f5435a;
            mm40 mm40Var4 = mm40Var3;
            jm40 jm40Var3 = jm40Var;
            l7m0 l7m0VarC = d43.c(new ikx(jT), hp4.p, nul0VarG0, null, "IntOffsetAnimation", null, fetVar, 384, 8);
            fetVar2 = fetVar;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var.e(mm40Var4), f), b);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarE, 0.0f, 8.0f, 1);
            l7m0 l7m0Var2 = l7m0Var;
            boolean zG = fetVar2.g(l7m0Var2);
            Object objP3 = fetVar2.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new x1d(l7m0Var2, (byte) 23);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarL2 = rq8.L(mm40VarL, (Function1) objP3);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean zG2 = fetVar2.g(l7m0VarC);
            Object objP4 = fetVar2.P();
            if (zG2 || objP4 == cl5Var) {
                objP4 = new v7i0(l7m0VarC, (byte) 25);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarN = o7k0.n(s5x0.J(a6x.a(knx.Q(jm40Var3, (xdr) objP4), gy40Var3, lcg0.a(20.0f, 4)), f3), f2);
            boolean zG3 = fetVar2.g(l7m0VarF2);
            Object objP5 = fetVar2.P();
            if (zG3 || objP5 == cl5Var) {
                objP5 = new x1d(l7m0VarF2, (byte) 24);
                fetVar2.o0(objP5);
            }
            zq8.a(0, fetVar2, rq8.L(mm40VarN, (Function1) objP5));
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ag(mm40Var, z, l5nVar, z2, gy40Var, function1, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0129  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void b(mm40 mm40Var, boolean z, boolean z2, gy40 gy40Var, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        boolean z3;
        int i4;
        gy40 gy40Var2;
        int i5;
        Function1 function2;
        boolean z4;
        boolean z5;
        gy40 gy40Var3;
        yfe0 yfe0VarU;
        mm40 mm40Var3;
        ThemeColors themeColors;
        Object objP;
        int i6;
        fetVar.g0(2113416308);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                z3 = z2;
                i3 |= fetVar.h(z3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    gy40Var2 = gy40Var;
                    if (fetVar.g(gy40Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    function2 = function1;
                    if (fetVar.i(function2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                } else {
                    function2 = function1;
                }
                if ((i3 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (fetVar.U(i3 & 1, z4)) {
                    if (i7 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        gy40Var3 = null;
                    } else {
                        gy40Var3 = gy40Var2;
                    }
                    themeColors = (ThemeColors) fetVar.k(zaq0.b);
                    objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        l5n l5nVar = new l5n(themeColors.getPrimary(), themeColors.getSwitchOff(), themeColors.getPrimaryForeground(), themeColors.getPrimaryForeground(), y3d.c(0.5f, themeColors.getPrimary()), y3d.c(0.5f, themeColors.getSwitchOff()), y3d.c(0.7f, themeColors.getPrimaryForeground()), y3d.c(0.7f, themeColors.getPrimaryForeground()));
                        fetVar.o0(l5nVar);
                        objP = l5nVar;
                    }
                    int i9 = i3 << 3;
                    mm40 mm40Var4 = mm40Var3;
                    a(mm40Var4, z, (l5n) objP, z5, gy40Var3, function2, fetVar, (i3 & 126) | (i9 & 7168) | (57344 & i9) | (i9 & 458752));
                    mm40Var2 = mm40Var4;
                } else {
                    fetVar.X();
                    z5 = z3;
                    gy40Var3 = gy40Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new xjm(mm40Var2, z, z5, gy40Var3, function1, i, i2);
                }
            }
            i3 |= 3072;
            gy40Var2 = gy40Var;
            if ((i & 24576) == 0) {
                function2 = function1;
                if (fetVar.i(function2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            } else {
                function2 = function1;
            }
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fetVar.U(i3 & 1, z4)) {
                if (i7 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    gy40Var3 = null;
                } else {
                    gy40Var3 = gy40Var2;
                }
                themeColors = (ThemeColors) fetVar.k(zaq0.b);
                objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    l5n l5nVar2 = new l5n(themeColors.getPrimary(), themeColors.getSwitchOff(), themeColors.getPrimaryForeground(), themeColors.getPrimaryForeground(), y3d.c(0.5f, themeColors.getPrimary()), y3d.c(0.5f, themeColors.getSwitchOff()), y3d.c(0.7f, themeColors.getPrimaryForeground()), y3d.c(0.7f, themeColors.getPrimaryForeground()));
                    fetVar.o0(l5nVar2);
                    objP = l5nVar2;
                }
                int i10 = i3 << 3;
                mm40 mm40Var5 = mm40Var3;
                a(mm40Var5, z, (l5n) objP, z5, gy40Var3, function2, fetVar, (i3 & 126) | (i10 & 7168) | (57344 & i10) | (i10 & 458752));
                mm40Var2 = mm40Var5;
            } else {
                fetVar.X();
                z5 = z3;
                gy40Var3 = gy40Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new xjm(mm40Var2, z, z5, gy40Var3, function1, i, i2);
            }
        }
        i3 |= 384;
        z3 = z2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                gy40Var2 = gy40Var;
                if (fetVar.g(gy40Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                function2 = function1;
                if (fetVar.i(function2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            } else {
                function2 = function1;
            }
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fetVar.U(i3 & 1, z4)) {
                if (i7 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    gy40Var3 = null;
                } else {
                    gy40Var3 = gy40Var2;
                }
                themeColors = (ThemeColors) fetVar.k(zaq0.b);
                objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    l5n l5nVar3 = new l5n(themeColors.getPrimary(), themeColors.getSwitchOff(), themeColors.getPrimaryForeground(), themeColors.getPrimaryForeground(), y3d.c(0.5f, themeColors.getPrimary()), y3d.c(0.5f, themeColors.getSwitchOff()), y3d.c(0.7f, themeColors.getPrimaryForeground()), y3d.c(0.7f, themeColors.getPrimaryForeground()));
                    fetVar.o0(l5nVar3);
                    objP = l5nVar3;
                }
                int i11 = i3 << 3;
                mm40 mm40Var6 = mm40Var3;
                a(mm40Var6, z, (l5n) objP, z5, gy40Var3, function2, fetVar, (i3 & 126) | (i11 & 7168) | (57344 & i11) | (i11 & 458752));
                mm40Var2 = mm40Var6;
            } else {
                fetVar.X();
                z5 = z3;
                gy40Var3 = gy40Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new xjm(mm40Var2, z, z5, gy40Var3, function1, i, i2);
            }
        }
        i3 |= 3072;
        gy40Var2 = gy40Var;
        if ((i & 24576) == 0) {
            function2 = function1;
            if (fetVar.i(function2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        } else {
            function2 = function1;
        }
        if ((i3 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (fetVar.U(i3 & 1, z4)) {
            if (i7 != 0) {
                mm40Var3 = jm40.b;
            } else {
                mm40Var3 = mm40Var2;
            }
            if (i8 != 0) {
                z5 = true;
            } else {
                z5 = z3;
            }
            if (i4 != 0) {
                gy40Var3 = null;
            } else {
                gy40Var3 = gy40Var2;
            }
            themeColors = (ThemeColors) fetVar.k(zaq0.b);
            objP = fetVar.P();
            if (objP == ukd.f35823a) {
                l5n l5nVar4 = new l5n(themeColors.getPrimary(), themeColors.getSwitchOff(), themeColors.getPrimaryForeground(), themeColors.getPrimaryForeground(), y3d.c(0.5f, themeColors.getPrimary()), y3d.c(0.5f, themeColors.getSwitchOff()), y3d.c(0.7f, themeColors.getPrimaryForeground()), y3d.c(0.7f, themeColors.getPrimaryForeground()));
                fetVar.o0(l5nVar4);
                objP = l5nVar4;
            }
            int i12 = i3 << 3;
            mm40 mm40Var7 = mm40Var3;
            a(mm40Var7, z, (l5n) objP, z5, gy40Var3, function2, fetVar, (i3 & 126) | (i12 & 7168) | (57344 & i12) | (i12 & 458752));
            mm40Var2 = mm40Var7;
        } else {
            fetVar.X();
            z5 = z3;
            gy40Var3 = gy40Var2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xjm(mm40Var2, z, z5, gy40Var3, function1, i, i2);
        }
    }
}
