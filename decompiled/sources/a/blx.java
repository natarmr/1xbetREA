package a;

import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.share.attribution.RequestError;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class blx {
    public static final k9h0 a(Intent intent) {
        Object g0g0Var;
        intent.getClass();
        d(intent);
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("OPEN_SCREEN") : null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof k9h0) {
            return (k9h0) obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = k9h0.valueOf((String) obj);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return (k9h0) (g0g0Var instanceof g0g0 ? null : g0g0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:191:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:254:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:255:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:261:0x051b  */
    public static final pdd0 b(Intent intent) {
        Integer numValueOf;
        Integer numValueOf2;
        String stringExtra;
        String str;
        long[] longArrayExtra;
        List listF0;
        lr1 fr1Var;
        fs80 fs80Var;
        long j;
        long longExtra;
        jr1 jr1Var;
        boolean z;
        long[] longArrayExtra2;
        List listF1;
        sad0 sad0Var = sad0.f31884a;
        intent.getClass();
        k9h0 k9h0VarA = a(intent);
        if (intent.getLongExtra("selected_game_id", 0L) != 0) {
            long longExtra2 = intent.getLongExtra("selected_game_id", 0L);
            intent.removeExtra("selected_game_id");
            long longExtra3 = intent.getLongExtra("sportId", 0L);
            intent.removeExtra("sportId");
            long longExtra4 = intent.getLongExtra("subSportId", 0L);
            intent.removeExtra("subSportId");
            boolean booleanExtra = intent.getBooleanExtra("is_live", false);
            intent.removeExtra("is_live");
            long longExtra5 = intent.getLongExtra("selected_sub_game_id", 0L);
            intent.removeExtra("selected_sub_game_id");
            if (longExtra2 != 0) {
                return new ycd0(longExtra2, longExtra5, longExtra3, (longExtra3 != 40 || longExtra4 == 0) ? 0L : longExtra4, booleanExtra);
            }
            return sad0Var;
        }
        String stringExtra2 = intent.getStringExtra("mass_mailing_key");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (stringExtra2.length() > 0) {
            return sad0.b;
        }
        if (intent.getBooleanExtra("link_start_key", false)) {
            String stringExtra3 = intent.getStringExtra("link_start_url");
            if (stringExtra3 != null) {
                return new ebd0(stringExtra3);
            }
            return null;
        }
        if (intent.getBooleanExtra("SHOW_AUTHORIZATION", false)) {
            intent.removeExtra("SHOW_AUTHORIZATION");
            return new n9d0(false);
        }
        if (intent.getBooleanExtra("SHOW_SETTINGS", false)) {
            intent.removeExtra("SHOW_SETTINGS");
            return vcd0.f37182a;
        }
        if (intent.getBooleanExtra("SHOW_POPULAR", false)) {
            intent.removeExtra("SHOW_POPULAR");
            return new acd0();
        }
        if (intent.getBooleanExtra("SHOW_SUPPORT_CHAT", false)) {
            intent.removeExtra("SHOW_SUPPORT_CHAT");
            return sad0.c;
        }
        if (intent.getBooleanExtra("limited_blocked_logon", false)) {
            intent.removeExtra("limited_blocked_logon");
            return new n9d0(true);
        }
        if (intent.getLongExtra("selected_game_id", 0L) != 0) {
            long longExtra6 = intent.getLongExtra("SPORT_ID", 0L);
            intent.removeExtra("SPORT_ID");
            long longExtra7 = intent.getLongExtra("selected_game_id", 0L);
            intent.removeExtra("selected_game_id");
            long longExtra8 = intent.getLongExtra("selected_sub_game_id", 0L);
            intent.removeExtra("selected_sub_game_id");
            long longExtra9 = intent.getLongExtra("subSportId", 0L);
            intent.removeExtra("subSportId");
            boolean booleanExtra2 = intent.getBooleanExtra("is_live", false);
            intent.removeExtra("is_live");
            return new xad0(longExtra7, longExtra8, longExtra6, longExtra9, booleanExtra2);
        }
        if (k9h0VarA == null) {
            if (intent.getBooleanExtra("REQUEST_FAVORITES_WIDGET", false)) {
                return ocd0.f25023a;
            }
            if (intent.getBooleanExtra("SHOW_FAVORITES", false)) {
                return new wad0(frj.Unknown);
            }
            if (!intent.getBooleanExtra("OPEN_PAYMENT", false)) {
                return sad0Var;
            }
            intent.removeExtra("OPEN_PAYMENT");
            return new vbd0();
        }
        intent.removeExtra("OPEN_SCREEN");
        boolean booleanExtra3 = intent.getBooleanExtra("IS_PUSH_NOTIFICATION", false);
        switch (k9h0VarA.ordinal()) {
            case 1:
                int intExtra = intent.getIntExtra("AUTH_NOTIFICATION_TYPE", 0);
                if (intent.hasExtra("REGISTRATION_DEFAULT_BONUS_ID")) {
                    numValueOf = Integer.valueOf(intent.getIntExtra("REGISTRATION_DEFAULT_BONUS_ID", -1));
                } else {
                    cge0 cge0Var = aue0.b;
                    numValueOf = null;
                }
                aue0.b.getClass();
                return new hbd0(intExtra, cge0.h(numValueOf));
            case 2:
                if (intent.hasExtra("REGISTRATION_DEFAULT_BONUS_ID")) {
                    numValueOf2 = Integer.valueOf(intent.getIntExtra("REGISTRATION_DEFAULT_BONUS_ID", -1));
                } else {
                    cge0 cge0Var2 = aue0.b;
                    numValueOf2 = null;
                }
                aue0.b.getClass();
                return new ncd0(cge0.h(numValueOf2));
            case 3:
                return new acd0();
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 33:
            case 46:
            case 56:
            case 82:
            default:
                return sad0Var;
            case 7:
                return zbd0.f44110a;
            case 11:
                return new s9d0(intent.getLongExtra("PARAM_TYPE", 0L), intent.getLongExtra("PARAM_ID", 0L));
            case 16:
                return new abd0(j700.f16016a);
            case 17:
            case 18:
                Pair pairC = c(intent);
                return new gbd0(j700.f16016a, intent.getIntExtra("CYBER_TYPE", 0), intent.getLongExtra("subSportId", 0L), (Set) pairC.f46059a, (Set) pairC.b, intent.getBooleanExtra("IS_CYBER", false));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 23:
                return new xad0(intent.getLongExtra("PARAM_ID", 0L), 0L, intent.getLongExtra("SPORT_ID", 0L), intent.getLongExtra("subSportId", 0L), k9h0VarA == k9h0.t);
            case 20:
                return new abd0(j700.b);
            case 21:
            case 22:
                Pair pairC2 = c(intent);
                return new gbd0(j700.b, intent.getIntExtra("CYBER_TYPE", 0), intent.getLongExtra("subSportId", 0L), (Set) pairC2.f46059a, (Set) pairC2.b, intent.getBooleanExtra("IS_CYBER", false));
            case 24:
                return zcd0.f44161a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return vad0.f37080a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ccd0(0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ccd0(intent.getIntExtra("PARAM_ID", 0));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new uad0();
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                boolean booleanExtra4 = intent.getBooleanExtra("ACTIVITY_RECREATED", false);
                intent.removeExtra("ACTIVITY_RECREATED");
                String str2 = (booleanExtra4 || (stringExtra = intent.getStringExtra("PARAM_URL")) == null) ? "" : stringExtra;
                return str2.length() == 0 ? jbd0.f16235a : new rad0(str2);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                String stringExtra4 = intent.getStringExtra("PARAM_URL");
                if (stringExtra4 == null) {
                    String stringExtra5 = intent.getStringExtra("PARAM_DEEPLINK");
                    str = stringExtra5 == null ? "" : stringExtra5;
                } else {
                    str = stringExtra4;
                }
                return new rad0(str);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return bcd0.f2353a;
            case 32:
                String stringExtra6 = intent.getStringExtra("PARAM_ID");
                String str3 = stringExtra6 == null ? "" : stringExtra6;
                Serializable serializableExtra = intent.getSerializableExtra("PARAM_TYPE");
                r080 r080Var = serializableExtra instanceof r080 ? (r080) serializableExtra : null;
                if (r080Var == null) {
                    r080Var = r080.f29619a;
                }
                return new m9d0(str3, r080Var);
            case 34:
                long longExtra10 = intent.getLongExtra("PARAM_ID", 0L);
                String stringExtra7 = intent.getStringExtra("PARAM_SCREEN_TYPE");
                String str4 = stringExtra7 == null ? "" : stringExtra7;
                Serializable serializableExtra2 = intent.getSerializableExtra("PARAM_TYPE");
                d270 d270Var = serializableExtra2 instanceof d270 ? (d270) serializableExtra2 : null;
                if (d270Var == null) {
                    d270Var = d270.UNKNOWN;
                }
                return new zad0(longExtra10, d270Var, str4);
            case 35:
                return new vbd0();
            case 36:
                return lcd0.f19794a;
            case 37:
                String stringExtra8 = intent.getStringExtra("PARAM_URL");
                return new wbd0(stringExtra8 == null ? "" : stringExtra8);
            case 38:
                return edd0.f7611a;
            case 39:
                String stringExtra9 = intent.getStringExtra("PARAM_ID");
                return new ead0(stringExtra9 == null ? "" : stringExtra9, false);
            case 40:
                return new icd0(intent.getLongExtra("PARAM_ID", 0L), aue0.c);
            case 41:
                String stringExtra10 = intent.getStringExtra("PARAM_URL");
                return new jcd0(stringExtra10 == null ? "" : stringExtra10);
            case 42:
                String stringExtra11 = intent.getStringExtra("PARAM_URL");
                return new kcd0(stringExtra11 == null ? "" : stringExtra11);
            case 43:
                String stringExtra12 = intent.getStringExtra("PARAM_URL");
                return new ebd0(stringExtra12 == null ? "" : stringExtra12);
            case 44:
                return y9d0.f42240a;
            case 45:
                return qcd0.f28480a;
            case 47:
                return new gad0(intent.getIntExtra("CYBER_TYPE", 0), intent.getBooleanExtra("IS_EWC", false));
            case 48:
                return scd0.f31981a;
            case 49:
                return pcd0.f26755a;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 66:
                String stringExtra13 = intent.getStringExtra("PARAM_TYPE");
                return new j9d0((stringExtra13 == null ? "" : stringExtra13).equals("vipcashback") ? new hr1(-10L, 2) : new hr1(0L, 3));
            case 51:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                boolean booleanExtra5 = intent.getBooleanExtra("ACTIVITY_RECREATED", false);
                long longExtra11 = booleanExtra5 ? Long.MIN_VALUE : intent.getLongExtra("PARAM_ID", Long.MIN_VALUE);
                long longExtra12 = booleanExtra5 ? 0L : intent.getLongExtra("PARTITION_ID", 0L);
                if (booleanExtra5 || (longArrayExtra = intent.getLongArrayExtra("FILTER_IDS")) == null || (listF0 = tx3.f0(longArrayExtra)) == null) {
                    listF0 = iun.f15405a;
                }
                List list = listF0;
                q91 q91Var = booleanExtra3 ? q91.c : q91.b;
                String stringExtra14 = intent.getStringExtra("PARAM_TYPE");
                if (stringExtra14 == null) {
                    stringExtra14 = "";
                }
                switch (stringExtra14.hashCode()) {
                    case -987494927:
                        if (!stringExtra14.equals("provider")) {
                            fr1Var = new fr1(null, q91Var, 1);
                        } else {
                            if (longExtra12 != nw80.b.getId() || longExtra12 == nw80.f24223a.getId()) {
                                fs80Var = new fs80(null, longExtra12, iun.f15405a, kotlin.collections.a.c(Long.valueOf(longExtra11)), 0L, false, 113);
                            } else {
                                fs80Var = new fs80(null, 0L, null, null, 0L, false, 127);
                            }
                            fr1Var = new fr1(fs80Var, q91Var);
                        }
                        break;
                    case 3165170:
                        long j2 = longExtra11;
                        if (!stringExtra14.equals("game")) {
                            fr1Var = new fr1(null, q91Var, 1);
                        } else {
                            fr1Var = new fr1(new fs80(null, 0L, null, null, j2, false, 111), q91Var);
                        }
                        break;
                    case 93997959:
                        if (!stringExtra14.equals("brand")) {
                            fr1Var = new fr1(null, q91Var, 1);
                        } else {
                            if (longExtra12 != nw80.b.getId()) {
                                fs80Var = new fs80(null, longExtra12, iun.f15405a, kotlin.collections.a.c(Long.valueOf(longExtra11)), 0L, false, 113);
                            } else {
                                fs80Var = new fs80(null, longExtra12, iun.f15405a, kotlin.collections.a.c(Long.valueOf(longExtra11)), 0L, false, 113);
                            }
                            fr1Var = new fr1(fs80Var, q91Var);
                        }
                        break;
                    case 1300380478:
                        if (!stringExtra14.equals("subcategory")) {
                            fr1Var = new fr1(null, q91Var, 1);
                        } else {
                            fr1Var = new fr1(new fs80(null, longExtra11, list, null, 0L, false, 121), q91Var);
                        }
                        break;
                    case 1733242189:
                        if (!stringExtra14.equals("casinoBrandId")) {
                            fr1Var = new fr1(null, q91Var, 1);
                        } else {
                            fr1Var = new er1(true, longExtra11);
                        }
                        break;
                    default:
                        fr1Var = new fr1(null, q91Var, 1);
                        break;
                }
                return new j9d0(fr1Var);
            case 52:
            case 53:
            case 54:
                if (intent.getBooleanExtra("ACTIVITY_RECREATED", false)) {
                    longExtra = 0;
                    j = 0;
                } else {
                    j = 0;
                    longExtra = intent.getLongExtra("PARAM_ID", 0L);
                }
                long longExtra13 = intent.getBooleanExtra("OPEN_NATIVE_TOURNAMENT", false) ? intent.getLongExtra("casinoNativeTournamentId", j) : intent.getLongExtra("casinoTournamentId", j);
                String stringExtra15 = intent.getStringExtra("PARAM_TYPE");
                return new j9d0((stringExtra15 == null ? "" : stringExtra15).equals("tournament") ? new jr1(new evc0(false, longExtra)) : new jr1(new evc0(false, longExtra13)));
            case 55:
                long longExtra14 = intent.getBooleanExtra("ACTIVITY_RECREATED", false) ? 0L : intent.getLongExtra("PARAM_ID", 0L);
                String stringExtra16 = intent.getStringExtra("PARAM_TYPE");
                switch (stringExtra16 == null ? "" : stringExtra16) {
                    case "tournament":
                        jr1Var = new jr1(new evc0(false, longExtra14));
                        break;
                    case "prizes":
                        jr1Var = new jr1(new cvc0(d7v.b));
                        break;
                    case "tournaments":
                        jr1Var = new jr1(new evc0(false, 0L));
                        break;
                    case "promocode":
                        jr1Var = new jr1(new dvc0((int) longExtra14));
                        break;
                    case "freespins":
                        jr1Var = new jr1(new cvc0(d7v.d));
                        break;
                    case "bonuses":
                        jr1Var = new jr1(new cvc0(d7v.c));
                        break;
                    case "nativetournament":
                        jr1Var = new jr1(new evc0(false, longExtra14));
                        break;
                    default:
                        jr1Var = new jr1();
                        break;
                }
                return new j9d0(jr1Var);
            case 57:
                return new j9d0(new jr1(new dvc0((int) (intent.getBooleanExtra("ACTIVITY_RECREATED", false) ? 0L : intent.getLongExtra("PARAM_ID", 0L)))));
            case 58:
                return gdd0.f11101a;
            case 65:
                return new k9d0(intent.getBooleanExtra("needTransfer", false), intent.getBooleanExtra("ACTIVITY_RECREATED", false) ? 0L : intent.getLongExtra("PARAM_ID", 0L));
            case 67:
                return new j9d0(new jr1(new cvc0(d7v.b)));
            case 68:
                return new j9d0(new jr1(new cvc0(d7v.d)));
            case 69:
                return new j9d0(new jr1(new cvc0(d7v.c)));
            case 70:
                return l9d0.f19646a;
            case 71:
                long longExtra15 = intent.getLongExtra("GAME_ID", 0L);
                long longExtra16 = intent.getLongExtra("SPORT_ID", 0L);
                long longExtra17 = intent.getLongExtra("subSportId", 0L);
                String stringExtra17 = intent.getStringExtra("GAME_TYPE");
                if (Intrinsics.d(stringExtra17, "live")) {
                    z = true;
                } else {
                    Intrinsics.d(stringExtra17, "line");
                    z = false;
                }
                return new kad0(longExtra15, longExtra16, longExtra17, z);
            case 72:
                long longExtra18 = intent.getLongExtra("SPORT_ID", 0L);
                long longExtra19 = intent.getLongExtra("subSportId", 0L);
                int intExtra2 = intent.getIntExtra("CYBER_TYPE", 0);
                if (intExtra2 == CyberGamesPage.Real.INSTANCE.f46556a) {
                    longExtra18 = longExtra19;
                }
                return new iad0(intExtra2, longExtra18, false);
            case 73:
                int intExtra3 = intent.getIntExtra("CYBER_TYPE", 0);
                long longExtra20 = intent.getLongExtra("CHAMP_ID", 0L);
                long longExtra21 = intent.getLongExtra("SPORT_ID", 0L);
                long longExtra22 = intent.getLongExtra("subSportId", 0L);
                if (intExtra3 == CyberGamesPage.Real.INSTANCE.f46556a) {
                    longExtra21 = longExtra22;
                }
                return new had0(intExtra3, longExtra20, longExtra21);
            case 74:
                return new pad0(intent.getIntExtra("CYBER_TYPE", 0), intent.getBooleanExtra("live", false));
            case 75:
                String stringExtra18 = intent.getStringExtra("team_name");
                return new mad0(stringExtra18 == null ? "" : stringExtra18, 0L);
            case 76:
                return sbd0.f31928a;
            case 77:
                long longExtra23 = intent.getLongExtra("PARAM_ID", -1L);
                return longExtra23 < 0 ? sad0Var : new qbd0(longExtra23);
            case 78:
                return nbd0.f23234a;
            case 79:
                return obd0.f24972a;
            case 80:
                return pbd0.f26701a;
            case 81:
                return fbd0.f9252a;
            case 83:
            case 87:
                return new ndd0(new hr1(0L, 3));
            case 84:
            case 85:
            case 86:
                boolean booleanExtra6 = intent.getBooleanExtra("ACTIVITY_RECREATED", false);
                long longExtra24 = booleanExtra6 ? Long.MIN_VALUE : intent.getLongExtra("PARAM_ID", Long.MIN_VALUE);
                if (booleanExtra6 || (longArrayExtra2 = intent.getLongArrayExtra("FILTER_IDS")) == null || (listF1 = tx3.f0(longArrayExtra2)) == null) {
                    listF1 = iun.f15405a;
                }
                List list2 = listF1;
                q91 q91Var2 = booleanExtra3 ? q91.c : q91.b;
                String stringExtra19 = intent.getStringExtra("PARAM_TYPE");
                String str5 = stringExtra19 == null ? "" : stringExtra19;
                return new ndd0(str5.equals("subcategory") ? new fr1(new fs80(null, longExtra24, list2, null, 0L, false, 121), q91Var2) : str5.equals("game") ? new fr1(new fs80(null, 0L, null, null, longExtra24, false, 111), q91Var2) : new fr1(null, q91Var2, 1));
            case 88:
                return add0.f674a;
            case 89:
                return qad0.f28390a;
            case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                return new xcd0(intent.getIntExtra("SPECIAL_EVENT_TOP_CHAMP_ID", 0));
        }
    }

    public static final Pair c(Intent intent) {
        Object objP0;
        Object objP1;
        if (intent.hasExtra("SPORT_ID")) {
            Set setB = cui0.b(Long.valueOf(intent.getLongExtra("SPORT_ID", 0L)));
            ArrayList arrayList = new ArrayList();
            for (Object obj : setB) {
                if (((Number) obj).longValue() != 0) {
                    arrayList.add(obj);
                }
            }
            objP0 = CollectionsKt.P0(arrayList);
        } else {
            objP0 = xun.f41520a;
        }
        if (intent.hasExtra("CHAMP_ID")) {
            Set setB2 = cui0.b(Long.valueOf(intent.getLongExtra("CHAMP_ID", 0L)));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : setB2) {
                if (((Number) obj2).longValue() != 0) {
                    arrayList2.add(obj2);
                }
            }
            objP1 = CollectionsKt.P0(arrayList2);
        } else {
            objP1 = xun.f41520a;
        }
        return new Pair(objP0, objP1);
    }

    public static final void d(Intent intent) {
        Object g0g0Var;
        intent.getClass();
        intent.setExtrasClassLoader(k9h0.class.getClassLoader());
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            extras.setClassLoader(k9h0.class.getClassLoader());
            try {
                e0g0 e0g0Var = j0g0.b;
                Object obj = extras.get("OPEN_SCREEN");
                g0g0Var = extras;
                if (obj instanceof k9h0) {
                    extras.putString("OPEN_SCREEN", ((k9h0) obj).name());
                    g0g0Var = extras;
                }
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            intent.replaceExtras((Bundle) (g0g0Var instanceof g0g0 ? null : g0g0Var));
        } catch (RuntimeException unused) {
            intent.replaceExtras((Bundle) null);
        }
    }
}
