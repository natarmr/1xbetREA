package a;

import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xsm0 {
    public static void A(int i, int i2) {
        String strS;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strS = tnq0.s("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    jf4.o(twn.m(i2, "negative size: "));
                    return;
                }
                strS = tnq0.s("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strS);
        }
    }

    public static void B(int i, int i2, int i3) {
        String strC;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strC = C(i, i3, "start index");
            } else {
                strC = (i2 < 0 || i2 > i3) ? C(i2, i3, "end index") : tnq0.s("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static String C(int i, int i2, String str) {
        if (i < 0) {
            return tnq0.s("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return tnq0.s("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        jf4.o(twn.m(i2, "negative size: "));
        return null;
    }

    public static final void a(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1780516398);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(-517840350);
            fetVar2.r(false);
        } else {
            fetVar2.e0(-517840349);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40.b, 24.0f);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarA = g1t0.a();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarS, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarA, fetVar, (i2 >> 3) & 14, 0, 130040);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(Separators.COLON, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 6, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 15);
        }
    }

    public static final void b(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1892880514);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(-2117131024);
            fetVar2.r(false);
        } else {
            fetVar2.e0(-2117131023);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40.b, 24.0f);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarA = g1t0.a();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarS, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarA, fetVar, (i2 >> 3) & 14, 0, 130040);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(Separators.COLON, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 6, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 10);
        }
    }

    public static final void c(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-515256606);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(203634604);
            fetVar2.r(false);
        } else {
            fetVar2.e0(203634605);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40.b, 24.0f);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarS, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, (i2 >> 3) & 14, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 6);
        }
    }

    public static final void d(int i, fet fetVar) {
        fetVar.g0(1696661140);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(o7k0.u(jm40.b, 0.0f, 128.0f, 1), 1.0f), 18.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ofo0(i, (byte) 11);
        }
    }

    public static final void e(mm40 mm40Var, axo0 axo0Var, fet fetVar, int i) {
        axo0Var.getClass();
        fetVar.g0(1033749244);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(axo0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (axo0Var.equals(wwo0.f39894a)) {
                fetVar.e0(79001465);
                d(0, fetVar);
                fetVar.r(false);
            } else {
                if (!(axo0Var instanceof ywo0)) {
                    throw b1j.f(-1382926509, fetVar, false);
                }
                fetVar.e0(79096945);
                ywo0 ywo0Var = (ywo0) axo0Var;
                f(ywo0Var.f43380a, ywo0Var.b, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var, axo0Var, i, (byte) 21);
        }
    }

    public static final void f(String str, d4d d4dVar, fet fetVar, int i) {
        fetVar.g0(-995077036);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.e(d4dVar.ordinal()) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            v8q0.a(str, null, ibc.Y(d4dVar, fetVar), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, i2 & 14, 24960, 109562);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vwo0(str, d4dVar, i, (byte) 1);
        }
    }

    public static final void g(jjl jjlVar, gjl gjlVar, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        long backgroundContent;
        long jM75getBlack600d7_KjU;
        long jM123getWhite0d7_KjU;
        long jM130getWhite600d7_KjU;
        long jM123getWhite0d7_KjU2;
        long jM123getWhite0d7_KjU3;
        long jM123getWhite0d7_KjU4;
        fet fetVar2 = fetVar;
        jjlVar.getClass();
        y3d y3dVar = jjlVar.e;
        gjlVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(1063151772);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(jjlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.e(gjlVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = fetVar2.k(bmd.n) == k6z.b;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.a(0.0f);
                fetVar2.o0(objP);
            }
            agk0 agk0Var = (agk0) objP;
            boolean z2 = z;
            l7m0 l7m0VarB = d43.b(agk0Var.l(), ro4.m0(Response.BAD_REQUEST, 0, new zsf(0.0f, 0.0f, 0.5f, 1.0f), 2), null, null, fetVar, 48, 28);
            float fFloatValue = z2 ? -((Number) l7m0VarB.getValue()).floatValue() : ((Number) l7m0VarB.getValue()).floatValue();
            boolean zH = fetVar.h(z2);
            Object objP2 = fetVar.P();
            if (zH || objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(z2 ? R.drawable.ic_glyph_reload_rtl : R.drawable.ic_glyph_reload);
                fetVar.o0(objP2);
            }
            cgk0 cgk0Var = (cgk0) objP2;
            String str = jjlVar.c;
            boolean zG = fetVar.g(y3dVar);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                if (y3dVar != null) {
                    backgroundContent = y3dVar.f41946a;
                } else {
                    pz40 pz40Var = s6t0.f31722a;
                    backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                }
                objP3 = dw9.e(backgroundContent, fetVar);
            }
            long j = ((y3d) objP3).f41946a;
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object objP4 = fetVar.P();
            if (z3 || objP4 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    jM75getBlack600d7_KjU = s6t0.b().f33626a.getBackground();
                } else {
                    pz40 pz40Var3 = s6t0.f31722a;
                    jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
                }
                objP4 = dw9.e(jM75getBlack600d7_KjU, fetVar);
            }
            long j2 = ((y3d) objP4).f41946a;
            boolean z4 = i4 == 32;
            Object objP5 = fetVar.P();
            if (z4 || objP5 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var4 = s6t0.f31722a;
                    jM123getWhite0d7_KjU = s6t0.b().f33626a.getPrimary();
                } else {
                    pz40 pz40Var5 = s6t0.f31722a;
                    jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP5 = dw9.e(jM123getWhite0d7_KjU, fetVar);
            }
            long j3 = ((y3d) objP5).f41946a;
            boolean z5 = i4 == 32;
            Object objP6 = fetVar.P();
            if (z5 || objP6 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var6 = s6t0.f31722a;
                    jM130getWhite600d7_KjU = s6t0.b().f33626a.getSeparator();
                } else {
                    pz40 pz40Var7 = s6t0.f31722a;
                    jM130getWhite600d7_KjU = StaticColors.INSTANCE.m130getWhite600d7_KjU();
                }
                objP6 = dw9.e(jM130getWhite600d7_KjU, fetVar);
            }
            long j4 = ((y3d) objP6).f41946a;
            boolean z6 = i4 == 32;
            Object objP7 = fetVar.P();
            if (z6 || objP7 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var8 = s6t0.f31722a;
                    jM123getWhite0d7_KjU2 = s6t0.b().f33626a.getSecondary();
                } else {
                    pz40 pz40Var9 = s6t0.f31722a;
                    jM123getWhite0d7_KjU2 = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP7 = dw9.e(jM123getWhite0d7_KjU2, fetVar);
            }
            long j5 = ((y3d) objP7).f41946a;
            boolean z7 = i4 == 32;
            Object objP8 = fetVar.P();
            if (z7 || objP8 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var10 = s6t0.f31722a;
                    jM123getWhite0d7_KjU3 = s6t0.b().f33626a.getTextPrimary();
                } else {
                    pz40 pz40Var11 = s6t0.f31722a;
                    jM123getWhite0d7_KjU3 = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP8 = dw9.e(jM123getWhite0d7_KjU3, fetVar);
            }
            long j6 = ((y3d) objP8).f41946a;
            boolean z8 = i4 == 32;
            Object objP9 = fetVar.P();
            if (z8 || objP9 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var12 = s6t0.f31722a;
                    jM123getWhite0d7_KjU4 = s6t0.b().f33626a.getSecondary();
                } else {
                    pz40 pz40Var13 = s6t0.f31722a;
                    jM123getWhite0d7_KjU4 = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP9 = dw9.e(jM123getWhite0d7_KjU4, fetVar);
            }
            long j7 = ((y3d) objP9).f41946a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 16.0f, 8.0f);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            float f = fFloatValue;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z9 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z9) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarQ2 = i120.Q(s5x0.N(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 0.0f, 8.0f, 8.0f, 8.0f, 1), j2, vgg0.a(10.0f));
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            w9x.l(48.0f, 60.0f, u1c.M(962855486, new lkd0(function0, agk0Var, f, j3, cgk0Var, (byte) 1), fetVar), fetVar, 384, 0);
            jcb.H(s5x0.L(o7k0.e(jm40Var, 36.0f), 0.0f, 8.0f, 1), 1.0f, j4, fetVar, 0, 0);
            fetVar2 = fetVar;
            w9x.l(48.0f, 0.0f, u1c.M(118216295, new xhq(function1, jjlVar, j5, j6, j7), fetVar), fetVar2, 384, 2);
            fetVar2.r(true);
            if (str != null) {
                fetVar2.e0(-778665782);
                qzb.n(ig.a(fetVar2, o7k0.u(o7k0.e(jm40Var, 36.0f), 0.0f, 160.0f, 1)), new wul(iul.e, oe9.b, new ue9(str), true, false, false), function2, fetVar2, (i3 >> 6) & 896, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-777989238);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yhq(jjlVar, gjlVar, function0, function1, function2, i, (byte) 4);
        }
    }

    public static final void h(y5d y5dVar, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-900662042);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(y5dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2.X();
        } else if (str.length() > 0) {
            fetVar2.e0(-962093397);
            xx7 xx7Var = gqw0.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = y5dVar.a(jm40Var, xx7Var);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN, StaticColors.INSTANCE.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(false);
        } else {
            fetVar2.e0(-961585028);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z460(y5dVar, str, i, (byte) 2);
        }
    }

    public static final void i(lc00 lc00Var, m9s m9sVar, ctf0 ctf0Var) {
        String str;
        String str2;
        m9sVar.getClass();
        ctf0Var.getClass();
        qqs qqsVar = m9sVar.h;
        List list = qqsVar.c;
        if (qqsVar.c.isEmpty()) {
            return;
        }
        lc00Var.add(new psv("MARBLE_MMA_HEADER_KEY", R.string.round_statistics));
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ctf0Var.b.a(R.string.synthetic_round_v2, Arrays.copyOf(new Object[]{((ve90) it.next()).f37273a}, 1)));
        }
        lc00Var.add(new l6o0(arrayList));
        String str3 = m9sVar.i;
        String str4 = (String) CollectionsKt.U(m9sVar.m);
        str4.getClass();
        String str5 = "";
        if (kotlin.text.c.x(str4, ujn.h, false)) {
            str = str4;
        } else {
            if (str4.length() != 0) {
                List list2 = u0d.f34849a;
                if (!u0d.c(str4)) {
                    str4 = String.format(Locale.ENGLISH, StringsKt.O(str4, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str4}, 2));
                    str = str4;
                }
            }
            str = "";
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ve90) it2.next()).b);
        }
        lc00Var.add(new m6o0(R.drawable.cybergame_synthetic_football_first_bg, "MARBLE_MMA_FIRST_TEAM_KEY", str3, str, arrayList2));
        String str6 = m9sVar.j;
        String str7 = (String) CollectionsKt.U(m9sVar.n);
        str7.getClass();
        if (kotlin.text.c.x(str7, ujn.h, false)) {
            str2 = str7;
        } else {
            if (str7.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str7)) {
                    str5 = String.format(Locale.ENGLISH, StringsKt.O(str7, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str7}, 2));
                }
            }
            str2 = str5;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((ve90) it3.next()).c);
        }
        lc00Var.add(new m6o0(R.drawable.cybergame_synthetic_marble_mma_second_last_bg, "MARBLE_MMA_SECOND_TEAM_KEY", str6, str2, arrayList3));
    }

    public static final Integer j(mcz mczVar) {
        mczVar.getClass();
        List list = mczVar.l;
        int i = mczVar.o;
        if (list.isEmpty() || i == 0) {
            return null;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((ncz) list.get(i3)).q;
        }
        int size2 = i2 / list.size();
        int i4 = mczVar.s;
        return Integer.valueOf((((size2 + i4) - i4) * i) + ((i - 1) * i4) + (-mczVar.m) + mczVar.r);
    }

    public static final atv0 k(mcz mczVar, xsv0 xsv0Var) {
        Integer numJ = j(mczVar);
        int i = mczVar.o;
        if (numJ == null) {
            return zsv0.f44926a;
        }
        int iIntValue = numJ.intValue();
        int i2 = xsv0Var.f41437a;
        if (iIntValue < i2) {
            iIntValue = i2;
        }
        if (!xsv0Var.c || i2 != iIntValue || xsv0Var.b != i) {
            xsv0Var = null;
        }
        return xsv0Var != null ? xsv0Var : new xsv0(iIntValue, i, 0, true);
    }

    public static final ArrayList l(ser0 ser0Var) {
        f0r0 f0r0Var;
        List<f2r0> list = ser0Var.f32087a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (f2r0 f2r0Var : list) {
            if (Intrinsics.d(f2r0Var, c2r0.f3639a)) {
                f0r0Var = ser0Var.b;
            } else if (Intrinsics.d(f2r0Var, p1r0.f26218a)) {
                f0r0Var = ser0Var.c;
            } else if (Intrinsics.d(f2r0Var, y1r0.f41872a)) {
                f0r0Var = ser0Var.d;
            } else if (Intrinsics.d(f2r0Var, d2r0.f5371a)) {
                f0r0Var = ser0Var.e;
            } else if (Intrinsics.d(f2r0Var, b2r0.f1868a)) {
                f0r0Var = ser0Var.f;
            } else if (Intrinsics.d(f2r0Var, a2r0.f138a)) {
                f0r0Var = ser0Var.g;
            } else if (Intrinsics.d(f2r0Var, z1r0.f43635a)) {
                f0r0Var = ser0Var.h;
            } else if (Intrinsics.d(f2r0Var, n1r0.f22766a)) {
                f0r0Var = ser0Var.i;
            } else if (Intrinsics.d(f2r0Var, l1r0.f19271a)) {
                f0r0Var = ser0Var.j;
            } else if (Intrinsics.d(f2r0Var, w1r0.f38415a)) {
                f0r0Var = ser0Var.k;
            } else if (Intrinsics.d(f2r0Var, x1r0.f40134a)) {
                f0r0Var = ser0Var.l;
            } else if (Intrinsics.d(f2r0Var, k1r0.f17542a)) {
                f0r0Var = ser0Var.m;
            } else if (Intrinsics.d(f2r0Var, o1r0.f24496a)) {
                f0r0Var = ser0Var.n;
            } else if (Intrinsics.d(f2r0Var, m1r0.f21023a)) {
                f0r0Var = ser0Var.o;
            } else if (Intrinsics.d(f2r0Var, e2r0.f7100a)) {
                f0r0Var = ser0Var.p;
            } else if (Intrinsics.d(f2r0Var, t1r0.f33181a)) {
                f0r0Var = ser0Var.q;
            } else if (Intrinsics.d(f2r0Var, v1r0.f36646a)) {
                f0r0Var = ser0Var.r;
            } else if (Intrinsics.d(f2r0Var, u1r0.f34913a)) {
                f0r0Var = ser0Var.s;
            } else if (Intrinsics.d(f2r0Var, r1r0.f29696a)) {
                f0r0Var = ser0Var.t;
            } else {
                if (!Intrinsics.d(f2r0Var, q1r0.f27968a)) {
                    t9f.b();
                    return null;
                }
                f0r0Var = ser0Var.u;
            }
            arrayList.add(f0r0Var);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final wsy m(wsy wsyVar) {
        wsyVar.getClass();
        if (wsyVar instanceof g0t0) {
            return ((g0t0) wsyVar).p();
        }
        return null;
    }

    public static final tft0 n(tft0 tft0Var, wsy wsyVar) {
        tft0Var.getClass();
        wsyVar.getClass();
        return z(tft0Var, m(wsyVar));
    }

    public static int o(String str, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return 0;
    }

    public static sbu0 p(String str) {
        String strGroup;
        if (str == null || StringsKt.W(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        int i = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            return null;
        }
        int i2 = Integer.parseInt(strGroup2);
        String strGroup3 = matcher.group(3);
        if (strGroup3 == null) {
            return null;
        }
        int i3 = Integer.parseInt(strGroup3);
        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
        strGroup4.getClass();
        return new sbu0(i, i2, i3, strGroup4);
    }

    public static void q(bh9 bh9Var, fms0 fms0Var) throws ch9 {
        boolean z;
        fms0Var.f = null;
        i0t0 i0t0Var = fms0Var.c;
        i0t0Var.l = 0;
        i0t0Var.i = 0;
        i0t0Var.f = 0;
        i0t0Var.c = 0;
        String strC = bh9Var.C("pathMotionArc");
        i0t0 i0t0Var2 = new i0t0();
        boolean z2 = true;
        if (strC != null) {
            switch (strC) {
                case "startVertical":
                    i0t0Var2.b(509, 1);
                    break;
                case "startHorizontal":
                    i0t0Var2.b(509, 2);
                    break;
                case "flip":
                    i0t0Var2.b(509, 3);
                    break;
                case "none":
                    i0t0Var2.b(509, 0);
                    break;
                case "above":
                    i0t0Var2.b(509, 5);
                    break;
                case "below":
                    i0t0Var2.b(509, 4);
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        String strC2 = bh9Var.C("interpolator");
        if (strC2 != null) {
            i0t0Var2.c(705, strC2);
            z = true;
        }
        float fU = bh9Var.u("staggered");
        if (Float.isNaN(fU)) {
            z2 = z;
        } else {
            i0t0Var2.a(fU, 706);
        }
        if (z2) {
            for (int i = 0; i < i0t0Var2.c; i++) {
                i0t0Var.b(i0t0Var2.f13964a[i], i0t0Var2.b[i]);
            }
            for (int i2 = 0; i2 < i0t0Var2.f; i2++) {
                i0t0Var.a(i0t0Var2.e[i2], i0t0Var2.d[i2]);
            }
            for (int i3 = 0; i3 < i0t0Var2.i; i3++) {
                i0t0Var.c(i0t0Var2.g[i3], i0t0Var2.h[i3]);
            }
            for (int i4 = 0; i4 < i0t0Var2.l; i4++) {
                int i5 = i0t0Var2.j[i4];
                boolean z3 = i0t0Var2.k[i4];
                int i6 = i0t0Var.l;
                int[] iArr = i0t0Var.j;
                if (i6 >= iArr.length) {
                    i0t0Var.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = i0t0Var.k;
                    i0t0Var.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = i0t0Var.j;
                int i7 = i0t0Var.l;
                iArr2[i7] = i5;
                boolean[] zArr2 = i0t0Var.k;
                i0t0Var.l = i7 + 1;
                zArr2[i7] = z3;
            }
            i0t0Var2.d(fms0Var);
        }
        xg9 xg9VarZ = bh9Var.z("onSwipe");
        bh9 bh9Var2 = xg9VarZ instanceof bh9 ? (bh9) xg9VarZ : null;
        if (bh9Var2 != null) {
            String strC3 = bh9Var2.C("anchor");
            int iO = o(bh9Var2.C("side"), yls0.r);
            int iO2 = o(bh9Var2.C(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION), yls0.t);
            float fU2 = bh9Var2.u("scale");
            float fU3 = bh9Var2.u("threshold");
            float fU4 = bh9Var2.u("maxVelocity");
            float fU5 = bh9Var2.u("maxAccel");
            String strC4 = bh9Var2.C("limitBounds");
            int iO3 = o(bh9Var2.C("mode"), yls0.u);
            int iO4 = o(bh9Var2.C("touchUp"), yls0.v);
            float fU6 = bh9Var2.u("springMass");
            float fU7 = bh9Var2.u("springStiffness");
            float fU8 = bh9Var2.u("springDamping");
            float fU9 = bh9Var2.u("stopThreshold");
            int iO5 = o(bh9Var2.C("springBoundary"), yls0.w);
            bh9Var2.C("around");
            yls0 yls0Var = new yls0();
            yls0Var.f = 1.0f;
            yls0Var.g = 0;
            yls0Var.h = 4.0f;
            yls0Var.i = 1.2f;
            yls0Var.j = 0;
            yls0Var.k = 1.0f;
            yls0Var.l = 400.0f;
            yls0Var.m = 10.0f;
            yls0Var.n = 0.01f;
            yls0Var.o = 0.0f;
            yls0Var.p = 0;
            fms0Var.f = yls0Var;
            yls0Var.f42859a = strC3;
            yls0Var.b = iO;
            yls0Var.e = iO2;
            if (!Float.isNaN(fU2)) {
                yls0Var.f = fU2;
            }
            Float.isNaN(fU3);
            if (!Float.isNaN(fU4)) {
                yls0Var.h = fU4;
            }
            if (!Float.isNaN(fU5)) {
                yls0Var.i = fU5;
            }
            yls0Var.d = strC4;
            yls0Var.g = iO3;
            yls0Var.j = iO4;
            if (!Float.isNaN(fU6)) {
                yls0Var.k = fU6;
            }
            if (!Float.isNaN(fU7)) {
                yls0Var.l = fU7;
            }
            if (!Float.isNaN(fU8)) {
                yls0Var.m = fU8;
            }
            if (!Float.isNaN(fU9)) {
                yls0Var.n = fU9;
            }
            yls0Var.p = iO5;
        }
        r(bh9Var, fms0Var);
    }

    /* JADX WARN: Code duplicated, block: B:246:0x0645  */
    /* JADX WARN: Code duplicated, block: B:247:0x064b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0652  */
    /* JADX WARN: Code duplicated, block: B:251:0x0659  */
    /* JADX WARN: Code duplicated, block: B:253:0x0660  */
    /* JADX WARN: Code duplicated, block: B:314:0x0665 A[SYNTHETIC] */
    public static void r(bh9 bh9Var, fms0 fms0Var) throws ch9 {
        String str;
        String str2;
        String str3;
        int i;
        vg9 vg9Var;
        int i2;
        String str4;
        String str5;
        String str6;
        String str7;
        iyf[][] iyfVarArr;
        iyf[][] iyfVarArr2;
        int i3;
        String str8;
        bh9 bh9Var2;
        xg9 xg9VarZ = bh9Var.z("KeyFrames");
        bh9 bh9Var3 = xg9VarZ instanceof bh9 ? (bh9) xg9VarZ : null;
        if (bh9Var3 == null) {
            return;
        }
        vg9 vg9VarR = bh9Var3.r("KeyPositions");
        String str9 = "curveFit";
        String str10 = "transitionEasing";
        String str11 = "frames";
        String str12 = "target";
        if (vg9VarR != null) {
            int i4 = 0;
            while (i4 < vg9VarR.e.size()) {
                xg9 xg9VarM = vg9VarR.m(i4);
                if (xg9VarM instanceof bh9) {
                    bh9 bh9Var4 = (bh9) xg9VarM;
                    i0t0 i0t0Var = new i0t0();
                    vg9 vg9VarP = bh9Var4.p(str12);
                    vg9 vg9VarP2 = bh9Var4.p(str11);
                    vg9 vg9VarR2 = bh9Var4.r("percentX");
                    vg9 vg9VarR3 = bh9Var4.r("percentY");
                    vg9 vg9VarR4 = bh9Var4.r("percentWidth");
                    vg9 vg9VarR5 = bh9Var4.r("percentHeight");
                    String strC = bh9Var4.C("pathMotionArc");
                    String strC2 = bh9Var4.C(str10);
                    String strC3 = bh9Var4.C(str9);
                    String strC4 = bh9Var4.C(Payload.TYPE);
                    if (strC4 == null) {
                        strC4 = "parentRelative";
                    }
                    if ((vg9VarR2 == null || vg9VarP2.e.size() == vg9VarR2.e.size()) && (vg9VarR3 == null || vg9VarP2.e.size() == vg9VarR3.e.size())) {
                        int i5 = 0;
                        while (i5 < vg9VarP.e.size()) {
                            String strA = vg9VarP.A(i5);
                            int i6 = i5;
                            vg9 vg9Var2 = vg9VarP;
                            int iO = o(strC4, "deltaRelative", "pathRelative", "parentRelative");
                            i0t0Var.l = 0;
                            i0t0Var.i = 0;
                            i0t0Var.f = 0;
                            i0t0Var.c = 0;
                            i0t0Var.b(510, iO);
                            if (strC3 != null) {
                                String[] strArr = {"spline", "linear"};
                                for (int i7 = 0; i7 < 2; i7++) {
                                    if (strArr[i7].equals(strC3)) {
                                        i0t0Var.b(508, i7);
                                    }
                                }
                            }
                            if (strC2 != null) {
                                i0t0Var.c(Response.NOT_IMPLEMENTED, strC2);
                            }
                            if (strC != null) {
                                String[] strArr2 = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                for (int i8 = 0; i8 < 6; i8++) {
                                    if (strArr2[i8].equals(strC)) {
                                        i0t0Var.b(509, i8);
                                    }
                                }
                            }
                            int i9 = 0;
                            while (i9 < vg9VarP2.e.size()) {
                                String str13 = strC4;
                                i0t0Var.b(100, vg9VarP2.v(i9));
                                if (vg9VarR2 != null) {
                                    i0t0Var.a(vg9VarR2.s(i9), 506);
                                }
                                if (vg9VarR3 != null) {
                                    i0t0Var.a(vg9VarR3.s(i9), 507);
                                }
                                if (vg9VarR4 != null) {
                                    i0t0Var.a(vg9VarR4.s(i9), Response.SERVICE_UNAVAILABLE);
                                }
                                if (vg9VarR5 != null) {
                                    i0t0Var.a(vg9VarR5.s(i9), Response.SERVER_TIMEOUT);
                                }
                                int i10 = i9;
                                ems0 ems0VarA = fms0Var.a(0, strA);
                                ts40 ts40Var = new ts40();
                                i0t0Var.d(ts40Var);
                                ems0VarA.d.t.add(ts40Var);
                                i9 = i10 + 1;
                                strC4 = str13;
                            }
                            i5 = i6 + 1;
                            vg9VarP = vg9Var2;
                            strC4 = strC4;
                        }
                    }
                }
                i4++;
                vg9VarR = vg9VarR;
                str11 = str11;
                str12 = str12;
                str10 = str10;
                str9 = str9;
                bh9Var3 = bh9Var3;
            }
        }
        String str14 = str9;
        String str15 = str10;
        String str16 = str11;
        String str17 = str12;
        bh9 bh9Var5 = bh9Var3;
        vg9 vg9VarR6 = bh9Var5.r("KeyAttributes");
        if (vg9VarR6 != null) {
            int i11 = 0;
            while (i11 < vg9VarR6.e.size()) {
                xg9 xg9VarM2 = vg9VarR6.m(i11);
                if (xg9VarM2 instanceof bh9) {
                    bh9 bh9Var6 = (bh9) xg9VarM2;
                    str5 = str17;
                    vg9 vg9VarR7 = bh9Var6.r(str5);
                    if (vg9VarR7 == null) {
                        str4 = str16;
                    } else {
                        str4 = str16;
                        vg9 vg9VarR8 = bh9Var6.r(str4);
                        if (vg9VarR8 != null) {
                            String str18 = str15;
                            String strC5 = bh9Var6.C(str18);
                            String[] strArr3 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
                            byte b = 1;
                            int[] iArr = {311, 312, WarningHeader.MEDIA_TYPE_NOT_AVAILABLE, 305, WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD, 308, 309, 310, WarningHeader.INCOMPATIBLE_BANDWIDTH_UNITS};
                            boolean[] zArr = {false, false, true, true, true, false, false, false, false};
                            int size = vg9VarR8.e.size();
                            vg9VarR6 = vg9VarR6;
                            i0t0[] i0t0VarArr = new i0t0[size];
                            for (int i12 = 0; i12 < vg9VarR8.e.size(); i12++) {
                                i0t0VarArr[i12] = new i0t0();
                            }
                            int i13 = 0;
                            while (i13 < 9) {
                                String str19 = strArr3[i13];
                                int i14 = i13;
                                int i15 = iArr[i14];
                                boolean z = zArr[i14];
                                boolean[] zArr2 = zArr;
                                vg9 vg9VarR9 = bh9Var6.r(str19);
                                int i16 = i11;
                                if (vg9VarR9 != null && vg9VarR9.e.size() != size) {
                                    throw new ch9(kng0.l("incorrect size for ", str19, " array, not matching targets array!"), bh9Var6);
                                }
                                if (vg9VarR9 != null) {
                                    int i17 = 0;
                                    while (i17 < size) {
                                        float fS = vg9VarR9.s(i17);
                                        int i18 = i17;
                                        if (z) {
                                            fS = ((w6k) fms0Var.g.b).w0(fS);
                                        }
                                        i0t0VarArr[i18].a(fS, i15);
                                        i17 = i18 + 1;
                                    }
                                } else {
                                    float fU = bh9Var6.u(str19);
                                    if (!Float.isNaN(fU)) {
                                        if (z) {
                                            fU = ((w6k) fms0Var.g.b).w0(fU);
                                        }
                                        for (int i19 = 0; i19 < size; i19++) {
                                            i0t0VarArr[i19].a(fU, i15);
                                        }
                                    }
                                }
                                i13 = i14 + 1;
                                zArr = zArr2;
                                i11 = i16;
                            }
                            i11 = i11;
                            xg9 xg9VarZ2 = bh9Var6.z(Payload.CUSTOM);
                            if (xg9VarZ2 == null || !(xg9VarZ2 instanceof bh9)) {
                                str6 = str18;
                                bh9Var5 = bh9Var5;
                                iyfVarArr = null;
                            } else {
                                bh9 bh9Var7 = (bh9) xg9VarZ2;
                                int size2 = bh9Var7.e.size();
                                iyfVarArr = (iyf[][]) Array.newInstance((Class<?>) iyf.class, vg9VarR8.e.size(), size2);
                                int i20 = 0;
                                while (i20 < size2) {
                                    yg9 yg9Var = (yg9) bh9Var7.m(i20);
                                    bh9 bh9Var8 = bh9Var7;
                                    String strC6 = yg9Var.c();
                                    int i21 = size2;
                                    if (yg9Var.G() instanceof vg9) {
                                        vg9 vg9Var3 = (vg9) yg9Var.G();
                                        iyfVarArr2 = iyfVarArr;
                                        int size3 = vg9Var3.e.size();
                                        if (size3 != size || size3 <= 0) {
                                            i3 = i20;
                                        } else {
                                            i3 = i20;
                                            if (vg9Var3.m(0) instanceof zg9) {
                                                int i22 = 0;
                                                while (i22 < size) {
                                                    iyfVarArr2[i22][i3] = new iyf(vg9Var3.m(i22).e(), 901, strC6);
                                                    i22++;
                                                    str18 = str18;
                                                }
                                            } else {
                                                str8 = str18;
                                                int i23 = 0;
                                                while (i23 < size) {
                                                    bh9 bh9Var9 = bh9Var5;
                                                    vg9 vg9Var4 = vg9Var3;
                                                    long jF0 = bfb.f0(vg9Var3.m(i23).c());
                                                    if (jF0 != -1) {
                                                        iyfVarArr2[i23][i3] = new iyf(strC6, 902, (int) jF0);
                                                    }
                                                    i23++;
                                                    bh9Var5 = bh9Var9;
                                                    vg9Var3 = vg9Var4;
                                                }
                                            }
                                            bh9Var2 = bh9Var5;
                                        }
                                        str8 = str18;
                                        bh9Var2 = bh9Var5;
                                    } else {
                                        iyfVarArr2 = iyfVarArr;
                                        i3 = i20;
                                        str8 = str18;
                                        bh9Var2 = bh9Var5;
                                        xg9 xg9VarG = yg9Var.G();
                                        if (xg9VarG instanceof zg9) {
                                            float fE = xg9VarG.e();
                                            for (int i24 = 0; i24 < size; i24++) {
                                                iyfVarArr2[i24][i3] = new iyf(fE, 901, strC6);
                                            }
                                        } else {
                                            long jF1 = bfb.f0(xg9VarG.c());
                                            if (jF1 != -1) {
                                                int i25 = 0;
                                                while (i25 < size) {
                                                    iyfVarArr2[i25][i3] = new iyf(strC6, 902, (int) jF1);
                                                    i25++;
                                                    jF1 = jF1;
                                                }
                                            }
                                        }
                                    }
                                    i20 = i3 + 1;
                                    bh9Var5 = bh9Var2;
                                    bh9Var7 = bh9Var8;
                                    size2 = i21;
                                    iyfVarArr = iyfVarArr2;
                                    str18 = str8;
                                }
                                str6 = str18;
                                bh9Var5 = bh9Var5;
                            }
                            str7 = str14;
                            String strC7 = bh9Var6.C(str7);
                            int i26 = 0;
                            while (i26 < vg9VarR7.e.size()) {
                                int i27 = 0;
                                while (i27 < size) {
                                    String strA2 = vg9VarR7.A(i26);
                                    int i28 = i26;
                                    i0t0 i0t0Var2 = i0t0VarArr[i27];
                                    if (strC7 != null) {
                                        i0t0Var2.b(508, o(strC7, "spline", "linear"));
                                    }
                                    if (strC5 != null) {
                                        i0t0Var2.c(Response.NOT_IMPLEMENTED, strC5);
                                    } else {
                                        i0t0Var2.getClass();
                                    }
                                    i0t0Var2.b(100, vg9VarR8.v(i27));
                                    iyf[] iyfVarArr3 = iyfVarArr != 0 ? iyfVarArr[i27] : null;
                                    ems0 ems0VarA2 = fms0Var.a(0, strA2);
                                    rs40 rs40Var = new rs40();
                                    int i29 = size;
                                    rs40Var.d = -1;
                                    rs40Var.e = Float.NaN;
                                    rs40Var.f = Float.NaN;
                                    rs40Var.g = Float.NaN;
                                    rs40Var.h = Float.NaN;
                                    rs40Var.i = Float.NaN;
                                    rs40Var.j = Float.NaN;
                                    rs40Var.k = Float.NaN;
                                    rs40Var.l = Float.NaN;
                                    rs40Var.m = Float.NaN;
                                    rs40Var.n = Float.NaN;
                                    rs40Var.o = Float.NaN;
                                    rs40Var.p = Float.NaN;
                                    rs40Var.q = Float.NaN;
                                    rs40Var.r = Float.NaN;
                                    rs40Var.b = b;
                                    rs40Var.c = new HashMap();
                                    i0t0Var2.d(rs40Var);
                                    if (iyfVarArr3 != null) {
                                        int i30 = 0;
                                        while (i30 < iyfVarArr3.length) {
                                            HashMap map = rs40Var.c;
                                            iyf[] iyfVarArr4 = iyfVarArr3;
                                            iyf iyfVar = iyfVarArr4[i30];
                                            map.put(iyfVar.f15586a, iyfVar);
                                            i30++;
                                            iyfVarArr3 = iyfVarArr4;
                                        }
                                    }
                                    ems0VarA2.d.t.add(rs40Var);
                                    i27++;
                                    i26 = i28;
                                    iyfVarArr = iyfVarArr;
                                    strC7 = strC7;
                                    size = i29;
                                    b = 1;
                                }
                                i26++;
                                b = 1;
                            }
                        }
                        i11++;
                        str14 = str7;
                        str17 = str5;
                        str16 = str4;
                        bh9Var5 = bh9Var5;
                        vg9VarR6 = vg9VarR6;
                        str15 = str6;
                    }
                } else {
                    str4 = str16;
                    str5 = str17;
                }
                str6 = str15;
                str7 = str14;
                i11++;
                str14 = str7;
                str17 = str5;
                str16 = str4;
                bh9Var5 = bh9Var5;
                vg9VarR6 = vg9VarR6;
                str15 = str6;
            }
        }
        String str20 = str16;
        String str21 = str17;
        String str22 = str15;
        String str23 = str14;
        vg9 vg9VarR10 = bh9Var5.r("KeyCycles");
        if (vg9VarR10 != null) {
            int i31 = 0;
            while (i31 < vg9VarR10.e.size()) {
                xg9 xg9VarM3 = vg9VarR10.m(i31);
                if (xg9VarM3 instanceof bh9) {
                    bh9 bh9Var10 = (bh9) xg9VarM3;
                    vg9 vg9VarP3 = bh9Var10.p(str21);
                    vg9 vg9VarP4 = bh9Var10.p(str20);
                    str3 = str22;
                    String strC8 = bh9Var10.C(str3);
                    String[] strArr4 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", "period", "offset", "phase"};
                    int[] iArr2 = {311, 312, WarningHeader.MEDIA_TYPE_NOT_AVAILABLE, 305, WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD, 308, 309, 310, Response.FORBIDDEN, Response.INTERVAL_TOO_BRIEF, 424, 425};
                    int[] iArr3 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0};
                    int size4 = vg9VarP4.e.size();
                    i0t0[] i0t0VarArr2 = new i0t0[size4];
                    for (int i32 = 0; i32 < size4; i32++) {
                        i0t0VarArr2[i32] = new i0t0();
                    }
                    int i33 = 0;
                    boolean z2 = false;
                    while (true) {
                        if (i33 >= 12) {
                            break;
                        }
                        if (bh9Var10.D(strArr4[i33])) {
                            i2 = i33;
                            if (iArr3[i33] == 1) {
                                z2 = true;
                            }
                        } else {
                            i2 = i33;
                        }
                        i33 = i2 + 1;
                    }
                    int i34 = 0;
                    for (i = 12; i34 < i; i = 12) {
                        String str24 = strArr4[i34];
                        int i35 = i34;
                        int i36 = iArr2[i35];
                        String str25 = str21;
                        int i37 = iArr3[i35];
                        String[] strArr5 = strArr4;
                        vg9 vg9VarR11 = bh9Var10.r(str24);
                        String str26 = str20;
                        if (vg9VarR11 != null && vg9VarR11.e.size() != size4) {
                            throw new ch9("incorrect size for $attrName array, not matching targets array!", bh9Var10);
                        }
                        if (vg9VarR11 != null) {
                            int i38 = 0;
                            while (i38 < size4) {
                                float fS2 = vg9VarR11.s(i38);
                                int i39 = i38;
                                if (i37 == 1) {
                                    fS2 = ((w6k) fms0Var.g.b).w0(fS2);
                                } else if (i37 == 2 && z2) {
                                    fS2 = ((w6k) fms0Var.g.b).w0(fS2);
                                }
                                i0t0VarArr2[i39].a(fS2, i36);
                                i38 = i39 + 1;
                            }
                        } else {
                            float fU2 = bh9Var10.u(str24);
                            if (!Float.isNaN(fU2)) {
                                if (i37 == 1) {
                                    fU2 = ((w6k) fms0Var.g.b).w0(fU2);
                                } else if (i37 == 2 && z2) {
                                    fU2 = ((w6k) fms0Var.g.b).w0(fU2);
                                }
                                for (int i40 = 0; i40 < size4; i40++) {
                                    i0t0VarArr2[i40].a(fU2, i36);
                                }
                            }
                            i34 = i35 + 1;
                            str21 = str25;
                            strArr4 = strArr5;
                            str20 = str26;
                        }
                        i34 = i35 + 1;
                        str21 = str25;
                        strArr4 = strArr5;
                        str20 = str26;
                    }
                    str = str21;
                    str2 = str20;
                    String strC9 = bh9Var10.C(str23);
                    String strC10 = bh9Var10.C("easing");
                    String strC11 = bh9Var10.C("waveShape");
                    String strC12 = bh9Var10.C("customWave");
                    for (int i41 = 0; i41 < vg9VarP3.e.size(); i41++) {
                        int i42 = 0;
                        while (i42 < size4) {
                            String strA3 = vg9VarP3.A(i41);
                            String str27 = str23;
                            i0t0 i0t0Var3 = i0t0VarArr2[i42];
                            if (strC9 != null) {
                                vg9Var = vg9VarP3;
                                if (strC9.equals("linear")) {
                                    strC9 = strC9;
                                    i0t0Var3.b(Response.UNAUTHORIZED, 1);
                                } else if (strC9.equals("spline")) {
                                    i0t0Var3.b(Response.UNAUTHORIZED, 0);
                                }
                                if (strC8 != null) {
                                    i0t0Var3.c(Response.NOT_IMPLEMENTED, strC8);
                                } else {
                                    i0t0Var3.getClass();
                                }
                                if (strC10 != null) {
                                    i0t0Var3.c(Response.BAD_EXTENSION, strC10);
                                }
                                if (strC11 != null) {
                                    i0t0Var3.c(Response.EXTENSION_REQUIRED, strC11);
                                }
                                if (strC12 != null) {
                                    i0t0Var3.c(422, strC12);
                                }
                                i0t0Var3.b(100, vg9VarP4.v(i42));
                                ems0 ems0VarA3 = fms0Var.a(0, strA3);
                                ss40 ss40Var = new ss40();
                                ss40Var.d = -1;
                                ss40Var.e = null;
                                ss40Var.f = Float.NaN;
                                ss40Var.g = 0.0f;
                                ss40Var.h = 0.0f;
                                ss40Var.i = Float.NaN;
                                ss40Var.j = Float.NaN;
                                ss40Var.k = Float.NaN;
                                ss40Var.l = Float.NaN;
                                ss40Var.m = Float.NaN;
                                ss40Var.n = Float.NaN;
                                ss40Var.o = Float.NaN;
                                ss40Var.p = Float.NaN;
                                ss40Var.q = Float.NaN;
                                ss40Var.r = Float.NaN;
                                ss40Var.s = Float.NaN;
                                ss40Var.t = Float.NaN;
                                ss40Var.b = (byte) 4;
                                ss40Var.c = new HashMap();
                                i0t0Var3.d(ss40Var);
                                ems0VarA3.d.t.add(ss40Var);
                                i42++;
                                str23 = str27;
                                strC9 = strC9;
                                vg9VarP3 = vg9Var;
                            } else {
                                vg9Var = vg9VarP3;
                            }
                            if (strC8 != null) {
                                i0t0Var3.c(Response.NOT_IMPLEMENTED, strC8);
                            } else {
                                i0t0Var3.getClass();
                            }
                            if (strC10 != null) {
                                i0t0Var3.c(Response.BAD_EXTENSION, strC10);
                            }
                            if (strC11 != null) {
                                i0t0Var3.c(Response.EXTENSION_REQUIRED, strC11);
                            }
                            if (strC12 != null) {
                                i0t0Var3.c(422, strC12);
                            }
                            i0t0Var3.b(100, vg9VarP4.v(i42));
                            ems0 ems0VarA4 = fms0Var.a(0, strA3);
                            ss40 ss40Var2 = new ss40();
                            ss40Var2.d = -1;
                            ss40Var2.e = null;
                            ss40Var2.f = Float.NaN;
                            ss40Var2.g = 0.0f;
                            ss40Var2.h = 0.0f;
                            ss40Var2.i = Float.NaN;
                            ss40Var2.j = Float.NaN;
                            ss40Var2.k = Float.NaN;
                            ss40Var2.l = Float.NaN;
                            ss40Var2.m = Float.NaN;
                            ss40Var2.n = Float.NaN;
                            ss40Var2.o = Float.NaN;
                            ss40Var2.p = Float.NaN;
                            ss40Var2.q = Float.NaN;
                            ss40Var2.r = Float.NaN;
                            ss40Var2.s = Float.NaN;
                            ss40Var2.t = Float.NaN;
                            ss40Var2.b = (byte) 4;
                            ss40Var2.c = new HashMap();
                            i0t0Var3.d(ss40Var2);
                            ems0VarA4.d.t.add(ss40Var2);
                            i42++;
                            str23 = str27;
                            strC9 = strC9;
                            vg9VarP3 = vg9Var;
                        }
                    }
                } else {
                    str = str21;
                    str2 = str20;
                    str3 = str22;
                }
                i31++;
                str22 = str3;
                vg9VarR10 = vg9VarR10;
                str23 = str23;
                str21 = str;
                str20 = str2;
            }
        }
    }

    public static final String s(int i, fet fetVar) {
        return ((Resources) fetVar.k(dy2.c)).getString(i);
    }

    public static final String t(int i, Object[] objArr, fet fetVar) {
        return ((Resources) fetVar.k(dy2.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final long u(upl uplVar, fet fetVar) {
        uplVar.getClass();
        int iOrdinal = uplVar.ordinal();
        if (iOrdinal == 0) {
            fetVar.e0(410713860);
            ((hi0) fetVar.k(ii0.f14805a)).getClass();
            long j = hi0.b;
            fetVar.r(false);
            return j;
        }
        if (iOrdinal == 1) {
            fetVar.e0(410717062);
            ((hi0) fetVar.k(ii0.f14805a)).getClass();
            long j2 = hi0.n;
            fetVar.r(false);
            return j2;
        }
        if (iOrdinal != 2) {
            throw b1j.f(410711057, fetVar, false);
        }
        fetVar.e0(410720227);
        ((hi0) fetVar.k(ii0.f14805a)).getClass();
        long j3 = hi0.k;
        fetVar.r(false);
        return j3;
    }

    public static final e900 v(upl uplVar, fet fetVar) {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.6f);
        Float fValueOf3 = Float.valueOf(0.0f);
        uplVar.getClass();
        int iOrdinal = uplVar.ordinal();
        if (iOrdinal == 0) {
            fetVar.e0(-1037200020);
            Pair pair = new Pair(fValueOf3, new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU()));
            zfn zfnVar = ii0.f14805a;
            ((hi0) fetVar.k(zfnVar)).getClass();
            Pair pair2 = new Pair(fValueOf2, new y3d(hi0.c));
            ((hi0) fetVar.k(zfnVar)).getClass();
            e900 e900VarO = yk5.o(new Pair[]{pair, pair2, new Pair(fValueOf, new y3d(hi0.b))});
            fetVar.r(false);
            return e900VarO;
        }
        if (iOrdinal == 1) {
            fetVar.e0(-1037191184);
            Pair pair3 = new Pair(fValueOf3, new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU()));
            zfn zfnVar2 = ii0.f14805a;
            ((hi0) fetVar.k(zfnVar2)).getClass();
            Pair pair4 = new Pair(fValueOf2, new y3d(hi0.o));
            ((hi0) fetVar.k(zfnVar2)).getClass();
            e900 e900VarO2 = yk5.o(new Pair[]{pair3, pair4, new Pair(fValueOf, new y3d(hi0.n))});
            fetVar.r(false);
            return e900VarO2;
        }
        if (iOrdinal != 2) {
            throw b1j.f(-1037201788, fetVar, false);
        }
        fetVar.e0(-1037182326);
        Pair pair5 = new Pair(fValueOf3, new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU()));
        zfn zfnVar3 = ii0.f14805a;
        ((hi0) fetVar.k(zfnVar3)).getClass();
        Pair pair6 = new Pair(fValueOf2, new y3d(hi0.l));
        ((hi0) fetVar.k(zfnVar3)).getClass();
        e900 e900VarO3 = yk5.o(new Pair[]{pair5, pair6, new Pair(fValueOf, new y3d(hi0.k))});
        fetVar.r(false);
        return e900VarO3;
    }

    public static final lc00 w(long j, List list) {
        list.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        String str = (String) CollectionsKt.firstOrNull(list);
        if (str != null) {
            lc00VarB.add(vsm0.s(j, str));
        }
        String str2 = (String) CollectionsKt.W(1, list);
        if (str2 != null) {
            lc00VarB.add(vsm0.s(j, str2));
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final zqt0 x(ort0 ort0Var) {
        ort0Var.getClass();
        Long l = ort0Var.f25752a;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        String str = ort0Var.b;
        if (str == null) {
            jf4.k(null);
            return null;
        }
        String str2 = ort0Var.c;
        if (str2 == null) {
            str2 = "";
        }
        return new zqt0(jLongValue, str, str2);
    }

    public static final f7v0 y(e8v0 e8v0Var) {
        e8v0Var.getClass();
        switch (e8v0Var.ordinal()) {
            case 0:
                return f7v0.f9077a;
            case 1:
                return f7v0.b;
            case 2:
                return f7v0.c;
            case 3:
                return f7v0.d;
            case 4:
                return f7v0.e;
            case 5:
                return f7v0.f;
            case 6:
                return f7v0.g;
            case 7:
                return f7v0.h;
            case 8:
                return f7v0.i;
            case 9:
                return f7v0.j;
            case 10:
                return f7v0.k;
            case 11:
                return f7v0.l;
            case 12:
                return f7v0.m;
            case 13:
                return f7v0.n;
            default:
                t9f.b();
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final tft0 z(tft0 tft0Var, wsy wsyVar) {
        tft0Var.getClass();
        if (tft0Var instanceof g0t0) {
            return z(((g0t0) tft0Var).getOrigin(), wsyVar);
        }
        if (wsyVar == null || wsyVar.equals(tft0Var)) {
            return tft0Var;
        }
        if (tft0Var instanceof kzj0) {
            return new ozj0((kzj0) tft0Var, wsyVar);
        }
        if (tft0Var instanceof kkq) {
            return new okq((kkq) tft0Var, wsyVar);
        }
        t9f.b();
        return null;
    }
}
