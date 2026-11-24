package a;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import java.security.MessageDigest;
import java.util.AbstractList;
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
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ewm0 {
    public static final void a(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        int i2;
        fet fetVar2;
        mm40 mm40Var2;
        Function0 function1;
        fetVar.g0(-1130779582);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            function1 = function0;
            mm40Var2 = mm40Var;
            qzb.n(mm40Var2, new wul(lul.e, oe9.f25112a, new ue9(rsm0.w(R.string.make_bet, 0, fetVar)), true, false, true), function1, fetVar2, ((i2 >> 3) & 14) | ((i2 << 6) & 896), 0);
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            function1 = function0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wb5(function1, mm40Var2, i, (byte) 8);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        int i2;
        fetVar.g0(-407141600);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(lcg0.f19798a.a(new icg0(new hcg0(0.0f, 0.0f, 0.0f, 0.0f), 1)), u1c.M(1232774752, new lw0(mm40Var, function0, b), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wb5(function0, mm40Var, i, (byte) 7);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str, Function0 function0, boolean z) {
        int i2;
        fetVar.g0(1329809816);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (z) {
            fetVar.e0(-413921242);
            a((i2 >> 9) & 14, fetVar, o7k0.d(mm40Var, 1.0f), function0);
            fetVar.r(false);
        } else {
            fetVar.e0(-413760910);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 40.0f), 1.0f);
            zfn zfnVar = zaq0.b;
            long secondary10 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary10();
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarD, secondary10, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f, 10.0f);
            String strW = rsm0.w(R.string.toto_chosen_2, 0, fetVar);
            lmc.r((i2 & 896) | 1572864, qmk.o, fetVar, mm40VarK, y9q0.a(g1t0.j(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), y9q0.a(g1t0.j(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), strW, str);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((Object) mm40Var, z, (Object) str, function0, i, (byte) 15);
        }
    }

    public static final void d(mm40 mm40Var, ywv0 ywv0Var, int i, ugd ugdVar, Function2 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        ugd ugdVar2;
        boolean z;
        mm40Var.getClass();
        ywv0Var.getClass();
        fetVar.g0(1347177764);
        int i3 = i2 | (fetVar.g(ywv0Var) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(Integer.valueOf(i), fetVar);
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new axv0(ywv0Var, pz40VarF);
                fetVar.o0(objP);
            }
            axv0 axv0Var = (axv0) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40Var2 = mm40Var;
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
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
            jpm0.o(fetVar, axv0Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            ugdVar2 = ugdVar;
            twn.v(6, ugdVar2, fetVar, true);
            if (function2 == null) {
                fetVar.e0(-900421962);
                fetVar.r(false);
                z = true;
            } else {
                fetVar.e0(-900421961);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD2);
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
                function2.invoke(fetVar, 0);
                z = true;
                fetVar.r(true);
                fetVar.r(false);
            }
            fetVar.r(z);
        } else {
            mm40Var2 = mm40Var;
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90(mm40Var2, ywv0Var, i, ugdVar2, function2, i2);
        }
    }

    public static final void e(ayo0 ayo0Var, fet fetVar, int i) {
        ayo0Var.getClass();
        fetVar.g0(856749708);
        int i2 = (fetVar.g(ayo0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f), 22.0f);
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
            g(ayo0Var.b, fetVar, 0);
            mm40 mm40VarC = o7k0.c(s5x0.L(jm40Var, 4.0f, 0.0f, 2).e(new x7z(1.0f, true)), 1.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            f(0, fetVar, i120.Q(mm40VarC, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), ayo0Var.f1678a);
            g(ayo0Var.c, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(ayo0Var, i, (byte) 22);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(139021971);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar2, (i2 >> 3) & 14, 24960, 109562);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var, str2, i, (byte) 27);
        }
    }

    public static final void g(zxo0 zxo0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-924137658);
        int i2 = i | (fetVar2.g(zxo0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            boolean z = zxo0Var instanceof xxo0;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar2.e0(-244418441);
                String str = ((xxo0) zxo0Var).f41668a;
                StaticColors staticColors = StaticColors.INSTANCE;
                long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
                pge pgeVar = gqw0.f1;
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarP = o7k0.p(jm40Var, 44.0f, 30.0f);
                long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
                zcl zclVar2 = qmk.d;
                ugg0 ugg0Var = vgg0.f37379a;
                lgb.v(s5x0.M(i120.Q(mm40VarP, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 2.0f, 8.0f, 2.0f), s5x0.J(i120.Q(o7k0.p(jm40Var, 42.0f, 28.0f), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 2.0f), str, R.drawable.icon_globe_new, jM130getWhite600d7_KjU, pgeVar, fetVar2, 196608, 0);
                fetVar2.r(false);
            } else {
                if (!(zxo0Var instanceof yxo0)) {
                    throw b1j.f(961945141, fetVar2, false);
                }
                fetVar2.e0(-243255259);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarP2 = o7k0.p(jm40Var, 44.0f, 30.0f);
                long jM73getBlack400d7_KjU2 = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                zcl zclVar4 = qmk.d;
                ugg0 ugg0Var2 = vgg0.f37379a;
                mm40 mm40VarQ = i120.Q(mm40VarP2, jM73getBlack400d7_KjU2, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4));
                tj30 tj30VarC = zq8.c(gqw0.e, false);
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
                jpm0.o(fetVar2, tj30VarC, gqw0.x);
                jpm0.o(fetVar2, bh90VarM, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                yxo0 yxo0Var = (yxo0) zxo0Var;
                v8q0.a(yxo0Var.f43433a, null, ibc.Y(yxo0Var.b, fetVar2), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109562);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(zxo0Var, i, (byte) 23);
        }
    }

    public static final void h(int i, v3n v3nVar, fet fetVar, mm40 mm40Var, String str) {
        str.getClass();
        fetVar.g0(841130836);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(v3nVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            v8q0.a(str, mm40Var, 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, v3nVar.a().k(), 0, null, v3nVar.b().k(fetVar), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 384, 109564);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, str, v3nVar, i, (byte) 17);
        }
    }

    public static final void i(smr0 smr0Var, Function0 function0, Function0 function1, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        function0.getClass();
        function1.getClass();
        fetVar.g0(1804938570);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(smr0Var) : fetVar.i(smr0Var) ? 4 : 2) | i;
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
            i2 |= fetVar.g(mm40Var) ? 2048 : 1024;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (smr0Var.equals(new smr0("", false))) {
            fetVar.e0(-2063690504);
            fetVar.r(false);
        } else {
            fetVar.e0(-2065325165);
            mm40 mm40VarW = o7k0.w(mm40Var, null, false, 3);
            pz40 pz40Var = s6t0.f31722a;
            long shadowSoft = s6t0.b().f33626a.getShadowSoft();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(lgb.J(qcc.F(qcc.F(mm40VarW, shadowSoft, 20.0f, 12.0f, 4.0f, 0.0f, 112), s6t0.b().f33626a.getShadowSoft(), 20.0f, 32.0f, -4.0f, 0.0f, 112), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 12.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            b((i2 >> 3) & 14, fetVar, o050.S(mm40VarD.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true))), function0);
            qxw.o(fetVar, o7k0.s(jm40Var, 12.0f));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            c((i2 << 3) & 7168, fetVar, o050.S(o2e.e0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "SELECTED_OUTCOME_MAKE_BET")), smr0Var.f32461a, function1, smr0Var.b);
            fetVar.r(true);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90(smr0Var, function0, function1, mm40Var, i);
        }
    }

    public static final void j(final mnh mnhVar, fet fetVar, final int i) {
        final byte b;
        int i2;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        pcy pcyVar;
        pcy pcyVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1521713483);
        int i3 = (fetVar2.g(mnhVar) ? 4 : 2) | i;
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zfn zfnVar = zaq0.b;
            long primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            Locale locale = ((Configuration) fetVar2.k(dy2.f6873a)).getLocales().get(0);
            locale.getClass();
            boolean zG = fetVar2.g(locale);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = Calendar.getInstance(locale);
                fetVar2.o0(objP);
            }
            Calendar calendar = (Calendar) objP;
            boolean zG2 = fetVar2.g(locale);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = Long.valueOf(calendar.getTimeInMillis());
                fetVar2.o0(objP2);
            }
            long jLongValue = ((Number) objP2).longValue();
            SimpleDate simpleDate = mnhVar.f22087a;
            SimpleDate simpleDate2 = mnhVar.b;
            boolean zG3 = fetVar2.g(simpleDate) | fetVar2.g(simpleDate2);
            Object objP3 = fetVar2.P();
            if (zG3 || objP3 == cl5Var) {
                calendar.getClass();
                wdx.J(simpleDate, calendar);
                long timeInMillis = calendar.getTimeInMillis();
                wdx.J(simpleDate2, calendar);
                objP3 = Boolean.valueOf(timeInMillis <= calendar.getTimeInMillis());
                fetVar2.o0(objP3);
            }
            if (!((Boolean) objP3).booleanValue()) {
                yfe0 yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    final byte b2 = 0;
                    yfe0VarU.d = new Function2(mnhVar, i, b2) { // from class: a.l4s0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f19424a;
                        public final /* synthetic */ mnh b;

                        {
                            this.f19424a = b2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.f19424a;
                            mnh mnhVar2 = this.b;
                            fet fetVar3 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    ewm0.j(mnhVar2, fetVar3, x8x.L(1));
                                    break;
                                default:
                                    ewm0.j(mnhVar2, fetVar3, x8x.L(1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            boolean zG4 = fetVar2.g(simpleDate) | fetVar2.g(simpleDate2);
            Object objP4 = fetVar2.P();
            if (zG4 || objP4 == cl5Var) {
                calendar.getClass();
                wdx.J(simpleDate, calendar);
                long timeInMillis2 = calendar.getTimeInMillis();
                wdx.J(simpleDate2, calendar);
                long timeInMillis3 = calendar.getTimeInMillis();
                if (jLongValue <= timeInMillis2) {
                    i2 = 0;
                } else if (jLongValue >= timeInMillis3) {
                    i2 = 100;
                } else {
                    i2 = (int) (((jLongValue - timeInMillis2) / (timeInMillis3 - timeInMillis2)) * 100.0d);
                }
                objP4 = Integer.valueOf(i2);
                fetVar2.o0(objP4);
            } else {
                primary = primary;
            }
            int iIntValue = ((Number) objP4).intValue();
            boolean zG5 = fetVar2.g(simpleDate) | fetVar2.g(simpleDate2);
            Object objP5 = fetVar2.P();
            if (zG5 || objP5 == cl5Var) {
                calendar.getClass();
                sdj sdjVar = simpleDate.f47286a != simpleDate2.f47286a ? sdj.UNIQUE_16 : sdj.UNIQUE_15;
                rdj rdjVar = rdj.f30294a;
                wdx.J(simpleDate, calendar);
                Date time = calendar.getTime();
                time.getClass();
                String strC = rdj.c(rdjVar, sdjVar, time, locale, 28);
                wdx.J(simpleDate2, calendar);
                Date time2 = calendar.getTime();
                time2.getClass();
                objP5 = new Pair(strC, rdj.c(rdjVar, sdjVar, time2, locale, 28));
                fetVar2.o0(objP5);
            }
            Pair pair = (Pair) objP5;
            String str = (String) pair.f46059a;
            String str2 = (String) pair.b;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 48.0f);
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarM = s5x0.M(i120.S(mm40VarE, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 12.0f, 8.0f, 10.0f);
            x5d x5dVarA = w5d.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar3 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar6);
            jpm0.n(fetVar2);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar7);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                long j = primary;
                shdVar2 = shdVar6;
                shdVar = shdVar7;
                shdVar3 = shdVar4;
                pcyVar = pcyVar3;
                unm unmVar = new unm(tnm.f34243a, j, j, background, 6.0f, 360.0f, iIntValue, 0, false, 640);
                fetVar2.o0(unmVar);
                objP6 = unmVar;
            } else {
                shdVar = shdVar7;
                shdVar2 = shdVar6;
                shdVar3 = shdVar4;
                pcyVar = pcyVar3;
            }
            snm.b(mm40VarD2, (unm) objP6, fetVar2, 54);
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD3);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar2 = pcyVar;
                fetVar2.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar3);
            jpm0.o(fetVar2, bh90VarM2, shdVar5);
            shd shdVar8 = shdVar2;
            vqd.u(iHashCode2, fetVar2, shdVar8, fetVar2);
            shd shdVar9 = shdVar;
            jpm0.o(fetVar2, mm40VarC1, shdVar9);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, x7zVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar3);
            jpm0.o(fetVar2, bh90VarM3, shdVar5);
            vqd.u(iHashCode3, fetVar2, shdVar8, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar9);
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            shd shdVar10 = shdVar3;
            pcy pcyVar4 = pcyVar2;
            b = 1;
            v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, 0, 24960, 110586);
            fetVar2.r(true);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            tj30 tj30VarC2 = zq8.c(gqw0.f, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, x7zVar2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar4);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar10);
            jpm0.o(fetVar2, bh90VarM4, shdVar5);
            vqd.u(iHashCode4, fetVar2, shdVar8, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar9);
            long secondary2 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str2, null, secondary2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, 0, 24960, 110586);
            fetVar2 = fetVar2;
            ohs0.x(fetVar2, true, true, true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new Function2(mnhVar, i, b) { // from class: a.l4s0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f19424a;
                public final /* synthetic */ mnh b;

                {
                    this.f19424a = b;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.f19424a;
                    mnh mnhVar2 = this.b;
                    fet fetVar3 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            ewm0.j(mnhVar2, fetVar3, x8x.L(1));
                            break;
                        default:
                            ewm0.j(mnhVar2, fetVar3, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void k(mm40 mm40Var, uss0 uss0Var, fet fetVar, int i) {
        uss0Var.getClass();
        fetVar.g0(2036530197);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(uss0Var) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (uss0Var instanceof sss0) {
            fetVar.e0(-436754742);
            l(mm40Var, (sss0) uss0Var, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            if (!uss0Var.equals(tss0.f34476a)) {
                throw b1j.f(-1399564059, fetVar, false);
            }
            fetVar.e0(-436643917);
            m(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, uss0Var, i, (byte) 12);
        }
    }

    public static final void l(mm40 mm40Var, sss0 sss0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1630707063);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(sss0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            String str = sss0Var.f32742a;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) mm40Var, (Object) sss0Var, i, (byte) 10);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1039003980);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40.b, 232.0f), 14.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 27);
        }
    }

    public static final void n(mm40 mm40Var, chm chmVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        chmVar.getClass();
        function0.getClass();
        fetVar2.g0(142069828);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(chmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 64.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarW = y860.W(i120.Q(mm40VarS, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.a(16.0f)), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarL, zx7Var);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
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
            m0x m0xVar = chmVar.f4367a;
            int i3 = chmVar.b;
            o(null, m0xVar, fetVar2, 0);
            v8q0.a(chmVar.c, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar2), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (i3 > 0) {
                fetVar2.e0(-1299120852);
                tdc.e(new rpe(i3), new gpe(((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent()), ffb0.Q(jr8Var.b(jm40Var, gqw0.c), 4.0f, -4.0f), fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1298822632);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, chmVar, function0, i, (byte) 27);
        }
    }

    public static final void o(mm40 mm40Var, m0x m0xVar, fet fetVar, int i) {
        fetVar.g0(142230467);
        int i2 = i | 6 | (fetVar.g(m0xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = rlx.c;
            zcl zclVar = qmk.f28987a;
            obc.d(zfnVar.a(new ycl(32.0f)), u1c.M(1782146819, new sw1(m0xVar), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new onu0(mm40Var, m0xVar, i, (byte) 7);
        }
    }

    public static final void p(ViewGroup viewGroup, AbstractList abstractList) {
        abstractList.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(abstractList, 10));
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            viewGroup.addView((View) it.next());
            arrayList.add(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011 A[DONT_INVERT] */
    public static final d8n q(long j, String str, mxp mxpVar, List list, String str2, String str3) {
        String str4;
        String str5;
        if (str3 == null) {
            str4 = mxpVar != null ? mxpVar.o : null;
            if (str4 == null) {
                str5 = "";
            } else {
                str5 = str4;
            }
        } else {
            str5 = !StringsKt.W(str3) ? str3 : null;
            if (str5 == null) {
                if (mxpVar != null) {
                }
                if (str4 == null) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
            }
        }
        return new d8n(j, str, new n0x(str5), jpm0.i(list, j, 189L, 0L), str2);
    }

    public static String r(lg9 lg9Var) {
        StringBuilder sb = new StringBuilder(lg9Var.size());
        for (int i = 0; i < lg9Var.size(); i++) {
            byte b = lg9Var.b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final ArrayList s(List list, Function1 function1) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (((Boolean) function1.invoke(Long.valueOf(((aco0) obj).f639a))).booleanValue()) {
                arrayListU.add(obj);
            }
        }
        return arrayListU;
    }

    public static final aco0 t(long j, List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((aco0) next).f639a != j);
        aco0 aco0Var = (aco0) next;
        return aco0Var == null ? (aco0) CollectionsKt.firstOrNull(list) : aco0Var;
    }

    public static final void u(View view, pn3 pn3Var) {
        view.setPadding(view.getResources().getDimensionPixelSize(R.dimen.space_0), view.getResources().getDimensionPixelSize(R.dimen.space_0), view.getResources().getDimensionPixelSize(R.dimen.space_0), view.getResources().getDimensionPixelSize(R.dimen.space_0));
    }

    public static String v(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            }
            String lowerCase = sb.toString().toLowerCase();
            lowerCase.getClass();
            return lowerCase;
        } catch (Exception e) {
            itt0.o(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public static final dwm0 w(hwm0 hwm0Var, long j) {
        ?? arrayList;
        String strValueOf;
        String strValueOf2;
        ?? arrayList2;
        h4h0 h4h0Var;
        g4h0 g4h0Var;
        h4h0 h4h0Var2;
        g4h0 g4h0Var2;
        String strValueOf3;
        String strValueOf4;
        b4h0 b4h0Var;
        Integer num;
        b4h0 b4h0Var2;
        Integer num2;
        String str = null;
        if (hwm0Var == null) {
            return null;
        }
        List<l4h0> list = hwm0Var.b;
        String str2 = hwm0Var.f13774a;
        i4h0 i4h0Var = hwm0Var.c;
        if (j != 66) {
            if (str2 == null) {
                str2 = "";
            }
            if (list != null) {
                arrayList = new ArrayList(r3d.q(list, 10));
                for (l4h0 l4h0Var : list) {
                    String strValueOf5 = l4h0Var.f19405a;
                    if (strValueOf5 == null) {
                        Integer num3 = l4h0Var.b;
                        strValueOf5 = num3 != null ? String.valueOf(num3.intValue()) : null;
                        if (strValueOf5 == null) {
                            strValueOf5 = "0";
                        }
                    }
                    Integer num4 = l4h0Var.c;
                    if (num4 == null || (strValueOf = String.valueOf(num4.intValue())) == null) {
                        strValueOf = "0";
                    }
                    Integer num5 = l4h0Var.d;
                    if (num5 == null || (strValueOf2 = String.valueOf(num5.intValue())) == null) {
                        strValueOf2 = "0";
                    }
                    arrayList.add(new ue90(strValueOf5, strValueOf, strValueOf2));
                }
            } else {
                arrayList = iun.f15405a;
            }
            return new cwm0(str2, arrayList);
        }
        List listI0 = str2 != null ? StringsKt.i0(str2, new char[]{'-'}, 6) : null;
        if (listI0 == null) {
            listI0 = iun.f15405a;
        }
        String str3 = (String) CollectionsKt.W(0, listI0);
        if (str3 == null) {
            str3 = "0";
        }
        String str4 = (String) CollectionsKt.W(1, listI0);
        if (str4 == null) {
            str4 = "0";
        }
        String str5 = (i4h0Var == null || (b4h0Var2 = i4h0Var.f14146a) == null || (num2 = b4h0Var2.f1958a) == null || num2.intValue() != 1) ? null : b4h0Var2.c;
        String str6 = (i4h0Var == null || (b4h0Var = i4h0Var.f14146a) == null || (num = b4h0Var.f1958a) == null || num.intValue() != 2) ? null : b4h0Var.c;
        String strJ0 = sj3.j0(str2, "0-0");
        if (list != null) {
            arrayList2 = new ArrayList(r3d.q(list, 10));
            for (l4h0 l4h0Var2 : list) {
                String strValueOf6 = l4h0Var2.f19405a;
                if (strValueOf6 == null) {
                    Integer num6 = l4h0Var2.b;
                    strValueOf6 = num6 != null ? String.valueOf(num6.intValue()) : null;
                    if (strValueOf6 == null) {
                        strValueOf6 = "0";
                    }
                }
                Integer num7 = l4h0Var2.c;
                if (num7 == null || (strValueOf3 = String.valueOf(num7.intValue())) == null) {
                    strValueOf3 = "0";
                }
                Integer num8 = l4h0Var2.d;
                if (num8 == null || (strValueOf4 = String.valueOf(num8.intValue())) == null) {
                    strValueOf4 = "0";
                }
                arrayList2.add(new ue90(strValueOf6, strValueOf3, strValueOf4));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        ?? r12 = arrayList2;
        String strJ1 = sj3.j0((i4h0Var == null || (h4h0Var2 = i4h0Var.b) == null || (g4h0Var2 = h4h0Var2.f12432a) == null) ? null : g4h0Var2.f10667a, str3);
        if (i4h0Var != null && (h4h0Var = i4h0Var.b) != null && (g4h0Var = h4h0Var.f12432a) != null) {
            str = g4h0Var.b;
        }
        return new bwm0(strJ0, strJ1, sj3.j0(str, str4), str5, str6, r12);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    public static final nfp0 x(qfp0 qfp0Var) {
        jfp0 jfp0Var;
        Long l;
        qfp0Var.getClass();
        Long l2 = qfp0Var.f28648a;
        hfp0 hfp0Var = qfp0Var.c;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        String strValueOf = (hfp0Var == null || (l = hfp0Var.b) == null) ? null : String.valueOf(l.longValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        List<mfp0> list = hfp0Var != null ? hfp0Var.c : null;
        if (list == null) {
            list = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (mfp0 mfp0Var : list) {
            Integer num = mfp0Var.f21705a;
            if (num != null) {
                int iIntValue = num.intValue();
                String str = mfp0Var.b;
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    jfp0Var = null;
                } else {
                    jfp0Var = new jfp0(iIntValue, str);
                }
            } else {
                jfp0Var = null;
            }
            if (jfp0Var != null) {
                arrayList.add(jfp0Var);
            }
        }
        return new nfp0(jLongValue, strValueOf, arrayList);
    }

    public static String y(vuw0 vuw0Var) {
        StringBuilder sb = new StringBuilder(vuw0Var.g());
        for (int i = 0; i < vuw0Var.g(); i++) {
            byte b = vuw0Var.b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
