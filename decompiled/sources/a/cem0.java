package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cem0 implements v8x0 {
    public static final void a(String str, fet fetVar, int i) {
        String str2;
        fet fetVar2;
        fetVar.g0(-362342076);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
            pge pgeVar = gqw0.f1;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarX = r8x.X(jm40Var, -1.0f, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40VarX, 40.0f), 32.0f);
            long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 6.0f, 10.0f, 6.0f, 10.0f);
            zcl zclVar3 = qmk.c;
            str2 = str;
            fetVar2 = fetVar;
            lgb.v(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarM), s5x0.J(i120.Q(o7k0.e(o7k0.s(jm40Var, 40.0f), 32.0f), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f), str2, R.drawable.ic_sport_valorant_27, jM126getWhite200d7_KjU, pgeVar, fetVar2, ((i2 << 6) & 896) | 196608, 0);
        } else {
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 28, i, str2);
        }
    }

    public static final void c(wem0 wem0Var, fet fetVar, int i) {
        byte b;
        zcl zclVar;
        float f;
        String str;
        long jM73getBlack400d7_KjU;
        fet fetVar2 = fetVar;
        fetVar2.g0(1571794167);
        int i2 = i | (fetVar2.g(wem0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            if (wem0Var != null) {
                boolean z = wem0Var instanceof uem0;
                if (z || (wem0Var instanceof vem0)) {
                    zclVar = qmk.e;
                } else if (wem0Var instanceof tem0) {
                    zclVar = qmk.f28987a;
                }
                if (z) {
                    f = 40.0f;
                } else {
                    f = wem0Var instanceof vem0 ? 32.0f : 0.0f;
                }
                if (wem0Var instanceof tem0) {
                    str = "";
                } else if (z) {
                    str = ((uem0) wem0Var).f35537a;
                } else {
                    if (!(wem0Var instanceof vem0)) {
                        t9f.b();
                        return;
                    }
                    str = ((vem0) wem0Var).f37293a;
                }
                fko0 fko0VarA = wem0Var.a();
                if (Intrinsics.d(fko0VarA, qek0.c)) {
                    jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                } else {
                    if (!(fko0VarA instanceof eko0)) {
                        t9f.b();
                        return;
                    }
                    jM73getBlack400d7_KjU = ((eko0) fko0VarA).f7963a;
                }
                mm40 mm40VarS = o7k0.s(o7k0.e(jm40.b, 32.0f), f);
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarQ = i120.Q(mm40VarS, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar));
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
                b = 1;
                v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 130042);
                fetVar2 = fetVar;
                fetVar2.r(true);
            }
            t9f.b();
            return;
        }
        b = 1;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bem0(wem0Var, i, b);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        String str3 = str2;
        fetVar2.g0(-1958146887);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str3) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(o7k0.w(mm40Var, null, false, 3), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            dww.c(pm80VarF, null, o7k0.n(jm40Var, 32.0f), jM130getWhite600d7_KjU, fetVar2, 56, 0);
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            mm40 mm40VarW = o7k0.w(new x7z(1.0f, true), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
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
            qxw.o(fetVar, o7k0.e(jm40Var, 2.0f));
            kc5.N(str, null, 0L, null, null, 0L, qmk.q, g1t0.j().f42262a.b, null, null, 0L, gqw0.d, 2, false, 1, 0, false, null, y9q0.a(g1t0.j(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), 0.0f, fetVar, (i2 >> 3) & 14, 1600512, 0, 3055422);
            fetVar2 = fetVar;
            fetVar2.r(true);
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
            str3 = str2;
            kpb.l(R.style.Widget_DSTag_RectangularL_Filled_Green, ((i2 >> 6) & 14) | 384, fetVar2, mm40VarY, str3);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ovr0(mm40Var, str, str3, i, (byte) 0);
        }
    }

    public static final void e(wem0 wem0Var, fet fetVar, int i) {
        wem0Var.getClass();
        fetVar.g0(-1493680540);
        int i2 = (fetVar.g(wem0Var) ? 4 : 2) | i;
        byte b = 0;
        if (!fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.X();
        } else if ((wem0Var instanceof uem0) || (wem0Var instanceof vem0)) {
            fetVar.e0(1919346058);
            c(wem0Var, fetVar, i2 & 14);
            fetVar.r(false);
        } else {
            if (!(wem0Var instanceof tem0)) {
                throw b1j.f(-907919811, fetVar, false);
            }
            fetVar.e0(1919436454);
            a(((tem0) wem0Var).f33828a, fetVar, 0);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bem0(wem0Var, i, b);
        }
    }

    public static final void f(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(1895473597);
        if (fetVar.U(i & 1, i != 0)) {
            na10 na10VarW = x8x.w(new pa10(R.raw.info_lottie_bet_opt), fetVar);
            u910 u910VarA0 = gq80.a0(na10VarW.getValue(), fetVar, 956);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 128.0f);
            fa10 fa10VarB = na10VarW.getValue();
            boolean zG = fetVar.g(u910VarA0);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new u4h(u910VarA0, (byte) 3);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            piz.j(fa10VarB, (Function0) objP, mm40VarN, null, fetVar2, 0, 0, 131064);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acm0(i);
        }
    }

    public static final void g(mm40 mm40Var, boo0 boo0Var, Function1 function1, fet fetVar, int i, int i2) {
        float f;
        boo0Var.getClass();
        fyl fylVar = boo0Var.b;
        function1.getClass();
        fetVar.e0(-482377621);
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        mm40 mm40Var2 = mm40Var;
        if (fylVar.f10362a.isEmpty()) {
            fetVar.r(false);
            return;
        }
        int iOrdinal = boo0Var.c.ordinal();
        if (iOrdinal == 0) {
            zcl zclVar = qmk.f28987a;
            f = 0.0f;
        } else if (iOrdinal != 1) {
            t9f.b();
            return;
        } else {
            zcl zclVar2 = qmk.f28987a;
            f = 8.0f;
        }
        ebc.r(o7k0.d(knx.Q(s5x0.N(mm40Var2, 0.0f, f, 0.0f, 0.0f, 13), new k82(xfn.a(fetVar).c, (byte) 8)), 1.0f), fylVar, vxl.c, function1, null, fetVar, ((i << 6) & 57344) | 3456, 32);
        fetVar.r(false);
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fetVar.g0(1384111601);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
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
            mbc.k(rsm0.w(R.string.toto_tiraj, 0, fetVar), str, 5, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, 0L, fetVar, i2 & 112);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mbc.k(rsm0.w(R.string.toto_accept_bets_to, 0, fetVar), str2, 6, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, 0L, fetVar, (i2 >> 3) & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ovr0(mm40Var, str, str2, i, (byte) 1);
        }
    }

    public static final void i(mm40 mm40Var, hco hcoVar, qdz qdzVar, Function1 function1, Function2 function2, Function1 function3, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        hcoVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar2.g0(-112108066);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(hcoVar) ? 32 : 16) | (fetVar2.g(qdzVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192) | (fetVar2.i(function3) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarW = o7k0.w(mm40Var, null, false, 3);
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarW, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
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
            boolean z = false;
            wwb.j(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), hcoVar.c, 16.0f, null, null, fetVar, 0, 56);
            agc.l(hcoVar.d, function2, fetVar, (i2 >> 9) & 112);
            zvw.k(jm40Var, hcoVar.e, true, qdzVar.b(hcoVar.f12832a, new shq0((byte) 13), fetVar, i2 & 896), s5x0.t(8.0f, 0.0f, 2), function1, fetVar, ((i2 << 6) & 458752) | 390, 0);
            fetVar2 = fetVar;
            m3g m3gVar = hcoVar.f;
            boolean z2 = (i2 & 458752) == 131072;
            if ((i2 & 112) == 32) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new yip0((Object) function3, (Object) hcoVar, (byte) 17);
                fetVar2.o0(objP);
            }
            e3c.b(null, m3gVar, (Function0) objP, fetVar2, 0, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vdl0(mm40Var, hcoVar, qdzVar, function1, function2, function3, i);
        }
    }

    public static final void j(mm40 mm40Var, brq0 brq0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(791711747);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(brq0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM75getBlack600d7_KjU = staticColors.m75getBlack600d7_KjU();
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
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            d(0, fetVar2, s5x0.N(jm40Var, 12.0f, 0.0f, 16.0f, 0.0f, 10), brq0Var.f3091a, brq0Var.c);
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            wfi0 wfi0Var = wfi0.f39073a;
            mbc.o(wfi0Var, null, false, fetVar2, 6, 6);
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            h(0, fetVar2, o7k0.w(o7k0.d(s5x0.L(jm40Var, 16.0f, 0.0f, 2), 1.0f), null, false, 3), brq0Var.b, brq0Var.d);
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            mbc.o(wfi0Var, null, false, fetVar2, 6, 6);
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            etm0.c(o7k0.d(s5x0.L(jm40Var, 16.0f, 0.0f, 2), 1.0f), brq0Var.e, y9q0.a(g1t0.g(), staticColors.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), y9q0.a(g1t0.d(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar2, 0, 0);
            fetVar2 = fetVar2;
            rz4.t(jm40Var, 12.0f, fetVar2, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0(mm40Var, brq0Var, i, b);
        }
    }

    public static final void k(mm40 mm40Var, y2k0 y2k0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        long secondary10;
        long secondary20;
        long secondary21;
        fet fetVar2 = fetVar;
        function0.getClass();
        fetVar2.g0(-843356870);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(y2k0Var) : fetVar2.i(y2k0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x2k0 x2k0Var = y2k0Var.f41909a;
            boolean z = y2k0Var.b;
            mm40 mm40VarW = y860.W(mm40Var, null, null, z, null, function0, 24);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarW, vgg0.a(16.0f));
            if (z) {
                secondary10 = x2k0Var.c();
            } else {
                pz40 pz40Var = s6t0.f31722a;
                secondary10 = s6t0.b().f33626a.getSecondary10();
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.K(i120.Q(mm40VarJ, secondary10, jd8.n), 12.0f, 14.0f), "TRANSACTION_BUTTON");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40Var);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 20.0f);
            if (z) {
                secondary20 = x2k0Var.d();
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                secondary20 = s6t0.b().f33626a.getSecondary20();
            }
            dww.c(a8k0.F(x2k0Var.a(), 0, fetVar2), null, i120.Q(mm40VarN, secondary20, vgg0.f37379a), z ? StaticColors.INSTANCE.m123getWhite0d7_KjU() : StaticColors.INSTANCE.m129getWhite400d7_KjU(), fetVar2, 56, 0);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), false);
            String strW = rsm0.w(x2k0Var.e(), 0, fetVar2);
            y9q0 y9q0VarB = x2k0Var.b();
            if (z) {
                secondary21 = x2k0Var.b().b();
            } else {
                pz40 pz40Var3 = s6t0.f31722a;
                secondary21 = s6t0.b().f33626a.getSecondary20();
            }
            aad.e(strW, mm40VarH, y9q0.a(y9q0VarB, secondary21, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), null, 0, false, 0, 0, null, new n05(idm0.t(12), x2k0Var.b().f42262a.b, idm0.t(1)), fetVar, 0, Response.SERVER_TIMEOUT);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, y2k0Var, function0, i, (byte) 16);
        }
    }

    public static final void l(mm40 mm40Var, lou0 lou0Var, xcz xczVar, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        lou0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-395237045);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(lou0Var) : fetVar.i(lou0Var) ? 32 : 16;
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
            pz40 pz40VarF = androidx.compose.runtime.e.f(lou0Var.b, fetVar);
            imm immVar = lou0Var.c;
            boolean z = (i2 & 7168) == 2048;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new xks0(function0, (byte) 4);
                fetVar.o0(objP2);
            }
            Function0 function3 = (Function0) objP2;
            boolean z2 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(lou0Var))) | ((458752 & i2) == 131072);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new xis0((byte) 20, (Object) lou0Var, function2);
                fetVar.o0(objP3);
            }
            Function1 function4 = (Function1) objP3;
            boolean zI = ((i2 & 896) == 256) | fetVar.i(vneVar) | fetVar.g(pz40VarF) | ((57344 & i2) == 16384);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj) {
                objP4 = new en(vneVar, function1, pz40VarF, xczVar, (byte) 1);
                fetVar.o0(objP4);
            }
            hlm.c(mm40Var, immVar, null, function3, null, function4, (Function1) objP4, null, null, null, null, null, fetVar, i2 & 14, 0, 3988);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fer0(mm40Var, (Object) lou0Var, xczVar, function0, function1, function2, i, (byte) 5);
        }
    }

    public static final void m(int i, TextView textView) {
        textView.getClass();
        Context context = textView.getContext();
        context.getClass();
        int[] iArr = bqd0.s0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            textView.setTextAppearance(resourceId);
            Context context2 = textView.getContext();
            context2.getClass();
            TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, iArr);
            textView.setAllCaps(typedArrayObtainStyledAttributes2.getBoolean(5, false));
            typedArrayObtainStyledAttributes2.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void n(int i, TextView textView) {
        Object g0g0Var;
        textView.getClass();
        Context context = textView.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bqd0.s0);
        Context context2 = textView.getContext();
        context2.getClass();
        ColorStateList colorStateListM = ktt0.m(2, context2, typedArrayObtainStyledAttributes);
        if (colorStateListM != null) {
            textView.setTextColor(colorStateListM);
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            tnq0.i(typedArrayObtainStyledAttributes, 9);
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(9, 0.0f);
            tnq0.i(typedArrayObtainStyledAttributes, 8);
            aem0.r(textView, dimension, (int) typedArrayObtainStyledAttributes.getDimension(8, 0.0f), 1, 1);
            tnq0.i(typedArrayObtainStyledAttributes, 10);
            aem0.s(typedArrayObtainStyledAttributes.getInt(10, 0), textView);
            g0g0Var = Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            aem0.s(0, textView);
        }
        try {
            tnq0.i(typedArrayObtainStyledAttributes, 3);
            textView.setMaxLines(typedArrayObtainStyledAttributes.getInt(3, 0));
        } catch (Throwable unused) {
            e0g0 e0g0Var3 = j0g0.b;
        }
        try {
            tnq0.i(typedArrayObtainStyledAttributes, 7);
            textView.setTextAlignment(typedArrayObtainStyledAttributes.getInt(7, 0));
        } catch (Throwable unused2) {
            e0g0 e0g0Var4 = j0g0.b;
        }
        typedArrayObtainStyledAttributes.recycle();
        m(i, textView);
    }

    public static final i4 o(String str, ArrayList arrayList) {
        ArrayList<rrh> arrayListU = ohs0.u(str);
        Iterator it = new IntRange(0, 4, 1).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            arrayListU.add((rrh) ((iNextInt < 0 || iNextInt >= arrayList.size()) ? new rrh("", "", "", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, "") : arrayList.get(iNextInt)));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListU, 10));
        for (rrh rrhVar : arrayListU) {
            String str2 = rrhVar.f30983a;
            arrayList2.add(new hfa0(kkg.u, str2, rrhVar.b, rrhVar.i, rrhVar.c, str2.equals(str)));
        }
        return dyb.r0(arrayList2);
    }

    public static final bat0 p(fn9 fn9Var, boolean z, ctf0 ctf0Var) {
        onh mnhVar;
        ctf0Var.getClass();
        bat0 bat0Var = null;
        if (fn9Var != null) {
            long j = fn9Var.i;
            long j2 = fn9Var.p;
            int i = fn9Var.k;
            if (((i <= 0 || j <= 0) ? null : fn9Var) != null) {
                String strValueOf = String.valueOf(i);
                lsm0 lsm0Var = ctf0Var.b;
                String strA = lsm0Var.a(R.string.lol_tier, Arrays.copyOf(new Object[0], 0));
                n0x n0xVar = new n0x(fn9Var.u);
                String strA0 = zvw.a0(j, fn9Var.s ? "$%,d" : "%,d$");
                String strA2 = lsm0Var.a(R.string.prize_fund, Arrays.copyOf(new Object[0], 0));
                long j3 = fn9Var.q;
                if (j2 <= 0 || j3 <= 0) {
                    mnhVar = nnh.f23820a;
                } else {
                    Calendar calendar = Calendar.getInstance();
                    uen uenVar = wen.b;
                    bfn bfnVar = bfn.SECONDS;
                    long jE = wen.e(ibc.w0(j2, bfnVar));
                    calendar.getClass();
                    mnhVar = new mnh(bsr0.g0(jE, calendar), bsr0.g0(wen.e(ibc.w0(j3, bfnVar)), calendar));
                }
                onh onhVar = mnhVar;
                String str = fn9Var.f;
                bat0Var = new bat0("TOURNAMENT_INFO", new gnh(strValueOf, strA, n0xVar, strA0, strA2, onhVar, str, z && str.length() > 0));
            }
        }
        return bat0Var;
    }

    public static Set q(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new ujv0(iIntValue, ((Number) it2.next()).intValue()));
            }
            w3d.u(arrayList, arrayList2);
        }
        return CollectionsKt.P0(arrayList);
    }

    public static final String r(d0t d0tVar) {
        Object next;
        Iterator it = q3d.j(kvg.d, jtg.d, hxg.d, lug.d, ntg.d, ewg.d, lxg.d, fwg.d, cug.d, xrg.d, wrg.d, uvg.d, dug.d, wtg.d, csg.d, ltg.d, ptg.d, msg.d, org.d).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((yxg) next).b != d0tVar.v);
        if (next == null) {
            rqs rqsVar = d0tVar.p;
            if (rqsVar.b != 0) {
                return String.valueOf(rqsVar.e);
            }
        }
        return kpb.R(d0tVar).f33307a;
    }

    public static final String s(d0t d0tVar) {
        Object next;
        Iterator it = q3d.j(kvg.d, jtg.d, hxg.d, lug.d, ntg.d, ewg.d, lxg.d, fwg.d, cug.d, xrg.d, wrg.d, uvg.d, dug.d, wtg.d, csg.d, ltg.d, ptg.d, msg.d, org.d).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((yxg) next).b != d0tVar.v);
        if (next == null) {
            rqs rqsVar = d0tVar.p;
            if (rqsVar.b != 0) {
                return String.valueOf(rqsVar.f);
            }
        }
        return kpb.R(d0tVar).b;
    }

    public static final StaticLayout t(TextView textView, TextPaint textPaint, int i) {
        textView.getClass();
        textPaint.getClass();
        if (i < 0) {
            i = 0;
        }
        Layout layout = textView.getLayout();
        int ellipsizedWidth = layout != null ? layout.getEllipsizedWidth() : 0;
        if (ellipsizedWidth < 0) {
            ellipsizedWidth = 0;
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(textView.getText(), 0, textView.getText().length(), textPaint, i).setBreakStrategy(textView.getBreakStrategy()).setIncludePad(textView.getIncludeFontPadding()).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setEllipsize(textView.getEllipsize()).setEllipsizedWidth(ellipsizedWidth).build();
        staticLayoutBuild.getClass();
        return staticLayoutBuild;
    }

    public static final k9p0 u(bcp0 bcp0Var) {
        bcp0Var.getClass();
        Long l = bcp0Var.f2364a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = bcp0Var.b;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Long l3 = bcp0Var.c;
        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
        Long l4 = bcp0Var.d;
        long jLongValue4 = l4 != null ? l4.longValue() : 0L;
        String str = bcp0Var.e;
        if (str == null) {
            str = "";
        }
        String str2 = bcp0Var.f;
        if (str2 == null) {
            str2 = "";
        }
        long j = jLongValue2;
        long j2 = jLongValue4;
        String str3 = bcp0Var.g;
        if (str3 == null) {
            str3 = "";
        }
        List list = bcp0Var.i;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = bcp0Var.k;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        l9p0 l9p0Var = new l9p0(str3, list, list2);
        String str4 = bcp0Var.h;
        if (str4 == null) {
            str4 = "";
        }
        List list3 = bcp0Var.j;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        String str5 = str;
        List list4 = bcp0Var.l;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        l9p0 l9p0Var2 = new l9p0(str4, list3, list4);
        String str6 = bcp0Var.m;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = bcp0Var.n;
        if (str7 == null) {
            str7 = "";
        }
        Long l5 = bcp0Var.o;
        long jLongValue5 = l5 != null ? l5.longValue() : 0L;
        String str8 = bcp0Var.p;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = str6;
        Map map = bcp0Var.q;
        if (map == null) {
            map = lun.f20680a;
            map.getClass();
        }
        Map map2 = map;
        String str10 = bcp0Var.s;
        String str11 = str10 != null ? str10 : "";
        Integer num = bcp0Var.t;
        return new k9p0(jLongValue, j, jLongValue3, j2, str5, str2, l9p0Var, l9p0Var2, str9, str7, jLongValue5, str8, map2, str11, num != null ? num.intValue() : 0);
    }

    public static final vnp0 v(xcp xcpVar, wcb wcbVar, ctf0 ctf0Var) {
        String strA;
        String str;
        xcpVar.getClass();
        wcbVar.getClass();
        ctf0Var.getClass();
        String strA2 = xcpVar.h ? ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)) : null;
        tnp0 tnp0Var = xcpVar.b;
        if (tnp0Var != null) {
            if (tnp0Var instanceof rnp0) {
                rnp0 rnp0Var = (rnp0) tnp0Var;
                strA = wcbVar.a(rnp0Var.b, rnp0Var.c);
            } else if (tnp0Var instanceof snp0) {
                strA = wcbVar.a(((snp0) tnp0Var).b, 0L);
            }
            String str2 = strA;
            p1l0 p1l0Var = p1l0.PLAYER_ICON;
            p1l0 p1l0Var2 = p1l0.SPORT_ICON;
            String str3 = (String) CollectionsKt.firstOrNull(xcpVar.f);
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (kotlin.text.c.x(str3, ujn.h, false)) {
                str = str3;
            } else {
                if (str3.length() != 0) {
                    List list = u0d.f34849a;
                    if (!u0d.c(str3)) {
                        str4 = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                    }
                }
                str = str4;
            }
            pz40 pz40Var = s6t0.f31722a;
            s1l0 s1l0Var = new s1l0(p1l0Var, null, str, str2, new y3d(s6t0.b().f33626a.getSecondary()), 36);
            e2l0 e2l0Var = new e2l0(xcpVar.c, s6t0.b().f33626a.getTextPrimary());
            zcl zclVar = qmk.f28987a;
            return new vnp0(xcpVar.f40657a, new zrm(e2l0Var, s1l0Var, new e3l0(xcpVar.g, new kpe(), R.drawable.ic_glyph_favourite_active, strA2), (d4d) null, new l3l0(16.0f), 40), true);
        }
        t9f.b();
        return null;
    }

    public static String w(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return str.substring(19);
        }
        jf4.o("key URI must start with android-keystore://");
        return null;
    }

    public static void x(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i << 3)));
        }
    }

    public static final InputStream y(h0q0 h0q0Var) {
        h9x0 h9x0VarA = ((p9x0) h0q0Var.f12247a).a((Uri) h0q0Var.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(h9x0VarA);
        ArrayList arrayList2 = (ArrayList) h0q0Var.b;
        if (!arrayList2.isEmpty()) {
            int i = s8x0.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw rw2.h(it);
            }
            s8x0 s8x0Var = !arrayList3.isEmpty() ? new s8x0(h9x0VarA, arrayList3) : null;
            if (s8x0Var != null) {
                arrayList.add(s8x0Var);
            }
        }
        Iterator it2 = ((b4x) h0q0Var.c).iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        if (it2.next() != null) {
            hny.b();
            return null;
        }
        throw null;
    }
}
