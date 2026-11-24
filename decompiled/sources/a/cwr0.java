package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Looper;
import android.view.Window;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
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

/* JADX INFO: loaded from: classes6.dex */
public abstract class cwr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f5094a = new ugd(115989742, false, new qbd((byte) 9));
    public static final ugd b = new ugd(-1892736476, false, new zgd(22));
    public static final ugd c = new ugd(-1938021877, false, new fhd(8));
    public static final ugd d = new ugd(-1876593772, false, new ehd(19));
    public static final ugd e = new ugd(-834467887, false, new mhd(6));
    public static final ugd f = new ugd(-1900602392, false, new qhd(18));
    public static final l13 g = new l13((byte) 15);
    public static final nul0 h = new nul0(1.0f, 50.0f, Float.valueOf(0.001f));
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final String[] j = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] k = {"ad_impression"};
    public static final String[] l = {"ad_impression", "in_app_purchase"};
    public static final String[] m = {"ad_impression"};
    public static final String[] n = {"ad_impression", "in_app_purchase"};
    public static final String[] o = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] p = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    public static final void A(mm40 mm40Var, cc70 cc70Var, Function1 function1, fet fetVar, int i2) {
        cc70Var.getClass();
        function1.getClass();
        fetVar.g0(1443547375);
        int i3 = (fetVar.g(cc70Var) ? 32 : 16) | i2 | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            G(cc70Var, function1, fetVar, (i3 >> 3) & 126);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "ONE_X_GAMES_GAME_SCREEN");
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarE0.e(n0qVar);
            WeakHashMap weakHashMap = djv0.w;
            mm40 mm40VarQ = i120.Q(j120.k0(mm40VarE, zcm0.i(fetVar).e), cc70Var.e, jd8.n);
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
            if (cc70Var.b) {
                fetVar.e0(1186935869);
                fetVar.r(false);
            } else {
                fetVar.e0(1186675438);
                z(o7k0.d(o050.W(jm40.b), 1.0f), cc70Var.c, function1, fetVar, i3 & 896);
                fetVar.r(false);
            }
            y(n0qVar, cc70Var, function1, fetVar, (i3 & 896) | (i3 & 112) | 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var, cc70Var, function1, i2, (byte) 19);
        }
    }

    public static final void B(int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fetVar.g0(-1632788493);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.g(mm40VarD, 0.0f, 30.0f, 1), "POTENTIAL_WIN_VALUE_BOX");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            nw3 nw3Var = uc9.e;
            jwb.p(null, nw3Var, nw3Var, null, 2, 0, u1c.M(-1902328216, new ew6(str, str2, (byte) 2), fetVar), fetVar, 1597872, 41);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var2, str, str2, i2, (byte) 6);
        }
    }

    public static final void C(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-815568081);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (((c8i0) l7m0Var.getValue()).b) {
            fetVar.e0(41549982);
            j(((c8i0) l7m0Var.getValue()).g, ((c8i0) l7m0Var.getValue()).h, function1, fetVar, (i3 << 3) & 896);
            fetVar.r(false);
        } else {
            fetVar.e0(41476884);
            m(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i2, (byte) 28);
        }
    }

    public static final void D(int i2, fet fetVar) {
        fetVar.g0(-1925089024);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), 96.0f), 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            zq8.a(0, fetVar, xbc.c0(i120.Q(mm40VarD, s6t0.b().f33626a.getBackgroundGroup(), jd8.n), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new efr0(i2, (byte) 26);
        }
    }

    public static final void E(int i2, fet fetVar) {
        fetVar.g0(-905894790);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            D(0, fetVar);
            D(0, fetVar);
            D(0, fetVar);
            D(0, fetVar);
            D(0, fetVar);
            D(0, fetVar);
            D(0, fetVar);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new efr0(i2, (byte) 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void F(mm40 mm40Var, pln0 pln0Var, gx6 gx6Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2;
        long secondary60;
        jm40 jm40Var;
        ?? r0;
        fet fetVar3;
        jm40 jm40Var2;
        fet fetVar4 = fetVar;
        fetVar4.g0(408353122);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar4.g(pln0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar4.e(gx6Var.ordinal()) ? 256 : 128;
        }
        if (fetVar4.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var3 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var3, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 12.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar4, 54);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarE);
            mkd.c0.getClass();
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(e7z.u1);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA, gqw0.x);
            jpm0.o(fetVar4, bh90VarM, gqw0.w);
            jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar4);
            jpm0.o(fetVar4, mm40VarC0, gqw0.v);
            gx6 gx6Var2 = gx6.f12062a;
            if (gx6Var == gx6Var2 || gx6Var == gx6.b || pln0Var.b) {
                fetVar4.e0(-1206096555);
                String str = pln0Var.f27193a;
                androidx.compose.runtime.d dVar = j1t0.e;
                ((g1t0) fetVar4.k(dVar)).getClass();
                y9q0 y9q0VarE = g1t0.e();
                ((g1t0) fetVar4.k(dVar)).getClass();
                nrq nrqVar = g1t0.e().f42262a.f;
                if (gx6Var == gx6.b) {
                    fetVar4.e0(-1205822949);
                    secondary60 = ((ThemeColors) fetVar4.k(zaq0.b)).getWarning();
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(-1205744457);
                    secondary60 = ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary60();
                    fetVar4.r(false);
                }
                long j2 = qmk.o;
                ((g1t0) fetVar4.k(dVar)).getClass();
                jm40Var = jm40Var3;
                r0 = 0;
                kc5.N(str, null, secondary60, null, null, 0L, j2, g1t0.e().f42262a.b, null, nrqVar, 0L, null, 2, false, 1, 0, false, null, y9q0VarE, 0.0f, fetVar, 0, 1597440, 0, 3062586);
                fet fetVar5 = fetVar;
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                if (gx6Var == gx6.c) {
                    fetVar4.e0(-1205356461);
                    mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var3, 128.0f), 12.0f);
                    zcl zclVar2 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), vbc.d0(null, fetVar4, 0, 1), fetVar4, false);
                } else {
                    fetVar4.e0(-1205022684);
                    fetVar4.r(false);
                }
                jm40Var = jm40Var3;
                r0 = 0;
                fetVar3 = fetVar4;
            }
            if (pln0Var.c && gx6Var == gx6Var2) {
                fetVar3.e0(-1204932009);
                jm40Var2 = jm40Var;
                dww.c(a8k0.F(R.drawable.ic_glyph_vip, r0, fetVar3), null, o7k0.n(jm40Var2, 16.0f), ((ThemeColors) fetVar3.k(zaq0.b)).getPrimary(), fetVar3, 56, 0);
                fetVar3.r(r0);
            } else {
                jm40Var2 = jm40Var;
                fetVar3.e0(-1204673500);
                fetVar3.r(r0);
            }
            fetVar3.r(true);
            mm40Var2 = jm40Var2;
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((Object) mm40Var2, (Object) pln0Var, (Object) gx6Var, i2, (byte) 7);
        }
    }

    public static final void G(cc70 cc70Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-7885514);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(cc70Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 0;
        byte b3 = 29;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object obj = (Activity) fetVar.k(cr00.f4820a);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                agd agdVar = obj instanceof agd ? (agd) obj : null;
                objP = agdVar != null ? agdVar.getWindow() : null;
                fetVar.o0(objP);
            }
            Window window = (Window) objP;
            pz40 pz40VarU = g8x.U(null, fetVar, 1);
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                objP2 = window != null ? new cjv0(window, window.getDecorView()) : null;
                fetVar.o0(objP2);
            }
            Object obj3 = (cjv0) objP2;
            boolean zC = pkd.c(fetVar);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP3 = fetVar.P();
            if (z || objP3 == obj2) {
                objP3 = new ju60(function1, b3);
                fetVar.o0(objP3);
            }
            knx.i(false, (Function0) objP3, fetVar, 0, 1);
            Boolean boolValueOf = Boolean.valueOf(cc70Var.b);
            int i5 = i3 & 14;
            boolean zI = fetVar.i(obj3) | (i5 == 4);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj2) {
                objP4 = new ka70(obj3, cc70Var, b2);
                fetVar.o0(objP4);
            }
            m0x0.o(boolValueOf, (Function1) objP4, fetVar);
            boolean zI2 = fetVar.i(obj);
            Object objP5 = fetVar.P();
            if (zI2 || objP5 == obj2) {
                objP5 = new pu50(obj, (byte) 22);
                fetVar.o0(objP5);
            }
            v3c.A(null, (Function0) objP5, null, fetVar, 0, 5);
            boolean zH = (i5 == 4) | fetVar.h(zC) | fetVar.i(obj);
            Object objP6 = fetVar.P();
            if (zH || objP6 == obj2) {
                objP6 = new lf2((Object) cc70Var, obj, zC, (byte) 8);
                fetVar.o0(objP6);
            }
            v3c.z((Function0) objP6, null, null, fetVar, 0, 6);
            boolean zG = fetVar.g(pz40VarU) | (i4 == 32);
            Object objP7 = fetVar.P();
            if (zG || objP7 == obj2) {
                objP7 = new dl2((byte) 3, null, pz40VarU, function1);
                fetVar.o0(objP7);
            }
            m0x0.t(fetVar, pz40VarU, (Function2) objP7);
            Unit unit = Unit.f46060a;
            boolean zI3 = fetVar.i(obj);
            Object objP8 = fetVar.P();
            if (zI3 || objP8 == obj2) {
                objP8 = new cd60(obj, (byte) 15);
                fetVar.o0(objP8);
            }
            m0x0.o(unit, (Function1) objP8, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(cc70Var, function1, i2, (byte) 29);
        }
    }

    public static final void H(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1515759269);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 6;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
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
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(R.string.player_info_transition, 0, fetVar), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new nas0(function1, b2);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            xjs0 xjs0Var = (xjs0) l7m0Var.getValue();
            if (xjs0Var instanceof ujs0) {
                fetVar.e0(-154782998);
                boolean zG = fetVar.g(xjs0Var);
                Object objP2 = fetVar.P();
                if (zG || objP2 == cl5Var) {
                    objP2 = new lcr0((ujs0) xjs0Var, (byte) 17);
                    fetVar.o0(objP2);
                }
                b8k0.e(n0qVar, xczVarA, null, null, null, null, false, null, (Function1) objP2, fetVar, 6, 508);
                fetVar.r(false);
                function2 = function1;
            } else if (xjs0Var instanceof vjs0) {
                fetVar.e0(-153985802);
                function2 = function1;
                q(((vjs0) xjs0Var).f37546a, function2, fetVar, i4);
                fetVar.r(false);
            } else {
                function2 = function1;
                if (!Intrinsics.d(xjs0Var, wjs0.f39279a)) {
                    throw b1j.f(-4995303, fetVar, false);
                }
                fetVar.e0(-4962887);
                E(0, fetVar);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function2, i2, (byte) 6);
        }
    }

    public static jo20 K(int i2, int i3, List list, String str, List list2, List list3, ArrayList arrayList, List list4, String str2, Long l2, Boolean bool, String str3, String str4, int i4) {
        List list5 = (i4 & 4) != 0 ? null : list;
        String str5 = (i4 & 8) != 0 ? "or" : str;
        List list6 = (i4 & 16) != 0 ? null : list2;
        List list7 = (i4 & 32) != 0 ? null : list3;
        ArrayList arrayList2 = (i4 & 64) != 0 ? null : arrayList;
        List list8 = (i4 & 128) != 0 ? null : list4;
        String str6 = (i4 & 256) != 0 ? null : str2;
        Long l3 = (i4 & 1024) != 0 ? null : l2;
        Boolean bool2 = (i4 & 2048) != 0 ? null : bool;
        String str7 = (i4 & 8192) != 0 ? null : str3;
        String str8 = (i4 & 16384) == 0 ? str4 : null;
        jo20 jo20Var = new jo20();
        if (list5 != null && !list5.isEmpty()) {
            jo20Var.put("categoriesFilterIds", CollectionsKt.b0(list5, Separators.COMMA, null, null, null, 62));
            jo20Var.put("categoriesFilterType", str5);
        }
        if (list6 != null && !list6.isEmpty()) {
            jo20Var.put("partIds", CollectionsKt.b0(list6, Separators.COMMA, null, null, null, 62));
        }
        if (list7 != null && !list7.isEmpty()) {
            jo20Var.put("brandIds", CollectionsKt.b0(list7, Separators.COMMA, null, null, null, 62));
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            jo20Var.put("productIds", CollectionsKt.b0(arrayList2, Separators.COMMA, null, null, null, 62));
        }
        if (list8 != null && !list8.isEmpty()) {
            jo20Var.put("gameIds", CollectionsKt.b0(list8, Separators.COMMA, null, null, null, 62));
        }
        if (str6 != null && !StringsKt.W(str6)) {
            jo20Var.put("nameSubstr", str6);
        }
        if (l3 != null) {
            jo20Var.put("bonusId", String.valueOf(l3.longValue()));
        }
        if (Intrinsics.d(bool2, Boolean.TRUE)) {
            jo20Var.put("isTest", String.valueOf(bool2.booleanValue()));
        }
        if (str7 != null && !StringsKt.W(str7)) {
            jo20Var.put("orderBy", str7);
        }
        if (str8 != null && !StringsKt.W(str8)) {
            jo20Var.put("orderDirection", str8);
        }
        jo20Var.put("skip", String.valueOf(i2));
        jo20Var.put("limit", String.valueOf(i3));
        return jo20Var.b();
    }

    public static final lxl L(String str, long j2, boolean z) {
        return new lxl(j2, (dyl) new xxl(str), false, z ? uxl.b : uxl.f36445a, (cwl) null, 96);
    }

    public static final void M(p9k0 p9k0Var, ArrayList arrayList, int i2) {
        boolean zL = p9k0Var.l(i2);
        int[] iArr = p9k0Var.b;
        if (zL) {
            arrayList.add(p9k0Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            M(p9k0Var, arrayList, i4);
        }
    }

    public static final int N(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iE = Intrinsics.e(((fox) list.get(i4)).b, i2);
            if (iE < 0) {
                i3 = i4 + 1;
            } else {
                if (iE <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final gbn O(Function1 function1) {
        return new gbn(new o33((byte) 22), new l9(3, (byte) 28), new wc2(function1, (byte) 14), zx3.h);
    }

    public static final Object P(Object obj, Integer num, Object obj2) {
        sby sbyVar = obj instanceof sby ? (sby) obj : null;
        if (sbyVar == null) {
            return null;
        }
        Object obj3 = sbyVar.b;
        Integer num2 = sbyVar.f31961a;
        if (num2.equals(num) && Intrinsics.d(obj3, obj2)) {
            return obj;
        }
        Object objP = P(num2, num, obj2);
        return objP == null ? P(obj3, num, obj2) : objP;
    }

    public static final void Q(t9k0 t9k0Var, int i2, Object obj) {
        int iG = t9k0Var.g(i2);
        Object[] objArr = t9k0Var.c;
        Object obj2 = objArr[iG];
        objArr[iG] = ukd.f35823a;
        if (obj == obj2) {
            return;
        }
        ykd.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + Separators.RPAREN);
    }

    public static final void R(int i2, int i3, List list) {
        int iN = N(i2, list);
        if (iN < 0) {
            iN = -(iN + 1);
        }
        while (iN < list.size() && ((fox) list.get(iN)).b < i3) {
        }
    }

    public static final n52 S(List list) {
        ArrayList arrayListU = twn.u(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((xah) obj).n) {
                arrayListU.add(obj);
            } else {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(U((xah) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayListU, 10));
        Iterator it2 = arrayListU.iterator();
        while (it2.hasNext()) {
            arrayList3.add(U((xah) it2.next()));
        }
        return new n52(arrayList3, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    public static final tha T(wha whaVar) {
        ?? arrayList;
        Collection collection = whaVar.b;
        if (collection == null) {
            collection = iun.f15405a;
        }
        Iterable iterable = whaVar.f39157a;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(collection, iterable);
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListQ0, 10));
        Iterator it = arrayListQ0.iterator();
        while (it.hasNext()) {
            arrayList2.add(x1x.Q((ooa) it.next()));
        }
        List list = whaVar.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(x1x.Q((ooa) it2.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new tha(arrayList2, arrayList);
    }

    public static final nyg U(xah xahVar) {
        String str = xahVar.f40554a;
        String str2 = xahVar.b;
        int i2 = xahVar.c;
        String str3 = xahVar.f;
        long j2 = xahVar.g;
        int i3 = xahVar.h;
        long j3 = xahVar.i;
        String str4 = xahVar.j;
        return new nyg(i2, 0, i3, 2, j2, j3, xahVar.k, str, str2, str3, str4, xahVar.l, true, xahVar.n);
    }

    public static final int V(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final void a(mm40 mm40Var, final int i2, final lh80 lh80Var, final long j2, final IntRange intRange, final ycl yclVar, final ugd ugdVar, fet fetVar, int i3) {
        fetVar.g0(1160659839);
        int i4 = i3 | (fetVar.e(i2) ? 32 : 16) | (fetVar.d(32.0f) ? 256 : 128) | (fetVar.d(40.0f) ? 2048 : 1024) | (fetVar.g(lh80Var) ? 16384 : 8192) | (fetVar.d(12.0f) ? 131072 : 65536) | (fetVar.f(j2) ? 1048576 : 524288) | (fetVar.i(intRange) ? 8388608 : 4194304) | (fetVar.g(yclVar) ? 67108864 : 33554432) | 268435456;
        if (fetVar.U(i4 & 1, (306783379 & i4) != 306783378)) {
            fetVar.Z();
            if ((i3 & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
            } else {
                fetVar.X();
            }
            fetVar.s();
            if (i2 <= 0) {
                jf4.o("count must be > 0");
                return;
            } else {
                if (ycl.a(40.0f, 32.0f) < 0) {
                    jf4.o("maxCellWidth must be >= minCellWidth");
                    return;
                }
                nnw0.g(mm40Var, null, false, u1c.M(-1949321751, new xdr() { // from class: a.ip
                    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
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
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        float f2;
                        kotlin.ranges.a aVar;
                        kotlin.ranges.a aVar2;
                        Object obj4;
                        float f3;
                        float f4;
                        lr8 lr8Var = (lr8) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        lr8Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(lr8Var) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            final k6z k6zVar = (k6z) fetVar2.k(bmd.n);
                            final w6k w6kVar = (w6k) fetVar2.k(bmd.h);
                            lh80 lh80Var2 = lh80Var;
                            float fD = lr8Var.d() - (s5x0.A(lh80Var2, k6zVar) + s5x0.B(lh80Var2, k6zVar));
                            int i5 = i2;
                            float f5 = i5;
                            final float f6 = ((ycl) l1e0.h(new ycl(fD / f5), new ycl(32.0f), new ycl(40.0f))).f42389a;
                            float f7 = fD - (f5 * f6);
                            if (i5 > 1) {
                                zcl zclVar2 = qmk.f28987a;
                                if (ycl.a(f7, 0.0f) > 0) {
                                    f2 = f7 / (i5 - 1);
                                } else {
                                    zcl zclVar3 = qmk.f28987a;
                                    f2 = 0.0f;
                                }
                            } else {
                                zcl zclVar4 = qmk.f28987a;
                                f2 = 0.0f;
                            }
                            IntRange intRange2 = intRange;
                            boolean zG = fetVar2.g(intRange2) | fetVar2.e(i5);
                            Object objP = fetVar2.P();
                            cl5 cl5Var = ukd.f35823a;
                            Object obj5 = objP;
                            if (zG || objP == cl5Var) {
                                if (intRange2 != null) {
                                    int i6 = i5 - 1;
                                    int iD = l1e0.d(intRange2.f46068a, 0, i6);
                                    int iD2 = l1e0.d(intRange2.b, 0, i6);
                                    if (iD <= iD2) {
                                        aVar = aVar2;
                                        aVar2 = new IntRange(iD, iD2, 1);
                                    } else {
                                        aVar = aVar2;
                                        aVar2 = new kotlin.ranges.a(iD2, iD, 1);
                                    }
                                } else {
                                    aVar = null;
                                }
                                fetVar2.o0(aVar);
                                obj5 = aVar;
                            }
                            final IntRange intRange3 = (IntRange) obj5;
                            jm40 jm40Var = jm40.b;
                            mm40 mm40VarK = lgb.K(s5x0.I(o7k0.d(jm40Var, 1.0f), lh80Var2));
                            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                            jpm0.o(fetVar2, tj30VarC, shdVar);
                            shd shdVar2 = gqw0.w;
                            jpm0.o(fetVar2, bh90VarM, shdVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            shd shdVar3 = gqw0.y;
                            jpm0.o(fetVar2, numValueOf, shdVar3);
                            jpm0.n(fetVar2);
                            shd shdVar4 = gqw0.v;
                            jpm0.o(fetVar2, mm40VarC0, shdVar4);
                            mm40 mm40VarA = jr8.f16991a.a(jm40Var);
                            boolean zI = fetVar2.i(intRange3) | fetVar2.g(w6kVar) | fetVar2.d(f6) | fetVar2.d(f2) | fetVar2.d(0.0f);
                            final ycl yclVar2 = yclVar;
                            final float f8 = f2;
                            boolean zE = fetVar2.e(k6zVar.ordinal()) | zI | fetVar2.g(yclVar2) | fetVar2.d(12.0f);
                            final long j3 = j2;
                            boolean zF = zE | fetVar2.f(j3);
                            Object objP2 = fetVar2.P();
                            if (zF || objP2 == cl5Var) {
                                f3 = 1.0f;
                                obj4 = new Function1() { // from class: a.kp
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        fhl fhlVar = (fhl) obj6;
                                        fhlVar.getClass();
                                        IntRange intRange4 = intRange3;
                                        if (intRange4 == null) {
                                            return Unit.f46060a;
                                        }
                                        w6k w6kVar2 = w6kVar;
                                        float fW0 = w6kVar2.w0(f6);
                                        float fW1 = w6kVar2.w0(f8);
                                        float fW2 = w6kVar2.w0(0.0f);
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                                        ycl yclVar3 = yclVar2;
                                        float fW3 = yclVar3 != null ? w6kVar2.w0(yclVar3.f42389a) : fIntBitsToFloat;
                                        float f9 = (fIntBitsToFloat - fW3) / 2.0f;
                                        if (f9 < 0.0f) {
                                            f9 = 0.0f;
                                        }
                                        float f10 = fW1 + fW0;
                                        float f11 = (intRange4.f46068a * f10) - fW2;
                                        float fIntBitsToFloat2 = (intRange4.b * f10) + fW0 + fW2;
                                        k6z k6zVar2 = k6z.f17794a;
                                        k6z k6zVar3 = k6zVar;
                                        float fIntBitsToFloat3 = k6zVar3 == k6zVar2 ? f11 : Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fIntBitsToFloat2;
                                        if (k6zVar3 != k6zVar2) {
                                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - f11;
                                        }
                                        float f12 = fIntBitsToFloat2 - fIntBitsToFloat3;
                                        if (f12 < 0.0f) {
                                            f12 = 0.0f;
                                        }
                                        float fMin = Math.min(w6kVar2.w0(12.0f), fW3 / 2.0f);
                                        fhl.o0(fhlVar, j3, (((long) Float.floatToRawIntBits(fIntBitsToFloat3 >= 0.0f ? fIntBitsToFloat3 : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), (((long) Float.floatToRawIntBits(fW3)) & 4294967295L) | (((long) Float.floatToRawIntBits(f12)) << 32), (((long) Float.floatToRawIntBits(fMin)) & 4294967295L) | (Float.floatToRawIntBits(fMin) << 32), null, 240);
                                        return Unit.f46060a;
                                    }
                                };
                                f4 = f8;
                                fetVar2.o0(obj4);
                            } else {
                                obj4 = objP2;
                                f4 = f8;
                                f3 = 1.0f;
                            }
                            p8a.k(mm40VarA, (Function1) obj4, fetVar2, 0);
                            mm40 mm40VarD = o7k0.d(r18, f3);
                            thg0 thg0VarA = shg0.a(i5 > 1 ? new qw3(f4, true, new jf4((byte) 14)) : uc9.f35418a, gqw0.k, fetVar2, 48);
                            int iHashCode2 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM2 = fetVar2.m();
                            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
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
                            fetVar2.e0(657892333);
                            for (int i7 = 0; i7 < i5; i7++) {
                                ugdVar.j(Integer.valueOf(i7), o7k0.s(jm40Var, f6), fetVar2, 0);
                            }
                            ohs0.x(fetVar2, false, true, true);
                        } else {
                            fetVar2.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, 3078, 6);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jp(mm40Var, i2, lh80Var, j2, intRange, yclVar, ugdVar, i3);
        }
    }

    public static final void b(final mm40 mm40Var, final int i2, final float f2, final float f3, final hh80 hh80Var, final ugd ugdVar, fet fetVar, final int i3) {
        int i4;
        final ugd ugdVar2;
        fetVar.g0(587752543);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.d(f3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= fetVar.g(hh80Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            ugdVar2 = ugdVar;
            i4 |= fetVar.i(ugdVar2) ? 131072 : 65536;
        } else {
            ugdVar2 = ugdVar;
        }
        int i5 = i4;
        if (fetVar.U(i5 & 1, (74899 & i5) != 74898)) {
            fetVar.Z();
            if ((i3 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            if (ycl.a(f3, f2) < 0) {
                jf4.o("maxCellWidth must be greater than minCellWidth");
                return;
            }
            nnw0.g(mm40Var, null, false, u1c.M(149207477, new xdr() { // from class: a.gp
                /* JADX WARN: Code duplicated, block: B:20:0x0078  */
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    lr8 lr8Var = (lr8) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    lr8Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar2.g(lr8Var) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        k6z k6zVar = (k6z) fetVar2.k(bmd.n);
                        hh80 hh80Var2 = hh80Var;
                        float fD = lr8Var.d() - (s5x0.A(hh80Var2, k6zVar) + s5x0.B(hh80Var2, k6zVar));
                        int i6 = i2;
                        float f4 = i6;
                        float f5 = ((ycl) l1e0.h(new ycl(fD / f4), new ycl(f2), new ycl(f3))).f42389a;
                        float f6 = fD - (f4 * f5);
                        float f7 = 0.0f;
                        if (i6 > 1) {
                            zcl zclVar = qmk.f28987a;
                            if (ycl.a(f6, 0.0f) > 0) {
                                f7 = f6 / (i6 - 1);
                            } else {
                                zcl zclVar2 = qmk.f28987a;
                            }
                        } else {
                            zcl zclVar3 = qmk.f28987a;
                        }
                        jm40 jm40Var = jm40.b;
                        mm40 mm40VarI = s5x0.I(o7k0.d(jm40Var, 1.0f), hh80Var2);
                        thg0 thg0VarA = shg0.a(i6 > 1 ? new qw3(f7, true, new jf4((byte) 14)) : uc9.f35418a, gqw0.k, fetVar2, 48);
                        int iHashCode = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM = fetVar2.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarI);
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
                        fetVar2.e0(-1459220429);
                        for (int i7 = 0; i7 < i6; i7++) {
                            ugdVar2.j(Integer.valueOf(i7), o7k0.s(jm40Var, f5), fetVar2, 0);
                        }
                        fetVar2.r(false);
                        fetVar2.r(true);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i5 & 14) | 3072, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.hp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cwr0.b(mm40Var, i2, f2, f3, hh80Var, ugdVar, (fet) obj, x8x.L(i3 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void c(mm40 mm40Var, vl8 vl8Var, clo cloVar, wom womVar, Function1 function1, fet fetVar, int i2) {
        wom womVar2;
        Function1 function2;
        mm40 mm40Var2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-779388217);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(vl8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(cloVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            womVar2 = womVar;
            i3 |= fetVar2.g(womVar2) ? 2048 : 1024;
        } else {
            womVar2 = womVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            boolean z3 = vl8Var instanceof tl8;
            cl5 cl5Var = ukd.f35823a;
            jm40 jm40Var = jm40.b;
            if (z3) {
                fetVar2.e0(763432493);
                tl8 tl8Var = (tl8) vl8Var;
                boolean z4 = tl8Var.j;
                boolean z5 = tl8Var.m && cloVar.f4569a.a() == 0.0f;
                boolean z6 = (i3 & 57344) == 16384;
                Object objP = fetVar2.P();
                if (z6 || objP == cl5Var) {
                    objP = new tk8(function1, (byte) 7);
                    fetVar2.o0(objP);
                }
                ugd ugdVarM = u1c.M(1292006814, new ri1(vl8Var, function1), fetVar2);
                int i4 = ((i3 >> 3) & 896) | 100663302;
                mm40Var2 = jm40Var;
                mom.c(n0qVar, z4, womVar2, null, z5, null, (Function0) objP, null, ugdVarM, fetVar2, i4, 168);
                fetVar2 = fetVar2;
                fetVar2.r(false);
                function2 = function1;
                z = true;
            } else {
                int i5 = i3;
                mm40Var2 = jm40Var;
                if (!(vl8Var instanceof ul8)) {
                    throw b1j.f(763431104, fetVar2, false);
                }
                fetVar2.e0(763604136);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40Var2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                mm40 mm40VarB = jr8.f16991a.b(mm40Var2, gqw0.e);
                mdm mdmVar = ((ul8) vl8Var).j;
                boolean z7 = (i5 & 57344) == 16384;
                Object objP2 = fetVar2.P();
                if (z7 || objP2 == cl5Var) {
                    function2 = function1;
                    objP2 = new tk8(function2, (byte) 8);
                    fetVar2.o0(objP2);
                } else {
                    function2 = function1;
                }
                jcb.l(mm40VarB, mdmVar, true, (Function0) objP2, fetVar2, 384, 0);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            function2 = function1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var2, (Object) vl8Var, (Object) cloVar, (Object) womVar, (Object) function2, i2, (byte) 4);
        }
    }

    public static final void d(mm40 mm40Var, vl8 vl8Var, Function1 function1, fet fetVar, int i2) {
        function1.getClass();
        fetVar.g0(1461297978);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(vl8Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new tk8(function1, b2);
                fetVar.o0(objP);
            }
            knx.i(false, (Function0) objP, fetVar, 0, 1);
            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar), fetVar, 24576);
            wom womVarF = mom.f(fetVar);
            c3d c3dVar = cloVarB.e;
            boolean zG = fetVar.g(c3dVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new xk8(c3dVar, womVarF);
                fetVar.o0(objP2);
            }
            mm40 mm40VarV = cjx.V(i120.Q(mm40Var.e(o7k0.c), vl8Var.i(), jd8.n), (xk8) objP2, null);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarV);
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
            e(vl8Var, cloVarB, function1, fetVar, i4 | ((i3 >> 3) & 14));
            c(null, vl8Var, cloVarB, womVarF, function1, fetVar, ((i3 << 6) & 57344) | (i3 & 112));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, vl8Var, function1, i2, (byte) 8);
        }
    }

    public static final void e(final vl8 vl8Var, clo cloVar, final Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(935336107);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(vl8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(cloVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            bww.g(o7k0.d(jm40Var, 1.0f), cloVar, u1c.M(1199231082, new Function2() { // from class: a.wk8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b2;
                    cl5 cl5Var = ukd.f35823a;
                    Function1 function2 = function1;
                    vl8 vl8Var2 = vl8Var;
                    byte b5 = 2;
                    fet fetVar3 = (fet) obj;
                    switch (b4) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                                imm immVarA = vl8Var2.a();
                                boolean zG = fetVar3.g(function2);
                                Object objP = fetVar3.P();
                                if (zG || objP == cl5Var) {
                                    objP = new tk8(function2, (byte) 9);
                                    fetVar3.o0(objP);
                                }
                                hlm.c(mm40VarD, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar3, 6, 0, 4084);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                fetVar3.X();
                            } else if (vl8Var2.g()) {
                                fetVar3.e0(188361389);
                                ijl ijlVarC = vl8Var2.c();
                                jjl jjlVarD = vl8Var2.d();
                                gjl gjlVarE = vl8Var2.e();
                                boolean zG2 = fetVar3.g(function2);
                                Object objP2 = fetVar3.P();
                                if (zG2 || objP2 == cl5Var) {
                                    objP2 = new tk8(function2, b5);
                                    fetVar3.o0(objP2);
                                }
                                Function0 function0 = (Function0) objP2;
                                boolean zG3 = fetVar3.g(function2);
                                Object objP3 = fetVar3.P();
                                if (zG3 || objP3 == cl5Var) {
                                    objP3 = new tk8(function2, (byte) 3);
                                    fetVar3.o0(objP3);
                                }
                                Function0 function3 = (Function0) objP3;
                                boolean zG4 = fetVar3.g(function2);
                                Object objP4 = fetVar3.P();
                                if (zG4 || objP4 == cl5Var) {
                                    objP4 = new tk8(function2, (byte) 4);
                                    fetVar3.o0(objP4);
                                }
                                feb.k(ijlVarC, jjlVarD, gjlVarE, function0, function3, (Function0) objP4, fetVar3, 0, 0);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(189078295);
                                fetVar3.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar2), u1c.M(1277352171, new Function2() { // from class: a.wk8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    cl5 cl5Var = ukd.f35823a;
                    Function1 function2 = function1;
                    vl8 vl8Var2 = vl8Var;
                    byte b5 = 2;
                    fet fetVar3 = (fet) obj;
                    switch (b4) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                                imm immVarA = vl8Var2.a();
                                boolean zG = fetVar3.g(function2);
                                Object objP = fetVar3.P();
                                if (zG || objP == cl5Var) {
                                    objP = new tk8(function2, (byte) 9);
                                    fetVar3.o0(objP);
                                }
                                hlm.c(mm40VarD, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar3, 6, 0, 4084);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                fetVar3.X();
                            } else if (vl8Var2.g()) {
                                fetVar3.e0(188361389);
                                ijl ijlVarC = vl8Var2.c();
                                jjl jjlVarD = vl8Var2.d();
                                gjl gjlVarE = vl8Var2.e();
                                boolean zG2 = fetVar3.g(function2);
                                Object objP2 = fetVar3.P();
                                if (zG2 || objP2 == cl5Var) {
                                    objP2 = new tk8(function2, b5);
                                    fetVar3.o0(objP2);
                                }
                                Function0 function0 = (Function0) objP2;
                                boolean zG3 = fetVar3.g(function2);
                                Object objP3 = fetVar3.P();
                                if (zG3 || objP3 == cl5Var) {
                                    objP3 = new tk8(function2, (byte) 3);
                                    fetVar3.o0(objP3);
                                }
                                Function0 function3 = (Function0) objP3;
                                boolean zG4 = fetVar3.g(function2);
                                Object objP4 = fetVar3.P();
                                if (zG4 || objP4 == cl5Var) {
                                    objP4 = new tk8(function2, (byte) 4);
                                    fetVar3.o0(objP4);
                                }
                                feb.k(ijlVarC, jjlVarD, gjlVarE, function0, function3, (Function0) objP4, fetVar3, 0, 0);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(189078295);
                                fetVar3.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar2), fetVar2, (i3 & 112) | 3462);
            fetVar2 = fetVar2;
            if (vl8Var.a().e) {
                fetVar2.e0(-1804017151);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1804259633);
                bgi0 bgi0VarJ = vl8Var.j();
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mbc.o(bgi0VarJ, o7k0.e(mm40VarD, 1.0f), true, fetVar2, 384, 0);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 13, i2, (Object) vl8Var, (Object) cloVar, function1);
        }
    }

    public static final void f(kf2 kf2Var, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(948379778);
        int i3 = i2 | (fetVar2.g(kf2Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) fetVar2.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar2);
            e2d e2dVarD = nip.d(null, null, fetVar2, 7);
            Boolean boolValueOf = Boolean.valueOf(zC);
            boolean zI = fetVar2.i(window) | fetVar2.i(context) | fetVar2.h(zC);
            Object objP = fetVar2.P();
            byte b2 = 2;
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new la2(window, context, zC, b2);
                fetVar2.o0(objP);
            }
            s0x.d(boolValueOf, null, (Function1) objP, fetVar2, 0);
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            mm40 mm40VarW = o050.W(jm40.b);
            qim qimVar = kf2Var.c;
            boolean z2 = (i3 & 896) == 256;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new wc2(function1, b2);
                fetVar2.o0(objP2);
            }
            ckb.k(mm40VarW, qimVar, true, e2dVarD, null, (Function1) objP2, fetVar, 24960, 0);
            fetVar2 = fetVar;
            mm40 mm40VarC = nip.c(i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n), e2dVarD, fetVar2, 0);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarC);
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
            ugdVar.O(jr8.f16991a, e2dVarD, kf2Var.f18178a, fetVar2, 3078);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(kf2Var, function1, ugdVar, i2, (byte) 29);
        }
    }

    public static final void g(int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        String str3;
        String str4;
        fet fetVar2 = fetVar;
        fetVar2.g0(22758451);
        int i3 = i2 | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2);
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarC);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f);
            jr8 jr8Var = jr8.f16991a;
            k7x.b(str, null, o2e.e0(jr8Var.b(mm40VarN, zx7Var), "BAN_PICKS_FIRST_TEAM_IMAGE_TEST_TAG"), null, pm80VarF, null, null, null, null, null, null, null, fetVar2, (i3 & 14) | 32816, 0, 32744);
            fetVar2 = fetVar;
            str3 = str;
            str4 = str2;
            k7x.b(str4, null, o2e.e0(jr8Var.b(o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 24.0f), gqw0.g), "BAN_PICKS_SECOND_TEAM_IMAGE_TEST_TAG"), null, pm80VarF, null, null, null, null, null, null, null, fetVar2, ((i3 >> 3) & 14) | 32816, 0, 32744);
            fetVar2.r(true);
        } else {
            str3 = str;
            str4 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(str3, str4, mm40Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(mm40 mm40Var, nx6 nx6Var, pln0 pln0Var, wnb0 wnb0Var, final kke kkeVar, gx6 gx6Var, String str, hh80 hh80Var, final Function0 function0, final Function0 function1, Function1 function2, Function0 function3, Function2 function4, fet fetVar, int i2, int i3) {
        Function0 function5;
        int i4;
        mm40 mm40Var2;
        hh80 hh80Var2;
        Function2 function6;
        Function0 function7;
        int i5;
        ugd ugdVarM;
        hh80 hh80Var3;
        mm40 mm40Var3;
        int i6;
        Function2 function8;
        boolean z;
        ugd ugdVarM2;
        boolean z2;
        str.getClass();
        fetVar.g0(947666066);
        int i7 = i2 | 6 | (fetVar.g(nx6Var) ? 32 : 16) | (fetVar.g(pln0Var) ? 256 : 128) | (fetVar.g(wnb0Var) ? 2048 : 1024) | (fetVar.g(kkeVar) ? 16384 : 8192) | (fetVar.e(gx6Var.ordinal()) ? 131072 : 65536) | (fetVar.g(str) ? 1048576 : 524288) | 4194304 | (fetVar.i(function0) ? 67108864 : 33554432) | (fetVar.i(function1) ? 536870912 : 268435456);
        int i8 = fetVar.i(function2) ? 4 : 2;
        int i9 = i3 & 2048;
        if (i9 != 0) {
            i4 = i8 | 48;
            function5 = function3;
        } else {
            function5 = function3;
            i4 = i8 | (fetVar.i(function5) ? 32 : 16);
        }
        int i10 = 128 | i4;
        if (fetVar.U(i7 & 1, ((306783379 & i7) == 306783378 && (i10 & 147) == 146) ? false : true)) {
            fetVar.Z();
            ugd ugdVarM3 = null;
            if ((i2 & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                lh80 lh80VarT = s5x0.t(16.0f, 0.0f, 2);
                i5 = i7 & (-29360129);
                if (i9 != 0) {
                    function5 = null;
                }
                if (wnb0Var.c) {
                    fetVar.e0(1100347602);
                    ugdVarM = u1c.M(576646819, new fa2((Object) wnb0Var, (byte) 27), fetVar);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1100567019);
                    fetVar.r(false);
                    ugdVarM = null;
                }
                ugd ugdVar = ugdVarM;
                hh80Var3 = lh80VarT;
                mm40Var3 = jm40.b;
                i6 = i10 & (-897);
                function8 = ugdVar;
            } else {
                fetVar.X();
                int i11 = i7 & (-29360129);
                mm40Var3 = mm40Var;
                i5 = i11;
                i6 = i10 & (-897);
                hh80Var3 = hh80Var;
                function8 = function4;
            }
            Function0 function9 = function5;
            fetVar.s();
            mm40 mm40Var4 = mm40Var3;
            mm40 mm40VarN = epv0.N(s5x0.I(mm40Var3, hh80Var3), gx6Var == gx6.c ? 0.5f : 1.0f);
            zcl zclVar2 = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            boolean z3 = (i6 & 14) == 4;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new uo6(function2, (byte) 3);
                fetVar.o0(objP);
            }
            Function1 function10 = (Function1) objP;
            if (kkeVar.f18433a) {
                fetVar.e0(-1229396234);
                z = false;
                final Object[] objArr = null == true ? 1 : 0;
                ugdVarM2 = u1c.M(252267590, new Function2() { // from class: a.ow6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = objArr;
                        cl5 cl5Var = ukd.f35823a;
                        Function0 function11 = function0;
                        kke kkeVar2 = kkeVar;
                        switch (b2) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    boolean z4 = kkeVar2.c;
                                    boolean zG = fetVar2.g(function11);
                                    Object objP2 = fetVar2.P();
                                    if (zG || objP2 == cl5Var) {
                                        objP2 = new tq(function11, (byte) 16);
                                        fetVar2.o0(objP2);
                                    }
                                    cwr0.i(R.drawable.ic_glyph_minus_small, 0, fetVar2, null, (Function0) objP2, z4);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    boolean z5 = kkeVar2.d;
                                    boolean zG2 = fetVar3.g(function11);
                                    Object objP3 = fetVar3.P();
                                    if (zG2 || objP3 == cl5Var) {
                                        objP3 = new tq(function11, (byte) 17);
                                        fetVar3.o0(objP3);
                                    }
                                    cwr0.i(R.drawable.ic_glyph_plus_small, 0, fetVar3, null, (Function0) objP3, z5);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar);
                fetVar.r(false);
            } else {
                z = false;
                fetVar.e0(-1229067263);
                fetVar.r(false);
                ugdVarM2 = null;
            }
            if (kkeVar.b) {
                fetVar.e0(-1228984647);
                final byte b2 = 1;
                ugdVarM3 = u1c.M(-1679689691, new Function2() { // from class: a.ow6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b2;
                        cl5 cl5Var = ukd.f35823a;
                        Function0 function11 = function1;
                        kke kkeVar2 = kkeVar;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    boolean z4 = kkeVar2.c;
                                    boolean zG = fetVar2.g(function11);
                                    Object objP2 = fetVar2.P();
                                    if (zG || objP2 == cl5Var) {
                                        objP2 = new tq(function11, (byte) 16);
                                        fetVar2.o0(objP2);
                                    }
                                    cwr0.i(R.drawable.ic_glyph_minus_small, 0, fetVar2, null, (Function0) objP2, z4);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    boolean z5 = kkeVar2.d;
                                    boolean zG2 = fetVar3.g(function11);
                                    Object objP3 = fetVar3.P();
                                    if (zG2 || objP3 == cl5Var) {
                                        objP3 = new tq(function11, (byte) 17);
                                        fetVar3.o0(objP3);
                                    }
                                    cwr0.i(R.drawable.ic_glyph_plus_small, 0, fetVar3, null, (Function0) objP3, z5);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar);
                fetVar.r(z);
            } else {
                fetVar.e0(-1228658559);
                fetVar.r(z);
            }
            int i12 = i5 >> 6;
            Function2 function11 = function8;
            r(null, nx6Var, pln0Var, gx6Var, str, function10, function9, ugdVarM2, ugdVarM3, fetVar, (i5 & 1008) | (i12 & 7168) | (i12 & 57344) | ((i6 << 15) & 3670016));
            if (function11 == null) {
                fetVar.e0(-1228616771);
                z2 = false;
            } else {
                z2 = false;
                fetVar.e0(-1009464124);
                function11.invoke(fetVar, 0);
            }
            fetVar.r(z2);
            fetVar.r(true);
            mm40Var2 = mm40Var4;
            function6 = function11;
            hh80Var2 = hh80Var3;
            function7 = function9;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            hh80Var2 = hh80Var;
            function6 = function4;
            function7 = function5;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pw6(mm40Var2, nx6Var, pln0Var, wnb0Var, kkeVar, gx6Var, str, hh80Var2, function0, function1, function2, function7, function6, i2, i3);
        }
    }

    public static final void i(int i2, int i3, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(118980106);
        int i4 = i3 | 6 | (fetVar.e(i2) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z2 = (i4 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                wul wulVar = new wul(mul.e, oe9.c, new te9(i2), z, false, false);
                fetVar.o0(wulVar);
                objP = wulVar;
            }
            int i5 = 6 | ((i4 >> 3) & 896);
            jm40 jm40Var = jm40.b;
            qzb.n(jm40Var, (wul) objP, function0, fetVar, i5, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var2, i2, z, function0, i3, (byte) 2);
        }
    }

    public static final void j(imm immVar, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        imm immVar2;
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(958095718);
        if ((i2 & 6) == 0) {
            immVar2 = immVar;
            i3 = (fetVar2.g(immVar2) ? 4 : 2) | i2;
        } else {
            immVar2 = immVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            mm40 mm40VarW = o050.W(jm40.b);
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            boolean z3 = z2;
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new dng0(function1, (byte) 29);
                fetVar2.o0(objP);
            }
            int i4 = i3;
            hlm.c(mm40VarW, immVar2, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, ((i3 << 3) & 112) | 805306368, 54, 500);
            fetVar2 = fetVar;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new igh0((byte) 27);
                fetVar2.o0(objP2);
            }
            jcb.l(null, mdmVar, false, (Function0) objP2, fetVar2, (i4 & 112) | 3072, 5);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf7(immVar, mdmVar, function1, i2, (byte) 5);
        }
    }

    public static final void k(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1890093429);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 18;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ts9 ts9Var = (ts9) l7m0Var.getValue();
            if (ts9Var != null) {
                if (ts9Var instanceof rs9) {
                    fetVar.e0(752295211);
                    rsr0.N(0, fetVar);
                    fetVar.r(false);
                } else if (ts9Var instanceof ns9) {
                    fetVar.e0(752381019);
                    s5x0.o(((ns9) ts9Var).f24042a, fetVar, 0);
                    fetVar.r(false);
                } else if (ts9Var instanceof ls9) {
                    fetVar.e0(752511281);
                    ls9 ls9Var = (ls9) ts9Var;
                    dj8.x(ls9Var.f20566a, ls9Var.b, function1, fetVar, (i3 << 3) & 896);
                    fetVar.r(false);
                } else if (ts9Var instanceof ps9) {
                    fetVar.e0(752738480);
                    aad.q(((ps9) ts9Var).f27505a, function1, fetVar, i3 & 112);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-391376379, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i2, b2);
        }
    }

    public static final void l(final mm40 mm40Var, final boolean z, final float f2, final float f3, final float f4, ugd ugdVar, final xdr xdrVar, final xdr xdrVar2, fet fetVar, final int i2) {
        ugd ugdVar2;
        boolean z2;
        Object objJ;
        boolean z3;
        zx7 zx7Var = gqw0.d;
        fetVar.g0(-2128594302);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128) | (fetVar.d(f3) ? 2048 : 1024) | (fetVar.d(f4) ? 16384 : 8192) | (fetVar.i(xdrVar) ? 1048576 : 524288) | (fetVar.i(xdrVar2) ? 8388608 : 4194304);
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            oms0 oms0VarZ = phu0.Z(Boolean.valueOf(z), null, fetVar, (i3 >> 3) & 14, 2);
            p4 p4Var = oms0VarZ.f25519a;
            lxs0 lxs0Var = hp4.j;
            boolean zH = oms0VarZ.h();
            Object obj = ukd.f35823a;
            if (zH) {
                z2 = false;
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG = fetVar.g(oms0VarZ);
                objJ = fetVar.P();
                if (zG || objJ == obj) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar.o0(objY0);
                        objJ = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar.r(false);
                z2 = false;
            }
            boolean zBooleanValue = ((Boolean) objJ).booleanValue();
            fetVar.e0(1640571747);
            float f5 = zBooleanValue ? 0.0f : 1.0f;
            fetVar.r(z2);
            Float fValueOf = Float.valueOf(f5);
            boolean zG2 = fetVar.g(oms0VarZ);
            Object objP = fetVar.P();
            if (zG2 || objP == obj) {
                objP = jgk0.b(new gb3(oms0VarZ, (byte) 26));
                fetVar.o0(objP);
            }
            boolean zBooleanValue2 = ((Boolean) ((l7m0) objP).getValue()).booleanValue();
            fetVar.e0(1640571747);
            float f6 = zBooleanValue2 ? 0.0f : 1.0f;
            fetVar.r(false);
            Float fValueOf2 = Float.valueOf(f6);
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == obj) {
                objP2 = jgk0.b(new gb3(oms0VarZ, (byte) 27));
                fetVar.o0(objP2);
            }
            ((ams0) ((l7m0) objP2).getValue()).getClass();
            fetVar.e0(638307688);
            uts0 uts0VarM0 = ro4.m0(100, 0, hhn.b, 2);
            fetVar.r(false);
            cms0 cms0VarE = phu0.E(oms0VarZ, fValueOf, fValueOf2, uts0VarM0, lxs0Var, fetVar, 0);
            zcl zclVar = qmk.f28987a;
            float f7 = f3 + f2 + 12.0f;
            float f8 = xdrVar != null ? f7 + 1.0f : 0.0f;
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(o7k0.d(jm40Var, 1.0f), 1.0f);
            boolean zG4 = fetVar.g(cms0VarE);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == obj) {
                objP3 = new yd1(cms0VarE, (byte) 28);
                fetVar.o0(objP3);
            }
            ugdVar2 = ugdVar;
            ugdVar2.F(s5x0.N(i4w0.T(mm40VarC, (Function1) objP3), f8, 0.0f, 0.0f, 0.0f, 14), fetVar, 48);
            jr8 jr8Var = jr8.f16991a;
            if (xdrVar2 == null) {
                fetVar.e0(463879605);
                fetVar.r(false);
                z3 = false;
            } else {
                fetVar.e0(1954626508);
                mm40 mm40VarN = s5x0.N(jr8Var.b(jm40Var, zx7Var), f7, 0.0f, 0.0f, 0.0f, 14);
                boolean zG5 = fetVar.g(cms0VarE);
                Object objP4 = fetVar.P();
                if (zG5 || objP4 == obj) {
                    objP4 = new yd1(cms0VarE, (byte) 29);
                    fetVar.o0(objP4);
                }
                z3 = false;
                w6x.v((i3 >> 18) & 112, xdrVar2, i4w0.T(mm40VarN, (Function1) objP4), fetVar, false);
            }
            if (xdrVar == null) {
                fetVar.e0(464109811);
                fetVar.r(z3);
            } else {
                fetVar.e0(1954633934);
                w6x.v((i3 >> 15) & 112, xdrVar, s5x0.N(jr8Var.b(jm40Var, zx7Var), f3, 0.0f, f4, 0.0f, 10), fetVar, false);
            }
            fetVar.r(true);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final ugd ugdVar3 = ugdVar2;
            yfe0VarU.d = new Function2(z, f2, f3, f4, ugdVar3, xdrVar, xdrVar2, i2) { // from class: a.e4b
                public final /* synthetic */ boolean b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ ugd f;
                public final /* synthetic */ xdr g;
                public final /* synthetic */ xdr h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(196609);
                    cwr0.l(this.f7173a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj2, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void m(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-82037152);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ugd ugdVarM = u1c.M(321732892, new t5e0(l7m0Var, function1, (byte) 29), fetVar);
            ugd ugdVarM2 = u1c.M(-71266053, new u7i0(l7m0Var, function1, b2), fetVar);
            pz40 pz40Var = s6t0.f31722a;
            m8x.y(null, ugdVarM, ugdVarM2, null, null, 0, s6t0.b().f33626a.getBackground(), 0L, null, u1c.M(-2039115023, new v7i0(l7m0Var, b2), fetVar), fetVar, 805306800, 441);
            if (((c8i0) l7m0Var.getValue()).f3916a) {
                fetVar.e0(-129163190);
                t(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-129140126);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    public static final void n(mm40 mm40Var, String str, ulq0 ulq0Var, String str2, String str3, ifj ifjVar, jfj jfjVar, Function0 function0, Function0 function1, fet fetVar, int i2) {
        int i3;
        boolean z;
        i4 i4VarG0;
        zx7 zx7Var;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        str3.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(264492930);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.e(ulq0Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(str2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.g(str3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.e(ifjVar == null ? -1 : ifjVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.e(jfjVar.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar2.i(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 67108864 : 33554432;
        }
        if (fetVar2.U(i3 & 1, (38347923 & i3) != 38347922)) {
            int i4 = i3 >> 6;
            boolean z2 = ifjVar == ifj.f14690a;
            boolean z3 = ifjVar == ifj.b;
            boolean z4 = ((((i4 & 112) ^ 48) > 32 && fetVar2.g(str2)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && fetVar2.g(str3)) || (i4 & 384) == 256);
            if (((i4 & 7168) ^ 3072) > 2048) {
                if (fetVar2.e(ifjVar != null ? ifjVar.ordinal() : -1)) {
                    z = true;
                } else if ((i4 & 3072) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
            } else if ((i4 & 3072) == 2048) {
                z = true;
            } else {
                z = false;
            }
            boolean z5 = ((((i4 & 14) ^ 6) > 4 && fetVar2.e(ulq0Var.ordinal())) || (i4 & 6) == 4) | z4 | z;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                int iOrdinal = ulq0Var.ordinal();
                if (iOrdinal == 0) {
                    i4VarG0 = dyb.g0(L(str2, 1L, z2), L(str3, 2L, z3));
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    i4VarG0 = dyb.g0(L(str2, 1L, z2));
                }
                objP = i4VarG0;
                fetVar2.o0(objP);
            }
            i4 i4Var = (i4) objP;
            boolean z6 = (3670016 & i3) == 1048576;
            Object objP2 = fetVar2.P();
            if (z6 || objP2 == cl5Var) {
                int iOrdinal2 = jfjVar.ordinal();
                if (iOrdinal2 == 0) {
                    zx7Var = gqw0.b;
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return;
                    }
                    zx7Var = gqw0.h;
                }
                objP2 = zx7Var;
                fetVar2.o0(objP2);
            }
            u12 u12Var = (u12) objP2;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, hfj.f12976a), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z7 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z7) {
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
            n0q n0qVar = o7k0.c;
            int i5 = i3;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
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
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarI = s5x0.I(n0qVar, hfj.b);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarI);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, s5x0.L(o7k0.w(new x7z(1.0f, true), yx7Var, false, 2), 8.0f, 0.0f, 2), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, qmk.r, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.m(), fetVar2, (i5 >> 3) & 14, 24576, 114672);
            fetVar2 = fetVar2;
            w9x.l(48.0f, 0.0f, u1c.M(1567048248, new coh(i4Var, function0, function1), fetVar2), fetVar2, 384, 2);
            fetVar2.r(true);
            fetVar2.r(true);
            mbc.o(zfi0.f44303a, jr8.f16991a.b(jm40.b, u12Var), false, fetVar2, 6, 4);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ez3(mm40Var, str, (Object) ulq0Var, (Object) str2, (Object) str3, (Object) ifjVar, (Object) jfjVar, (Object) function0, (wdr) function1, i2, (byte) 4);
        }
    }

    public static final void o(mm40 mm40Var, String str, y9q0 y9q0Var, Date date, qol qolVar, tol tolVar, iol iolVar, Function0 function0, fet fetVar, int i2) {
        String str2;
        y9q0 y9q0Var2;
        mm40 mm40Var2;
        iol iolVar2;
        int i3;
        mm40 mm40Var3;
        iol iolVar3;
        fet fetVar2 = fetVar;
        str.getClass();
        function0.getClass();
        fetVar2.g0(478783766);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= fetVar2.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            y9q0Var2 = y9q0Var;
            i4 |= fetVar2.g(y9q0Var2) ? 256 : 128;
        } else {
            y9q0Var2 = y9q0Var;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar2.i(date) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? fetVar2.g(qolVar) : fetVar2.i(qolVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= fetVar2.h(true) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= fetVar2.e(tolVar.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= fetVar2.i(function0) ? 67108864 : 33554432;
        }
        if (fetVar2.U(i4 & 1, (38347923 & i4) != 38347922)) {
            fetVar2.Z();
            int i5 = i2 & 1;
            jm40 jm40Var = jm40.b;
            if (i5 == 0 || fetVar2.B()) {
                pz40 pz40Var = s6t0.f31722a;
                i3 = i4 & (-29360129);
                mm40Var3 = jm40Var;
                iolVar3 = new iol(s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getTextPrimary(), dyb.h0(rol.f30844a, rol.b, rol.c, rol.d), jol.f16863a);
            } else {
                fetVar2.X();
                iolVar3 = iolVar;
                i3 = i4 & (-29360129);
                mm40Var3 = mm40Var;
            }
            fetVar2.s();
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = lgb.K(o7k0.h(mm40VarD, 56.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarL = s5x0.L(o7k0.c.e(mm40Var3), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            mm40 mm40Var4 = mm40Var3;
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
            v8q0.a(str2, o7k0.u(s5x0.N(ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11), 0.0f, 220.0f, 1), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0Var2, fetVar, (i3 >> 3) & 14, ((i3 << 15) & 29360128) | 24960, 110584);
            fetVar2 = fetVar;
            iol iolVar4 = iolVar3;
            fxb.i(date.getTime(), qolVar, null, tolVar, null, iolVar4, function0, fetVar2, ((i3 >> 9) & 7280) | ((i3 >> 6) & 3670016), 20);
            fetVar2.r(true);
            fetVar2.e0(369148506);
            mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jr8.f16991a.b(jm40Var, gqw0.h), 1.0f), 8.0f, 0.0f, 2), false, fetVar2, 6, 4);
            fetVar2.r(false);
            fetVar2.r(true);
            iolVar2 = iolVar4;
            mm40Var2 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
            iolVar2 = iolVar;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ff4(mm40Var2, (Object) str, (Object) y9q0Var, (Object) date, (Object) qolVar, (Object) tolVar, (Object) iolVar2, (Object) function0, i2, (byte) 3);
        }
    }

    public static final void p(int i2, fet fetVar) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1849565097);
        if (fetVar2.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarA0 = wha0.a0(cjx.V(o7k0.c, x0x.a0(fetVar2), null), wha0.T(fetVar2), false, 14);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA0);
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
            wvb.o(null, 16.0f, 0L, fetVar2, 0, 5);
            fetVar2 = fetVar;
            jcb.l(o7k0.e(jm40.b, 68.0f), new mdm(R.string.lottie_prophylaxis, pdm.c, null, R.drawable.ic_glyph_circle_favourite_secondary_60, 0, R.string.nothing_found, 0, 0, 0L, 0L, 980), false, null, fetVar2, 0, 12);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kyz(i2, (byte) 16);
        }
    }

    public static final void q(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1523840730);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 7;
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
                objP = new nas0(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new okp0(mdmVar, function1, i2, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(mm40 mm40Var, nx6 nx6Var, pln0 pln0Var, gx6 gx6Var, String str, Function1 function1, Function0 function0, Function2 function2, Function2 function3, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z;
        androidx.compose.runtime.d dVar;
        long background;
        long background2;
        byte b2;
        fetVar.g0(708259198);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(nx6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(pln0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.e(gx6Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.i(function3) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new lg6((byte) 29);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar.e0(2032279013);
                dVar = zaq0.b;
                background = ((ThemeColors) fetVar.k(dVar)).getPrimary();
                z = false;
            } else {
                z = false;
                fetVar.e0(2032280008);
                dVar = zaq0.b;
                background = ((ThemeColors) fetVar.k(dVar)).getBackground();
            }
            fetVar.r(z);
            int i4 = i3;
            mm40 mm40VarS = i120.S(mm40VarE, 1.0f, background, new ugg0(zclVar, zclVar, zclVar, zclVar));
            int iOrdinal = gx6Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(1809683865);
                background2 = ((ThemeColors) fetVar.k(dVar)).getBackground();
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(1809685658);
                background2 = ((ThemeColors) fetVar.k(dVar)).getWarningTint();
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(1809682061, fetVar, false);
                }
                fetVar.e0(1809687577);
                background2 = ((ThemeColors) fetVar.k(dVar)).getBackground();
                fetVar.r(false);
            }
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarS, background2, jd8.n), 8.0f, 6.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
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
            if (function2 == null) {
                fetVar.e0(-190805633);
                fetVar.r(false);
            } else {
                fetVar.e0(-1668723006);
                h97.q((i4 >> 21) & 14, fetVar, function2, false);
            }
            x7z x7zVar = new x7z(1.0f, true);
            boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
            boolean zG = fetVar.g(pz40Var) | ((i4 & 3670016) == 1048576);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                b2 = 0;
                objP2 = new bw6(b2, pz40Var, function0);
                fetVar.o0(objP2);
            } else {
                b2 = 0;
            }
            boolean z2 = b2;
            x(x7zVar, nx6Var, pln0Var, gx6Var, str, zBooleanValue, function1, (Function1) objP2, fetVar, (i4 & 65520) | (3670016 & (i4 << 3)));
            if (function3 == null) {
                fetVar.e0(-190265985);
                fetVar.r(z2);
            } else {
                fetVar.e0(-1668705598);
                h97.q((i4 >> 24) & 14, fetVar, function3, z2);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ez3(mm40Var2, (Object) nx6Var, (Object) pln0Var, (Object) gx6Var, str, (Object) function1, (wdr) function0, (wdr) function2, (wdr) function3, i2, (byte) 1);
        }
    }

    public static final void s(mm40 mm40Var, a8q0 a8q0Var, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, Function1 function2, fet fetVar, int i2) {
        String str3;
        boolean z5;
        boolean z6;
        Function1 function3;
        mm40 mm40Var2;
        long jB;
        fetVar.g0(262196711);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a8q0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            str3 = str2;
            i3 |= fetVar.g(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        if ((i2 & 24576) == 0) {
            z5 = z;
            i3 |= fetVar.h(z5) ? 16384 : 8192;
        } else {
            z5 = z;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.h(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            z6 = z4;
            i3 |= fetVar.h(z6) ? 8388608 : 4194304;
        } else {
            z6 = z4;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            function3 = function2;
            i3 |= fetVar.i(function3) ? 536870912 : 268435456;
        } else {
            function3 = function2;
        }
        if (fetVar.U(i3 & 1, (306783379 & i3) != 306783378)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int i4 = i3;
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
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.a(16.0f);
                fetVar.o0(objP);
            }
            agk0 agk0Var = (agk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP2);
            }
            cgk0 cgk0Var = (cgk0) objP2;
            Object[] objArr = new Object[0];
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new lg6((byte) 20);
                fetVar.o0(objP3);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP3, fetVar, 48);
            if (z2) {
                fetVar.e0(470337600);
                jB = afn0.m(fetVar).getSecondary60();
                fetVar.r(false);
            } else {
                fetVar.e0(470396531);
                afn0.v(fetVar).getClass();
                jB = g1t0.j().b();
                fetVar.r(false);
            }
            afn0.v(fetVar).getClass();
            smk0 smk0VarA = smk0.a(g1t0.m().f42262a, afn0.m(fetVar).getCommerce(), null, 65534);
            Boolean bool = (Boolean) pz40Var.getValue();
            bool.booleanValue();
            boolean zG = fetVar.g(pz40Var) | ((i4 & 234881024) == 67108864);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                objP4 = new ua4(function1, pz40Var, null, (byte) 3);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, bool, (Function2) objP4);
            Function1 function4 = function3;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-2057157715, new iw6(z6, smk0VarA, str3, jB, a8q0Var, pz40Var, z3, function4, function1, z5, agk0Var, cgk0Var, str, (byte) 1), fetVar), fetVar, 56);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jw6(mm40Var2, a8q0Var, str, str2, z, z2, z3, z4, function1, function2, i2, (byte) 1);
        }
    }

    public static final void t(int i2, fet fetVar) {
        fetVar.g0(-1100487494);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new igh0((byte) 26);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarW, StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU(), jd8.n);
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
            kpb.j(jm40.b, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d1i0(i2, (byte) 2);
        }
    }

    public static final void u(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1853351244);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (((kt00) l7m0Var.getValue()).f18840a) {
            fetVar.e0(-1382126141);
            sj3.m(0, 0L, fetVar, null);
            fetVar.r(false);
        } else if (((kt00) l7m0Var.getValue()).b.isEmpty()) {
            fetVar.e0(-1382045014);
            p(0, fetVar);
            fetVar.r(false);
        } else {
            fetVar.e0(-1382001924);
            v(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i2, (byte) 8);
        }
    }

    public static final void v(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(2046669756);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarE = cjx.V(jm40.b, a8k0.G(xczVarA, fetVar), null).e(o7k0.c);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ys4(l7m0Var, function1, (byte) 19);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i2, (byte) 9);
        }
    }

    public static final void w(mm40 mm40Var, nx6 nx6Var, gx6 gx6Var, String str, boolean z, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        Function1 function3;
        fet fetVar2;
        fetVar.g0(1649708639);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(nx6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(gx6Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(str) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            function3 = function2;
            i3 |= fetVar.i(function3) ? 1048576 : 524288;
        } else {
            function3 = function2;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 22.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            a8q0 a8q0Var = nx6Var.f24267a;
            String str2 = nx6Var.b;
            boolean z2 = gx6Var != gx6.c;
            boolean z3 = nx6Var.c;
            boolean z4 = nx6Var.e;
            boolean z5 = (i3 & 458752) == 131072;
            Object objP = fetVar.P();
            if (z5 || objP == ukd.f35823a) {
                objP = new uo6(function1, (byte) 5);
                fetVar.o0(objP);
            }
            s(null, a8q0Var, str2, str, z2, z, z3, z4, (Function1) objP, function3, fetVar, ((i3 << 9) & 1879048192) | (i3 & 7168) | ((i3 << 3) & 458752));
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var, (Object) nx6Var, (Enum) gx6Var, str, z, function1, function2, i2, (byte) 3);
        }
    }

    public static final void x(mm40 mm40Var, nx6 nx6Var, pln0 pln0Var, gx6 gx6Var, String str, boolean z, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        gx6 gx6Var2;
        nx6 nx6Var2 = nx6Var;
        fetVar.g0(-1289359994);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(nx6Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(pln0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.e(gx6Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            int i4 = i3 >> 3;
            w(o7k0.d(jm40.b, 1.0f), nx6Var2, gx6Var, str, z, function1, function2, fetVar, (3670016 & i4) | (i4 & 896) | (i3 & 112) | 6 | (i4 & 7168) | (57344 & i4) | (458752 & i4));
            nx6Var2 = nx6Var2;
            if (nx6Var2.d || nx6Var2.f24267a.f440a.b.length() > 0 || z) {
                fetVar.e0(-740175249);
                gx6Var2 = gx6Var;
                F(null, pln0Var, gx6Var2, fetVar, i4 & 1008);
                fetVar.r(false);
            } else {
                fetVar.e0(-740030138);
                fetVar.r(false);
                gx6Var2 = gx6Var;
            }
            fetVar.r(true);
        } else {
            gx6Var2 = gx6Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, (Object) nx6Var2, (Object) pln0Var, (Enum) gx6Var2, str, z, function1, function2, i2, (byte) 1);
        }
    }

    public static final void y(mm40 mm40Var, cc70 cc70Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        fetVar.g0(-963184148);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(cc70Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            c5v0 c5v0Var = cc70Var.d;
            yb70 yb70Var = cc70Var.g;
            bc70 bc70Var = cc70Var.f;
            boolean zG = fetVar.g(c5v0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                c5v0 c5v0Var2 = cc70Var.d;
                objP = c5v0Var2 != null ? c5v0Var2.d : null;
                fetVar.o0(objP);
            }
            WebView webView = (WebView) objP;
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            mm40 mm40VarE0 = o2e.e0(n0qVar, "ONE_X_GAMES_GAME_WEB_VIEW");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
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
            fetVar.b0(-82937953, webView);
            boolean zI = fetVar.i(webView);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new cd60((Object) webView, (byte) 16);
                fetVar.o0(objP2);
            }
            Function1 function3 = (Function1) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = na70.f23176a;
                fetVar.o0(objP3);
            }
            dwi0.c(function3, n0qVar, null, (Function1) ((jhy) objP3), null, fetVar, 3120, 20);
            fetVar.r(false);
            fetVar.r(true);
            boolean z2 = bc70Var.f2341a;
            jm40 jm40Var = jm40.b;
            if (z2) {
                fetVar.e0(969049697);
                mm40 mm40VarQ = i120.Q(n0qVar, cc70Var.e, jd8.n);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
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
                kpb.j(jr8.f16991a.b(jm40Var, gqw0.e), new dkm((ycl) null, new y3d(bc70Var.b), 3), fetVar, 0, 0);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(969413916);
                fetVar.r(false);
            }
            if (yb70Var.f42328a) {
                fetVar.e0(969468941);
                function2 = function1;
                c3x.g(o7k0.d(jm40Var, 1.0f), yb70Var, function2, fetVar, (i4 & 896) | 6);
                fetVar.r(false);
            } else {
                function2 = function1;
                fetVar.e0(969667868);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, cc70Var, function2, i2, (byte) 0);
        }
    }

    public static final void z(mm40 mm40Var, ac70 ac70Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        a970 a970Var = ac70Var.c;
        fetVar.g0(95917023);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(ac70Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = fetVar.h(a970Var.f463a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = Float.valueOf(a970Var.f463a ? 1.0f : 0.5f);
                fetVar.o0(objP);
            }
            float fFloatValue = ((Number) objP).floatValue();
            imm immVar = ac70Var.b;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new ma70(function1, b2);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            b2 = i4 == 256 ? (byte) 1 : (byte) 0;
            Object objP3 = fetVar.P();
            byte b3 = 14;
            if (b2 != 0 || objP3 == cl5Var) {
                objP3 = new i160(function1, b3);
                fetVar.o0(objP3);
            }
            hlm.c(mm40Var, immVar, null, function0, null, (Function1) objP3, null, null, null, null, u1c.M(-586956595, new zv((Object) ac70Var, fFloatValue, (Object) function1, (byte) 10), fetVar), null, fetVar, i3 & 14, 6, 3028);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) ac70Var, (Object) function1, i2, (byte) 29);
        }
    }

    public b9v I(Context context, Looper looper, qgd qgdVar, Object obj, qav qavVar, rav ravVar) {
        return J(context, looper, qgdVar, obj, (h9w0) qavVar, (h9w0) ravVar);
    }

    public b9v J(Context context, Looper looper, qgd qgdVar, Object obj, h9w0 h9w0Var, h9w0 h9w0Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
