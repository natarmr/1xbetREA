package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.javax.sip.message.Response;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.crypto.KeyGenerator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xvw {
    public static final HashMap B(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            gst gstVar = w1w.f38420a;
            String str = (String) entry.getKey();
            gstVar.getClass();
            w1w w1wVarD = gst.d(str);
            if (w1wVarD != null) {
                map2.put(w1wVarD, entry.getValue());
            }
        }
        return map2;
    }

    public static wvw C(fet fetVar) {
        t4d t4dVar = (t4d) fetVar.k(v4d.f36771a);
        wvw wvwVar = t4dVar.Z;
        if (wvwVar != null) {
            return wvwVar;
        }
        wvw wvwVar2 = new wvw(v4d.c(t4dVar, u0q.f34866a), v4d.c(t4dVar, u0q.f), y3d.c(u0q.c, v4d.c(t4dVar, u0q.b)), y3d.c(u0q.e, v4d.c(t4dVar, u0q.d)));
        t4dVar.Z = wvwVar2;
        return wvwVar2;
    }

    public static qb90 D(Context context, String str, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        return new qb90(context, str, new nr00(bArr));
    }

    public static final String E(d0t d0tVar) {
        d0tVar.getClass();
        pfs pfsVar = d0tVar.y;
        int length = pfsVar.f26920a.length();
        String str = d0tVar.o;
        if (length <= 0) {
            return str;
        }
        boolean zEquals = String.valueOf(ttm0.I(str.length() - 1, str)).equals(Separators.DOT);
        String str2 = pfsVar.f26920a;
        return zEquals ? kng0.l(str, Separators.SP, str2) : kng0.l(str, ". ", str2);
    }

    public static final long F(pi9 pi9Var, float f) {
        zcl zclVar = qmk.f28987a;
        if (ycl.b(f, 0.0f)) {
            return 0L;
        }
        float density = pi9Var.getDensity() * f;
        return (((long) Float.floatToRawIntBits(pi9Var.getDensity() * f)) & 4294967295L) | (Float.floatToRawIntBits(density) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object G(ire0 ire0Var, Member member) throws c44 {
        try {
            rdk.n.getClass();
            Object obj = rdk.p;
            if (obj == null || obj == null) {
                List parameters = ire0Var.getParameters();
                if (parameters == null || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (((hre0) it.next()).n() != aiy.c);
                }
                throw new RuntimeException('\'' + ire0Var + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objP = fre0.W(ire0Var) ? fre0.P(ire0Var) : null;
            rdk.n.getClass();
            if (objP == rdk.p) {
                objP = null;
            }
            fre0.W(ire0Var);
            AccessibleObject accessibleObject = member != 0 ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(m2x.w(ire0Var));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objP);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objP == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    cls.getClass();
                    objP = xtt0.f(cls);
                }
                return method.invoke(null, objP);
            }
            if (length == 2) {
                Method method2 = (Method) member;
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                cls2.getClass();
                return method2.invoke(null, objP, xtt0.f(cls2));
            }
            throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
        } catch (IllegalAccessException e) {
            throw new c44("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e, (byte) 7);
        }
    }

    public static final String H(h6t h6tVar) {
        String str = h6tVar.l;
        String str2 = h6tVar.m;
        if (str == null || str.length() == 0) {
            return str2 == null ? "" : str2;
        }
        return (str2 == null || str2.length() == 0) ? str : w6x.q(str, Separators.RETURN, str2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003f A[FALL_THROUGH, RETURN] */
    public static final int I(k9h0 k9h0Var) {
        int iOrdinal = k9h0Var.ordinal();
        if (iOrdinal != 6) {
            if (iOrdinal != 46) {
                if (iOrdinal != 31 && iOrdinal != 32) {
                    if (iOrdinal != 63 && iOrdinal != 64) {
                        switch (iOrdinal) {
                            case 8:
                            case 10:
                                return 0;
                            case 9:
                                break;
                            case 11:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                break;
                            case 12:
                            case 14:
                                return rsr0.e0(134217728);
                            case 13:
                                return rsr0.e0(0);
                            default:
                                switch (iOrdinal) {
                                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                        break;
                                    default:
                                        switch (iOrdinal) {
                                            default:
                                                switch (iOrdinal) {
                                                    default:
                                                        switch (iOrdinal) {
                                                            case 66:
                                                            case 67:
                                                            case 68:
                                                            case 69:
                                                                break;
                                                            default:
                                                                return rsr0.e0(1073741824);
                                                        }
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                        return 1073741824;
                                                }
                                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                                return 1073741824;
                                        }
                                        break;
                                }
                                break;
                        }
                    }
                }
            }
            return 1073741824;
        }
        return rsr0.e0(1073741824);
    }

    public static final String J(String str) {
        return StringsKt.W(str) ? "" : Separators.RETURN.concat(str);
    }

    public static final int K(int i) {
        if (i == 1) {
            return R.drawable.ic_social_circle_vk;
        }
        if (i == 5) {
            return R.drawable.ic_social_circle_ok;
        }
        if (i == 7) {
            return R.drawable.ic_social_circle_yandex;
        }
        if (i == 9) {
            return R.drawable.ic_social_circle_mail;
        }
        if (i == 11) {
            return R.drawable.ic_social_circle_google;
        }
        if (i == 13) {
            return R.drawable.ic_social_circle_x;
        }
        if (i == 17) {
            return R.drawable.ic_social_circle_telegram;
        }
        if (i == 19) {
            return R.drawable.ic_social_circle_apple;
        }
        if (i == 26) {
            return R.drawable.ic_social_circle_itsme;
        }
        if (i != 31) {
            return -1;
        }
        return R.drawable.ic_social_circle_discord;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    public static final Bundle L(k9h0 k9h0Var, Map map) {
        Long lT0;
        Long lT1;
        Long lT2;
        Long lT3;
        Long lT4;
        Long lT5;
        Long lT6;
        Long lT7;
        Long lT8;
        Long lT9;
        Long lT10;
        Long lT11;
        Long lT12;
        Long lT13;
        Long lT14;
        Long lT15;
        Long lT16;
        Long lT17;
        Long lT18;
        Long lT19;
        Long lT20;
        Integer intOrNull;
        Long lT21;
        Long lT22;
        Long lT23;
        Long lT24;
        Long lT25;
        Long lT26;
        Long lT27;
        Long lT28;
        Long lT29;
        Long lT30;
        Long lT31;
        Long lT32;
        Long lT33;
        Long lT34;
        Long lT35;
        Integer intOrNull2;
        map.getClass();
        Bundle bundle = new Bundle();
        String str = (String) map.get("messageType");
        bundle.putInt("messageType", (str == null || (intOrNull2 = StringsKt.toIntOrNull(str)) == null) ? -1 : intOrNull2.intValue());
        int iOrdinal = k9h0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 6) {
                if (iOrdinal == 46) {
                    String str2 = (String) map.get("CIO-Delivery-Token");
                    if (str2 == null) {
                        str2 = "";
                    }
                    bundle.putString("CIO-Delivery-Token", str2);
                    String str3 = (String) map.get("CIO-Delivery-ID");
                    bundle.putString("CIO-Delivery-ID", str3 != null ? str3 : "");
                    u(bundle, map);
                    return bundle;
                }
                switch (iOrdinal) {
                    case 8:
                    case 10:
                        u(bundle, map);
                        break;
                    case 9:
                        String str4 = (String) map.get("link");
                        bundle.putString("link_start_url", str4 != null ? str4 : "");
                        bundle.putBoolean("link_start_key", true);
                        u(bundle, map);
                        break;
                    case 11:
                        String str5 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "betId");
                        bundle.putLong("PARAM_ID", (str5 == null || (lT4 = StringsKt.t0(str5)) == null) ? 0L : lT4.longValue());
                        String str6 = (String) map.get("currencyAccId");
                        bundle.putLong("PARAM_TYPE", (str6 == null || (lT3 = StringsKt.t0(str6)) == null) ? 0L : lT3.longValue());
                        u(bundle, map);
                        break;
                    default:
                        int iIntValue = 0;
                        switch (iOrdinal) {
                            case 13:
                                String str7 = (String) map.get("taskId");
                                bundle.putString("mass_mailing_key", str7 != null ? str7 : "");
                                u(bundle, map);
                                break;
                            case 14:
                                bundle.putBoolean("SHOW_SUPPORT_CHAT", true);
                                u(bundle, map);
                                break;
                            case 15:
                                break;
                            case 16:
                                bundle.putString("OPEN_SCREEN", k9h0Var.name());
                                u(bundle, map);
                                break;
                            case 17:
                                String str8 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "sportId");
                                bundle.putLong("SPORT_ID", (str8 == null || (lT6 = StringsKt.t0(str8)) == null) ? 0L : lT6.longValue());
                                String str9 = (String) map.get("subSportId");
                                bundle.putLong("subSportId", (str9 == null || (lT5 = StringsKt.t0(str9)) == null) ? 0L : lT5.longValue());
                                u(bundle, map);
                                break;
                            case 18:
                                String str10 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "sportId");
                                bundle.putLong("SPORT_ID", (str10 == null || (lT9 = StringsKt.t0(str10)) == null) ? 0L : lT9.longValue());
                                String str11 = (String) map.get("subSportId");
                                bundle.putLong("subSportId", (str11 == null || (lT8 = StringsKt.t0(str11)) == null) ? 0L : lT8.longValue());
                                String str12 = (String) map.get("lineChampId");
                                bundle.putLong("CHAMP_ID", (str12 == null || (lT7 = StringsKt.t0(str12)) == null) ? 0L : lT7.longValue());
                                u(bundle, map);
                                break;
                            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                bundle.putBoolean("is_live", false);
                                String str13 = (String) map.get("lineGameId");
                                bundle.putLong("selected_game_id", (str13 == null || (lT12 = StringsKt.t0(str13)) == null) ? 0L : lT12.longValue());
                                String str14 = (String) map.get("sportId");
                                bundle.putLong("sportId", (str14 == null || (lT11 = StringsKt.t0(str14)) == null) ? 0L : lT11.longValue());
                                String str15 = (String) map.get("subSportId");
                                bundle.putLong("subSportId", (str15 == null || (lT10 = StringsKt.t0(str15)) == null) ? 0L : lT10.longValue());
                                u(bundle, map);
                                break;
                            case 20:
                                bundle.putString("OPEN_SCREEN", k9h0Var.name());
                                u(bundle, map);
                                break;
                            case 21:
                                String str16 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "sportId");
                                bundle.putLong("SPORT_ID", (str16 == null || (lT14 = StringsKt.t0(str16)) == null) ? 0L : lT14.longValue());
                                String str17 = (String) map.get("subSportId");
                                bundle.putLong("subSportId", (str17 == null || (lT13 = StringsKt.t0(str17)) == null) ? 0L : lT13.longValue());
                                u(bundle, map);
                                break;
                            case 22:
                                String str18 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "sportId");
                                bundle.putLong("SPORT_ID", (str18 == null || (lT17 = StringsKt.t0(str18)) == null) ? 0L : lT17.longValue());
                                String str19 = (String) map.get("subSportId");
                                bundle.putLong("subSportId", (str19 == null || (lT16 = StringsKt.t0(str19)) == null) ? 0L : lT16.longValue());
                                String str20 = (String) map.get("liveChampId");
                                bundle.putLong("CHAMP_ID", (str20 == null || (lT15 = StringsKt.t0(str20)) == null) ? 0L : lT15.longValue());
                                u(bundle, map);
                                break;
                            case 23:
                                bundle.putBoolean("is_live", true);
                                String str21 = (String) map.get("liveGameId");
                                bundle.putLong("selected_game_id", (str21 == null || (lT20 = StringsKt.t0(str21)) == null) ? 0L : lT20.longValue());
                                String str22 = (String) map.get("sportId");
                                bundle.putLong("sportId", (str22 == null || (lT19 = StringsKt.t0(str22)) == null) ? 0L : lT19.longValue());
                                String str23 = (String) map.get("subSportId");
                                bundle.putLong("subSportId", (str23 == null || (lT18 = StringsKt.t0(str23)) == null) ? 0L : lT18.longValue());
                                u(bundle, map);
                                break;
                            default:
                                switch (iOrdinal) {
                                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                        bundle.putString("OPEN_SCREEN", k9h0Var.name());
                                        u(bundle, map);
                                        break;
                                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                        String str24 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "actionId");
                                        if (str24 != null && (intOrNull = StringsKt.toIntOrNull(str24)) != null) {
                                            iIntValue = intOrNull.intValue();
                                        }
                                        bundle.putInt("PARAM_ID", iIntValue);
                                        u(bundle, map);
                                        break;
                                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                        bundle.putString("OPEN_SCREEN", k9h0Var.name());
                                        u(bundle, map);
                                        break;
                                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                        String str25 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "redirectUrl");
                                        bundle.putString("PARAM_URL", str25 != null ? str25 : "");
                                        u(bundle, map);
                                        break;
                                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                        String str26 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "redirectUrl");
                                        if (str26 == null) {
                                            str26 = "";
                                        }
                                        bundle.putString("PARAM_URL", str26);
                                        String str27 = (String) map.get("deeplink");
                                        bundle.putString("DEEPLINK_URL", str27 != null ? str27 : "");
                                        u(bundle, map);
                                        break;
                                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                        break;
                                    case 32:
                                        String str28 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "approvalGuid");
                                        bundle.putString("PARAM_ID", str28 != null ? str28 : "");
                                        u(bundle, map);
                                        break;
                                    default:
                                        switch (iOrdinal) {
                                            case 35:
                                            case 36:
                                                break;
                                            case 37:
                                                String str29 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "redirectUrl");
                                                bundle.putString("PARAM_URL", str29 != null ? str29 : "");
                                                u(bundle, map);
                                                break;
                                            default:
                                                switch (iOrdinal) {
                                                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                                    case 51:
                                                    case 52:
                                                    case 55:
                                                        bundle.putString("OPEN_SCREEN", k9h0Var.name());
                                                        u(bundle, map);
                                                        break;
                                                    case 53:
                                                        String str30 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "casinoTournamentId");
                                                        bundle.putLong("casinoTournamentId", (str30 == null || (lT21 = StringsKt.t0(str30)) == null) ? 0L : lT21.longValue());
                                                        u(bundle, map);
                                                        break;
                                                    case 54:
                                                        bundle.putString("OPEN_SCREEN", k9h0Var.name());
                                                        bundle.putBoolean("OPEN_NATIVE_TOURNAMENT", true);
                                                        String str31 = (String) map.get("casinoNativeTournamentId");
                                                        bundle.putLong("casinoNativeTournamentId", (str31 == null || (lT22 = StringsKt.t0(str31)) == null) ? 0L : lT22.longValue());
                                                        u(bundle, map);
                                                        break;
                                                    default:
                                                        switch (iOrdinal) {
                                                            case 57:
                                                            case 58:
                                                            case 67:
                                                            case 68:
                                                            case 69:
                                                            case 70:
                                                                bundle.putString("OPEN_SCREEN", k9h0Var.name());
                                                                u(bundle, map);
                                                                break;
                                                            case 59:
                                                                String str32 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "casinoCategoryId");
                                                                bundle.putLong("PARAM_ID", (str32 == null || (lT23 = StringsKt.t0(str32)) == null) ? 0L : lT23.longValue());
                                                                bundle.putString("PARAM_TYPE", "subcategory");
                                                                u(bundle, map);
                                                                break;
                                                            case 60:
                                                                String str33 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "casinoCategoryId");
                                                                bundle.putLong("PARTITION_ID", (str33 == null || (lT25 = StringsKt.t0(str33)) == null) ? 0L : lT25.longValue());
                                                                bundle.putString("PARAM_TYPE", "provider");
                                                                String str34 = (String) map.get("casinoProviderId");
                                                                bundle.putLong("PARAM_ID", (str34 == null || (lT24 = StringsKt.t0(str34)) == null) ? 0L : lT24.longValue());
                                                                u(bundle, map);
                                                                break;
                                                            case 61:
                                                                String str35 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "casinoCategoryId");
                                                                bundle.putLong("PARTITION_ID", (str35 == null || (lT27 = StringsKt.t0(str35)) == null) ? 0L : lT27.longValue());
                                                                bundle.putString("PARAM_TYPE", "brand");
                                                                String str36 = (String) map.get("casinoBrandId");
                                                                bundle.putLong("PARAM_ID", (str36 == null || (lT26 = StringsKt.t0(str36)) == null) ? 0L : lT26.longValue());
                                                                u(bundle, map);
                                                                break;
                                                            case 62:
                                                                bundle.putString("OPEN_SCREEN", k9h0Var.name());
                                                                bundle.putString("PARAM_TYPE", "casinoBrandId");
                                                                String str37 = (String) map.get("brandId");
                                                                bundle.putLong("PARAM_ID", (str37 == null || (lT28 = StringsKt.t0(str37)) == null) ? 0L : lT28.longValue());
                                                                u(bundle, map);
                                                                break;
                                                            case 63:
                                                                String str38 = (String) map.get("casinoCategoryId");
                                                                long jLongValue = (str38 == null || (lT29 = StringsKt.t0(str38)) == null) ? 0L : lT29.longValue();
                                                                String str39 = (String) map.get("filterId");
                                                                List listSplit$default = StringsKt__StringsKt.split$default(str39 != null ? str39 : "", new String[]{Separators.COMMA}, false, 0, 6, null);
                                                                ArrayList arrayList = new ArrayList();
                                                                Iterator it = listSplit$default.iterator();
                                                                while (it.hasNext()) {
                                                                    Long lT36 = StringsKt.t0(StringsKt.u0((String) it.next()).toString());
                                                                    if (lT36 != null) {
                                                                        arrayList.add(lT36);
                                                                    }
                                                                }
                                                                long[] jArrM0 = CollectionsKt.M0(arrayList);
                                                                bundle.putString("OPEN_SCREEN", k9h0Var.name());
                                                                bundle.putLong("PARAM_ID", jLongValue);
                                                                bundle.putString("PARAM_TYPE", "subcategory");
                                                                bundle.putLongArray("FILTER_IDS", jArrM0);
                                                                u(bundle, map);
                                                                break;
                                                            case 64:
                                                                String str40 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "casinoGameId");
                                                                bundle.putLong("PARAM_ID", (str40 == null || (lT30 = StringsKt.t0(str40)) == null) ? 0L : lT30.longValue());
                                                                bundle.putString("PARAM_TYPE", "game");
                                                                u(bundle, map);
                                                                break;
                                                            case 65:
                                                                String str41 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "casinoGameId");
                                                                bundle.putLong("PARAM_ID", (str41 == null || (lT31 = StringsKt.t0(str41)) == null) ? 0L : lT31.longValue());
                                                                bundle.putBoolean("needTransfer", Intrinsics.d(map.get("casinoNeedTransfer"), "True"));
                                                                u(bundle, map);
                                                                break;
                                                            case 66:
                                                                bundle.putString("OPEN_SCREEN", k9h0Var.name());
                                                                bundle.putString("PARAM_TYPE", "vipcashback");
                                                                u(bundle, map);
                                                                break;
                                                            default:
                                                                switch (iOrdinal) {
                                                                    case 76:
                                                                    case 78:
                                                                    case 79:
                                                                    case 80:
                                                                        break;
                                                                    case 77:
                                                                        String str42 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "xGamesGameId");
                                                                        bundle.putLong("PARAM_ID", (str42 == null || (lT32 = StringsKt.t0(str42)) == null) ? 0L : lT32.longValue());
                                                                        u(bundle, map);
                                                                        break;
                                                                    default:
                                                                        switch (iOrdinal) {
                                                                            case 85:
                                                                                String str43 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "casinoVirtualCategoryId");
                                                                                bundle.putLong("PARAM_ID", (str43 == null || (lT33 = StringsKt.t0(str43)) == null) ? 0L : lT33.longValue());
                                                                                bundle.putString("PARAM_TYPE", "subcategory");
                                                                                u(bundle, map);
                                                                                break;
                                                                            case 86:
                                                                                String str44 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "casinoVirtualGameId");
                                                                                bundle.putLong("PARAM_ID", (str44 == null || (lT34 = StringsKt.t0(str44)) == null) ? 0L : lT34.longValue());
                                                                                bundle.putString("PARAM_TYPE", "game");
                                                                                u(bundle, map);
                                                                                break;
                                                                            case 87:
                                                                                String str45 = (String) kng0.f(k9h0Var, bundle, "OPEN_SCREEN", map, "casinoVirtualPromoId");
                                                                                bundle.putLong("PARAM_ID", (str45 == null || (lT35 = StringsKt.t0(str45)) == null) ? 0L : lT35.longValue());
                                                                                bundle.putString("PARAM_TYPE", "banner");
                                                                                u(bundle, map);
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                return bundle;
            }
            String str46 = (String) map.get("messageType");
            bundle.putBoolean("is_live", !(str46 != null ? str46 : "").equals("9"));
            String str47 = (String) map.get("GameId");
            bundle.putLong("selected_game_id", (str47 == null || (lT2 = StringsKt.t0(str47)) == null) ? 0L : lT2.longValue());
            String str48 = (String) map.get("sportId");
            bundle.putLong("sportId", (str48 == null || (lT1 = StringsKt.t0(str48)) == null) ? 0L : lT1.longValue());
            String str49 = (String) map.get("subSportId");
            bundle.putLong("subSportId", (str49 == null || (lT0 = StringsKt.t0(str49)) == null) ? 0L : lT0.longValue());
            u(bundle, map);
            return bundle;
        }
        bundle.putString("OPEN_SCREEN", k9h0Var.name());
        u(bundle, map);
        return bundle;
    }

    public static final String M(h6t h6tVar) {
        String value;
        String str = h6tVar.l;
        Long l = h6tVar.b;
        if (str != null && str.length() != 0) {
            if ((l != null && l.longValue() == 268) || ((l != null && l.longValue() == 243) || ((l != null && l.longValue() == 218) || ((l != null && l.longValue() == 234) || (l != null && l.longValue() == 297))))) {
                str = " VS ";
            }
            long jLongValue = l != null ? l.longValue() : 0L;
            if (jLongValue != 11 && jLongValue != 32 && jLongValue != 189 && jLongValue != 56 && jLongValue != 182 && jLongValue != 9) {
                if (jLongValue == 66) {
                    return kotlin.text.c.r(str, "-", Separators.COLON, false);
                }
                bh30 bh30VarB = new Regex("(\\d+\\s*[:-]\\s*\\d+\\/\\d+)|(\\d+\\/\\d+\\s*[:-]\\s*\\d+\\/\\d+)|(\\d+\\/\\d+\\s*[:-]\\s*\\d+)|(\\d+\\s*[:-]\\s*\\d+)").b(str);
                if (bh30VarB != null && (value = bh30VarB.getValue()) != null) {
                    return kotlin.text.c.r(value, Separators.COLON, " : ", false);
                }
            }
        }
        return " VS ";
    }

    public static final a2w N(String str, List list, List list2, boolean z, v1w v1wVar) {
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (v1wVar != v1w.c || list == null) {
            list = iun.f15405a;
        }
        List list3 = list;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new a2w(str2, list3, list2, z, v1wVar);
    }

    public static final ows0 O(String str, d280 d280Var) {
        return new ows0(str, 0, new u6n(d4d.SECONDARY60, w6n.b, d280Var));
    }

    public static final e0n P(d0t d0tVar) {
        long jQ0;
        if (!qzb.B0(d0tVar) && !kpb.j0(d0tVar)) {
            return null;
        }
        if (kpb.j0(d0tVar)) {
            jQ0 = TimeUnit.SECONDS.toMillis(d0tVar.s) - System.currentTimeMillis();
            if (jQ0 < 0) {
                jQ0 = 0;
            }
        } else {
            jQ0 = kpb.q0(d0tVar);
        }
        r7n r7nVar = r7n.f29985a;
        return new e0n(jQ0);
    }

    public static final long Q(long j) {
        if (j < 0) {
            wen.b.getClass();
            return wen.d;
        }
        wen.b.getClass();
        return wen.c;
    }

    public static final boolean R(ire0 ire0Var) {
        ire0Var.getClass();
        return ihy.f14802a.g(ire0Var.getSignature());
    }

    public static z680 S(qg9... qg9VarArr) {
        if (qg9VarArr.length == 0) {
            return new z680(new qg9[0], new int[]{0, -1});
        }
        ArrayList arrayListJ0 = tx3.j0(qg9VarArr);
        v3d.s(arrayListJ0);
        int size = arrayListJ0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int iC = 0; iC < size; iC = w6x.c(-1, iC, 1, arrayList)) {
        }
        int length = qg9VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.set(q3d.f(arrayListJ0, qg9VarArr[i]), Integer.valueOf(i2));
            i++;
            i2++;
        }
        if (((qg9) arrayListJ0.get(0)).e() <= 0) {
            jf4.o("the empty byte string is not a supported option");
            return null;
        }
        int i3 = 0;
        while (i3 < arrayListJ0.size()) {
            qg9 qg9Var = (qg9) arrayListJ0.get(i3);
            int i4 = i3 + 1;
            int i5 = i4;
            while (i5 < arrayListJ0.size()) {
                qg9 qg9Var2 = (qg9) arrayListJ0.get(i5);
                qg9Var2.getClass();
                qg9Var.getClass();
                if (!qg9Var2.o(0, qg9Var, qg9Var.e())) {
                    break;
                }
                if (qg9Var2.e() == qg9Var.e()) {
                    hny.v(qg9Var2, "duplicate option: ");
                    return null;
                }
                if (((Number) arrayList.get(i5)).intValue() > ((Number) arrayList.get(i3)).intValue()) {
                    arrayListJ0.remove(i5);
                    ((Number) arrayList.remove(i5)).intValue();
                } else {
                    i5++;
                }
            }
            i3 = i4;
        }
        f99 f99Var = new f99();
        z(0L, f99Var, 0, arrayListJ0, 0, arrayListJ0.size(), arrayList);
        int i6 = (int) (f99Var.b / 4);
        int[] iArr = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            iArr[i7] = f99Var.readInt();
        }
        return new z680((qg9[]) Arrays.copyOf(qg9VarArr, qg9VarArr.length), iArr);
    }

    public static final void V(ArrayList arrayList, List list) {
        Object objPrevious;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gw20 gw20Var = (gw20) it.next();
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (((sr20) objPrevious).b != gw20Var.b);
            sr20 sr20Var = (sr20) objPrevious;
            if (sr20Var != null) {
                arrayList.remove(sr20Var);
            }
        }
    }

    public static final long W(long j, long j2, bfn bfnVar) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return ibc.w0(j3, bfnVar);
        }
        bfn bfnVar2 = bfn.MILLISECONDS;
        if (bfnVar.compareTo(bfnVar2) >= 0) {
            return wen.n(Q(j3));
        }
        long jB = dfn.b(1L, bfnVar2, bfnVar);
        long j4 = (j / jB) - (j2 / jB);
        long j5 = (j % jB) - (j2 % jB);
        uen uenVar = wen.b;
        return wen.k(ibc.w0(j4, bfnVar2), ibc.w0(j5, bfnVar));
    }

    public static final long X(long j, long j2, bfn bfnVar) {
        bfnVar.getClass();
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? Q(j) : W(j, j2, bfnVar);
        }
        if (j != j2) {
            return wen.n(Q(j2));
        }
        wen.b.getClass();
        return 0L;
    }

    public static fay Y(b0t0 b0t0Var, boolean z, gaz gazVar, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            gazVar = null;
        }
        return new fay(b0t0Var, z3, z2, gazVar != null ? cui0.b(gazVar) : null, 34);
    }

    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: java.lang.Long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: java.lang.Long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r29v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v14 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final java.util.ArrayList Z(a.l6t r68) {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xvw.Z(a.l6t):java.util.ArrayList");
    }

    public static final void a(mm40 mm40Var, pz40 pz40Var, xcz xczVar, hh80 hh80Var, Function1 function1, Function1 function2, xdr xdrVar, fet fetVar, int i) {
        int i2;
        hh80 hh80Var2;
        Function1 function3;
        Function1 function4;
        function1.getClass();
        function2.getClass();
        xdrVar.getClass();
        fetVar.g0(1552572618);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            hh80Var2 = hh80Var;
            i2 |= fetVar.g(hh80Var2) ? 2048 : 1024;
        } else {
            hh80Var2 = hh80Var;
        }
        if ((i & 24576) == 0) {
            function3 = function1;
            i2 |= fetVar.i(function3) ? 16384 : 8192;
        } else {
            function3 = function1;
        }
        if ((196608 & i) == 0) {
            function4 = function2;
            i2 |= fetVar.i(function4) ? 131072 : 65536;
        } else {
            function4 = function2;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            pz40 pz40Var2 = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40Var, s6t0.b().f33626a.getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            bww.d(mm40VarQ, pz40Var, false, new lh80(8.0f, 8.0f, 8.0f, hh80Var2.a()), xczVar, u1c.M(1887470811, new hgx(xdrVar, (byte) 1), fetVar), u1c.M(706427886, new kgx(backgroundContent, function3, function4, (byte) 0), fetVar), unh0.c, fetVar, (i2 & 112) | 14352768 | ((i2 << 6) & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jgx(mm40Var, pz40Var, xczVar, hh80Var2, function1, function2, xdrVar, i, (byte) 1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x0173  */
    /* JADX WARN: Code duplicated, block: B:122:0x017e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0189  */
    /* JADX WARN: Code duplicated, block: B:129:0x0193  */
    /* JADX WARN: Code duplicated, block: B:130:0x0197  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x013f  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v4 int, still in use, count: 2, list:
  (r4v4 int) from 0x011e: SWITCH (r4v4 int)
 case 48: goto B:112:0x0163
 case 49: goto B:109:0x015c
 case 50: goto B:106:0x0155
 case 51: goto B:102:0x014a
 case 52: goto B:99:0x0143
 case 53: goto B:95:0x0136
 default: goto B:87:0x0121 A[RegionRef:SW:86] (LINE:287)
  (r4v4 int) from 0x0121: SWITCH (r4v4 int)
 case 2696181: goto B:92:0x012e
 case 2696182: goto B:89:0x0126
 default: goto B:129:0x0193 A[RegionRef:SW:87] (LINE:290)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v6 int, still in use, count: 4, list:
  (r4v6 int) from 0x00ab: IF  (r4v6 int) != (-1217677022 int)  -> B:42:0x00ad A[HIDDEN] (LINE:172)
  (r4v6 int) from 0x00b0: IF  (r4v6 int) != (-1028033110 int)  -> B:44:0x00b2 A[HIDDEN] (LINE:177)
  (r4v6 int) from 0x00b5: IF  (r4v6 int) != (-205861262 int)  -> B:46:0x00b7 A[HIDDEN] (LINE:182)
  (r4v6 int) from 0x00ba: SWITCH (r4v6 int)
 case 2696181: goto B:52:0x00c5
 case 2696182: goto B:49:0x00be
 default: goto B:82:0x010f A[RegionRef:SW:47] (LINE:187)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00b7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:86:0x011e. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    public static final oij0 a0(rij0 rij0Var, jch jchVar) {
        ?? arrayList;
        nij0 nij0Var;
        ?? r17;
        bih bihVar;
        Long l;
        Float fJ;
        Float fJ2;
        rij0Var.getClass();
        Integer num = rij0Var.f;
        int iIntValue = num != null ? num.intValue() : 0;
        mij0 mij0Var = iIntValue != 1 ? iIntValue != 2 ? mij0.c : mij0.f21849a : mij0.b;
        List list = rij0Var.f30545a;
        ?? arrayList2 = 0;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x1x.Q((ooa) it.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List list2 = rij0Var.b;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(x1x.Q((ooa) it2.next()));
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        ?? r7 = arrayList2;
        String str = rij0Var.c;
        if (str == null) {
            str = "";
        }
        int iOrdinal = mij0Var.ordinal();
        ?? r16 = arrayList;
        if (iOrdinal == 0) {
            ?? r18 = r7;
            switch (str) {
                case "Prematch":
                    nij0Var = nij0.f23591a;
                    r17 = r18;
                    break;
                case "DealerMove":
                    nij0Var = nij0.c;
                    r17 = r18;
                    break;
                case "PlayerMove":
                    nij0Var = nij0.b;
                    r17 = r18;
                    break;
                case "Draw":
                    nij0Var = nij0.e;
                    r17 = r18;
                    break;
                default:
                    switch (str) {
                        case 48:
                            if (!str.equals("0")) {
                                nij0Var = nij0.g;
                                r17 = r18;
                            } else {
                                nij0Var = nij0.f23591a;
                                r17 = r18;
                            }
                            break;
                        case 49:
                            if (!str.equals("1")) {
                                nij0Var = nij0.g;
                                r17 = r18;
                            } else {
                                nij0Var = nij0.b;
                                r17 = r18;
                            }
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            if (!str.equals("2")) {
                                nij0Var = nij0.g;
                                r17 = r18;
                            } else {
                                nij0Var = nij0.c;
                                r17 = r18;
                            }
                            break;
                        case 51:
                            if (!str.equals("3")) {
                                nij0Var = nij0.g;
                                r17 = r18;
                            } else {
                                nij0Var = nij0.d;
                                r17 = r18;
                            }
                            break;
                        case 52:
                            if (!str.equals("4")) {
                                nij0Var = nij0.g;
                                r17 = r18;
                            } else {
                                nij0Var = nij0.e;
                                r17 = r18;
                            }
                            break;
                        case 53:
                            if (!str.equals("5")) {
                                nij0Var = nij0.g;
                                r17 = r18;
                            } else {
                                nij0Var = nij0.f;
                                r17 = r18;
                            }
                            break;
                        default:
                            switch (str) {
                                case 2696181:
                                    if (!str.equals("Win1")) {
                                        nij0Var = nij0.g;
                                        r17 = r18;
                                    } else {
                                        nij0Var = nij0.d;
                                        r17 = r18;
                                    }
                                    break;
                                case 2696182:
                                    if (!str.equals("Win2")) {
                                        nij0Var = nij0.g;
                                        r17 = r18;
                                    } else {
                                        nij0Var = nij0.f;
                                        r17 = r18;
                                    }
                                    break;
                                default:
                                    nij0Var = nij0.g;
                                    r17 = r18;
                                    break;
                            }
                            break;
                    }
            }
        } else {
            ?? r19 = r7;
            if (iOrdinal != 1) {
                nij0Var = nij0.g;
                r17 = r19;
            } else {
                if (iHashCode != -1217677022) {
                    if (iHashCode != -1028033110) {
                        if (iHashCode != -205861262) {
                            switch (str) {
                                case "0":
                                    nij0Var = nij0.f23591a;
                                    r17 = r19;
                                    break;
                                case "1":
                                    nij0Var = nij0.b;
                                    r17 = r19;
                                    break;
                                case "2":
                                    nij0Var = nij0.c;
                                    r17 = r19;
                                    break;
                                case "3":
                                    nij0Var = nij0.d;
                                    r17 = r19;
                                    break;
                                case "4":
                                    nij0Var = nij0.f;
                                    r17 = r19;
                                    break;
                                default:
                                    switch (str) {
                                        case 2696181:
                                            if (!str.equals("Win1")) {
                                                nij0Var = nij0.g;
                                                r17 = r19;
                                            } else {
                                                nij0Var = nij0.d;
                                                r17 = r19;
                                            }
                                            break;
                                        case 2696182:
                                            if (!str.equals("Win2")) {
                                                nij0Var = nij0.g;
                                                r17 = r19;
                                            } else {
                                                nij0Var = nij0.f;
                                                r17 = r19;
                                            }
                                            break;
                                        default:
                                            nij0Var = nij0.g;
                                            r17 = r19;
                                            break;
                                    }
                            }
                        } else if (str.equals("PlayerMove")) {
                            nij0Var = nij0.b;
                            r17 = r19;
                        } else {
                            nij0Var = nij0.g;
                            r17 = r19;
                        }
                    } else if (str.equals("DealerMove")) {
                        nij0Var = nij0.c;
                        r17 = r19;
                    } else {
                        nij0Var = nij0.g;
                        r17 = r19;
                    }
                } else if (str.equals("Prematch")) {
                    nij0Var = nij0.f23591a;
                    r17 = r19;
                } else {
                    nij0Var = nij0.g;
                    r17 = r19;
                }
            }
        }
        nij0 nij0Var2 = nij0Var;
        String str2 = rij0Var.d;
        float fFloatValue = 0.0f;
        float fFloatValue2 = (str2 == null || (fJ2 = kotlin.text.b.j(str2)) == null) ? 0.0f : fJ2.floatValue();
        String str3 = rij0Var.e;
        if (str3 != null && (fJ = kotlin.text.b.j(str3)) != null) {
            fFloatValue = fJ.floatValue();
        }
        return new oij0(nij0Var2, r16, r17, fFloatValue2, fFloatValue, (jchVar == null || (bihVar = jchVar.j) == null || (l = bihVar.f2659a) == null) ? 0L : l.longValue(), mij0Var);
    }

    public static final void b(mm40 mm40Var, a4x a4xVar, Function0 function0, Function1 function1, fet fetVar, int i) {
        int i2;
        a4xVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1272565476);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 56.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            r(a4xVar.size(), (i2 >> 3) & 112, fetVar, function0);
            t(null, a4xVar, function0, function1, fetVar, i2 & 8176);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gwy(mm40Var, a4xVar, function0, function1, i, (byte) 0);
        }
    }

    public static final List b0(long j, long j2, List list) {
        String str;
        long j3;
        long j4;
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k6t k6tVar = (k6t) it.next();
            String str2 = k6tVar.f17787a;
            z1w z1wVar = null;
            if (str2 == null || (str = k6tVar.b) == null) {
                j3 = j;
                j4 = j2;
            } else {
                j3 = j;
                j4 = j2;
                z1wVar = new z1w(j3, j4, str2, str);
            }
            if (z1wVar != null) {
                arrayList.add(z1wVar);
            }
            j = j3;
            j2 = j4;
        }
        z1w z1wVar2 = (z1w) CollectionsKt.f0(arrayList);
        if (z1wVar2 != null) {
            z1wVar2.f = true;
        }
        return arrayList;
    }

    public static final void c(tfz tfzVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1918525868);
        int i2 = i | (fetVar2.g(tfzVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            String str = tfzVar.f33887a;
            zfn zfnVar = zaq0.b;
            v8q0.a(str, new x7z(1.0f, true), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, 0, 24960, 110584);
            String str2 = tfzVar.b;
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            y9q0 y9q0VarQ = g1t0.q();
            zcl zclVar = qmk.f28987a;
            v8q0.a(str2, o7k0.A(o7k0.u(jm40Var, 0.0f, 240.0f, 1), null, 3), textPrimary, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0VarQ, fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g2z(tfzVar, i);
        }
    }

    public static final c2w c0(h6t h6tVar) {
        String str;
        Long l = h6tVar.f12544a;
        Long l2 = h6tVar.o;
        Long l3 = h6tVar.b;
        Boolean bool = h6tVar.u;
        if (l != null && (str = h6tVar.c) != null && str.length() != 0 && l3 != null && l2 != null) {
            List listSplit$default = StringsKt__StringsKt.split$default(kotlin.text.c.r(M(h6tVar), Separators.SP, "", false), new String[]{Separators.COLON}, false, 0, 6, null);
            String str2 = (String) CollectionsKt.firstOrNull(listSplit$default);
            if (str2 != null) {
                String str3 = (String) CollectionsKt.f0(listSplit$default);
                if (str3 == null) {
                    jf4.k(null);
                    return null;
                }
                long jLongValue = l.longValue();
                String str4 = h6tVar.c;
                String strM = M(h6tVar);
                long jLongValue2 = l3.longValue();
                Integer num = h6tVar.v;
                int iIntValue = num != null ? num.intValue() : 0;
                String str5 = h6tVar.e;
                String str6 = str5 == null ? "" : str5;
                Long l4 = h6tVar.d;
                long jLongValue3 = l4 != null ? l4.longValue() : 0L;
                Map map = h6tVar.s;
                if (map == null) {
                    map = lun.f20680a;
                    map.getClass();
                }
                HashMap mapB = B(map);
                String strH = H(h6tVar);
                List list = h6tVar.n;
                if (list == null) {
                    list = iun.f15405a;
                }
                List list2 = list;
                long jLongValue4 = l2.longValue();
                Integer num2 = h6tVar.p;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                List listB0 = b0(l.longValue(), l3.longValue(), h6tVar.q);
                a2w a2wVarN = N(h6tVar.f, h6tVar.h, h6tVar.j, bool != null ? bool.booleanValue() : false, bool != null ? v1w.f36652a : v1w.c);
                a2w a2wVarN2 = N(h6tVar.g, h6tVar.i, h6tVar.k, bool != null ? bool.booleanValue() : false, bool != null ? v1w.b : v1w.c);
                Long l5 = h6tVar.r;
                long jLongValue5 = l5 != null ? l5.longValue() : 0L;
                String str7 = h6tVar.t;
                return new c2w(jLongValue, str4, strM, jLongValue2, iIntValue, str6, jLongValue3, jLongValue5, mapB, strH, list2, jLongValue4, iIntValue2, listB0, a2wVarN, a2wVarN2, str7 == null ? "" : str7, str2, str3);
            }
            jf4.k(null);
        }
        return null;
    }

    public static final void d(final int i, int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(475449424);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            final fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            boolean zG = fetVar.g(fqj0VarD0);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new Function1() { // from class: a.tz30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        hcz hczVar = (hcz) obj;
                        hczVar.getClass();
                        final byte b = i;
                        final fqj0 fqj0Var = fqj0VarD0;
                        hcz.g(hczVar, b, null, null, new ugd(-737755790, true, new ydr() { // from class: a.uz30
                            @Override // a.ydr
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj3).intValue();
                                fet fetVar2 = (fet) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((g9z) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= fetVar2.e(iIntValue) ? 32 : 16;
                                }
                                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    boolean z = iIntValue % 2 == 0;
                                    jm40 jm40Var = jm40.b;
                                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                    zcl zclVar = qmk.f28987a;
                                    mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
                                    long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
                                    zcl zclVar2 = iIntValue == 0 ? qmk.i : qmk.f28987a;
                                    zcl zclVar3 = iIntValue == 0 ? qmk.i : qmk.f28987a;
                                    int i4 = b - 1;
                                    mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent, new ugg0(zclVar2, zclVar3, iIntValue == i4 ? qmk.i : qmk.f28987a, iIntValue == i4 ? qmk.i : qmk.f28987a));
                                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                                    int iHashCode = Long.hashCode(fetVar2.T);
                                    bh90 bh90VarM = fetVar2.m();
                                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
                                    mm40 mm40VarK = s5x0.K(o7k0.c, 12.0f, 10.0f);
                                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                                    int iHashCode2 = Long.hashCode(fetVar2.T);
                                    bh90 bh90VarM2 = fetVar2.m();
                                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
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
                                    mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
                                    zcl zclVar4 = qmk.m;
                                    ugg0 ugg0Var = vgg0.f37379a;
                                    mm40 mm40VarE2 = h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarN);
                                    fqj0 fqj0Var2 = fqj0Var;
                                    zq8.a(0, fetVar2, xbc.c0(mm40VarE2, fqj0Var2));
                                    mm40 mm40VarN2 = s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                                    zcl zclVar5 = qmk.i;
                                    zq8.a(0, fetVar2, xbc.c0(o7k0.e(o7k0.s(h97.e(zclVar5, zclVar5, zclVar5, zclVar5, mm40VarN2), z ? 128.0f : 96.0f), 16.0f), fqj0Var2));
                                    fetVar2.r(true);
                                    if (iIntValue != i4) {
                                        fetVar2.e0(1764875330);
                                        mbc.o(zfi0.f44303a, jr8.f16991a.b(o7k0.d(s5x0.N(jm40Var, 60.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), gqw0.i), false, fetVar2, 6, 4);
                                        fetVar2.r(false);
                                    } else {
                                        fetVar2.e0(1765189174);
                                        fetVar2.r(false);
                                    }
                                    fetVar2.r(true);
                                } else {
                                    fetVar2.X();
                                }
                                return Unit.f46060a;
                            }
                        }), 6);
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, null, null, null, null, false, null, (Function1) objP, fetVar, i3 & 14, 510);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0g(i, i2, mm40Var);
        }
    }

    public static final void e(mm40 mm40Var, kc50 kc50Var, Function0 function0, fet fetVar, int i) {
        long secondary60;
        fet fetVar2 = fetVar;
        kc50Var.getClass();
        function0.getClass();
        fetVar2.g0(1318721881);
        int i2 = i | (fetVar2.g(kc50Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            if (kc50Var.b) {
                fetVar2.e0(276382858);
                secondary60 = ((ThemeColors) fetVar2.k(zaq0.b)).getPrimaryForeground();
            } else {
                fetVar2.e0(276384164);
                secondary60 = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary60();
            }
            fetVar2.r(false);
            l7m0 l7m0VarB = m5k0.b(secondary60, ro4.m0(Response.OK, 0, ihn.f14788a, 2), fetVar2, 0, 12);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            byte b = 6;
            s4u0 s4u0VarR = iom0.r(jpm0.t(kc50Var.f18043a, 6, fetVar2), fetVar2);
            boolean zG = fetVar2.g(l7m0VarB);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                objP = new oad(l7m0VarB, b);
                fetVar2.o0(objP);
            }
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar2;
            dww.a(s4u0VarR, (n4d) objP, y860.W(o7k0.n(jm40.b, 28.0f), null, null, false, null, function0, 28), fetVar2, 392, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var, kc50Var, function0, i, (byte) 27);
        }
    }

    public static final void f(mm40 mm40Var, final m580 m580Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        m580Var.getClass();
        fetVar.g0(-1199427814);
        final byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(m580Var) ? 32 : 16;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            vdx.n(o7k0.e(mm40Var, 52.0f), u1c.M(-640441300, new Function2() { // from class: a.sl60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b2;
                    pcy pcyVar = e7z.u1;
                    jm40 jm40Var = jm40.b;
                    m580 m580Var2 = m580Var;
                    switch (b4) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
                                int iHashCode = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM = fetVar3.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var);
                                mkd.c0.getClass();
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    fetVar3.l(pcyVar);
                                } else {
                                    fetVar3.r0();
                                }
                                jpm0.o(fetVar3, thg0VarA, gqw0.x);
                                jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                jpm0.n(fetVar3);
                                hxm0.h(ohs0.i(fetVar3, mm40VarC0, gqw0.v, 1.0f, true), m580Var2.f21209a, gqw0.f, 0, fetVar3, 384, 8);
                                mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
                                zcl zclVar2 = qmk.f28987a;
                                xvw.g(s5x0.N(mm40VarY, 8.0f, 0.0f, 0.0f, 0.0f, 14), m580Var2.e, m580Var2.h ? new b280(R.drawable.ic_glyph_first_team) : new c280(m580Var2.c, R.drawable.ic_glyph_placeholder_player), fetVar3, 0);
                                fetVar3.r(true);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                zcl zclVar3 = qmk.f28987a;
                                xvw.q(s5x0.L(jm40Var, 8.0f, 0.0f, 2), m580Var2.g, fetVar4, 0);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 48);
                                int iHashCode2 = Long.hashCode(fetVar5.T);
                                bh90 bh90VarM2 = fetVar5.m();
                                mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var);
                                mkd.c0.getClass();
                                fetVar5.i0();
                                if (fetVar5.S) {
                                    fetVar5.l(pcyVar);
                                } else {
                                    fetVar5.r0();
                                }
                                jpm0.o(fetVar5, thg0VarA2, gqw0.x);
                                jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                                jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                                jpm0.n(fetVar5);
                                jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                                xvw.g(o7k0.y(jm40Var, null, 3), m580Var2.f, m580Var2.h ? new b280(R.drawable.ic_glyph_second_team) : new c280(m580Var2.d, R.drawable.ic_glyph_placeholder_player), fetVar5, 6);
                                x7z x7zVar = new x7z(1.0f, true);
                                zcl zclVar4 = qmk.f28987a;
                                hxm0.h(s5x0.N(x7zVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), m580Var2.b, gqw0.d, 0, fetVar5, 384, 8);
                                fetVar5.r(true);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-754051795, new Function2() { // from class: a.sl60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    pcy pcyVar = e7z.u1;
                    jm40 jm40Var = jm40.b;
                    m580 m580Var2 = m580Var;
                    switch (b4) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
                                int iHashCode = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM = fetVar3.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var);
                                mkd.c0.getClass();
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    fetVar3.l(pcyVar);
                                } else {
                                    fetVar3.r0();
                                }
                                jpm0.o(fetVar3, thg0VarA, gqw0.x);
                                jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                jpm0.n(fetVar3);
                                hxm0.h(ohs0.i(fetVar3, mm40VarC0, gqw0.v, 1.0f, true), m580Var2.f21209a, gqw0.f, 0, fetVar3, 384, 8);
                                mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
                                zcl zclVar2 = qmk.f28987a;
                                xvw.g(s5x0.N(mm40VarY, 8.0f, 0.0f, 0.0f, 0.0f, 14), m580Var2.e, m580Var2.h ? new b280(R.drawable.ic_glyph_first_team) : new c280(m580Var2.c, R.drawable.ic_glyph_placeholder_player), fetVar3, 0);
                                fetVar3.r(true);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                zcl zclVar3 = qmk.f28987a;
                                xvw.q(s5x0.L(jm40Var, 8.0f, 0.0f, 2), m580Var2.g, fetVar4, 0);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 48);
                                int iHashCode2 = Long.hashCode(fetVar5.T);
                                bh90 bh90VarM2 = fetVar5.m();
                                mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var);
                                mkd.c0.getClass();
                                fetVar5.i0();
                                if (fetVar5.S) {
                                    fetVar5.l(pcyVar);
                                } else {
                                    fetVar5.r0();
                                }
                                jpm0.o(fetVar5, thg0VarA2, gqw0.x);
                                jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                                jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                                jpm0.n(fetVar5);
                                jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                                xvw.g(o7k0.y(jm40Var, null, 3), m580Var2.f, m580Var2.h ? new b280(R.drawable.ic_glyph_second_team) : new c280(m580Var2.d, R.drawable.ic_glyph_placeholder_player), fetVar5, 6);
                                x7z x7zVar = new x7z(1.0f, true);
                                zcl zclVar4 = qmk.f28987a;
                                hxm0.h(s5x0.N(x7zVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), m580Var2.b, gqw0.d, 0, fetVar5, 384, 8);
                                fetVar5.r(true);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-867662290, new Function2() { // from class: a.sl60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b;
                    pcy pcyVar = e7z.u1;
                    jm40 jm40Var = jm40.b;
                    m580 m580Var2 = m580Var;
                    switch (b4) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
                                int iHashCode = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM = fetVar3.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var);
                                mkd.c0.getClass();
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    fetVar3.l(pcyVar);
                                } else {
                                    fetVar3.r0();
                                }
                                jpm0.o(fetVar3, thg0VarA, gqw0.x);
                                jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                jpm0.n(fetVar3);
                                hxm0.h(ohs0.i(fetVar3, mm40VarC0, gqw0.v, 1.0f, true), m580Var2.f21209a, gqw0.f, 0, fetVar3, 384, 8);
                                mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
                                zcl zclVar2 = qmk.f28987a;
                                xvw.g(s5x0.N(mm40VarY, 8.0f, 0.0f, 0.0f, 0.0f, 14), m580Var2.e, m580Var2.h ? new b280(R.drawable.ic_glyph_first_team) : new c280(m580Var2.c, R.drawable.ic_glyph_placeholder_player), fetVar3, 0);
                                fetVar3.r(true);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                zcl zclVar3 = qmk.f28987a;
                                xvw.q(s5x0.L(jm40Var, 8.0f, 0.0f, 2), m580Var2.g, fetVar4, 0);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 48);
                                int iHashCode2 = Long.hashCode(fetVar5.T);
                                bh90 bh90VarM2 = fetVar5.m();
                                mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var);
                                mkd.c0.getClass();
                                fetVar5.i0();
                                if (fetVar5.S) {
                                    fetVar5.l(pcyVar);
                                } else {
                                    fetVar5.r0();
                                }
                                jpm0.o(fetVar5, thg0VarA2, gqw0.x);
                                jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                                jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                                jpm0.n(fetVar5);
                                jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                                xvw.g(o7k0.y(jm40Var, null, 3), m580Var2.f, m580Var2.h ? new b280(R.drawable.ic_glyph_second_team) : new c280(m580Var2.d, R.drawable.ic_glyph_placeholder_player), fetVar5, 6);
                                x7z x7zVar = new x7z(1.0f, true);
                                zcl zclVar4 = qmk.f28987a;
                                hxm0.h(s5x0.N(x7zVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), m580Var2.b, gqw0.d, 0, fetVar5, 384, 8);
                                fetVar5.r(true);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar2, 3504);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, m580Var, i, (byte) 26);
        }
    }

    public static final void g(mm40 mm40Var, die0 die0Var, d280 d280Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(686623314);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(die0Var) ? 32 : 16) | (fetVar.g(d280Var) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 6.0f, 4.0f, 3);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new m00(d280Var, b);
                fetVar.o0(objP);
            }
            kkb.p(0, fetVar, mm40VarN, (Function0) objP);
            fetVar.e0(-944837494);
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) mm40Var, (Object) die0Var, (Object) d280Var, i, (byte) 12);
        }
    }

    public static final void h(mm40 mm40Var, t0a0 t0a0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        t0a0Var.getClass();
        fetVar2.g0(2022176608);
        int i2 = i | 6 | (fetVar2.g(t0a0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 58.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarE, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f, 0.0f, 16.0f, 0.0f, 10);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            c280 c280Var = t0a0Var.b;
            s0a0 s0a0Var = t0a0Var.e;
            boolean zG = fetVar2.g(c280Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new t6n(d4d.SECONDARY60, w6n.f, c280Var);
                fetVar2.o0(objP);
            }
            t6n t6nVar = (t6n) objP;
            boolean zG2 = fetVar2.g(t6nVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new m2m(t6nVar, (byte) 2);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
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
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 22.0f), 1.0f);
            String str = t0a0Var.c;
            y9q0 y9q0VarV = g1t0.v();
            n05 n05Var = new n05(idm0.t(12), idm0.t(18), idm0.t(1));
            boolean zF = fetVar2.f(textPrimary);
            Object objP3 = fetVar2.P();
            if (zF || objP3 == cl5Var) {
                objP3 = new f15((byte) 12, textPrimary);
                fetVar2.o0(objP3);
            }
            aad.e(str, mm40VarD, y9q0VarV, null, 2, false, 1, 0, (n4d) objP3, n05Var, fetVar, 1597440, 168);
            mm40 mm40VarD2 = o7k0.d(o7k0.e(jm40Var, 16.0f), 1.0f);
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            v8q0.a(t0a0Var.d, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            if (s0a0Var != null) {
                fetVar2.e0(-2041683867);
                j6n.h(s0a0Var.f31402a, xoo0.f41232a, jm40Var, 0, 0, fetVar2, 432, 24);
                mm40Var2 = jm40Var;
                fetVar2.r(false);
            } else {
                mm40Var2 = jm40Var;
                fetVar2.e0(-2041451708);
                fetVar2.r(false);
            }
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var2, t0a0Var, i, (byte) 18);
        }
    }

    public static final void i(epd0 epd0Var, Function1 function1, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(1702349227);
        int i2 = i | (fetVar2.g(epd0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
            byte b2 = 14;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b2)), gqw0.m, fetVar2, 0);
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
            qw3 qw3Var = new qw3(4.0f, true, new jf4(b2));
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
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
            mm40 mm40VarA = zhg0Var.a(0.5f, jm40Var, true);
            String str = epd0Var.b;
            String str2 = epd0Var.e;
            boolean z2 = epd0Var.f8182a;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z3 = (i3 == 256) | (i4 == 32);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new wod0((byte) 14, epd0Var, function1);
                fetVar2.o0(objP);
            }
            n(mm40VarA, str, str2, z2, (Function0) objP, fetVar2, 0);
            mm40 mm40VarA2 = zhg0Var.a(0.5f, jm40Var, true);
            String str3 = epd0Var.c;
            String str4 = epd0Var.e;
            boolean z4 = epd0Var.f8182a;
            boolean z5 = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new wod0((byte) 15, epd0Var, function1);
                fetVar2.o0(objP2);
            }
            n(mm40VarA2, str3, str4, z4, (Function0) objP2, fetVar2, 0);
            fetVar2.r(true);
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarA3 = zhg0Var.a(0.5f, jm40Var, true);
            String str5 = epd0Var.d;
            String str6 = epd0Var.e;
            boolean z6 = epd0Var.f8182a;
            boolean z7 = (i3 == 256) | (i4 == 32);
            Object objP3 = fetVar2.P();
            if (z7 || objP3 == cl5Var) {
                objP3 = new wod0((byte) 17, epd0Var, function1);
                fetVar2.o0(objP3);
            }
            n(mm40VarA3, str5, str6, z6, (Function0) objP3, fetVar2, 0);
            String str7 = epd0Var.f;
            if (str7 == null) {
                fetVar2.e0(1991110845);
                b = 0;
                fetVar2.r(false);
            } else {
                fetVar2.e0(1991110846);
                mm40 mm40VarA4 = zhg0Var.a(0.5f, jm40Var, true);
                String upperCase = rsm0.w(R.string.maximum, 0, fetVar2).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                boolean z8 = epd0Var.f8182a;
                boolean zG = (i3 == 256) | fetVar2.g(str7);
                Object objP4 = fetVar2.P();
                if (zG || objP4 == cl5Var) {
                    objP4 = new cpw((byte) 2, str7, function1);
                    fetVar2.o0(objP4);
                }
                m(0, fetVar2, mm40VarA4, upperCase, (Function0) objP4, z8);
                fetVar2 = fetVar2;
                b = 0;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b = 0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vod0(epd0Var, function1, i, b);
        }
    }

    public static final void j(String str, fet fetVar, int i) {
        fetVar.g0(434853545);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1542256151, new yh20(str, (byte) 15), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 16, i, str);
        }
    }

    public static final void k(epd0 epd0Var, Function1 function1, xdr xdrVar, fet fetVar, int i) {
        xdr xdrVar2;
        fetVar.g0(-1413874229);
        int i2 = i | (fetVar.g(epd0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | 3072;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            ugd ugdVarM = u1c.M(49447770, new zod0(b, epd0Var, function1), fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(0.25f, jm40Var, true);
            String str = epd0Var.b;
            String str2 = epd0Var.e;
            boolean z = epd0Var.f8182a;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z2 = (i3 == 256) | (i4 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new wod0((byte) 2, epd0Var, function1);
                fetVar.o0(objP);
            }
            n(mm40VarA, str, str2, z, (Function0) objP, fetVar, 0);
            mm40 mm40VarA2 = zhg0Var.a(0.25f, jm40Var, true);
            String str3 = epd0Var.c;
            String str4 = epd0Var.e;
            boolean z3 = epd0Var.f8182a;
            boolean z4 = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new wod0((byte) 4, epd0Var, function1);
                fetVar.o0(objP2);
            }
            n(mm40VarA2, str3, str4, z3, (Function0) objP2, fetVar, 0);
            mm40 mm40VarA3 = zhg0Var.a(0.25f, jm40Var, true);
            String str5 = epd0Var.d;
            String str6 = epd0Var.e;
            boolean z5 = epd0Var.f8182a;
            boolean z6 = (i4 == 32) | (i3 == 256);
            Object objP3 = fetVar.P();
            if (z6 || objP3 == cl5Var) {
                objP3 = new wod0((byte) 6, epd0Var, function1);
                fetVar.o0(objP3);
            }
            n(mm40VarA3, str5, str6, z5, (Function0) objP3, fetVar, 0);
            fetVar.e0(-727761709);
            xdrVar2 = ugdVarM;
            xdrVar2.F(zhg0Var, fetVar, 54);
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
            xdrVar2 = xdrVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xod0(epd0Var, function1, xdrVar2, i, (byte) 1);
        }
    }

    public static final void l(mm40 mm40Var, boolean z, Function0 function0, xdr xdrVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1824284920);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            uld0.a(((i3 >> 3) & 14) | 48, u1c.M(-2071667286, new bpd0(mm40Var, z, function0, xdrVar, (byte) 1), fetVar), fetVar, z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpd0(mm40Var, z, function0, xdrVar, i, (byte) 1);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var, String str, Function0 function0, boolean z) {
        fet fetVar2;
        mm40 mm40Var2;
        Function0 function1;
        boolean z2;
        fetVar.g0(-102584390);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = (i2 & 14) | 3072;
            int i4 = i2 >> 3;
            fetVar2 = fetVar;
            l(mm40Var, z, function0, u1c.M(1166522900, new h0(str, (byte) 5), fetVar), fetVar2, i3 | (i4 & 112) | (i4 & 896));
            mm40Var2 = mm40Var;
            z2 = z;
            function1 = function0;
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            function1 = function0;
            z2 = z;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b0y(mm40Var2, str, z2, function1, i, (byte) 3);
        }
    }

    public static final void n(mm40 mm40Var, String str, String str2, boolean z, Function0 function0, fet fetVar, int i) {
        fetVar.g0(-421201503);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = (i2 & 14) | 3072;
            int i4 = i2 >> 6;
            l(mm40Var, z, function0, u1c.M(1016246279, new ew6(str, str2, (byte) 5), fetVar), fetVar, i3 | (i4 & 112) | (i4 & 896));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j4q(mm40Var, str, str2, z, function0, i, (byte) 1);
        }
    }

    public static final void o(mm40 mm40Var, epd0 epd0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(572900595);
        int i2 = i | 6 | (fetVar.g(epd0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            g9q0 g9q0VarN = pym0.n(fetVar);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            String str = epd0Var.f;
            if (str == null) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            pz40 pz40VarF = androidx.compose.runtime.e.f(epd0Var.b, fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(epd0Var.c, fetVar);
            pz40 pz40VarF3 = androidx.compose.runtime.e.f(epd0Var.d, fetVar);
            pz40 pz40VarF4 = androidx.compose.runtime.e.f(str, fetVar);
            boolean zG = fetVar.g(g9q0VarN) | fetVar.g(w6kVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            Object obj2 = objP;
            if (zG || objP == obj) {
                ycl yclVar = (ycl) jgk0.b(new dpd0(g9q0VarN, pz40VarF, pz40VarF2, pz40VarF3, pz40VarF4, w6kVar, (byte) 1)).getValue();
                float f = yclVar.f42389a;
                fetVar.o0(yclVar);
                obj2 = yclVar;
            }
            float f2 = ((ycl) obj2).f42389a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean zD = ((i2 & 112) == 32) | fetVar.d(f2) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (zD || objP2 == obj) {
                objP2 = new uod0(f2, epd0Var, function1, b);
                fetVar.o0(objP2);
            }
            x4n0.a(mm40VarD, (Function2) objP2, fetVar, 0, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yod0(mm40Var2, epd0Var, function1, i, (byte) 0);
        }
    }

    public static final void p(mm40 mm40Var, ojg0 ojg0Var, float f, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        fetVar2.g0(-829361000);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ojg0Var) ? 32 : 16) | (fetVar2.d(f) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            Object objA = ojg0Var.f25358a.a();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, f);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            k7x.a(objA, null, jr8Var.b(mm40VarN, zx7Var), null, null, fetVar2, 48, 2040);
            mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.h);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
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
            zcl zclVar = qmk.f28987a;
            k7x.a("https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/NamePanel.png", null, o7k0.s(o7k0.e(jm40Var, 16.0f), 72.0f), null, null, fetVar2, 54, 2040);
            v8q0.a(ojg0Var.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 131070);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zv(mm40Var, (Object) ojg0Var, f, i, (byte) 11);
        }
    }

    public static final void q(mm40 mm40Var, lpm lpmVar, fet fetVar, int i) {
        fetVar.g0(-757336125);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(lpmVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n4c.l(mm40Var, lpmVar, false, fetVar, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bx40(mm40Var, lpmVar, i, b);
        }
    }

    public static final void r(int i, int i2, fet fetVar, Function0 function0) {
        int i3;
        fetVar.g0(648369029);
        byte b = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            float f = 1.0f / i;
            l7m0 l7m0VarB = d43.b(((Number) function0.invoke()).intValue() * f, ro4.m0(160, 0, ihn.d, 2), null, null, fetVar, 0, 28);
            boolean zG = fetVar.g(l7m0VarB);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new tft(l7m0VarB, b2);
                fetVar.o0(objP);
            }
            zq8.a(0, fetVar, i120.Q(o7k0.d(o7k0.e(knx.Q(jm40.b, (xdr) objP), 40.0f), f), background, ugg0Var2));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v49(i, function0, i2, b);
        }
    }

    public static final void s(y5d y5dVar, mm40 mm40Var, j83 j83Var, j83 j83Var2, y9q0 y9q0Var, ugd ugdVar, fet fetVar, int i) {
        ugdVar.F(y5dVar, fetVar, Integer.valueOf((i & 14) | ((i >> 12) & 112)));
        int i2 = i >> 3;
        int i3 = i >> 6;
        int i4 = i3 & 896;
        x9x.w(mm40Var, j83Var, y9q0Var, fetVar, (i2 & 126) | i4);
        x9x.w(mm40Var, j83Var2, y9q0Var, fetVar, (i3 & 112) | (i2 & 14) | i4);
    }

    public static final void t(mm40 mm40Var, a4x a4xVar, Function0 function0, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        long secondary;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar2.g0(279446555);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(a4xVar) ? 32 : 16;
        }
        Function0 function2 = function0;
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.c(jm40Var, 1.0f), 1.0f);
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
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, shdVar, -971272605, a4xVar);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                pim pimVar = (pim) next;
                if (i3 == ((Number) function2.invoke()).intValue()) {
                    secondary = cs0.e(fetVar2, 1243698632, fetVar2, false);
                } else {
                    fetVar2.e0(1243761190);
                    secondary = afn0.m(fetVar2).getSecondary();
                    fetVar2.r(false);
                }
                long j = secondary;
                yx7 yx7Var = gqw0.k;
                nw3 nw3Var = uc9.e;
                mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
                ucg0 ucg0Var = new ucg0(4);
                boolean zE = ((i2 & 7168) == 2048) | fetVar2.e(i3);
                Object objP = fetVar2.P();
                jm40 jm40Var2 = jm40Var;
                byte b = 10;
                if (zE || objP == ukd.f35823a) {
                    objP = new re1(function1, i3, b);
                    fetVar2.o0(objP);
                }
                mm40 mm40VarL = twn.l(yx7Var, dw9.h(1.0f, y860.W(mm40VarC, null, null, false, ucg0Var, (Function0) objP, 12), true));
                thg0 thg0VarA2 = shg0.a(nw3Var, yx7Var, fetVar2, 54);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                zcl zclVar = qmk.f28987a;
                pcy pcyVar2 = pcyVar;
                int i5 = i2;
                dww.c(a8k0.F(pimVar.f27049a, 0, fetVar2), null, s5x0.N(jm40Var2, 6.0f, 0.0f, 0.0f, 0.0f, 14), j, fetVar2, 56, 0);
                mm40 mm40VarN = s5x0.N(jm40Var2, 4.0f, 0.0f, 6.0f, 0.0f, 10);
                String str = pimVar.b;
                long jT = idm0.t(10);
                long jT2 = idm0.t(14);
                afn0.v(fetVar).getClass();
                kc5.N(str, mm40VarN, j, null, null, 0L, jT, jT2, null, null, 0L, null, 2, false, 2, 0, false, null, g1t0.m(), 0.0f, fetVar, 14155776, 1597440, 0, 3063608);
                fetVar2 = fetVar;
                fetVar2.r(true);
                i2 = i5;
                function2 = function0;
                shdVar3 = shdVar3;
                i3 = i4;
                pcyVar = pcyVar2;
                jm40Var = jm40Var2;
                shdVar4 = shdVar4;
            }
            fetVar2.r(false);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gwy(mm40Var2, a4xVar, function0, function1, i, (byte) 1);
        }
    }

    public static final void u(Bundle bundle, Map map) {
        Object g0g0Var;
        String str = (String) map.get("taskId");
        if (str != null && str.length() != 0) {
            bundle.putString("taskId", str);
        }
        String str2 = (String) map.get("messageId");
        if (str2 != null && str2.length() != 0) {
            bundle.putString("messageId", str2);
        }
        String str3 = (String) map.get("notifIssuer");
        if (str3 == null || str3.length() == 0) {
            return;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = Integer.valueOf(Integer.parseInt(str3));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = 0;
        }
        bundle.putInt("notifIssuer", ((Number) g0g0Var).intValue());
    }

    public static h70 v(y78 y78Var) {
        int i = y78Var.b;
        if (i == 0 && ((KeyGenParameterSpec) y78Var.c) == null) {
            jf4.o("build() called before setKeyGenParameterSpec or setKeyScheme.");
            return null;
        }
        if (i == 1) {
            y78Var.c = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        }
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) y78Var.c;
        if (keyGenParameterSpec == null) {
            hny.u("KeyGenParameterSpec was null after build() check");
            return null;
        }
        Object obj = j930.f16118a;
        if (keyGenParameterSpec.getKeySize() != 256) {
            c99.k(keyGenParameterSpec.getKeySize(), "invalid key size, want 256 bits got ", " bits");
            return null;
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            ohq.k(Arrays.toString(keyGenParameterSpec.getBlockModes()), "invalid block mode, want GCM got ");
            return null;
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            ohq.h(keyGenParameterSpec.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            return null;
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            ohq.k(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()), "invalid padding mode, want NoPadding got ");
            return null;
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            jf4.o("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            return null;
        }
        synchronized (j930.f16118a) {
            String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpec);
                    keyGenerator.generateKey();
                } catch (ProviderException e) {
                    throw new GeneralSecurityException(e.getMessage(), e);
                }
            }
        }
        return new h70(keyGenParameterSpec.getKeystoreAlias(), (KeyGenParameterSpec) y78Var.c);
    }

    public static final i4 w(String str, ArrayList arrayList) {
        ArrayList<c4h> arrayListU = ohs0.u(str);
        Iterator it = new IntRange(0, 4, 1).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            arrayListU.add((c4h) ((iNextInt < 0 || iNextInt >= arrayList.size()) ? new c4h("", "", "", "", 0.0f, 0.0f, 0.0f, 0, 0, iun.f15405a) : arrayList.get(iNextInt)));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListU, 10));
        for (c4h c4hVar : arrayListU) {
            String str2 = c4hVar.f3725a;
            arrayList2.add(new hfa0(kkg.j, str2, c4hVar.b, "", c4hVar.c, str2.equals(str)));
        }
        return dyb.r0(arrayList2);
    }

    public static final qgm0 x(ctf0 ctf0Var, String str, p0u0 p0u0Var, boolean z) {
        ctf0Var.getClass();
        int i = p0u0Var.b;
        int i2 = p0u0Var.c;
        int i3 = i - i2;
        String strM = i3 > 0 ? twn.m(i3, "+") : String.valueOf(i3);
        String upperCase = p0u0Var.k.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        ogm0 ogm0Var = new ogm0(str, upperCase, lmc.E(p0u0Var.l), z ? ctf0Var.b.a(R.string.valorant_mvp, Arrays.copyOf(new Object[0], 0)) : "");
        String strValueOf = String.valueOf(i);
        qek0 qek0Var = qek0.c;
        return new qgm0(ogm0Var, dyb.g0(new vem0(strValueOf, qek0Var), new vem0(String.valueOf(p0u0Var.d), qek0Var), new vem0(String.valueOf(i2), qek0Var), new vem0(strM, qek0Var)));
    }

    public static final c6q0 y(String str, String str2, boolean z, String str3, oie oieVar, int i) {
        String str4;
        s7q0 s7q0Var;
        if (str3.length() > 0) {
            str4 = str3;
            s7q0Var = new s7q0(str4);
        } else {
            str4 = str3;
            s7q0Var = new s7q0("");
        }
        s7q0 s7q0Var2 = s7q0Var;
        y5q0 y5q0Var = new y5q0(0, null, oieVar, 3);
        return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var2, z, str4.length() > 0, y5q0Var, str2, null, false, i, null, 253184);
    }

    public static void z(long j, f99 f99Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            jf4.o("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((qg9) arrayList4.get(i8)).e() < i7) {
                jf4.o("Failed requirement.");
                return;
            }
        }
        qg9 qg9Var = (qg9) arrayList.get(i2);
        qg9 qg9Var2 = (qg9) arrayList4.get(i3 - 1);
        if (i7 == qg9Var.e()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            qg9 qg9Var3 = (qg9) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            qg9Var = qg9Var3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (qg9Var.l(i7) == qg9Var2.l(i7)) {
            int iMin = Math.min(qg9Var.e(), qg9Var2.e());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && qg9Var.l(i11) == qg9Var2.l(i11); i11++) {
                i10++;
            }
            long j3 = (f99Var.b / 4) + j + 2 + ((long) i10) + 1;
            f99Var.Z(-i10);
            f99Var.Z(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                f99Var.Z(qg9Var.l(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((qg9) arrayList4.get(i4)).e()) {
                    f99Var.Z(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    jf4.n("Check failed.");
                    return;
                }
            }
            f99 f99Var2 = new f99();
            f99Var.Z(((int) ((f99Var2.b / 4) + j3)) * (-1));
            z(j3, f99Var2, i12, arrayList4, i4, i3, arrayList5);
            f99Var.P(f99Var2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((qg9) arrayList4.get(i14 - 1)).l(i7) != ((qg9) arrayList4.get(i14)).l(i7)) {
                i13++;
            }
        }
        long j4 = (f99Var.b / 4) + j + 2 + ((long) (i13 * 2));
        f99Var.Z(i13);
        f99Var.Z(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iL = ((qg9) arrayList4.get(i15)).l(i7);
            if (i15 == i4 || iL != ((qg9) arrayList4.get(i15 - 1)).l(i7)) {
                f99Var.Z(iL & 255);
            }
        }
        f99 f99Var3 = new f99();
        int i16 = i4;
        while (i16 < i3) {
            byte bL = ((qg9) arrayList4.get(i16)).l(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bL != ((qg9) arrayList4.get(i18)).l(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((qg9) arrayList4.get(i16)).e()) {
                f99Var.Z(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                f99Var.Z(((int) ((f99Var3.b / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                z(j2, f99Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        f99Var.P(f99Var3);
    }

    public void A(int i) {
        new Handler(Looper.getMainLooper()).post(new htf0(this, i, (byte) 0));
    }

    public abstract void U(Typeface typeface);

    public void T(int i) {
    }
}
