package a;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dnm0 {
    public static final void a(cxr0 cxr0Var, String str, float f, Function2 function2, fet fetVar, int i) {
        int i2;
        fetVar.g0(1145573069);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(cxr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (cxr0Var instanceof bxr0) {
            fetVar.e0(-42580150);
            b(((bxr0) cxr0Var).f3388a, str, f, function2, fetVar, i2 & 8176);
            fetVar.r(false);
        } else {
            if (!(cxr0Var instanceof axr0)) {
                throw b1j.f(1384097420, fetVar, false);
            }
            fetVar.e0(-42415757);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zm2((Object) cxr0Var, (Object) str, f, (Object) function2, i, (byte) 7);
        }
    }

    public static final void b(dxr0 dxr0Var, String str, float f, Function2 function2, fet fetVar, int i) {
        int i2;
        long jC;
        fet fetVar2 = fetVar;
        fetVar2.g0(1259402700);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar2.g(dxr0Var) : fetVar2.i(dxr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 28.0f);
            int iOrdinal = dxr0Var.b.ordinal();
            if (iOrdinal == 0) {
                jC = ijg.M;
            } else if (iOrdinal == 1) {
                jC = y3d.c(f, ijg.M);
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return;
                }
                jC = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
            }
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarE, jC, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 4.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar2.i(dxr0Var)));
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new ck60(function2, str, dxr0Var, (byte) 26);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarK, gy40Var, null, false, null, (Function0) objP2, 28), "BRACKET_MATCH_TEAM_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            lgb.v(o7k0.n(jm40Var, 20.0f), o7k0.n(jm40Var, 20.0f), dxr0Var.f, R.drawable.icon_globe_new, StaticColors.INSTANCE.m130getWhite600d7_KjU(), gqw0.f1, fetVar2, 196608, 0);
            v8q0.a(dxr0Var.c, s5x0.L(new x7z(1.0f, true), 4.0f, 0.0f, 2), dxr0Var.e, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
            v8q0.a(dxr0Var.d, o7k0.u(jm40Var, 0.0f, 16.0f, 1), dxr0Var.e, null, 0L, null, null, null, 0L, null, 0L, 1, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zm2((Object) dxr0Var, (Object) str, f, (Object) function2, i, (byte) 8);
        }
    }

    public static final void c(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        a4xVar.getClass();
        fetVar.g0(-2041163348);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 140.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1411475621, a4xVar);
            while (itO.hasNext()) {
                qem0.d(null, (bmp0) itO.next(), fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 21);
        }
    }

    public static final void d(mm40 mm40Var, d9r0 d9r0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        d9r0Var.getClass();
        fetVar2.g0(-1319549920);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(d9r0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = d9r0Var.f5716a;
            y9q0 y9q0VarG = g1t0.g();
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarG, fetVar, 0, 24576, 113658);
            v8q0.a(d9r0Var.b, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.l(), fetVar, 0, 24576, 113658);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) mm40Var, (Object) d9r0Var, i, (byte) 19);
        }
    }

    public static final void e(mm40 mm40Var, exr0 exr0Var, float f, Function2 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        exr0Var.getClass();
        String str = exr0Var.f8593a;
        function2.getClass();
        fetVar2.g0(1448399467);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(exr0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.d(o7k0.e(mm40Var, 78.0f), 1.0f), vgg0.a(12.0f));
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM71getBlack300d7_KjU = staticColors.m71getBlack300d7_KjU();
            ljc ljcVar = jd8.n;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarJ, jM71getBlack300d7_KjU, ljcVar), "BRACKET_MATCH_CARD");
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            qim0.f(exr0Var.b, fetVar2, 0);
            mm40 mm40VarQ = i120.Q(lgb.J(o7k0.e(o7k0.d(jm40.b, 1.0f), 56.0f), vgg0.a(12.0f)), staticColors.m70getBlack200d7_KjU(), ljcVar);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int i3 = i2 & 8064;
            a(exr0Var.c, str, f, function2, fetVar2, i3);
            fetVar2 = fetVar;
            a(exr0Var.d, str, f, function2, fetVar2, i3);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zm2((Object) mm40Var, (Object) exr0Var, f, (Object) function2, i, (byte) 6);
        }
    }

    public static final void f(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i) {
        str.getClass();
        function0.getClass();
        fetVar.g0(-1162195297);
        int i2 = i | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(str, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                cym0 cym0Var = new cym0(0, function0, Function0.class, "invoke", "invoke()Ljava/lang/Object;", 0, (byte) 28);
                fetVar.o0(cym0Var);
                objP = cym0Var;
            }
            hlm.c(mm40VarD, immVar, null, (Function0) ((jhy) objP), null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f49(mm40Var, str, function0, i, (byte) 9);
        }
    }

    public static final void g(l4m0 l4m0Var, fet fetVar, int i) {
        l4m0Var.getClass();
        fetVar.g0(-2076912409);
        int i2 = i | (fetVar.g(l4m0Var) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            long j = l4m0Var.b;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            v8q0.a(l4m0Var.f19414a, o2e.e0(s5x0.L(s5x0.N(o7k0.e(o7k0.s(i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), l4m0Var.d), 36.0f), l4m0Var.f, 0.0f, 0.0f, 0.0f, 14), 0.0f, l4m0Var.g, 1), "VALUE_CELL_TEXT"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, l4m0Var.c, null, null, null, 0L, new f2q0(l4m0Var.e), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 109544);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ggt0(l4m0Var, i, (byte) 4);
        }
    }

    public static final ArrayList h(e9p0 e9p0Var) {
        List list;
        List list2 = null;
        if (e9p0Var != null) {
            Object obj = e9p0Var.f7433a;
            e0g0 e0g0Var = j0g0.b;
            if (obj instanceof g0g0) {
                obj = null;
            }
            list = (List) obj;
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        if (e9p0Var != null) {
            Object obj2 = e9p0Var.b;
            e0g0 e0g0Var2 = j0g0.b;
            list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return CollectionsKt.q0(list, list2);
    }

    public static final void i(cp cpVar, String str) {
        int length = str.length();
        yfu0 yfu0Var = cpVar.u;
        if (length == 0) {
            ((ktn0) yfu0Var).i.setVisibility(8);
        } else {
            ((ktn0) yfu0Var).i.setText(str);
            ((ktn0) yfu0Var).i.setVisibility(0);
        }
    }

    public static final void j(cp cpVar, qtn0 qtn0Var) {
        DsTimer dsTimer = ((ktn0) cpVar.u).s;
        dsTimer.setTimerType(qtn0Var.d);
        dsTimer.setVisibility(qtn0Var.c ? 0 : 8);
        dsTimer.setTime(qtn0Var.f29306a);
        dsTimer.setTimeDirection(qtn0Var.b);
        if (qtn0Var.e) {
            dsTimer.d();
        }
    }

    public static final String k(String str) {
        return ((StringBuilder) rz4.d("sfiles", "logo_teams", str).b).toString();
    }

    public static final String l(ctf0 ctf0Var, sba0 sba0Var, huo0 huo0Var, suo0 suo0Var) {
        ctf0Var.getClass();
        sba0 sba0Var2 = sba0.GAMING;
        if (sba0Var == sba0Var2 && (huo0Var instanceof wdt) && (suo0Var instanceof puo0)) {
            wdt wdtVar = (wdt) huo0Var;
            wqd wqdVar = wdtVar.f38989a;
            String str = wdtVar.b.b;
            pn40 pn40Var = pn40.f27267a;
            puo0 puo0Var = (puo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_description_sum, Arrays.copyOf(new Object[]{str, "\u200e".concat(pn40.i(wqdVar.e, 2)), wqdVar.b, "\u200e".concat(pn40.i(puo0Var.f27627a, 0)), puo0Var.b.b, puo0Var.c.b}, 6));
        }
        if (sba0Var == sba0Var2 && (huo0Var instanceof ydt) && (suo0Var instanceof puo0)) {
            ydt ydtVar = (ydt) huo0Var;
            pn40 pn40Var2 = pn40.f27267a;
            puo0 puo0Var2 = (puo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_description_bets, Arrays.copyOf(new Object[]{pn40.i(ydtVar.f42456a.e, 0), ydtVar.b.b, "\u200e".concat(pn40.i(puo0Var2.f27627a, 0)), puo0Var2.b.b, puo0Var2.c.b}, 5));
        }
        if (sba0Var == sba0Var2 && (huo0Var instanceof xdt) && (suo0Var instanceof puo0)) {
            xdt xdtVar = (xdt) huo0Var;
            wqd wqdVar2 = xdtVar.f40712a;
            String str2 = xdtVar.b.b;
            pn40 pn40Var3 = pn40.f27267a;
            puo0 puo0Var3 = (puo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_description_2, Arrays.copyOf(new Object[]{str2, "\u200e".concat(pn40.i(wqdVar2.e, 2)), wqdVar2.b, "\u200e".concat(pn40.i(puo0Var3.f27627a, 0)), puo0Var3.b.b, puo0Var3.c.b}, 6));
        }
        if (sba0Var != sba0Var2 || !(huo0Var instanceof zdt) || !(suo0Var instanceof puo0)) {
            return "";
        }
        zdt zdtVar = (zdt) huo0Var;
        pn40 pn40Var4 = pn40.f27267a;
        puo0 puo0Var4 = (puo0) suo0Var;
        return ctf0Var.b.a(R.string.daily_task_description_4, Arrays.copyOf(new Object[]{pn40.i(zdtVar.f44224a.e, 0), zdtVar.b.b, "\u200e".concat(pn40.i(puo0Var4.f27627a, 0)), puo0Var4.b.b, puo0Var4.c.b}, 5));
    }

    public static final wmv0 m(k6d k6dVar, long j, ctf0 ctf0Var) {
        int iD = ctf0Var.d(R.dimen.space_8);
        lsm0 lsm0Var = ctf0Var.b;
        int iOrdinal = k6dVar.ordinal();
        int i = R.string.winter_game_title_11;
        switch (iOrdinal) {
            case 0:
                return new wmv0(lsm0Var.a(R.string.winter_game_title_3, Arrays.copyOf(new Object[0], 0)), iD, k6dVar);
            case 1:
                if (j != 22) {
                    i = R.string.winter_game_title_4;
                }
                return new wmv0(lsm0Var.a(i, Arrays.copyOf(new Object[0], 0)), iD, k6dVar);
            case 2:
                return new wmv0(lsm0Var.a(R.string.winter_game_title_5, Arrays.copyOf(new Object[0], 0)), iD, k6dVar);
            case 3:
                return new wmv0(lsm0Var.a(R.string.winter_game_title_11, Arrays.copyOf(new Object[0], 0)), iD, k6dVar);
            case 4:
                return new wmv0(lsm0Var.a(R.string.winter_game_title_8, Arrays.copyOf(new Object[0], 0)), iD, k6dVar);
            case 5:
                return new wmv0(lsm0Var.a(R.string.winter_game_title_9, Arrays.copyOf(new Object[0], 0)), iD, k6dVar);
            case 6:
                return new wmv0(lsm0Var.a(R.string.winter_game_title_10, Arrays.copyOf(new Object[0], 0)), iD, k6dVar);
            case 7:
                return new wmv0(lsm0Var.a(R.string.winter_game_title_6, Arrays.copyOf(new Object[0], 0)), iD, k6dVar);
            case 8:
                return new wmv0(lsm0Var.a(R.string.winter_game_title_7, Arrays.copyOf(new Object[0], 0)), iD, k6dVar);
            default:
                t9f.b();
                return null;
        }
    }

    public static final int n(s470 s470Var) {
        s470Var.getClass();
        int iOrdinal = s470Var.ordinal();
        if (iOrdinal == 15) {
            return 8;
        }
        if (iOrdinal == 16) {
            return 6;
        }
        throw new EnumConstantNotPresentException(s470.class, s470Var.name());
    }

    public static int o(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static ikt0 p(fq80 fq80Var, boolean z, boolean z2) throws kq80 {
        if (z) {
            s(3, fq80Var, false);
        }
        fq80Var.x((int) fq80Var.q(), StandardCharsets.UTF_8);
        long jQ = fq80Var.q();
        String[] strArr = new String[(int) jQ];
        for (int i = 0; i < jQ; i++) {
            strArr[i] = fq80Var.x((int) fq80Var.q(), StandardCharsets.UTF_8);
        }
        if (z2 && (fq80Var.z() & 1) == 0) {
            throw kq80.a("framing bit expected to be set", null);
        }
        return new ikt0(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    public static final ufp0 q(gip0 gip0Var) {
        String str;
        ?? arrayList;
        gip0Var.getClass();
        String str2 = gip0Var.f11360a;
        String str3 = "";
        String str4 = str2 == null ? "" : str2;
        String str5 = gip0Var.b;
        String str6 = str5 == null ? "" : str5;
        Integer num = gip0Var.c;
        int iIntValue = num != null ? num.intValue() : 0;
        String str7 = gip0Var.d;
        if (str7 == null) {
            str7 = "";
        }
        if (kotlin.text.c.x(str7, ujn.h, false)) {
            str = str7;
        } else {
            if (str7.length() != 0) {
                List list = u0d.f34849a;
                if (!u0d.c(str7)) {
                    str3 = String.format(Locale.ENGLISH, StringsKt.O(str7, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str7}, 2));
                }
            }
            str = str3;
        }
        List list2 = gip0Var.e;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(a4n0.m((o4n0) it.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new ufp0(iIntValue, str4, str6, str, arrayList);
    }

    public static final uft0 r(xft0 xft0Var, ArrayList arrayList) {
        Object obj;
        Object objPrevious;
        xft0Var.getClass();
        String str = xft0Var.f40809a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Long l = xft0Var.b;
        long jLongValue = l != null ? l.longValue() : 0L;
        pek pekVar = lho.b;
        Integer num = xft0Var.c;
        int iIntValue = num != null ? num.intValue() : 0;
        pekVar.getClass();
        lho lhoVarG = pek.g(iIntValue);
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!Intrinsics.d(((ufp0) objPrevious).f35586a, xft0Var.e));
        ufp0 ufp0Var = (ufp0) objPrevious;
        ufp0 ufp0Var2 = ufp0Var == null ? new ufp0(0, "", "", "", iun.f15405a) : ufp0Var;
        ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
        while (listIterator2.hasPrevious()) {
            Object objPrevious2 = listIterator2.previous();
            if (Intrinsics.d(((ufp0) objPrevious2).f35586a, xft0Var.f)) {
                obj = objPrevious2;
                break;
            }
        }
        ufp0 ufp0Var3 = (ufp0) obj;
        ufp0 ufp0Var4 = ufp0Var3 == null ? new ufp0(0, "", "", "", iun.f15405a) : ufp0Var3;
        Long l2 = xft0Var.d;
        return new uft0(str2, jLongValue, lhoVarG, ufp0Var2, ufp0Var4, new znq0(l2 != null ? l2.longValue() : 0L));
    }

    public static boolean s(int i, fq80 fq80Var, boolean z) {
        if (fq80Var.a() < 7) {
            if (z) {
                return false;
            }
            throw kq80.a("too short header: " + fq80Var.a(), null);
        }
        if (fq80Var.z() != i) {
            if (z) {
                return false;
            }
            throw kq80.a("expected header type " + Integer.toHexString(i), null);
        }
        if (fq80Var.z() == 118 && fq80Var.z() == 111 && fq80Var.z() == 114 && fq80Var.z() == 98 && fq80Var.z() == 105 && fq80Var.z() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw kq80.a("expected characters 'vorbis'", null);
    }

    public static void t(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                hny.u(b1j.h(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
                return;
            }
        }
    }
}
