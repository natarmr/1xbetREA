package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o5n0 {
    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1172428234);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(o7k0.s(o7k0.e(lgb.J(mm40Var, vgg0.a(6.0f)), 12.0f), 64.0f), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 20);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1988476164);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(o7k0.s(o7k0.e(lgb.J(s5x0.L(mm40Var, 0.0f, 4.0f, 1), vgg0.a(12.0f)), 32.0f), 128.0f), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 19);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        str.getClass();
        fetVar.g0(1198560935);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 5, 0, null, ibm0.t(g1t0.g(), fetVar), fetVar, (i2 << 3) & 112, 24960, 110588);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var, str2, i, (byte) 25);
        }
    }

    public static final void d(mm40 mm40Var, ugd ugdVar, xdr xdrVar, xdr xdrVar2, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        ugd ugdVar4;
        ugd ugdVar5;
        xdr xdrVar3;
        cl5 cl5Var;
        float f;
        float f2;
        pz40 pz40Var;
        float f3;
        float f4;
        Object obj;
        boolean z;
        fetVar.g0(-888581038);
        int i2 = i | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(xdrVar2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            boolean z2 = fetVar.k(bmd.n) == k6z.b;
            long separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(2.0f, fetVar);
            }
            float f5 = ((ycl) objP).f42389a;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var2) {
                zcl zclVar2 = qmk.f28987a;
                objP2 = twn.j(8.0f, fetVar);
            }
            float f6 = ((ycl) objP2).f42389a;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var2) {
                zcl zclVar3 = qmk.f28987a;
                objP3 = twn.j(12.0f, fetVar);
            }
            float f7 = ((ycl) objP3).f42389a;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var2) {
                zcl zclVar4 = qmk.f28987a;
                objP4 = twn.j(32.0f, fetVar);
            }
            float f8 = ((ycl) objP4).f42389a;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var2) {
                objP5 = gqw0.n;
                fetVar.o0(objP5);
            }
            xx7 xx7Var = (xx7) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var2) {
                objP6 = new qw3(f6, true, new jf4((byte) 14));
                fetVar.o0(objP6);
            }
            pw3 pw3Var = (pw3) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var2) {
                objP7 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP7);
            }
            pz40 pz40Var2 = (pz40) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var2) {
                zcl zclVar5 = qmk.f28987a;
                objP8 = androidx.compose.runtime.e.e(new ycl(96.0f));
                fetVar.o0(objP8);
            }
            pz40 pz40Var3 = (pz40) objP8;
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var2) {
                pz40Var = pz40Var3;
                f2 = f8;
                f = f7;
                cl5Var = cl5Var2;
                ytl0 ytl0Var = new ytl0(xdrVar, xdrVar2, pz40Var2, f2, z2, pz40Var, f6, separator60, (byte) 1);
                pz40Var2 = pz40Var2;
                objP9 = jgk0.b(ytl0Var);
                fetVar.o0(objP9);
            } else {
                cl5Var = cl5Var2;
                f = f7;
                f2 = f8;
                pz40Var = pz40Var3;
            }
            l7m0 l7m0Var = (l7m0) objP9;
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var) {
                objP10 = new wtl0(f, pz40Var2, pz40Var, (byte) 5);
                fetVar.o0(objP10);
            }
            tj30 tj30Var = (tj30) objP10;
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
            jpm0.o(fetVar, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = mrv.k0(jm40Var, "INNING_CONTENT_ID");
            zcl zclVar6 = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarK0, 26.0f);
            x5d x5dVarA = w5d.a(pw3Var, xx7Var, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            Object obj2 = y5d.f42040a;
            ugdVar.F(obj2, fetVar, 54);
            fetVar.r(true);
            if (xdrVar2 == null) {
                fetVar.e0(1967185914);
                z = false;
                fetVar.r(false);
                f4 = f2;
                f3 = f5;
                obj = 6;
            } else {
                fetVar.e0(1967185915);
                f3 = f5;
                mm40 mm40VarS2 = o7k0.s(s5x0.L(mrv.k0(jm40Var, "POINTS_CONTENT_ID"), f3, 0.0f, 2), f2);
                x5d x5dVarA2 = w5d.a(pw3Var, xx7Var, fetVar, 54);
                float f9 = f2;
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarS2);
                fetVar.i0();
                f4 = f9;
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                obj = r14;
                xdrVar2.F(obj2, fetVar, obj);
                fetVar.r(true);
                z = false;
                fetVar.r(false);
            }
            if (xdrVar == null) {
                fetVar.e0(1967668956);
                fetVar.r(z);
                xdrVar3 = xdrVar;
            } else {
                fetVar.e0(1967668957);
                mm40 mm40VarS3 = o7k0.s(s5x0.L(mrv.k0(jm40Var, "GAME_CONTENT_ID"), f3, 0.0f, 2), f4);
                x5d x5dVarA3 = w5d.a(pw3Var, xx7Var, fetVar, 54);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarS3);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA3, shdVar);
                jpm0.o(fetVar, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC3, shdVar4);
                xdrVar3 = xdrVar;
                xdrVar3.F(obj2, fetVar, obj);
                fetVar.r(true);
                fetVar.r(false);
            }
            ugdVar4 = ugdVar2;
            ugdVar4.F(s5x0.N(mrv.k0(jm40Var, "PERIOD_CONTENT_ID"), 0.0f, 0.0f, 8.0f, 0.0f, 11), fetVar, 48);
            mm40 mm40Var2 = (mm40) l7m0Var.getValue();
            x5d x5dVarA4 = w5d.a(pw3Var, xx7Var, fetVar, 54);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40Var2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA4, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            ugdVar5 = ugdVar3;
            ugdVar5.F(obj2, fetVar, 54);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            ugdVar4 = ugdVar2;
            ugdVar5 = ugdVar3;
            xdrVar3 = xdrVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nq00(mm40Var, ugdVar, xdrVar3, xdrVar2, ugdVar4, ugdVar5, i, (byte) 5);
        }
    }

    public static final void e(k4m0 k4m0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        k4m0Var.getClass();
        fetVar2.g0(723761867);
        int i2 = i | (fetVar2.g(k4m0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 36.0f), k4m0Var.d);
            long j = kkg.E;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarS, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarE0 = o2e.e0(o7k0.n(s5x0.N(jm40Var, k4m0Var.c, 0.0f, 0.0f, 0.0f, 14), 24.0f), "TEAM_CELL_IMAGE");
            String str = k4m0Var.b;
            mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var, k4m0Var.c, 0.0f, 0.0f, 0.0f, 14), "TEAM_CELL_IMAGE");
            StaticColors staticColors = StaticColors.INSTANCE;
            lgb.v(mm40VarE0, mm40VarE1, str, R.drawable.ic_glyph_circle_globe, staticColors.m130getWhite600d7_KjU(), gqw0.f1, fetVar2, 196608, 0);
            mm40 mm40VarE2 = o2e.e0(s5x0.L(jm40Var, 8.0f, 0.0f, 2), "TEAM_CELL_TEXT");
            String str2 = k4m0Var.f17677a;
            long j2 = qmk.q;
            v8q0.a(str2, mm40VarE2, staticColors.m123getWhite0d7_KjU(), null, j2, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j2, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 110568);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(k4m0Var, i, (byte) 28);
        }
    }

    public static final void f(skp0 skp0Var, Function1 function1, fet fetVar, int i) {
        skp0 skp0Var2;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(2063517042);
        byte b = 2;
        int i2 = i | (fetVar2.g(skp0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(i120.Q(o7k0.e(mm40VarD, 36.0f), skp0Var.g, jd8.n), xfn.a(fetVar2).d, 0.0f, 2);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new yip0(function1, skp0Var, b);
                fetVar2.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarL, false, null, null, (Function0) objP, 15);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarY);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(0.05f, jm40Var, true);
            String str = skp0Var.b;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarA, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            mm40 mm40VarA2 = zhg0Var.a(0.59f, jm40Var, true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarA2);
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
            v8q0.a(skp0Var.c, s5x0.L(o7k0.s(jm40Var, 128.0f), 8.0f, 0.0f, 2), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
            v8q0.a(skp0Var.d, zhg0Var.a(1.0f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar.r(true);
            v8q0.a(skp0Var.e, zhg0Var.a(0.18f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            skp0Var2 = skp0Var;
            v8q0.a(skp0Var2.f, zhg0Var.a(0.18f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            skp0Var2 = skp0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) skp0Var2, (Object) function1, i, (byte) 4);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-14989828);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            wkw wkwVar = new wkw(xx7Var);
            zcl zclVar = qmk.f28987a;
            a(0, fetVar, s5x0.L(s5x0.N(wkwVar, 0.0f, 18.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).e, 0.0f, 2));
            b(0, fetVar, s5x0.L(s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13).e(new wkw(xx7Var)), xfn.a(fetVar).e, 0.0f, 2));
            j(0, fetVar, o7k0.d(s5x0.L(s5x0.N(s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0.0f, 0.0f, 0.0f, 12.0f, 7), xfn.a(fetVar).d, 0.0f, 2), 1.0f));
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var2, i, (byte) 17);
        }
    }

    public static final void h(String str, fet fetVar, int i) {
        fetVar.g0(-836301777);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, o2e.e0(s5x0.L(jm40.b, 8.0f, 0.0f, 2), "TournamentTitleTestTag"), StaticColors.INSTANCE.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, i2 & 14, 24960, 110584);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5n0((byte) 7, i, str);
        }
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1528926416);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(o7k0.e(lgb.J(mm40Var, vgg0.a(16.0f)), 48.0f), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 21);
        }
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1467302008);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            i(0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, o7k0.s(jm40.b, 8.0f));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            i(0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 18);
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        l7m0 l7m0Var2;
        mm40 mm40Var2;
        gmm dmmVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(681438389);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = m8m0.f21378a;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU();
            boolean zE = fetVar.e(((t5t0) l7m0Var2.getValue()).f33386a.ordinal());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                ilm ilmVar = new ilm(jM123getWhite0d7_KjU);
                if (((t5t0) l7m0Var2.getValue()).f33386a == lui0.c) {
                    dmmVar = fmm.f9790a;
                } else {
                    dmmVar = new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_settings_inactive, ((t5t0) l7m0Var2.getValue()).f33386a == lui0.f20675a, ra50.f30118a, StaticColors.INSTANCE.m123getWhite0d7_KjU())));
                }
                imm immVar = new imm(ilmVar, mlm.f21997a, dmmVar, jM121getTransparent0d7_KjU, false, null);
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new nas0(function1, (byte) 19);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z2 = i3 == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new xar0(function1, (byte) 26);
                fetVar.o0(objP3);
            }
            jm40 jm40Var = jm40.b;
            hlm.c(jm40Var, immVar2, null, function0, null, (Function1) objP3, null, null, null, null, null, null, fetVar, i2 & 14, 0, 4052);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x74(mm40Var2, l7m0Var2, function1, i, (byte) 3);
        }
    }

    public static final void l(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-5607982);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(ugdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar, 6);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objValueOf = Integer.valueOf(((i2 << 3) & 112) | 6);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, objValueOf);
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, o7k0.s(jm40.b, 8.0f));
            h97.p((i2 & 112) | 6, ugdVar2, zhg0Var, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf4(ugdVar, ugdVar2, mm40Var, i);
        }
    }

    public static final c6q0 m(String str, String str2, String str3, boolean z) {
        String str4;
        s7q0 s7q0Var;
        if (str3.length() > 0) {
            str4 = str3;
            s7q0Var = new s7q0(str4);
        } else {
            str4 = str3;
            s7q0Var = new s7q0("");
        }
        return new c6q0(str, e6q0.f7299a, g6q0.f10780a, s7q0Var, z, str4.length() > 0, null, str2, null, false, 0, null, 261504);
    }

    public static final String n(me1 me1Var) {
        int iOrdinal = me1Var.ordinal();
        if (iOrdinal == 0) {
            return "/static/img/android/casino/alt_design/aggregator_bonuses/img_bonuses_header.webp";
        }
        if (iOrdinal == 1) {
            return "/static/img/android/casino/alt_design/aggregator_bonuses/img_bonuses_picture_s.webp";
        }
        if (iOrdinal == 2) {
            return "/static/img/android/casino/alt_design/aggregator_bonuses/img_bonuses_card.webp";
        }
        if (iOrdinal == 3) {
            return "/static/img/android/casino/alt_design/aggregator_bonuses/img_bonuses_picture_l.webp";
        }
        if (iOrdinal == 4) {
            return "/static/img/android/casino/alt_design/aggregator_bonuses/img_bonuses_button.webp";
        }
        t9f.b();
        return null;
    }

    public static final String o(Long l) {
        if (l == null) {
            return "";
        }
        rdj rdjVar = rdj.f30294a;
        ynq0 ynq0Var = new ynq0(l.longValue());
        sdj sdjVar = sdj.UNIVERSAL;
        return rdj.b(ynq0Var);
    }

    public static final String p(okr0 okr0Var, ctf0 ctf0Var) {
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        String strG = rdj.g(new znq0(okr0Var.d), efj.UNIVERSAL, Boolean.valueOf(zH), false, 40);
        if (okr0Var.j.isEmpty()) {
            strG = null;
        }
        return strG == null ? "" : strG;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r1.equals("Win2") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r1.equals("Win1") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r1.equals("4") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        return a.ius0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        if (r1.equals("3") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return a.ius0.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        if (r1.equals("2") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0076, code lost:
    
        if (r1.equals("1") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:
    
        if (r1.equals("0") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
    
        if (r1.equals("PlayerMove") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        return a.ius0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0094, code lost:
    
        if (r1.equals("DealerMove") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0099, code lost:
    
        return a.ius0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a0, code lost:
    
        if (r1.equals("Prematch") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a7, code lost:
    
        return a.ius0.f15412a;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a.ius0 q(java.lang.String r1) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o5n0.q(java.lang.String):a.ius0");
    }

    public static final mlu0 r(View view) {
        mlu0 mlu0Var;
        Object tag = view.getTag(R.id.coil3_request_manager);
        mlu0 mlu0Var2 = tag instanceof mlu0 ? (mlu0) tag : null;
        if (mlu0Var2 != null) {
            return mlu0Var2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil3_request_manager);
                mlu0Var = tag2 instanceof mlu0 ? (mlu0) tag2 : null;
                if (mlu0Var == null) {
                    mlu0Var = new mlu0(view);
                    view.addOnAttachStateChangeListener(mlu0Var);
                    view.setTag(R.id.coil3_request_manager, mlu0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mlu0Var;
    }

    public static final String s(okr0 okr0Var, ctf0 ctf0Var) {
        List list = okr0Var.j;
        long j = okr0Var.c;
        if (list.isEmpty()) {
            int i = cy7.f5159a;
            return cy7.e(ctf0Var.b.a(R.string.toto_tiraj_is_coming_v2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)));
        }
        int i2 = cy7.f5159a;
        String strE = cy7.e(ctf0Var.b.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)));
        if (j <= 0) {
            strE = null;
        }
        return strE == null ? "-" : strE;
    }

    public static final String t(okr0 okr0Var, long j, ctf0 ctf0Var) {
        String strN;
        if (j <= 0) {
            strN = ctf0Var.b.a(R.string.bet_accept_is_over, Arrays.copyOf(new Object[0], 0));
        } else {
            long j2 = j / 1000;
            long j3 = j2 % 60;
            long j4 = j2 / 60;
            long j5 = j4 % 60;
            long j6 = j4 / 60;
            long j7 = j6 % 24;
            String strB0 = StringsKt.b0(2, String.valueOf(j6 / 24));
            String strB1 = StringsKt.b0(2, String.valueOf(j7));
            String strB2 = StringsKt.b0(2, String.valueOf(j5));
            String strB3 = StringsKt.b0(2, String.valueOf(j3));
            StringBuilder sb = new StringBuilder();
            sb.append(strB0);
            sb.append(Separators.COLON);
            sb.append(strB1);
            sb.append(Separators.COLON);
            sb.append(strB2);
            strN = axq.n(sb, Separators.COLON, strB3);
        }
        if (okr0Var.j.isEmpty()) {
            strN = null;
        }
        return strN == null ? "" : strN;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    public static final jus0 u(nus0 nus0Var) {
        hus0 hus0Var;
        ius0 ius0VarQ;
        ?? arrayList;
        ?? arrayList2;
        nus0Var.getClass();
        String str = nus0Var.f24160a;
        if (str == null) {
            str = "";
        }
        switch (str) {
            case "1":
                hus0Var = hus0.f13697a;
                break;
            case "2":
                hus0Var = hus0.c;
                break;
            case "3":
                hus0Var = hus0.b;
                break;
            default:
                hus0Var = hus0.d;
                break;
        }
        hus0 hus0Var2 = hus0Var;
        if (ous0.f25892a[hus0Var2.ordinal()] == 1) {
            String str2 = nus0Var.g;
            if (str2 == null) {
                str2 = "";
            }
            ius0VarQ = q(str2);
        } else {
            String str3 = nus0Var.f;
            if (str3 == null) {
                str3 = "";
            }
            ius0VarQ = q(str3);
        }
        ius0 ius0Var = ius0VarQ;
        String str4 = nus0Var.d;
        String str5 = str4 == null ? "" : str4;
        String str6 = nus0Var.e;
        String str7 = str6 == null ? "" : str6;
        List list = nus0Var.b;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x1x.Q((ooa) it.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        ?? r7 = arrayList;
        List list2 = nus0Var.c;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(x1x.Q((ooa) it2.next()));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        return new jus0(hus0Var2, ius0Var, str5, str7, r7, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0093 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object v(zje zjeVar) {
        Object obj;
        Object obj2;
        Object obj3;
        CoroutineContext context = zjeVar.getContext();
        zvw.O(context);
        yje yjeVarB = pnx.b(zjeVar);
        nvk nvkVar = yjeVarB instanceof nvk ? (nvk) yjeVarB : null;
        if (nvkVar != null) {
            lne lneVar = nvkVar.d;
            if (!ovk.c(lneVar, context)) {
                x2w0 x2w0Var = new x2w0(x2w0.c);
                CoroutineContext coroutineContextPlus = context.plus(x2w0Var);
                obj = Unit.f46060a;
                nvkVar.f = obj;
                nvkVar.c = 1;
                lneVar.r(coroutineContextPlus, nvkVar);
                if (x2w0Var.b) {
                    eeo eeoVarA = gcq0.a();
                    xw3 xw3Var = eeoVarA.e;
                    if (!(xw3Var != null ? xw3Var.isEmpty() : true)) {
                        if (eeoVarA.c >= 4294967296L) {
                            nvkVar.f = obj;
                            nvkVar.c = 1;
                            eeoVarA.y(nvkVar);
                            obj3 = wne.f39444a;
                        } else {
                            eeoVarA.F(true);
                            try {
                                nvkVar.run();
                                do {
                                } while (eeoVarA.I());
                            } catch (Throwable th) {
                                try {
                                    nvkVar.g(th);
                                } catch (Throwable th2) {
                                    eeoVarA.x(true);
                                    throw th2;
                                }
                            }
                            eeoVarA.x(true);
                        }
                    }
                    obj3 = Unit.f46060a;
                } else {
                    obj2 = obj;
                }
                if (obj3 == wne.f39444a) {
                    return obj3;
                }
                return obj;
            }
            Unit unit = Unit.f46060a;
            nvkVar.f = unit;
            nvkVar.c = 1;
            lneVar.r(context, nvkVar);
            obj2 = unit;
            obj = obj2;
            obj3 = wne.f39444a;
            if (obj3 == wne.f39444a) {
                return obj3;
            }
            return obj;
        }
        obj3 = Unit.f46060a;
        obj = obj3;
        if (obj3 == wne.f39444a) {
            return obj3;
        }
        return obj;
    }

    public static String w(Context context, String str) {
        s0x.H(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = iym0.x(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String x(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }
}
