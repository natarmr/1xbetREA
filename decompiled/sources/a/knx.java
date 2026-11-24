package a;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Shader;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class knx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f18606a = new ugd(-1805147783, false, new ahd(0));
    public static final ugd b = new ugd(-281853299, false, new i5b(22));
    public static final ugd c = new ugd(528272483, false, new i5b(23));
    public static final ugd d = new ugd(-545306673, false, new bhd(24));
    public static final ugd e = new ugd(1377086172, false, new jhd(19));
    public static final ugd f = new ugd(1082282634, false, new ohd(13));
    public static final khq g = new khq((byte) 1);
    public static final th50 h = new th50(3);

    public static final void A(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(491153244);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 138.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 13);
        }
    }

    public static final void B(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(798962841);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, 12.0f, 4.0f, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC0, shdVar4, 1.0f, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVarI);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), 120.0f), 14.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(jm40Var, 64.0f), 12.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 60.0f), 16.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 14);
        }
    }

    public static final void C(int i, fet fetVar) {
        fetVar.g0(1822490407);
        if (fetVar.U(i & 1, i != 0)) {
            mm40 mm40VarE = k7n0.H(jm40.b, 2.0f).e(o7k0.c);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
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
            kpb.j(null, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b4u0(i, (byte) 28);
        }
    }

    public static final void D(l5h l5hVar, fet fetVar, int i) {
        byte b2;
        l5h l5hVar2 = l5hVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(2128571962);
        int i2 = i | (fetVar2.g(l5hVar2) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, 8.0f, 12.0f);
            xx7 xx7Var = gqw0.n;
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            String str = l5hVar2.c;
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
            f2q0 f2q0Var = new f2q0(3);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, mm40VarN, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 109560);
            String str2 = l5hVar2.d;
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            f2q0 f2q0Var2 = new f2q0(3);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, mm40VarN2, jM130getWhite600d7_KjU, null, 0L, null, null, null, 0L, f2q0Var2, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            gne gneVar = new gne(xx7Var, (byte) 12);
            b2 = 1;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, gneVar), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
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
            l5hVar2 = l5hVar;
            L(l5hVar2.e, l5hVar2.f, l5hVar2.g, fetVar, 0);
            fetVar2 = fetVar;
            L(l5hVar2.h, l5hVar2.i, l5hVar2.j, fetVar2, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5h(l5hVar2, i, b2);
        }
    }

    public static final void E(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(352124499);
        byte b2 = 16;
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            f9m0 f9m0VarC = ((rla0) l7m0Var.getValue()).c();
            zdm0 zdm0Var = ((rla0) l7m0Var.getValue()).b().f41023a;
            j9m0 j9m0Var = ((rla0) l7m0Var.getValue()).b().b;
            boolean zA = ((rla0) l7m0Var.getValue()).a();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new i0a0(function1, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new hs80(function1, (byte) 24);
                fetVar.o0(objP2);
            }
            ffb0.D(null, f9m0VarC, zdm0Var, j9m0Var, zA, function0, (Function1) objP2, null, u1c.M(551384417, new dqz(l7m0Var, function1, (byte) 8), fetVar), fetVar, 100663296, 129);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i, b2);
        }
    }

    public static final void F(hg1 hg1Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(775703983);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(hg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(jm40.b, "AGGREGATOR_PROMO_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 28.0f, 5), fetVar);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new df1(hg1Var, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, null, ch80VarG, qw3Var, null, null, false, null, (Function1) objP, fetVar, 6, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) hg1Var, (Object) function1, i, (byte) 11);
        }
    }

    public static final void G(kg1 kg1Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1627314874);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(kg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (kg1Var != null) {
                if (kg1Var instanceof hg1) {
                    fetVar.e0(2041723633);
                    F((hg1) kg1Var, function1, fetVar, i2 & 126);
                    fetVar.r(false);
                } else if (kg1Var instanceof ig1) {
                    fetVar.e0(2041821779);
                    H((ig1) kg1Var, function1, fetVar, i2 & 126);
                    fetVar.r(false);
                } else if (kg1Var instanceof jg1) {
                    fetVar.e0(2041918003);
                    I((jg1) kg1Var, function1, fetVar, i2 & 126);
                    fetVar.r(false);
                }
            }
            throw b1j.f(481502327, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) kg1Var, (Object) function1, i, (byte) 10);
        }
    }

    public static final void H(ig1 ig1Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-363846121);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ig1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
            mdm mdmVar = ig1Var.c;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nr0(function1, (byte) 25);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) ig1Var, (Object) function1, i, (byte) 9);
        }
    }

    public static final void I(jg1 jg1Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(853576141);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
            mdm mdmVar = jg1Var.c;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nr0(function1, (byte) 27);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) jg1Var, (Object) function1, i, (byte) 12);
        }
    }

    public static final void J(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        long jM123getWhite0d7_KjU;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1708249418);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            d8g0 d8g0Var = (d8g0) l7m0Var.getValue();
            int iOrdinal = d8g0Var.b().f42095a.a().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar.e0(950196047);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(950192002, fetVar, false);
                }
                fetVar.e0(950198227);
                jM123getWhite0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            }
            f9m0 f9m0Var = new f9m0(R.string.statistic_chess_table, new dmm(new ta50(new wkm(1, R.drawable.ic_info_new, true, ra50.f30118a, jM123getWhite0d7_KjU))), 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = d8g0Var.b().f42095a;
            j9m0 j9m0Var = d8g0Var.b().b;
            boolean zA = d8g0Var.a();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new pme0(function1, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dvd0(function1, (byte) 27);
                fetVar.o0(objP2);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, function0, (Function1) objP2, null, u1c.M(836369880, new in80(d8g0Var, function1, b2), fetVar), fetVar, 100663296, 129);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i, b2);
        }
    }

    public static final void K(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-449747971);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zq8.a(0, fetVar, mm40Var.e(o7k0.c));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 23);
        }
    }

    public static final void L(m0x m0xVar, String str, long j, fet fetVar, int i) {
        fetVar.g0(1299346320);
        int i2 = (fetVar.g(m0xVar) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16) | (fetVar.f(j) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1681938352, new k5h(j, m0xVar, str), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k5h(i, j, m0xVar, str);
        }
    }

    public static final void M(y7g0 y7g0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(750002710);
        int i2 = (fetVar.g(y7g0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-954841770, new u7g0(function1, y7g0Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7g0(y7g0Var, function1, i);
        }
    }

    public static final void N(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1500777765);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            g1x.l(s5x0.L(n0qVar, qmk.a(fetVar).d, 0.0f, 2), ohq0.e, fetVar, 48, 0);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 11);
        }
    }

    public static final void O(k3t0 k3t0Var, fet fetVar, int i) {
        k3t0Var.getClass();
        fetVar.g0(-1041162562);
        int i2 = (fetVar.g(k3t0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            int i3 = i2 & 14;
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            boolean z = i3 == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                wzu0 wzu0Var = new wzu0(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                fetVar.o0(wzu0Var);
                objP = wzu0Var;
            }
            p(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xcr(k3t0Var, i, (byte) 7);
        }
    }

    public static Object P(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return f7.e(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final mm40 Q(mm40 mm40Var, xdr xdrVar) {
        return mm40Var.e(new l6z(xdrVar));
    }

    public static final Shader.TileMode R(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3) {
            return Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final en7 S(nn7 nn7Var) {
        nn7Var.getClass();
        Integer num = nn7Var.f23806a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = nn7Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = nn7Var.c;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        Double d2 = nn7Var.d;
        return new en7(iIntValue, iIntValue2, iIntValue3, d2 != null ? d2.doubleValue() : 0.0d, false);
    }

    public static final void a(final Function1 function1, final nwi0 nwi0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        function1.getClass();
        nwi0Var.getClass();
        int i3 = nwi0Var.f24236a;
        fetVar.g0(-161480176);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(nwi0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        final byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
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
            String str = nwi0Var.b;
            zfn zfnVar = zaq0.b;
            rqm rqmVar = new rqm((vui0) new tui0(str, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary())), (pui0) new nui0(Integer.valueOf(i3), null, new m0x(i3, null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), null, new pc5(new y3d(((ThemeColors) fetVar.k(zfnVar)).getBackground())), 0.0f, 210), (pvi0) new cvi0(new zb(null, null, 7), nwi0Var.c), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, Response.SERVER_TIMEOUT);
            int i4 = i2 & 14;
            int i5 = i2 & 112;
            boolean z = (i4 == 4) | (i5 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new Function0() { // from class: a.cb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        nwi0 nwi0Var2 = nwi0Var;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                function2.invoke(nwi0Var2.d);
                                break;
                            default:
                                function2.invoke(nwi0Var2.d);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            int i6 = (i4 == 4 ? (byte) 1 : (byte) 0) | (i5 == 32 ? (byte) 1 : (byte) 0);
            Object objP2 = fetVar.P();
            if (i6 != 0 || objP2 == cl5Var) {
                final byte b3 = 1;
                objP2 = new Function0() { // from class: a.cb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        nwi0 nwi0Var2 = nwi0Var;
                        Function1 function2 = function1;
                        switch (b4) {
                            case 0:
                                function2.invoke(nwi0Var2.d);
                                break;
                            default:
                                function2.invoke(nwi0Var2.d);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            }
            obc.q(null, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 0, 173);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00(function1, nwi0Var, mm40Var, i);
        }
    }

    public static final void b(di0 di0Var, Function1 function1, fet fetVar, int i) {
        Pair pair;
        ArrayList arrayList;
        di0Var.getClass();
        fetVar.g0(408203398);
        byte b2 = 4;
        int i2 = (i & 6) == 0 ? (fetVar.g(di0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            if (i3 < 411) {
                pair = new Pair(3, 12);
            } else if (i3 < 640) {
                pair = new Pair(4, 16);
            } else {
                pair = i3 < 768 ? new Pair(5, 20) : new Pair(6, 24);
            }
            int iIntValue = ((Number) pair.f46059a).intValue();
            int iIntValue2 = ((Number) pair.b).intValue();
            if (di0Var instanceof bi0) {
                arrayList = ((bi0) di0Var).f2634a;
            } else {
                if (!di0Var.equals(ci0.f4388a)) {
                    t9f.b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList(iIntValue2);
                for (int i4 = 0; i4 < iIntValue2; i4++) {
                    arrayList2.add(oh0.f25241a);
                }
                arrayList = arrayList2;
            }
            int iMin = Math.min(arrayList.size(), iIntValue);
            int size = ((arrayList.size() + iMin) - 1) / iMin;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(jm40.b, ((size - 1) * 8.0f) + (104.0f * size)), 1.0f), "LAZY_VERTICAL_GRID_CATEGORIES");
            int i5 = i2;
            if (i3 <= 411) {
                iMin = 3;
            }
            ngv ngvVar = new ngv(iMin);
            byte b3 = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b3));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b3));
            boolean zI = fetVar.i(arrayList) | ((i5 & 112) == 32);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new rb(arrayList, function1, b2);
                fetVar.o0(objP);
            }
            g8x.i(ngvVar, mm40VarE0, null, null, qw3Var2, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 924);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rh0(di0Var, function1, i, (byte) 4);
        }
    }

    public static final void c(mm40 mm40Var, l7m0 l7m0Var, lh80 lh80Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        fetVar.g0(273895149);
        int i2 = i | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(lh80Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            byte b2 = 7;
            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar), fetVar, 24576);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = Boolean.valueOf(!(l7m0Var.getValue() instanceof hg1));
                fetVar.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            mm40Var2 = mm40Var;
            mm40 mm40VarI = s5x0.I(mm40Var2.e(o7k0.c), lh80Var);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarE0 = o2e.e0(cjx.V(i120.Q(mm40VarI, background, ljcVar), cloVarB.e, null), "AGGREGATOR_PROMO_SCREEN");
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
            ahy.b(i120.Q(jm40.b, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), cloVarB, zBooleanValue, u1c.M(1793967714, new o71(l7m0Var, function1, b2), fetVar), u1c.M(414182401, new o71(l7m0Var, function1, (byte) 8), fetVar), fetVar, 28032, 0);
            G((kg1) l7m0Var.getValue(), function1, fetVar, (i2 >> 6) & 112);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h11(mm40Var2, l7m0Var, lh80Var, function1, i, (byte) 1);
        }
    }

    public static final void d(mm40 mm40Var, int i, xv1 xv1Var, fet fetVar, int i2) {
        int i3;
        xv1Var.getClass();
        fetVar.g0(-279630975);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xv1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(null) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(mm40Var, 80.0f), 1.0f), "CATEGORY_PRIZE_ILLUSTRATION");
            if (xv1Var instanceof vv1) {
                fetVar.e0(1750626432);
                e(mm40VarE0, i, (vv1) xv1Var, fetVar, i3 & 8176);
                fetVar.r(false);
            } else {
                if (!xv1Var.equals(wv1.f39817a)) {
                    throw b1j.f(1857584915, fetVar, false);
                }
                fetVar.e0(1857596379);
                f(0, fetVar, mm40VarE0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yv1(mm40Var, i, xv1Var, i2, (byte) 1);
        }
    }

    public static final void e(mm40 mm40Var, int i, vv1 vv1Var, fet fetVar, int i2) {
        int i3;
        boolean z;
        sso0 sso0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(694244842);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(vv1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(null) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40Var, backgroundContent, vgg0.a(16.0f));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new c51(vv1Var, (byte) 20);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            xx7 xx7Var = gqw0.m;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(xx7Var, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            mm40 mm40VarL = s5x0.L(new x7z(1.0f, true), 16.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
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
            String str = vv1Var.c;
            if (i != 0) {
                z = true;
                if (i != 1) {
                    sso0Var = i != 2 ? qro0.f29220a : jqo0.f16964a;
                } else {
                    sso0Var = ipo0.f15174a;
                }
            } else {
                z = true;
                sso0Var = nso0.f24059a;
            }
            j6n.h(str, sso0Var, null, 0, 0, fetVar, 0, 28);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            String strL = vv1Var.e;
            String str2 = vv1Var.d;
            boolean z4 = strL.length() > 0 ? z : false;
            boolean z5 = str2.length() > 0 ? z : false;
            if (z4 && z5) {
                strL = kng0.l(str2, " • ", strL);
            } else if (!z4 || z5) {
                strL = (z4 || !z5) ? "" : str2;
            }
            boolean z6 = z;
            v8q0.a(strL, mm40VarN, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, true, 1, 0, null, y9q0.a(new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 28032, 102392);
            fetVar.r(z6);
            fetVar2 = fetVar;
            j0x.b(lv00.T(vv1Var.b, null, null, null, fetVar, 48, 12), null, o7k0.n(jm40Var, 80.0f), null, gqw0.A, 0.0f, null, fetVar2, 24624, 104);
            fetVar2.r(z6);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zv1(mm40Var, i, vv1Var, i2, (byte) 1);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-2078804945);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, (byte) 12);
        }
    }

    public static final void g(mm40 mm40Var, List list, Function1 function1, Function0 function0, fet fetVar, int i) {
        float f2;
        list.getClass();
        function1.getClass();
        function0.getClass();
        fetVar.g0(-1789718925);
        Function0 function2 = function0;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(list) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            float f3 = 40.0f;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            thg0 thg0VarA = shg0.a(new qw3(((Resources) fetVar.k(dy2.c)).getDimension(R.dimen.auth_entry_points_margin) / ((w6k) fetVar.k(bmd.h)).getDensity(), true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar, 48);
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
            Iterator itV = kng0.v(fetVar, mm40VarC0, gqw0.v, -910116501, list);
            while (itV.hasNext()) {
                nb4 nb4Var = (nb4) itV.next();
                fetVar.b0(1148463497, nb4Var);
                boolean zD = Intrinsics.d(nb4Var, qa4.f28376a);
                jm40 jm40Var = jm40.b;
                if (zD) {
                    fetVar.e0(1242709835);
                    zcl zclVar2 = qmk.f28987a;
                    f2 = f3;
                    saj.e(i120.Q(o7k0.n(jm40Var, f3), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.f37379a), a8k0.F(R.drawable.ic_more, 0, fetVar), gqw0.f1, new lh80(8.0f, 8.0f, 8.0f, 8.0f), function2, fetVar, 448 | ((i2 << 3) & 57344), 0);
                    fetVar.r(false);
                } else {
                    f2 = f3;
                    if (!(nb4Var instanceof ra4)) {
                        throw b1j.f(1148464351, fetVar, false);
                    }
                    fetVar.e0(1148487211);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(lgb.J(o7k0.n(jm40Var, f2), vgg0.f37379a), "AUTH_LOGIN_IMAGE");
                    boolean zI = fetVar.i(nb4Var);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        objP = new b33(nb4Var, (byte) 15);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
                    ra4 ra4Var = (ra4) nb4Var;
                    pm80 pm80VarF = a8k0.F(ra4Var.f30115a, 0, fetVar);
                    boolean zI2 = fetVar.i(nb4Var) | ((i2 & 896) == 256);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new mc((Object) function1, (Object) ra4Var, (byte) 28);
                        fetVar.o0(objP2);
                    }
                    saj.e(mm40VarA, pm80VarF, null, null, (Function0) objP2, fetVar, 64, 12);
                    fetVar.r(false);
                }
                fetVar.r(false);
                function2 = function0;
                f3 = f2;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 20, i, mm40Var, list, function1, function0);
        }
    }

    public static final void h(ku4 ku4Var, Function1 function1, Function0 function0, mm40 mm40Var, fet fetVar, int i) {
        mm40 mm40Var2;
        ku4Var.getClass();
        function1.getClass();
        function0.getClass();
        fetVar.g0(-240651316);
        int i2 = i | (fetVar.i(ku4Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | 3072;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            pz40 pz40VarQ = gkb.Q(ku4Var.I, null, fetVar, 0, 7);
            ugd ugdVarM = u1c.M(-1859893112, new ry2(ku4Var, function0, pz40VarQ), fetVar);
            zcl zclVar = qmk.f28987a;
            m8x.y(null, ugdVarM, null, null, null, 0, 0L, 0L, i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14), u1c.M(1902009821, new qb(ku4Var, function1, pz40VarQ), fetVar), fetVar, 805306416, 253);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 21, i, ku4Var, function1, function0, mm40Var2);
        }
    }

    public static final void i(boolean z, Function0 function0, fet fetVar, int i, int i2) {
        boolean z2;
        int i3;
        fetVar.g0(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (fetVar.h(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i4 != 0 ? true : z2;
            Object objA = qr00.a(fetVar);
            if (objA == null) {
                fetVar.e0(535274673);
                objA = tr00.a(fetVar);
            } else {
                fetVar.e0(535271790);
            }
            fetVar.r(false);
            if (objA == null) {
                jf4.n("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zG = fetVar.g(objA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                ze50 ze50Var = objA instanceof ze50 ? (ze50) objA : null;
                ye50 ye50VarB = ze50Var != null ? ze50Var.b() : null;
                kg60 kg60Var = objA instanceof kg60 ? (kg60) objA : null;
                objP = new rb5(ye50VarB, kg60Var != null ? kg60Var.k() : null);
                fetVar.o0(objP);
            }
            Object obj2 = (rb5) objP;
            long j = fetVar.T;
            boolean zG2 = fetVar.g(obj2) | fetVar.f(j);
            Object objP2 = fetVar.P();
            Object obj3 = objP2;
            if (zG2 || objP2 == obj) {
                uhd uhdVar = new uhd(new sb5(objA, j));
                uhdVar.c = new a7d((byte) 12);
                fetVar.o0(uhdVar);
                obj3 = uhdVar;
            }
            Object obj4 = (uhd) obj3;
            fetVar.e0(-585307852);
            boolean zI = fetVar.i(obj4) | ((i3 & 112) == 32);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new gj4(obj4, function0, (byte) 7);
                fetVar.o0(objP3);
            }
            m0x0.D((Function0) objP3, fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i5 = i3 & 14;
            boolean zI2 = fetVar.i(obj4) | (i5 == 4);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new x9(obj4, z3, (byte) 3);
                fetVar.o0(objP4);
            }
            s0x.h(boolValueOf, obj4, null, (Function1) objP4, fetVar, i5, 4);
            boolean zI3 = fetVar.i(obj2) | fetVar.i(obj4);
            Object objP5 = fetVar.P();
            if (zI3 || objP5 == obj) {
                objP5 = new ys3(obj2, obj4, (byte) 27);
                fetVar.o0(objP5);
            }
            m0x0.n(obj2, obj4, (Function1) objP5, fetVar);
            fetVar.r(false);
            z2 = z3;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tb5(z2, function0, i, i2);
        }
    }

    public static final void j(mm40 mm40Var, pz40 pz40Var, boolean z, hh80 hh80Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(943959538);
        int i2 = i | 6 | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.g(hh80Var) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "LAZY_COLUMN_BET_CONSTRUCTOR");
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((57344 & i2) == 16384);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new ka2(pz40Var, z, function1, (byte) 2);
                fetVar.o0(objP);
            }
            mm40Var2 = jm40Var;
            b8k0.e(mm40VarE0, xczVarA, hh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i2 >> 3) & 896, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0(mm40Var2, pz40Var, z, hh80Var, function1, i);
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(5375117);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f2, 0.0f, 2);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = o7k0.e(o7k0.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), 1.0f), 248.0f);
            vqm vqmVar = vqm.f37862a;
            zq8.a(0, fetVar, xbc.c0(mm40VarE, vbc.d0(vqmVar, fetVar, 6, 0)));
            zq8.a(0, fetVar, xbc.c0(o7k0.e(o7k0.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13)), 1.0f), 248.0f), vbc.d0(vqmVar, fetVar, 6, 0)));
            dw9.x(o7k0.e(o7k0.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13)), 1.0f), 248.0f), vbc.d0(vqmVar, fetVar, 6, 0), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, (byte) 27);
        }
    }

    public static final void l(mm40 mm40Var, j83 j83Var, fet fetVar, int i) {
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarE = o7k0.e(mm40Var, 32.0f);
        tj30 tj30VarC = zq8.c(gqw0.e, false);
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
        jpm0.o(fetVar, tj30VarC, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        mm40 mm40VarJ = s5x0.J(o7k0.d(jm40.b, 1.0f), 4.0f);
        ((g1t0) fetVar.k(j1t0.e)).getClass();
        v8q0.b(j83Var, mm40VarJ, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), new n05(qmk.p, qmk.q, qmk.n), 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.g(), fetVar, (i >> 3) & 14, 24960, 240624);
        fetVar.r(true);
    }

    public static final void m(mm40 mm40Var, j83 j83Var, fet fetVar, int i) {
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarE = o7k0.e(mm40Var, 24.0f);
        tj30 tj30VarC = zq8.c(gqw0.e, false);
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
        jpm0.o(fetVar, tj30VarC, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
        ((g1t0) fetVar.k(j1t0.e)).getClass();
        v8q0.b(j83Var, mm40VarD, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.h(), fetVar, ((i >> 3) & 14) | 48, 24960, 240632);
        fetVar.r(true);
    }

    public static final void n(mm40 mm40Var, gfc gfcVar, Function1 function1, fet fetVar, int i) {
        gfc gfcVar2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        gfcVar.getClass();
        function1.getClass();
        fetVar2.g0(-1934833376);
        int i2 = i | 6 | (fetVar2.g(gfcVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, background, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            imm immVar = gfcVar.f11202a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new dib(function1, (byte) 10);
                fetVar2.o0(objP);
            }
            boolean z2 = false;
            mm40Var2 = jm40Var;
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            fetVar2 = fetVar;
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(n0qVar, 16.0f, 8.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = (i2 & 112) == 32;
            if (i3 == 256) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                gfcVar2 = gfcVar;
                objP2 = new h6c(gfcVar2, function1, (byte) 6);
                fetVar2.o0(objP2);
            } else {
                gfcVar2 = gfcVar;
            }
            b8k0.e(mm40VarK, null, null, qw3Var, null, null, false, null, (Function1) objP2, fetVar2, 0, 494);
            fetVar2.r(true);
        } else {
            gfcVar2 = gfcVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var2, gfcVar2, function1, i, (byte) 7);
        }
    }

    public static final void o(vs4 vs4Var, jkm jkmVar, Function0 function0, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function0 function5, mm40 mm40Var, fet fetVar, int i) {
        fetVar.g0(1789117063);
        int i2 = (fetVar.g(mm40Var) ? 67108864 : 33554432) | i | (fetVar.g(vs4Var) ? 4 : 2) | (fetVar.g(jkmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192) | (fetVar.i(function3) ? 131072 : 65536) | (fetVar.i(function4) ? 1048576 : 524288) | (fetVar.i(function5) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            mom.c(mm40Var.e(o7k0.c), vs4Var.d, mom.f(fetVar), gqw0.e, false, null, function0, null, u1c.M(573004956, new us4(vs4Var, function5, jkmVar, function4, function1, function2, function3), fetVar), fetVar, ((i2 << 12) & 3670016) | 100666368, 176);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j0a0(vs4Var, jkmVar, function0, function1, function2, function3, function4, function5, mm40Var, i);
        }
    }

    public static final void p(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1333827775);
        byte b2 = 16;
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            m8x.y(o7k0.c, u1c.M(787006981, new ckq0(l7m0Var, function1, b3), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, null, u1c.M(68204624, new xs4(l7m0Var, function1, b2), fetVar), fetVar, 805306422, 444);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i, (byte) 19);
        }
    }

    public static final void q(ola0 ola0Var, Function1 function1, fet fetVar, int i) {
        k6z k6zVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1731474757);
        int i2 = (fetVar2.g(ola0Var) ? 4 : 2) | i | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            float f2 = xfn.a(fetVar2).d;
            float f3 = xfn.a(fetVar2).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarM = s5x0.M(jm40Var, f2, 16.0f, f3, 8.0f);
            a4x a4xVar = ola0Var.d;
            boolean z = ola0Var.c;
            boolean z2 = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            byte b2 = 26;
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new l3a0(ola0Var, b2);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new hs80(function1, (byte) 25);
                fetVar2.o0(objP2);
            }
            byte b3 = 26;
            ibc.n(mm40VarM, a4xVar, gxh0.f12078a, axh0.f1625a, z, function0, (Function1) objP2, fetVar, 384, 0);
            if (ola0Var.c) {
                fetVar.e0(-1728052276);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1728051352);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            zfn zfnVar = bmd.n;
            obc.d(zfnVar.a(k6zVar), u1c.M(1489780677, new hla0(ola0Var, function1), fetVar), fetVar, 56);
            obc.d(zfnVar.a(k6z.f17794a), u1c.M(1662748334, new cz90(ola0Var, b3), fetVar), fetVar, 56);
            if (ola0Var.j != null) {
                fetVar.e0(-2029258028);
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                mtl mtlVar = ola0Var.j;
                boolean z4 = i3 == 32;
                Object objP3 = fetVar.P();
                if (z4 || objP3 == cl5Var) {
                    objP3 = new hs80(function1, b3);
                    fetVar.o0(objP3);
                }
                fetVar2 = fetVar;
                bkb.f(mm40VarN, mtlVar, null, false, null, (Function1) objP3, fetVar2, 0, 28);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(-2029003363);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hla0(ola0Var, function1, i);
        }
    }

    public static final void r(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(260978744);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i0a0(function1, (byte) 17);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i, b2);
        }
    }

    public static final void s(int i, fet fetVar) {
        fetVar.g0(-1569846377);
        byte b2 = 1;
        if (fetVar.U(i & 1, i != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() & 4294967295L);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = Integer.valueOf((int) ((iB * 0.009615385f) + 2.0f));
                fetVar.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            boolean zG = fetVar.g(fqj0VarD0);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new m3a0(b2, iIntValue, fqj0VarD0);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarQ, null, null, null, null, null, false, null, (Function1) objP2, fetVar, 12582912, 382);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jfa0(i, (byte) 5);
        }
    }

    public static final void t(nla0 nla0Var, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-1038968016);
        y5d y5dVar = y5d.f42040a;
        int i2 = (fetVar.g(y5dVar) ? 4 : 2) | i | (fetVar.g(nla0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarB = y5dVar.b(o7k0.d(jm40.b, 1.0f), true);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new er90((byte) 29);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean z = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new yr80(nla0Var, (byte) 13);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            dwi0.b(function1, mm40VarB, (Function1) objP2, fetVar2, 6, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cz90(nla0Var, i, (byte) 25);
        }
    }

    public static final void u(l5h l5hVar, fet fetVar, int i) {
        l5hVar.getClass();
        fetVar.g0(-655049524);
        int i2 = i | (fetVar.g(l5hVar) ? 4 : 2);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40.b, 128.0f), 172.0f);
            long j = ijg.i;
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            tj30 tj30VarC = zq8.c(gqw0.h, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE2);
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
            n0q n0qVar = o7k0.c;
            mm40 mm40VarJ = s5x0.J(n0qVar, 52.0f);
            n0x n0xVar = l5hVar.b;
            Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad);
            StaticColors staticColors = StaticColors.INSTANCE;
            uc9.c(n0qVar, mm40VarJ, n0xVar, numValueOf, new y3d(staticColors.m126getWhite200d7_KjU()), null, null, gqw0.A, null, fetVar, 12582918, 352);
            zq8.a(0, fetVar, i120.P(n0qVar, yk5.n(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(j)), 0.0f, 0.0f, 14), null, 6));
            D(l5hVar, fetVar, i2 & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5h(l5hVar, i, b2);
        }
    }

    public static final void v(int i, fet fetVar, mm40 mm40Var, String str, String str2, boolean z) {
        fet fetVar2 = fetVar;
        fetVar2.g0(446119530);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.L(mm40Var, 0.0f, 12.0f, 1), 36.0f);
            x5d x5dVarA = w5d.a(uc9.g, gqw0.m, fetVar2, 6);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zfn zfnVar = m8m0.f21378a;
            v8q0.a(str, mm40VarD, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(z ? 5 : 6), 0L, 2, true, 1, 0, null, g1t0.g(), fetVar2, ((i2 >> 3) & 14) | 48, 28032, 101368);
            v8q0.a(str2, o7k0.d(jm40Var, 1.0f), ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), new n05(qmk.q, qmk.s, qmk.n), 0L, null, null, null, 0L, new f2q0(z ? 5 : 6), 0L, 2, true, 1, 0, null, g1t0.i(), fetVar2, ((i2 >> 6) & 14) | 48, 28032, 101360);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eza((byte) 1, i, mm40Var, str, str2, z);
        }
    }

    public static final void w(mm40 mm40Var, dw1 dw1Var, fet fetVar, int i) {
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1997232746);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(dw1Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.d(o7k0.e(mm40Var, 60.0f), 1.0f), vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3));
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarJ, ((StaticColors) fetVar2.k(zfnVar)).m70getBlack200d7_KjU(), jd8.n), 16.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.l, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            if (dw1Var.f6773a == bw1.f3302a) {
                fetVar2.e0(207156331);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                v(3072, fetVar2, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), dw1Var.d, dw1Var.e, true);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                fetVar2 = fetVar;
                v(3072, fetVar2, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), dw1Var.f, dw1Var.g, false);
                fetVar2.r(false);
                z = true;
            } else {
                fetVar2.e0(207589060);
                n0q n0qVar = o7k0.c;
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
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
                String str = dw1Var.i;
                long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
                qrq qrqVar = j1t0.b;
                long j = qmk.s;
                z = true;
                v8q0.a(str, null, jM123getWhite0d7_KjU, new n05(qmk.q, j, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, true, 2, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 28032, 102386);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) dw1Var, i, (byte) 3);
        }
    }

    public static final void x(mm40 mm40Var, fw1 fw1Var, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        fw1 fw1Var2;
        byte b2;
        fet fetVar2 = fetVar;
        fetVar2.g0(947684477);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(fw1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(null) ? 256 : 128;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = mm40Var;
            fw1Var2 = fw1Var;
            b2 = 1;
            fetVar2.X();
        } else if (fw1Var instanceof dw1) {
            fetVar2.e0(1648591964);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 164.0f);
            dw1 dw1Var = (dw1) fw1Var;
            n0x n0xVar = dw1Var.j;
            long jE = b1j.e(fetVar2, 191733512, fetVar2, false);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jE, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            int i3 = i2 & 112;
            boolean z = (i3 == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new knl(fw1Var, (byte) 7);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            fetVar2.e0(1573780242);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarI = dw9.i(zclVar2, zclVar2, zclVar2, zclVar2, jm40Var);
            jr8 jr8Var = jr8.f16991a;
            k7x.a(n0xVar.a(), null, jr8Var.a(mm40VarI), gqw0.A, null, fetVar2, 1572912, 1976);
            fetVar2.r(false);
            mm40 mm40VarL = s5x0.L(o7k0.c, 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
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
            v8q0.a(dw1Var.b, s5x0.N(jm40Var, 8.0f, 24.0f, 8.0f, 0.0f, 8), afn0.p(fetVar2).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, true, 1, 0, null, g1t0.g(), fetVar, 0, 28032, 102392);
            v8q0.a(dw1Var.c, o7k0.g(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 20.0f, 0.0f, 2), afn0.p(fetVar).m123getWhite0d7_KjU(), new n05(qmk.q, qmk.y, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, true, 1, 0, null, y9q0.a(g1t0.o(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 28032, 102384);
            fetVar2 = fetVar;
            b2 = 1;
            fetVar2.r(true);
            w(jr8Var.b(jm40Var, gqw0.h), dw1Var, fetVar2, i3);
            fetVar2.r(true);
            fetVar2.r(false);
            mm40Var2 = mm40Var;
            fw1Var2 = fw1Var;
        } else {
            b2 = 1;
            fw1Var2 = fw1Var;
            if (!fw1Var2.equals(ew1.f8498a)) {
                throw b1j.f(191725669, fetVar2, false);
            }
            fetVar2.e0(1651371858);
            mm40Var2 = mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar3 = qmk.i;
            ugg0 ugg0Var2 = vgg0.f37379a;
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarD), vbc.d0(null, fetVar2, 0, 1), fetVar2, 0, false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jql(mm40Var2, fw1Var2, i, b2);
        }
    }

    public static final void y(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1195405649);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new pme0(function1, (byte) 19);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i, (byte) 26);
        }
    }

    public static final void z(l7m0 l7m0Var, fet fetVar, int i) {
        fetVar.g0(1273647015);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            nkb.h(null, ((f9v0) l7m0Var.getValue()).e, kjm.b, null, null, null, fetVar, 384, 57);
            hkb.k(0, 1, fetVar, null, ((f9v0) l7m0Var.getValue()).f);
            hkb.k(0, 1, fetVar, null, ((f9v0) l7m0Var.getValue()).g);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cw0(l7m0Var, i, (byte) 16);
        }
    }
}
