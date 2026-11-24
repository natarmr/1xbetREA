package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import androidx.fragment.app.Fragment;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.authorization.screen.Authorization;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.uikit.compose.color.CustomColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qxw {
    public static final wul0 A(lf50 lf50Var) {
        lf50Var.getClass();
        ve50 ve50Var = lf50Var.b;
        if (ve50Var == null) {
            ve50Var = (ve50) CollectionsKt.f0(lf50Var.f19938a);
        }
        if (ve50Var != null) {
            return ve50Var.a();
        }
        return null;
    }

    public static final w140 B() {
        return new w140(iz30.b, false, r040.SPORTS, 0, "", "");
    }

    public static final int C(md80 md80Var) {
        md80Var.getClass();
        switch (md80Var.ordinal()) {
            case 0:
                return R.string.P1;
            case 1:
                return R.string.X;
            case 2:
                return R.string.P2;
            case 3:
                return R.string.toto_array_p1_tb;
            case 4:
                return R.string.toto_array_p1_tm;
            case 5:
                return R.string.toto_array_p2_tb;
            case 6:
                return R.string.toto_array_p2_tm;
            case 7:
                return R.string.toto_0_0;
            case 8:
                return R.string.toto_0_1;
            case 9:
                return R.string.toto_0_2;
            case 10:
                return R.string.toto_0_3;
            case 11:
                return R.string.toto_0_4;
            case 12:
                return R.string.toto_0_5;
            case 13:
                return R.string.toto_1_0;
            case 14:
                return R.string.toto_1_1;
            case 15:
                return R.string.toto_1_2;
            case 16:
                return R.string.toto_1_3;
            case 17:
                return R.string.toto_1_4;
            case 18:
                return R.string.toto_1_5;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return R.string.LD;
            case 20:
                return R.string.toto_2_0;
            case 21:
                return R.string.toto_2_1;
            case 22:
                return R.string.toto_2_2;
            case 23:
                return R.string.toto_2_3;
            case 24:
                return R.string.toto_2_4;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return R.string.toto_2_5;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return R.string.toto_3_0;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return R.string.toto_3_1;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return R.string.toto_3_2;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return R.string.toto_3_3;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return R.string.toto_3_4;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return R.string.toto_3_5;
            case 32:
                return R.string.toto_4_0;
            case 33:
                return R.string.toto_4_1;
            case 34:
                return R.string.toto_4_2;
            case 35:
                return R.string.toto_4_3;
            case 36:
                return R.string.toto_4_4;
            case 37:
                return R.string.toto_4_5;
            case 38:
                return R.string.toto_5_0;
            case 39:
                return R.string.toto_5_1;
            case 40:
                return R.string.toto_5_2;
            case 41:
                return R.string.toto_5_3;
            case 42:
                return R.string.toto_5_4;
            case 43:
                return R.string.toto_5_5;
            default:
                t9f.b();
                return 0;
        }
    }

    public static final uzm D(String str, List list) {
        StringBuilder sb = new StringBuilder(ujn.h);
        String str2 = (String) CollectionsKt.firstOrNull(list);
        if (str2 == null) {
            str2 = "";
        }
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
        return new uzm(str, new c280(sb.toString(), R.drawable.no_photo_new));
    }

    public static final f240 E(ox10 ox10Var, ctf0 ctf0Var, Function1 function1, List list, r040 r040Var) {
        boolean z;
        if (list != null && list.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((iz30) it.next()) == ox10Var.f25991a) {
                z = true;
                break;
            }
        }
        int iIntValue = ((Number) function1.invoke(Integer.valueOf(R.drawable.ic_glyph_polybet))).intValue();
        String strA = ctf0Var.b.a(R.string.polybet, Arrays.copyOf(new Object[0], 0));
        String strA2 = ctf0Var.b.a(R.string.menu_polybet_description, Arrays.copyOf(new Object[0], 0));
        int iOrdinal = r040Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 8 || iOrdinal == 9) {
            return new v140(iIntValue, ox10Var.f25991a, r040Var, strA, strA2, !K(ctf0Var) ? ox10Var.b : "", z);
        }
        return new n140(ox10Var.f25991a, z, r040Var, iIntValue, strA, strA2, 0);
    }

    public static oaw0 F(Context context) {
        s0x.H(context);
        return new oaw0(context, new dbw0());
    }

    public static final a240 G(xx10 xx10Var, ctf0 ctf0Var, Function1 function1, r040 r040Var, boolean z) {
        return new a240(xx10Var.f41637a, z, r040Var, ((Number) function1.invoke(Integer.valueOf(R.drawable.ic_glyph_support))).intValue(), ctf0Var.b.a(R.string.support, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_support_description, Arrays.copyOf(new Object[0], 0)), xx10Var.b);
    }

    public static final String H(long j) {
        return String.format(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public static final boolean I(lf50 lf50Var) {
        lf50Var.getClass();
        re50 re50Var = lf50Var.b;
        if (re50Var == null) {
            return false;
        }
        ArrayList arrayList = (ArrayList) re50Var.b();
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((wul0) it.next()).a() instanceof Authorization.Login.Dialog) {
                return true;
            }
        }
        return false;
    }

    public static final boolean J(wul0 wul0Var, String str) {
        return Intrinsics.d(wul0Var.a().getF45455a(), str) && (wul0Var instanceof uul0);
    }

    public static final boolean K(ctf0 ctf0Var) {
        return ctf0Var.c() < 380;
    }

    public static final v0h0 L(Function1 function1, Function2 function2) {
        qyl qylVar = new qyl(function2, (byte) 1);
        function1.getClass();
        zys0.e(1, function1);
        return new v0h0(function1, qylVar);
    }

    public static final ColorMatrixColorFilter M(int i) {
        float fRed = Color.red(i);
        float fGreen = Color.green(i);
        float fBlue = Color.blue(i);
        float f = (fBlue * 0.11f) + (fGreen * 0.59f) + (fRed * 0.3f);
        return new ColorMatrixColorFilter(new float[]{0.3f, 0.59f, 0.11f, 0.0f, fRed - f, 0.3f, 0.59f, 0.11f, 0.0f, fGreen - f, 0.3f, 0.59f, 0.11f, 0.0f, fBlue - f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static final lf50 N(lf50 lf50Var, m7h0 m7h0Var) {
        lf50Var.getClass();
        m7h0Var.getClass();
        wul0 wul0VarW = w(lf50Var, m7h0Var);
        List list = lf50Var.f19938a;
        re50 re50Var = lf50Var.b;
        if (re50Var != null) {
            return lf50.a(lf50Var, null, re50.d(re50Var, null, CollectionsKt.r0(re50Var.c, wul0VarW), 3), null, 5);
        }
        ve50 ve50Var = (ve50) CollectionsKt.f0(list);
        if (ve50Var != null) {
            if (ve50Var instanceof se50) {
                Object objF0 = CollectionsKt.f0(list);
                if (!(objF0 instanceof se50)) {
                    objF0 = null;
                }
                se50 se50Var = (se50) objF0;
                if (se50Var == null) {
                    return lf50Var;
                }
                return lf50.a(lf50Var, CollectionsKt.r0(CollectionsKt.P(1, list), se50.d(se50Var, null, CollectionsKt.r0(se50Var.b, wul0VarW), 1)), null, null, 6);
            }
            if (!(ve50Var instanceof ue50)) {
                return lf50Var;
            }
        }
        return lf50.a(lf50Var, CollectionsKt.r0(list, new ue50(wul0VarW)), null, null, 6);
    }

    public static final String O(Integer num) {
        String strValueOf;
        return (num == null || (strValueOf = String.valueOf(num.intValue())) == null) ? "-" : strValueOf;
    }

    public static final lf50 P(lf50 lf50Var, nu4 nu4Var, Authorization authorization, bjk bjkVar) {
        wul0 wul0VarA = A(lf50Var);
        return lf50.a(lf50Var, null, new re50(nu4Var, authorization instanceof DialogScreen ? new uul0((DialogScreen) authorization, bjkVar, wul0VarA != null ? wul0VarA.a() : null) : new vul0(authorization), iun.f15405a), null, 5);
    }

    public static final u4s Q(mz60 mz60Var, ctf0 ctf0Var) {
        Pair pair;
        a570 a570Var = mz60Var.b;
        hds hdsVar = mz60Var.d;
        if (x1x.G(a570Var)) {
            pair = new Pair(mz60Var.e ? v4s.c : v4s.f36795a, mz60Var.f22638a);
        } else {
            pair = new Pair(v4s.b, ctf0Var.b.a(R.string.all_games, Arrays.copyOf(new Object[0], 0)));
        }
        v4s v4sVar = (v4s) pair.f46059a;
        String str = (String) pair.b;
        long jD = x1x.D(mz60Var.b);
        String str2 = hdsVar.b;
        String str3 = hdsVar.f12884a;
        return new u4s(jD, v4sVar, new n0x(str2), new n0x(azw.R(hdsVar.b)), new n0x(str3), new n0x(azw.R(str3)), str);
    }

    public static final ufs R(ua30 ua30Var) {
        ua30Var.getClass();
        return new ufs(ua30Var.f35313a, ua30Var.b, ua30Var.c, ua30Var.e, ua30Var.f, ua30Var.j, ua30Var.m);
    }

    public static final f240 S(sx10 sx10Var, ctf0 ctf0Var, h240 h240Var, List list, r040 r040Var, String str, String str2) {
        boolean z;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_cashback);
        Integer numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_slots);
        Integer numValueOf3 = Integer.valueOf(R.drawable.ic_glyph_peak);
        if (list != null && list.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((iz30) it.next()) == sx10Var.f32951a) {
                z = true;
                break;
            }
        }
        iz30 iz30Var = sx10Var.f32951a;
        iz30 iz30Var2 = sx10Var.f32951a;
        switch (iz30Var.ordinal()) {
            case 1:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_live))).intValue(), ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_live_description, Arrays.copyOf(new Object[0], 0)));
            case 2:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_line))).intValue(), ctf0Var.b.a(R.string.line, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_line_description, Arrays.copyOf(new Object[0], 0)));
            case 3:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_express))).intValue(), ctf0Var.b.a(R.string.day_express, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_day_express_description, Arrays.copyOf(new Object[0], 0)));
            case 4:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_stream))).intValue(), ctf0Var.b.a(R.string.stream_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_stream_description, Arrays.copyOf(new Object[0], 0)));
            case 5:
            case 13:
            case 14:
            case 15:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 39:
            case 40:
            case 46:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 52:
            case 53:
            case 54:
            case 61:
            default:
                return B();
            case 6:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_results))).intValue(), ctf0Var.b.a(R.string.results, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_results_description, Arrays.copyOf(new Object[0], 0)));
            case 7:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_bets_on_yours))).intValue(), ctf0Var.b.a(R.string.bets_on_yours, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_bet_on_favorites_description, Arrays.copyOf(new Object[0], 0)));
            case 8:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_tv_bet))).intValue(), ctf0Var.b.a(R.string.tv_bet_casino_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_tvbet_description_item, Arrays.copyOf(new Object[0], 0)));
            case 9:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_games))).intValue(), ctf0Var.b.a(R.string.all_games, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_description, Arrays.copyOf(new Object[0], 0)));
            case 10:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_promo_games))).intValue(), ctf0Var.b.a(R.string.bonuses, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_promo_description, Arrays.copyOf(new Object[0], 0)));
            case 11:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(numValueOf)).intValue(), ctf0Var.b.a(R.string.cashback, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_item_cashback_description, Arrays.copyOf(new Object[0], 0)));
            case 12:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_favourite_active))).intValue(), ctf0Var.b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_favorites_description, Arrays.copyOf(new Object[0], 0)));
            case 16:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_financial))).intValue(), ctf0Var.b.a(R.string.finance_bets, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_finbets_description, Arrays.copyOf(new Object[0], 0)));
            case 17:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_betconstructor))).intValue(), ctf0Var.b.a(R.string.betconstructor, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_betconstructor_description, Arrays.copyOf(new Object[0], 0)));
            case 18:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_qr_scanning))).intValue(), ctf0Var.b.a(R.string.scanner, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_coupon_scanner_description, Arrays.copyOf(new Object[0], 0)));
            case 20:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_notification_active))).intValue(), ctf0Var.b.a(R.string.notifications_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_notifications_description, Arrays.copyOf(new Object[0], 0)));
            case 22:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_info))).intValue(), ctf0Var.b.a(R.string.info, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_info_description, Arrays.copyOf(new Object[0], 0)));
            case 24:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_authenticator))).intValue(), ctf0Var.b.a(R.string.authenticator, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.authenticator_description, Arrays.copyOf(new Object[0], 0)));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_telegram))).intValue(), ctf0Var.b.a(R.string.menu_telegram_bot_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_telegram_bot_description_v2, Arrays.copyOf(new Object[]{str}, 1)));
            case 32:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad))).intValue(), ctf0Var.b.a(R.string.cyber_sport, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_cyber_description, Arrays.copyOf(new Object[0], 0)));
            case 33:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_ufc))).intValue(), ctf0Var.b.a(R.string.ufc_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_ufc_description, Arrays.copyOf(new Object[0], 0)));
            case 34:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_cards))).intValue(), ctf0Var.b.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_my_description, Arrays.copyOf(new Object[0], 0)));
            case 35:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_categories))).intValue(), ctf0Var.b.a(R.string.casino_category_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_category_description, Arrays.copyOf(new Object[0], 0)));
            case 36:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_tournaments))).intValue(), ctf0Var.b.a(R.string.casino_tour_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_tour_description, Arrays.copyOf(new Object[0], 0)));
            case 37:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_promo_aggregator))).intValue(), ctf0Var.b.a(R.string.casino_promo_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_promo_description, Arrays.copyOf(new Object[0], 0)));
            case 38:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_shopping_bag))).intValue(), ctf0Var.b.a(R.string.promo_shop_name, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.promo_settings_subtitle, Arrays.copyOf(new Object[0], 0)));
            case 41:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_fast_games))).intValue(), ctf0Var.b.a(R.string.fast_games_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.fast_games_description, Arrays.copyOf(new Object[0], 0)));
            case 42:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(numValueOf2)).intValue(), ctf0Var.b.a(R.string.cases_slots, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_slots_description, Arrays.copyOf(new Object[0], 0)));
            case 43:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(numValueOf3)).intValue(), ctf0Var.b.a(R.string.live_casino_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_live_casino_description, Arrays.copyOf(new Object[0], 0)));
            case 44:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_virtual))).intValue(), ctf0Var.b.a(R.string.my_virtual, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_my_virtual_description, Arrays.copyOf(new Object[0], 0)));
            case 45:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_providers))).intValue(), ctf0Var.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_providers_menu_desription, Arrays.copyOf(new Object[0], 0)));
            case 47:
                return new j140(((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_champions_club))).intValue(), iz30Var2, r040Var, str2, ctf0Var.b.a(R.string.promo_menu_champions_club_subtitle, Arrays.copyOf(new Object[0], 0)), !K(ctf0Var) ? thb.t() : "", z);
            case 48:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(numValueOf)).intValue(), ctf0Var.b.a(R.string.sport_cashback, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.sport_cashback_subtitle, Arrays.copyOf(new Object[0], 0)));
            case 49:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_bingo))).intValue(), ctf0Var.b.a(R.string.bingo_top_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.bingo_top_body, Arrays.copyOf(new Object[0], 0)));
            case 51:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_toto))).intValue(), ctf0Var.b.a(R.string.toto_jackpot_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_toto_description, Arrays.copyOf(new Object[0], 0)));
            case 55:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(numValueOf2)).intValue(), ctf0Var.b.a(R.string.cases_slots, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_casino_slots_description, Arrays.copyOf(new Object[0], 0)));
            case 56:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_responsible_gambling))).intValue(), ctf0Var.b.a(R.string.responsible_game, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_responsible_gaming_description, Arrays.copyOf(new Object[0], 0)));
            case 57:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(numValueOf3)).intValue(), ctf0Var.b.a(R.string.live_casino_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_casino_live_description, Arrays.copyOf(new Object[0], 0)));
            case 58:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_1xlive))).intValue(), ctf0Var.b.a(R.string.aggregator_one_x_live, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_aggregator_brand_live_description, Arrays.copyOf(new Object[0], 0)));
            case 59:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_aviator))).intValue(), ctf0Var.b.a(R.string.menu_aviator_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_aviator_description, Arrays.copyOf(new Object[0], 0)));
            case 60:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_quest))).intValue(), ctf0Var.b.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.daily_task_description, Arrays.copyOf(new Object[0], 0)));
            case 62:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_loto))).intValue(), ctf0Var.b.a(R.string.menu_lotto_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_lotto_description, Arrays.copyOf(new Object[0], 0)));
            case 63:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_partners))).intValue(), ctf0Var.b.a(R.string.info_partner_programm, Arrays.copyOf(new Object[0], 0)), "");
            case 64:
                return new w140(iz30Var2, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_info_agent))).intValue(), ctf0Var.b.a(R.string.info_agent_programm, Arrays.copyOf(new Object[0], 0)), "");
        }
    }

    public static final f240 T(yx10 yx10Var, ctf0 ctf0Var, qho qhoVar, List list, r040 r040Var, boolean z, List list2, String str, String str2) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        int i2;
        char c;
        boolean z6;
        int i3;
        char c2;
        boolean z7;
        boolean z8;
        boolean z9;
        int i4;
        char c3;
        boolean z10;
        boolean z11;
        int i5;
        String string;
        Object next;
        int i6;
        char c4;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_games);
        yx10Var.getClass();
        ctf0Var.getClass();
        qhoVar.getClass();
        list.getClass();
        r040Var.getClass();
        list2.getClass();
        str.getClass();
        str2.getClass();
        if (yx10Var instanceof sx10) {
            return S((sx10) yx10Var, ctf0Var, new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 8), list, r040Var, str, str2);
        }
        if (yx10Var instanceof lx10) {
            lx10 lx10Var = (lx10) yx10Var;
            String str3 = lx10Var.b;
            iz30 iz30Var = lx10Var.f20792a;
            h240 h240Var = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 9);
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if (((iz30) it.next()) == iz30Var) {
                        z17 = true;
                        break;
                    }
                }
            } else {
                z17 = false;
                break;
            }
            int iOrdinal = iz30Var.ordinal();
            if (iOrdinal != 9) {
                return iOrdinal != 15 ? B() : new w140(iz30Var, z17, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_toto))).intValue(), str3, ctf0Var.b.a(R.string.menu_toto_description, Arrays.copyOf(new Object[0], 0)));
            }
            return new w140(iz30Var, z17, r040Var, ((Number) h240Var.invoke(numValueOf)).intValue(), str3, ctf0Var.b.a(R.string.menu_one_x_games_description, Arrays.copyOf(new Object[0], 0)));
        }
        String string2 = "";
        if (yx10Var instanceof px10) {
            px10 px10Var = (px10) yx10Var;
            iz30 iz30Var2 = px10Var.f27734a;
            h240 h240Var2 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 10);
            boolean zK = K(ctf0Var);
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z16 = false;
                        break;
                    }
                    if (((iz30) it2.next()) == iz30Var2) {
                        z16 = true;
                        break;
                    }
                }
            } else {
                z16 = false;
                break;
            }
            int iIntValue = ((Number) h240Var2.invoke(Integer.valueOf(R.drawable.ic_glyph_cart))).intValue();
            lsm0 lsm0Var = ctf0Var.b;
            String strA = lsm0Var.a(R.string.promo_codes_title, Arrays.copyOf(new Object[0], 0));
            String str4 = px10Var.c ? String.format(Locale.ENGLISH, lsm0Var.a(R.string.placeholder_variant_5, Arrays.copyOf(new Object[0], 0)), Arrays.copyOf(new Object[]{lsm0Var.a(R.string.menu_promo_subtitle, Arrays.copyOf(new Object[0], 0)), String.valueOf(px10Var.b), lsm0Var.a(R.string.pts_symbol, Arrays.copyOf(new Object[0], 0))}, 3)) : "";
            int i7 = zK ? 0 : R.drawable.banner_promo;
            pz40 pz40Var = s6t0.f31722a;
            CustomColors customColors = CustomColors.INSTANCE;
            return new k140(iz30Var2, z16, r040Var, R.attr.uikitStaticWhite, R.attr.uikitStaticWhite, iIntValue, R.attr.uikitStaticWhite, R.attr.uikitStaticWhite20, strA, str4, i7, R.drawable.promo_shop_item_background, q3d.j(new y3d(customColors.m45getPromoGradientEnd0d7_KjU()), new y3d(customColors.m46getPromoGradientStart0d7_KjU())), null);
        }
        if (yx10Var instanceof qx10) {
            iz30 iz30Var3 = ((qx10) yx10Var).f29460a;
            h240 h240Var3 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 11);
            boolean zK2 = K(ctf0Var);
            if (!list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z15 = false;
                        break;
                    }
                    if (((iz30) it3.next()) == iz30Var3) {
                        z15 = true;
                        break;
                    }
                }
            } else {
                z15 = false;
                break;
            }
            int iIntValue2 = ((Number) h240Var3.invoke(Integer.valueOf(R.drawable.ic_glyph_balloons))).intValue();
            lsm0 lsm0Var2 = ctf0Var.b;
            String strA2 = lsm0Var2.a(R.string.news_promo, Arrays.copyOf(new Object[0], 0));
            String strA3 = lsm0Var2.a(R.string.menu_promo_description, Arrays.copyOf(new Object[0], 0));
            int i8 = zK2 ? 0 : R.drawable.ic_banner_events;
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            return new k140(iz30Var3, z15, r040Var, R.attr.uikitStaticWhite, R.attr.uikitStaticWhite, iIntValue2, R.attr.uikitStaticDarkOrange, R.attr.uikitStaticWhite, strA2, strA3, i8, R.drawable.main_menu_promotion_item_background, q3d.j(new y3d(staticColors.m87getDarkOrange0d7_KjU()), new y3d(staticColors.m132getYellow0d7_KjU())), null);
        }
        if (yx10Var instanceof vx10) {
            iz30 iz30Var4 = ((vx10) yx10Var).f38180a;
            h240 h240Var4 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 12);
            boolean zK3 = K(ctf0Var);
            if (!list.isEmpty()) {
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z14 = false;
                        break;
                    }
                    if (((iz30) it4.next()) == iz30Var4) {
                        z14 = true;
                        break;
                    }
                }
            } else {
                z14 = false;
                break;
            }
            int iIntValue3 = ((Number) h240Var4.invoke(Integer.valueOf(R.drawable.ic_glyph_team))).intValue();
            lsm0 lsm0Var3 = ctf0Var.b;
            String strA4 = lsm0Var3.a(R.string.team_bet_title, Arrays.copyOf(new Object[0], 0));
            String strA5 = lsm0Var3.a(R.string.menu_team_bet_description, Arrays.copyOf(new Object[0], 0));
            int i9 = zK3 ? 0 : R.drawable.teambet_menu_banner;
            pz40 pz40Var3 = s6t0.f31722a;
            return new k140(iz30Var4, z14, r040Var, R.attr.uikitStaticWhite, R.attr.uikitStaticWhite, iIntValue3, R.attr.uikitStaticWhite, R.attr.uikitStaticWhite20, strA4, strA5, i9, R.drawable.main_menu_teambet_item_background, q3d.j(new y3d(s6t0.b().b.getTeamBetGradientStart()), new y3d(s6t0.b().b.getTeamBetGradientEnd())), M(ctf0Var.a(R.color.uikit_teambet_gradient_end)));
        }
        if (yx10Var instanceof ux10) {
            h240 h240Var5 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 13);
            boolean zK4 = K(ctf0Var);
            iz30 iz30Var5 = iz30.x;
            if (!list.isEmpty()) {
                Iterator it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        z13 = false;
                        break;
                    }
                    if (((iz30) it5.next()) == iz30.x) {
                        z13 = true;
                        break;
                    }
                }
            } else {
                z13 = false;
                break;
            }
            int iIntValue4 = ((Number) h240Var5.invoke(Integer.valueOf(R.drawable.ic_glyph_swipex))).intValue();
            lsm0 lsm0Var4 = ctf0Var.b;
            return new n140(iz30Var5, z13, r040Var, iIntValue4, lsm0Var4.a(R.string.swipex, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.bet_with_one_swipe, Arrays.copyOf(new Object[0], 0)), zK4 ? 0 : R.drawable.swipex_banner);
        }
        if (yx10Var instanceof nx10) {
            nx10 nx10Var = (nx10) yx10Var;
            iz30 iz30Var6 = nx10Var.f24262a;
            h240 h240Var6 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 14);
            if (!list.isEmpty()) {
                Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z12 = false;
                        break;
                    }
                    if (((iz30) it6.next()) == iz30Var6) {
                        z12 = true;
                        break;
                    }
                }
            } else {
                z12 = false;
                break;
            }
            int iIntValue5 = ((Number) h240Var6.invoke(numValueOf)).intValue();
            lsm0 lsm0Var5 = ctf0Var.b;
            String strA6 = lsm0Var5.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
            String strA7 = lsm0Var5.a(R.string.menu_one_x_games_description, Arrays.copyOf(new Object[0], 0));
            List list3 = nx10Var.b;
            ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
            Iterator it7 = list3.iterator();
            while (it7.hasNext()) {
                arrayList.add(Q((mz60) it7.next(), ctf0Var));
            }
            return new e240(z12, iz30Var6, r040Var, iIntValue5, strA6, strA7, arrayList);
        }
        if (yx10Var instanceof tx10) {
            tx10 tx10Var = (tx10) yx10Var;
            iz30 iz30Var7 = iz30.c;
            if (!list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        z11 = false;
                        break;
                    }
                    if (((iz30) it8.next()) == iz30.c) {
                        z11 = true;
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
            lok0 lok0Var = tx10Var.f34677a;
            int i10 = lok0Var.f20396a;
            int i11 = lok0Var.f20396a;
            long j = lok0Var.f;
            long j2 = lok0Var.g;
            boolean z18 = z11;
            if (j2 != 0) {
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        i5 = i10;
                        next = null;
                        break;
                    }
                    next = it9.next();
                    i5 = i10;
                    long j3 = j2;
                    if (((f3n0) next).f8872a == j3) {
                        break;
                    }
                    i10 = i5;
                    j2 = j3;
                }
                f3n0 f3n0Var = (f3n0) next;
                if (f3n0Var != null) {
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String str5 = f3n0Var.c.j;
                    str5.getClass();
                    if (str5.length() == 0) {
                        sb.setLength(0);
                    } else {
                        if (StringsKt.O(str5, ujn.h, false)) {
                            i6 = 0;
                        } else if (kotlin.text.c.x(str5, "https://", false)) {
                            i6 = 0;
                        } else {
                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                c4 = '/';
                            } else {
                                c4 = '/';
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str5, c4));
                        }
                        sb.setLength(i6);
                        sb.append(str5);
                    }
                    string = sb.toString();
                } else if (j != 0) {
                    bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                    rz4.s(j, ".svg", bzuVarD);
                    string2 = ((StringBuilder) bzuVarD.b).toString();
                }
                String str6 = lok0Var.u;
                return new x140(z18, r040Var, i5, iz30Var7, string, q5x.D(i11, str6), lok0Var.b, "", q5x.E(i11, str6));
            }
            i5 = i10;
            if (j != 0) {
                bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                rz4.s(j, ".svg", bzuVarD2);
                string2 = ((StringBuilder) bzuVarD2.b).toString();
            }
            string = string2;
            String str7 = lok0Var.u;
            return new x140(z18, r040Var, i5, iz30Var7, string, q5x.D(i11, str7), lok0Var.b, "", q5x.E(i11, str7));
        }
        if (yx10Var instanceof hx10) {
            hx10 hx10Var = (hx10) yx10Var;
            iz30 iz30Var8 = hx10Var.f13792a;
            h240 h240Var7 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 15);
            if (!list.isEmpty()) {
                Iterator it10 = list.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (((iz30) it10.next()) == iz30Var8) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
            int iIntValue6 = ((Number) h240Var7.invoke(Integer.valueOf(R.drawable.ic_glyph_authenticator))).intValue();
            lsm0 lsm0Var6 = ctf0Var.b;
            return new g140(iz30Var8, z10, r040Var, iIntValue6, lsm0Var6.a(R.string.authenticator, Arrays.copyOf(new Object[0], 0)), lsm0Var6.a(hx10Var.b ? R.string.account_secured : R.string.authenticator_description, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_status_green_check_circle, hx10Var.b);
        }
        if (yx10Var instanceof ix10) {
            ix10 ix10Var = (ix10) yx10Var;
            iz30 iz30Var9 = ix10Var.f15519a;
            h240 h240Var8 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 16);
            if (!list.isEmpty()) {
                Iterator it11 = list.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        z9 = false;
                        break;
                    }
                    if (((iz30) it11.next()) == iz30Var9) {
                        z9 = true;
                        break;
                    }
                }
            } else {
                z9 = false;
                break;
            }
            StringBuilder sb2 = new StringBuilder(ujn.h);
            String str8 = String.format(Locale.ENGLISH, "static/img/android/icons_currency/v2/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(ix10Var.b)}, 1));
            if (str8.length() == 0) {
                sb2.setLength(0);
                i4 = 0;
            } else {
                if (StringsKt.O(str8, ujn.h, false)) {
                    i4 = 0;
                } else if (kotlin.text.c.x(str8, "https://", false)) {
                    i4 = 0;
                } else {
                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                        c3 = '/';
                    } else {
                        c3 = '/';
                        sb2.append('/');
                    }
                    i4 = 0;
                    sb2.append(StringsKt.y0(str8, c3));
                }
                sb2.setLength(i4);
                sb2.append(str8);
            }
            String string3 = sb2.toString();
            int iIntValue7 = ((Number) h240Var8.invoke(Integer.valueOf(R.drawable.ic_glyph_currency_placeholder))).intValue();
            lsm0 lsm0Var7 = ctf0Var.b;
            return new h140(iIntValue7, iz30Var9, r040Var, string3, lsm0Var7.a(R.string.balance_management_title, Arrays.copyOf(new Object[i4], i4)), lsm0Var7.a(R.string.balance_managment_description, Arrays.copyOf(new Object[i4], i4)), z9);
        }
        if (yx10Var instanceof rx10) {
            iz30 iz30Var10 = ((rx10) yx10Var).f31242a;
            h240 h240Var9 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 1);
            boolean zK5 = K(ctf0Var);
            if (!list.isEmpty()) {
                Iterator it12 = list.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        z8 = false;
                        break;
                    }
                    if (((iz30) it12.next()) == iz30Var10) {
                        z8 = true;
                        break;
                    }
                }
            } else {
                z8 = false;
                break;
            }
            int iIntValue8 = ((Number) h240Var9.invoke(Integer.valueOf(R.drawable.ic_glyph_lock))).intValue();
            lsm0 lsm0Var8 = ctf0Var.b;
            String strA8 = lsm0Var8.a(R.string.increase_security, Arrays.copyOf(new Object[0], 0));
            String strA9 = lsm0Var8.a(R.string.menu_increase_security_description, Arrays.copyOf(new Object[0], 0));
            int i12 = !zK5 ? R.drawable.banner_security : 0;
            pz40 pz40Var4 = s6t0.f31722a;
            return new l140(iz30Var10, z8, r040Var, iIntValue8, strA8, strA9, i12, s6t0.b().f33626a.getPrimary());
        }
        if (!(yx10Var instanceof gx10)) {
            if (yx10Var instanceof fx10) {
                h240 h240Var10 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 3);
                boolean zK6 = K(ctf0Var);
                iz30 iz30Var11 = iz30.t;
                if (!list.isEmpty()) {
                    Iterator it13 = list.iterator();
                    while (true) {
                        if (!it13.hasNext()) {
                            i = 0;
                            z4 = false;
                            break;
                        }
                        if (((iz30) it13.next()) == iz30.t) {
                            z4 = true;
                            i = 0;
                            break;
                        }
                    }
                } else {
                    i = 0;
                    z4 = false;
                    break;
                }
                return new m140(iz30Var11, z4, r040Var, ((Number) h240Var10.invoke(Integer.valueOf(R.drawable.ic_glyph_virtual))).intValue(), R.attr.uiKitAggregatorLavender, R.attr.uikitStaticWhite, ctf0Var.b.a(R.string.my_virtual, Arrays.copyOf(new Object[i], i)), z ? ctf0Var.b.a(R.string.casino_my_virtual_description, Arrays.copyOf(new Object[i], i)) : "", !zK6 ? R.drawable.my_aggregator_banner : 0, R.attr.uiKitAggregatorLavender);
            }
            if (yx10Var instanceof mx10) {
                mx10 mx10Var = (mx10) yx10Var;
                h240 h240Var11 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 4);
                boolean zK7 = K(ctf0Var);
                iz30 iz30Var12 = iz30.l;
                if (!list.isEmpty()) {
                    Iterator it14 = list.iterator();
                    while (true) {
                        if (!it14.hasNext()) {
                            z3 = false;
                            break;
                        }
                        if (((iz30) it14.next()) == iz30.l) {
                            z3 = true;
                            break;
                        }
                    }
                } else {
                    z3 = false;
                    break;
                }
                return new j140(((Number) h240Var11.invoke(Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad))).intValue(), iz30Var12, r040Var, ctf0Var.b.a(R.string.cyber_sport, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_cyber_description, Arrays.copyOf(new Object[0], 0)), zK7 ? "" : mx10Var.b, z3);
            }
            if (!(yx10Var instanceof wx10)) {
                boolean z19 = false;
                if (yx10Var instanceof ox10) {
                    return E((ox10) yx10Var, ctf0Var, new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 6), list, r040Var);
                }
                if (!(yx10Var instanceof xx10)) {
                    return B();
                }
                xx10 xx10Var = (xx10) yx10Var;
                h240 h240Var12 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 7);
                if (!list.isEmpty()) {
                    Iterator it15 = list.iterator();
                    while (it15.hasNext()) {
                        if (((iz30) it15.next()) == xx10Var.f41637a) {
                            z19 = true;
                            break;
                        }
                    }
                }
                return G(xx10Var, ctf0Var, h240Var12, r040Var, z19);
            }
            wx10 wx10Var = (wx10) yx10Var;
            h240 h240Var13 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 5);
            boolean zK8 = K(ctf0Var);
            iz30 iz30Var13 = iz30.m;
            if (!list.isEmpty()) {
                Iterator it16 = list.iterator();
                while (true) {
                    if (!it16.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (((iz30) it16.next()) == iz30.m) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            return new b240(((Number) h240Var13.invoke(Integer.valueOf(R.drawable.ic_glyph_ufc))).intValue(), iz30Var13, r040Var, ctf0Var.b.a(R.string.ufc_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_ufc_description, Arrays.copyOf(new Object[0], 0)), zK8 ? "" : wx10Var.b, z2);
        }
        gx10 gx10Var = (gx10) yx10Var;
        iz30 iz30Var14 = gx10Var.f12055a;
        h240 h240Var14 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 2);
        vh0 vh0Var = gx10Var.b;
        if (g240.f10544a[iz30Var14.ordinal()] == 46) {
            if (list.isEmpty()) {
                z7 = false;
            } else {
                Iterator it17 = list.iterator();
                while (it17.hasNext()) {
                    if (((iz30) it17.next()) == iz30Var14) {
                        z7 = true;
                    }
                }
                z7 = false;
            }
            return new w140(iz30Var14, z7, r040Var, ((Number) h240Var14.invoke(Integer.valueOf(R.drawable.ic_glyph_fast_bet))).intValue(), ctf0Var.b.a(R.string.fast_bet_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.fast_bet_description, Arrays.copyOf(new Object[0], 0)));
        }
        if (vh0Var.d.length() > 0) {
            if (!list.isEmpty()) {
                Iterator it18 = list.iterator();
                while (true) {
                    if (!it18.hasNext()) {
                        z6 = false;
                        break;
                    }
                    if (((iz30) it18.next()) == iz30Var14) {
                        z6 = true;
                        break;
                    }
                }
            } else {
                z6 = false;
                break;
            }
            long j4 = vh0Var.f37408a;
            StringBuilder sb3 = new StringBuilder(ujn.h);
            String str9 = vh0Var.d;
            if (str9.length() == 0) {
                sb3.setLength(0);
            } else {
                if (StringsKt.O(str9, ujn.h, false)) {
                    i3 = 0;
                } else if (kotlin.text.c.x(str9, "https://", false)) {
                    i3 = 0;
                } else {
                    if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                        c2 = '/';
                    } else {
                        c2 = '/';
                        sb3.append('/');
                    }
                    sb3.append(StringsKt.y0(str9, c2));
                }
                sb3.setLength(i3);
                sb3.append(str9);
            }
            return new c240(z6, iz30Var14, r040Var, j4, vh0Var.g, sb3.toString(), vh0Var.b, vh0Var.k, vh0Var.f);
        }
        if (!list.isEmpty()) {
            Iterator it19 = list.iterator();
            while (true) {
                if (!it19.hasNext()) {
                    z5 = false;
                    break;
                }
                if (((iz30) it19.next()) == iz30Var14) {
                    z5 = true;
                    break;
                }
            }
        } else {
            z5 = false;
            break;
        }
        long j5 = vh0Var.f37408a;
        StringBuilder sb4 = new StringBuilder(ujn.h);
        String str10 = String.format(Locale.ENGLISH, "static/img/android/agregator/category/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(vh0Var.f37408a)}, 1));
        if (str10.length() == 0) {
            sb4.setLength(0);
        } else {
            if (StringsKt.O(str10, ujn.h, false)) {
                i2 = 0;
            } else if (kotlin.text.c.x(str10, "https://", false)) {
                i2 = 0;
            } else {
                if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                    c = '/';
                } else {
                    c = '/';
                    sb4.append('/');
                }
                sb4.append(StringsKt.y0(str10, c));
            }
            sb4.setLength(i2);
            sb4.append(str10);
        }
        return new d240(z5, iz30Var14, r040Var, j5, vh0Var.g, sb4.toString(), vh0Var.b, vh0Var.f);
    }

    public static final mc90 U(sc90 sc90Var, long j, int i) {
        sc90Var.getClass();
        if (sc90Var.equals(rc90.f30227a)) {
            return new hc90(bww.H(j));
        }
        if (sc90Var.equals(rc90.b)) {
            return new hc90(azw.O(j));
        }
        if (!(sc90Var instanceof qc90)) {
            t9f.b();
            return null;
        }
        if (((qc90) sc90Var).f28475a) {
            String strValueOf = String.valueOf(i + 1);
            strValueOf.getClass();
            return new xb90(strValueOf);
        }
        String strValueOf2 = String.valueOf(i + 1);
        strValueOf2.getClass();
        return new zb90(strValueOf2);
    }

    public static final nob0 V(asn asnVar) {
        asnVar.getClass();
        Integer num = asnVar.c;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        Double d = asnVar.f1398a;
        if (d == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue = d.doubleValue();
        Double d2 = asnVar.b;
        if (d2 == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue2 = d2.doubleValue();
        List list = asnVar.d;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = asnVar.e;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new nob0(iIntValue, dDoubleValue, dDoubleValue2, list, list2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    public static final d0k0 W(vzj0 vzj0Var, anq0 anq0Var, ctf0 ctf0Var) {
        qal0 qal0Var;
        String strA;
        vzj0Var.getClass();
        ctf0Var.getClass();
        znq0 znq0Var = anq0Var != null ? anq0Var.h : null;
        if (znq0Var != null) {
            long j = znq0Var.f44687a;
            if (j <= 0) {
                qal0Var = null;
            } else {
                long j2 = j / 86400;
                if (j2 > 0) {
                    strA = ctf0Var.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j2)}, 1));
                } else {
                    strA = ctf0Var.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                }
                String strH = H((((j < 0 ? 0L : j) / 60) / 60) % 24);
                String strH2 = H(((j < 0 ? 0L : j) / 60) % 60);
                if (j < 0) {
                    j = 0;
                }
                qal0Var = new qal0(strA, strH, strH2, H(j % 60));
            }
        } else {
            qal0Var = null;
        }
        if (vzj0Var instanceof tzj0) {
            tzj0 tzj0Var = (tzj0) vzj0Var;
            return new xzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
        }
        if (vzj0Var instanceof uzj0) {
            uzj0 uzj0Var = (uzj0) vzj0Var;
            return new a0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
        }
        t9f.b();
        return null;
    }

    public static final f240 X(sx10 sx10Var, ctf0 ctf0Var, h240 h240Var, List list, r040 r040Var, String str, String str2) {
        boolean z;
        iz30 iz30Var = sx10Var.f32951a;
        if (list != null && list.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((iz30) it.next()) == iz30Var) {
                z = true;
                break;
            }
        }
        int iOrdinal = iz30Var.ordinal();
        if (iOrdinal == 1) {
            return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_live))).intValue(), ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_live_description, Arrays.copyOf(new Object[0], 0)));
        }
        if (iOrdinal == 2) {
            return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_line))).intValue(), ctf0Var.b.a(R.string.line, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_line_description, Arrays.copyOf(new Object[0], 0)));
        }
        if (iOrdinal == 3) {
            return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_express))).intValue(), ctf0Var.b.a(R.string.day_express, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_day_express_description, Arrays.copyOf(new Object[0], 0)));
        }
        if (iOrdinal == 4) {
            return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_stream))).intValue(), ctf0Var.b.a(R.string.stream_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_stream_description, Arrays.copyOf(new Object[0], 0)));
        }
        if (iOrdinal == 24) {
            return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_authenticator))).intValue(), ctf0Var.b.a(R.string.authenticator, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.authenticator_description, Arrays.copyOf(new Object[0], 0)));
        }
        if (iOrdinal == 25) {
            return new w140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_telegram))).intValue(), ctf0Var.b.a(R.string.menu_telegram_bot_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_telegram_bot_description_v2, Arrays.copyOf(new Object[]{str}, 1)));
        }
        if (iOrdinal == 47) {
            return new j140(((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_champions_club))).intValue(), iz30Var, r040Var, str2, ctf0Var.b.a(R.string.promo_menu_champions_club_subtitle, Arrays.copyOf(new Object[0], 0)), !K(ctf0Var) ? thb.t() : "", z);
        }
        if (iOrdinal == 56) {
            return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_responsible_gambling))).intValue(), ctf0Var.b.a(R.string.responsible_game, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_responsible_gaming_description, Arrays.copyOf(new Object[0], 0)));
        }
        if (iOrdinal == 60) {
            return new w140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_quest))).intValue(), ctf0Var.b.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.daily_task_description, Arrays.copyOf(new Object[0], 0)));
        }
        switch (iOrdinal) {
            case 6:
                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_results))).intValue(), ctf0Var.b.a(R.string.results, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_results_description, Arrays.copyOf(new Object[0], 0)));
            case 7:
                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_bets_on_yours))).intValue(), ctf0Var.b.a(R.string.bets_on_yours, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_bet_on_favorites_description, Arrays.copyOf(new Object[0], 0)));
            case 8:
                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_tv_bet))).intValue(), ctf0Var.b.a(R.string.tv_bet_casino_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_tvbet_description_item, Arrays.copyOf(new Object[0], 0)));
            case 9:
                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_games))).intValue(), ctf0Var.b.a(R.string.all_games, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_description, Arrays.copyOf(new Object[0], 0)));
            case 10:
                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_promo_games))).intValue(), ctf0Var.b.a(R.string.bonuses, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_promo_description, Arrays.copyOf(new Object[0], 0)));
            case 11:
                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_cashback))).intValue(), ctf0Var.b.a(R.string.cashback, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_item_cashback_description, Arrays.copyOf(new Object[0], 0)));
            case 12:
                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_favourite_active))).intValue(), ctf0Var.b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_favorites_description, Arrays.copyOf(new Object[0], 0)));
            default:
                switch (iOrdinal) {
                    case 16:
                        return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_financial))).intValue(), ctf0Var.b.a(R.string.finance_bets, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_finbets_description, Arrays.copyOf(new Object[0], 0)));
                    case 17:
                        return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_betconstructor))).intValue(), ctf0Var.b.a(R.string.betconstructor, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_betconstructor_description, Arrays.copyOf(new Object[0], 0)));
                    case 18:
                        return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_qr_scanning))).intValue(), ctf0Var.b.a(R.string.scanner, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_coupon_scanner_description, Arrays.copyOf(new Object[0], 0)));
                    default:
                        switch (iOrdinal) {
                            case 20:
                                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_notification_active))).intValue(), ctf0Var.b.a(R.string.notifications_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_notifications_description, Arrays.copyOf(new Object[0], 0)));
                            case 21:
                                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_support))).intValue(), ctf0Var.b.a(R.string.support, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_support_description, Arrays.copyOf(new Object[0], 0)));
                            case 22:
                                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_info))).intValue(), ctf0Var.b.a(R.string.info, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_info_description, Arrays.copyOf(new Object[0], 0)));
                            default:
                                switch (iOrdinal) {
                                    case 32:
                                        return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad))).intValue(), ctf0Var.b.a(R.string.cyber_sport, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_cyber_description, Arrays.copyOf(new Object[0], 0)));
                                    case 33:
                                        return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_ufc))).intValue(), ctf0Var.b.a(R.string.ufc_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_ufc_description, Arrays.copyOf(new Object[0], 0)));
                                    case 34:
                                        return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_cards))).intValue(), ctf0Var.b.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_my_description, Arrays.copyOf(new Object[0], 0)));
                                    case 35:
                                        return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_categories))).intValue(), ctf0Var.b.a(R.string.casino_category_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_category_description, Arrays.copyOf(new Object[0], 0)));
                                    case 36:
                                        return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_tournaments))).intValue(), ctf0Var.b.a(R.string.casino_tour_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_tour_description, Arrays.copyOf(new Object[0], 0)));
                                    case 37:
                                        return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_promo_aggregator))).intValue(), ctf0Var.b.a(R.string.casino_promo_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_promo_description, Arrays.copyOf(new Object[0], 0)));
                                    case 38:
                                        return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_shopping_bag))).intValue(), ctf0Var.b.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.promo_settings_subtitle, Arrays.copyOf(new Object[0], 0)));
                                    default:
                                        switch (iOrdinal) {
                                            case 42:
                                                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_slots))).intValue(), ctf0Var.b.a(R.string.cases_slots, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_slots_description, Arrays.copyOf(new Object[0], 0)));
                                            case 43:
                                                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_peak))).intValue(), ctf0Var.b.a(R.string.live_casino_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_live_casino_description, Arrays.copyOf(new Object[0], 0)));
                                            case 44:
                                                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_virtual))).intValue(), ctf0Var.b.a(R.string.my_virtual, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_my_virtual_description, Arrays.copyOf(new Object[0], 0)));
                                            case 45:
                                                return new s140(iz30Var, z, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_providers))).intValue(), ctf0Var.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_providers_menu_desription, Arrays.copyOf(new Object[0], 0)));
                                            default:
                                                return B();
                                        }
                                }
                        }
                }
        }
    }

    public static final f240 Y(yx10 yx10Var, ctf0 ctf0Var, qho qhoVar, List list, r040 r040Var, boolean z, boolean z2, List list2, String str, String str2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        int i2;
        boolean z7;
        boolean z8;
        boolean z9;
        int i3;
        boolean z10;
        boolean z11;
        boolean z12;
        int i4;
        String string;
        Object next;
        int i5;
        char c;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_games);
        if (yx10Var instanceof sx10) {
            return X((sx10) yx10Var, ctf0Var, new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 29), list, r040Var, str, str2);
        }
        if (yx10Var instanceof lx10) {
            lx10 lx10Var = (lx10) yx10Var;
            iz30 iz30Var = lx10Var.f20792a;
            i240 i240Var = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 0);
            if (list != null && list.isEmpty()) {
                z18 = false;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z18 = false;
                    break;
                }
                if (((iz30) it.next()) == iz30Var) {
                    z18 = true;
                    break;
                }
            }
            int iOrdinal = iz30Var.ordinal();
            if (iOrdinal == 9) {
                return new s140(iz30Var, z18, r040Var, ((Number) i240Var.invoke(numValueOf)).intValue(), lx10Var.b, ctf0Var.b.a(R.string.menu_one_x_games_description, Arrays.copyOf(new Object[0], 0)));
            }
            if (iOrdinal != 15) {
                return B();
            }
            int iIntValue = ((Number) i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_toto))).intValue();
            String upperCase = ctf0Var.b.a(R.string.toto_name, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return new s140(iz30Var, z18, r040Var, iIntValue, upperCase, ctf0Var.b.a(R.string.menu_toto_description, Arrays.copyOf(new Object[0], 0)));
        }
        if (yx10Var instanceof px10) {
            px10 px10Var = (px10) yx10Var;
            iz30 iz30Var2 = px10Var.f27734a;
            i240 i240Var2 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 1);
            if (list != null && list.isEmpty()) {
                z17 = false;
                break;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z17 = false;
                    break;
                }
                if (((iz30) it2.next()) == iz30Var2) {
                    z17 = true;
                    break;
                }
            }
            int iIntValue2 = ((Number) i240Var2.invoke(Integer.valueOf(R.drawable.ic_glyph_cart))).intValue();
            lsm0 lsm0Var = ctf0Var.b;
            lsm0 lsm0Var2 = ctf0Var.b;
            return new p140(iz30Var2, z17, r040Var, R.attr.uikitStaticWhite, R.attr.uikitStaticWhite, iIntValue2, R.attr.uikitStaticWhite, R.attr.uikitStaticWhite20, lsm0Var.a(R.string.promo_codes_title, Arrays.copyOf(new Object[0], 0)), String.format(Locale.ENGLISH, lsm0Var2.a(R.string.placeholder_variant_5, Arrays.copyOf(new Object[0], 0)), Arrays.copyOf(new Object[]{lsm0Var2.a(R.string.menu_promo_subtitle, Arrays.copyOf(new Object[0], 0)), String.valueOf(px10Var.b), lsm0Var2.a(R.string.pts_symbol, Arrays.copyOf(new Object[0], 0))}, 3)), z2 ? 0 : R.drawable.banner_promo, R.drawable.promo_shop_item_background, null);
        }
        if (yx10Var instanceof qx10) {
            iz30 iz30Var3 = ((qx10) yx10Var).f29460a;
            i240 i240Var3 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 2);
            if (list != null && list.isEmpty()) {
                z16 = false;
                break;
            }
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z16 = false;
                    break;
                }
                if (((iz30) it3.next()) == iz30Var3) {
                    z16 = true;
                    break;
                }
            }
            return new p140(iz30Var3, z16, r040Var, R.attr.uikitStaticWhite, R.attr.uikitStaticWhite, ((Number) i240Var3.invoke(Integer.valueOf(R.drawable.ic_glyph_balloons))).intValue(), R.attr.uikitStaticDarkOrange, R.attr.uikitStaticWhite, ctf0Var.b.a(R.string.news_promo, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_promo_description, Arrays.copyOf(new Object[0], 0)), z2 ? 0 : R.drawable.ic_banner_events, R.drawable.main_menu_promotion_item_background, null);
        }
        if (yx10Var instanceof vx10) {
            iz30 iz30Var4 = ((vx10) yx10Var).f38180a;
            i240 i240Var4 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 3);
            if (list != null && list.isEmpty()) {
                z15 = false;
                break;
            }
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z15 = false;
                    break;
                }
                if (((iz30) it4.next()) == iz30Var4) {
                    z15 = true;
                    break;
                }
            }
            return new p140(iz30Var4, z15, r040Var, R.attr.uikitStaticWhite, R.attr.uikitStaticWhite, ((Number) i240Var4.invoke(Integer.valueOf(R.drawable.ic_glyph_team))).intValue(), R.attr.uikitStaticWhite, R.attr.uikitStaticWhite20, ctf0Var.b.a(R.string.team_bet_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_team_bet_description, Arrays.copyOf(new Object[0], 0)), z2 ? 0 : R.drawable.teambet_menu_banner, R.drawable.main_menu_teambet_item_background, M(ctf0Var.a(R.color.uikit_teambet_gradient_end)));
        }
        if (yx10Var instanceof ux10) {
            i240 i240Var5 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 4);
            iz30 iz30Var5 = iz30.x;
            if (list != null && list.isEmpty()) {
                z14 = false;
                break;
            }
            Iterator it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    z14 = false;
                    break;
                }
                if (((iz30) it5.next()) == iz30.x) {
                    z14 = true;
                    break;
                }
            }
            return new r140(iz30Var5, z14, r040Var, ((Number) i240Var5.invoke(Integer.valueOf(R.drawable.ic_glyph_swipex))).intValue(), ctf0Var.b.a(R.string.swipex, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.bet_with_one_swipe, Arrays.copyOf(new Object[0], 0)), z2 ? 0 : R.drawable.swipex_banner);
        }
        if (yx10Var instanceof nx10) {
            nx10 nx10Var = (nx10) yx10Var;
            iz30 iz30Var6 = nx10Var.f24262a;
            i240 i240Var6 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 5);
            if (list != null && list.isEmpty()) {
                z13 = false;
                break;
            }
            Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z13 = false;
                    break;
                }
                if (((iz30) it6.next()) == iz30Var6) {
                    z13 = true;
                    break;
                }
            }
            int iIntValue3 = ((Number) i240Var6.invoke(numValueOf)).intValue();
            String strA = ctf0Var.b.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
            String strA2 = ctf0Var.b.a(R.string.menu_one_x_games_description, Arrays.copyOf(new Object[0], 0));
            List list3 = nx10Var.b;
            ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
            Iterator it7 = list3.iterator();
            while (it7.hasNext()) {
                arrayList.add(Q((mz60) it7.next(), ctf0Var));
            }
            return new u140(z13, iz30Var6, r040Var, iIntValue3, strA, strA2, arrayList);
        }
        String string2 = "";
        if (yx10Var instanceof tx10) {
            tx10 tx10Var = (tx10) yx10Var;
            iz30 iz30Var7 = iz30.c;
            if (list != null && list.isEmpty()) {
                z11 = false;
                break;
            }
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    z11 = false;
                    break;
                }
                if (((iz30) it8.next()) == iz30.c) {
                    z11 = true;
                    break;
                }
            }
            lok0 lok0Var = tx10Var.f34677a;
            int i6 = lok0Var.f20396a;
            int i7 = lok0Var.f20396a;
            long j = lok0Var.f;
            long j2 = lok0Var.g;
            if (j2 != 0) {
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        z12 = z11;
                        i4 = i6;
                        next = null;
                        break;
                    }
                    next = it9.next();
                    z12 = z11;
                    i4 = i6;
                    if (((f3n0) next).f8872a == j2) {
                        break;
                    }
                    z11 = z12;
                    i6 = i4;
                }
                f3n0 f3n0Var = (f3n0) next;
                if (f3n0Var != null) {
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String str3 = f3n0Var.c.j;
                    str3.getClass();
                    if (str3.length() == 0) {
                        sb.setLength(0);
                    } else {
                        if (StringsKt.O(str3, ujn.h, false)) {
                            i5 = 0;
                        } else if (kotlin.text.c.x(str3, "https://", false)) {
                            i5 = 0;
                        } else {
                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                c = '/';
                            } else {
                                c = '/';
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str3, c));
                        }
                        sb.setLength(i5);
                        sb.append(str3);
                    }
                    string = sb.toString();
                } else if (j != 0) {
                    bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                    rz4.s(j, ".svg", bzuVarD);
                    string2 = ((StringBuilder) bzuVarD.b).toString();
                }
                String str4 = lok0Var.u;
                return new y140(z12, r040Var, i4, iz30Var7, R.attr.uikitStaticWhite, string, q5x.D(i7, str4), R.attr.uikitSecondary, R.drawable.sport_new, lok0Var.b, "", q5x.E(i7, str4));
            }
            z12 = z11;
            i4 = i6;
            if (j != 0) {
                bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                rz4.s(j, ".svg", bzuVarD2);
                string2 = ((StringBuilder) bzuVarD2.b).toString();
            }
            string = string2;
            String str5 = lok0Var.u;
            return new y140(z12, r040Var, i4, iz30Var7, R.attr.uikitStaticWhite, string, q5x.D(i7, str5), R.attr.uikitSecondary, R.drawable.sport_new, lok0Var.b, "", q5x.E(i7, str5));
        }
        if (yx10Var instanceof hx10) {
            iz30 iz30Var8 = ((hx10) yx10Var).f13792a;
            i240 i240Var7 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 6);
            if (list == null || !list.isEmpty()) {
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    if (((iz30) it10.next()) == iz30Var8) {
                        z10 = true;
                    }
                }
                z10 = false;
            } else {
                z10 = false;
            }
            return new s140(iz30Var8, z10, r040Var, ((Number) i240Var7.invoke(Integer.valueOf(R.drawable.ic_glyph_authenticator))).intValue(), ctf0Var.b.a(R.string.authenticator, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.authenticator_description, Arrays.copyOf(new Object[0], 0)));
        }
        if (yx10Var instanceof ix10) {
            ix10 ix10Var = (ix10) yx10Var;
            iz30 iz30Var9 = ix10Var.f15519a;
            i240 i240Var8 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 7);
            if (list != null && list.isEmpty()) {
                z9 = false;
                break;
            }
            Iterator it11 = list.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    z9 = false;
                    break;
                }
                if (((iz30) it11.next()) == iz30Var9) {
                    z9 = true;
                    break;
                }
            }
            StringBuilder sb2 = new StringBuilder(ujn.h);
            String str6 = String.format(Locale.ENGLISH, "static/img/android/icons_currency/v2/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(ix10Var.b)}, 1));
            if (str6.length() == 0) {
                sb2.setLength(0);
                i3 = 0;
            } else {
                if (StringsKt.O(str6, ujn.h, false)) {
                    i3 = 0;
                } else if (kotlin.text.c.x(str6, "https://", false)) {
                    i3 = 0;
                } else {
                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                        sb2.append('/');
                    }
                    i3 = 0;
                    sb2.append(StringsKt.y0(str6, '/'));
                }
                sb2.setLength(i3);
                sb2.append(str6);
            }
            return new o140(((Number) i240Var8.invoke(Integer.valueOf(R.drawable.ic_glyph_currency_placeholder))).intValue(), iz30Var9, r040Var, sb2.toString(), ctf0Var.b.a(R.string.balance_management_title, Arrays.copyOf(new Object[i3], i3)), ctf0Var.b.a(R.string.balance_managment_description, Arrays.copyOf(new Object[i3], i3)), z9);
        }
        if (yx10Var instanceof rx10) {
            iz30 iz30Var10 = ((rx10) yx10Var).f31242a;
            h240 h240Var = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 22);
            if (list != null && list.isEmpty()) {
                z8 = false;
                break;
            }
            Iterator it12 = list.iterator();
            while (true) {
                if (!it12.hasNext()) {
                    z8 = false;
                    break;
                }
                if (((iz30) it12.next()) == iz30Var10) {
                    z8 = true;
                    break;
                }
            }
            return new q140(iz30Var10, z8, r040Var, ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_lock))).intValue(), R.attr.uikitPrimary, R.attr.uikitStaticWhite, ctf0Var.b.a(R.string.increase_security, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_increase_security_description, Arrays.copyOf(new Object[0], 0)), !z2 ? R.drawable.banner_security : 0, R.attr.uikitPrimary);
        }
        if (yx10Var instanceof gx10) {
            gx10 gx10Var = (gx10) yx10Var;
            iz30 iz30Var11 = gx10Var.f12055a;
            h240 h240Var2 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 23);
            vh0 vh0Var = gx10Var.b;
            if (g240.f10544a[iz30Var11.ordinal()] == 46) {
                if (list == null || !list.isEmpty()) {
                    Iterator it13 = list.iterator();
                    while (it13.hasNext()) {
                        if (((iz30) it13.next()) == iz30Var11) {
                            z7 = true;
                        }
                    }
                    z7 = false;
                } else {
                    z7 = false;
                }
                return new s140(iz30Var11, z7, r040Var, ((Number) h240Var2.invoke(Integer.valueOf(R.drawable.ic_glyph_fast_bet))).intValue(), ctf0Var.b.a(R.string.fast_bet_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.fast_bet_description, Arrays.copyOf(new Object[0], 0)));
            }
            if (list != null && list.isEmpty()) {
                z6 = false;
                break;
            }
            Iterator it14 = list.iterator();
            while (true) {
                if (!it14.hasNext()) {
                    z6 = false;
                    break;
                }
                if (((iz30) it14.next()) == iz30Var11) {
                    z6 = true;
                    break;
                }
            }
            long j3 = vh0Var.f37408a;
            StringBuilder sb3 = new StringBuilder(ujn.h);
            String str7 = String.format(Locale.ENGLISH, "static/img/android/agregator/category/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(vh0Var.f37408a)}, 1));
            if (str7.length() == 0) {
                sb3.setLength(0);
            } else {
                if (StringsKt.O(str7, ujn.h, false)) {
                    i2 = 0;
                } else if (kotlin.text.c.x(str7, "https://", false)) {
                    i2 = 0;
                } else {
                    if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                        sb3.append('/');
                    }
                    sb3.append(StringsKt.y0(str7, '/'));
                }
                sb3.setLength(i2);
                sb3.append(str7);
            }
            return new t140(z6, iz30Var11, r040Var, j3, vh0Var.g, sb3.toString(), vh0Var.b, vh0Var.f);
        }
        if (yx10Var instanceof fx10) {
            h240 h240Var3 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 24);
            iz30 iz30Var12 = iz30.t;
            if (list != null && list.isEmpty()) {
                i = 0;
                z5 = false;
                break;
            }
            Iterator it15 = list.iterator();
            while (true) {
                if (!it15.hasNext()) {
                    i = 0;
                    z5 = false;
                    break;
                }
                if (((iz30) it15.next()) == iz30.t) {
                    z5 = true;
                    i = 0;
                    break;
                }
            }
            return new q140(iz30Var12, z5, r040Var, ((Number) h240Var3.invoke(Integer.valueOf(R.drawable.ic_glyph_virtual))).intValue(), R.attr.uiKitAggregatorLavender, R.attr.uikitStaticWhite, ctf0Var.b.a(R.string.my_virtual, Arrays.copyOf(new Object[i], i)), z ? ctf0Var.b.a(R.string.casino_my_virtual_description, Arrays.copyOf(new Object[i], i)) : "", !z2 ? R.drawable.my_aggregator_banner : 0, R.attr.uiKitAggregatorLavender);
        }
        if (yx10Var instanceof mx10) {
            mx10 mx10Var = (mx10) yx10Var;
            h240 h240Var4 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 25);
            iz30 iz30Var13 = iz30.l;
            if (list != null && list.isEmpty()) {
                z4 = false;
                break;
            }
            Iterator it16 = list.iterator();
            while (true) {
                if (!it16.hasNext()) {
                    z4 = false;
                    break;
                }
                if (((iz30) it16.next()) == iz30.l) {
                    z4 = true;
                    break;
                }
            }
            return new j140(((Number) h240Var4.invoke(Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad))).intValue(), iz30Var13, r040Var, ctf0Var.b.a(R.string.cyber_sport, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_cyber_description, Arrays.copyOf(new Object[0], 0)), !z2 ? mx10Var.b : "", z4);
        }
        if (yx10Var instanceof wx10) {
            wx10 wx10Var = (wx10) yx10Var;
            h240 h240Var5 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 26);
            iz30 iz30Var14 = iz30.m;
            if (list != null && list.isEmpty()) {
                z3 = false;
                break;
            }
            Iterator it17 = list.iterator();
            while (true) {
                if (!it17.hasNext()) {
                    z3 = false;
                    break;
                }
                if (((iz30) it17.next()) == iz30.m) {
                    z3 = true;
                    break;
                }
            }
            return new j140(((Number) h240Var5.invoke(Integer.valueOf(R.drawable.ic_glyph_ufc))).intValue(), iz30Var14, r040Var, ctf0Var.b.a(R.string.ufc_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_ufc_description, Arrays.copyOf(new Object[0], 0)), !z2 ? wx10Var.b : "", z3);
        }
        boolean z19 = false;
        if (yx10Var instanceof ox10) {
            return E((ox10) yx10Var, ctf0Var, new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 27), list, r040Var);
        }
        if (!(yx10Var instanceof xx10)) {
            return B();
        }
        xx10 xx10Var = (xx10) yx10Var;
        h240 h240Var6 = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 28);
        if (list == null || !list.isEmpty()) {
            Iterator it18 = list.iterator();
            while (it18.hasNext()) {
                if (((iz30) it18.next()) == xx10Var.f41637a) {
                    z19 = true;
                    break;
                }
            }
        }
        return G(xx10Var, ctf0Var, h240Var6, r040Var, z19);
    }

    public static final t4i0 Z(final cgx0 cgx0Var, final hu5 hu5Var, t4i0 t4i0Var) {
        fef fefVar;
        int i = hu5Var.c;
        int i2 = hu5Var.b;
        boolean z = cgx0Var.b;
        final int i3 = z ? i2 : i;
        a9q0 a9q0Var = (a9q0) hu5Var.e;
        int i4 = hu5Var.d;
        wez wezVar = wez.b;
        final a8z a8zVarA = maz.a(wezVar, new x9c(hu5Var, i3, (byte) 10));
        final int i5 = z ? i : i2;
        a8z a8zVarA2 = maz.a(wezVar, new Function0() { // from class: a.x4i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                hu5 hu5Var2 = hu5Var;
                a9q0 a9q0Var2 = (a9q0) hu5Var2.e;
                int iIntValue = ((Number) a8zVarA.getValue()).intValue();
                cgx0 cgx0Var2 = cgx0Var;
                boolean z2 = cgx0Var2.b;
                boolean z3 = cgx0Var2.q() == fef.f9404a;
                int i6 = i3;
                long jL = a9q0Var2.l(i6);
                bw40 bw40Var = a9q0Var2.b;
                int i7 = o9q0.c;
                int i8 = (int) (jL >> 32);
                int i9 = bw40Var.f;
                if (bw40Var.d(i8) != iIntValue) {
                    i8 = iIntValue >= i9 ? a9q0Var2.i(i9 - 1) : a9q0Var2.i(iIntValue);
                }
                int iC = (int) (jL & 4294967295L);
                if (bw40Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i9 ? bw40Var.c(i9 - 1, false) : bw40Var.c(iIntValue, false);
                }
                int i10 = i5;
                if (i8 == i10) {
                    return hu5Var2.c(iC);
                }
                if (iC == i10) {
                    return hu5Var2.c(i8);
                }
                if (!(z2 ^ z3) ? i6 >= i8 : i6 > iC) {
                    i8 = iC;
                }
                return hu5Var2.c(i8);
            }
        });
        if (1 != t4i0Var.c) {
            return (t4i0) a8zVarA2.getValue();
        }
        if (i3 == i4) {
            return t4i0Var;
        }
        if (((Number) a8zVarA.getValue()).intValue() != a9q0Var.b.d(i4)) {
            return (t4i0) a8zVarA2.getValue();
        }
        int i6 = t4i0Var.b;
        long jL = a9q0Var.l(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                if (i2 < i) {
                    fefVar = fef.b;
                } else {
                    fefVar = i2 > i ? fef.f9404a : fef.c;
                }
                if (!((fefVar == fef.f9404a) ^ z)) {
                }
            }
            return hu5Var.c(i3);
        }
        int i7 = o9q0.c;
        return (i6 == ((int) (jL >> 32)) || i6 == ((int) (4294967295L & jL))) ? (t4i0) a8zVarA2.getValue() : hu5Var.c(i3);
    }

    public static final void a(f2a0 f2a0Var, fet fetVar, int i) {
        int i2;
        byte b;
        boolean z;
        fet fetVar2 = fetVar;
        String str = f2a0Var.c;
        fetVar2.g0(-1322340275);
        int i3 = i & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i3 == 0) {
            i2 = i | (fetVar2.g(zhg0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(f2a0Var) : fetVar2.i(f2a0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(zhg0Var.a(1.0f, jm40Var, true), 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarC);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 1.0f), null, false, 3);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarW, zx7Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            String str2 = f2a0Var.b;
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str2, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, 0, 24960, 109562);
            v8q0.a(f2a0Var.f8803a, null, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, 0, 24960, 109562);
            fetVar.r(true);
            if (str.length() > 0) {
                fetVar.e0(-935919657);
                mm40 mm40VarB2 = jr8Var.b(o7k0.w(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), null, false, 3), gqw0.g);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarB2);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                lgb.v(o7k0.n(jm40Var, 16.0f), o7k0.n(jm40Var, 16.0f), f2a0Var.d, R.drawable.ic_glyph_circle_globe, staticColors.m129getWhite400d7_KjU(), gqw0.f1, fetVar, 196608, 0);
                z = true;
                v8q0.a(str, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(true);
                b = 0;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                z = true;
                b = 0;
                fetVar2.e0(-934789521);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            b = 0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e2a0(f2a0Var, i, b);
        }
    }

    public static final mm40 a0(mm40 mm40Var, Function0 function0) {
        mm40Var.getClass();
        function0.getClass();
        return mm40Var.e(pai0.a(jm40.b, false, new r3w(function0, (byte) 14)));
    }

    public static final void b(mm40 mm40Var, ygx ygxVar, xdr xdrVar, fet fetVar, int i) {
        int i2;
        xdrVar.getClass();
        fetVar.g0(-1570139205);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(ygxVar) : fetVar.i(ygxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(o7k0.d(mm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarI = s5x0.I(mm40VarQ, new lh80(qmk.a(fetVar).d + 8.0f, 8.0f, qmk.a(fetVar).d + 8.0f, ygxVar.e ? 0.0f : 8.0f));
            int i3 = i2 & 112;
            boolean z = (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(ygxVar))) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new vgx(xdrVar, ygxVar, b);
                fetVar.o0(objP);
            }
            yyw.i(mm40VarI, ygxVar, (Function0) objP, u1c.M(-1505071001, new wgx(ygxVar, b), fetVar), u1c.M(-1502895808, new wgx(ygxVar, b2), fetVar), u1c.M(-2013907967, new wgx(ygxVar, (byte) 2), fetVar), u1c.M(1770047170, new wgx(ygxVar, (byte) 3), fetVar), fetVar, i3 | 1797120);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xgx(mm40Var, ygxVar, xdrVar, i, (byte) 0);
        }
    }

    public static wcy c(Function1 function1) {
        uby ubyVar = vby.d;
        ubyVar.getClass();
        bcy bcyVar = new bcy();
        dcy dcyVar = ubyVar.f37162a;
        bcyVar.f2375a = dcyVar.c;
        bcyVar.b = dcyVar.f5868a;
        bcyVar.c = dcyVar.b;
        String str = dcyVar.d;
        bcyVar.d = dcyVar.e;
        String str2 = dcyVar.f;
        olc olcVar = dcyVar.h;
        bcyVar.e = dcyVar.g;
        qaj qajVar = ubyVar.b;
        boolean z = dcyVar.i;
        function1.invoke(bcyVar);
        if (!Intrinsics.d(str, "    ")) {
            jf4.o("Indent should not be specified when default printing mode is used");
            return null;
        }
        dcy dcyVar2 = new dcy(bcyVar.b, bcyVar.c, bcyVar.f2375a, str, bcyVar.d, str2, bcyVar.e, olcVar, z);
        qajVar.getClass();
        wcy wcyVar = new wcy(dcyVar2, qajVar);
        if (qajVar != qhi0.f28741a) {
            qajVar.c(new nqd(dcyVar2));
        }
        return wcyVar;
    }

    public static final void d(mm40 mm40Var, fzy fzyVar, Function1 function1, fet fetVar, int i) {
        fzyVar.getClass();
        fetVar.g0(1926433021);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(fzyVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            kr00.a(u1c.M(-1378565382, new azy(mm40Var, function1, fzyVar), fetVar), fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new azy(mm40Var, fzyVar, function1, i);
        }
    }

    public static final void e(mm40 mm40Var, f6q0 f6q0Var, q7q0 q7q0Var, fet fetVar, int i) {
        y3d y3dVarF;
        pm80 pm80VarF;
        fet fetVar2 = fetVar;
        pge pgeVar = gqw0.A;
        f6q0Var.getClass();
        fetVar2.g0(1228630027);
        int i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i | (fetVar2.g(f6q0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(q7q0Var) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = Boolean.valueOf(Intrinsics.d(q7q0Var, q7q0.f28265a));
                fetVar2.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            if (f6q0Var instanceof e6q0) {
                fetVar2.e0(-402541137);
                fetVar2.r(false);
            } else {
                if (!(f6q0Var instanceof d6q0)) {
                    throw b1j.f(-402540298, fetVar2, false);
                }
                fetVar2.e0(406248039);
                if (zBooleanValue) {
                    fetVar2.e0(-402537772);
                    fetVar2.r(false);
                    y3dVarF = ((d6q0) f6q0Var).c;
                } else {
                    fetVar2.e0(-402536526);
                    y3dVarF = dw9.f(fetVar2, false, ((StaticColors) fetVar2.k(m8m0.f21378a)).m130getWhite600d7_KjU());
                }
                y3d y3dVar = y3dVarF;
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = o7k0.n(s5x0.N(mm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 20.0f);
                d6q0 d6q0Var = (d6q0) f6q0Var;
                o0x o0xVar = d6q0Var.f5563a;
                if (o0xVar instanceof n0x) {
                    fetVar2.e0(406533146);
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = androidx.compose.runtime.e.e(hz3.f13888a);
                        fetVar2.o0(objP2);
                    }
                    pz40 pz40Var = (pz40) objP2;
                    Object objA = o0xVar.a();
                    Object objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = new y9v(pz40Var, (byte) 9);
                        fetVar2.o0(objP3);
                    }
                    mz3 mz3VarX = l7x.X(objA, (Function1) objP3, null, fetVar2, 384, 26);
                    Integer num = d6q0Var.b;
                    if (num == null) {
                        fetVar2.e0(406888963);
                        fetVar2.r(false);
                        pm80VarF = null;
                    } else {
                        fetVar2.e0(406888964);
                        pm80VarF = a8k0.F(num.intValue(), 0, fetVar2);
                        fetVar2.r(false);
                    }
                    if (pm80VarF == null) {
                        fetVar2.e0(-402513796);
                        pm80VarF = a8k0.F(R.drawable.ic_glyph_language, 0, fetVar2);
                    } else {
                        fetVar2.e0(-402517361);
                    }
                    fetVar2.r(false);
                    lz3 lz3Var = (lz3) pz40Var.getValue();
                    if (lz3Var != null && ((lz3Var instanceof hz3) || (lz3Var instanceof jz3) || (lz3Var instanceof iz3))) {
                        fetVar2.e0(407281083);
                        fetVar2 = fetVar;
                        j0x.b(pm80VarF, null, mm40VarN, null, pgeVar, 0.0f, y3dVar != null ? new m78(y3dVar.f41946a, 5) : null, fetVar2, 24632, 40);
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar2;
                        fetVar2.e0(407742921);
                        j0x.b(mz3VarX, null, mm40VarN, null, pgeVar, 0.0f, null, fetVar2, 24624, 104);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(408106830);
                    mz3 mz3VarX2 = l7x.X(o0xVar.a(), null, null, fetVar2, 0, 30);
                    fetVar2 = fetVar;
                    j0x.b(mz3VarX2, null, mm40VarN, null, pgeVar, 0.0f, y3dVar != null ? new m78(y3dVar.f41946a, 5) : null, fetVar2, 24624, 40);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(mm40Var, f6q0Var, q7q0Var, i, (byte) 11);
        }
    }

    public static final void f(int i, int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(1763105172);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            String strS = xsm0.s(i, fetVar);
            strS.getClass();
            na10 na10VarW = x8x.w(new oa10(strS), fetVar);
            u910 u910VarA0 = gq80.a0(na10VarW.getValue(), fetVar, 956);
            fa10 fa10VarB = na10VarW.getValue();
            boolean zG = fetVar.g(u910VarA0);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new u4h(u910VarA0, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            mm40Var2 = jm40.b;
            mm40 mm40VarE0 = o2e.e0(mm40Var2, "LOTTIE_ANIMATION");
            b = (i3 & 112) != 32 ? (byte) 0 : (byte) 1;
            Object objP2 = fetVar.P();
            if (b != 0 || objP2 == obj) {
                objP2 = new dx2(i, (byte) 24);
                fetVar.o0(objP2);
            }
            piz.j(fa10VarB, function0, pai0.a(mm40VarE0, false, (Function1) objP2), null, fetVar, 0, 0, 131064);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var2, i, i2, (byte) 3);
        }
    }

    public static final void g(mm40 mm40Var, eao eaoVar, a4x a4xVar, xdr xdrVar, Function1 function1, Function1 function2, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        a4xVar.getClass();
        xdrVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-433752747);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(eaoVar) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.i(xdrVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i5 & 1, (74899 & i5) != 74898)) {
            mm40 mm40Var4 = i4 != 0 ? jm40.b : mm40Var2;
            zcl zclVar = qmk.f28987a;
            int i6 = (i5 & 112) | 12582912 | (i5 & 896);
            int i7 = i5 << 3;
            fww.e(s5x0.N(mm40Var4, 0.0f, 8.0f, 0.0f, 0.0f, 5), eaoVar, a4xVar, new qw3(6.0f, true, new jf4((byte) 14)), xdrVar, function1, function2, aad.h, fetVar, i6 | (57344 & i7) | (458752 & i7) | (i7 & 3670016));
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var3, (Object) eaoVar, (Object) a4xVar, (Object) xdrVar, (Object) function1, (wdr) function2, i, i2, (byte) 11);
        }
    }

    public static final void h(mm40 mm40Var, jv60 jv60Var, xcz xczVar, Function1 function1, fet fetVar, int i) {
        jv60Var.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(-1263118287);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(jv60Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            bvl bvlVar = jv60Var.f17194a;
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i160(function1, (byte) 3);
                fetVar.o0(objP);
            }
            ju70.p(mm40Var, bvlVar, xczVar, 0.0f, (Function1) objP, fetVar, i2 & 910, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 10, i, (Object) mm40Var, (Object) jv60Var, (Object) xczVar, (Object) function1);
        }
    }

    public static final void i(mm40 mm40Var, f2a0 f2a0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-2037302314);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(f2a0Var) : fetVar.i(f2a0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 80.0f);
            long j = f2a0Var.f;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.S(i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 1.0f, f2a0Var.g, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 8.0f, 8.0f, 0.0f, 8);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            a(f2a0Var, fetVar, (i2 & 112) | 6);
            j(f2a0Var, fetVar, (i2 >> 3) & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) mm40Var, (Object) f2a0Var, i, (byte) 7);
        }
    }

    public static final void j(f2a0 f2a0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1984606132);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(f2a0Var) : fetVar.i(f2a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            String str = f2a0Var.e;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            lgb.v(o7k0.n(jm40Var, 72.0f), s5x0.M(o7k0.n(jm40Var, 72.0f), 12.0f, 8.0f, 12.0f, 18.0f), str, R.drawable.ic_glyph_placeholder_player, StaticColors.INSTANCE.m130getWhite600d7_KjU(), gqw0.A, fetVar, 196608, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e2a0(f2a0Var, i, b);
        }
    }

    public static final void k(ty6 ty6Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        ty6Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(782412350);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ty6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar2 = fetVar;
            vbw0.h(null, u1c.M(-38513811, new mfa0(ty6Var, b), fetVar), u1c.M(137814446, new eyn(ty6Var, function0, function1, (byte) 28), fetVar), fetVar2, (i2 & 14) | 3456, 2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(ty6Var, function0, function1, i);
        }
    }

    public static final void l(mm40 mm40Var, String str, String str2, boolean z, String str3, Function1 function1, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        String strW;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        str.getClass();
        str3.getClass();
        function2.getClass();
        function0.getClass();
        fetVar2.g0(-878824282);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.g(str3) ? 16384 : 8192) | (fetVar2.i(function2) ? 131072 : 65536) | (fetVar2.i(function0) ? 1048576 : 524288);
        if (fetVar2.U(i2 & 1, (i2 & 599187) != 599186)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarW, backgroundContent, vgg0.a(16.0f)), 16.0f);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar2, (i2 >> 3) & 14, 0, 131064);
            p6q0 h6q0Var = str2.length() == 0 ? o6q0.f24750a : new h6q0();
            if (z) {
                fetVar2.e0(-86323763);
                strW = rsm0.w(R.string.promocode_not_found, 0, fetVar2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-86230732);
                fetVar2.r(false);
                strW = "";
            }
            boolean z2 = false;
            c6q0 c6q0Var = new c6q0(str2, e6q0.f7299a, h6q0Var, new s7q0(strW), true, z, null, str3, null, false, 0, null, 261504);
            boolean z3 = (i2 & 458752) == 131072;
            if ((i2 & 3670016) == 1048576) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objP = fetVar.P();
            if (z4 || objP == ukd.f35823a) {
                function2 = function1;
                objP = new ya4(function2, function0, (byte) 5);
                fetVar2 = fetVar;
                fetVar2.o0(objP);
            } else {
                function2 = function1;
                fetVar2 = fetVar;
            }
            wvb.t(null, c6q0Var, 0, null, (Function1) objP, fetVar2, 0, 13);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var2, (Object) str, (Object) str2, z, (Object) str3, (Object) function2, (Object) function0, i, (byte) 15);
        }
    }

    public static final void m(Fragment fragment, RuleData ruleData, mm40 mm40Var, int i, Integer num, boolean z, fet fetVar, int i2) {
        int i3;
        Fragment fragment2;
        RuleData ruleData2;
        int i4;
        int i5;
        int i6;
        int i7;
        Object ta4Var;
        i3t0 i3t0Var;
        Object obj;
        fetVar.g0(394230648);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.i(fragment) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(ruleData) : fetVar.i(ruleData) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(false) ? 2048 : 1024;
        }
        int i8 = 221184 | i3;
        if ((1572864 & i2) == 0) {
            i8 = 745472 | i3;
        }
        if ((12582912 & i2) == 0) {
            i8 |= fetVar.g(num) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i8 |= fetVar.h(z) ? 67108864 : 33554432;
        }
        if (fetVar.U(i8 & 1, (38347923 & i8) != 38347922)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                i5 = i8 & (-3670017);
                i6 = R.string.rules;
            } else {
                fetVar.X();
                i5 = i8 & (-3670017);
                i6 = i;
            }
            int i9 = i5;
            fetVar.s();
            boolean zE = ((i9 & 112) == 32 || ((i9 & 64) != 0 && fetVar.g(ruleData))) | ((57344 & i9) == 16384) | ((458752 & i9) == 131072) | fetVar.e(i6) | ((i9 & 7168) == 2048) | fetVar.g(fragment);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zE || objP == obj2) {
                ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment);
                af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(slg0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof slg0)) {
                        ze3Var = null;
                    }
                    slg0 slg0Var = (slg0) ze3Var;
                    if (slg0Var != null) {
                        int i10 = i6;
                        ruleData2 = ruleData;
                        i7 = i10;
                        objP = slg0Var.a(false, a4n0.f(fragment), new gmg0(ruleData, false, i10, false, num));
                        fetVar.o0(objP);
                    }
                }
                jf4.n(b1j.i(slg0.class, "Cannot create dependency "));
                return;
            }
            ruleData2 = ruleData;
            i7 = i6;
            nsi nsiVar = (nsi) objP;
            char c = '\f';
            i3t0 i3t0Var2 = (i3t0) n4c.Y(sre0.f32672a.b(aog0.class), ruleData2.f46902a, new fiu0(Collections.singletonMap(aog0.class, nsiVar.o)), fetVar, 12);
            pz40 pz40VarY = i3t0Var2.y(fetVar);
            boolean zI = fetVar.i(i3t0Var2);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj2) {
                objP2 = new aif0(1, i3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                fetVar.o0(objP2);
            }
            boolean z2 = !z;
            piz.x(mm40Var, pz40VarY, z2, z2, false, null, (Function1) ((jhy) objP2), fetVar, (i9 >> 6) & 14, 48);
            boolean zI2 = fetVar.i(fragment) | fetVar.i(nsiVar) | fetVar.i(i3t0Var2);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj2) {
                objP3 = new zlb0(fragment, nsiVar, i3t0Var2);
                fetVar.o0(objP3);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP3, fetVar);
            boolean zI3 = fetVar.i(i3t0Var2) | fetVar.i(fragment) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == obj2) {
                i3t0Var = i3t0Var2;
                obj = obj2;
                ta4Var = new ta4(i3t0Var, fragment, pz40VarF, null, (byte) 4);
                fragment2 = fragment;
                fetVar.o0(ta4Var);
            } else {
                obj = obj2;
                fragment2 = fragment;
                i3t0Var = i3t0Var2;
                ta4Var = objP4;
            }
            m0x0.t(fetVar, fragment2, (Function2) ta4Var);
            boolean zI4 = fetVar.i(i3t0Var);
            Object objP5 = fetVar.P();
            if (zI4 || objP5 == obj) {
                objP5 = new ui6(i3t0Var, (byte) 11);
                fetVar.o0(objP5);
            }
            Function0 function0 = (Function0) objP5;
            boolean zI5 = fetVar.i(i3t0Var);
            Object objP6 = fetVar.P();
            if (zI5 || objP6 == obj) {
                objP6 = new ui6(i3t0Var, c);
                fetVar.o0(objP6);
            }
            v3c.z(function0, (Function0) objP6, null, fetVar, 0, 4);
            i4 = i7;
        } else {
            fragment2 = fragment;
            ruleData2 = ruleData;
            fetVar.X();
            i4 = i;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gb8(fragment2, ruleData2, mm40Var, i4, num, z, i2);
        }
    }

    public static final void n(final mm40 mm40Var, final int i, final nbh0 nbh0Var, rah0 rah0Var, boolean z, final ugd ugdVar, final ugd ugdVar2, fet fetVar, final int i2) {
        int i3;
        ugd ugdVar3;
        mm40 mm40Var2;
        nbh0 nbh0Var2;
        final rah0 rah0Var2;
        final boolean z2;
        yfe0 yfe0VarU;
        Function2 function2;
        int i4;
        final rah0 rah0VarT;
        final boolean z3;
        pz40 pz40Var;
        fetVar.g0(-1722157826);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(nbh0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(ugdVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            ugdVar3 = ugdVar2;
            i3 |= fetVar.i(ugdVar3) ? 1048576 : 524288;
        } else {
            ugdVar3 = ugdVar2;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                i4 = i3 & (-64513);
                rah0VarT = wha0.T(fetVar);
                z3 = fetVar.k(bmd.n) == k6z.b;
            } else {
                fetVar.X();
                z3 = z;
                i4 = i3 & (-64513);
                rah0VarT = rah0Var;
            }
            fetVar.s();
            if (i < 0) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                final ugd ugdVar4 = ugdVar3;
                function2 = new Function2() { // from class: a.pbh0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = b;
                        int i5 = i2;
                        switch (b2) {
                            case 0:
                                ((Integer) obj2).getClass();
                                qxw.n(mm40Var, i, nbh0Var, rah0VarT, z3, ugdVar, ugdVar4, (fet) obj, x8x.L(i5 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                qxw.n(mm40Var, i, nbh0Var, rah0VarT, z3, ugdVar, ugdVar4, (fet) obj, x8x.L(i5 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                mm40Var2 = mm40Var;
                nbh0Var2 = nbh0Var;
                rah0 rah0Var3 = rah0VarT;
                boolean z4 = z3;
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (objP == obj) {
                    objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                    fetVar.o0(objP);
                }
                vne vneVar = (vne) objP;
                boolean zG = fetVar.g(rah0Var3) | fetVar.g(vneVar);
                Object objP2 = fetVar.P();
                if (zG || objP2 == obj) {
                    objP2 = new zrx(rah0Var3, vneVar, z4);
                    fetVar.o0(objP2);
                }
                Object obj2 = (zrx) objP2;
                w6k w6kVar = (w6k) fetVar.k(bmd.h);
                Object objP3 = fetVar.P();
                if (objP3 == obj) {
                    objP3 = Integer.valueOf(w6kVar.T(nbh0Var2.f23240a));
                    fetVar.o0(objP3);
                }
                int iIntValue = ((Number) objP3).intValue();
                Object objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = Integer.valueOf(w6kVar.T(nbh0Var2.c));
                    fetVar.o0(objP4);
                }
                int iIntValue2 = ((Number) objP4).intValue();
                pz40 pz40VarZ = v3c.Z(iun.f15405a, new Object[0], fetVar);
                Object objF = androidx.compose.runtime.e.f(Integer.valueOf(i), fetVar);
                Unit unit = Unit.f46060a;
                boolean zG2 = fetVar.g(pz40VarZ) | fetVar.g(objF) | fetVar.i(obj2) | fetVar.g(w6kVar);
                Object objP5 = fetVar.P();
                if (zG2 || objP5 == obj) {
                    objP5 = new wmq((Object) pz40VarZ, objF, obj2, (Object) w6kVar, (yje) null, (byte) 25);
                    pz40Var = pz40VarZ;
                    fetVar.o0(objP5);
                } else {
                    pz40Var = pz40VarZ;
                }
                m0x0.t(fetVar, unit, (Function2) objP5);
                mm40 mm40VarE = pai0.a(wha0.P(jm40.b, rah0Var3, z4, 6), false, new eoh0((byte) 15)).e(mm40Var2);
                boolean z5 = (i4 & 896) == 256;
                Object objP6 = fetVar.P();
                if (z5 || objP6 == obj) {
                    objP6 = new gwg0((Object) nbh0Var2, (byte) 8);
                    fetVar.o0(objP6);
                }
                mm40 mm40VarK = rq8.K(mm40VarE, (Function1) objP6);
                boolean zH = ((3670016 & i4) == 1048576) | fetVar.h(z4) | ((458752 & i4) == 131072) | ((i4 & 112) == 32) | fetVar.g(pz40Var);
                Object objP7 = fetVar.P();
                if (zH || objP7 == obj) {
                    Object rbh0Var = new rbh0(ugdVar2, iIntValue, iIntValue2, z4, pz40Var, ugdVar, i);
                    fetVar.o0(rbh0Var);
                    objP7 = rbh0Var;
                }
                x4n0.a(mm40VarK, (Function2) objP7, fetVar, 0, 0);
                z2 = z4;
                rah0Var2 = rah0Var3;
            }
            yfe0VarU.d = function2;
        }
        mm40Var2 = mm40Var;
        nbh0Var2 = nbh0Var;
        fetVar.X();
        rah0Var2 = rah0Var;
        z2 = z;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            final mm40 mm40Var3 = mm40Var2;
            final nbh0 nbh0Var3 = nbh0Var2;
            function2 = new Function2() { // from class: a.pbh0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    byte b3 = b2;
                    int i5 = i2;
                    switch (b3) {
                        case 0:
                            ((Integer) obj4).getClass();
                            qxw.n(mm40Var3, i, nbh0Var3, rah0Var2, z2, ugdVar, ugdVar2, (fet) obj3, x8x.L(i5 | 1));
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            qxw.n(mm40Var3, i, nbh0Var3, rah0Var2, z2, ugdVar, ugdVar2, (fet) obj3, x8x.L(i5 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void o(fet fetVar, mm40 mm40Var) {
        mu90 mu90Var = mu90.h;
        int iHashCode = Long.hashCode(fetVar.T);
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
        bh90 bh90VarM = fetVar.m();
        mkd.c0.getClass();
        fetVar.i0();
        if (fetVar.S) {
            fetVar.l(e7z.u1);
        } else {
            fetVar.r0();
        }
        jpm0.o(fetVar, mu90Var, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        fetVar.r(true);
    }

    public static final void p(mm40 mm40Var, j83 j83Var, pz40 pz40Var, fet fetVar, int i) {
        mm40 mm40Var2;
        long jM121getTransparent0d7_KjU;
        fetVar.g0(-1596408367);
        int i2 = i | 6 | (fetVar.g(j83Var) ? 32 : 16) | (fetVar.g(pz40Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar.e0(-845108234);
                jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
            } else {
                fetVar.e0(-845107108);
                jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
            }
            fetVar.r(false);
            l7m0 l7m0VarB = m5k0.b(jM121getTransparent0d7_KjU, null, fetVar, 0, 14);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            ydx.c(0, fetVar, s5x0.N(o7k0.s(mm40Var2, 14.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11), l7m0VarB);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-368861907, new edk0(j83Var, (byte) 10), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var2, j83Var, pz40Var, i, (byte) 17);
        }
    }

    public static final void q(mm40 mm40Var, boolean z, xdr xdrVar, xdr xdrVar2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        ugd ugdVar4;
        ugd ugdVar5;
        xdr xdrVar3;
        boolean z2;
        boolean z3;
        int i2;
        Object xtl0Var;
        sw3 sw3Var;
        Object obj;
        boolean z4;
        pz40 pz40Var;
        float f;
        float f2;
        mw3 mw3Var;
        shd shdVar;
        Integer num;
        boolean z5;
        xdr xdrVar4 = xdrVar2;
        mw3 mw3Var2 = uc9.c;
        fetVar.g0(-717286037);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | 16 | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(xdrVar4) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                z3 = fetVar.k(bmd.n) == k6z.b;
                i2 = i3 & (-113);
            } else {
                fetVar.X();
                i2 = i3 & (-113);
                z3 = z;
            }
            fetVar.s();
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(2.0f, fetVar);
            }
            float f3 = ((ycl) objP).f42389a;
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                zcl zclVar2 = qmk.f28987a;
                objP2 = twn.j(8.0f, fetVar);
            }
            float f4 = ((ycl) objP2).f42389a;
            Object objP3 = fetVar.P();
            if (objP3 == obj2) {
                zcl zclVar3 = qmk.f28987a;
                objP3 = twn.j(14.0f, fetVar);
            }
            float f5 = ((ycl) objP3).f42389a;
            Object objP4 = fetVar.P();
            if (objP4 == obj2) {
                zcl zclVar4 = qmk.f28987a;
                objP4 = twn.j(32.0f, fetVar);
            }
            float f6 = ((ycl) objP4).f42389a;
            Object objP5 = fetVar.P();
            if (objP5 == obj2) {
                objP5 = gqw0.n;
                fetVar.o0(objP5);
            }
            xx7 xx7Var = (xx7) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj2) {
                fetVar.o0(mw3Var2);
                objP6 = mw3Var2;
            }
            sw3 sw3Var2 = (sw3) objP6;
            long separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
            pz40 pz40VarZ = v3c.Z(null, new Object[0], fetVar);
            zcl zclVar5 = qmk.f28987a;
            pz40 pz40VarZ2 = v3c.Z(new ycl(90.0f), new Object[0], fetVar);
            Object[] objArr = new Object[0];
            boolean zG = ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | fetVar.g(pz40VarZ) | fetVar.h(z3) | fetVar.f(separator60);
            Object objP7 = fetVar.P();
            if (zG || objP7 == obj2) {
                sw3Var = sw3Var2;
                obj = obj2;
                z4 = z3;
                pz40Var = pz40VarZ;
                f = f6;
                xdrVar4 = xdrVar2;
                xtl0Var = new xtl0(xdrVar, xdrVar4, pz40Var, f, z4, separator60, (byte) 1);
                fetVar.o0(xtl0Var);
            } else {
                sw3Var = sw3Var2;
                xdrVar4 = xdrVar2;
                xtl0Var = objP7;
                z4 = z3;
                pz40Var = pz40VarZ;
                obj = obj2;
                f = f6;
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) xtl0Var, fetVar);
            boolean zG2 = fetVar.g(pz40Var) | fetVar.g(r22);
            Object objP8 = fetVar.P();
            if (zG2 || objP8 == obj) {
                objP8 = new wtl0(f5, pz40Var, pz40VarZ2, (byte) 3);
                fetVar.o0(objP8);
            }
            tj30 tj30Var = (tj30) objP8;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z6 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z6) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar, tj30Var, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar4 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar4);
            jpm0.n(fetVar);
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar5);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(s5x0.N(mrv.k0(jm40Var, "INNING_CONTENT_ID"), 0.0f, 22.0f, f4, 0.0f, 9), f5);
            z2 = z4;
            x5d x5dVarA = w5d.a(new qw3(5.0f, true, new jf4((byte) 14)), r28, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar2);
            jpm0.o(fetVar, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar, shdVar4, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar5);
            y5d y5dVar = y5d.f42040a;
            ugdVar.F(y5dVar, fetVar, 54);
            fetVar.r(true);
            if (xdrVar4 == null) {
                fetVar.e0(1601845998);
                z5 = false;
                fetVar.r(false);
                shdVar = shdVar4;
                f2 = f3;
                num = 6;
                mw3Var = mw3Var2;
            } else {
                fetVar.e0(1601845999);
                f2 = r20;
                mm40 mm40VarS2 = o7k0.s(s5x0.N(mrv.k0(jm40Var, "POINTS_CONTENT_ID"), 0.0f, 0.0f, f2, 0.0f, 11), f);
                x5d x5dVarA2 = w5d.a(mw3Var2, r28, fetVar, 48);
                mw3Var = mw3Var2;
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarS2);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar2);
                jpm0.o(fetVar, bh90VarM3, shdVar3);
                shdVar = shdVar4;
                vqd.u(iHashCode3, fetVar, shdVar, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar5);
                num = r14;
                xdrVar4.F(y5dVar, fetVar, num);
                fetVar.r(true);
                z5 = false;
                fetVar.r(false);
            }
            if (xdrVar == null) {
                fetVar.e0(1602252656);
                fetVar.r(z5);
                xdrVar3 = xdrVar;
            } else {
                fetVar.e0(1602252657);
                mm40 mm40VarS3 = o7k0.s(s5x0.N(mrv.k0(jm40Var, "GAME_CONTENT_ID"), 0.0f, 0.0f, f2, 0.0f, 11), f);
                x5d x5dVarA3 = w5d.a(mw3Var, r28, fetVar, 48);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarS3);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA3, shdVar2);
                jpm0.o(fetVar, bh90VarM4, shdVar3);
                vqd.u(iHashCode4, fetVar, shdVar, fetVar);
                jpm0.o(fetVar, mm40VarC3, shdVar5);
                xdrVar3 = xdrVar;
                xdrVar3.F(y5dVar, fetVar, num);
                fetVar.r(true);
                fetVar.r(false);
            }
            ugdVar4 = ugdVar2;
            ugdVar4.F(s5x0.N(mrv.k0(jm40Var, "PERIOD_CONTENT_ID"), 0.0f, 0.0f, 8.0f, 0.0f, 11), fetVar, 48);
            mm40 mm40Var2 = (mm40) l7m0VarY.getValue();
            x5d x5dVarA4 = w5d.a(sw3Var, xx7Var, fetVar, 54);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40Var2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA4, shdVar2);
            jpm0.o(fetVar, bh90VarM5, shdVar3);
            vqd.u(iHashCode5, fetVar, shdVar, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar5);
            ugdVar5 = ugdVar3;
            ugdVar5.F(y5dVar, fetVar, 54);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            ugdVar4 = ugdVar2;
            ugdVar5 = ugdVar3;
            xdrVar3 = xdrVar;
            fetVar.X();
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aul0(mm40Var, z2, xdrVar3, xdrVar4, ugdVar, ugdVar4, ugdVar5, i, (byte) 1);
        }
    }

    public static final u4i0 r(cgx0 cgx0Var, qq8 qq8Var) {
        fef fefVarQ = cgx0Var.q();
        hu5 hu5Var = (hu5) cgx0Var.d;
        boolean z = fefVarQ == fef.f9404a;
        return new u4i0(s(hu5Var, z, true, qq8Var), s(hu5Var, z, false, qq8Var), z);
    }

    public static final t4i0 s(hu5 hu5Var, boolean z, boolean z2, qq8 qq8Var) {
        long j;
        long j2 = qq8Var.j(hu5Var, z2 ? hu5Var.b : hu5Var.c);
        if (z ^ z2) {
            int i = o9q0.c;
            j = j2 >> 32;
        } else {
            int i2 = o9q0.c;
            j = 4294967295L & j2;
        }
        return hu5Var.c((int) j);
    }

    public static final lf50 t(lf50 lf50Var) {
        re50 re50Var = lf50Var.b;
        List list = lf50Var.f19938a;
        if (re50Var != null) {
            return !re50Var.c.isEmpty() ? lf50.a(lf50Var, null, re50.d(re50Var, null, CollectionsKt.P(1, re50Var.c), 3), null, 5) : z(lf50Var);
        }
        ve50 ve50Var = (ve50) CollectionsKt.f0(list);
        if (ve50Var == null) {
            return lf50Var;
        }
        if (ve50Var instanceof ue50) {
            return lf50.a(lf50Var, CollectionsKt.P(1, list), null, null, 6);
        }
        if (!(ve50Var instanceof se50)) {
            return lf50Var;
        }
        Object objF0 = CollectionsKt.f0(list);
        if (!(objF0 instanceof se50)) {
            objF0 = null;
        }
        se50 se50Var = (se50) objF0;
        if (se50Var == null) {
            return lf50Var;
        }
        List list2 = se50Var.b;
        se50 se50VarD = !list2.isEmpty() ? se50.d(se50Var, null, CollectionsKt.P(1, list2), 1) : null;
        return se50VarD != null ? lf50.a(lf50Var, CollectionsKt.r0(CollectionsKt.P(1, list), se50VarD), null, null, 6) : lf50.a(lf50Var, CollectionsKt.P(1, list), null, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [a.se50] */
    /* JADX WARN: Type inference failed for: r8v11, types: [a.se50] */
    /* JADX WARN: Type inference failed for: r8v12, types: [a.se50] */
    /* JADX WARN: Type inference failed for: r8v5, types: [a.ve50] */
    /* JADX WARN: Type inference failed for: r8v7, types: [a.re50] */
    /* JADX WARN: Type inference failed for: r8v8, types: [a.re50] */
    /* JADX WARN: Type inference failed for: r8v9, types: [a.re50] */
    public static final lf50 u(lf50 lf50Var, m7h0 m7h0Var) {
        int iNextIndex;
        lf50 lf50VarA;
        int iNextIndex2;
        List list = lf50Var.f19938a;
        if (m7h0Var != null) {
            re50 re50Var = lf50Var.b;
            int iNextIndex3 = -1;
            if (re50Var != null) {
                List list2 = re50Var.c;
                ArrayList arrayList = (ArrayList) re50Var.b();
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.d(((wul0) it.next()).a().getF45455a(), m7h0Var.getF45455a())) {
                                if (!Intrinsics.d(re50Var.b.a().getF45455a(), m7h0Var.getF45455a())) {
                                    ListIterator listIterator = list2.listIterator(list2.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            iNextIndex = -1;
                                            break;
                                        }
                                        if (Intrinsics.d(((wul0) listIterator.previous()).a().getF45455a(), m7h0Var.getF45455a())) {
                                            iNextIndex = listIterator.nextIndex();
                                            break;
                                        }
                                    }
                                    if (iNextIndex >= 0) {
                                        lf50VarA = lf50.a(lf50Var, null, re50.d(re50Var, null, list2.subList(0, iNextIndex + 1), 3), null, 5);
                                        break;
                                    }
                                } else {
                                    lf50VarA = lf50.a(lf50Var, null, re50.d(re50Var, null, iun.f15405a, 3), null, 5);
                                    break;
                                }
                            }
                        }
                        lf50VarA = null;
                        break;
                    }
                }
                lf50VarA = null;
                break;
            }
            lf50VarA = null;
            break;
            if (lf50VarA != null) {
                return lf50VarA;
            }
            ListIterator listIterator2 = list.listIterator(list.size());
            loop0: while (true) {
                if (!listIterator2.hasPrevious()) {
                    iNextIndex2 = -1;
                    break;
                }
                List listB = ((ve50) listIterator2.previous()).b();
                if (listB == null || !listB.isEmpty()) {
                    Iterator it2 = listB.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.d(((wul0) it2.next()).a().getF45455a(), m7h0Var.getF45455a())) {
                            iNextIndex2 = listIterator2.nextIndex();
                            break loop0;
                        }
                    }
                }
            }
            if (iNextIndex2 >= 0) {
                Object objD = (ve50) list.get(iNextIndex2);
                if (objD != 0) {
                    if (!(objD instanceof ue50)) {
                        if (objD instanceof se50) {
                            objD = (se50) objD;
                            wul0 wul0Var = objD.f32061a;
                            List list3 = objD.b;
                            if (Intrinsics.d(wul0Var.a().getF45455a(), m7h0Var.getF45455a())) {
                                objD = se50.d(objD, null, iun.f15405a, 1);
                            } else {
                                ListIterator listIterator3 = list3.listIterator(list3.size());
                                while (listIterator3.hasPrevious()) {
                                    if (Intrinsics.d(((wul0) listIterator3.previous()).a().getF45455a(), m7h0Var.getF45455a())) {
                                        iNextIndex3 = listIterator3.nextIndex();
                                        break;
                                    }
                                }
                                if (iNextIndex3 >= 0) {
                                    objD = se50.d(objD, null, list3.subList(0, iNextIndex3 + 1), 1);
                                }
                            }
                        } else if (objD instanceof re50) {
                            objD = (re50) objD;
                            wul0 wul0Var2 = objD.b;
                            List list4 = objD.c;
                            if (Intrinsics.d(wul0Var2.a().getF45455a(), m7h0Var.getF45455a())) {
                                objD = re50.d(objD, null, iun.f15405a, 3);
                            } else {
                                ListIterator listIterator4 = list4.listIterator(list4.size());
                                while (listIterator4.hasPrevious()) {
                                    if (Intrinsics.d(((wul0) listIterator4.previous()).a().getF45455a(), m7h0Var.getF45455a())) {
                                        iNextIndex3 = listIterator4.nextIndex();
                                        break;
                                    }
                                }
                                if (iNextIndex3 >= 0) {
                                    objD = re50.d(objD, null, list4.subList(0, iNextIndex3 + 1), 3);
                                }
                            }
                        }
                    }
                    return lf50.a(lf50Var, CollectionsKt.r0(list.subList(0, iNextIndex2), objD), null, null, 4);
                }
                t9f.b();
                return null;
            }
        } else {
            ve50 ve50Var = (ve50) CollectionsKt.firstOrNull(list);
            if (ve50Var != null) {
                return lf50.a(lf50Var, kotlin.collections.a.c(ve50Var), null, null, 4);
            }
        }
        return lf50Var;
    }

    public static final t4i0 v(t4i0 t4i0Var, hu5 hu5Var, int i) {
        return new t4i0(((a9q0) hu5Var.e).a(i), i, t4i0Var.c);
    }

    public static final wul0 w(lf50 lf50Var, m7h0 m7h0Var) {
        lf50Var.getClass();
        m7h0Var.getClass();
        bjk bjkVar = lf50Var.c.c;
        wul0 wul0VarA = A(lf50Var);
        return m7h0Var instanceof DialogScreen ? new uul0((DialogScreen) m7h0Var, bjkVar, wul0VarA != null ? wul0VarA.a() : null) : new vul0(m7h0Var);
    }

    public static final fse0 x(q16 q16Var) throws mki0, i660, u660 {
        q16Var.getClass();
        kuw kuwVar = q16Var.c;
        String str = q16Var.f27936a;
        gvq0 gvq0Var = (gvq0) kuwVar;
        int i = gvq0Var == null ? -1 : zre0.f44850a[gvq0Var.ordinal()];
        if (i == 1) {
            throw new u660();
        }
        if (i == 2) {
            throw new i660("");
        }
        if (i != 3) {
            return (fse0) q16Var.a();
        }
        if (str != null && str.length() == 0) {
            throw new u660();
        }
        if (str == null) {
            str = "";
        }
        throw new mki0(str);
    }

    public static final Fragment y(Fragment fragment) {
        Fragment fragmentY;
        fragment.getClass();
        Fragment fragment2 = fragment.y;
        if (fragment2 != null && (fragment2 instanceof ez60)) {
            return fragment2;
        }
        if (fragment2 != null && (fragmentY = y(fragment2)) != null) {
            return fragmentY;
        }
        jf4.n("SharedViewModelOwner parent has not been found");
        return null;
    }

    public static final lf50 z(lf50 lf50Var) {
        bjk bjkVar = cfx0.o;
        pu4 pu4Var = new pu4(bjkVar);
        iun iunVar = iun.f15405a;
        return lf50.a(lf50Var, null, null, new pe50(null, null, bjkVar, pu4Var, iunVar, iunVar), 1);
    }
}
