package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleWinningFormula;

/* JADX INFO: loaded from: classes4.dex */
public abstract class feb {
    public static final void A(int i, fet fetVar, mm40 mm40Var, c280 c280Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-287069837);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(c280Var) ? 256 : 128) | (fetVar2.g(null) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 80.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            fetVar2.e0(240955758);
            boolean zG = fetVar2.g(c280Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG2 = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            fetVar2.r(false);
            fetVar2.e0(241400235);
            fetVar2.r(false);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 5, 0, null, g1t0.d(), fetVar2, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxm(mm40Var2, str, c280Var, i, (byte) 2);
        }
    }

    public static final void B(mm40 mm40Var, r3i r3iVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(986297763);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(r3iVar) ? 32 : 16);
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 54.0f);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), true);
            String str = r3iVar.f29790a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            zx7 zx7Var = gqw0.f;
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            kc5.N(str, mm40VarH, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, null, 0L, j, g1t0.m().f42262a.b, null, null, 0L, zx7Var, 2, false, 3, 0, false, null, y9q0VarM, 0.0f, fetVar, 0, 1600512, 0, 3055416);
            fetVar2 = fetVar;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new zsm(r3iVar, (byte) 0);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            boolean z3 = i3 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new zsm(r3iVar, b);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new atm(mm40Var, r3iVar, i, (byte) 0);
        }
    }

    public static final void C(mm40 mm40Var, r3i r3iVar, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(1564661385);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(r3iVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 54.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new zsm(r3iVar, (byte) 2);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            boolean z3 = i3 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new zsm(r3iVar, (byte) 3);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            fetVar2.r(true);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), true);
            String str = r3iVar.f29790a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            b = 1;
            kc5.N(str, mm40VarH, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, null, 0L, j, g1t0.m().f42262a.b, null, null, 0L, null, 2, false, 3, 0, false, null, y9q0VarM, 0.0f, fetVar, 0, 1597440, 0, 3063608);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new atm(mm40Var, r3iVar, i, b);
        }
    }

    public static final void D(n0x n0xVar, fet fetVar, int i) {
        fetVar.g0(-1458701052);
        int i2 = (fetVar.g(n0xVar) ? 4 : 2) | i;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarS = i120.S(mm40VarN, 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), vgg0.a(12.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            uc9.c(lgb.J(o7k0.n(jm40Var, 32.0f), vgg0.a(8.0f)), lgb.J(o7k0.n(jm40Var, 24.0f), vgg0.a(8.0f)), n0xVar, Integer.valueOf(R.drawable.ic_glyph_placeholder_player), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary60()), null, null, gqw0.B, dyb.g0(new nrs0(), new bef()), fetVar, ((i2 << 6) & 896) | 113246208, 96);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0g(n0xVar, i, b);
        }
    }

    public static final void E(int i, long j, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(1446836022);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.f(j) ? 32 : 16) | (fetVar.g(str) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.n(mm40Var, 28.0f), j, vgg0.a(10.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, null, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, (i2 >> 6) & 14, 0, 131066);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rea((byte) 1, i, j, mm40Var, str);
        }
    }

    public static final void F(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1716867187);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 14);
        }
    }

    public static final void G(mm40 mm40Var, kiq kiqVar, fet fetVar, int i) {
        kiq kiqVar2 = kiqVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-96431570);
        int i2 = i | (fetVar2.g(kiqVar2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, staticColors.m73getBlack400d7_KjU(), vgg0.a(8.0f)), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            String str = kiqVar2.b;
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            pge pgeVar = gqw0.B;
            jm40 jm40Var = jm40.b;
            lgb.v(o7k0.n(jm40Var, 16.0f), o7k0.n(jm40Var, 16.0f), str, R.drawable.icon_globe_new, jM130getWhite600d7_KjU, pgeVar, fetVar2, 196608, 0);
            v8q0.a(kiqVar2.f18348a, o2e.e0(s5x0.L(jm40Var, 8.0f, 0.0f, 2).e(new x7z(1.0f, true)), "FIXED_GRAPH_TEAM_NAME_TEST_TAG"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarE0 = o2e.e0(o7k0.n(jm40Var, 8.0f), "FIXED_GRAPH_TEAM_DOT_TEST_TAG");
            kiqVar2 = kiqVar;
            long j = kiqVar2.c;
            zcl zclVar2 = qmk.m;
            zq8.a(0, fetVar2, i120.Q(mm40VarE0, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var, kiqVar2, i, (byte) 6);
        }
    }

    public static final void H(mm40 mm40Var, d280 d280Var, int i, int i2, String str, j83 j83Var, fet fetVar, int i3, int i4) {
        mm40 mm40Var2;
        int i5;
        fet fetVar2;
        mm40 mm40Var3;
        fetVar.g0(174911531);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i5 = i3 | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i7 = i5 | (fetVar.g(d280Var) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.e(i2) ? 2048 : 1024) | (fetVar.g(str) ? 16384 : 8192) | (fetVar.g(j83Var) ? 131072 : 65536);
        if (fetVar.U(i7 & 1, (74899 & i7) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i6 != 0 ? jm40Var : mm40Var2;
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var4, 16.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            boolean z = (i7 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.l, d280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar.o0(objP2);
            }
            kkb.p(1, fetVar, null, (Function0) objP2);
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar = zaq0.b;
            mm40 mm40Var5 = mm40Var4;
            v8q0.a(str, dw9.h(1.0f, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), true), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar, (i7 >> 12) & 14, 24960, 110584);
            v8q0.b(j83Var, o7k0.u(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 130.0f, 1), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, g1t0.a(), fetVar, (i7 >> 15) & 14, 24960, 241656);
            fetVar2 = fetVar;
            if (i > 0) {
                fetVar2.e0(373659189);
                long primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
                boolean z2 = ((i7 & 7168) == 2048) | ((i7 & 896) == 256);
                Object objP3 = fetVar2.P();
                if (z2 || objP3 == cl5Var) {
                    objP3 = new l8n(new k8n(primary), i, i2);
                    fetVar2.o0(objP3);
                }
                dyb.u(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), (l8n) objP3, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(374249243);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var3 = mm40Var5;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gb8(mm40Var3, d280Var, i, i2, str, j83Var, i3, i4);
        }
    }

    public static final void I(EventCardMiddleWinningFormula eventCardMiddleWinningFormula, vvr vvrVar) {
        vvrVar.getClass();
        eventCardMiddleWinningFormula.setScoreModel(vvrVar.e.f32882a);
        eventCardMiddleWinningFormula.setInformation(vvrVar.d);
        eventCardMiddleWinningFormula.setTimeLeft(vvrVar.h.f34615a);
        qvr qvrVar = vvrVar.f;
        eventCardMiddleWinningFormula.setFirstPlayerName(qvrVar.b);
        eventCardMiddleWinningFormula.setFirstFormulaTitle(R.string.sport_game_victory_formula_text);
        eventCardMiddleWinningFormula.setFirstFormula(qvrVar.c);
        eventCardMiddleWinningFormula.setFirstPlayerFirstAnswer(qvrVar.d);
        eventCardMiddleWinningFormula.setFirstPlayerSecondAnswer(qvrVar.e);
        eventCardMiddleWinningFormula.setFirstPlayerThirdAnswer(qvrVar.f);
        rvr rvrVar = vvrVar.g;
        eventCardMiddleWinningFormula.setSecondPlayerName(rvrVar.b);
        eventCardMiddleWinningFormula.setSecondFormulaTitle(R.string.sport_game_victory_formula_text);
        eventCardMiddleWinningFormula.setSecondFormula(rvrVar.c);
        eventCardMiddleWinningFormula.setSecondPlayerFirstAnswer(rvrVar.d);
        eventCardMiddleWinningFormula.setSecondPlayerSecondAnswer(rvrVar.e);
        eventCardMiddleWinningFormula.setSecondPlayerThirdAnswer(rvrVar.f);
    }

    public static final lc00 J(ctf0 ctf0Var, List list) {
        Object next;
        Object next2;
        list.getClass();
        ctf0Var.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((z6w) obj).f()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Date date = ((z6w) next).d;
                    do {
                        Object next3 = it.next();
                        Date date2 = ((z6w) next3).d;
                        if (date.compareTo(date2) < 0) {
                            next = next3;
                            date = date2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            z6w z6wVar = (z6w) next;
            if (z6wVar != null) {
                Date date3 = z6wVar.d;
                lc00 lc00VarB2 = kotlin.collections.a.b();
                for (int i = 1; i < 7; i++) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date3);
                    calendar.add(5, (7 - i) * (-1));
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    Date date4 = new Date(calendar.getTimeInMillis());
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        z6w z6wVar2 = (z6w) next2;
                        Date date5 = z6wVar2.d;
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(date5);
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.setTime(date4);
                        if (calendar2.get(1) == calendar3.get(1) && calendar2.get(2) == calendar3.get(2) && calendar2.get(5) == calendar3.get(5) && z6wVar2.f()) {
                            break;
                        }
                    }
                    lc00VarB2.add(L((z6w) next2, date4, ctf0Var));
                }
                lc00VarB2.add(L(z6wVar, date3, ctf0Var));
                lc00VarB.addAll(kotlin.collections.a.a(lc00VarB2));
            }
        }
        lc00VarB.add(M(ctf0Var));
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final rx K(ctf0 ctf0Var) {
        ctf0Var.getClass();
        return new rx(R.drawable.ic_cyber_full_statistic, ctf0Var.b.a(R.string.web_statistic, Arrays.copyOf(new Object[0], 0)), "", hx.f13788a);
    }

    public static final hll L(z6w z6wVar, Date date, ctf0 ctf0Var) {
        ctf0Var.getClass();
        wuo0 wuo0Var = z6wVar != null ? z6wVar.h : null;
        int i = wuo0Var == null ? -1 : k0j.f17469a[wuo0Var.ordinal()];
        if (i == 1) {
            long j = z6wVar.f;
            huo0 huo0Var = z6wVar.b;
            sba0 sba0Var = z6wVar.f43890a;
            suo0 suo0Var = z6wVar.c;
            String strQ = jpm0.q(ctf0Var, suo0Var);
            String strR = jpm0.r(ctf0Var, suo0Var);
            lsm0 lsm0Var = ctf0Var.b;
            return new hll(j, strQ, strR, lsm0Var.a(R.string.daily_task_missed, Arrays.copyOf(new Object[0], 0)), knm0.p(ctf0Var, sba0Var, huo0Var, suo0Var), new lll(false), date, lsm0Var.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), null, rdj.c(rdj.f30294a, sdj.UNIVERSAL, date, null, 60), lsm0Var.a(R.string.daily_task_completed, Arrays.copyOf(new Object[0], 0)), iom0.o(sba0Var, huo0Var, suo0Var));
        }
        if (i == 2 || i == 3) {
            long j2 = z6wVar.f;
            suo0 suo0Var2 = z6wVar.c;
            String strQ2 = jpm0.q(ctf0Var, suo0Var2);
            String strR2 = jpm0.r(ctf0Var, suo0Var2);
            lsm0 lsm0Var2 = ctf0Var.b;
            return new hll(j2, strQ2, strR2, lsm0Var2.a(R.string.daily_task_done, Arrays.copyOf(new Object[0], 0)), knm0.q(ctf0Var, suo0Var2), new lll(true), date, lsm0Var2.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.daily_task_button_text_done, Arrays.copyOf(new Object[0], 0)), rdj.c(rdj.f30294a, sdj.UNIVERSAL, date, null, 60), lsm0Var2.a(R.string.daily_task_completed, Arrays.copyOf(new Object[0], 0)), iom0.o(z6wVar.f43890a, z6wVar.b, suo0Var2));
        }
        lsm0 lsm0Var3 = ctf0Var.b;
        String strA = lsm0Var3.a(R.string.daily_task_missed, Arrays.copyOf(new Object[0], 0));
        String strA2 = lsm0Var3.a(R.string.daily_task_prize_title_default, Arrays.copyOf(new Object[0], 0));
        lll lllVar = new lll(false);
        String strA3 = lsm0Var3.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0));
        String strC = rdj.c(rdj.f30294a, sdj.UNIVERSAL, date, null, 60);
        String strA4 = lsm0Var3.a(R.string.daily_task_completed, Arrays.copyOf(new Object[0], 0));
        StringBuilder sb = new StringBuilder(ujn.h);
        if (StringsKt.O("/static/img/android/casino/daily_challenge/tasks/Amount.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/tasks/Amount.webp", "https://", false)) {
            sb.setLength(0);
            sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/tasks/Amount.webp", '/'));
        }
        return new hll(-2L, null, null, strA, strA2, lllVar, date, strA3, null, strC, strA4, sb.toString());
    }

    public static final hll M(ctf0 ctf0Var) {
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.daily_task_empty_state_subtitle, Arrays.copyOf(new Object[0], 0));
        Date date = new Date(Long.MAX_VALUE);
        String strA2 = lsm0Var.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0));
        String strA3 = lsm0Var.a(R.string.daily_task_empty_button_text, Arrays.copyOf(new Object[0], 0));
        StringBuilder sb = new StringBuilder(ujn.h);
        if (StringsKt.O("/static/img/android/casino/daily_challenge/tasks/Unavailable.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/tasks/Unavailable.webp", "https://", false)) {
            sb.setLength(0);
            sb.append("/static/img/android/casino/daily_challenge/tasks/Unavailable.webp");
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/tasks/Unavailable.webp", '/'));
        }
        return new hll(-1L, null, null, null, strA, mll.f21995a, date, strA2, strA3, null, null, sb.toString());
    }

    public static final boolean N(d0t d0tVar) {
        if (d0tVar.F) {
            return (d0tVar.v == 40 && d0tVar.C) ? false : true;
        }
        return false;
    }

    public static final mm40 O(mm40 mm40Var, Function0 function0) {
        mm40Var.getClass();
        function0.getClass();
        return y860.W(mm40Var, null, null, false, null, function0, 28);
    }

    public static final m1e P(fet fetVar) {
        if (((Boolean) fetVar.k(kix.f18358a)).booleanValue()) {
            return qub0.f29339a;
        }
        Object applicationContext = ((Context) fetVar.k(dy2.b)).getApplicationContext();
        q1e q1eVar = applicationContext instanceof q1e ? (q1e) applicationContext : null;
        if (q1eVar == null) {
            jf4.n("ApplicationContext не реализует ConnectionObserverProvider");
            return null;
        }
        z7z z7zVar = ((ApplicationLoader) q1eVar).v;
        if (z7zVar == null) {
            Intrinsics.h("connectionObserver");
            throw null;
        }
        Object obj = z7zVar.get();
        obj.getClass();
        return (m1e) obj;
    }

    public static Exception Q(s sVar, String str, Exception exc) {
        if (!(exc instanceof sbf)) {
            if (exc instanceof rpu) {
                return new rpu(sVar, str);
            }
            throw new t7r();
        }
        String strConcat = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(sVar.f31386a);
        sbf sbfVar = new sbf(strConcat, str, (byte) 1);
        if (strConcat.length() > 0) {
            return sbfVar;
        }
        jf4.o("type must not be empty");
        throw null;
    }

    public static final ArrayList R(d0t d0tVar) {
        List list = d0tVar.K;
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BetGroupZip betGroupZip = (BetGroupZip) it.next();
            long j = betGroupZip.b;
            String str = betGroupZip.c;
            List<BetZip> list2 = betGroupZip.f;
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, i));
            for (BetZip betZip : list2) {
                arrayList2.add(new cu6(betZip.f46426a, betZip.b, betZip.t, betZip.f, betZip.w, betZip.y));
                it = it;
            }
            arrayList.add(new wv6(j, str, arrayList2));
            i = 10;
        }
        return arrayList;
    }

    public static final j3w S(kzv kzvVar, ctf0 ctf0Var, boolean z) {
        String strA;
        String str = kzvVar.l;
        ctf0Var.getClass();
        if (!z || str.length() <= 0) {
            strA = kzvVar.g == i0w.i ? ctf0Var.b.a(R.string.sell_coefficient_with_dots, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = w6x.r(new Object[0], 0, ctf0Var.b, R.string.optional_coef, Separators.COLON);
        }
        if (!z || str.length() <= 0) {
            str = kzvVar.i;
        }
        j3w j3wVar = new j3w(strA, kng0.k("\u200e", str));
        if (str.length() > 0) {
            return j3wVar;
        }
        return null;
    }

    public static final String U(String str, String str2, boolean z) {
        if (str.length() == 0) {
            return "";
        }
        return ((str.length() <= 0 || z) && str.length() > 0 && z) ? kng0.l(str, Separators.DOT, str2) : str;
    }

    public static final int V(e4f e4fVar) {
        e4fVar.getClass();
        switch (e4fVar.ordinal()) {
            case 0:
                return 0;
            case 1:
                return R.drawable.ic_status_accepted_new;
            case 2:
                return R.drawable.ic_status_lost_new;
            case 3:
            case 4:
                return R.drawable.ic_status_win_new;
            case 5:
            case 6:
                return R.drawable.ic_status_deleted_new;
            case 7:
                return R.drawable.ic_status_blocked_new;
            case 8:
                return R.drawable.ic_status_paid_new;
            case 9:
                return R.drawable.ic_status_wait_new;
            case 10:
                return R.drawable.ic_status_lost_new;
            case 11:
                return R.drawable.ic_status_accepted_new;
            default:
                t9f.b();
                return 0;
        }
    }

    public static final long W(d0t d0tVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, (int) d0tVar.t);
        return calendar.getTime().getTime();
    }

    public static final int X(e4f e4fVar) {
        e4fVar.getClass();
        switch (e4fVar.ordinal()) {
            case 0:
                return R.string.error;
            case 1:
                return R.string.accepted;
            case 2:
                return R.string.loosed;
            case 3:
                return R.string.won;
            case 4:
                return R.string.paid;
            case 5:
                return R.string.removed;
            case 6:
                return R.string.expired;
            case 7:
                return R.string.blocked;
            case 8:
                return R.string.bought;
            case 9:
                return R.string.autobet_waiting;
            case 10:
                return R.string.autobet_dropped;
            case 11:
                return R.string.autobet_applied;
            default:
                t9f.b();
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    public static final d280 Y(bcs0 bcs0Var, String str, boolean z) {
        if (bcs0Var.x) {
            return new b280(z ? R.drawable.ic_glyph_color_logo_home : R.drawable.ic_glyph_color_logo_away);
        }
        str.getClass();
        if (!kotlin.text.c.x(str, ujn.h, false)) {
            if (str.length() == 0) {
                str = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str)) {
                    str = "";
                } else {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
                }
            }
        }
        return new c280(str, R.drawable.ic_glyph_placeholder_player);
    }

    public static final ArrayList Z(d0t d0tVar) {
        Iterable<d0t> iterable = d0tVar.k;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (d0t d0tVar2 : iterable) {
            arrayList.add(new vum0(d0tVar2.i, d0tVar2.f5282a, d0tVar2.E));
        }
        return arrayList;
    }

    public static final void a(py1 py1Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        boolean z;
        int i3;
        fetVar.g0(-1290673380);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(py1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            kdm kdmVar = py1Var.l;
            boolean zG = fetVar.g(kdmVar.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                Date date = kdmVar.b;
                objP = Boolean.valueOf(!(date != null && date.getTime() == 0));
                fetVar.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            boolean z2 = kdmVar.c - System.currentTimeMillis() <= 0;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = ((i2 & 7168) == 2048) | fetVar.h(z2) | fetVar.h(zBooleanValue);
            Object objP2 = fetVar.P();
            yje yjeVar = null;
            if (zH || objP2 == cl5Var) {
                z = zBooleanValue;
                fsl fslVar = new fsl(z2, z, function2, yjeVar, (byte) 0);
                fetVar.o0(fslVar);
                objP2 = fslVar;
            } else {
                z = zBooleanValue;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            i(py1Var.f, py1Var.g, fetVar, 0);
            if (z) {
                fetVar.e0(1174881962);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                int i4 = i2;
                i3 = i4;
                obb.r(s5x0.N(mm40VarD, 12.0f, 0.0f, 12.0f, 0.0f, 10), kdmVar.f18113a, kdmVar.c, new qol(yjeVar, 15), Integer.valueOf(R.drawable.ic_glyph_history), tol.d, function2, fetVar, ((i4 << 9) & 3670016) | 196608);
                fetVar.r(false);
            } else {
                i3 = i2;
                fetVar.e0(1175502768);
                fetVar.r(false);
            }
            o050.b(py1Var.q, function0, function1, fetVar, i3 & 1008);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dsl(py1Var, function0, function1, function2, i, (byte) 1);
        }
    }

    public static final int a0(e4f e4fVar, Context context) {
        e4fVar.getClass();
        context.getClass();
        switch (e4fVar.ordinal()) {
            case 2:
            case 5:
            case 6:
            case 10:
                TypedValue typedValue = j5d.f15927a;
                return context.getColor(R.color.static_red);
            case 3:
            case 4:
            case 8:
                TypedValue typedValue2 = j5d.f15927a;
                return context.getColor(R.color.static_green);
            case 7:
            case 9:
                TypedValue typedValue3 = j5d.f15927a;
                return context.getColor(R.color.static_gray);
            default:
                TypedValue typedValue4 = j5d.f15927a;
                return j5d.a(context, R.attr.uikitPrimary, false);
        }
    }

    public static final void b(py1 py1Var, fet fetVar, int i) {
        int i2;
        byte b;
        pcy pcyVar;
        py1 py1Var2 = py1Var;
        fetVar.g0(1853617540);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(py1Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            boolean z = fetVar.k(bmd.n) == k6z.b;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 136.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE2);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar2);
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
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE3 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, jr8Var.a(jm40Var));
            boolean zH = fetVar.h(z);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new z((byte) 15, z);
                fetVar.o0(objP);
            }
            k7x.b(py1Var2.c, null, o2e.e0(i4w0.T(mm40VarE3, (Function1) objP), "TOURNAMENT_IMAGE"), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), null, null, null, null, gqw0.A, null, fetVar, 299056, 6, 31680);
            b = 0;
            j(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, jr8Var.a(jm40Var)), 0.0f, fetVar, 0);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 12.0f, 12.0f, 0.0f, 8);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, true);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, x7zVarI);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            dtb.q(null, py1Var.r, fetVar, 0);
            fetVar.r(true);
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 12.0f, 6), "DATE_HEADER_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            x7z x7zVarI2 = ohs0.i(fetVar, mm40VarC3, shdVar4, 1.0f, false);
            String str = py1Var.m;
            if (str == null) {
                str = "";
            }
            String str2 = py1Var.n;
            if (str2 == null) {
                str2 = "";
            }
            wzb.p(0, fetVar, x7zVarI2, str, str2);
            py1Var2 = py1Var;
            mbc.o(zfi0.f44303a, o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 40.0f), 1.0f), false, fetVar, 6, 4);
            x7z x7zVar = new x7z(1.0f, false);
            String str3 = py1Var2.o;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = py1Var2.p;
            wzb.p(0, fetVar, x7zVar, str3, str4 != null ? str4 : "");
            ohs0.x(fetVar, true, true, true);
        } else {
            b = 0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new csl(py1Var2, i, b);
        }
    }

    public static final foc b0(vjj vjjVar) {
        vjj vjjVarJ = vjjVar.j();
        if (vjjVarJ == null || (vjjVar instanceof mg80)) {
            return null;
        }
        if (!(vjjVarJ.j() instanceof mg80)) {
            return b0(vjjVarJ);
        }
        if (vjjVarJ instanceof foc) {
            return (foc) vjjVarJ;
        }
        return null;
    }

    public static final void c(py1 py1Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-480180264);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(py1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            zcl zclVar2 = qmk.i;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar, zclVar, zclVar2, zclVar2, mm40VarD), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            a(py1Var, function0, function1, function2, fetVar, i2 & 8190);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dsl(py1Var, function0, function1, function2, i, (byte) 0);
        }
    }

    public static final boolean c0(d0t d0tVar, boolean z) {
        if (z) {
            return d0tVar.A != boh.UNKNOWN;
        }
        return d0tVar.e.length() != 0;
    }

    public static final void d(mm40 mm40Var, pad padVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(321737110);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(padVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(padVar.c, fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(padVar.d, fetVar);
            pz40 pz40VarF3 = androidx.compose.runtime.e.f(Boolean.valueOf(padVar.e), fetVar);
            pz40 pz40VarF4 = androidx.compose.runtime.e.f(Boolean.valueOf(padVar.f), fetVar);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            f(o7k0.d(jm40Var, 1.0f), padVar.f26650a, pz40VarF, pz40VarF3, fetVar, 6);
            f(o7k0.d(jm40Var, 1.0f), padVar.b, pz40VarF2, pz40VarF4, fetVar, 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, padVar, i, (byte) 3);
        }
    }

    public static final void e(mm40 mm40Var, dhh dhhVar, fet fetVar, int i) {
        fetVar.g0(2130852920);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(dhhVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new gch((byte) 8);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 12.0f, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            v(dhhVar, pz40Var, fetVar, (i2 >> 3) & 14);
            b34.e(y5d.f42040a, ((Boolean) pz40Var.getValue()).booleanValue(), null, null, null, null, u1c.M(-1940835834, new sd8(dhhVar, (byte) 20), fetVar), fetVar, 1572870, 30);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, dhhVar, i, b);
        }
    }

    public static final wm40 e0(ym40 ym40Var, swq swqVar) {
        cr30 cr30VarJ0;
        ux50 ux50Var = ux50.f36425a;
        ym40Var.getClass();
        swqVar.getClass();
        twq twqVar = swqVar.f32934a;
        if (!twqVar.c()) {
            foc focVarD = ym40Var.c0(swqVar.b()).h.d(twqVar.g(), ux50Var);
            wm40 wm40Var = focVarD instanceof wm40 ? (wm40) focVarD : null;
            if (wm40Var != null) {
                return wm40Var;
            }
            wm40 wm40VarE0 = e0(ym40Var, swqVar.b());
            foc focVarD2 = (wm40VarE0 == null || (cr30VarJ0 = wm40VarE0.j0()) == null) ? null : cr30VarJ0.d(twqVar.g(), ux50Var);
            if (focVarD2 instanceof wm40) {
                return (wm40) focVarD2;
            }
        }
        return null;
    }

    public static final void f(mm40 mm40Var, String str, pz40 pz40Var, pz40 pz40Var2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-314467011);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(pz40Var) ? 256 : 128) | (fetVar2.g(pz40Var2) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            l7m0 l7m0VarB = m5k0.b(((Boolean) pz40Var2.getValue()).booleanValue() ? cs0.D(fetVar2, -1555078782, fetVar2, false) : rz4.c(fetVar2, -1555077848, fetVar2, false), null, fetVar2, 0, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            x7z x7zVar = new x7z(1.0f, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(x7zVar, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            afn0.v(fetVar2).getClass();
            v8q0.a(str, mm40VarN, afn0.m(fetVar2).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarU = o7k0.u(jm40.b, 0.0f, 144.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarU);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            String str2 = (String) pz40Var.getValue();
            afn0.v(fetVar2).getClass();
            y9q0 y9q0VarA = y9q0.a(g1t0.a(), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447);
            boolean zG = fetVar2.g(l7m0VarB);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                objP = new oad(l7m0VarB, (byte) 0);
                fetVar2.o0(objP);
            }
            aad.e(str2, null, y9q0VarA, null, 2, false, 1, 0, (n4d) objP, new n05(qmk.p, qmk.q, qmk.n), fetVar2, 1597440, 170);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 10, i, (Object) mm40Var, (Object) str, (Object) pz40Var, (Object) pz40Var2);
        }
    }

    public static final void g(mm40 mm40Var, rjg rjgVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1589345227);
        int i2 = i | 6 | (fetVar2.g(rjgVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            aah aahVar = rjgVar.f30591a;
            H(null, aahVar.f524a, aahVar.c, aahVar.d, aahVar.b, aahVar.e, fetVar2, 0, 1);
            aah aahVar2 = rjgVar.b;
            d280 d280Var = aahVar2.f524a;
            String str = aahVar2.b;
            j83 j83Var = aahVar2.e;
            H(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), d280Var, aahVar2.c, aahVar2.d, str, j83Var, fetVar, 0, 0);
            v8q0.a(rjgVar.c, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(mm40Var2, rjgVar, i, (byte) 22);
        }
    }

    public static final void h(mm40 mm40Var, grh grhVar, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        grhVar.getClass();
        fetVar2.g0(-1719944778);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(grhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = grhVar instanceof frh;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 240.0f);
            long jM73getBlack400d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            boolean zH = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | fetVar2.h(z2);
            Object objP = fetVar2.P();
            if (zH || objP == ukd.f35823a) {
                objP = new lf2(function1, grhVar, z2, b);
                fetVar2.o0(objP);
            }
            mm40 mm40VarN = s5x0.N(y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28), 0.0f, 4.0f, 0.0f, 2.0f, 5);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            int i4 = i3 << 3;
            bfb.j(null, grhVar.a(), z2, grhVar.d(), function1, fetVar, i4 & 57344);
            fetVar2 = fetVar;
            jeb.f(null, grhVar.b(), z2, z, fetVar2, i4 & 7168);
            rcb.z(null, grhVar.c(), z, function1, fetVar2, i3 & 8064, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1((Object) mm40Var, (Object) grhVar, z, (wdr) function1, i, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029 A[PHI: r4
  0x0029: PHI (r4v6 java.lang.String) = (r4v4 java.lang.String), (r4v14 java.lang.String) binds: [B:20:0x0031, B:14:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static final List h0(web webVar) {
        String str;
        String str2;
        pgb pgbVar;
        Long l;
        Long l2;
        webVar.getClass();
        l26 l26Var = webVar.f39011a;
        ArrayList arrayList = null;
        if (((l26Var == null || (l2 = l26Var.f19293a) == null) ? 0L : l2.longValue()) == 40) {
            l26 l26Var2 = webVar.b;
            str = l26Var2 != null ? l26Var2.b : null;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str = l26Var != null ? l26Var.b : null;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        }
        List<ueb> list = webVar.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (ueb uebVar : list) {
                long jLongValue = (l26Var == null || (l = l26Var.f19293a) == null) ? 0L : l.longValue();
                uebVar.getClass();
                Boolean bool = uebVar.j;
                int iIntValue = 0;
                if (bool != null ? bool.booleanValue() : false) {
                    pgbVar = pgb.b;
                } else {
                    Boolean bool2 = uebVar.i;
                    pgbVar = bool2 != null ? bool2.booleanValue() : false ? pgb.c : pgb.f26945a;
                }
                pgb pgbVar2 = pgbVar;
                Long l3 = uebVar.f35517a;
                long jLongValue2 = l3 != null ? l3.longValue() : 0L;
                String str3 = uebVar.b;
                if (str3 == null) {
                    str3 = "";
                }
                Long l4 = uebVar.h;
                long jLongValue3 = l4 != null ? l4.longValue() : 0L;
                StringBuilder sb = new StringBuilder(ujn.h);
                String str4 = uebVar.c;
                if (str4 == null) {
                    str4 = "";
                }
                if (str4.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(str4, ujn.h, false) || kotlin.text.c.x(str4, "https://", false)) {
                    sb.setLength(0);
                    sb.append(str4);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(str4, '/'));
                }
                String string = sb.toString();
                String str5 = uebVar.e;
                String str6 = str5 == null ? "" : str5;
                Long l5 = uebVar.k;
                long jLongValue4 = l5 != null ? l5.longValue() : 0L;
                Integer num = uebVar.f;
                int iIntValue2 = num != null ? num.intValue() : 0;
                iun iunVar = iun.f15405a;
                Integer num2 = uebVar.l;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                arrayList.add(new eeb(jLongValue2, str3, str2, jLongValue3, string, str6, jLongValue4, iIntValue2, jLongValue, pgbVar2, iunVar, iIntValue));
            }
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public static final void i(String str, String str2, fet fetVar, int i) {
        String str3;
        jm40 jm40Var;
        ?? r13;
        fetVar.g0(-1134277560);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.g(str2) ? 32 : 16);
        byte b = 3;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.M(mm40VarD, 12.0f, 12.0f, 12.0f, 12.0f), "HEADER_BLOCK_COLUMN");
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            if (StringsKt.W(str)) {
                fetVar.e0(-1608339216);
                fetVar.r(false);
                r13 = 0;
                jm40Var = jm40Var2;
            } else {
                fetVar.e0(-1609009343);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                int i3 = (i2 & 14) | 1794096;
                jm40Var = jm40Var2;
                r13 = 0;
                aad.e(str, o2e.e0(jm40Var2, "PRIZE_AMOUNT"), y9q0.a(g1t0.p(), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 1, qmk.x, null, null, 16580606), null, 2, false, 1, 0, null, new n05(qmk.u, qmk.w, qmk.n), fetVar, i3, 392);
                fetVar.r(false);
            }
            if (str2 == null || StringsKt.W(str2)) {
                str3 = str2;
                fetVar.e0(-1606942480);
                fetVar.r(r13);
            } else {
                fetVar.e0(-1608259050);
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (objP == obj) {
                    objP = androidx.compose.runtime.e.a(0.0f);
                    fetVar.o0(objP);
                }
                agk0 agk0Var = (agk0) objP;
                Object objP2 = fetVar.P();
                if (objP2 == obj) {
                    objP2 = androidx.compose.runtime.e.b(r13);
                    fetVar.o0(objP2);
                }
                cgk0 cgk0Var = (cgk0) objP2;
                Object objP3 = fetVar.P();
                if (objP3 == obj) {
                    objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar.o0(objP3);
                }
                pz40 pz40Var = (pz40) objP3;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0 y9q0VarA = y9q0.a(g1t0.j(), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678);
                n05 n05Var = new n05(qmk.r, qmk.s, qmk.n);
                Object objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = new kh0(agk0Var, cgk0Var, pz40Var, (byte) 6);
                    fetVar.o0(objP4);
                }
                mm40 mm40VarE1 = o2e.e0(pai0.a(jm40Var, r13, (Function1) objP4), "HEADER_TOURNAMENT_TITLE");
                Object objP5 = fetVar.P();
                if (objP5 == obj) {
                    objP5 = new kh0(agk0Var, cgk0Var, pz40Var, (byte) 7);
                    fetVar.o0(objP5);
                }
                str3 = str2;
                aad.e(str3, mm40VarE1, y9q0VarA, (Function1) objP5, 2, false, 2, 0, null, n05Var, fetVar, ((i2 >> 3) & 14) | 1600512, Response.UNSUPPORTED_URI_SCHEME);
                fetVar.r(r13);
            }
            fetVar.r(true);
        } else {
            str = str;
            b = 3;
            str3 = str2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6(b, i, str, str3);
        }
    }

    public static final nrf i0(kjf kjfVar) {
        kjfVar.getClass();
        String str = kjfVar.f18383a;
        String string = "";
        String str2 = str == null ? "" : str;
        gjf gjfVar = kjfVar.c;
        Float f = gjfVar != null ? gjfVar.f11393a : null;
        Float f2 = gjfVar != null ? gjfVar.b : null;
        Float f3 = gjfVar != null ? gjfVar.c : null;
        Float f4 = gjfVar != null ? gjfVar.d : null;
        Float f5 = gjfVar != null ? gjfVar.e : null;
        Float f6 = gjfVar != null ? gjfVar.f : null;
        String str3 = kjfVar.b;
        if (str3 != null && str3.length() != 0) {
            StringBuilder sb = new StringBuilder(ujn.h);
            String strConcat = "sfiles/statistics/esport/".concat(str3);
            if (strConcat.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(strConcat, ujn.h, false) || kotlin.text.c.x(strConcat, "https://", false)) {
                sb.setLength(0);
                sb.append(strConcat);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(strConcat, '/'));
            }
            string = sb.toString();
        }
        return new nrf(str2, string, f, f2, f3, f4, f5, f6);
    }

    public static final void j(mm40 mm40Var, float f, fet fetVar, int i) {
        fetVar.g0(-28806193);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | 48;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = fetVar.k(bmd.n) == k6z.f17794a;
            zfn zfnVar = m8m0.f21378a;
            long jM75getBlack600d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m75getBlack600d7_KjU();
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU();
            zq8.a(0, fetVar, i120.P(mm40Var, yk5.h(new Pair[]{new Pair(Float.valueOf(0.0f), new y3d(jM121getTransparent0d7_KjU)), new Pair(Float.valueOf(z ? 0.19999999f : 0.0f), new y3d(jM121getTransparent0d7_KjU)), new Pair(Float.valueOf(z ? 1.0f : 0.8f), new y3d(jM75getBlack600d7_KjU)), new Pair(Float.valueOf(1.0f), new y3d(jM75getBlack600d7_KjU))}, 0.0f, 0.0f, 14), null, 6));
            f = 0.8f;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esl(mm40Var, f, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:102:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:114:0x021c  */
    /* JADX WARN: Code duplicated, block: B:115:0x021f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0224  */
    /* JADX WARN: Code duplicated, block: B:121:0x0239 A[LOOP:9: B:119:0x0233->B:121:0x0239, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x027b  */
    /* JADX WARN: Code duplicated, block: B:125:0x028a  */
    /* JADX WARN: Code duplicated, block: B:127:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:128:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:136:0x0335  */
    /* JADX WARN: Code duplicated, block: B:138:0x033b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0373  */
    /* JADX WARN: Code duplicated, block: B:141:0x0377  */
    /* JADX WARN: Code duplicated, block: B:143:0x037a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0385  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:154:0x0422  */
    /* JADX WARN: Code duplicated, block: B:160:0x043c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0446  */
    /* JADX WARN: Code duplicated, block: B:168:0x048c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0490  */
    /* JADX WARN: Code duplicated, block: B:171:0x0493  */
    /* JADX WARN: Code duplicated, block: B:174:0x049e  */
    /* JADX WARN: Code duplicated, block: B:176:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:180:0x0503  */
    /* JADX WARN: Code duplicated, block: B:182:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:184:0x0607  */
    /* JADX WARN: Code duplicated, block: B:185:0x0608 A[PHI: r15
  0x0608: PHI (r15v9 int) = (r15v8 int), (r15v11 int) binds: [B:181:0x05fd, B:184:0x0607] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x060a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0612  */
    /* JADX WARN: Code duplicated, block: B:238:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0441 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0156  */
    /* JADX WARN: Code duplicated, block: B:87:0x0163  */
    /* JADX WARN: Code duplicated, block: B:88:0x0165  */
    /* JADX WARN: Code duplicated, block: B:89:0x0167  */
    /* JADX WARN: Code duplicated, block: B:90:0x0169  */
    /* JADX WARN: Code duplicated, block: B:91:0x016b  */
    /* JADX WARN: Code duplicated, block: B:92:0x016d  */
    /* JADX WARN: Code duplicated, block: B:93:0x016f  */
    /* JADX WARN: Code duplicated, block: B:97:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Iterable] */
    public static final lc00 j0(m4j m4jVar, ctf0 ctf0Var) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        int i;
        int i2;
        lc00 lc00VarB;
        int i3;
        List list;
        n85 n85Var;
        wuo0 wuo0Var;
        ?? arrayList;
        int i4;
        int i5;
        long j;
        long j2;
        Iterator it;
        Object next5;
        z6w z6wVar;
        hll hllVarM;
        hll hllVar;
        huo0 huo0Var;
        aet aetVar;
        long j3;
        mzb0 mzb0VarA;
        wuo0 wuo0Var2;
        Calendar calendar;
        Calendar calendar2;
        hll hllVar2;
        huo0 huo0Var2;
        aet aetVar2;
        long j4;
        mzb0 mzb0VarA2;
        lc00 lc00VarB2;
        int i6;
        StringBuilder sb;
        int i7;
        huo0 huo0Var3;
        aet aetVar3;
        long j5;
        mzb0 mzb0VarA3;
        Iterator it2;
        Date date;
        Iterator it3;
        List list2;
        Object next6;
        Calendar calendar3;
        Calendar calendar4;
        Object next7;
        Object next8;
        m4jVar.getClass();
        ctf0Var.getClass();
        lc00 lc00VarB3 = kotlin.collections.a.b();
        List list3 = m4jVar.f21173a;
        List list4 = m4jVar.b;
        List list5 = m4jVar.c;
        Iterator it4 = list3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
            n85 n85Var2 = (n85) next;
            if (n85Var2.f() && n85Var2.g == wuo0.b) {
                break;
            }
        }
        n85 n85Var3 = (n85) next;
        Iterator it5 = list4.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            n85 n85Var4 = (n85) next2;
            if (n85Var4.f() && n85Var4.g == wuo0.c) {
                break;
            }
        }
        n85 n85Var5 = (n85) next2;
        Iterator it6 = list5.iterator();
        do {
            if (!it6.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it6.next();
        } while (!((z6w) next3).f());
        z6w z6wVar2 = (z6w) next3;
        if (!(list3.isEmpty() && list4.isEmpty() && list5.isEmpty()) && ((list3.isEmpty() || n85Var3 != null) && (list5.isEmpty() || z6wVar2 != null))) {
            Iterator it7 = list3.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it7.next();
                n85 n85Var6 = (n85) next4;
                if (n85Var6.f() && n85Var6.g == wuo0.b) {
                    break;
                }
            }
            int i8 = 5;
            if (next4 == null) {
                Iterator it8 = list4.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next7 = null;
                        break;
                    }
                    next7 = it8.next();
                    n85 n85Var7 = (n85) next7;
                    if (n85Var7.f() && n85Var7.g == wuo0.c) {
                        break;
                    }
                }
                if (next7 == null) {
                    Iterator it9 = list4.iterator();
                    do {
                        if (!it9.hasNext()) {
                            next8 = null;
                            break;
                        }
                        next8 = it9.next();
                    } while (((n85) next8).g != wuo0.g);
                    if (next8 != null || list5.isEmpty()) {
                        i = 0;
                        switch (Calendar.getInstance().get(7)) {
                            case 2:
                                i2 = 0;
                                break;
                            case 3:
                                i2 = 1;
                                break;
                            case 4:
                                i2 = 2;
                                break;
                            case 5:
                                i2 = 3;
                                break;
                            case 6:
                                i2 = 4;
                                break;
                            case 7:
                                i2 = 5;
                                break;
                            default:
                                i2 = 6;
                                break;
                        }
                        lc00VarB = kotlin.collections.a.b();
                        i3 = 0;
                        while (i3 < i2) {
                            Calendar calendar5 = Calendar.getInstance();
                            calendar5.add(i8, (i2 - i3) * (-1));
                            calendar5.set(11, i);
                            calendar5.set(12, i);
                            calendar5.set(13, i);
                            calendar5.set(14, i);
                            lc00 lc00Var = lc00VarB;
                            date = new Date(calendar5.getTimeInMillis());
                            it3 = list5.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    list2 = list5;
                                    next6 = null;
                                    break;
                                }
                                next6 = it3.next();
                                z6w z6wVar3 = (z6w) next6;
                                Date date2 = z6wVar3.d;
                                calendar3 = Calendar.getInstance();
                                calendar3.setTime(date2);
                                calendar4 = Calendar.getInstance();
                                calendar4.setTime(date);
                                list2 = list5;
                                if (calendar3.get(1) != calendar4.get(1) && calendar3.get(2) == calendar4.get(2) && calendar3.get(5) == calendar4.get(5) && z6wVar3.f()) {
                                    break;
                                }
                                list5 = list2;
                            }
                            lc00Var.add(L((z6w) next6, date, ctf0Var));
                            i3++;
                            lc00VarB = lc00Var;
                            list5 = list2;
                            i8 = 5;
                            i = 0;
                        }
                        list = list5;
                        lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB));
                        n85Var = (n85) CollectionsKt.firstOrNull(list4);
                        if (n85Var != null) {
                            wuo0Var = n85Var.g;
                        } else {
                            wuo0Var = null;
                        }
                        if (wuo0Var == wuo0.g) {
                            arrayList = new ArrayList(r3d.q(list4, 10));
                            for (it2 = list4.iterator(); it2.hasNext(); it2 = it2) {
                                n85 n85Var8 = (n85) it2.next();
                                arrayList.add(new z6w(n85Var8.h, n85Var8.k, n85Var8.l, new Date(), n85Var8.d, n85Var8.e, n85Var8.f, n85Var8.g, n85Var8.i, n85Var8.j));
                            }
                        } else {
                            arrayList = list;
                        }
                        i4 = R.string.daily_task_button_text_participate;
                        i5 = R.string.tournaments_more;
                        if (n85Var3 != null) {
                            long j6 = n85Var3.e;
                            j = 3600;
                            long j7 = n85Var3.b;
                            suo0 suo0Var = n85Var3.l;
                            String strQ = jpm0.q(ctf0Var, suo0Var);
                            String strR = jpm0.r(ctf0Var, suo0Var);
                            sba0 sba0Var = n85Var3.h;
                            huo0Var3 = n85Var3.k;
                            String strP = knm0.p(ctf0Var, sba0Var, huo0Var3, suo0Var);
                            xak xakVar = pll.b;
                            j2 = 60;
                            Integer numValueOf = Integer.valueOf(sba0Var.f31923a);
                            xakVar.getClass();
                            pll pllVarQ = xak.q(numValueOf);
                            if (huo0Var3 instanceof aet) {
                                aetVar3 = (aet) huo0Var3;
                            } else {
                                aetVar3 = null;
                            }
                            if (aetVar3 != null || (mzb0VarA3 = aetVar3.a()) == null) {
                                j5 = 0;
                            } else {
                                j5 = mzb0VarA3.f22646a;
                            }
                            kll kllVar = new kll(false, false, 0, "", "", pllVarQ, j5);
                            Date dateQ = ntb.Q(new Date());
                            lsm0 lsm0Var = ctf0Var.b;
                            hllVarM = new hll(j6, strQ, strR, null, strP, kllVar, dateQ, lsm0Var.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.daily_task_until_the_end, Arrays.copyOf(new Object[]{String.valueOf(j7 / 3600), String.valueOf((j7 % 3600) / 60)}, 2)), iom0.o(sba0Var, huo0Var3, suo0Var));
                        } else {
                            j = 3600;
                            j2 = 60;
                            if (n85Var5 != null) {
                                long j8 = n85Var5.e;
                                long j9 = n85Var5.b;
                                suo0 suo0Var2 = n85Var5.l;
                                String strQ2 = jpm0.q(ctf0Var, suo0Var2);
                                String strR2 = jpm0.r(ctf0Var, suo0Var2);
                                sba0 sba0Var2 = n85Var5.h;
                                huo0Var2 = n85Var5.k;
                                String strP2 = knm0.p(ctf0Var, sba0Var2, huo0Var2, suo0Var2);
                                int i9 = (int) n85Var5.j;
                                String strE0 = lgb.e0(huo0Var2, ctf0Var);
                                String strF0 = lgb.f0(huo0Var2, ctf0Var);
                                xak xakVar2 = pll.b;
                                Integer numValueOf2 = Integer.valueOf(sba0Var2.f31923a);
                                xakVar2.getClass();
                                pll pllVarQ2 = xak.q(numValueOf2);
                                if (huo0Var2 instanceof aet) {
                                    aetVar2 = (aet) huo0Var2;
                                } else {
                                    aetVar2 = null;
                                }
                                if (aetVar2 != null || (mzb0VarA2 = aetVar2.a()) == null) {
                                    j4 = 0;
                                } else {
                                    j4 = mzb0VarA2.f22646a;
                                }
                                kll kllVar2 = new kll(false, true, i9, strE0, strF0, pllVarQ2, j4);
                                Date dateQ2 = ntb.Q(new Date());
                                lsm0 lsm0Var2 = ctf0Var.b;
                                hllVar = new hll(j8, strQ2, strR2, null, strP2, kllVar2, dateQ2, lsm0Var2.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.daily_task_button_text_open_games, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.daily_task_until_the_end, Arrays.copyOf(new Object[]{String.valueOf(j9 / 3600), String.valueOf((j9 % 3600) / 60)}, 2)), iom0.o(sba0Var2, huo0Var2, suo0Var2));
                            } else {
                                it = arrayList.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next5 = it.next();
                                        z6w z6wVar4 = (z6w) next5;
                                        Date date3 = z6wVar4.d;
                                        wuo0Var2 = z6wVar4.h;
                                        Date date4 = new Date();
                                        calendar = Calendar.getInstance();
                                        calendar.setTime(date3);
                                        calendar2 = Calendar.getInstance();
                                        calendar2.setTime(date4);
                                        if (calendar.get(1) == calendar2.get(1) || calendar.get(2) != calendar2.get(2) || calendar.get(5) != calendar2.get(5) || wuo0Var2 != wuo0.h) {
                                        }
                                    } else {
                                        next5 = null;
                                    }
                                    z6wVar = (z6w) next5;
                                    if (z6wVar != null) {
                                        long j10 = z6wVar.f;
                                        suo0 suo0Var3 = z6wVar.c;
                                        String strQ3 = jpm0.q(ctf0Var, suo0Var3);
                                        String strR3 = jpm0.r(ctf0Var, suo0Var3);
                                        lsm0 lsm0Var3 = ctf0Var.b;
                                        String strA = lsm0Var3.a(R.string.daily_task_done, Arrays.copyOf(new Object[0], 0));
                                        String strQ4 = knm0.q(ctf0Var, suo0Var3);
                                        int i10 = (int) z6wVar.j;
                                        huo0Var = z6wVar.b;
                                        String strE1 = lgb.e0(huo0Var, ctf0Var);
                                        String strF1 = lgb.f0(huo0Var, ctf0Var);
                                        xak xakVar3 = pll.b;
                                        sba0 sba0Var3 = z6wVar.f43890a;
                                        Integer numValueOf3 = Integer.valueOf(sba0Var3.f31923a);
                                        xakVar3.getClass();
                                        pll pllVarQ3 = xak.q(numValueOf3);
                                        if (huo0Var instanceof aet) {
                                            aetVar = (aet) huo0Var;
                                        } else {
                                            aetVar = null;
                                        }
                                        if (aetVar != null || (mzb0VarA = aetVar.a()) == null) {
                                            j3 = 0;
                                        } else {
                                            j3 = mzb0VarA.f22646a;
                                        }
                                        hllVar = new hll(j10, strQ3, strR3, strA, strQ4, new kll(true, true, i10, strE1, strF1, pllVarQ3, j3), ntb.Q(new Date()), lsm0Var3.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.daily_task_button_text_done, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.daily_task_completed, Arrays.copyOf(new Object[0], 0)), iom0.o(sba0Var3, huo0Var, suo0Var3));
                                    } else {
                                        hllVarM = M(ctf0Var);
                                    }
                                } while (wuo0Var2 != wuo0.g);
                                z6wVar = (z6w) next5;
                                if (z6wVar != null) {
                                    long j11 = z6wVar.f;
                                    suo0 suo0Var4 = z6wVar.c;
                                    String strQ5 = jpm0.q(ctf0Var, suo0Var4);
                                    String strR4 = jpm0.r(ctf0Var, suo0Var4);
                                    lsm0 lsm0Var4 = ctf0Var.b;
                                    String strA2 = lsm0Var4.a(R.string.daily_task_done, Arrays.copyOf(new Object[0], 0));
                                    String strQ6 = knm0.q(ctf0Var, suo0Var4);
                                    int i11 = (int) z6wVar.j;
                                    huo0Var = z6wVar.b;
                                    String strE2 = lgb.e0(huo0Var, ctf0Var);
                                    String strF2 = lgb.f0(huo0Var, ctf0Var);
                                    xak xakVar4 = pll.b;
                                    sba0 sba0Var4 = z6wVar.f43890a;
                                    Integer numValueOf4 = Integer.valueOf(sba0Var4.f31923a);
                                    xakVar4.getClass();
                                    pll pllVarQ4 = xak.q(numValueOf4);
                                    if (huo0Var instanceof aet) {
                                        aetVar = (aet) huo0Var;
                                    } else {
                                        aetVar = null;
                                    }
                                    if (aetVar != null) {
                                        j3 = 0;
                                    } else {
                                        j3 = 0;
                                    }
                                    hllVar = new hll(j11, strQ5, strR4, strA2, strQ6, new kll(true, true, i11, strE2, strF2, pllVarQ4, j3), ntb.Q(new Date()), lsm0Var4.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.daily_task_button_text_done, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.daily_task_completed, Arrays.copyOf(new Object[0], 0)), iom0.o(sba0Var4, huo0Var, suo0Var4));
                                } else {
                                    hllVarM = M(ctf0Var);
                                }
                            }
                            hllVar2 = hllVar;
                            lc00VarB3.add(hllVar2);
                            lc00VarB2 = kotlin.collections.a.b();
                            i6 = i2 + 1;
                            while (i6 < 7) {
                                int i12 = i6 - i2;
                                Calendar calendar6 = Calendar.getInstance();
                                calendar6.add(5, i12);
                                calendar6.set(11, 0);
                                calendar6.set(12, 0);
                                calendar6.set(13, 0);
                                calendar6.set(14, 0);
                                Date date5 = new Date(calendar6.getTimeInMillis());
                                long j12 = i6;
                                lsm0 lsm0Var5 = ctf0Var.b;
                                String strA3 = lsm0Var5.a(R.string.daily_task_not_available, Arrays.copyOf(new Object[0], 0));
                                rdj rdjVar = rdj.f30294a;
                                sdj sdjVar = sdj.UNIVERSAL;
                                String strA4 = lsm0Var5.a(R.string.daily_task_will_be_available, Arrays.copyOf(new Object[]{rdj.c(rdjVar, sdjVar, date5, null, 60)}, 1));
                                Date dateQ3 = ntb.Q(new Date());
                                String strA5 = lsm0Var5.a(i5, Arrays.copyOf(new Object[0], 0));
                                String strA6 = lsm0Var5.a(i4, Arrays.copyOf(new Object[0], 0));
                                String strC = rdj.c(rdjVar, sdjVar, date5, null, 60);
                                Calendar calendar7 = Calendar.getInstance();
                                calendar7.add(5, i12);
                                calendar7.set(11, 0);
                                calendar7.set(12, 0);
                                calendar7.set(13, 0);
                                calendar7.set(14, 0);
                                String strValueOf = String.valueOf(((calendar7.getTimeInMillis() - System.currentTimeMillis()) / 1000) / j);
                                Calendar calendar8 = Calendar.getInstance();
                                calendar8.add(5, i12);
                                calendar8.set(11, 0);
                                calendar8.set(12, 0);
                                calendar8.set(13, 0);
                                calendar8.set(14, 0);
                                String strA7 = lsm0Var5.a(R.string.daily_task_until_the_start, Arrays.copyOf(new Object[]{strValueOf, String.valueOf((((calendar8.getTimeInMillis() - System.currentTimeMillis()) / 1000) % j) / j2)}, 2));
                                sb = new StringBuilder(ujn.h);
                                i7 = 0;
                                if (StringsKt.O("/static/img/android/casino/daily_challenge/tasks/Amount.webp", ujn.h, false)) {
                                    sb.setLength(i7);
                                    sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                                } else if (kotlin.text.c.x("/static/img/android/casino/daily_challenge/tasks/Amount.webp", "https://", false)) {
                                    i7 = 0;
                                    sb.setLength(i7);
                                    sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                                } else {
                                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/tasks/Amount.webp", '/'));
                                }
                                lc00VarB2.add(new hll(j12, null, null, strA3, strA4, nll.f23733a, dateQ3, strA5, strA6, strC, strA7, sb.toString()));
                                i6++;
                                i4 = R.string.daily_task_button_text_participate;
                                i5 = R.string.tournaments_more;
                            }
                            lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB2));
                        }
                        hllVar2 = hllVarM;
                        lc00VarB3.add(hllVar2);
                        lc00VarB2 = kotlin.collections.a.b();
                        i6 = i2 + 1;
                        while (i6 < 7) {
                            int i13 = i6 - i2;
                            Calendar calendar9 = Calendar.getInstance();
                            calendar9.add(5, i13);
                            calendar9.set(11, 0);
                            calendar9.set(12, 0);
                            calendar9.set(13, 0);
                            calendar9.set(14, 0);
                            Date date6 = new Date(calendar9.getTimeInMillis());
                            long j13 = i6;
                            lsm0 lsm0Var6 = ctf0Var.b;
                            String strA8 = lsm0Var6.a(R.string.daily_task_not_available, Arrays.copyOf(new Object[0], 0));
                            rdj rdjVar2 = rdj.f30294a;
                            sdj sdjVar2 = sdj.UNIVERSAL;
                            String strA9 = lsm0Var6.a(R.string.daily_task_will_be_available, Arrays.copyOf(new Object[]{rdj.c(rdjVar2, sdjVar2, date6, null, 60)}, 1));
                            Date dateQ4 = ntb.Q(new Date());
                            String strA10 = lsm0Var6.a(i5, Arrays.copyOf(new Object[0], 0));
                            String strA11 = lsm0Var6.a(i4, Arrays.copyOf(new Object[0], 0));
                            String strC2 = rdj.c(rdjVar2, sdjVar2, date6, null, 60);
                            Calendar calendar10 = Calendar.getInstance();
                            calendar10.add(5, i13);
                            calendar10.set(11, 0);
                            calendar10.set(12, 0);
                            calendar10.set(13, 0);
                            calendar10.set(14, 0);
                            String strValueOf2 = String.valueOf(((calendar10.getTimeInMillis() - System.currentTimeMillis()) / 1000) / j);
                            Calendar calendar11 = Calendar.getInstance();
                            calendar11.add(5, i13);
                            calendar11.set(11, 0);
                            calendar11.set(12, 0);
                            calendar11.set(13, 0);
                            calendar11.set(14, 0);
                            String strA12 = lsm0Var6.a(R.string.daily_task_until_the_start, Arrays.copyOf(new Object[]{strValueOf2, String.valueOf((((calendar11.getTimeInMillis() - System.currentTimeMillis()) / 1000) % j) / j2)}, 2));
                            sb = new StringBuilder(ujn.h);
                            i7 = 0;
                            if (StringsKt.O("/static/img/android/casino/daily_challenge/tasks/Amount.webp", ujn.h, false)) {
                                sb.setLength(i7);
                                sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                            } else if (kotlin.text.c.x("/static/img/android/casino/daily_challenge/tasks/Amount.webp", "https://", false)) {
                                i7 = 0;
                                sb.setLength(i7);
                                sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                            } else {
                                if (sb.length() > 0) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/tasks/Amount.webp", '/'));
                            }
                            lc00VarB2.add(new hll(j13, null, null, strA8, strA9, nll.f23733a, dateQ4, strA10, strA11, strC2, strA12, sb.toString()));
                            i6++;
                            i4 = R.string.daily_task_button_text_participate;
                            i5 = R.string.tournaments_more;
                        }
                        lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB2));
                    } else {
                        if (!list5.isEmpty()) {
                            Iterator it10 = list5.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    Date date7 = ((z6w) it10.next()).d;
                                    Date date8 = new Date();
                                    Calendar calendar12 = Calendar.getInstance();
                                    calendar12.setTime(date7);
                                    Calendar calendar13 = Calendar.getInstance();
                                    calendar13.setTime(date8);
                                    if (calendar12.get(1) == calendar13.get(1) && calendar12.get(2) == calendar13.get(2) && calendar12.get(5) == calendar13.get(5)) {
                                        i = 0;
                                        switch (Calendar.getInstance().get(7)) {
                                            case 2:
                                                i2 = 0;
                                                break;
                                            case 3:
                                                i2 = 1;
                                                break;
                                            case 4:
                                                i2 = 2;
                                                break;
                                            case 5:
                                                i2 = 3;
                                                break;
                                            case 6:
                                                i2 = 4;
                                                break;
                                            case 7:
                                                i2 = 5;
                                                break;
                                            default:
                                                i2 = 6;
                                                break;
                                        }
                                        lc00VarB = kotlin.collections.a.b();
                                        i3 = 0;
                                        while (i3 < i2) {
                                            Calendar calendar14 = Calendar.getInstance();
                                            calendar14.add(i8, (i2 - i3) * (-1));
                                            calendar14.set(11, i);
                                            calendar14.set(12, i);
                                            calendar14.set(13, i);
                                            calendar14.set(14, i);
                                            lc00 lc00Var2 = lc00VarB;
                                            date = new Date(calendar14.getTimeInMillis());
                                            it3 = list5.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    list2 = list5;
                                                    next6 = null;
                                                    break;
                                                    break;
                                                }
                                                next6 = it3.next();
                                                z6w z6wVar5 = (z6w) next6;
                                                Date date9 = z6wVar5.d;
                                                calendar3 = Calendar.getInstance();
                                                calendar3.setTime(date9);
                                                calendar4 = Calendar.getInstance();
                                                calendar4.setTime(date);
                                                list2 = list5;
                                                if (calendar3.get(1) != calendar4.get(1)) {
                                                }
                                                list5 = list2;
                                            }
                                            lc00Var2.add(L((z6w) next6, date, ctf0Var));
                                            i3++;
                                            lc00VarB = lc00Var2;
                                            list5 = list2;
                                            i8 = 5;
                                            i = 0;
                                        }
                                        list = list5;
                                        lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB));
                                        n85Var = (n85) CollectionsKt.firstOrNull(list4);
                                        if (n85Var != null) {
                                            wuo0Var = n85Var.g;
                                        } else {
                                            wuo0Var = null;
                                        }
                                        if (wuo0Var == wuo0.g) {
                                            arrayList = new ArrayList(r3d.q(list4, 10));
                                            while (it2.hasNext()) {
                                                n85 n85Var9 = (n85) it2.next();
                                                arrayList.add(new z6w(n85Var9.h, n85Var9.k, n85Var9.l, new Date(), n85Var9.d, n85Var9.e, n85Var9.f, n85Var9.g, n85Var9.i, n85Var9.j));
                                            }
                                        } else {
                                            arrayList = list;
                                        }
                                        i4 = R.string.daily_task_button_text_participate;
                                        i5 = R.string.tournaments_more;
                                        if (n85Var3 != null) {
                                            long j14 = n85Var3.e;
                                            j = 3600;
                                            long j15 = n85Var3.b;
                                            suo0 suo0Var5 = n85Var3.l;
                                            String strQ7 = jpm0.q(ctf0Var, suo0Var5);
                                            String strR5 = jpm0.r(ctf0Var, suo0Var5);
                                            sba0 sba0Var5 = n85Var3.h;
                                            huo0Var3 = n85Var3.k;
                                            String strP3 = knm0.p(ctf0Var, sba0Var5, huo0Var3, suo0Var5);
                                            xak xakVar5 = pll.b;
                                            j2 = 60;
                                            Integer numValueOf5 = Integer.valueOf(sba0Var5.f31923a);
                                            xakVar5.getClass();
                                            pll pllVarQ5 = xak.q(numValueOf5);
                                            if (huo0Var3 instanceof aet) {
                                                aetVar3 = (aet) huo0Var3;
                                            } else {
                                                aetVar3 = null;
                                            }
                                            if (aetVar3 != null) {
                                                j5 = 0;
                                            } else {
                                                j5 = 0;
                                            }
                                            kll kllVar3 = new kll(false, false, 0, "", "", pllVarQ5, j5);
                                            Date dateQ5 = ntb.Q(new Date());
                                            lsm0 lsm0Var7 = ctf0Var.b;
                                            hllVarM = new hll(j14, strQ7, strR5, null, strP3, kllVar3, dateQ5, lsm0Var7.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var7.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0)), lsm0Var7.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var7.a(R.string.daily_task_until_the_end, Arrays.copyOf(new Object[]{String.valueOf(j15 / 3600), String.valueOf((j15 % 3600) / 60)}, 2)), iom0.o(sba0Var5, huo0Var3, suo0Var5));
                                        } else {
                                            j = 3600;
                                            j2 = 60;
                                            if (n85Var5 != null) {
                                                long j16 = n85Var5.e;
                                                long j17 = n85Var5.b;
                                                suo0 suo0Var6 = n85Var5.l;
                                                String strQ8 = jpm0.q(ctf0Var, suo0Var6);
                                                String strR6 = jpm0.r(ctf0Var, suo0Var6);
                                                sba0 sba0Var6 = n85Var5.h;
                                                huo0Var2 = n85Var5.k;
                                                String strP4 = knm0.p(ctf0Var, sba0Var6, huo0Var2, suo0Var6);
                                                int i14 = (int) n85Var5.j;
                                                String strE3 = lgb.e0(huo0Var2, ctf0Var);
                                                String strF3 = lgb.f0(huo0Var2, ctf0Var);
                                                xak xakVar6 = pll.b;
                                                Integer numValueOf6 = Integer.valueOf(sba0Var6.f31923a);
                                                xakVar6.getClass();
                                                pll pllVarQ6 = xak.q(numValueOf6);
                                                if (huo0Var2 instanceof aet) {
                                                    aetVar2 = (aet) huo0Var2;
                                                } else {
                                                    aetVar2 = null;
                                                }
                                                if (aetVar2 != null) {
                                                    j4 = 0;
                                                } else {
                                                    j4 = 0;
                                                }
                                                kll kllVar4 = new kll(false, true, i14, strE3, strF3, pllVarQ6, j4);
                                                Date dateQ6 = ntb.Q(new Date());
                                                lsm0 lsm0Var8 = ctf0Var.b;
                                                hllVar = new hll(j16, strQ8, strR6, null, strP4, kllVar4, dateQ6, lsm0Var8.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var8.a(R.string.daily_task_button_text_open_games, Arrays.copyOf(new Object[0], 0)), lsm0Var8.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var8.a(R.string.daily_task_until_the_end, Arrays.copyOf(new Object[]{String.valueOf(j17 / 3600), String.valueOf((j17 % 3600) / 60)}, 2)), iom0.o(sba0Var6, huo0Var2, suo0Var6));
                                            } else {
                                                it = arrayList.iterator();
                                                do {
                                                    if (it.hasNext()) {
                                                        next5 = it.next();
                                                        z6w z6wVar6 = (z6w) next5;
                                                        Date date10 = z6wVar6.d;
                                                        wuo0Var2 = z6wVar6.h;
                                                        Date date11 = new Date();
                                                        calendar = Calendar.getInstance();
                                                        calendar.setTime(date10);
                                                        calendar2 = Calendar.getInstance();
                                                        calendar2.setTime(date11);
                                                        if (calendar.get(1) == calendar2.get(1)) {
                                                        }
                                                    } else {
                                                        next5 = null;
                                                    }
                                                    z6wVar = (z6w) next5;
                                                    if (z6wVar != null) {
                                                        long j18 = z6wVar.f;
                                                        suo0 suo0Var7 = z6wVar.c;
                                                        String strQ9 = jpm0.q(ctf0Var, suo0Var7);
                                                        String strR7 = jpm0.r(ctf0Var, suo0Var7);
                                                        lsm0 lsm0Var9 = ctf0Var.b;
                                                        String strA13 = lsm0Var9.a(R.string.daily_task_done, Arrays.copyOf(new Object[0], 0));
                                                        String strQ10 = knm0.q(ctf0Var, suo0Var7);
                                                        int i15 = (int) z6wVar.j;
                                                        huo0Var = z6wVar.b;
                                                        String strE4 = lgb.e0(huo0Var, ctf0Var);
                                                        String strF4 = lgb.f0(huo0Var, ctf0Var);
                                                        xak xakVar7 = pll.b;
                                                        sba0 sba0Var7 = z6wVar.f43890a;
                                                        Integer numValueOf7 = Integer.valueOf(sba0Var7.f31923a);
                                                        xakVar7.getClass();
                                                        pll pllVarQ7 = xak.q(numValueOf7);
                                                        if (huo0Var instanceof aet) {
                                                            aetVar = (aet) huo0Var;
                                                        } else {
                                                            aetVar = null;
                                                        }
                                                        if (aetVar != null) {
                                                            j3 = 0;
                                                        } else {
                                                            j3 = 0;
                                                        }
                                                        hllVar = new hll(j18, strQ9, strR7, strA13, strQ10, new kll(true, true, i15, strE4, strF4, pllVarQ7, j3), ntb.Q(new Date()), lsm0Var9.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var9.a(R.string.daily_task_button_text_done, Arrays.copyOf(new Object[0], 0)), lsm0Var9.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var9.a(R.string.daily_task_completed, Arrays.copyOf(new Object[0], 0)), iom0.o(sba0Var7, huo0Var, suo0Var7));
                                                    } else {
                                                        hllVarM = M(ctf0Var);
                                                    }
                                                } while (wuo0Var2 != wuo0.g);
                                                z6wVar = (z6w) next5;
                                                if (z6wVar != null) {
                                                    long j19 = z6wVar.f;
                                                    suo0 suo0Var8 = z6wVar.c;
                                                    String strQ11 = jpm0.q(ctf0Var, suo0Var8);
                                                    String strR8 = jpm0.r(ctf0Var, suo0Var8);
                                                    lsm0 lsm0Var10 = ctf0Var.b;
                                                    String strA14 = lsm0Var10.a(R.string.daily_task_done, Arrays.copyOf(new Object[0], 0));
                                                    String strQ12 = knm0.q(ctf0Var, suo0Var8);
                                                    int i16 = (int) z6wVar.j;
                                                    huo0Var = z6wVar.b;
                                                    String strE5 = lgb.e0(huo0Var, ctf0Var);
                                                    String strF5 = lgb.f0(huo0Var, ctf0Var);
                                                    xak xakVar8 = pll.b;
                                                    sba0 sba0Var8 = z6wVar.f43890a;
                                                    Integer numValueOf8 = Integer.valueOf(sba0Var8.f31923a);
                                                    xakVar8.getClass();
                                                    pll pllVarQ8 = xak.q(numValueOf8);
                                                    if (huo0Var instanceof aet) {
                                                        aetVar = (aet) huo0Var;
                                                    } else {
                                                        aetVar = null;
                                                    }
                                                    if (aetVar != null) {
                                                        j3 = 0;
                                                    } else {
                                                        j3 = 0;
                                                    }
                                                    hllVar = new hll(j19, strQ11, strR8, strA14, strQ12, new kll(true, true, i16, strE5, strF5, pllVarQ8, j3), ntb.Q(new Date()), lsm0Var10.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var10.a(R.string.daily_task_button_text_done, Arrays.copyOf(new Object[0], 0)), lsm0Var10.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var10.a(R.string.daily_task_completed, Arrays.copyOf(new Object[0], 0)), iom0.o(sba0Var8, huo0Var, suo0Var8));
                                                } else {
                                                    hllVarM = M(ctf0Var);
                                                }
                                            }
                                            hllVar2 = hllVar;
                                            lc00VarB3.add(hllVar2);
                                            lc00VarB2 = kotlin.collections.a.b();
                                            i6 = i2 + 1;
                                            while (i6 < 7) {
                                                int i17 = i6 - i2;
                                                Calendar calendar15 = Calendar.getInstance();
                                                calendar15.add(5, i17);
                                                calendar15.set(11, 0);
                                                calendar15.set(12, 0);
                                                calendar15.set(13, 0);
                                                calendar15.set(14, 0);
                                                Date date12 = new Date(calendar15.getTimeInMillis());
                                                long j110 = i6;
                                                lsm0 lsm0Var11 = ctf0Var.b;
                                                String strA15 = lsm0Var11.a(R.string.daily_task_not_available, Arrays.copyOf(new Object[0], 0));
                                                rdj rdjVar3 = rdj.f30294a;
                                                sdj sdjVar3 = sdj.UNIVERSAL;
                                                String strA16 = lsm0Var11.a(R.string.daily_task_will_be_available, Arrays.copyOf(new Object[]{rdj.c(rdjVar3, sdjVar3, date12, null, 60)}, 1));
                                                Date dateQ7 = ntb.Q(new Date());
                                                String strA17 = lsm0Var11.a(i5, Arrays.copyOf(new Object[0], 0));
                                                String strA18 = lsm0Var11.a(i4, Arrays.copyOf(new Object[0], 0));
                                                String strC3 = rdj.c(rdjVar3, sdjVar3, date12, null, 60);
                                                Calendar calendar16 = Calendar.getInstance();
                                                calendar16.add(5, i17);
                                                calendar16.set(11, 0);
                                                calendar16.set(12, 0);
                                                calendar16.set(13, 0);
                                                calendar16.set(14, 0);
                                                String strValueOf3 = String.valueOf(((calendar16.getTimeInMillis() - System.currentTimeMillis()) / 1000) / j);
                                                Calendar calendar17 = Calendar.getInstance();
                                                calendar17.add(5, i17);
                                                calendar17.set(11, 0);
                                                calendar17.set(12, 0);
                                                calendar17.set(13, 0);
                                                calendar17.set(14, 0);
                                                String strA19 = lsm0Var11.a(R.string.daily_task_until_the_start, Arrays.copyOf(new Object[]{strValueOf3, String.valueOf((((calendar17.getTimeInMillis() - System.currentTimeMillis()) / 1000) % j) / j2)}, 2));
                                                sb = new StringBuilder(ujn.h);
                                                i7 = 0;
                                                if (StringsKt.O("/static/img/android/casino/daily_challenge/tasks/Amount.webp", ujn.h, false)) {
                                                    sb.setLength(i7);
                                                    sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                                                } else if (kotlin.text.c.x("/static/img/android/casino/daily_challenge/tasks/Amount.webp", "https://", false)) {
                                                    i7 = 0;
                                                    sb.setLength(i7);
                                                    sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                                                } else {
                                                    if (sb.length() > 0) {
                                                        sb.append('/');
                                                    }
                                                    sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/tasks/Amount.webp", '/'));
                                                }
                                                lc00VarB2.add(new hll(j110, null, null, strA15, strA16, nll.f23733a, dateQ7, strA17, strA18, strC3, strA19, sb.toString()));
                                                i6++;
                                                i4 = R.string.daily_task_button_text_participate;
                                                i5 = R.string.tournaments_more;
                                            }
                                            lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB2));
                                        }
                                        hllVar2 = hllVarM;
                                        lc00VarB3.add(hllVar2);
                                        lc00VarB2 = kotlin.collections.a.b();
                                        i6 = i2 + 1;
                                        while (i6 < 7) {
                                            int i18 = i6 - i2;
                                            Calendar calendar18 = Calendar.getInstance();
                                            calendar18.add(5, i18);
                                            calendar18.set(11, 0);
                                            calendar18.set(12, 0);
                                            calendar18.set(13, 0);
                                            calendar18.set(14, 0);
                                            Date date13 = new Date(calendar18.getTimeInMillis());
                                            long j111 = i6;
                                            lsm0 lsm0Var12 = ctf0Var.b;
                                            String strA110 = lsm0Var12.a(R.string.daily_task_not_available, Arrays.copyOf(new Object[0], 0));
                                            rdj rdjVar4 = rdj.f30294a;
                                            sdj sdjVar4 = sdj.UNIVERSAL;
                                            String strA111 = lsm0Var12.a(R.string.daily_task_will_be_available, Arrays.copyOf(new Object[]{rdj.c(rdjVar4, sdjVar4, date13, null, 60)}, 1));
                                            Date dateQ8 = ntb.Q(new Date());
                                            String strA112 = lsm0Var12.a(i5, Arrays.copyOf(new Object[0], 0));
                                            String strA113 = lsm0Var12.a(i4, Arrays.copyOf(new Object[0], 0));
                                            String strC4 = rdj.c(rdjVar4, sdjVar4, date13, null, 60);
                                            Calendar calendar19 = Calendar.getInstance();
                                            calendar19.add(5, i18);
                                            calendar19.set(11, 0);
                                            calendar19.set(12, 0);
                                            calendar19.set(13, 0);
                                            calendar19.set(14, 0);
                                            String strValueOf4 = String.valueOf(((calendar19.getTimeInMillis() - System.currentTimeMillis()) / 1000) / j);
                                            Calendar calendar110 = Calendar.getInstance();
                                            calendar110.add(5, i18);
                                            calendar110.set(11, 0);
                                            calendar110.set(12, 0);
                                            calendar110.set(13, 0);
                                            calendar110.set(14, 0);
                                            String strA114 = lsm0Var12.a(R.string.daily_task_until_the_start, Arrays.copyOf(new Object[]{strValueOf4, String.valueOf((((calendar110.getTimeInMillis() - System.currentTimeMillis()) / 1000) % j) / j2)}, 2));
                                            sb = new StringBuilder(ujn.h);
                                            i7 = 0;
                                            if (StringsKt.O("/static/img/android/casino/daily_challenge/tasks/Amount.webp", ujn.h, false)) {
                                                sb.setLength(i7);
                                                sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                                            } else if (kotlin.text.c.x("/static/img/android/casino/daily_challenge/tasks/Amount.webp", "https://", false)) {
                                                i7 = 0;
                                                sb.setLength(i7);
                                                sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                                            } else {
                                                if (sb.length() > 0) {
                                                    sb.append('/');
                                                }
                                                sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/tasks/Amount.webp", '/'));
                                            }
                                            lc00VarB2.add(new hll(j111, null, null, strA110, strA111, nll.f23733a, dateQ8, strA112, strA113, strC4, strA114, sb.toString()));
                                            i6++;
                                            i4 = R.string.daily_task_button_text_participate;
                                            i5 = R.string.tournaments_more;
                                        }
                                        lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB2));
                                    }
                                }
                            }
                        }
                        lc00VarB3.addAll(J(ctf0Var, list5));
                    }
                } else {
                    i = 0;
                    switch (Calendar.getInstance().get(7)) {
                        case 2:
                            i2 = 0;
                            break;
                        case 3:
                            i2 = 1;
                            break;
                        case 4:
                            i2 = 2;
                            break;
                        case 5:
                            i2 = 3;
                            break;
                        case 6:
                            i2 = 4;
                            break;
                        case 7:
                            i2 = 5;
                            break;
                        default:
                            i2 = 6;
                            break;
                    }
                    lc00VarB = kotlin.collections.a.b();
                    i3 = 0;
                    while (i3 < i2) {
                        Calendar calendar111 = Calendar.getInstance();
                        calendar111.add(i8, (i2 - i3) * (-1));
                        calendar111.set(11, i);
                        calendar111.set(12, i);
                        calendar111.set(13, i);
                        calendar111.set(14, i);
                        lc00 lc00Var3 = lc00VarB;
                        date = new Date(calendar111.getTimeInMillis());
                        it3 = list5.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                list2 = list5;
                                next6 = null;
                                break;
                                break;
                            }
                            next6 = it3.next();
                            z6w z6wVar7 = (z6w) next6;
                            Date date14 = z6wVar7.d;
                            calendar3 = Calendar.getInstance();
                            calendar3.setTime(date14);
                            calendar4 = Calendar.getInstance();
                            calendar4.setTime(date);
                            list2 = list5;
                            if (calendar3.get(1) != calendar4.get(1)) {
                            }
                            list5 = list2;
                        }
                        lc00Var3.add(L((z6w) next6, date, ctf0Var));
                        i3++;
                        lc00VarB = lc00Var3;
                        list5 = list2;
                        i8 = 5;
                        i = 0;
                    }
                    list = list5;
                    lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB));
                    n85Var = (n85) CollectionsKt.firstOrNull(list4);
                    if (n85Var != null) {
                        wuo0Var = n85Var.g;
                    } else {
                        wuo0Var = null;
                    }
                    if (wuo0Var == wuo0.g) {
                        arrayList = new ArrayList(r3d.q(list4, 10));
                        while (it2.hasNext()) {
                            n85 n85Var10 = (n85) it2.next();
                            arrayList.add(new z6w(n85Var10.h, n85Var10.k, n85Var10.l, new Date(), n85Var10.d, n85Var10.e, n85Var10.f, n85Var10.g, n85Var10.i, n85Var10.j));
                        }
                    } else {
                        arrayList = list;
                    }
                    i4 = R.string.daily_task_button_text_participate;
                    i5 = R.string.tournaments_more;
                    if (n85Var3 != null) {
                        long j112 = n85Var3.e;
                        j = 3600;
                        long j113 = n85Var3.b;
                        suo0 suo0Var9 = n85Var3.l;
                        String strQ13 = jpm0.q(ctf0Var, suo0Var9);
                        String strR9 = jpm0.r(ctf0Var, suo0Var9);
                        sba0 sba0Var9 = n85Var3.h;
                        huo0Var3 = n85Var3.k;
                        String strP5 = knm0.p(ctf0Var, sba0Var9, huo0Var3, suo0Var9);
                        xak xakVar9 = pll.b;
                        j2 = 60;
                        Integer numValueOf9 = Integer.valueOf(sba0Var9.f31923a);
                        xakVar9.getClass();
                        pll pllVarQ9 = xak.q(numValueOf9);
                        if (huo0Var3 instanceof aet) {
                            aetVar3 = (aet) huo0Var3;
                        } else {
                            aetVar3 = null;
                        }
                        if (aetVar3 != null) {
                            j5 = 0;
                        } else {
                            j5 = 0;
                        }
                        kll kllVar5 = new kll(false, false, 0, "", "", pllVarQ9, j5);
                        Date dateQ9 = ntb.Q(new Date());
                        lsm0 lsm0Var13 = ctf0Var.b;
                        hllVarM = new hll(j112, strQ13, strR9, null, strP5, kllVar5, dateQ9, lsm0Var13.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var13.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0)), lsm0Var13.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var13.a(R.string.daily_task_until_the_end, Arrays.copyOf(new Object[]{String.valueOf(j113 / 3600), String.valueOf((j113 % 3600) / 60)}, 2)), iom0.o(sba0Var9, huo0Var3, suo0Var9));
                    } else {
                        j = 3600;
                        j2 = 60;
                        if (n85Var5 != null) {
                            long j114 = n85Var5.e;
                            long j115 = n85Var5.b;
                            suo0 suo0Var10 = n85Var5.l;
                            String strQ14 = jpm0.q(ctf0Var, suo0Var10);
                            String strR10 = jpm0.r(ctf0Var, suo0Var10);
                            sba0 sba0Var10 = n85Var5.h;
                            huo0Var2 = n85Var5.k;
                            String strP6 = knm0.p(ctf0Var, sba0Var10, huo0Var2, suo0Var10);
                            int i19 = (int) n85Var5.j;
                            String strE6 = lgb.e0(huo0Var2, ctf0Var);
                            String strF6 = lgb.f0(huo0Var2, ctf0Var);
                            xak xakVar10 = pll.b;
                            Integer numValueOf10 = Integer.valueOf(sba0Var10.f31923a);
                            xakVar10.getClass();
                            pll pllVarQ10 = xak.q(numValueOf10);
                            if (huo0Var2 instanceof aet) {
                                aetVar2 = (aet) huo0Var2;
                            } else {
                                aetVar2 = null;
                            }
                            if (aetVar2 != null) {
                                j4 = 0;
                            } else {
                                j4 = 0;
                            }
                            kll kllVar6 = new kll(false, true, i19, strE6, strF6, pllVarQ10, j4);
                            Date dateQ10 = ntb.Q(new Date());
                            lsm0 lsm0Var14 = ctf0Var.b;
                            hllVar = new hll(j114, strQ14, strR10, null, strP6, kllVar6, dateQ10, lsm0Var14.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var14.a(R.string.daily_task_button_text_open_games, Arrays.copyOf(new Object[0], 0)), lsm0Var14.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var14.a(R.string.daily_task_until_the_end, Arrays.copyOf(new Object[]{String.valueOf(j115 / 3600), String.valueOf((j115 % 3600) / 60)}, 2)), iom0.o(sba0Var10, huo0Var2, suo0Var10));
                        } else {
                            it = arrayList.iterator();
                            do {
                                if (it.hasNext()) {
                                    next5 = it.next();
                                    z6w z6wVar8 = (z6w) next5;
                                    Date date15 = z6wVar8.d;
                                    wuo0Var2 = z6wVar8.h;
                                    Date date16 = new Date();
                                    calendar = Calendar.getInstance();
                                    calendar.setTime(date15);
                                    calendar2 = Calendar.getInstance();
                                    calendar2.setTime(date16);
                                    if (calendar.get(1) == calendar2.get(1)) {
                                    }
                                } else {
                                    next5 = null;
                                }
                                z6wVar = (z6w) next5;
                                if (z6wVar != null) {
                                    long j116 = z6wVar.f;
                                    suo0 suo0Var11 = z6wVar.c;
                                    String strQ15 = jpm0.q(ctf0Var, suo0Var11);
                                    String strR11 = jpm0.r(ctf0Var, suo0Var11);
                                    lsm0 lsm0Var15 = ctf0Var.b;
                                    String strA115 = lsm0Var15.a(R.string.daily_task_done, Arrays.copyOf(new Object[0], 0));
                                    String strQ16 = knm0.q(ctf0Var, suo0Var11);
                                    int i110 = (int) z6wVar.j;
                                    huo0Var = z6wVar.b;
                                    String strE7 = lgb.e0(huo0Var, ctf0Var);
                                    String strF7 = lgb.f0(huo0Var, ctf0Var);
                                    xak xakVar11 = pll.b;
                                    sba0 sba0Var11 = z6wVar.f43890a;
                                    Integer numValueOf11 = Integer.valueOf(sba0Var11.f31923a);
                                    xakVar11.getClass();
                                    pll pllVarQ11 = xak.q(numValueOf11);
                                    if (huo0Var instanceof aet) {
                                        aetVar = (aet) huo0Var;
                                    } else {
                                        aetVar = null;
                                    }
                                    if (aetVar != null) {
                                        j3 = 0;
                                    } else {
                                        j3 = 0;
                                    }
                                    hllVar = new hll(j116, strQ15, strR11, strA115, strQ16, new kll(true, true, i110, strE7, strF7, pllVarQ11, j3), ntb.Q(new Date()), lsm0Var15.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var15.a(R.string.daily_task_button_text_done, Arrays.copyOf(new Object[0], 0)), lsm0Var15.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var15.a(R.string.daily_task_completed, Arrays.copyOf(new Object[0], 0)), iom0.o(sba0Var11, huo0Var, suo0Var11));
                                } else {
                                    hllVarM = M(ctf0Var);
                                }
                            } while (wuo0Var2 != wuo0.g);
                            z6wVar = (z6w) next5;
                            if (z6wVar != null) {
                                long j117 = z6wVar.f;
                                suo0 suo0Var12 = z6wVar.c;
                                String strQ17 = jpm0.q(ctf0Var, suo0Var12);
                                String strR12 = jpm0.r(ctf0Var, suo0Var12);
                                lsm0 lsm0Var16 = ctf0Var.b;
                                String strA116 = lsm0Var16.a(R.string.daily_task_done, Arrays.copyOf(new Object[0], 0));
                                String strQ18 = knm0.q(ctf0Var, suo0Var12);
                                int i111 = (int) z6wVar.j;
                                huo0Var = z6wVar.b;
                                String strE8 = lgb.e0(huo0Var, ctf0Var);
                                String strF8 = lgb.f0(huo0Var, ctf0Var);
                                xak xakVar12 = pll.b;
                                sba0 sba0Var12 = z6wVar.f43890a;
                                Integer numValueOf12 = Integer.valueOf(sba0Var12.f31923a);
                                xakVar12.getClass();
                                pll pllVarQ12 = xak.q(numValueOf12);
                                if (huo0Var instanceof aet) {
                                    aetVar = (aet) huo0Var;
                                } else {
                                    aetVar = null;
                                }
                                if (aetVar != null) {
                                    j3 = 0;
                                } else {
                                    j3 = 0;
                                }
                                hllVar = new hll(j117, strQ17, strR12, strA116, strQ18, new kll(true, true, i111, strE8, strF8, pllVarQ12, j3), ntb.Q(new Date()), lsm0Var16.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var16.a(R.string.daily_task_button_text_done, Arrays.copyOf(new Object[0], 0)), lsm0Var16.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var16.a(R.string.daily_task_completed, Arrays.copyOf(new Object[0], 0)), iom0.o(sba0Var12, huo0Var, suo0Var12));
                            } else {
                                hllVarM = M(ctf0Var);
                            }
                        }
                        hllVar2 = hllVar;
                        lc00VarB3.add(hllVar2);
                        lc00VarB2 = kotlin.collections.a.b();
                        i6 = i2 + 1;
                        while (i6 < 7) {
                            int i112 = i6 - i2;
                            Calendar calendar112 = Calendar.getInstance();
                            calendar112.add(5, i112);
                            calendar112.set(11, 0);
                            calendar112.set(12, 0);
                            calendar112.set(13, 0);
                            calendar112.set(14, 0);
                            Date date17 = new Date(calendar112.getTimeInMillis());
                            long j118 = i6;
                            lsm0 lsm0Var17 = ctf0Var.b;
                            String strA117 = lsm0Var17.a(R.string.daily_task_not_available, Arrays.copyOf(new Object[0], 0));
                            rdj rdjVar5 = rdj.f30294a;
                            sdj sdjVar5 = sdj.UNIVERSAL;
                            String strA118 = lsm0Var17.a(R.string.daily_task_will_be_available, Arrays.copyOf(new Object[]{rdj.c(rdjVar5, sdjVar5, date17, null, 60)}, 1));
                            Date dateQ11 = ntb.Q(new Date());
                            String strA119 = lsm0Var17.a(i5, Arrays.copyOf(new Object[0], 0));
                            String strA1110 = lsm0Var17.a(i4, Arrays.copyOf(new Object[0], 0));
                            String strC5 = rdj.c(rdjVar5, sdjVar5, date17, null, 60);
                            Calendar calendar113 = Calendar.getInstance();
                            calendar113.add(5, i112);
                            calendar113.set(11, 0);
                            calendar113.set(12, 0);
                            calendar113.set(13, 0);
                            calendar113.set(14, 0);
                            String strValueOf5 = String.valueOf(((calendar113.getTimeInMillis() - System.currentTimeMillis()) / 1000) / j);
                            Calendar calendar114 = Calendar.getInstance();
                            calendar114.add(5, i112);
                            calendar114.set(11, 0);
                            calendar114.set(12, 0);
                            calendar114.set(13, 0);
                            calendar114.set(14, 0);
                            String strA1111 = lsm0Var17.a(R.string.daily_task_until_the_start, Arrays.copyOf(new Object[]{strValueOf5, String.valueOf((((calendar114.getTimeInMillis() - System.currentTimeMillis()) / 1000) % j) / j2)}, 2));
                            sb = new StringBuilder(ujn.h);
                            i7 = 0;
                            if (StringsKt.O("/static/img/android/casino/daily_challenge/tasks/Amount.webp", ujn.h, false)) {
                                sb.setLength(i7);
                                sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                            } else if (kotlin.text.c.x("/static/img/android/casino/daily_challenge/tasks/Amount.webp", "https://", false)) {
                                i7 = 0;
                                sb.setLength(i7);
                                sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                            } else {
                                if (sb.length() > 0) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/tasks/Amount.webp", '/'));
                            }
                            lc00VarB2.add(new hll(j118, null, null, strA117, strA118, nll.f23733a, dateQ11, strA119, strA1110, strC5, strA1111, sb.toString()));
                            i6++;
                            i4 = R.string.daily_task_button_text_participate;
                            i5 = R.string.tournaments_more;
                        }
                        lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB2));
                    }
                    hllVar2 = hllVarM;
                    lc00VarB3.add(hllVar2);
                    lc00VarB2 = kotlin.collections.a.b();
                    i6 = i2 + 1;
                    while (i6 < 7) {
                        int i113 = i6 - i2;
                        Calendar calendar115 = Calendar.getInstance();
                        calendar115.add(5, i113);
                        calendar115.set(11, 0);
                        calendar115.set(12, 0);
                        calendar115.set(13, 0);
                        calendar115.set(14, 0);
                        Date date18 = new Date(calendar115.getTimeInMillis());
                        long j119 = i6;
                        lsm0 lsm0Var18 = ctf0Var.b;
                        String strA1112 = lsm0Var18.a(R.string.daily_task_not_available, Arrays.copyOf(new Object[0], 0));
                        rdj rdjVar6 = rdj.f30294a;
                        sdj sdjVar6 = sdj.UNIVERSAL;
                        String strA1113 = lsm0Var18.a(R.string.daily_task_will_be_available, Arrays.copyOf(new Object[]{rdj.c(rdjVar6, sdjVar6, date18, null, 60)}, 1));
                        Date dateQ12 = ntb.Q(new Date());
                        String strA1114 = lsm0Var18.a(i5, Arrays.copyOf(new Object[0], 0));
                        String strA1115 = lsm0Var18.a(i4, Arrays.copyOf(new Object[0], 0));
                        String strC6 = rdj.c(rdjVar6, sdjVar6, date18, null, 60);
                        Calendar calendar116 = Calendar.getInstance();
                        calendar116.add(5, i113);
                        calendar116.set(11, 0);
                        calendar116.set(12, 0);
                        calendar116.set(13, 0);
                        calendar116.set(14, 0);
                        String strValueOf6 = String.valueOf(((calendar116.getTimeInMillis() - System.currentTimeMillis()) / 1000) / j);
                        Calendar calendar117 = Calendar.getInstance();
                        calendar117.add(5, i113);
                        calendar117.set(11, 0);
                        calendar117.set(12, 0);
                        calendar117.set(13, 0);
                        calendar117.set(14, 0);
                        String strA1116 = lsm0Var18.a(R.string.daily_task_until_the_start, Arrays.copyOf(new Object[]{strValueOf6, String.valueOf((((calendar117.getTimeInMillis() - System.currentTimeMillis()) / 1000) % j) / j2)}, 2));
                        sb = new StringBuilder(ujn.h);
                        i7 = 0;
                        if (StringsKt.O("/static/img/android/casino/daily_challenge/tasks/Amount.webp", ujn.h, false)) {
                            sb.setLength(i7);
                            sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                        } else if (kotlin.text.c.x("/static/img/android/casino/daily_challenge/tasks/Amount.webp", "https://", false)) {
                            i7 = 0;
                            sb.setLength(i7);
                            sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                        } else {
                            if (sb.length() > 0) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/tasks/Amount.webp", '/'));
                        }
                        lc00VarB2.add(new hll(j119, null, null, strA1112, strA1113, nll.f23733a, dateQ12, strA1114, strA1115, strC6, strA1116, sb.toString()));
                        i6++;
                        i4 = R.string.daily_task_button_text_participate;
                        i5 = R.string.tournaments_more;
                    }
                    lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB2));
                }
            } else {
                i = 0;
                switch (Calendar.getInstance().get(7)) {
                    case 2:
                        i2 = 0;
                        break;
                    case 3:
                        i2 = 1;
                        break;
                    case 4:
                        i2 = 2;
                        break;
                    case 5:
                        i2 = 3;
                        break;
                    case 6:
                        i2 = 4;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        i2 = 6;
                        break;
                }
                lc00VarB = kotlin.collections.a.b();
                i3 = 0;
                while (i3 < i2) {
                    Calendar calendar118 = Calendar.getInstance();
                    calendar118.add(i8, (i2 - i3) * (-1));
                    calendar118.set(11, i);
                    calendar118.set(12, i);
                    calendar118.set(13, i);
                    calendar118.set(14, i);
                    lc00 lc00Var4 = lc00VarB;
                    date = new Date(calendar118.getTimeInMillis());
                    it3 = list5.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            list2 = list5;
                            next6 = null;
                            break;
                            break;
                        }
                        next6 = it3.next();
                        z6w z6wVar9 = (z6w) next6;
                        Date date19 = z6wVar9.d;
                        calendar3 = Calendar.getInstance();
                        calendar3.setTime(date19);
                        calendar4 = Calendar.getInstance();
                        calendar4.setTime(date);
                        list2 = list5;
                        if (calendar3.get(1) != calendar4.get(1)) {
                        }
                        list5 = list2;
                    }
                    lc00Var4.add(L((z6w) next6, date, ctf0Var));
                    i3++;
                    lc00VarB = lc00Var4;
                    list5 = list2;
                    i8 = 5;
                    i = 0;
                }
                list = list5;
                lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB));
                n85Var = (n85) CollectionsKt.firstOrNull(list4);
                if (n85Var != null) {
                    wuo0Var = n85Var.g;
                } else {
                    wuo0Var = null;
                }
                if (wuo0Var == wuo0.g) {
                    arrayList = new ArrayList(r3d.q(list4, 10));
                    while (it2.hasNext()) {
                        n85 n85Var11 = (n85) it2.next();
                        arrayList.add(new z6w(n85Var11.h, n85Var11.k, n85Var11.l, new Date(), n85Var11.d, n85Var11.e, n85Var11.f, n85Var11.g, n85Var11.i, n85Var11.j));
                    }
                } else {
                    arrayList = list;
                }
                i4 = R.string.daily_task_button_text_participate;
                i5 = R.string.tournaments_more;
                if (n85Var3 != null) {
                    long j1110 = n85Var3.e;
                    j = 3600;
                    long j1111 = n85Var3.b;
                    suo0 suo0Var13 = n85Var3.l;
                    String strQ19 = jpm0.q(ctf0Var, suo0Var13);
                    String strR13 = jpm0.r(ctf0Var, suo0Var13);
                    sba0 sba0Var13 = n85Var3.h;
                    huo0Var3 = n85Var3.k;
                    String strP7 = knm0.p(ctf0Var, sba0Var13, huo0Var3, suo0Var13);
                    xak xakVar13 = pll.b;
                    j2 = 60;
                    Integer numValueOf13 = Integer.valueOf(sba0Var13.f31923a);
                    xakVar13.getClass();
                    pll pllVarQ13 = xak.q(numValueOf13);
                    if (huo0Var3 instanceof aet) {
                        aetVar3 = (aet) huo0Var3;
                    } else {
                        aetVar3 = null;
                    }
                    if (aetVar3 != null) {
                        j5 = 0;
                    } else {
                        j5 = 0;
                    }
                    kll kllVar7 = new kll(false, false, 0, "", "", pllVarQ13, j5);
                    Date dateQ13 = ntb.Q(new Date());
                    lsm0 lsm0Var19 = ctf0Var.b;
                    hllVarM = new hll(j1110, strQ19, strR13, null, strP7, kllVar7, dateQ13, lsm0Var19.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var19.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0)), lsm0Var19.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var19.a(R.string.daily_task_until_the_end, Arrays.copyOf(new Object[]{String.valueOf(j1111 / 3600), String.valueOf((j1111 % 3600) / 60)}, 2)), iom0.o(sba0Var13, huo0Var3, suo0Var13));
                } else {
                    j = 3600;
                    j2 = 60;
                    if (n85Var5 != null) {
                        long j1112 = n85Var5.e;
                        long j1113 = n85Var5.b;
                        suo0 suo0Var14 = n85Var5.l;
                        String strQ110 = jpm0.q(ctf0Var, suo0Var14);
                        String strR14 = jpm0.r(ctf0Var, suo0Var14);
                        sba0 sba0Var14 = n85Var5.h;
                        huo0Var2 = n85Var5.k;
                        String strP8 = knm0.p(ctf0Var, sba0Var14, huo0Var2, suo0Var14);
                        int i114 = (int) n85Var5.j;
                        String strE9 = lgb.e0(huo0Var2, ctf0Var);
                        String strF9 = lgb.f0(huo0Var2, ctf0Var);
                        xak xakVar14 = pll.b;
                        Integer numValueOf14 = Integer.valueOf(sba0Var14.f31923a);
                        xakVar14.getClass();
                        pll pllVarQ14 = xak.q(numValueOf14);
                        if (huo0Var2 instanceof aet) {
                            aetVar2 = (aet) huo0Var2;
                        } else {
                            aetVar2 = null;
                        }
                        if (aetVar2 != null) {
                            j4 = 0;
                        } else {
                            j4 = 0;
                        }
                        kll kllVar8 = new kll(false, true, i114, strE9, strF9, pllVarQ14, j4);
                        Date dateQ14 = ntb.Q(new Date());
                        lsm0 lsm0Var110 = ctf0Var.b;
                        hllVar = new hll(j1112, strQ110, strR14, null, strP8, kllVar8, dateQ14, lsm0Var110.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var110.a(R.string.daily_task_button_text_open_games, Arrays.copyOf(new Object[0], 0)), lsm0Var110.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var110.a(R.string.daily_task_until_the_end, Arrays.copyOf(new Object[]{String.valueOf(j1113 / 3600), String.valueOf((j1113 % 3600) / 60)}, 2)), iom0.o(sba0Var14, huo0Var2, suo0Var14));
                    } else {
                        it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                                next5 = it.next();
                                z6w z6wVar10 = (z6w) next5;
                                Date date110 = z6wVar10.d;
                                wuo0Var2 = z6wVar10.h;
                                Date date111 = new Date();
                                calendar = Calendar.getInstance();
                                calendar.setTime(date110);
                                calendar2 = Calendar.getInstance();
                                calendar2.setTime(date111);
                                if (calendar.get(1) == calendar2.get(1)) {
                                }
                            } else {
                                next5 = null;
                            }
                            z6wVar = (z6w) next5;
                            if (z6wVar != null) {
                                long j1114 = z6wVar.f;
                                suo0 suo0Var15 = z6wVar.c;
                                String strQ111 = jpm0.q(ctf0Var, suo0Var15);
                                String strR15 = jpm0.r(ctf0Var, suo0Var15);
                                lsm0 lsm0Var111 = ctf0Var.b;
                                String strA1117 = lsm0Var111.a(R.string.daily_task_done, Arrays.copyOf(new Object[0], 0));
                                String strQ112 = knm0.q(ctf0Var, suo0Var15);
                                int i115 = (int) z6wVar.j;
                                huo0Var = z6wVar.b;
                                String strE10 = lgb.e0(huo0Var, ctf0Var);
                                String strF10 = lgb.f0(huo0Var, ctf0Var);
                                xak xakVar15 = pll.b;
                                sba0 sba0Var15 = z6wVar.f43890a;
                                Integer numValueOf15 = Integer.valueOf(sba0Var15.f31923a);
                                xakVar15.getClass();
                                pll pllVarQ15 = xak.q(numValueOf15);
                                if (huo0Var instanceof aet) {
                                    aetVar = (aet) huo0Var;
                                } else {
                                    aetVar = null;
                                }
                                if (aetVar != null) {
                                    j3 = 0;
                                } else {
                                    j3 = 0;
                                }
                                hllVar = new hll(j1114, strQ111, strR15, strA1117, strQ112, new kll(true, true, i115, strE10, strF10, pllVarQ15, j3), ntb.Q(new Date()), lsm0Var111.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var111.a(R.string.daily_task_button_text_done, Arrays.copyOf(new Object[0], 0)), lsm0Var111.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var111.a(R.string.daily_task_completed, Arrays.copyOf(new Object[0], 0)), iom0.o(sba0Var15, huo0Var, suo0Var15));
                            } else {
                                hllVarM = M(ctf0Var);
                            }
                        } while (wuo0Var2 != wuo0.g);
                        z6wVar = (z6w) next5;
                        if (z6wVar != null) {
                            long j1115 = z6wVar.f;
                            suo0 suo0Var16 = z6wVar.c;
                            String strQ113 = jpm0.q(ctf0Var, suo0Var16);
                            String strR16 = jpm0.r(ctf0Var, suo0Var16);
                            lsm0 lsm0Var112 = ctf0Var.b;
                            String strA1118 = lsm0Var112.a(R.string.daily_task_done, Arrays.copyOf(new Object[0], 0));
                            String strQ114 = knm0.q(ctf0Var, suo0Var16);
                            int i116 = (int) z6wVar.j;
                            huo0Var = z6wVar.b;
                            String strE11 = lgb.e0(huo0Var, ctf0Var);
                            String strF11 = lgb.f0(huo0Var, ctf0Var);
                            xak xakVar16 = pll.b;
                            sba0 sba0Var16 = z6wVar.f43890a;
                            Integer numValueOf16 = Integer.valueOf(sba0Var16.f31923a);
                            xakVar16.getClass();
                            pll pllVarQ16 = xak.q(numValueOf16);
                            if (huo0Var instanceof aet) {
                                aetVar = (aet) huo0Var;
                            } else {
                                aetVar = null;
                            }
                            if (aetVar != null) {
                                j3 = 0;
                            } else {
                                j3 = 0;
                            }
                            hllVar = new hll(j1115, strQ113, strR16, strA1118, strQ114, new kll(true, true, i116, strE11, strF11, pllVarQ16, j3), ntb.Q(new Date()), lsm0Var112.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0)), lsm0Var112.a(R.string.daily_task_button_text_done, Arrays.copyOf(new Object[0], 0)), lsm0Var112.a(R.string.today, Arrays.copyOf(new Object[0], 0)), lsm0Var112.a(R.string.daily_task_completed, Arrays.copyOf(new Object[0], 0)), iom0.o(sba0Var16, huo0Var, suo0Var16));
                        } else {
                            hllVarM = M(ctf0Var);
                        }
                    }
                    hllVar2 = hllVar;
                    lc00VarB3.add(hllVar2);
                    lc00VarB2 = kotlin.collections.a.b();
                    i6 = i2 + 1;
                    while (i6 < 7) {
                        int i117 = i6 - i2;
                        Calendar calendar119 = Calendar.getInstance();
                        calendar119.add(5, i117);
                        calendar119.set(11, 0);
                        calendar119.set(12, 0);
                        calendar119.set(13, 0);
                        calendar119.set(14, 0);
                        Date date112 = new Date(calendar119.getTimeInMillis());
                        long j1116 = i6;
                        lsm0 lsm0Var113 = ctf0Var.b;
                        String strA1119 = lsm0Var113.a(R.string.daily_task_not_available, Arrays.copyOf(new Object[0], 0));
                        rdj rdjVar7 = rdj.f30294a;
                        sdj sdjVar7 = sdj.UNIVERSAL;
                        String strA11110 = lsm0Var113.a(R.string.daily_task_will_be_available, Arrays.copyOf(new Object[]{rdj.c(rdjVar7, sdjVar7, date112, null, 60)}, 1));
                        Date dateQ15 = ntb.Q(new Date());
                        String strA11111 = lsm0Var113.a(i5, Arrays.copyOf(new Object[0], 0));
                        String strA11112 = lsm0Var113.a(i4, Arrays.copyOf(new Object[0], 0));
                        String strC7 = rdj.c(rdjVar7, sdjVar7, date112, null, 60);
                        Calendar calendar1110 = Calendar.getInstance();
                        calendar1110.add(5, i117);
                        calendar1110.set(11, 0);
                        calendar1110.set(12, 0);
                        calendar1110.set(13, 0);
                        calendar1110.set(14, 0);
                        String strValueOf7 = String.valueOf(((calendar1110.getTimeInMillis() - System.currentTimeMillis()) / 1000) / j);
                        Calendar calendar1111 = Calendar.getInstance();
                        calendar1111.add(5, i117);
                        calendar1111.set(11, 0);
                        calendar1111.set(12, 0);
                        calendar1111.set(13, 0);
                        calendar1111.set(14, 0);
                        String strA11113 = lsm0Var113.a(R.string.daily_task_until_the_start, Arrays.copyOf(new Object[]{strValueOf7, String.valueOf((((calendar1111.getTimeInMillis() - System.currentTimeMillis()) / 1000) % j) / j2)}, 2));
                        sb = new StringBuilder(ujn.h);
                        i7 = 0;
                        if (StringsKt.O("/static/img/android/casino/daily_challenge/tasks/Amount.webp", ujn.h, false)) {
                            sb.setLength(i7);
                            sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                        } else if (kotlin.text.c.x("/static/img/android/casino/daily_challenge/tasks/Amount.webp", "https://", false)) {
                            i7 = 0;
                            sb.setLength(i7);
                            sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                        } else {
                            if (sb.length() > 0) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/tasks/Amount.webp", '/'));
                        }
                        lc00VarB2.add(new hll(j1116, null, null, strA1119, strA11110, nll.f23733a, dateQ15, strA11111, strA11112, strC7, strA11113, sb.toString()));
                        i6++;
                        i4 = R.string.daily_task_button_text_participate;
                        i5 = R.string.tournaments_more;
                    }
                    lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB2));
                }
                hllVar2 = hllVarM;
                lc00VarB3.add(hllVar2);
                lc00VarB2 = kotlin.collections.a.b();
                i6 = i2 + 1;
                while (i6 < 7) {
                    int i118 = i6 - i2;
                    Calendar calendar1112 = Calendar.getInstance();
                    calendar1112.add(5, i118);
                    calendar1112.set(11, 0);
                    calendar1112.set(12, 0);
                    calendar1112.set(13, 0);
                    calendar1112.set(14, 0);
                    Date date113 = new Date(calendar1112.getTimeInMillis());
                    long j1117 = i6;
                    lsm0 lsm0Var114 = ctf0Var.b;
                    String strA11114 = lsm0Var114.a(R.string.daily_task_not_available, Arrays.copyOf(new Object[0], 0));
                    rdj rdjVar8 = rdj.f30294a;
                    sdj sdjVar8 = sdj.UNIVERSAL;
                    String strA11115 = lsm0Var114.a(R.string.daily_task_will_be_available, Arrays.copyOf(new Object[]{rdj.c(rdjVar8, sdjVar8, date113, null, 60)}, 1));
                    Date dateQ16 = ntb.Q(new Date());
                    String strA11116 = lsm0Var114.a(i5, Arrays.copyOf(new Object[0], 0));
                    String strA11117 = lsm0Var114.a(i4, Arrays.copyOf(new Object[0], 0));
                    String strC8 = rdj.c(rdjVar8, sdjVar8, date113, null, 60);
                    Calendar calendar1113 = Calendar.getInstance();
                    calendar1113.add(5, i118);
                    calendar1113.set(11, 0);
                    calendar1113.set(12, 0);
                    calendar1113.set(13, 0);
                    calendar1113.set(14, 0);
                    String strValueOf8 = String.valueOf(((calendar1113.getTimeInMillis() - System.currentTimeMillis()) / 1000) / j);
                    Calendar calendar1114 = Calendar.getInstance();
                    calendar1114.add(5, i118);
                    calendar1114.set(11, 0);
                    calendar1114.set(12, 0);
                    calendar1114.set(13, 0);
                    calendar1114.set(14, 0);
                    String strA11118 = lsm0Var114.a(R.string.daily_task_until_the_start, Arrays.copyOf(new Object[]{strValueOf8, String.valueOf((((calendar1114.getTimeInMillis() - System.currentTimeMillis()) / 1000) % j) / j2)}, 2));
                    sb = new StringBuilder(ujn.h);
                    i7 = 0;
                    if (StringsKt.O("/static/img/android/casino/daily_challenge/tasks/Amount.webp", ujn.h, false)) {
                        sb.setLength(i7);
                        sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                    } else if (kotlin.text.c.x("/static/img/android/casino/daily_challenge/tasks/Amount.webp", "https://", false)) {
                        i7 = 0;
                        sb.setLength(i7);
                        sb.append("/static/img/android/casino/daily_challenge/tasks/Amount.webp");
                    } else {
                        if (sb.length() > 0) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/tasks/Amount.webp", '/'));
                    }
                    lc00VarB2.add(new hll(j1117, null, null, strA11114, strA11115, nll.f23733a, dateQ16, strA11116, strA11117, strC8, strA11118, sb.toString()));
                    i6++;
                    i4 = R.string.daily_task_button_text_participate;
                    i5 = R.string.tournaments_more;
                }
                lc00VarB3.addAll(kotlin.collections.a.a(lc00VarB2));
            }
        } else {
            lc00VarB3.add(M(ctf0Var));
        }
        return kotlin.collections.a.a(lc00VarB3);
    }

    public static final void k(ijl ijlVar, jjl jjlVar, gjl gjlVar, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i, int i2) {
        int i3;
        jjl jjlVar2;
        Function0 function3;
        Function0 function4;
        Function0 function5;
        gjl gjlVar2;
        gjl gjlVar3;
        ijlVar.getClass();
        jjlVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1960833419);
        if ((i & 6) == 0) {
            i3 = (fetVar.e(ijlVar.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            jjlVar2 = jjlVar;
            i3 |= fetVar.g(jjlVar2) ? 32 : 16;
        } else {
            jjlVar2 = jjlVar;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= fetVar.e(gjlVar == null ? -1 : gjlVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function3 = function0;
            i3 |= fetVar.i(function3) ? 2048 : 1024;
        } else {
            function3 = function0;
        }
        if ((i & 24576) == 0) {
            function4 = function1;
            i3 |= fetVar.i(function4) ? 16384 : 8192;
        } else {
            function4 = function1;
        }
        if ((196608 & i) == 0) {
            function5 = function2;
            i3 |= fetVar.i(function5) ? 131072 : 65536;
        } else {
            function5 = function2;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            gjl gjlVar4 = i4 != 0 ? gjl.f11403a : gjlVar;
            int iOrdinal = ijlVar.ordinal();
            if (iOrdinal == 0) {
                gjlVar3 = gjlVar4;
                fetVar.e0(-1129716670);
                q5x.s(jjlVar, gjlVar3, function0, function1, function2, fetVar, (i3 >> 3) & 65534);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                gjlVar3 = gjlVar4;
                fetVar.e0(-1129708060);
                n7x.m(jjlVar, gjlVar3, function0, function1, function2, fetVar, (i3 >> 3) & 65534);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                gjlVar3 = gjlVar4;
                fetVar.e0(-1129699421);
                xsm0.g(jjlVar, gjlVar3, function0, function1, function2, fetVar, (i3 >> 3) & 65534);
                fetVar.r(false);
            } else if (iOrdinal == 3) {
                gjlVar3 = gjlVar4;
                fetVar.e0(-1129690747);
                xdx.m(jjlVar, gjlVar3, function0, function1, function2, fetVar, (i3 >> 3) & 65534);
                fetVar.r(false);
            } else {
                if (iOrdinal != 4) {
                    throw b1j.f(-1129716636, fetVar, false);
                }
                fetVar.e0(-1129682077);
                gjlVar3 = gjlVar4;
                vdb.F(jjlVar2, gjlVar3, function3, function4, function5, fetVar, (i3 >> 3) & 65534);
                fetVar.r(false);
            }
            gjlVar2 = gjlVar3;
        } else {
            fetVar.X();
            gjlVar2 = gjlVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hjl(ijlVar, jjlVar, gjlVar2, function0, function1, function2, i, i2, (byte) 0);
        }
    }

    public static final void l(mm40 mm40Var, py1 py1Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        Function0 function3;
        Function0 function4;
        py1Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(1448182012);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(py1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function3 = function1;
            i2 |= fetVar.i(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i & 24576) == 0) {
            function4 = function2;
            i2 |= fetVar.i(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 320.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            int i3 = i2 >> 3;
            b(py1Var, fetVar, i3 & 14);
            c(py1Var, function0, function3, function4, fetVar, i3 & 8190);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bsl(mm40Var, py1Var, function0, function1, function2, i, (byte) 0);
        }
    }

    public static final void m(mm40 mm40Var, final a4x a4xVar, xcz xczVar, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function1 function5, fet fetVar, final int i, final int i2) {
        mm40 mm40Var2;
        int i3;
        xcz xczVarA;
        Function1 function6;
        Function1 function7;
        Function1 function8;
        final mm40 mm40Var3;
        final xcz xczVar2;
        mm40 mm40Var4;
        boolean z;
        a4xVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        fetVar.g0(-1411570700);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                xczVarA = xczVar;
                int i5 = fetVar.g(xczVarA) ? 256 : 128;
                i3 |= i5;
            } else {
                xczVarA = xczVar;
            }
            i3 |= i5;
        } else {
            xczVarA = xczVar;
        }
        if ((i & 3072) == 0) {
            function6 = function1;
            i3 |= fetVar.i(function6) ? 2048 : 1024;
        } else {
            function6 = function1;
        }
        if ((i & 24576) == 0) {
            function7 = function2;
            i3 |= fetVar.i(function7) ? 16384 : 8192;
        } else {
            function7 = function2;
        }
        if ((196608 & i) == 0) {
            function8 = function3;
            i3 |= fetVar.i(function8) ? 131072 : 65536;
        } else {
            function8 = function3;
        }
        if ((1572864 & i) == 0) {
            i3 |= fetVar.i(function4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= fetVar.i(function5) ? 8388608 : 4194304;
        }
        if (fetVar.U(i3 & 1, (i3 & 4793491) != 4793490)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                mm40Var4 = i4 != 0 ? jm40.b : mm40Var2;
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                }
            } else {
                fetVar.X();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                mm40Var4 = mm40Var2;
            }
            fetVar.s();
            if (!a4xVar.isEmpty()) {
                Iterator<E> it = a4xVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (!(((a3m) it.next()) instanceof z2m)) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            mm40 mm40VarE0 = o2e.e0(mm40Var4, "LAZY_ROW_CYBER_BANNER_COLLECTION");
            boolean z2 = !z;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarT = s5x0.t(qmk.a(fetVar).c, 0.0f, 2);
            mm40 mm40Var5 = mm40Var4;
            xcz xczVar3 = xczVarA;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                bg0 bg0Var = new bg0(a4xVar, function6, function7, function8, function4, function5);
                fetVar.o0(bg0Var);
                objP = bg0Var;
            }
            b8k0.f(mm40VarE0, xczVar3, lh80VarT, false, qw3Var, null, null, z2, null, (Function1) objP, fetVar, (i3 >> 3) & 112, 360);
            xczVar2 = xczVar3;
            mm40Var3 = mm40Var5;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            xczVar2 = xczVarA;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.u2m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    feb.m(mm40Var3, a4xVar, xczVar2, function1, function2, function3, function4, function5, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void n(egm egmVar, fet fetVar) {
        jm40 jm40Var = jm40.b;
        if (egmVar != null) {
            String str = egmVar.f7771a;
            if (str.length() != 0) {
                if (str.equals("0") || str.equals("00")) {
                    fetVar.e0(199526063);
                    E(0, egmVar.b, fetVar, jm40Var, egmVar.f7771a);
                    fetVar.r(false);
                    return;
                } else {
                    fetVar.e0(199731407);
                    E(0, egmVar.b, fetVar, jm40Var, egmVar.f7771a);
                    fetVar.r(false);
                    return;
                }
            }
        }
        fetVar.e0(199389167);
        r(0, fetVar, jm40Var);
        fetVar.r(false);
    }

    public static final void o(mm40 mm40Var, n4i n4iVar, fet fetVar, int i) {
        String str = n4iVar.f;
        String str2 = n4iVar.e;
        fetVar.g0(-1586213637);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(n4iVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 54.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            double d = 0.0d;
            if (0.5f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true);
            r3i r3iVar = n4iVar.f22899a;
            q3i q3iVar = n4iVar.c;
            B(x7zVar, r3iVar, fetVar, 0);
            boolean zG = fetVar.g(q3iVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                boolean z2 = q3iVar instanceof o3i;
                opm opmVar = opm.f25648a;
                if (z2) {
                    o3i o3iVar = (o3i) q3iVar;
                    objP = new kpm(opmVar, new hpm(0L, 3), d5c.O(o3iVar.f24586a, o3iVar.b, false, false, new hpm(0L, 3)));
                } else {
                    if (!q3iVar.equals(p3i.f26301a)) {
                        t9f.b();
                        return;
                    }
                    objP = new lpm(opmVar, new hpm(0L, 3));
                }
                fetVar.o0(objP);
            } else {
                d = 0.0d;
            }
            n4c.l(s5x0.L(jm40Var, 8.0f, 0.0f, 2), (mpm) objP, true, fetVar, 0);
            if (0.5f <= d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            C(new x7z(0.5f > r7 ? Float.MAX_VALUE : 0.5f, true), n4iVar.b, fetVar, 0);
            fetVar.r(true);
            if (str2.length() <= 0 && str.length() <= 0 && n4iVar.d.length() <= 0) {
                fetVar.e0(1982134065);
                fetVar.r(false);
            } else {
                fetVar.e0(1981946670);
                sj3.p(0, 1, fetVar, null, n4iVar.d, str2, str);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, n4iVar, i, (byte) 23);
        }
    }

    public static final void p(mm40 mm40Var, bym bymVar, fet fetVar, int i) {
        fet fetVar2;
        String str = bymVar.e;
        String str2 = bymVar.d;
        fetVar.g0(-1143428967);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(bymVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            A(0, fetVar, null, bymVar.b, bymVar.f3426a);
            if (str2.length() <= 0 && str.length() <= 0 && bymVar.c.length() <= 0) {
                fetVar2 = fetVar;
                fetVar2.e0(-1635666221);
                fetVar2.r(false);
            } else {
                fetVar.e0(-1635893978);
                fetVar2 = fetVar;
                sj3.p(6, 0, fetVar2, jm40.b, bymVar.c, str2, str);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, bymVar, i, (byte) 17);
        }
    }

    public static final void q(mm40 mm40Var, eol0 eol0Var, fet fetVar, int i) {
        eol0Var.getClass();
        fetVar.g0(-313330571);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(eol0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.d(mm40Var, 1.0f), eol0Var.a()), vgg0.a(eol0Var.b())), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 10, i, mm40Var, eol0Var);
        }
    }

    public static final void r(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(583682421);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.S(o7k0.n(mm40Var, 28.0f), 1.0f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator(), vgg0.a(10.0f)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 11);
        }
    }

    public static final void s(p8o0 p8o0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1919976229);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(p8o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.rotate);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = twn.s(fetVar);
            }
            Object obj2 = (List) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = twn.s(fetVar);
            }
            Object obj3 = (List) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = p6o.f26465a;
                fetVar.o0(objP3);
            }
            xdr xdrVar = (xdr) ((jhy) objP3);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4) | fetVar.i(obj3) | fetVar.i(obj2) | fetVar.i(objLoadAnimation);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj) {
                Object dgVar = new dg(context, p8o0Var, obj3, obj2, objLoadAnimation, (byte) 18);
                fetVar.o0(dgVar);
                objP4 = dgVar;
            }
            y860.f(xdrVar, null, (Function1) objP4, fetVar, 6, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(p8o0Var, i, b);
        }
    }

    public static final void t(mm40 mm40Var, mmo mmoVar, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        pz40 pz40Var;
        int i4;
        t33 t33Var;
        int i5;
        fet fetVar2 = fetVar;
        mmoVar.getClass();
        function1.getClass();
        fetVar2.g0(-1032309404);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(mmoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            if (i6 != 0) {
                mm40Var2 = jm40Var;
            }
            boolean z = mmoVar.c;
            l7m0 l7m0VarB = d43.b(z ? 180.0f : 0.0f, ro4.m0(Response.OK, 0, null, 6), null, null, fetVar2, 48, 28);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = xf0.c(1.0f);
                fetVar2.o0(objP);
            }
            t33 t33Var2 = (t33) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(z ? mmoVar.b : mmoVar.f22049a);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.valueOf(z));
                fetVar2.o0(objP3);
            }
            pz40 pz40Var3 = (pz40) objP3;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i7 = i3 & 112;
            boolean zI = (i7 == 32) | fetVar2.i(t33Var2);
            Object objP4 = fetVar2.P();
            if (zI || objP4 == cl5Var) {
                pz40Var = pz40Var2;
                i4 = 256;
                t33Var = t33Var2;
                i5 = i7;
                xb2 xb2Var = new xb2(mmoVar, t33Var, pz40Var3, pz40Var, null, (byte) 17);
                fetVar2.o0(xb2Var);
                objP4 = xb2Var;
            } else {
                i5 = i7;
                i4 = 256;
                pz40Var = pz40Var2;
                t33Var = t33Var2;
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP4);
            mm40 mm40VarY = o7k0.y(mm40Var2, null, 3);
            zfn zfnVar = m8m0.f21378a;
            long jM125getWhite100d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m125getWhite100d7_KjU();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarY, jM125getWhite100d7_KjU, vgg0.a(10.0f));
            boolean z2 = (i5 == 32) | ((i3 & 896) == i4);
            Object objP5 = fetVar2.P();
            if (z2 || objP5 == cl5Var) {
                objP5 = new gmo(function1, mmoVar, (byte) 0);
                fetVar2.o0(objP5);
            }
            mm40 mm40VarK = s5x0.K(y860.W(mm40VarQ, null, null, false, null, (Function0) objP5, 28), 16.0f, 4.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            m78 m78Var = new m78(StaticColors.INSTANCE.m123getWhite0d7_KjU(), 5);
            mm40 mm40VarN = o7k0.n(jm40Var, 12.0f);
            boolean zG = fetVar2.g(l7m0VarB);
            Object objP6 = fetVar2.P();
            if (zG || objP6 == cl5Var) {
                objP6 = new x1d(l7m0VarB, (byte) 27);
                fetVar2.o0(objP6);
            }
            mm40Var3 = mm40Var2;
            k7x.a(Integer.valueOf(R.drawable.ic_glyph_chevron_down_small), null, i4w0.T(mm40VarN, (Function1) objP6), null, m78Var, fetVar2, 48, 1784);
            boolean zI2 = fetVar2.i(t33Var);
            Object objP7 = fetVar2.P();
            if (zI2 || objP7 == cl5Var) {
                objP7 = new m53(t33Var, (byte) 15);
                fetVar2.o0(objP7);
            }
            mm40 mm40VarT = i4w0.T(jm40Var, (Function1) objP7);
            String upperCase = ((String) pz40Var.getValue()).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            v8q0.a(upperCase, mm40VarT, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.o, null, j1t0.f15753a, 0L, null, 0, 0, qmk.B, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) mmoVar, (Object) function1, i, i2, (byte) 26);
        }
    }

    public static final void u(dhh dhhVar, fet fetVar, int i) {
        fetVar.g0(-1625869871);
        int i2 = (fetVar.g(dhhVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            if (dhhVar.e) {
                fetVar.e0(-1169872151);
                zcl zclVar = qmk.f28987a;
                jeb.q(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), dhhVar.f, null, fetVar, 0, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(-1169720313);
                fetVar.r(false);
            }
            if (dhhVar.g) {
                fetVar.e0(-1169646781);
                zcl zclVar2 = qmk.f28987a;
                ibc.m(s5x0.N(jm40Var, 12.0f, 8.0f, 12.0f, 0.0f, 8), dhhVar.h, new p9m(afn0.m(fetVar).getBackground(), afn0.m(fetVar).getSeparator60(), afn0.m(fetVar).getTextPrimary(), afn0.m(fetVar).getSecondary60(), q3d.j(new y3d(afn0.m(fetVar).getBackground()), new y3d(afn0.m(fetVar).getBackground0())), q3d.j(new y3d(afn0.m(fetVar).getBackground0()), new y3d(afn0.m(fetVar).getBackground()))), fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-1168689625);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yfg(dhhVar, i, (byte) 3);
        }
    }

    public static final void v(dhh dhhVar, pz40 pz40Var, fet fetVar, int i) {
        int i2;
        int i3;
        fet fetVar2;
        cl5 cl5Var;
        fet fetVar3 = fetVar;
        fetVar3.g0(-313644154);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(dhhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(pz40Var) ? 32 : 16;
        }
        if (fetVar3.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar3.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z || objP == cl5Var2) {
                objP = new xx(pz40Var, (byte) 27);
                fetVar3.o0(objP);
            }
            mm40 mm40VarO = O(mm40VarD, (Function0) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarO, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarN);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            D(dhhVar.f6090a, fetVar3, 0);
            z(0, fetVar3, dw9.h(1.0f, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), dhhVar.b, dhhVar.c);
            if (dhhVar.d.length() > 0) {
                fetVar3.e0(-470250796);
                cl5Var = cl5Var2;
                i3 = i4;
                j6n.h(dhhVar.d, xoo0.f41232a, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 0, 0, fetVar, 48, 24);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                i3 = i4;
                fetVar2 = fetVar3;
                cl5Var = cl5Var2;
                fetVar2.e0(-470044832);
                fetVar2.r(false);
            }
            if (dhhVar.g || dhhVar.e) {
                fetVar2.e0(-469954219);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                zb zbVar = new zb(null, null, 7);
                boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
                boolean z2 = i3 == 32;
                Object objP2 = fetVar2.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new xx(pz40Var, (byte) 28);
                    fetVar2.o0(objP2);
                }
                Function0 function0 = (Function0) objP2;
                fetVar3 = fetVar2;
                acb.n(zbVar, zBooleanValue, function0, mm40VarN2, fetVar3, 0, 0);
                fetVar3.r(false);
            } else {
                fetVar2.e0(-469678567);
                qxw.o(fetVar2, o7k0.s(jm40Var, 12.0f));
                fetVar2.r(false);
                fetVar3 = fetVar2;
            }
            fetVar3.r(true);
        } else {
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(dhhVar, pz40Var, i, (byte) 15);
        }
    }

    public static final void w(liq liqVar, fet fetVar, int i) {
        int i2;
        liqVar.getClass();
        fetVar.g0(2089590574);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(liqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "FIXED_GRAPH_BLOCK_TEST_TAG");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            G(o2e.e0(jm40Var, "FIXED_GRAPH_TOP_TEAM_TEST_TAG"), liqVar.c, fetVar, 6);
            zcl zclVar = qmk.f28987a;
            ahy.t(s5x0.L(jm40Var, 0.0f, 4.0f, 1), liqVar, fetVar, (i2 << 3) & 112);
            G(o2e.e0(jm40Var, "FIXED_GRAPH_BOTTOM_TEAM_TEST_TAG"), liqVar.d, fetVar, 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new giq(liqVar, i, b);
        }
    }

    public static final void x(mm40 mm40Var, float f, djv djvVar, fet fetVar, int i) {
        float f2;
        mm40 mm40Var2;
        fetVar.g0(699957777);
        int i2 = i | 6 | (fetVar.g(djvVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            f2 = f;
            mm40 mm40VarW = o7k0.w(o7k0.s(jm40Var, f2), null, false, 3);
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarW, jM75getBlack600d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), "GUILTY_GEAR_STATISTIC_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            jcb.u(null, djvVar.b, gqw0.f11754a, fetVar, 384);
            ieb.y(s5x0.N(new x7z(1.0f, true), 0.0f, 12.0f, 0.0f, 0.0f, 13), djvVar, fetVar, (i2 >> 3) & 112);
            jcb.u(null, djvVar.c, gqw0.c, fetVar, 384);
            fetVar.r(true);
            rcb.M(djvVar.e, fetVar, 0);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            f2 = f;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zv((Object) mm40Var2, f2, (Object) djvVar, i, (byte) 9);
        }
    }

    public static final void y(tvw tvwVar, float f, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1945956193);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(tvwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zEquals = tvwVar.equals(qvw.f29409a);
            jm40 jm40Var = jm40.b;
            if (zEquals) {
                fetVar.e0(1487770623);
                j0x.b(a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar), null, o7k0.n(jm40Var, f), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 56, 56);
                fetVar.r(false);
            } else if (tvwVar instanceof rvw) {
                fetVar.e0(1488121512);
                lgb.s(o7k0.n(jm40Var, f), ((rvw) tvwVar).f31190a, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar);
                fetVar.r(false);
            } else {
                if (!(tvwVar instanceof svw)) {
                    throw b1j.f(-1753124189, fetVar, false);
                }
                fetVar.e0(1488462543);
                j0x.b(a8k0.F(((svw) tvwVar).f32891a, 0, fetVar), null, o7k0.n(jm40Var, f), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 56, 56);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i7m(tvwVar, f, i);
        }
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1853690786);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            y9q0 y9q0VarL = g1t0.l();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0VarL, fetVar2, (i2 >> 3) & 14, 24960, 109562);
            fetVar2 = fetVar2;
            if (str2.length() > 0) {
                fetVar2.e0(-221168913);
                v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, (i2 >> 6) & 14, 24960, 109562);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-220887030);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i, (byte) 16);
        }
    }

    public abstract InputFilter[] T(InputFilter[] inputFilterArr);

    public abstract boolean d0();

    public abstract void f0(boolean z);

    public abstract void g0(boolean z);

    public abstract TransformationMethod k0(TransformationMethod transformationMethod);
}
