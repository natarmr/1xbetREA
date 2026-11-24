package a;

import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParserException;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k5n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f17729a;

    public static final eml F(jic0 jic0Var, boolean z, List list, nw80 nw80Var, ctf0 ctf0Var) {
        long j = jic0Var.d;
        String str = jic0Var.e;
        String strA = dyq0.f6907a[nw80Var.ordinal()] == 1 ? ctf0Var.b.a(R.string.slot_game_of_the_week, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.livecasino_game_of_the_week, Arrays.copyOf(new Object[0], 0));
        StringBuilder sb = new StringBuilder(ujn.h);
        String str2 = jic0Var.c;
        if (str2.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
            sb.setLength(0);
            sb.append(str2);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str2, '/'));
        }
        return new eml(j, str, strA, new n0x(sb.toString()), new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6), z, new m0x(R.drawable.ic_glyph_favourite_active, null, 6), new m0x(R.drawable.ic_glyph_favourite_inactive, null, 6), list.contains(Long.valueOf(jic0Var.d)), ctf0Var.b.a(R.string.aggregator_play, Arrays.copyOf(new Object[0], 0)), false);
    }

    public static final void a(mm40 mm40Var, String str, vx3 vx3Var, long j, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        long coefLower;
        fet fetVar2 = fetVar;
        fetVar2.g0(1566583306);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar2.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i5 = i3 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.e(vx3Var.ordinal()) ? 256 : 128) | (fetVar2.f(j) ? 2048 : 1024);
        if (fetVar2.U(i5 & 1, (i5 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            if (vx3Var == vx3.UP) {
                fetVar2.e0(968815906);
                coefLower = ((IndividualColors) fetVar2.k(j7x.f16059a)).getCoefHigher();
                fetVar2.r(false);
            } else {
                fetVar2.e0(968875395);
                coefLower = ((IndividualColors) fetVar2.k(j7x.f16059a)).getCoefLower();
                fetVar2.r(false);
            }
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var2);
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
            zcl zclVar = qmk.f28987a;
            dww.c(iom0.r(jpm0.t(vx3Var.f38182a, 6, fetVar2), fetVar2), null, o7k0.n(jm40Var, 14.0f), coefLower, fetVar2, 56, 0);
            v8q0.a(str, o7k0.d(s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), coefLower, null, j, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, ((i5 >> 3) & 14) | ((i5 << 3) & 57344), 24960, 110568);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i5n0(mm40Var2, str, vx3Var, j, i, i2, (byte) 1);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        fetVar.g0(257441615);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.g(str3) ? 256 : 128) | (fetVar.g(mm40Var) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
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
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            zcl zclVar = qmk.f28987a;
            int i3 = i2 << 3;
            j(rsm0.w(R.string.toto_pool_from, 0, fetVar), str, str2, s5x0.N(x7zVar, 0.0f, 0.0f, 2.0f, 0.0f, 11), null, 0L, fetVar, (i3 & 112) | 3072 | (i3 & 896));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            n((i2 >> 3) & 112, fetVar, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 2.0f, 0.0f, 0.0f, 0.0f, 14), str3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cm5(str, str2, str3, mm40Var, i, (byte) 7);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fetVar.g0(-1485805392);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
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
            mbc.k(rsm0.w(R.string.toto_tiraj, 0, fetVar), str, 5, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, 0L, fetVar, (i2 << 3) & 112);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mbc.k(rsm0.w(R.string.toto_accept_bets_to, 0, fetVar), str2, 6, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, 0L, fetVar, i2 & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(str, str2, mm40Var, i, (byte) 29);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1945339096);
        int i2 = (fetVar2.g(str) ? 4 : 2) | i | (fetVar.g(mm40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(o7k0.w(mm40Var, null, false, 3), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_cyber_cs2_cup, 0, fetVar2);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            dww.c(pm80VarF, null, twn.l(gqw0.k, o7k0.n(jm40Var, 32.0f)), jM130getWhite600d7_KjU, fetVar2, 56, 0);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
            v8q0.a(rsm0.w(R.string.toto_jackpot, 0, fetVar2), o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), staticColors.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 28032, 102396);
            str2 = str;
            aad.e(str2, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), y9q0.a(g1t0.j(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), null, 2, false, 1, 0, null, new n05(idm0.t(12), idm0.t(16), idm0.t(1)), fetVar, (i2 & 14) | 1597440, 424);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(str2, mm40Var, i, (byte) 10);
        }
    }

    public static final void f(pz40 pz40Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1658711944);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objN = pym0.n(fetVar);
            Object obj = ((mgs) pz40Var.getValue()).f21758a;
            Object obj2 = ((mgs) pz40Var.getValue()).b.f26469a;
            vx3 vx3Var = ((mgs) pz40Var.getValue()).b.b;
            boolean zG = fetVar.g(obj) | fetVar.g(obj2) | fetVar.g(objN) | fetVar.e(vx3Var.ordinal());
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                Object stl0Var = new stl0(obj, obj2, objN, (Object) vx3Var, (byte) 7);
                fetVar.o0(stl0Var);
                objP = stl0Var;
            }
            x4n0.a(jm40Var, (Function2) objP, fetVar, i2 & 14, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(pz40Var, i);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(281491477);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.p(jm40Var, 122.0f, 132.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 9);
        }
    }

    public static final void h(int i, fet fetVar, boolean z) {
        pcy pcyVar;
        pm80 pm80VarF;
        fet fetVar2 = fetVar;
        fetVar2.g0(1093590922);
        int i2 = i | (fetVar.h(z) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 36.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, s6t0.b().f33626a.getBackgroundGroup(), jd8.n), xfn.a(fetVar2).d, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar2);
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
            v8q0.a(Separators.POUND, zhg0Var.a(0.05f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 6, 24960, 109560);
            mm40 mm40VarA = zhg0Var.a(0.59f, jm40Var, true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarA);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            pcy pcyVar3 = pcyVar;
            v8q0.a(rsm0.w(R.string.name_title, 0, fetVar), s5x0.L(o7k0.s(jm40Var, 128.0f), 8.0f, 0.0f, 2), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
            v8q0.a(rsm0.w(R.string.age, 0, fetVar), zhg0Var.a(1.0f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar.r(true);
            v8q0.a(rsm0.w(R.string.games_header, 0, fetVar), zhg0Var.a(0.18f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarA2 = zhg0Var.a(0.18f, jm40Var, true);
            thg0 thg0VarA3 = shg0.a(uc9.f, yx7Var, fetVar2, 54);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarA2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA3, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            if (z) {
                fetVar2.e0(-2070568613);
                pm80VarF = a8k0.F(R.drawable.ic_hockey_goal, 0, fetVar2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2070469630);
                pm80VarF = a8k0.F(R.drawable.ic_green_check, 0, fetVar2);
                fetVar2.r(false);
            }
            j0x.b(pm80VarF, null, null, null, null, 0.0f, null, fetVar2, 56, 124);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxi0((byte) 21, i, z);
        }
    }

    public static final void i(mm40 mm40Var, String str, String str2, int i, y9q0 y9q0Var, y9q0 y9q0Var2, fet fetVar, int i2) {
        String str3;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1724276824);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            str3 = str2;
            i3 |= fetVar2.g(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.g(y9q0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.g(y9q0Var2) ? 131072 : 65536;
        }
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar2.Z();
            int i4 = i2 & 1;
            jm40 jm40Var = jm40.b;
            if (i4 == 0 || fetVar2.B()) {
                mm40Var2 = jm40Var;
            } else {
                fetVar2.X();
                mm40Var2 = mm40Var;
            }
            fetVar2.s();
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = mu90.n;
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var2);
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
            int i5 = (i3 >> 9) & 14;
            mm40Var = mm40Var2;
            int i6 = i3;
            v8q0.a(str, mrv.k0(jm40Var, "title"), 0L, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 1, 0, null, y9q0Var, fetVar2, ((i3 >> 3) & 14) | 48, i5 | 28032 | ((i3 << 9) & 29360128), 101372);
            mm40 mm40VarK0 = mrv.k0(jm40Var, "timer");
            zcl zclVar = qmk.f28987a;
            v8q0.a(str3, s5x0.N(mm40VarK0, 4.0f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 0, false, 1, 0, null, y9q0Var2, fetVar, (i6 >> 6) & 14, i5 | 27648 | ((i6 << 6) & 29360128), 105468);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        mm40 mm40Var3 = mm40Var;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnr0(mm40Var3, str, str2, i, y9q0Var, y9q0Var2, i2, (byte) 1);
        }
    }

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
    public static final void j(String str, String str2, String str3, mm40 mm40Var, y9q0 y9q0Var, long j, fet fetVar, int i) {
        int i2;
        String str4;
        y9q0 y9q0Var2;
        long j2;
        fet fetVar2;
        long j3;
        int i3;
        y9q0 y9q0Var3;
        int i4;
        int i5;
        fet fetVar3 = fetVar;
        zx7 zx7Var = gqw0.d;
        fetVar3.g0(378215521);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str4 = str3;
            i2 |= fetVar3.g(str4) ? 256 : 128;
        } else {
            str4 = str3;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.g(zx7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar3.g(mm40Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= 524288;
        }
        if (fetVar3.U(i2 & 1, (599187 & i2) != 599186)) {
            fetVar3.Z();
            if ((i & 1) == 0 || fetVar3.B()) {
                y9q0 y9q0VarA = y9q0.a(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), StaticColors.INSTANCE.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                j3 = qmk.o;
                i3 = i2 & (-4128769);
                y9q0Var3 = y9q0VarA;
            } else {
                fetVar3.X();
                i3 = i2 & (-4128769);
                y9q0Var3 = y9q0Var;
                j3 = j;
            }
            fetVar3.s();
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            if (zx7Var.equals(gqw0.f11754a) || zx7Var.equals(zx7Var) || zx7Var.equals(gqw0.g)) {
                i4 = 5;
            } else {
                if (zx7Var.equals(gqw0.b) || zx7Var.equals(gqw0.e) || zx7Var.equals(gqw0.h)) {
                    i4 = 3;
                } else {
                    i5 = (zx7Var.equals(gqw0.c) || zx7Var.equals(gqw0.f) || zx7Var.equals(gqw0.i)) ? 6 : 0;
                }
                y9q0 y9q0VarG = g1t0.g();
                StaticColors staticColors = StaticColors.INSTANCE;
                i(null, str, str2, i5, y9q0.a(y9q0VarG, staticColors.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), y9q0.a(g1t0.d(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar3, (i3 << 3) & 1008);
                zcl zclVar = qmk.f28987a;
                y9q0 y9q0Var4 = y9q0Var3;
                long j4 = j3;
                aad.e(str4, o7k0.d(s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), 1.0f), y9q0.a(y9q0Var3, 0L, 0L, null, null, null, 0L, null, null, i5, 0, 0L, null, null, 16744447), null, 0, false, 1, 0, null, new n05(j4, y9q0Var4.f42262a.b, idm0.t(1)), fetVar, ((i3 >> 6) & 14) | 1572864, 440);
                fet fetVar4 = fetVar;
                fetVar4.r(true);
                y9q0Var2 = y9q0Var4;
                j2 = j4;
                fetVar2 = fetVar4;
            }
            i5 = i4;
            y9q0 y9q0VarG2 = g1t0.g();
            StaticColors staticColors2 = StaticColors.INSTANCE;
            i(null, str, str2, i5, y9q0.a(y9q0VarG2, staticColors2.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), y9q0.a(g1t0.d(), staticColors2.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar3, (i3 << 3) & 1008);
            zcl zclVar2 = qmk.f28987a;
            y9q0 y9q0Var5 = y9q0Var3;
            long j5 = j3;
            aad.e(str4, o7k0.d(s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), 1.0f), y9q0.a(y9q0Var3, 0L, 0L, null, null, null, 0L, null, null, i5, 0, 0L, null, null, 16744447), null, 0, false, 1, 0, null, new n05(j5, y9q0Var5.f42262a.b, idm0.t(1)), fetVar, ((i3 >> 6) & 14) | 1572864, 440);
            fet fetVar5 = fetVar;
            fetVar5.r(true);
            y9q0Var2 = y9q0Var5;
            j2 = j5;
            fetVar2 = fetVar5;
        } else {
            fetVar3.X();
            y9q0Var2 = y9q0Var;
            j2 = j;
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pnr0(str, str2, str3, mm40Var, y9q0Var2, j2, i, (byte) 1);
        }
    }

    public static final void k(mm40 mm40Var, znr0 znr0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-464699777);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(znr0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40Var, jM75getBlack600d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar));
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
            jm40 jm40Var = jm40.b;
            e(0, fetVar2, s5x0.N(jm40Var, 12.0f, 12.0f, 16.0f, 0.0f, 8), znr0Var.f44689a);
            mbc.o(wfi0.f39073a, o7k0.e(s5x0.L(jm40Var, 0.0f, 12.0f, 1), 1.0f), false, fetVar, 6, 4);
            fetVar2 = fetVar;
            d(0, fetVar2, o7k0.w(o7k0.d(s5x0.L(jm40Var, 12.0f, 0.0f, 2), 1.0f), null, false, 3), znr0Var.b, znr0Var.c);
            b(0, fetVar2, o7k0.w(o7k0.d(s5x0.J(jm40Var, 12.0f), 1.0f), null, false, 3), znr0Var.d, znr0Var.f, znr0Var.e);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) znr0Var, i, (byte) 29);
        }
    }

    public static final void l(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(1505003294);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 64.0f);
            zfn zfnVar = zaq0.b;
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.S(mm40VarN, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 10.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            n05 n05Var = new n05(idm0.t(16), idm0.t(24), idm0.t(1));
            f2q0 f2q0Var = new f2q0(3);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarD, textPrimary, n05Var, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 1, 0, null, g1t0.p(), fetVar, (i2 & 14) | 48, 24960, 109552);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            n05 n05Var2 = new n05(idm0.t(10), idm0.t(12), idm0.t(1));
            f2q0 f2q0Var2 = new f2q0(3);
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            str3 = str2;
            v8q0.a(str3, mm40VarD2, secondary, n05Var2, 0L, null, null, null, 0L, f2q0Var2, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, ((i2 >> 3) & 14) | 48, 24960, 109552);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 23, i, str, str3);
        }
    }

    public static final void m(String str, String str2, String str3, boolean z, String str4, mm40 mm40Var, fet fetVar, int i) {
        mm40 mm40VarU;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str3.getClass();
        str4.getClass();
        fetVar2.g0(203442384);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16) | (fetVar2.g(str3) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.g(str4) ? 16384 : 8192) | (fetVar2.g(mm40Var) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            l7m0 l7m0VarB = m5k0.b(z ? kkg.y : kkg.x, ro4.m0(500, 0, null, 6), fetVar2, 48, 12);
            l7m0 l7m0VarB2 = m5k0.b(z ? kkg.y : StaticColors.INSTANCE.m62getBlack0d7_KjU(), ro4.m0(500, 0, null, 6), fetVar, 48, 12);
            StaticColors staticColors = StaticColors.INSTANCE;
            l7m0 l7m0VarB3 = m5k0.b(z ? staticColors.m62getBlack0d7_KjU() : staticColors.m123getWhite0d7_KjU(), ro4.m0(500, 0, null, 6), fetVar, 48, 12);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "TWENTY_ONE_DOTA_HERO");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
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
            boolean z3 = fetVar.k(bmd.n) == k6z.b;
            mm40 mm40VarU2 = jm40.b;
            mm40 mm40VarV = yyw.V(mm40VarU2, z3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40VarV, 64.0f), 88.0f);
            if (z) {
                zcl zclVar2 = qmk.d;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40VarU2 = bww.U(mm40VarU2, 8.0f, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), 4);
                mm40VarU = mm40VarU2;
            } else {
                mm40VarU = mm40VarU2;
            }
            mm40 mm40VarE2 = mm40VarE.e(mm40VarU2);
            zcl zclVar3 = qmk.d;
            ugg0 ugg0Var2 = vgg0.f37379a;
            k7x.a(str, null, i120.S(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE2), 1.0f, ((y3d) l7m0VarB.getValue()).f41946a, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), gqw0.A, null, fetVar, (i2 & 14) | 1572912, 1976);
            mm40 mm40VarQ = ffb0.Q(o7k0.n(mm40VarU, 28.0f), 44.0f, 68.0f);
            if (z) {
                zcl zclVar4 = qmk.e;
                mm40 mm40Var3 = mm40VarU;
                mm40VarU = bww.U(mm40Var3, 4.0f, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4), staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), 4);
                mm40Var2 = mm40Var3;
            } else {
                mm40Var2 = mm40VarU;
            }
            mm40 mm40VarE3 = mm40VarQ.e(mm40VarU);
            zcl zclVar5 = qmk.e;
            mm40 mm40VarS = i120.S(i120.Q(h97.e(zclVar5, zclVar5, zclVar5, zclVar5, mm40VarE3), ((y3d) l7m0VarB2.getValue()).f41946a, jd8.n), 1.0f, ((y3d) l7m0VarB.getValue()).f41946a, new ugg0(zclVar5, zclVar5, zclVar5, zclVar5));
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            v8q0.a(str2, o2e.e0(s5x0.J(mm40Var2, 2.0f), "TWENTY_ONE_DOTA_SCORE"), ((y3d) l7m0VarB3.getValue()).f41946a, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 >> 3) & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            a4n0.c((i2 >> 6) & 1022, fetVar2, ffb0.Q(mm40Var2, 36.0f, -24.0f), str3, str4, z);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw8(str, str2, str3, z, str4, mm40Var, i);
        }
    }

    public static final void n(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        fetVar.g0(-807072073);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mbc.k(rsm0.w(R.string.toto_till_end, 0, fetVar), str, 6, mm40Var, null, null, 0L, fetVar, (i2 & 112) | ((i2 << 9) & 7168));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str, i, (byte) 24);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-100247259);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
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
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 56.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            vqm vqmVar = vqm.b;
            qxw.o(fetVar, xbc.c0(mm40VarE, vbc.d0(vqmVar, fetVar, 6, 0)));
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.n(jm40Var, 56.0f)), vbc.d0(vqmVar, fetVar, 6, 0), fetVar, true);
            l7m0 l7m0VarX = x(xczVarA, fetVar);
            x7z x7zVar = new x7z(1.0f, true);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, x7zVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarM = rq8.M(i4w0.T(jm40Var, new d4u0((byte) 28)), new mqr0(l7m0VarX, (byte) 10));
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new d4u0((byte) 27);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarM, xczVarA, null, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 817889280, 364);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vev0(mm40Var, i, b);
        }
    }

    public static final void q(final mm40 mm40Var, final aev0 aev0Var, final Function1 function1, final Function1 function2, fet fetVar, final int i) {
        int i2;
        aev0 aev0Var2;
        yfe0 yfe0VarU;
        Function2 function3;
        function1.getClass();
        function2.getClass();
        fetVar.g0(1516091574);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(aev0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (aev0Var.c.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function3 = new Function2() { // from class: a.uev0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = b;
                        int i3 = i;
                        switch (b2) {
                            case 0:
                                ((Integer) obj2).getClass();
                                k5n0.q(mm40Var, aev0Var, function1, function2, (fet) obj, x8x.L(i3 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                k5n0.q(mm40Var, aev0Var, function1, function2, (fet) obj, x8x.L(i3 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                aev0Var2 = aev0Var;
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(o7k0.e(mm40Var, 120.0f), 8.0f, 0.0f, 2);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
                jpm0.o(fetVar, thg0VarA, shdVar);
                shd shdVar2 = gqw0.w;
                jpm0.o(fetVar, bh90VarM, shdVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                shd shdVar3 = gqw0.y;
                jpm0.o(fetVar, numValueOf, shdVar3);
                jpm0.n(fetVar);
                shd shdVar4 = gqw0.v;
                jpm0.o(fetVar, mm40VarC0, shdVar4);
                jm40 jm40Var = jm40.b;
                y860.o(i2 & 896, fetVar, s5x0.N(o7k0.e(jm40Var, 120.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), aev0Var2.b, function1);
                l7m0 l7m0VarX = x(xczVarA, fetVar);
                x7z x7zVar = new x7z(1.0f, true);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar);
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
                byte b2 = 28;
                mm40 mm40VarM = rq8.M(i4w0.T(jm40Var, new d4u0(b2)), new mqr0(l7m0VarX, (byte) 10));
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
                Object objP = fetVar.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new xis0(aev0Var2, function2, b2);
                    fetVar.o0(objP);
                }
                b8k0.f(mm40VarM, xczVarA, null, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 492);
                fetVar.r(true);
                fetVar.r(true);
            }
            yfe0VarU.d = function3;
        }
        aev0Var2 = aev0Var;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            final aev0 aev0Var3 = aev0Var2;
            function3 = new Function2() { // from class: a.uev0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    int i3 = i;
                    switch (b4) {
                        case 0:
                            ((Integer) obj2).getClass();
                            k5n0.q(mm40Var, aev0Var3, function1, function2, (fet) obj, x8x.L(i3 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            k5n0.q(mm40Var, aev0Var3, function1, function2, (fet) obj, x8x.L(i3 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function3;
        }
    }

    public static final mxp r(mxp mxpVar, jsp jspVar) {
        if (mxpVar == null) {
            if (jspVar == null) {
                return null;
            }
            f7v0 f7v0Var = f7v0.f9077a;
            rxp rxpVar = new rxp(new byp(-1.0f, -1), new byp(-1.0f, -1), new byp(-1.0f, -1));
            vxp vxpVar = new vxp(new byp(-1.0f, -1), new byp(-1.0f, -1), new byp(-1.0f, -1));
            fyp fypVar = new fyp(new byp(-1.0f, -1), new byp(-1.0f, -1), new byp(-1.0f, -1));
            long j = jspVar.f17063a;
            String str = jspVar.c;
            int i = jspVar.d;
            int i2 = jspVar.e;
            int i3 = jspVar.f;
            String str2 = jspVar.g;
            if (((-247810) & 1) != 0) {
                j = -1;
            }
            if (((-247810) & 16384) != 0) {
                str = "";
            }
            return new mxp(j, -1, "", "", "", -1, f7v0Var, -1.0f, -1.0f, -1.0f, "", str2, "", "", str, i, i2, i3, -1, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, "", -1.0f, -1, -1, -1.0f, -1, -1, -1, -1, rxpVar, vxpVar, fypVar, -1, -1.0f);
        }
        int i4 = mxpVar.p;
        int i5 = mxpVar.q;
        int i6 = mxpVar.r;
        String str3 = mxpVar.l;
        long j2 = ((-231425) & 1) != 0 ? mxpVar.f22568a : 0L;
        int i7 = mxpVar.b;
        long j3 = j2;
        String str4 = mxpVar.c;
        String str5 = mxpVar.d;
        String str6 = mxpVar.e;
        int i8 = mxpVar.f;
        f7v0 f7v0Var2 = mxpVar.g;
        float f = mxpVar.h;
        float f2 = mxpVar.i;
        float f3 = mxpVar.j;
        String str7 = mxpVar.k;
        String str8 = mxpVar.m;
        String str9 = mxpVar.n;
        String str10 = ((-231425) & 16384) != 0 ? mxpVar.o : null;
        int i9 = mxpVar.s;
        int i10 = mxpVar.t;
        float f4 = mxpVar.u;
        float f5 = mxpVar.v;
        float f6 = mxpVar.w;
        float f7 = mxpVar.x;
        float f8 = mxpVar.y;
        float f9 = mxpVar.z;
        float f10 = mxpVar.A;
        String str11 = mxpVar.B;
        float f11 = mxpVar.C;
        int i11 = mxpVar.D;
        int i12 = mxpVar.E;
        float f12 = mxpVar.F;
        int i13 = mxpVar.G;
        int i14 = mxpVar.H;
        int i15 = mxpVar.I;
        int i16 = mxpVar.J;
        rxp rxpVar2 = mxpVar.K;
        vxp vxpVar2 = mxpVar.L;
        fyp fypVar2 = mxpVar.M;
        int i17 = mxpVar.N;
        float f13 = mxpVar.O;
        mxpVar.getClass();
        return new mxp(j3, i7, str4, str5, str6, i8, f7v0Var2, f, f2, f3, str7, str3, str8, str9, str10, i4, i5, i6, i9, i10, f4, f5, f6, f7, f8, f9, f10, str11, f11, i11, i12, f12, i13, i14, i15, i16, rxpVar2, vxpVar2, fypVar2, i17, f13);
    }

    public static final s6q0 s(String str, String str2, String str3, boolean z) {
        return new s6q0(str, e6q0.f7299a, k6q0.f17783a, str3.length() > 0 ? new s7q0(str3) : r7q0.f29989a, z, str3.length() > 0, null, str2, null, 32128);
    }

    public static final String t(Long l) {
        if (l == null) {
            return "";
        }
        rdj rdjVar = rdj.f30294a;
        ynq0 ynq0Var = new ynq0(l.longValue());
        sdj sdjVar = sdj.UNIVERSAL;
        return rdj.b(ynq0Var);
    }

    public static final String v(String str, List list) {
        Object next;
        String str2;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((haa0) next).f12715a, str));
        haa0 haa0Var = (haa0) next;
        return (haa0Var == null || (str2 = haa0Var.b) == null) ? "-" : str2;
    }

    public static final int w(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final l7m0 x(xcz xczVar, fet fetVar) {
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        boolean zG = fetVar.g(xczVar) | fetVar.g(w6kVar);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = jgk0.b(new ugu0(xczVar, w6kVar, (byte) 6));
            fetVar.o0(objP);
        }
        return (l7m0) objP;
    }

    public static final void y(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int next = xmlResourceParser.next();
        while (next != 2 && next != 1) {
            next = xmlResourceParser.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
    }
}
