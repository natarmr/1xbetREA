package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sip.message.Response;
import com.google.android.material.card.MaterialCardView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bethistory.domain.model.GeneralBetInfoModel;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fre0 {
    public static final ugd c;
    public static final ugd d;
    public static boolean q;
    public static int r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f10016a = new ugd(-126615658, false, new bhd(2));
    public static final ugd b = new ugd(1752654606, false, new fhd(3));
    public static final ugd e = new ugd(-1184956305, false, new qhd(14));
    public static final int[] f = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625};
    public static final int[] g = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};
    public static final int[] h = {0, 1, 2, 3, 4, 5, 6, 8, 10, 14, 18, 26, 34, 50, 66, 98, 130, 194, 322, 578, 1090, TokenTypes.REFER_TO, 6210, 22594};
    public static final int[] i = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};
    public static final int[] j = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 18, 22, 30, 38, 54, 70, 102, 134, 198, 326, 582, 1094, TokenTypes.MESSAGE};
    public static final int[] k = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};
    public static final int[] l = {0, 0, 8, 8, 0, 16, 8, 16, 16};
    public static final int[] m = {0, 8, 0, 8, 16, 0, 16, 8, 16};
    public static final cdl n = new cdl();
    public static final v0h0 o = new v0h0(new t9r0(24), new efr0(11));
    public static final Object p = new Object();

    static {
        byte b2 = 13;
        c = new ugd(1518428171, false, new ahd(b2));
        d = new ugd(1670604024, false, new qhd(b2));
    }

    public static final void A(xcm xcmVar, xdr xdrVar, fet fetVar, int i2) {
        int i3;
        xdrVar.getClass();
        fetVar.g0(-1385321702);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xcmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40Var, 64.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
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
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarC2 = o7k0.c(jm40Var, 1.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i5 = i3 & 896;
            y(mm40VarC2.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), xcmVar.f40652a, xdrVar, fetVar, i5);
            mm40 mm40VarC3 = o7k0.c(jm40Var, 1.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            z(mm40VarC3.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), xcmVar.b, xdrVar, fetVar, i5);
            fetVar.r(true);
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            androidx.compose.runtime.d dVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(dVar)).getBackgroundContent();
            ugg0 ugg0Var = vgg0.f37379a;
            dww.b(jpm0.t(R.drawable.ic_glyph_chevron_right_small, 6, fetVar), null, o2e.e0(s5x0.J(i120.S(i120.Q(mm40VarN, backgroundContent, ugg0Var), 1.0f, ((ThemeColors) fetVar.k(dVar)).getSeparator60(), ugg0Var), 4.0f), "ICON_RIGHT"), ((ThemeColors) fetVar.k(dVar)).getSecondary80(), fetVar, 48, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl(xcmVar, xdrVar, i2);
        }
    }

    public static final void B(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(2059286237);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dib(function1, (byte) 28);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, b2);
        }
    }

    public static final void C(mm40 mm40Var, Function0 function0, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i2) {
        int i3;
        function0.getClass();
        fetVar.g0(1014558138);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(ugdVar3) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(mm40Var, 56.0f), 1.0f), "SPORT_GAME_TOOLBAR_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
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
            jm40 jm40Var = jm40.b;
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
            mm40 mm40VarN = s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            yx7 yx7Var = gqw0.k;
            zhg0 zhg0Var = zhg0.f44392a;
            j120.g(i3 & 112, fetVar, o7k0.n(zhg0Var.b(yx7Var, mm40VarN), 24.0f), function0);
            qxw.o(fetVar, zhg0Var.a(1.0f, o7k0.c(jm40Var, 1.0f), true));
            ugdVar2.j(zhg0Var, o7k0.n(zhg0Var.b(yx7Var, s5x0.N(jm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11)), 24.0f), fetVar, Integer.valueOf(((i3 >> 3) & 896) | 6));
            ugdVar.j(zhg0Var, o7k0.n(zhg0Var.b(yx7Var, s5x0.N(jm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11)), 24.0f), fetVar, Integer.valueOf((i3 & 896) | 6));
            fetVar.r(true);
            ugdVar3.j(jr8.f16991a, s5x0.L(jm40Var, 96.0f, 0.0f, 2).e(o7k0.c), fetVar, Integer.valueOf(((i3 >> 6) & 896) | 6));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rnr(mm40Var, function0, ugdVar, ugdVar2, ugdVar3, i2, (byte) 0);
        }
    }

    public static final void D(hh80 hh80Var, l7m0 l7m0Var, fet fetVar, int i2) {
        int i3;
        byte b2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-361649112);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(hh80Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(l7m0Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            u000 u000Var = (u000) l7m0Var.getValue();
            mm40 mm40VarL = s5x0.L(s5x0.I(o7k0.c, hh80Var), xfn.a(fetVar2).d, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            j0x.a(jpm0.t(R.drawable.limits_approve, 6, fetVar2), null, 0.0f, fetVar2, 124);
            String str = u000Var.f34831a;
            zfn zfnVar = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.q(), fetVar, 0, 24960, 109562);
            v8q0.a(u000Var.b, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 130042);
            fetVar2 = fetVar;
            b2 = 1;
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fbk(hh80Var, l7m0Var, i2, b2);
        }
    }

    public static final void E(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(2100963756);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            t(l7m0Var, function1, fetVar, i3 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, (byte) 29);
        }
    }

    public static final void F(mm40 mm40Var, m2k0 m2k0Var, int i2, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i3) {
        fetVar.g0(-1101498639);
        int i4 = i3 | (fetVar.g(m2k0Var) ? 32 : 16) | (fetVar.e(i2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            hkb.o(xczVarA, i2, m2k0Var.c, function0, fetVar, (i4 >> 3) & 7280);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "TRANSACTION_CELL_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 24.0f, 5);
            boolean z = ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((i4 & 458752) == 131072);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new on((Object) m2k0Var, (Object) function1, (Object) function2, (byte) 22);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, m2k0Var, i2, function1, function0, function2, i3);
        }
    }

    public static final void G(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-137154633);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
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
            zcl zclVar = qmk.f28987a;
            ghm0.j(s5x0.L(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).e, 0.0f, 2), new ijm(), fetVar, 0);
            hfm0.o(0, 1, fetVar, null);
            hfm0.o(0, 0, fetVar, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13));
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 19);
        }
    }

    public static final void H(final mm40 mm40Var, final float f2, final long j2, final long j3, final boolean z, fet fetVar, final int i2) {
        int i3;
        int i4;
        fetVar.g0(-1090549557);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.d(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.f(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.f(j3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new rt2(f2, (byte) 3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG = fetVar.g(function0);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new y(function0, (byte) 15);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40Var, true, (Function1) objP2);
            boolean zG2 = fetVar.g(function0) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((i3 & 57344) == 16384);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                i4 = 0;
                Object yn8Var = new yn8(function0, j3, j2, z);
                fetVar.o0(yn8Var);
                objP3 = yn8Var;
            } else {
                i4 = 0;
            }
            p8a.k(mm40VarA, (Function1) objP3, fetVar, i4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.zn8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    fre0.H(mm40Var, f2, j2, j3, z, (fet) obj2, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void I(final float f2, final int i2, final int i3, final mm40 mm40Var, final long j2, long j3, fet fetVar, final int i4) {
        final long j4;
        long separator60;
        int i5;
        fet fetVar2 = fetVar;
        fetVar2.g0(1176225538);
        int i6 = i4 | (fetVar2.d(f2) ? 4 : 2) | (fetVar2.e(i2) ? 32 : 16) | (fetVar2.e(i3) ? 256 : 128) | (fetVar2.g(mm40Var) ? 2048 : 1024) | (fetVar2.f(j2) ? 16384 : 8192) | 65536;
        if (fetVar2.U(i6 & 1, (74899 & i6) != 74898)) {
            fetVar2.Z();
            if ((i4 & 1) == 0 || fetVar2.B()) {
                separator60 = ((ThemeColors) fetVar2.k(zaq0.b)).getSeparator60();
                i5 = i6 & (-458753);
            } else {
                fetVar2.X();
                i5 = i6 & (-458753);
                separator60 = j3;
            }
            fetVar2.s();
            zx7 zx7Var = gqw0.h;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 60.0f);
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            int i7 = i5;
            mm40 mm40VarE0 = o2e.e0(r8x.X(o7k0.c, fetVar2.k(bmd.n) == k6z.f17794a ? -1.0f : 1.0f, -1.0f), "CircularProgressIndicator");
            boolean z2 = (i7 & 14) == 4;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new rt2(f2, (byte) 10);
                fetVar2.o0(objP);
            }
            long j5 = separator60;
            p3c0.b((Function0) objP, mm40VarE0, j2, 6.0f, j5, -4.0f, fetVar, ((i7 >> 6) & 896) | 1572864);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarR = ffb0.R(jm40Var, 0.0f, 2.0f, 1);
            x5d x5dVarA = w5d.a(uc9.d, gqw0.n, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarR);
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
            j0x.b(a8k0.F(R.drawable.ic_glyph_shield, 0, fetVar), null, o2e.e0(o7k0.n(jm40Var, 28.0f), "SecurityCircularProgressImage"), null, null, 0.0f, new m78(j2, 5), fetVar, 56, 56);
            String strN = w6x.n(i2, i3, Separators.SLASH);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarB = g1t0.b();
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            psq psqVar = psq.g;
            mm40 mm40VarS = o7k0.s(jm40Var, 36.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            v8q0.a(strN, s5x0.K(i120.Q(s5x0.J(i120.Q(mm40VarS, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ugg0Var), 2.0f), j2, ugg0Var), 4.0f, 2.0f), jM123getWhite0d7_KjU, null, 0L, null, psqVar, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarB, fetVar, 1572864, 24576, 113592);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            j4 = j5;
        } else {
            fetVar2.X();
            j4 = j3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(f2, i2, i3, mm40Var, j2, j4, i4) { // from class: a.znh0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f44674a;
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ mm40 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    fre0.I(this.f44674a, this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void J(int i2, int i3, fet fetVar, mm40 mm40Var, String str) {
        int i4;
        fet fetVar2 = fetVar;
        fetVar2.g0(1576265977);
        int i5 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.e(i2) ? 256 : 128);
        if (fetVar2.U(i5 & 1, (i5 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            zhg0 zhg0Var = zhg0.f44392a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            y9q0 y9q0VarH = g1t0.h();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarA, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0VarH, fetVar, (i5 >> 3) & 14, 24960, 109560);
            mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarA2, 6.0f);
            long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarJ = s5x0.J(jm40Var, 1.0f);
            long jM98getGreen0d7_KjU = staticColors.m98getGreen0d7_KjU();
            long jM121getTransparent0d7_KjU = staticColors.m121getTransparent0d7_KjU();
            boolean z2 = (i5 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new y02(i2, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new dj1((byte) 20);
                fetVar.o0(objP2);
            }
            p3c0.c(function0, mm40VarJ, jM98getGreen0d7_KjU, jM121getTransparent0d7_KjU, 1, 8.0f, (Function1) objP2, fetVar, 1572864, 0);
            fetVar.r(true);
            i4 = i2;
            v8q0.a(f140.i(i4, Separators.PERCENT), zhg0Var.a(1.0f, jm40Var, true), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            i4 = i2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str, i4, i3, (byte) 1);
        }
    }

    public static final void K(cp cpVar) {
        akj0 akj0VarC;
        float dimensionPixelSize = cpVar.f40887a.getContext().getResources().getDimensionPixelSize(R.dimen.corner_radius_8);
        cs6 cs6Var = (cs6) cpVar.u;
        MaterialCardView materialCardView = cs6Var.c;
        if (((r07) cpVar.u()).c) {
            daf dafVarL = cs6Var.c.getShapeAppearanceModel().l();
            dafVarL.b = k7x.A(0);
            dafVarL.f = new q0(dimensionPixelSize);
            dafVarL.c = k7x.A(0);
            dafVarL.g = new q0(dimensionPixelSize);
            dafVarL.T(0.0f);
            dafVarL.U(0.0f);
            akj0VarC = dafVarL.c();
        } else {
            daf dafVarL2 = cs6Var.c.getShapeAppearanceModel().l();
            dafVarL2.b = k7x.A(0);
            dafVarL2.f = new q0(dimensionPixelSize);
            dafVarL2.c = k7x.A(0);
            dafVarL2.g = new q0(dimensionPixelSize);
            dafVarL2.e = k7x.A(0);
            dafVarL2.T(dimensionPixelSize);
            dafVarL2.d = k7x.A(0);
            dafVarL2.U(dimensionPixelSize);
            akj0VarC = dafVarL2.c();
        }
        materialCardView.setShapeAppearanceModel(akj0VarC);
    }

    public static final t73 L(t73 t73Var) {
        t73 t73VarC = t73Var.c();
        int iB = t73VarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            t73VarC.e(t73Var.a(i2), i2);
        }
        return t73VarC;
    }

    public static final Object M(kiy kiyVar) {
        Class clsG = azw.G(g7x.G(kiyVar));
        if (clsG.isArray()) {
            Object objNewInstance = Array.newInstance(clsG.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new poe("Cannot instantiate the default empty array of type " + clsG.getSimpleName() + ", because it is not an array type");
    }

    public static final ArrayList N(long j2, boolean z, long j3) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTimeInMillis(j3);
        Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar2.setTimeInMillis(j2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!(z ? calendar.after(calendar2) : calendar2.before(calendar))) {
                return arrayList;
            }
            arrayList.add(z ? R(calendar2, z) : R(calendar, z));
            if (z) {
                calendar2.add(6, 1);
            } else {
                calendar.add(6, -1);
            }
        }
    }

    public static final CyberCalendarPeriodUiModel O(long j2) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTimeInMillis(j2);
        return S(calendar);
    }

    public static final Object P(dre0 dre0Var) {
        Class clsV;
        dre0Var.getClass();
        Object objL = dre0Var.L();
        if (!(dre0Var instanceof ire0) || !gnm0.p((ire0) dre0Var)) {
            Iterator it = dre0Var.a().iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Object next = it.next();
                if (((hre0) next).n() != aiy.d) {
                    if (!z) {
                        z = true;
                        obj = next;
                    }
                }
                obj = null;
                break;
            }
            hre0 hre0Var = (hre0) obj;
            kiy kiyVarP = hre0Var != null ? hre0Var.p() : null;
            if (kiyVarP != null && (clsV = gnm0.v(kiyVarP)) != null) {
                return gnm0.l(clsV, dre0Var).invoke(objL, null);
            }
        }
        return objL;
    }

    public static final CyberCalendarPeriodUiModel Q(Calendar calendar) {
        calendar.getClass();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return new CyberCalendarPeriodUiModel(timeInMillis, calendar.getTimeInMillis());
    }

    public static final CyberCalendarPeriodUiModel R(Calendar calendar, boolean z) {
        calendar.set(11, z ? 0 : 23);
        calendar.set(12, z ? 0 : 59);
        calendar.set(13, z ? 0 : 59);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(6, z ? 2 : -2);
        calendar.set(11, z ? 23 : 0);
        calendar.set(12, z ? 59 : 0);
        calendar.set(13, z ? 59 : 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        long j2 = z ? timeInMillis : timeInMillis2;
        if (z) {
            timeInMillis = timeInMillis2;
        }
        return new CyberCalendarPeriodUiModel(j2, timeInMillis);
    }

    public static final CyberCalendarPeriodUiModel S(Calendar calendar) {
        calendar.set(5, calendar.getActualMinimum(5));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return new CyberCalendarPeriodUiModel(timeInMillis, calendar.getTimeInMillis());
    }

    public static final String T(Calendar calendar, Calendar calendar2) {
        String strC;
        if (calendar.get(1) == calendar2.get(1)) {
            strC = rdj.c(rdj.f30294a, sdj.UNIQUE_4, calendar2.getTime(), null, 60);
        } else {
            strC = rdj.c(rdj.f30294a, sdj.UNIQUE_5, calendar2.getTime(), null, 60);
        }
        return sj3.N(strC);
    }

    public static final CyberCalendarPeriodUiModel U(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(7, 6);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return new CyberCalendarPeriodUiModel(timeInMillis, calendar.getTimeInMillis());
    }

    public static final boolean V(dre0 dre0Var) {
        dre0Var.getClass();
        return X(dre0Var) && dre0Var.K().j().isAnnotation();
    }

    public static final boolean W(dre0 dre0Var) {
        dre0Var.getClass();
        return dre0Var.L() != op9.NO_RECEIVER;
    }

    public static final boolean X(dre0 dre0Var) {
        dre0Var.getClass();
        return Intrinsics.d(dre0Var.getName(), "<init>");
    }

    public static final mm40 Y(mm40 mm40Var, Function1 function1) {
        return mm40Var.e(new lh60(function1));
    }

    public static final boolean Z(long j2, long j3, long j4, long j5) {
        return Math.min(j3, j5) - Math.max(j2, j4) >= 0;
    }

    public static final void a(dh dhVar, fet fetVar, int i2) {
        ljc ljcVar = jd8.n;
        fetVar.g0(1982245173);
        int i3 = (fetVar.g(dhVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
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
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.n(mm40VarB, 24.0f), "AchievementIconSlotTestTag");
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new t1(dhVar, (byte) 8);
                fetVar.o0(objP);
            }
            dww.c(a8k0.F(dhVar.c, 0, fetVar), "", pai0.a(mm40VarE0, false, (Function1) objP), dhVar.d, fetVar, 56, 0);
            if (dhVar.b) {
                fetVar.e0(1023340218);
                qxw.o(fetVar, i120.Q(jr8Var.b(o7k0.e(o7k0.s(jm40Var, 1.0f), 14.0f), gqw0.h), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar));
                fetVar.r(false);
            } else {
                fetVar.e0(1023660231);
                fetVar.r(false);
            }
            if (dhVar.f6068a) {
                fetVar.e0(1023702205);
                qxw.o(fetVar, i120.Q(jr8Var.b(o7k0.e(o7k0.s(jm40Var, 1.0f), 14.0f), gqw0.b), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar));
                fetVar.r(false);
            } else {
                fetVar.e0(1024019335);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iob0(dhVar, i2);
        }
    }

    public static final o0x a0(qcm qcmVar, fet fetVar) {
        boolean zG = fetVar.g(qcmVar);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            if (qcmVar instanceof ocm) {
                objP = ((ocm) qcmVar).f25033a;
            } else {
                if (!(qcmVar instanceof pcm)) {
                    t9f.b();
                    return null;
                }
                objP = new m0x(((pcm) qcmVar).f26766a.f23301a, null, 6);
            }
            fetVar.o0(objP);
        }
        return (o0x) objP;
    }

    public static final void b(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        xczVar.getClass();
        d9zVar.getClass();
        xczVar2.getClass();
        xczVar3.getClass();
        function1.getClass();
        fetVar.g0(790144758);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(d9zVar) ? 2048 : 1024) | (fetVar.g(xczVar2) ? 16384 : 8192) | (fetVar.g(xczVar3) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "AGGREGATOR_TOURNAMENT_FULL_INFO_PICTURE_SCREEN");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int iOrdinal = ((ev1) l7m0Var.getValue()).d().ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(712306732);
                saj.c(null, l7m0Var, xczVar, d9zVar, xczVar2, xczVar3, function1, fetVar, 4194288 & i3);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(712783016);
                tke.i(null, l7m0Var, xczVar, d9zVar, xczVar2, xczVar3, function1, fetVar, 4194288 & i3);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(713259083);
                j2e.e(null, l7m0Var, xczVar, d9zVar, xczVar2, xczVar3, function1, fetVar, 4194288 & i3);
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(1685544026, fetVar, false);
                }
                fetVar.e0(713729198);
                y9a.d(null, l7m0Var, xczVar, d9zVar, xczVar2, xczVar3, function1, fetVar, 4194288 & i3);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0(mm40Var2, l7m0Var, xczVar, d9zVar, xczVar2, xczVar3, function1, i2);
        }
    }

    public static final mm40 b0(boolean z, boolean z2, Function0 function0) {
        mm40 qum0Var = jm40.b;
        if (!z || !pum0.f27625a) {
            return qum0Var;
        }
        if (z2) {
            qum0Var = new qum0(n);
        }
        return qum0Var.e(new num0(function0));
    }

    public static final void c(mm40 mm40Var, n4i0 n4i0Var, fet fetVar, int i2) {
        int i3;
        byte b2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-526083605);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(n4i0Var) : fetVar2.i(n4i0Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 0.0f, xfn.a(fetVar2).c, 0.0f, 11);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN2 = s5x0.N(mm40VarA, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            String str = n4i0Var.k;
            y9q0 y9q0VarF = g1t0.f();
            StaticColors staticColors = StaticColors.INSTANCE;
            b2 = 1;
            v8q0.a(str, mm40VarN2, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0VarF, fetVar, 0, 24960, 109560);
            zq8.a(0, fetVar, zhg0Var.a(1.0f, jm40Var, true));
            v8q0.a(Separators.PERCENT, s5x0.N(zhg0Var.a(1.0f, jm40Var, true), 0.0f, 8.0f, 0.0f, 0.0f, 13), staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.f(), fetVar, 6, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
            J(n4i0Var.b, 0, fetVar2, s5x0.L(jm40Var, 0.0f, 16.0f, 1), n4i0Var.f22900a);
            jcb.v(null, 0.0f, staticColors.m73getBlack400d7_KjU(), fetVar2, 0, 3);
            J(n4i0Var.d, 0, fetVar2, s5x0.L(jm40Var, 0.0f, 16.0f, 1), n4i0Var.c);
            jcb.v(null, 0.0f, staticColors.m73getBlack400d7_KjU(), fetVar2, 0, 3);
            J(n4i0Var.f, 0, fetVar2, s5x0.L(jm40Var, 0.0f, 16.0f, 1), n4i0Var.e);
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x02(mm40Var, n4i0Var, i2, b2);
        }
    }

    public static final kiy c0(dre0 dre0Var, kiy kiyVar) {
        dre0Var.getClass();
        kiyVar.getClass();
        return ((ere0) dre0Var).f8277a.b(dre0Var.getName(), dre0Var.getTypeParameters()).c(kiyVar, dre0Var.getName());
    }

    public static final void d(n4i0 n4i0Var, fet fetVar, int i2) {
        fetVar.g0(-1390807932);
        int i3 = (fetVar.g(n4i0Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.L(s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).c, 0.0f, 2), 156.0f);
            long j2 = ijg.e1;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN = s5x0.N(jm40Var, xfn.a(fetVar).c, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i4 = (i3 << 3) & 112;
            e(mm40VarN.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), n4i0Var, fetVar, i4);
            oja0.b(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 0.0f, 13), n4i0Var.b / 100.0f, n4i0Var.d / 100.0f, n4i0Var.f / 100.0f, fetVar, 0);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, xfn.a(fetVar).c, 0.0f, 11);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            c(mm40VarN2.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), n4i0Var, fetVar, i4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o00(n4i0Var, i2, (byte) 25);
        }
    }

    public static final pt0 d0(ot0 ot0Var) {
        int iOrdinal = ot0Var.ordinal();
        if (iOrdinal == 0) {
            return pt0.f27539a;
        }
        if (iOrdinal == 1) {
            return pt0.b;
        }
        if (iOrdinal == 2) {
            return pt0.c;
        }
        if (iOrdinal == 3) {
            return pt0.d;
        }
        if (iOrdinal == 4) {
            return pt0.e;
        }
        t9f.b();
        return null;
    }

    public static final void e(mm40 mm40Var, n4i0 n4i0Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(331551603);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(n4i0Var) : fetVar2.i(n4i0Var) ? 32 : 16;
        }
        boolean z = false;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarN = s5x0.N(mm40Var, xfn.a(fetVar2).c, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            String str = n4i0Var.g;
            y9q0 y9q0VarF = g1t0.f();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarN2, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarF, fetVar, 0, 24960, 110584);
            v8q0.a(n4i0Var.h, s5x0.L(jm40Var, 0.0f, 16.0f, 1), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 110584);
            jcb.v(null, 0.0f, staticColors.m73getBlack400d7_KjU(), fetVar, 0, 3);
            v8q0.a(n4i0Var.i, s5x0.L(jm40Var, 0.0f, 16.0f, 1), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 110584);
            jcb.v(null, 0.0f, staticColors.m73getBlack400d7_KjU(), fetVar, 0, 3);
            v8q0.a(n4i0Var.j, s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x02(mm40Var, n4i0Var, i2, z);
        }
    }

    public static final ap4 e0(pq4 pq4Var, xdr xdrVar) {
        vq4 vq4Var;
        pq4Var.getClass();
        String str = pq4Var.f27397a;
        if (str == null) {
            jf4.k(null);
            return null;
        }
        String str2 = pq4Var.m;
        if (str2 == null) {
            jf4.k(null);
            return null;
        }
        Integer num = pq4Var.n;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        switch (num.intValue()) {
            case 1:
                vq4Var = vq4.b;
                break;
            case 2:
                vq4Var = vq4.c;
                break;
            case 3:
                vq4Var = vq4.d;
                break;
            case 4:
                vq4Var = vq4.e;
                break;
            case 5:
                vq4Var = vq4.g;
                break;
            case 6:
                vq4Var = vq4.f;
                break;
            default:
                vq4Var = vq4.f37837a;
                break;
        }
        String str3 = pq4Var.l;
        if (str3 == null) {
            jf4.k(null);
            return null;
        }
        String str4 = pq4Var.k;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        Integer num2 = pq4Var.j;
        if (num2 == null) {
            jf4.k(null);
            return null;
        }
        va80 va80VarF = fww.F(num2.intValue());
        Integer num3 = pq4Var.g;
        if (num3 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num3.intValue();
        Long l2 = pq4Var.e;
        if (l2 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l2.longValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Date date = new Date(timeUnit.toMillis(jLongValue));
        Long l3 = pq4Var.f;
        if (l3 == null) {
            jf4.k(null);
            return null;
        }
        Date date2 = new Date(timeUnit.toMillis(l3.longValue()));
        String str6 = pq4Var.b;
        if (str6 == null) {
            jf4.k(null);
            return null;
        }
        String str7 = pq4Var.c;
        if (str7 == null) {
            jf4.k(null);
            return null;
        }
        String str8 = pq4Var.d;
        if (str8 == null) {
            jf4.k(null);
            return null;
        }
        String str9 = (String) xdrVar.F(str6, str7, str8);
        String str10 = pq4Var.o;
        if (str10 == null) {
            jf4.k(null);
            return null;
        }
        String str11 = pq4Var.i;
        if (str11 != null) {
            return new ap4(str, str2, vq4Var, str9, str10, str11, str3, str5, va80VarF, iIntValue, date, date2);
        }
        jf4.k(null);
        return null;
    }

    public static final void f(final mm40 mm40Var, final p2k0 p2k0Var, final int i2, final oyq0 oyq0Var, final c3d c3dVar, final Function0 function0, final Function0 function1, final Function1 function2, final Function0 function3, final Function0 function4, fet fetVar, final int i3) {
        int i4;
        final Function1 function5;
        final Function0 function6;
        final Function0 function7;
        p2k0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        fetVar.g0(-1994947304);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.g(p2k0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.g(oyq0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= (32768 & i3) == 0 ? fetVar.g(c3dVar) : fetVar.i(c3dVar) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= fetVar.i(function0) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            function5 = function2;
            i4 |= fetVar.i(function5) ? 8388608 : 4194304;
        } else {
            function5 = function2;
        }
        if ((i3 & 100663296) == 0) {
            function6 = function3;
            i4 |= fetVar.i(function6) ? 67108864 : 33554432;
        } else {
            function6 = function3;
        }
        if ((805306368 & i3) == 0) {
            function7 = function4;
            i4 |= fetVar.i(function7) ? 536870912 : 268435456;
        } else {
            function7 = function4;
        }
        if (fetVar.U(i4 & 1, (306783379 & i4) != 306783378)) {
            int i5 = i4 >> 9;
            boolean z = (((i5 & 14) ^ 6) > 4 && fetVar.g(oyq0Var)) || (i5 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = jgk0.b(new zo4(oyq0Var, (byte) 7));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            mm40 mm40VarJ = lgb.J(mm40Var, vgg0.c(((ycl) l7m0Var.getValue()).f42389a, ((ycl) l7m0Var.getValue()).f42389a, 0.0f, 0.0f, 12));
            pz40 pz40Var = s6t0.f31722a;
            int i6 = i4 << 3;
            mom.c(i120.Q(mm40VarJ, s6t0.b().f33626a.getBackground(), jd8.n), p2k0Var.a(), null, null, p2k0Var.b(), c3dVar, function0, null, u1c.M(425663149, new xdr() { // from class: a.wi5
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    ir8 ir8Var = (ir8) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ir8Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar2.g(ir8Var) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        p2k0 p2k0Var2 = p2k0Var;
                        if (p2k0Var2 instanceof m2k0) {
                            fetVar2.e0(-2107436791);
                            fre0.F(o7k0.c, (m2k0) p2k0Var2, i2, function5, function6, function7, fetVar2, 6);
                            fetVar2.r(false);
                        } else if (p2k0Var2 instanceof n2k0) {
                            fetVar2.e0(1040411484);
                            jcb.l(ir8Var.b(jm40.b, gqw0.e), ((n2k0) p2k0Var2).f22805a, false, function1, fetVar2, 0, 4);
                            fetVar2.r(false);
                        } else {
                            if (!Intrinsics.d(p2k0Var2, o2k0.f24534a)) {
                                throw b1j.f(1040394252, fetVar2, false);
                            }
                            fetVar2.e0(1040420096);
                            fre0.G(0, fetVar2, null);
                            fetVar2.r(false);
                        }
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (458752 & i6) | 100663296 | (i6 & 3670016), 140);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.xi5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fre0.f(mm40Var, p2k0Var, i2, oyq0Var, c3dVar, function0, function1, function2, function3, function4, (fet) obj, x8x.L(i3 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final GeneralBetInfoModel f0(ng7 ng7Var, String str, String str2, String str3) {
        ng7Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        Integer num = ng7Var.f23470a;
        int iIntValue = num != null ? num.intValue() : 0;
        Double d2 = ng7Var.d;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        Double d3 = ng7Var.e;
        double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
        Double d4 = ng7Var.f;
        return new GeneralBetInfoModel(iIntValue, str2, str3, dDoubleValue, dDoubleValue2, d4 != null ? d4.doubleValue() : 0.0d, str);
    }

    public static final void g(mm40 mm40Var, p18 p18Var, hz7 hz7Var, boolean z, fet fetVar, int i2) {
        fet fetVar2;
        fet fetVar3;
        fet fetVar4 = fetVar;
        hz7Var.getClass();
        fetVar4.g0(-580065188);
        int i3 = i2 | (fetVar4.g(mm40Var) ? 4 : 2) | (fetVar4.g(p18Var) ? 32 : 16) | (fetVar4.g(hz7Var) ? 256 : 128) | (fetVar4.h(z) ? 2048 : 1024);
        if (fetVar4.U(i3 & 1, (i3 & 1171) != 1170)) {
            String str = hz7Var.f13894a;
            boolean z2 = p18Var.i;
            Object objP = fetVar4.P();
            Object obj = objP;
            if (objP == ukd.f35823a) {
                dck dckVar = new dck();
                dckVar.f5850a = "";
                fetVar4.o0(dckVar);
                obj = dckVar;
            }
            dck dckVar2 = (dck) obj;
            if (z2 || str.length() > 0) {
                dckVar2.getClass();
                str.getClass();
                dckVar2.f5850a = str;
            }
            String str2 = dckVar2.f5850a;
            String str3 = z ? p18Var.h : hz7Var.b;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 204.0f), 48.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarE);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z3 = fetVar4.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar4, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar3);
            jpm0.n(fetVar4);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar4);
            String str4 = str3;
            k7x.a(p18Var.f26187a.f31344a, null, o7k0.c, null, null, fetVar4, 432, 2040);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar4, 54);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarD);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, x5dVarA, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str2, mm40VarD2, staticColors.m123getWhite0d7_KjU(), null, qmk.q, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 48, 24960, 109544);
            fet fetVar5 = fetVar;
            if (str4.length() > 0) {
                fetVar5.e0(1986328773);
                v8q0.a(str4, s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13), staticColors.m130getWhite600d7_KjU(), null, qmk.p, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.e(), fetVar, 0, 24576, 113640);
                fet fetVar6 = fetVar;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                fetVar5.e0(1986716490);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            fetVar3.r(true);
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0((byte) 8, i2, (Object) mm40Var, (Object) p18Var, (Object) hz7Var, z);
        }
    }

    public static final boolean g0(CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel, uag uagVar) {
        uagVar.getClass();
        return Z(cyberCalendarPeriodUiModel.f46479a, cyberCalendarPeriodUiModel.b, uagVar.k, uagVar.l);
    }

    public static final void h(Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1506918009);
        int i3 = (fetVar.i(function1) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            wha0.h(o7k0.d(jm40.b, 1.0f), u1c.M(530186420, new gn(function1, (byte) 27), fetVar), fetVar, 54);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x6s(function1, i2);
        }
    }

    public static final dre0 h0(dre0 dre0Var) {
        return !W(dre0Var) ? dre0Var : dre0Var.H(dre0Var.K(), ((ere0) dre0Var).f8277a);
    }

    public static final void i(final float f2, final float f3, final int i2, final int i3, fet fetVar, final int i4) {
        float f4;
        int i5;
        fet fetVar2 = fetVar;
        fetVar2.g0(1948832922);
        if ((i4 & 6) == 0) {
            f4 = f2;
            i5 = (fetVar2.d(f4) ? 4 : 2) | i4;
        } else {
            f4 = f2;
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= fetVar2.d(f3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= fetVar2.e(i2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= fetVar2.e(i3) ? 2048 : 1024;
        }
        if (fetVar2.U(i5 & 1, (i5 & 1171) != 1170)) {
            k6z k6zVar = (k6z) fetVar2.k(bmd.n);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarE = o7k0.e(jm40Var, 8.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE2 = mm40VarE.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            long jO = obc.O(i2, fetVar2);
            pz40 pz40Var = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
            k6z k6zVar2 = k6z.f17794a;
            H(mm40VarE2, f4, jO, background, k6zVar == k6zVar2, fetVar2, (i5 << 3) & 112);
            mm40 mm40VarE3 = o7k0.e(jm40Var, 8.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            H(mm40VarE3.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), f3, obc.O(i3, fetVar), s6t0.b().f33626a.getBackground(), k6zVar != k6zVar2, fetVar2, i5 & 112);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.xn8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fre0.i(f2, f3, i2, i3, (fet) obj, x8x.L(i4 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void j(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, String str) {
        a4x a4xVar2;
        mm40 mm40Var2;
        a4xVar.getClass();
        str.getClass();
        fetVar.g0(-1628497018);
        int i3 = i2 | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(str) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int size = !a4xVar.isEmpty() ? a4xVar.size() - 1 : 0;
            Object[] objArr = {str};
            v0h0 v0h0Var = xcz.y;
            boolean zE = fetVar.e(size);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zE || objP == obj) {
                objP = new y02(size, (byte) 3);
                fetVar.o0(objP);
            }
            xcz xczVar = (xcz) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar, 0);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            boolean zG = fetVar.g(xczVar);
            Object objP3 = fetVar.P();
            byte b3 = 2;
            yje yjeVar = null;
            if (zG || objP3 == obj) {
                objP3 = new bz0(xczVar, pz40Var, yjeVar, b3);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, xczVar, (Function2) objP3);
            int i4 = i3 & 112;
            boolean zG2 = (i4 == 32) | fetVar.g(xczVar);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj) {
                Object l19Var = new l19((Object) a4xVar, (Object) xczVar, (Object) pz40Var, yjeVar, (byte) 25);
                a4xVar2 = a4xVar;
                xczVar = xczVar;
                fetVar.o0(l19Var);
                objP4 = l19Var;
            } else {
                a4xVar2 = a4xVar;
            }
            m0x0.t(fetVar, a4xVar2, (Function2) objP4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "CARD_CRICKET_GAME_PROGRESS_BOX");
            long jM71getBlack300d7_KjU = StaticColors.INSTANCE.m71getBlack300d7_KjU();
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarE0, jM71getBlack300d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 8.0f, 0.0f, 8.0f, 5);
            lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = i4 == 32;
            Object objP5 = fetVar.P();
            if (z || objP5 == obj) {
                objP5 = new oea(a4xVar2, b2);
                fetVar.o0(objP5);
            }
            b8k0.f(mm40VarN, xczVar, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP5, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            mm40Var2 = jm40Var;
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pea(mm40Var2, a4xVar2, str, i2, (byte) 0);
        }
    }

    public static final void k(mm40 mm40Var, int i2, int i3, fet fetVar, int i4) {
        mm40 mm40Var2;
        fetVar.g0(-1184115490);
        int i5 = i4 | 6 | (fetVar.e(i2) ? 32 : 16) | (fetVar.e(i3) ? 256 : 128);
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarK = lgb.K(mm40Var2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            mm40 mm40VarE0 = o2e.e0(mm40Var2, "CARD_CRICKET_GAME_PROGRESS_BATSMAN_CARD");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40VarE0, 40.0f), 30.0f);
            pm80 pm80VarF = a8k0.F(i2, (i5 >> 3) & 14, fetVar);
            pge pgeVar = gqw0.B;
            j0x.b(pm80VarF, null, mm40VarS, null, pgeVar, 0.0f, null, fetVar, 24632, 104);
            j0x.b(a8k0.F(i3, (i5 >> 6) & 14, fetVar), null, o7k0.s(o7k0.e(s5x0.N(o2e.e0(mm40Var2, "CARD_CRICKET_GAME_PROGRESS_BOWLER_CARD"), 4.0f, 0.0f, 0.0f, 0.0f, 14), 40.0f), 30.0f), null, pgeVar, 0.0f, null, fetVar, 24632, 104);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s48(mm40Var2, i2, i3, i4, (byte) 1);
        }
    }

    public static final void l(mm40 mm40Var, tea teaVar, fet fetVar, int i2) {
        teaVar.getClass();
        fetVar.g0(-313670895);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(teaVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1943083055, new qea(mm40Var, teaVar), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qea(mm40Var, teaVar, i2);
        }
    }

    public static final void m(int i2, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(-1672643487);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            k(null, R.drawable.card_cricket_progress_empty_card_ic, R.drawable.card_cricket_progress_empty_card_ic, fetVar, 0);
            fetVar2 = fetVar;
            n(54, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), fetVar2, o7k0.d(jm40.b, 1.0f), "");
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 28);
        }
    }

    public static final void n(final int i2, final long j2, fet fetVar, final mm40 mm40Var, final String str) {
        int i3;
        fetVar.g0(-1492389484);
        if ((i2 & 48) == 0) {
            i3 = (fetVar.g(str) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (fetVar.f(j2) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1202809260, new rea(mm40Var, j2, str), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.sea
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fre0.n(x8x.L(i2 | 1), j2, (fet) obj, mm40Var, str);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void o(qza qzaVar, fet fetVar, int i2) {
        fetVar.g0(-1248561494);
        int i3 = (fetVar.g(qzaVar) ? 32 : 16) | i2;
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (qzaVar instanceof pza) {
            fetVar.e0(-1571715285);
            r(6, fetVar);
            fetVar.r(false);
        } else if (qzaVar instanceof oza) {
            fetVar.e0(-1571712632);
            q((oza) qzaVar, fetVar, i3 & 126);
            fetVar.r(false);
        } else {
            if (!(qzaVar instanceof nza)) {
                throw b1j.f(-1571716892, fetVar, false);
            }
            fetVar.e0(-1571708187);
            p((nza) qzaVar, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bna(qzaVar, i2, (byte) 8);
        }
    }

    public static final void p(nza nzaVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1733800754);
        int i3 = i2 | (fetVar2.g(nzaVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarE, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 12.0f, 10.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(nzaVar.f24362a, jr8.f16991a.b(o7k0.w(o7k0.g(o7k0.d(jm40Var, 1.0f), 60.0f, 0.0f, 2), null, false, 3), gqw0.e), s6t0.b().f33626a.getSecondary(), new n05(qmk.q, qmk.t, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 109552);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bna(nzaVar, i2, (byte) 9);
        }
    }

    public static final void q(oza ozaVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-512768646);
        int i3 = i2 | (fetVar2.g(ozaVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 12.0f);
            byte b2 = 14;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b2)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b2)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE0 = o2e.e0(mm40VarD2.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), "VIP_CASHBACK_PROGRESS_VALUE");
            String str = ozaVar.f26095a;
            long textPrimary = s6t0.b().f33626a.getTextPrimary();
            y9q0 y9q0VarM = g1t0.m();
            long j2 = qmk.p;
            long j3 = qmk.r;
            long j4 = qmk.n;
            v8q0.a(str, mm40VarE0, textPrimary, new n05(j2, j3, j4), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarM, fetVar, 0, 24960, 109552);
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(ozaVar.b, o2e.e0(mm40VarD3.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), "VIP_CASHBACK_PROGRESS_ALL"), s6t0.b().f33626a.getSecondary(), new n05(j2, j3, j4), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, 0, 24960, 109552);
            fetVar.r(true);
            mm40 mm40VarE1 = o2e.e0(o7k0.d(jm40Var, 1.0f), "VIP_CASHBACK_PROGRESS_INDICATOR");
            tnm tnmVar = tnm.f34243a;
            StaticColors staticColors = StaticColors.INSTANCE;
            snm.b(mm40VarE1, new unm(tnmVar, staticColors.m132getYellow0d7_KjU(), staticColors.m87getDarkOrange0d7_KjU(), s6t0.b().f33626a.getBackground(), 6.0f, 360.0f, ozaVar.c, ozaVar.d, true, 512), fetVar, 6);
            v8q0.a(ozaVar.e, o2e.e0(o7k0.d(jm40Var, 1.0f), "VIP_CASHBACK_PROGRESS_SUBTITLE"), s6t0.b().f33626a.getSecondary(), new n05(j2, j3, j4), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, 48, 24960, 109552);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bna(ozaVar, i2, (byte) 10);
        }
    }

    public static final void r(int i2, fet fetVar) {
        fetVar.g0(713728195);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarE, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 12.0f, 16.0f);
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 20.0f), 128.0f);
            zcl zclVar2 = qmk.m;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.s(o7k0.e(jm40Var, 16.0f), 258.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pua(i2, (byte) 4);
        }
    }

    public static final void s(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var2;
        int i3;
        Unit unit;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(849629281);
        int i4 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((hfd) l7m0Var.getValue()).f12968a, ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new dib(function1, (byte) 27);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            mdm mdmVar = ((hfd) l7m0Var.getValue()).b;
            if (mdmVar == null) {
                fetVar.e0(-137442902);
                fetVar.r(false);
                unit = null;
                i3 = i5;
            } else {
                fetVar.e0(-137442901);
                i3 = i5;
                B(mdmVar, function1, fetVar, i3);
                fetVar.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar.e0(1103949444);
                zcl zclVar = qmk.f28987a;
                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                boolean z2 = (i3 == 32) | ((i4 & 14) == 4);
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    l7m0Var2 = l7m0Var;
                    objP2 = new ys4(l7m0Var2, function1, (byte) 2);
                    fetVar.o0(objP2);
                } else {
                    l7m0Var2 = l7m0Var;
                }
                b8k0.e(n0qVar, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP2, fetVar, 6, Response.SERVER_TIMEOUT);
                fetVar.r(false);
            } else {
                l7m0Var2 = l7m0Var;
                fetVar.e0(1103945693);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            l7m0Var2 = l7m0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var2, function1, i2, (byte) 26);
        }
    }

    public static final void t(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(213701941);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            m8x.y(n0qVar, u1c.M(-1271409935, new x6s(function1, (byte) 13), fetVar), u1c.M(67353488, new x6s(function1, (byte) 14), fetVar), null, null, 0, backgroundContent, 0L, i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14), u1c.M(-1184611066, new tft(l7m0Var, b2), fetVar), fetVar, 805306806, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i2, (byte) 0);
        }
    }

    public static final void u(mm40 mm40Var, vpl vplVar, Function2 function2, fet fetVar, int i2) {
        vpl vplVar2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1583640029);
        int i3 = i2 | 6 | (fetVar2.g(vplVar) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            long backgroundContent = afn0.m(fetVar2).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 196.0f), 256.0f);
            boolean zF = fetVar2.f(backgroundContent);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new nme((byte) 5, backgroundContent);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarS, (Function1) objP);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP2 = fetVar2.P();
            byte b2 = 2;
            if (z || objP2 == cl5Var) {
                objP2 = new x53(function2, vplVar, b2);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(phu0.F(mm40VarK, null, null, false, null, (Function0) objP2, fetVar, 0, 15), "DS_AGGREGATOR_TOURNAMENT_COLLECTION_CARD_COLUMN");
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarJ = lgb.J(o7k0.d(o7k0.e(jm40Var, 98.0f), 1.0f), vgg0.a(16.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
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
            n0q n0qVar = o7k0.c;
            k7x.b(vplVar.f.a(), null, o2e.e0(yyw.V(n0qVar, fetVar.k(bmd.n) == k6z.b), "TOURNAMENT_CARDS_COLLECTION_IMAGE"), a8k0.F(R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar), a8k0.F(R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar), null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            byte b3 = 14;
            mm40 mm40VarM = s5x0.M(i120.P(n0qVar, yk5.n(q3d.j(new y3d(afn0.p(fetVar).m75getBlack600d7_KjU()), new y3d(afn0.p(fetVar).m121getTransparent0d7_KjU())), 0.0f, 0.0f, 14), null, 6), 8.0f, 12.0f, 8.0f, 8.0f);
            x5d x5dVarA2 = w5d.a(uc9.g, xx7Var, fetVar, 6);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarE1 = o2e.e0(jm40Var, "TOURNAMENT_CARDS_COLLECTION_AMOUNT_TEXT");
            String str = vplVar.b;
            long jM123getWhite0d7_KjU = afn0.p(fetVar).m123getWhite0d7_KjU();
            afn0.v(fetVar).getClass();
            vplVar2 = vplVar;
            v8q0.a(str, mm40VarE1, jM123getWhite0d7_KjU, new n05(qmk.q, qmk.u, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.q(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 48, 24960, 110576);
            jwb.p(null, new qw3(4.0f, true, new jf4(b3)), new qw3(4.0f, true, new jf4(b3)), null, 0, 0, u1c.M(-954652564, new n0i(vplVar2, (byte) 1), fetVar), fetVar, 1572864, 57);
            fetVar.r(true);
            fetVar.r(true);
            mm40 mm40VarL = s5x0.L(o7k0.c(jm40Var, 1.0f), 8.0f, 0.0f, 2);
            x5d x5dVarA3 = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), xx7Var, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarL);
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
            mm40 mm40VarE2 = o2e.e0(jm40Var, "TOURNAMENT_CARDS_COLLECTION_TITLE");
            String str2 = vplVar2.c;
            long textPrimary = afn0.m(fetVar).getTextPrimary();
            afn0.v(fetVar).getClass();
            mm40Var2 = jm40Var;
            v8q0.a(str2, mm40VarE2, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.i(), fetVar, 48, 24960, 110584);
            v8q0.a(vplVar2.g, o2e.e0(mm40Var2, "TOURNAMENT_CARDS_COLLECTION_SUBTITLE"), afn0.m(fetVar).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, h97.g(fetVar), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            vplVar2 = vplVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k0i(mm40Var2, vplVar2, function2, i2, (byte) 1);
        }
    }

    public static final void v(mm40 mm40Var, bql bqlVar, Function0 function0, Function2 function2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-594780793);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bqlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (!fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.X();
        } else if (bqlVar instanceof zpl) {
            fetVar.e0(-353680026);
            w(mm40Var, (zpl) bqlVar, function0, function2, fetVar, i3 & 8190);
            fetVar.r(false);
        } else {
            if (!bqlVar.equals(aql.f1301a)) {
                throw b1j.f(-353682411, fetVar, false);
            }
            fetVar.e0(-353670885);
            x(0, fetVar, o2e.e0(mm40Var, "TOURNAMENT_COLLECTION_CARD_SHIMMER"));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j0i(mm40Var, bqlVar, function0, function2, i2, (byte) 1);
        }
    }

    public static final void w(mm40 mm40Var, zpl zplVar, Function0 function0, Function2 function2, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-482406250);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(zplVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            float f2 = xfn.a(fetVar2).e;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f2, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int i4 = i3;
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            byte b2 = 1;
            boolean z2 = false;
            nkb.h(ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), new hjm(zplVar.f44764a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar2, 384, 56);
            mm40 mm40VarE0 = o2e.e0(jm40Var, "DS_AGGREGATOR_TOURNAMENT_ALL_BUTTON");
            wul wulVar = new wul(mul.e, oe9.d, new ue9(zplVar.b), true, false, false);
            boolean z3 = (i4 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new pk9(function0, (byte) 23);
                fetVar2.o0(objP);
            }
            qzb.n(mm40VarE0, wulVar, (Function0) objP, fetVar2, 6, 0);
            fetVar2.r(true);
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            mm40 mm40VarE1 = o2e.e0(jm40Var, "TOURNAMENT_CARDS_COLLECTION_LAZY_ROW");
            boolean z4 = (i4 & 112) == 32;
            if ((i4 & 7168) == 2048) {
                z2 = true;
            }
            boolean z5 = z4 | z2;
            Object objP2 = fetVar2.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new l0i(zplVar, function2, b2);
                fetVar2.o0(objP2);
            }
            b8k0.f(mm40VarE1, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 6, 490);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m0i(mm40Var, zplVar, function0, function2, i2, (byte) 1);
        }
    }

    public static final void x(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1720208453);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            byte b2 = 14;
            qw3 qw3Var = new qw3(10.0f, true, new jf4(b2));
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, f2, 0.0f, 0.0f, 0.0f, 14), 128.0f), 20.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            mm40 mm40VarN = s5x0.N(o7k0.z(jm40Var, xx7Var, true), xfn.a(fetVar).c, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b2)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
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
            fetVar.e0(-1751510040);
            for (int i4 = 0; i4 < 3; i4++) {
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var, 256.0f), 196.0f);
                zcl zclVar4 = qmk.i;
                qxw.o(fetVar, xbc.c0(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE2), fqj0VarD0));
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i2, (byte) 18);
        }
    }

    public static final void y(mm40 mm40Var, ucm ucmVar, xdr xdrVar, fet fetVar, int i2) {
        int i3;
        float f2;
        ucm ucmVar2 = ucmVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(683604388);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(ucmVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(xdrVar) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            qcm qcmVar = ucmVar2.b;
            tcm tcmVar = ucmVar2.d;
            o0x o0xVarA0 = a0(qcmVar, fetVar2);
            boolean zG = fetVar2.g(qcmVar);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                if (qcmVar instanceof ocm) {
                    zcl zclVar = qmk.f28987a;
                    f2 = 6.0f;
                } else if (!(qcmVar instanceof pcm)) {
                    t9f.b();
                    return;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f2 = 8.0f;
                }
                objP = twn.j(f2, fetVar2);
            }
            float f3 = ((ycl) objP).f42389a;
            zcl zclVar3 = qmk.h;
            zcl zclVar4 = qmk.f28987a;
            mm40 mm40VarE = h97.e(zclVar3, zclVar4, zclVar4, zclVar3, mm40Var);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(i120.S(mm40VarE, 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60(), new ugg0(zclVar3, zclVar4, zclVar4, zclVar3)), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP2;
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                objP3 = new vcm(xdrVar, ucmVar2, (byte) 1);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarN = s5x0.N(y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP3, 28), 12.0f, 0.0f, 16.0f, 0.0f, 10);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN2 = o7k0.n(jm40Var, 40.0f);
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar5 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarN2, 1.0f, separator60, new ugg0(zclVar5, zclVar5, zclVar5, zclVar5));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
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
            n0q n0qVar = o7k0.c;
            rq8.b(o2e.e0(s5x0.J(n0qVar, f3), "DS_CYBER_TRANSFER_CARD_TEAM_IMAGE"), o2e.e0(s5x0.J(n0qVar, 8.0f), "DS_CYBER_TRANSFER_CARD_TEAM_IMAGE"), o0xVarA0, R.drawable.ic_glyph_circle_globe, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary60()), null, null, gqw0.B, null, fetVar, 12582912, 352);
            fetVar.r(true);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 12.0f, 0.0f, 16.0f, 0.0f, 10);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "DS_CYBER_TRANSFER_CARD_TEAM_NAME");
            ucmVar2 = ucmVar;
            String str = ucmVar2.c;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            boolean z3 = tcmVar instanceof rcm;
            v8q0.a(str, mm40VarE0, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, z3 ? 1 : 2, 0, null, g1t0.g(), fetVar, 48, 384, 110584);
            fetVar2 = fetVar;
            if (z3) {
                fetVar2.e0(1489297777);
                j6n.h(((rcm) tcmVar).f30245a, xoo0.f41232a, null, 0, 0, fetVar2, 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1489469796);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wcm(mm40Var, ucmVar2, xdrVar, i2, (byte) 1);
        }
    }

    public static final void z(mm40 mm40Var, ucm ucmVar, xdr xdrVar, fet fetVar, int i2) {
        int i3;
        float f2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1994877365);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(ucmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(xdrVar) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            qcm qcmVar = ucmVar.b;
            tcm tcmVar = ucmVar.d;
            o0x o0xVarA0 = a0(qcmVar, fetVar2);
            boolean zG = fetVar2.g(qcmVar);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                if (qcmVar instanceof ocm) {
                    zcl zclVar = qmk.f28987a;
                    f2 = 6.0f;
                } else if (!(qcmVar instanceof pcm)) {
                    t9f.b();
                    return;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f2 = 8.0f;
                }
                objP = twn.j(f2, fetVar2);
            }
            float f3 = ((ycl) objP).f42389a;
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            zcl zclVar3 = qmk.f28987a;
            zcl zclVar4 = qmk.h;
            mm40 mm40VarE = h97.e(zclVar3, zclVar4, zclVar4, zclVar3, mm40VarC);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(i120.S(mm40VarE, 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60(), new ugg0(zclVar3, zclVar4, zclVar4, zclVar3)), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP2;
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                objP3 = new vcm(xdrVar, ucmVar, (byte) 0);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarM = s5x0.M(y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP3, 28), 16.0f, 8.0f, 12.0f, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            mm40 mm40VarN = s5x0.N(new x7z(1.0f, false), 12.0f, 0.0f, 16.0f, 0.0f, 10);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.o, fetVar2, 48);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "DS_CYBER_TRANSFER_CARD_TEAM_NAME");
            String str = ucmVar.c;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            boolean z3 = tcmVar instanceof rcm;
            v8q0.a(str, mm40VarE0, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, z3 ? 1 : 2, 0, null, g1t0.g(), fetVar, 48, 384, 110584);
            fetVar2 = fetVar;
            if (z3) {
                fetVar2.e0(120385632);
                j6n.h(((rcm) tcmVar).f30245a, xoo0.f41232a, null, 0, 0, fetVar2, 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(120557651);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40 mm40VarN2 = o7k0.n(jm40Var, 40.0f);
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar5 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarN2, 1.0f, separator60, new ugg0(zclVar5, zclVar5, zclVar5, zclVar5));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarS);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            n0q n0qVar = o7k0.c;
            rq8.b(o2e.e0(s5x0.J(n0qVar, f3), "DS_CYBER_TRANSFER_CARD_TEAM_IMAGE"), o2e.e0(s5x0.J(n0qVar, 8.0f), "DS_CYBER_TRANSFER_CARD_TEAM_IMAGE"), o0xVarA0, R.drawable.ic_glyph_circle_globe, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60()), null, null, gqw0.B, null, fetVar2, 12582912, 352);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wcm(mm40Var, ucmVar, xdrVar, i2, (byte) 0);
        }
    }
}
