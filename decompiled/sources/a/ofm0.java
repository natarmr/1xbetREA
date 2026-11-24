package a;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.Window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ofm0 {
    public static final void A(Window window, Context context, int i, int i2, boolean z, boolean z2) {
        ycm0 ziv0Var;
        ycm0 ziv0Var2;
        ycm0 ziv0Var3;
        window.getClass();
        context.getClass();
        if (iym0.v(window)) {
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        TypedValue typedValue = j5d.f15927a;
        int color = context.getColor(i);
        int color2 = (i3 >= 26 || !z) ? context.getColor(i2) : j5d.a(context, R.attr.navigationBarColor, false);
        ani0 ani0Var = new ani0(window.getDecorView());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            ziv0Var = new bjv0(window, ani0Var);
        } else if (i4 >= 30) {
            ziv0Var = new ajv0(window, ani0Var);
        } else {
            ziv0Var = i4 >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        }
        if (window.getStatusBarColor() == color && window.getNavigationBarColor() == color2 && ziv0Var.u() == z && ziv0Var.t() == z2) {
            return;
        }
        window.setStatusBarColor(color);
        window.setNavigationBarColor(color2);
        ani0 ani0Var2 = new ani0(window.getDecorView());
        if (i3 >= 35) {
            ziv0Var2 = new bjv0(window, ani0Var2);
        } else if (i3 >= 30) {
            ziv0Var2 = new ajv0(window, ani0Var2);
        } else {
            ziv0Var2 = i3 >= 26 ? new ziv0(window, ani0Var2) : new yiv0(window, ani0Var2);
        }
        ziv0Var2.w(z);
        ani0 ani0Var3 = new ani0(window.getDecorView());
        if (i3 >= 35) {
            ziv0Var3 = new bjv0(window, ani0Var3);
        } else if (i3 >= 30) {
            ziv0Var3 = new ajv0(window, ani0Var3);
        } else {
            ziv0Var3 = i3 >= 26 ? new ziv0(window, ani0Var3) : new yiv0(window, ani0Var3);
        }
        ziv0Var3.v(z2);
    }

    public static final w56 B(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        p6x p6xVar;
        w56 r56Var;
        xem xemVar;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        xem xemVar2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        p6x p6xVar2;
        p6x p6xVar3;
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        ctf0Var.getClass();
        str.getClass();
        list.getClass();
        v5l0Var.getClass();
        str2.getClass();
        y78Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        dzm dzmVar = dzm.f6947a;
        fzm fzmVar = fzm.f10414a;
        if (iOrdinal != 0) {
            tem temVar = tem.f33827a;
            wem wemVar = wem.f39025a;
            vem vemVar = vem.f37292a;
            if (iOrdinal != 1) {
                f2i f2iVar = null;
                if (iOrdinal == 2) {
                    boolean z6 = true;
                    long j = d0tVar.f5282a;
                    k4i k4iVarT = w7n0.t(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    boolean zF0 = kpb.f0(d0tVar, z);
                    boolean zA0 = kpb.a0(d0tVar, z, z2);
                    int i = gql0.f11739a;
                    int i2 = rqsVar.g;
                    boolean z7 = i2 > 0;
                    boolean z8 = i2 == 1;
                    boolean z9 = z7 && z8;
                    if (!z7 || z8) {
                        z6 = false;
                    }
                    String strS0 = qzb.s0(d0tVar);
                    tym tymVarR = fxb.R(d0tVar, ctf0Var);
                    String str15 = (tymVarR == null || (str14 = tymVarR.b) == null) ? "" : str14;
                    tym tymVarS = fxb.S(d0tVar);
                    String str16 = (tymVarS == null || (str13 = tymVarS.b) == null) ? "" : str13;
                    String str17 = fxb.T(d0tVar, ctf0Var).b;
                    tym tymVarR2 = fxb.R(d0tVar, ctf0Var);
                    boolean z10 = tymVarR2 != null ? tymVarR2.d : false;
                    tym tymVarS2 = fxb.S(d0tVar);
                    wws0 wws0Var = new wws0(strS0, null, 0, str15, str16, str17, fxb.T(d0tVar, ctf0Var).d, z10, tymVarS2 != null ? tymVarS2.d : false);
                    String strT0 = qzb.t0(d0tVar);
                    tym tymVarR3 = fxb.R(d0tVar, ctf0Var);
                    String str18 = (tymVarR3 == null || (str12 = tymVarR3.c) == null) ? "" : str12;
                    tym tymVarS3 = fxb.S(d0tVar);
                    String str19 = (tymVarS3 == null || (str11 = tymVarS3.c) == null) ? "" : str11;
                    String str20 = fxb.T(d0tVar, ctf0Var).c;
                    tym tymVarR4 = fxb.R(d0tVar, ctf0Var);
                    boolean z11 = tymVarR4 != null ? tymVarR4.e : false;
                    tym tymVarS4 = fxb.S(d0tVar);
                    wws0 wws0Var2 = new wws0(strT0, null, 0, str18, str19, str20, fxb.T(d0tVar, ctf0Var).e, z11, tymVarS4 != null ? tymVarS4.e : false);
                    String strX = hfm0.x(y78Var, d0tVar, ctf0Var, z5);
                    tym tymVarR5 = fxb.R(d0tVar, ctf0Var);
                    String str21 = (tymVarR5 == null || (str10 = tymVarR5.f34762a) == null) ? "" : str10;
                    tym tymVarS5 = fxb.S(d0tVar);
                    String str22 = (tymVarS5 == null || (str9 = tymVarS5.f34762a) == null) ? "" : str9;
                    String str23 = fxb.T(d0tVar, ctf0Var).f34762a;
                    if (z9) {
                        xemVar2 = vemVar;
                    } else {
                        xemVar2 = z6 ? wemVar : temVar;
                    }
                    if (zF0) {
                        f2iVar = e2i.f7087a;
                    } else if (zA0) {
                        f2iVar = c2i.f3624a;
                    }
                    r56Var = new u56(j, k4iVarT, new y86(wws0Var, wws0Var2, f2iVar, ctf0Var.b.a(org.xbet.client1.R.string.live_new, Arrays.copyOf(new Object[0], 0)), strX, str21, str22, str23, kpb.e0(d0tVar) ? q0n.f27908a : o0n.f24435a, xemVar2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                } else if (iOrdinal == 3) {
                    long j2 = d0tVar.f5282a;
                    n0x n0xVar = new n0x(dtb.F(str));
                    l4i l4iVarS = w7n0.s(null, d0tVar, str, hfm0.x(y78Var, d0tVar, ctf0Var, z5), ctf0Var.b.a(org.xbet.client1.R.string.live_new, Arrays.copyOf(new Object[0], 0)), str2, list, z3, z4, kpb.e0(d0tVar), kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                    int i3 = gql0.f11739a;
                    int i4 = rqsVar.g;
                    boolean z12 = i4 > 0;
                    boolean z13 = i4 == 1;
                    boolean z14 = z12 && z13;
                    boolean z15 = z12 && !z13;
                    czm czmVarD = hfm0.D(d0tVar);
                    czm czmVarE = hfm0.E(d0tVar);
                    tym tymVarR6 = fxb.R(d0tVar, ctf0Var);
                    tym tymVarS6 = fxb.S(d0tVar);
                    tym tymVarT = fxb.T(d0tVar, ctf0Var);
                    if (z14) {
                        p6xVar2 = p6x.f26478a;
                    } else {
                        p6xVar2 = z15 ? p6x.b : p6x.c;
                    }
                    r56Var = new t56(j2, l4iVarS, new q86(czmVarD, czmVarE, tymVarR6, tymVarS6, tymVarT, p6xVar2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    long j3 = d0tVar.f5282a;
                    k4i k4iVarR = w7n0.r(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                    int i5 = gql0.f11739a;
                    int i6 = rqsVar.g;
                    boolean z16 = i6 > 0;
                    boolean z17 = i6 == 1;
                    boolean z18 = z16 && z17;
                    boolean z19 = z16 && !z17;
                    czm czmVarD2 = hfm0.D(d0tVar);
                    czm czmVarE2 = hfm0.E(d0tVar);
                    tym tymVarR7 = fxb.R(d0tVar, ctf0Var);
                    tym tymVarS7 = fxb.S(d0tVar);
                    tym tymVarT2 = fxb.T(d0tVar, ctf0Var);
                    if (z18) {
                        p6xVar3 = p6x.f26478a;
                    } else {
                        p6xVar3 = z19 ? p6x.b : p6x.c;
                    }
                    r56Var = new s56(j3, k4iVarR, new i86(czmVarD2, czmVarE2, tymVarR7, tymVarS7, tymVarT2, p6xVar3, new sym(ctf0Var.b.a(org.xbet.client1.R.string.live_new, Arrays.copyOf(new Object[0], 0)), hfm0.x(y78Var, d0tVar, ctf0Var, z5), kpb.e0(d0tVar) ? fzmVar : dzmVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
            } else {
                long j4 = d0tVar.f5282a;
                j4i j4iVarU = w7n0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                int i7 = gql0.f11739a;
                int i8 = rqsVar.g;
                boolean z20 = i8 > 0;
                boolean z21 = i8 == 1;
                boolean z22 = z20 && z21;
                boolean z23 = z20 && !z21;
                String strS1 = qzb.s0(d0tVar);
                tym tymVarR8 = fxb.R(d0tVar, ctf0Var);
                String str24 = (tymVarR8 == null || (str8 = tymVarR8.b) == null) ? "" : str8;
                tym tymVarS8 = fxb.S(d0tVar);
                String str25 = (tymVarS8 == null || (str7 = tymVarS8.b) == null) ? "" : str7;
                String str26 = fxb.T(d0tVar, ctf0Var).b;
                tym tymVarR9 = fxb.R(d0tVar, ctf0Var);
                boolean z24 = tymVarR9 != null ? tymVarR9.d : false;
                tym tymVarS9 = fxb.S(d0tVar);
                vws0 vws0Var = new vws0(strS1, 0, str24, str25, str26, fxb.T(d0tVar, ctf0Var).d, z24, tymVarS9 != null ? tymVarS9.d : false);
                String strT1 = qzb.t0(d0tVar);
                tym tymVarR10 = fxb.R(d0tVar, ctf0Var);
                String str27 = (tymVarR10 == null || (str6 = tymVarR10.c) == null) ? "" : str6;
                tym tymVarS10 = fxb.S(d0tVar);
                String str28 = (tymVarS10 == null || (str5 = tymVarS10.c) == null) ? "" : str5;
                String str29 = fxb.T(d0tVar, ctf0Var).c;
                tym tymVarR11 = fxb.R(d0tVar, ctf0Var);
                boolean z25 = tymVarR11 != null ? tymVarR11.e : false;
                tym tymVarS11 = fxb.S(d0tVar);
                vws0 vws0Var2 = new vws0(strT1, 0, str27, str28, str29, fxb.T(d0tVar, ctf0Var).e, z25, tymVarS11 != null ? tymVarS11.e : false);
                String strX2 = hfm0.x(y78Var, d0tVar, ctf0Var, z5);
                tym tymVarR12 = fxb.R(d0tVar, ctf0Var);
                String str30 = (tymVarR12 == null || (str4 = tymVarR12.f34762a) == null) ? "" : str4;
                tym tymVarS12 = fxb.S(d0tVar);
                String str31 = (tymVarS12 == null || (str3 = tymVarS12.f34762a) == null) ? "" : str3;
                String str32 = fxb.T(d0tVar, ctf0Var).f34762a;
                if (z22) {
                    xemVar = vemVar;
                } else {
                    xemVar = z23 ? wemVar : temVar;
                }
                r56Var = new v56(j4, j4iVarU, new g96(vws0Var, vws0Var2, strX2, str30, str31, str32, qem.f28591a, xemVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            long j5 = d0tVar.f5282a;
            i4i i4iVarQ = w7n0.q(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
            int i9 = gql0.f11739a;
            int i10 = rqsVar.g;
            boolean z26 = i10 > 0;
            boolean z27 = i10 == 1;
            boolean z28 = z26 && z27;
            boolean z29 = z26 && !z27;
            czm czmVarD3 = hfm0.D(d0tVar);
            czm czmVarE3 = hfm0.E(d0tVar);
            tym tymVarR13 = fxb.R(d0tVar, ctf0Var);
            tym tymVarS13 = fxb.S(d0tVar);
            tym tymVarT3 = fxb.T(d0tVar, ctf0Var);
            if (z28) {
                p6xVar = p6x.f26478a;
            } else {
                p6xVar = z29 ? p6x.b : p6x.c;
            }
            r56Var = new r56(j5, i4iVarQ, new a86(czmVarD3, czmVarE3, tymVarR13, tymVarS13, tymVarT3, p6xVar, new rym(hfm0.x(y78Var, d0tVar, ctf0Var, z5), kpb.e0(d0tVar) ? fzmVar : dzmVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return r56Var;
    }

    public static int C(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static /* synthetic */ boolean D(int i, jgx0 jgx0Var, StringBuilder sb) {
        if (i - 1 != 0 || jgx0Var == jgx0.f16501a) {
            return false;
        }
        sb.append(jgx0Var.a());
        sb.append('.');
        sb.append(jgx0Var.b());
        sb.append(':');
        sb.append(jgx0Var.c());
        return true;
    }

    public static final void a(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1473411762);
        byte b = 2;
        byte b2 = 16;
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarC = o7k0.c(jm40.b, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g4p0(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new okp0(mdmVar, function1, i, b);
        }
    }

    public static final void b(int i, fet fetVar) {
        fetVar.g0(-1734038267);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.J(jm40.b, 16.0f), 1.0f), 250.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zgp0(i, (byte) 9);
        }
    }

    public static final void c(ir8 ir8Var, mm40 mm40Var, lqw lqwVar, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z;
        zx7 zx7Var = gqw0.e;
        function1.getClass();
        fetVar.g0(-1795853621);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(lqwVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = lqwVar instanceof hqw;
            cl5 cl5Var = ukd.f35823a;
            if (z2) {
                fetVar.e0(2132635713);
                a4x a4xVar = ((hqw) lqwVar).f13504a;
                z = (i2 & 7168) == 2048;
                Object objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new coo0(function1, b2);
                    fetVar.o0(objP);
                }
                gkb.c(a4xVar, mm40Var, (Function1) objP, org.xbet.client1.R.string.match_reviewe, fetVar, i2 & 112, 0);
                fetVar.r(false);
            } else {
                boolean z3 = lqwVar instanceof iqw;
                jm40 jm40Var = jm40.b;
                if (z3) {
                    fetVar.e0(761545758);
                    jcb.l(ir8Var.b(jm40Var, zx7Var), ((iqw) lqwVar).f15230a, false, null, fetVar, 0, 12);
                    fetVar.r(false);
                } else if (lqwVar instanceof jqw) {
                    fetVar.e0(761549933);
                    mm40 mm40VarB = ir8Var.b(jm40Var, zx7Var);
                    mdm mdmVar = ((jqw) lqwVar).f16976a;
                    z = (i2 & 7168) == 2048;
                    Object objP2 = fetVar.P();
                    if (z || objP2 == cl5Var) {
                        objP2 = new gno0(function1, b);
                        fetVar.o0(objP2);
                    }
                    jcb.l(mm40VarB, mdmVar, false, (Function0) objP2, fetVar, 0, 4);
                    fetVar.r(false);
                } else {
                    if (!(lqwVar instanceof kqw)) {
                        throw b1j.f(761529738, fetVar, false);
                    }
                    fetVar.e0(2133465180);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    float f = ((Configuration) fetVar.k(dy2.f6873a)).screenHeightDp;
                    zcl zclVar = qmk.f28987a;
                    s0x.t(iym0.r(f - 134.0f), 48, fetVar, mm40VarD);
                    fetVar.r(false);
                }
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg00(ir8Var, mm40Var, lqwVar, function1, i, (byte) 2);
        }
    }

    public static final void d(pop0 pop0Var, boolean z, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(-809957347);
        int i2 = (fetVar.g(pop0Var) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(-979924636);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-979923712);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-520377123, new l7p0(pop0Var, (byte) 9), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xh20((Object) pop0Var, z, i, (byte) 20);
        }
    }

    public static final void e(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1419936049);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(org.xbet.client1.R.string.statistic_info_performance_in_champ, fmm.f9790a, 0L, false, false, null, null, false, 252);
            j9m0 j9m0Var = ((sop0) l7m0Var.getValue()).b().f22146a;
            zdm0 zdm0Var = ((sop0) l7m0Var.getValue()).b().b;
            boolean zA = ((sop0) l7m0Var.getValue()).a();
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g4p0(function1, (byte) 15);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, (Function0) objP, null, null, u1c.M(-1777549347, new xs4(l7m0Var, function1, (byte) 12), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i, (byte) 26);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        brm0.B(str, str2, str3);
        fetVar2.g0(-999372232);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(str3) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = mu90.j;
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30Var, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str2, mrv.k0(jm40Var, "START_SCORE_ID"), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar2), fetVar, ((i2 >> 6) & 14) | 48, 24960, 109564);
            aad.e(str, mrv.k0(jm40Var, "TITLE_ID"), ibm0.n(g1t0.m(), fetVar), null, 2, false, 1, 0, null, new n05(qmk.q, g1t0.m().f42262a.b, qmk.n), fetVar, ((i2 >> 3) & 14) | 1597488, 424);
            v8q0.a(str3, mrv.k0(jm40Var, "END_SCORE_ID"), 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, ((i2 >> 9) & 14) | 48, 24960, 109564);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cm5(mm40Var2, str, str2, str3, i, (byte) 6);
        }
    }

    public static final void g(String str, fet fetVar, int i) {
        str.getClass();
        fetVar.g0(1643246142);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            float f = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, o2e.e0(s5x0.N(jm40.b, f, 8.0f, 0.0f, 8.0f, 4), "TRANSACTION_DATA_ITEM"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, i2 & 14, 0, 131068);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5n0((byte) 8, i, str);
        }
    }

    public static final void h(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1879509836);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float fH0 = lgb.h0(fetVar);
            zcl zclVar = qmk.f28987a;
            float f = 236.0f + fH0;
            float f2 = 56.0f + fH0;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = jgk0.b(new ybt0(l7m0Var, b));
                fetVar.o0(objP);
            }
            m0x0.d(o2e.e0(jm40.b, "UNIVERSAL_CHAMP_MAIN_SCREEN_ROOT"), f, ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), false, 12.0f, null, 0L, 0.0f, null, null, u1c.M(-1092649665, new lkb(l7m0Var, f, f2, function1, (byte) 5), fetVar), u1c.M(-938291975, new rpk(ddz.a(0, 0, fetVar, 0, 3), qdzVar, function1, function2, (l7m0) objP, l7m0Var, (byte) 2), fetVar), fetVar, 24582, 432, 1984);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var, qdzVar, function1, function2, i, (byte) 11);
        }
    }

    public static final void i(mm40 mm40Var, gru0 gru0Var, xcz xczVar, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        gru0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1426371264);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(gru0Var) : fetVar.i(gru0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            pz40 pz40VarF = androidx.compose.runtime.e.f(gru0Var.b, fetVar);
            imm immVar = gru0Var.c;
            boolean z = (i2 & 7168) == 2048;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new xks0(function0, (byte) 6);
                fetVar.o0(objP2);
            }
            Function0 function3 = (Function0) objP2;
            boolean z2 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(gru0Var))) | ((458752 & i2) == 131072);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new xis0((byte) 22, (Object) gru0Var, function2);
                fetVar.o0(objP3);
            }
            Function1 function4 = (Function1) objP3;
            boolean zI = ((i2 & 896) == 256) | fetVar.i(vneVar) | fetVar.g(pz40VarF) | ((57344 & i2) == 16384);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj) {
                objP4 = new en(vneVar, function1, pz40VarF, xczVar, (byte) 2);
                fetVar.o0(objP4);
            }
            hlm.c(mm40Var, immVar, null, function3, null, function4, (Function1) objP4, null, null, null, null, null, fetVar, i2 & 14, 0, 3988);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fer0(mm40Var, (Object) gru0Var, xczVar, function0, function1, function2, i, (byte) 6);
        }
    }

    public static final void j(lc00 lc00Var, long j, float f, String str) {
        if (f <= 0.0f) {
            return;
        }
        String strValueOf = String.valueOf(f);
        if (ttm0.M(2, strValueOf).equals(".0")) {
            strValueOf = kotlin.text.c.r(strValueOf, ".0", "", false);
        }
        lc00Var.add(new a4m(j, new d4m(str, strValueOf)));
    }

    public static final void k(lc00 lc00Var, long j, int i, String str) {
        if (i <= 0) {
            return;
        }
        lc00Var.add(new a4m(j, new d4m(str, String.valueOf(i))));
    }

    public static final void l(lc00 lc00Var, String str, String str2, ctf0 ctf0Var) {
        e4m d4mVar;
        if (str2.length() > 0 && str.length() > 0) {
            d4mVar = new c4m(new n0x(str2), str, z3m.f43726a);
        } else if (str.length() <= 0) {
            return;
        } else {
            d4mVar = new d4m(ctf0Var.b.a(org.xbet.client1.R.string.reg_nationality_x, Arrays.copyOf(new Object[0], 0)), str);
        }
        lc00Var.add(new a4m(1L, d4mVar));
    }

    public static void m() {
        z1x.y("Not in application's main thread", v());
    }

    public static String n(String str, String str2) {
        str.getClass();
        str2.getClass();
        int i = cy7.f5159a;
        try {
            double d = Double.parseDouble(str);
            int iV = StringsKt.V(str, Separators.DOT, 0, false, 6);
            int length = iV != -1 ? (str.length() - iV) - 1 : 0;
            pn40 pn40Var = pn40.f27267a;
            str = pn40.b(d, length, true);
        } catch (NumberFormatException unused) {
        }
        return cy7.e(str + Separators.SP + str2);
    }

    public static final LinkedHashMap o(int i, String str, String str2) {
        str.getClass();
        return xp20.h(new Pair(ParameterNames.ID, str), new Pair("ref", 1), new Pair("fcountry", Integer.valueOf(i)), new Pair("lng", str2));
    }

    public static final gbn p(Function1 function1) {
        return new gbn(new acm0((byte) 8), new asj0(3, (byte) 13), new zbm0(function1, (byte) 11), wjj0.u);
    }

    public static final boolean q(qrh qrhVar) {
        qrhVar.getClass();
        vrh vrhVar = qrhVar.f29209a;
        vrh vrhVar2 = qrhVar.b;
        List list = vrhVar.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.d((rrh) obj, new rrh("", "", "", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ""))) {
                arrayList.add(obj);
            }
        }
        List list2 = vrhVar2.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!Intrinsics.d((rrh) obj2, new rrh("", "", "", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ""))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList.isEmpty() || arrayList2.isEmpty() || CollectionsKt.q0(arrayList, arrayList2).size() != 10 || vrhVar.f37897a.length() == 0 || vrhVar2.f37897a.length() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    public static final boolean r(d0u0 d0u0Var, m9s m9sVar) {
        boolean z;
        List list;
        i1u0 i1u0Var = d0u0Var.f5283a;
        List list2 = i1u0Var.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            xxt0 xxt0Var = (xxt0) obj;
            if (xxt0Var.c != -1 && xxt0Var.d != -1 && xxt0Var.f41675a.length() == 0) {
                arrayList.add(obj);
            }
        }
        if (i1u0Var.b.length() != 0) {
            if (m9sVar == null || (list = m9sVar.h.c) == null) {
                list = iun.f15405a;
            }
            if (list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return arrayList.isEmpty() && z;
    }

    public static final boolean s(qrh qrhVar) {
        qrhVar.getClass();
        return qrhVar.f29209a.d.isEmpty() || qrhVar.b.d.isEmpty();
    }

    public static final boolean t(d0u0 d0u0Var) {
        g2u0 g2u0Var = d0u0Var.b;
        Map map = d0u0Var.c.b;
        if (!g2u0Var.b.isEmpty() && !map.isEmpty()) {
            Map map2 = g2u0Var.b;
            List listL0 = CollectionsKt.L0(map.values());
            boolean z = false;
            int i = 0;
            for (Object obj : map2.values()) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                int iIntValue = ((Number) obj).intValue();
                Integer num = (Integer) CollectionsKt.W(i, listL0);
                if (num != null && num.intValue() == iIntValue) {
                    z = true;
                }
                i = i2;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static final boolean u(d0u0 d0u0Var) {
        boolean z;
        boolean z2;
        g2u0 g2u0Var = d0u0Var.b;
        List list = d0u0Var.c.d;
        List list2 = g2u0Var.d;
        if (list2 != null && list2.isEmpty()) {
            z = true;
            break;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            byt0 byt0Var = (byt0) it.next();
            if (byt0Var.c.length() <= 0 && byt0Var.i.length() <= 0 && byt0Var.e == -1 && byt0Var.g == -1 && byt0Var.f == -1 && byt0Var.k == -1 && byt0Var.j == -1 && byt0Var.l == -1 && byt0Var.m == -1) {
                z = false;
                break;
            }
        }
        if (list != null && list.isEmpty()) {
            z2 = true;
            break;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = true;
                break;
            }
            byt0 byt0Var2 = (byt0) it2.next();
            if (byt0Var2.c.length() <= 0 && byt0Var2.i.length() <= 0 && byt0Var2.e == -1 && byt0Var2.g == -1 && byt0Var2.f == -1 && byt0Var2.k == -1 && byt0Var2.j == -1 && byt0Var2.l == -1 && byt0Var2.m == -1) {
                z2 = false;
                break;
            }
        }
        return (list.size() + g2u0Var.d.size() == 10 && (z || z2)) ? false : true;
    }

    public static boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void w(Runnable runnable) {
        if (v()) {
            runnable.run();
        } else {
            z1x.y("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static void x(Window window, int i, Context context, int i2) {
        int iA;
        ycm0 ziv0Var;
        if ((i2 & 2) != 0) {
            context = window.getContext();
            context.getClass();
        }
        boolean zR = qem0.r(window.getContext());
        window.getClass();
        if (iym0.v(window)) {
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        if (i3 >= 26 || !zR) {
            TypedValue typedValue = j5d.f15927a;
            iA = j5d.a(context, i, false);
        } else {
            TypedValue typedValue2 = j5d.f15927a;
            iA = j5d.a(context, R.attr.navigationBarColor, false);
        }
        window.setNavigationBarColor(iA);
        ani0 ani0Var = new ani0(window.getDecorView());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            ziv0Var = new bjv0(window, ani0Var);
        } else if (i4 >= 30) {
            ziv0Var = new ajv0(window, ani0Var);
        } else {
            ziv0Var = i4 >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        }
        ziv0Var.v(!zR);
    }

    public static final void y(Window window, Context context, int i, int i2, boolean z, boolean z2) {
        window.getClass();
        context.getClass();
        if (iym0.v(window)) {
            return;
        }
        TypedValue typedValue = j5d.f15927a;
        A(window, context, j5d.a(context, i, true), j5d.a(context, i2, true), z, z2);
    }

    public static void z(Window window, Context context, int i, int i2, int i3) {
        ycm0 ziv0Var;
        ycm0 ziv0Var2;
        if ((i3 & 1) != 0) {
            context = window.getContext();
            context.getClass();
        }
        boolean zR = (i3 & 8) != 0 ? qem0.r(window.getContext()) : true;
        window.getClass();
        if (iym0.v(window)) {
            return;
        }
        boolean z = (i == i2 || zR) ? false : true;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        TypedValue typedValue = j5d.f15927a;
        window.setStatusBarColor(j5d.a(context, i, false));
        window.setNavigationBarColor((i4 >= 26 || !z) ? j5d.a(context, i, false) : j5d.a(context, i2, false));
        ani0 ani0Var = new ani0(window.getDecorView());
        if (i4 >= 35) {
            ziv0Var = new bjv0(window, ani0Var);
        } else if (i4 >= 30) {
            ziv0Var = new ajv0(window, ani0Var);
        } else {
            ziv0Var = i4 >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        }
        ziv0Var.w(z);
        ani0 ani0Var2 = new ani0(window.getDecorView());
        if (i4 >= 35) {
            ziv0Var2 = new bjv0(window, ani0Var2);
        } else if (i4 >= 30) {
            ziv0Var2 = new ajv0(window, ani0Var2);
        } else {
            ziv0Var2 = i4 >= 26 ? new ziv0(window, ani0Var2) : new yiv0(window, ani0Var2);
        }
        ziv0Var2.v(z);
    }
}
