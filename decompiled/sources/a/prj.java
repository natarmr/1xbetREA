package a;

import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.attribution.RequestError;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public final class prj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f27468a;
    public final pru b;
    public final zpu c;
    public final n0o0 d;

    public prj(ctf0 ctf0Var, pru pruVar, zpu zpuVar) {
        ctf0Var.getClass();
        this.f27468a = ctf0Var;
        this.b = pruVar;
        this.c = zpuVar;
        this.d = maz.b(new ucj(this, (byte) 7));
    }

    public static int A(prj prjVar, Uri uri, String str) {
        Integer intOrNull;
        String strE0 = sj3.e0(uri, str);
        if (strE0 == null || (intOrNull = StringsKt.toIntOrNull(strE0)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    public static List B(Uri uri, String str) {
        ArrayList arrayList;
        List listI0;
        String strE0 = sj3.e0(uri, str);
        if (strE0 == null || (listI0 = StringsKt.i0(strE0, new char[]{','}, 6)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator it = listI0.iterator();
            while (it.hasNext()) {
                Long lT0 = StringsKt.t0((String) it.next());
                if (lT0 != null) {
                    arrayList.add(lT0);
                }
            }
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static long C(prj prjVar, Uri uri, String str) {
        Long lT0;
        String strE0 = sj3.e0(uri, str);
        if (strE0 == null || (lT0 = StringsKt.t0(strE0)) == null) {
            return 0L;
        }
        return lT0.longValue();
    }

    public static boolean a(Uri uri, String str, boolean z) {
        Boolean bool;
        String strE0 = sj3.e0(uri, str);
        if (strE0 != null) {
            if (Intrinsics.d(strE0, "true")) {
                bool = Boolean.TRUE;
            } else {
                bool = Intrinsics.d(strE0, "false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return z;
    }

    public static tlj b(Uri uri) {
        String strE0 = sj3.e0(uri, "configkey");
        if (strE0 == null) {
            strE0 = "";
        }
        return new tlj(strE0.length() > 0);
    }

    public static ylj d(Uri uri) {
        String strE0 = sj3.e0(uri, Payload.TYPE);
        if (strE0 == null) {
            strE0 = "";
        }
        return new ylj(strE0);
    }

    public static jmj e(Uri uri) {
        Long lT0;
        Long lT1;
        Long lT2;
        Integer intOrNull;
        String strE0 = sj3.e0(uri, "cybertype");
        int iIntValue = (strE0 == null || (intOrNull = StringsKt.toIntOrNull(strE0)) == null) ? 0 : intOrNull.intValue();
        String strE1 = sj3.e0(uri, "champid");
        long jLongValue = 0;
        long jLongValue2 = (strE1 == null || (lT2 = StringsKt.t0(strE1)) == null) ? 0L : lT2.longValue();
        String strE2 = sj3.e0(uri, "sportid");
        long jLongValue3 = (strE2 == null || (lT1 = StringsKt.t0(strE2)) == null) ? 0L : lT1.longValue();
        String strE3 = sj3.e0(uri, "subsportid");
        if (strE3 != null && (lT0 = StringsKt.t0(strE3)) != null) {
            jLongValue = lT0.longValue();
        }
        if (iIntValue == CyberGamesPage.Real.INSTANCE.f46556a) {
            jLongValue3 = jLongValue;
        }
        return new jmj(iIntValue, jLongValue2, jLongValue3);
    }

    public static kmj f(Uri uri) {
        Integer intOrNull;
        Long lT0;
        Long lT1;
        String strE0 = sj3.e0(uri, "sportid");
        long jLongValue = 0;
        long jLongValue2 = (strE0 == null || (lT1 = StringsKt.t0(strE0)) == null) ? 0L : lT1.longValue();
        String strE1 = sj3.e0(uri, "subsportid");
        if (strE1 != null && (lT0 = StringsKt.t0(strE1)) != null) {
            jLongValue = lT0.longValue();
        }
        String strE2 = sj3.e0(uri, "cybertype");
        int iIntValue = (strE2 == null || (intOrNull = StringsKt.toIntOrNull(strE2)) == null) ? 0 : intOrNull.intValue();
        if (iIntValue == CyberGamesPage.Real.INSTANCE.f46556a) {
            jLongValue2 = jLongValue;
        }
        return new kmj(iIntValue, jLongValue2, false);
    }

    public static pmj g(Uri uri) {
        Integer intOrNull;
        Integer intOrNull2;
        String strE0 = sj3.e0(uri, "cybertype");
        int iIntValue = 0;
        int iIntValue2 = (strE0 == null || (intOrNull2 = StringsKt.toIntOrNull(strE0)) == null) ? 0 : intOrNull2.intValue();
        String strE1 = sj3.e0(uri, "viewtype");
        if (strE1 != null && (intOrNull = StringsKt.toIntOrNull(strE1)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return new pmj(iIntValue2, iIntValue, B(uri, ParameterNames.ID));
    }

    public static omj h(Uri uri) {
        Long lT0;
        String strE0 = sj3.e0(uri, "team_name");
        if (strE0 == null) {
            strE0 = "";
        }
        String strE1 = sj3.e0(uri, "feedid");
        return new omj(strE0, (strE1 == null || (lT0 = StringsKt.t0(strE1)) == null) ? 0L : lT0.longValue());
    }

    public static rmj k(Uri uri) {
        Integer intOrNull;
        String strE0 = sj3.e0(uri, "cybertype");
        int iIntValue = (strE0 == null || (intOrNull = StringsKt.toIntOrNull(strE0)) == null) ? 0 : intOrNull.intValue();
        String strE1 = sj3.e0(uri, "islive");
        return new rmj(strE1 != null ? Boolean.parseBoolean(strE1) : false, iIntValue);
    }

    public static upj o(boolean z, Uri uri) {
        if (!z) {
            return x(uri);
        }
        String strE0 = sj3.e0(uri, Payload.TYPE);
        if (strE0 == null) {
            strE0 = "";
        }
        String strE1 = sj3.e0(uri, ParameterNames.ID);
        if (strE1 == null) {
            strE1 = "";
        }
        String strE2 = sj3.e0(uri, RemoteMessageConst.Notification.URL);
        String strM0 = strE2 != null ? strE2 : "";
        if (kotlin.text.c.x(strM0, Separators.SLASH, false) && strE0.equals("iframecasino")) {
            strM0 = StringsKt.m0(strM0, Separators.SLASH, strM0);
        }
        int iHashCode = strE0.hashCode();
        if (iHashCode != -1191214428) {
            if (iHashCode != -1052618729) {
                if (iHashCode == 969966489 && strE0.equals("iframecasino")) {
                    return new loj(strM0);
                }
            } else if (strE0.equals("native")) {
                return new hoj(Integer.parseInt(strE1));
            }
        } else if (strE0.equals("iframe")) {
            return new koj(strM0);
        }
        return xmj.f41127a;
    }

    public static voj p(Uri uri) {
        Integer intOrNull;
        String strE0 = sj3.e0(uri, ParameterNames.ID);
        return new voj((strE0 == null || (intOrNull = StringsKt.toIntOrNull(strE0)) == null) ? 0 : intOrNull.intValue());
    }

    public static hpj q(Uri uri) {
        boolean zA = a(uri, "PARAMETER_KEY_FROM_AGGREGATOR", false);
        boolean zA2 = a(uri, "PARAMETER_KEY_SHOW_NAV_BAR", true);
        String strE0 = sj3.e0(uri, "PARAMETER_KEY_BANNER_IMAGE_URL");
        if (strE0 == null) {
            strE0 = "";
        }
        String strE1 = sj3.e0(uri, "PARAMETER_KEY_BANNER_TRANSLATE_ID");
        return new hpj(strE0, strE1 != null ? strE1 : "", zA, zA2);
    }

    public static long v(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isDigit(cCharAt)) {
                break;
            }
            sb.append(cCharAt);
        }
        Long lT0 = StringsKt.t0(sb.toString());
        if (lT0 != null) {
            return lT0.longValue();
        }
        return 0L;
    }

    public static inj w(Intent intent, j700 j700Var) {
        Set setP0;
        Set setP1;
        if (intent.hasExtra("SPORT_ID")) {
            Set setB = cui0.b(Long.valueOf(intent.getLongExtra("SPORT_ID", 0L)));
            ArrayList arrayList = new ArrayList();
            for (Object obj : setB) {
                if (((Number) obj).longValue() != 0) {
                    arrayList.add(obj);
                }
            }
            setP0 = CollectionsKt.P0(arrayList);
        } else {
            setP0 = xun.f41520a;
        }
        if (intent.hasExtra("CHAMP_ID")) {
            Set setB2 = cui0.b(Long.valueOf(intent.getLongExtra("CHAMP_ID", 0L)));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : setB2) {
                if (((Number) obj2).longValue() != 0) {
                    arrayList2.add(obj2);
                }
            }
            setP1 = CollectionsKt.P0(arrayList2);
        } else {
            setP1 = xun.f41520a;
        }
        return new inj(j700Var, intent.getIntExtra("CYBER_TYPE", 0), intent.getLongExtra("subSportId", 0L), setP0, setP1, intent.getBooleanExtra("IS_CYBER", false));
    }

    public static ynj x(Uri uri) {
        Object next;
        String string;
        String strE0;
        c0o c0oVar = tw70.c;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
            string = ((tw70) next).toString();
            strE0 = sj3.e0(uri, Payload.TYPE);
            if (strE0 == null) {
                strE0 = "";
            }
        } while (!kotlin.text.c.o(string, strE0));
        tw70 tw70Var = (tw70) next;
        String strE1 = sj3.e0(uri, "subtype");
        if (strE1 == null) {
            strE1 = "";
        }
        String strE2 = sj3.e0(uri, RemoteMessageConst.Notification.URL);
        return new ynj(tw70Var, strE1, strE2 != null ? strE2 : "");
    }

    public static xlj y(Uri uri) {
        String strE0 = sj3.e0(uri, "PARAMETER_KEY_BANNER_TITLE");
        if (strE0 == null) {
            strE0 = "";
        }
        String strE1 = sj3.e0(uri, "PARAMETER_KEY_BANNER_TRANSLATE_ID");
        if (strE1 == null) {
            strE1 = "";
        }
        String strE2 = sj3.e0(uri, "PARAMETER_KEY_BANNER_LOTTERY_ID");
        int i = strE2 != null ? Integer.parseInt(strE2) : 0;
        String strE3 = sj3.e0(uri, "PARAMETER_KEY_BANNER_IMAGE_URL");
        String str = strE3 != null ? strE3 : "";
        String strE4 = sj3.e0(uri, "PARAMETER_KEY_NEED_AUTH");
        return new xlj(i, strE0, strE1, str, strE4 != null ? Boolean.parseBoolean(strE4) : true);
    }

    public static aue0 z(Intent intent) {
        Integer numValueOf;
        if (intent.hasExtra("REGISTRATION_DEFAULT_BONUS_ID")) {
            numValueOf = Integer.valueOf(intent.getIntExtra("REGISTRATION_DEFAULT_BONUS_ID", -1));
        } else {
            cge0 cge0Var = aue0.b;
            numValueOf = null;
        }
        aue0.b.getClass();
        return cge0.h(numValueOf);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x0232  */
    /* JADX WARN: Code duplicated, block: B:201:0x0364  */
    /* JADX WARN: Code duplicated, block: B:268:0x048d  */
    /* JADX WARN: Code duplicated, block: B:433:0x0725  */
    /* JADX WARN: Code duplicated, block: B:77:0x012e  */
    public final Object D(Uri uri, Intent intent, boolean z, zje zjeVar) {
        Integer intOrNull;
        boolean z2;
        Long lT0;
        Long lT1;
        Long lT2;
        Integer intOrNull2;
        Long lT3;
        String strE0;
        String strE1;
        Long lT4;
        Long lT5;
        String strE2;
        Integer intOrNull3;
        int iIntValue;
        t270 t270Var;
        d270 d270Var;
        Integer intOrNull4;
        Long lT6;
        Long lT7;
        Long lT8;
        Integer intOrNull5;
        String strE3;
        Long lT9;
        long jLongValue;
        Long lT10;
        String str;
        k9h0 k9h0Var;
        jr1 jr1Var;
        String strE4;
        Long lT11;
        fr1 fr1Var;
        Long lT12;
        String strE5;
        Long lT13;
        List<String> pathSegments = uri.getPathSegments();
        String str2 = pathSegments != null ? (String) CollectionsKt.firstOrNull(pathSegments) : null;
        if (str2 == null) {
            str2 = "";
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        boolean booleanExtra = intent.getBooleanExtra("IS_PUSH_NOTIFICATION", false);
        if (lowerCase.equals(hrj.AWARDS.toString()) || lowerCase.equals(hrj.CONTACTS.toString()) || lowerCase.equals(hrj.INFO.toString()) || lowerCase.equals(hrj.TERMS.toString())) {
            return new fnj(lowerCase);
        }
        if (lowerCase.equals(hrj.AGGREGATOR_SINGLE_GAME.toString())) {
            long jLongValue2 = (intent.getBooleanExtra("ACTIVITY_RECREATED", false) || (strE5 = sj3.e0(uri, ParameterNames.ID)) == null || (lT13 = StringsKt.t0(strE5)) == null) ? 0L : lT13.longValue();
            String strE6 = sj3.e0(uri, "needTransfer");
            return new plj(strE6 != null ? Boolean.parseBoolean(strE6) : false, jLongValue2);
        }
        boolean zEquals = lowerCase.equals(hrj.AGGREGATOR.toString());
        long jLongValue3 = Long.MIN_VALUE;
        xmj xmjVar = xmj.f41127a;
        if (zEquals) {
            String strE7 = sj3.e0(uri, Payload.TYPE);
            str = strE7 != null ? strE7 : "";
            String strE8 = sj3.e0(uri, ParameterNames.ID);
            long jLongValue4 = (strE8 == null || (lT12 = StringsKt.t0(strE8)) == null) ? 0L : lT12.longValue();
            String strE9 = sj3.e0(uri, "section");
            if (strE9 != null) {
                switch (strE9) {
                    case "brands":
                        k9h0Var = k9h0.A1;
                        break;
                    case "tournaments":
                        k9h0Var = k9h0.r1;
                        break;
                    case "mycasino":
                        k9h0Var = k9h0.p1;
                        break;
                    case "promo":
                        k9h0Var = k9h0.u1;
                        break;
                    case "tvbet":
                        k9h0Var = k9h0.w1;
                        break;
                    case "virtual":
                        k9h0Var = k9h0.I1;
                        break;
                    case "categories":
                        k9h0Var = k9h0.q1;
                        break;
                    default:
                        k9h0Var = k9h0.b;
                        break;
                }
            } else {
                k9h0Var = k9h0.b;
            }
            int iOrdinal = k9h0Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 55) {
                    if (iOrdinal == 58) {
                        return new gpj();
                    }
                    if (iOrdinal == 62) {
                        return new olj(new er1(true, intent.getBooleanExtra("ACTIVITY_RECREATED", false) ? 0L : jLongValue4));
                    }
                    if (iOrdinal == 70) {
                        return new qlj();
                    }
                    switch (iOrdinal) {
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            return new olj(str.equals("vipcashback") ? new hr1(-10L, 2) : new hr1(0L, 3));
                        case 51:
                            if (jLongValue4 == 0) {
                                jLongValue4 = Long.MIN_VALUE;
                            }
                            boolean booleanExtra2 = intent.getBooleanExtra("ACTIVITY_RECREATED", false);
                            long j = booleanExtra2 ? Long.MIN_VALUE : jLongValue4;
                            long jLongValue5 = (booleanExtra2 || (strE4 = sj3.e0(uri, "partId")) == null || (lT11 = StringsKt.t0(strE4)) == null) ? 0L : lT11.longValue();
                            List listB = booleanExtra2 ? iun.f15405a : B(uri, "filterid");
                            q91 q91Var = booleanExtra ? q91.c : q91.b;
                            int iHashCode = str.hashCode();
                            if (iHashCode != -987494927) {
                                if (iHashCode != 3165170) {
                                    if (iHashCode == 1300380478 && str.equals("subcategory")) {
                                        fr1Var = new fr1(new fs80(null, j, listB, null, 0L, false, 121), q91Var);
                                    } else {
                                        fr1Var = new fr1(null, q91Var, 1);
                                    }
                                } else if (str.equals("game")) {
                                    fr1Var = new fr1(new fs80(null, 0L, null, null, j, false, 111), q91Var);
                                } else {
                                    fr1Var = new fr1(null, q91Var, 1);
                                }
                            } else if (str.equals("provider")) {
                                fr1Var = new fr1((jLongValue5 == nw80.b.getId() || jLongValue5 == nw80.f24223a.getId()) ? new fs80(null, jLongValue5, null, kotlin.collections.a.c(Long.valueOf(j)), 0L, false, 117) : new fs80(null, 0L, null, null, 0L, false, 127), q91Var);
                            } else {
                                fr1Var = new fr1(null, q91Var, 1);
                            }
                            return new olj(fr1Var);
                        case 52:
                            return new olj(str.equals("tournament") ? new jr1(new evc0(false, intent.getBooleanExtra("ACTIVITY_RECREATED", false) ? 0L : jLongValue4)) : new jr1(new evc0(false, intent.getBooleanExtra("OPEN_NATIVE_TOURNAMENT", false) ? intent.getLongExtra("casinoNativeTournamentId", 0L) : intent.getLongExtra("casinoTournamentId", 0L))));
                    }
                }
                long j2 = intent.getBooleanExtra("ACTIVITY_RECREATED", false) ? 0L : jLongValue4;
                switch (str) {
                    case "tournament":
                        jr1Var = new jr1(new evc0(false, j2));
                        break;
                    case "prizes":
                        jr1Var = new jr1(new cvc0(d7v.b));
                        break;
                    case "tournaments":
                        jr1Var = new jr1(new evc0(false, 0L));
                        break;
                    case "promocode":
                        jr1Var = new jr1(new dvc0((int) j2));
                        break;
                    case "freespins":
                        jr1Var = new jr1(new cvc0(d7v.d));
                        break;
                    case "bonuses":
                        jr1Var = new jr1(new cvc0(d7v.c));
                        break;
                    case "nativetournament":
                        jr1Var = new jr1(new evc0(false, j2));
                        break;
                    default:
                        jr1Var = new jr1();
                        break;
                }
                return new olj(jr1Var);
            }
        } else {
            if (lowerCase.equals(hrj.AUTHENTICATOR.toString())) {
                return new rlj("", r080.f29619a);
            }
            if (lowerCase.equals(hrj.OPEN_LINK.toString())) {
                return x(uri);
            }
            if (lowerCase.equals(hrj.TRANSITION_TG_BOT.toString())) {
                return new fpj();
            }
            if (lowerCase.equals(hrj.LOGIN.toString())) {
                return new jnj(intent.getIntExtra("AUTH_NOTIFICATION_TYPE", 0), z(intent));
            }
            if (lowerCase.equals(hrj.REGISTRATION.toString())) {
                return new noj(z(intent));
            }
            if (lowerCase.equals(hrj.FAVORITE_EVENTS.toString())) {
                String queryParameter = uri.getQueryParameter(Payload.TYPE);
                str = queryParameter != null ? queryParameter : "";
                frj.b.getClass();
                return new anj(kud.d(str));
            }
            if (lowerCase.equals(hrj.COUPON.toString())) {
                String strE10 = sj3.e0(uri, ParameterNames.ID);
                return new hmj(strE10 != null ? strE10 : "", false);
            }
            if (lowerCase.equals(hrj.GET_COUPON.toString())) {
                String strE11 = sj3.e0(uri, ParameterNames.ID);
                return new hmj(strE11 != null ? strE11 : "", true);
            }
            if (lowerCase.equals(hrj.SPORTS.toString())) {
                String strE12 = sj3.e0(uri, "oppId");
                Long lT14 = strE12 != null ? StringsKt.t0(strE12) : null;
                if (lT14 != null) {
                    return new cpj(lT14.longValue());
                }
                String strE13 = sj3.e0(uri, Payload.TYPE);
                if (strE13 == null) {
                    strE13 = "";
                }
                if (sj3.e0(uri, "sportid") != null) {
                    String strE14 = sj3.e0(uri, "sportid");
                    if (strE14 == null || (lT10 = StringsKt.t0(strE14)) == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = lT10.longValue();
                    }
                } else if (sj3.e0(uri, ParameterNames.ID) == null || (strE3 = sj3.e0(uri, ParameterNames.ID)) == null || (lT9 = StringsKt.t0(strE3)) == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = lT9.longValue();
                }
                Set setB = cui0.b(Long.valueOf(jLongValue));
                ArrayList arrayList = new ArrayList();
                for (Object obj : setB) {
                    if (((Number) obj).longValue() != 0) {
                        arrayList.add(obj);
                    }
                }
                return new inj(strE13.equals("live") ? j700.b : j700.f16016a, 0, 0L, CollectionsKt.P0(arrayList), xun.f41520a, false);
            }
            if (lowerCase.equals(hrj.STREAM.toString())) {
                return new xoj();
            }
            if (lowerCase.equals(hrj.CHAMPS.toString())) {
                String strE15 = sj3.e0(uri, Payload.TYPE);
                if (strE15 == null) {
                    strE15 = "";
                }
                String strE16 = sj3.e0(uri, "cybertype");
                int iIntValue2 = (strE16 == null || (intOrNull5 = StringsKt.toIntOrNull(strE16)) == null) ? 0 : intOrNull5.intValue();
                String strE17 = sj3.e0(uri, "sportid");
                long jLongValue6 = (strE17 == null || (lT8 = StringsKt.t0(strE17)) == null) ? 0L : lT8.longValue();
                String strE18 = sj3.e0(uri, "champid");
                long jLongValue7 = (strE18 == null || (lT7 = StringsKt.t0(strE18)) == null) ? 0L : lT7.longValue();
                String strE19 = sj3.e0(uri, "iscyber");
                boolean z3 = strE19 != null ? Boolean.parseBoolean(strE19) : false;
                Set setB2 = cui0.b(Long.valueOf(jLongValue6));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : setB2) {
                    if (((Number) obj2).longValue() != 0) {
                        arrayList2.add(obj2);
                    }
                }
                Set setP0 = CollectionsKt.P0(arrayList2);
                Set setB3 = cui0.b(Long.valueOf(jLongValue7));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : setB3) {
                    if (((Number) obj3).longValue() != 0) {
                        arrayList3.add(obj3);
                    }
                }
                return new inj(strE15.equals("live") ? j700.b : j700.f16016a, iIntValue2, intent.getLongExtra("subSportId", 0L), setP0, CollectionsKt.P0(arrayList3), z3);
            }
            if (lowerCase.equals(hrj.GAME.toString())) {
                String strE20 = sj3.e0(uri, Payload.TYPE);
                String str3 = strE20 == null ? "" : strE20;
                String strE21 = sj3.e0(uri, ParameterNames.ID);
                long jLongValue8 = (strE21 == null || (lT6 = StringsKt.t0(strE21)) == null) ? 0L : lT6.longValue();
                if (jLongValue8 != 0) {
                    long longExtra = intent.getLongExtra("SPORT_ID", 0L);
                    intent.removeExtra("SPORT_ID");
                    long longExtra2 = intent.getLongExtra("selected_sub_game_id", 0L);
                    intent.removeExtra("selected_sub_game_id");
                    long longExtra3 = intent.getLongExtra("subSportId", 0L);
                    intent.removeExtra("subSportId");
                    return new bnj(jLongValue8, longExtra2, longExtra, longExtra3, str3.equals("live"));
                }
            } else {
                if (lowerCase.equals(hrj.GAMES.toString())) {
                    String strE22 = sj3.e0(uri, Payload.TYPE);
                    if (strE22 == null) {
                        strE22 = "";
                    }
                    String strE23 = sj3.e0(uri, ParameterNames.ID);
                    if (strE23 == null || (intOrNull4 = StringsKt.toIntOrNull(strE23)) == null) {
                        String strE24 = sj3.e0(uri, "xGamesGameId");
                        Integer intOrNull6 = strE24 != null ? StringsKt.toIntOrNull(strE24) : null;
                        iIntValue = intOrNull6 != null ? intOrNull6.intValue() : 0;
                    } else {
                        iIntValue = intOrNull4.intValue();
                    }
                    String strE25 = sj3.e0(uri, "category");
                    if (strE25 == null) {
                        strE25 = "";
                    }
                    String strE26 = sj3.e0(uri, RemoteMessageConst.FROM);
                    String str4 = strE26 == null ? "" : strE26;
                    if (strE25.length() > 0) {
                        return new pnj(strE25);
                    }
                    if (!strE22.equalsIgnoreCase("cashback") && !strE22.equalsIgnoreCase("bonuses") && !strE22.equalsIgnoreCase("favorites")) {
                        if (!strE22.equalsIgnoreCase("promo")) {
                            return (strE22.length() == 0 && strE25.length() == 0 && iIntValue != 0) ? new qnj(iIntValue, str4) : new wnj(t270.f33203a);
                        }
                        if (iIntValue == 1) {
                            d270Var = d270.BONUS;
                        } else if (iIntValue == 3) {
                            d270Var = d270.DAILY_TOURNAMENT;
                        } else if (iIntValue != 5) {
                            d270Var = iIntValue != 7 ? d270.UNKNOWN : d270.WEEKLY_REWARD;
                        } else {
                            d270Var = d270.JACKPOT;
                        }
                        return new unj(d270Var);
                    }
                    int iHashCode2 = strE22.hashCode();
                    if (iHashCode2 != -1785238953) {
                        if (iHashCode2 != 24489626) {
                            if (iHashCode2 == 64069901 && strE22.equals("bonuses")) {
                                t270Var = t270.b;
                            } else {
                                t270Var = t270.f33203a;
                            }
                        } else if (strE22.equals("cashback")) {
                            t270Var = t270.c;
                        } else {
                            t270Var = t270.f33203a;
                        }
                    } else if (strE22.equals("favorites")) {
                        t270Var = t270.d;
                    } else {
                        t270Var = t270.f33203a;
                    }
                    return new wnj(t270Var);
                }
                if (lowerCase.equals(hrj.CHAMPIONS_CLUB.toString())) {
                    return new dmj();
                }
                if (lowerCase.equals(hrj.EXPRESS.toString())) {
                    return new ymj(false);
                }
                if (lowerCase.equals(hrj.PROMO.toString())) {
                    String strE27 = sj3.e0(uri, ParameterNames.ID);
                    return new hoj((strE27 == null || (intOrNull3 = StringsKt.toIntOrNull(strE27)) == null) ? 0 : intOrNull3.intValue());
                }
                if (lowerCase.equals(hrj.PROMO_SHOP.toString())) {
                    Uri data = intent.getData();
                    Integer intOrNull7 = (data == null || (strE2 = sj3.e0(data, "REGISTRATION_DEFAULT_BONUS_ID")) == null) ? null : StringsKt.toIntOrNull(strE2);
                    String strE28 = sj3.e0(uri, "bonusGameId");
                    long jLongValue9 = (strE28 == null || (lT5 = StringsKt.t0(strE28)) == null) ? 0L : lT5.longValue();
                    aue0.b.getClass();
                    return new joj(jLongValue9, cge0.h(intOrNull7));
                }
                if (lowerCase.equals(hrj.PROMOCODES.toString())) {
                    return new goj();
                }
                if (lowerCase.equals(hrj.BONUSES.toString())) {
                    return new cmj();
                }
                if (lowerCase.equals(hrj.USER_PROFILE.toString())) {
                    return new mpj();
                }
                if (Intrinsics.d(lowerCase, hrj.USER_PROFILE_LANG.toString())) {
                    return new npj();
                }
                if (Intrinsics.d(lowerCase, hrj.USER_PROFILE_ONE_CLICK_BET.toString())) {
                    return new opj();
                }
                if (Intrinsics.d(lowerCase, hrj.USER_PROFILE_SECURITY_SETTINGS.toString())) {
                    return new qpj();
                }
                if (Intrinsics.d(lowerCase, hrj.USER_PROFILE_SECURITY_QUESTION.toString())) {
                    return new ppj();
                }
                if (Intrinsics.d(lowerCase, hrj.USER_PROFILE_TWO_FACTOR.toString())) {
                    return new rpj();
                }
                if (Intrinsics.d(lowerCase, hrj.USER_PROFILE_WITHDRAW.toString())) {
                    return new spj();
                }
                if (Intrinsics.d(lowerCase, hrj.MENU.toString())) {
                    String strE29 = sj3.e0(uri, Payload.TYPE);
                    if ((strE29 == null ? "" : strE29).equals("xgames")) {
                        return new snj();
                    }
                } else {
                    if (Intrinsics.d(lowerCase, hrj.TOTO.toString())) {
                        return new epj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.SEARCH.toString())) {
                        return new soj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.RESULTS.toString())) {
                        return new poj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.CYBER_FAQ.toString())) {
                        return new lmj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.EDIT_PROFILE.toString())) {
                        return new doj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.EDIT_PROFILE_DATA.toString())) {
                        return new wmj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.SUPPORT.toString())) {
                        return new yoj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.JACKPOT_TOTO.toString())) {
                        return new hnj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.PRIVATE_MESSAGES.toString())) {
                        return new foj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.POPULAR.toString())) {
                        return new eoj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.CREATE_LOGIN.toString())) {
                        return new vmj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.BIND_EMAIL.toString())) {
                        return new tmj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.CHANGE_PASSWORD.toString())) {
                        return new umj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.SUPPORT_CHAT.toString())) {
                        return new apj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.CALL_BACK.toString())) {
                        return new zoj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.ONLINE_CALL.toString())) {
                        return new xnj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.PAYMENT_SUPPORT.toString())) {
                        return new coj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.BALANCES.toString())) {
                        return new ulj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.ADD_BALANCE.toString())) {
                        return new nlj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.ACCOUNT.toString())) {
                        return new llj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.LOTTO.toString())) {
                        return new knj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.ACCOUNT_SELECTION.toString())) {
                        return new mlj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.PROMOPAGE.toString())) {
                        return new ioj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.PROMOPAGE_BONUS_GAMES.toString())) {
                        return new bmj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.PROMOPAGE_CHOOSE_BONUS.toString())) {
                        return new gmj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.PROMOPAGE_CHOICE_CASHBACK.toString())) {
                        return new emj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.PROMOPAGE_CHOICE_VIP_CASHBACK.toString())) {
                        return new fmj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.HISTORY.toString())) {
                        return new dnj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.VIRTUAL.toString())) {
                        String strE30 = sj3.e0(uri, "section");
                        if (Intrinsics.d(strE30, "myvirtual")) {
                            return new tpj(new hr1(0L, 3));
                        }
                        if (!Intrinsics.d(strE30, "categories")) {
                            return xmjVar;
                        }
                        boolean booleanExtra3 = intent.getBooleanExtra("ACTIVITY_RECREATED", false);
                        if (!booleanExtra3 && (strE1 = sj3.e0(uri, ParameterNames.ID)) != null && (lT4 = StringsKt.t0(strE1)) != null) {
                            jLongValue3 = lT4.longValue();
                        }
                        long j3 = jLongValue3;
                        List listB2 = booleanExtra3 ? iun.f15405a : B(uri, "filterid");
                        q91 q91Var2 = booleanExtra ? q91.c : q91.b;
                        String strE31 = sj3.e0(uri, Payload.TYPE);
                        String str5 = strE31 == null ? "" : strE31;
                        return new tpj(str5.equals("subcategory") ? new fr1(new fs80(null, j3, listB2, null, 0L, false, 121), q91Var2) : str5.equals("game") ? new fr1(new fs80(null, 0L, null, null, j3, false, 111), q91Var2) : new fr1(null, q91Var2, 1));
                    }
                    if (Intrinsics.d(lowerCase, hrj.PAY_SYSTEMS.toString())) {
                        Uri data2 = intent.getData();
                        Integer intOrNull8 = (data2 == null || (strE0 = sj3.e0(data2, "REGISTRATION_DEFAULT_BONUS_ID")) == null) ? null : StringsKt.toIntOrNull(strE0);
                        String strE32 = sj3.e0(uri, "balanceId");
                        long jLongValue10 = (strE32 == null || (lT3 = StringsKt.t0(strE32)) == null) ? 0L : lT3.longValue();
                        aue0.b.getClass();
                        return new znj(jLongValue10, cge0.h(intOrNull8));
                    }
                    if (Intrinsics.d(lowerCase, hrj.PAYMENT_CONSULTANT.toString())) {
                        return new boj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.CYBER.toString())) {
                        String strE33 = sj3.e0(uri, "cybertype");
                        int iIntValue3 = (strE33 == null || (intOrNull2 = StringsKt.toIntOrNull(strE33)) == null) ? 0 : intOrNull2.intValue();
                        String strE34 = sj3.e0(uri, "isEWC");
                        return new imj(iIntValue3, strE34 != null ? Boolean.parseBoolean(strE34) : false);
                    }
                    if (Intrinsics.d(lowerCase, hrj.SCANNER.toString())) {
                        String queryParameter2 = uri.getQueryParameter(Payload.TYPE);
                        return new roj(queryParameter2 == null ? "" : queryParameter2);
                    }
                    if (Intrinsics.d(lowerCase, hrj.CYBER_GAME.toString())) {
                        String strE35 = sj3.e0(uri, ParameterNames.ID);
                        long jLongValue11 = (strE35 == null || (lT2 = StringsKt.t0(strE35)) == null) ? 0L : lT2.longValue();
                        String strE36 = sj3.e0(uri, "sportid");
                        long jLongValue12 = (strE36 == null || (lT1 = StringsKt.t0(strE36)) == null) ? 0L : lT1.longValue();
                        String strE37 = sj3.e0(uri, "subsportid");
                        long jLongValue13 = (strE37 == null || (lT0 = StringsKt.t0(strE37)) == null) ? 0L : lT0.longValue();
                        String strE38 = sj3.e0(uri, Payload.TYPE);
                        String lowerCase2 = (strE38 == null ? "" : strE38).toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        if (lowerCase2.equals("live")) {
                            z2 = true;
                        } else {
                            lowerCase2.equals("line");
                            z2 = false;
                        }
                        return new mmj(jLongValue11, jLongValue12, jLongValue13, z2);
                    }
                    if (Intrinsics.d(lowerCase, hrj.CYBER_GAMES.toString())) {
                        return g(uri);
                    }
                    if (Intrinsics.d(lowerCase, hrj.CYBER_DISCIPLINE.toString())) {
                        return f(uri);
                    }
                    if (Intrinsics.d(lowerCase, hrj.CYBER_RANDOM_DISCIPLINE.toString())) {
                        return i(zjeVar);
                    }
                    if (Intrinsics.d(lowerCase, hrj.CYBER_CHAMP.toString())) {
                        return e(uri);
                    }
                    if (Intrinsics.d(lowerCase, hrj.CYBER_TOP_CHAMPS.toString())) {
                        return k(uri);
                    }
                    if (Intrinsics.d(lowerCase, hrj.HLTV_AWARDS.toString())) {
                        String strE39 = sj3.e0(uri, "cybertype");
                        return new nmj((strE39 == null || (intOrNull = StringsKt.toIntOrNull(strE39)) == null) ? 0 : intOrNull.intValue());
                    }
                    if (Intrinsics.d(lowerCase, hrj.CYBER_PARTNER_TEAM.toString())) {
                        return h(uri);
                    }
                    if (Intrinsics.d(lowerCase, hrj.GLOBAL_CHAMP.toString())) {
                        return p(uri);
                    }
                    if (Intrinsics.d(lowerCase, hrj.SWIPE.toString())) {
                        return new bpj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.FAST_GAMES.toString())) {
                        return new zmj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.BET_ON_YOUR_NATIONAL_TEAM.toString())) {
                        return d(uri);
                    }
                    if (Intrinsics.d(lowerCase, hrj.REFERRAL_PROGRAM.toString())) {
                        return new moj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.BIND_NUMBER.toString())) {
                        return new zlj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.BIND_PHONE.toString())) {
                        return new amj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.B2B_CONFIG.toString())) {
                        return b(uri);
                    }
                    if (Intrinsics.d(lowerCase, hrj.PROMOTION.toString())) {
                        return o(z, uri);
                    }
                    if (Intrinsics.d(lowerCase, hrj.BANNER.toString())) {
                        return c(uri);
                    }
                    Locale locale = Locale.ROOT;
                    String lowerCase3 = "AGGREGATOR_TV_BET_JACKPOT".toLowerCase(locale);
                    lowerCase3.getClass();
                    if (Intrinsics.d(lowerCase, lowerCase3)) {
                        return q(uri);
                    }
                    String lowerCase4 = "BET_WITHOUT_RISK".toLowerCase(locale);
                    lowerCase4.getClass();
                    if (Intrinsics.d(lowerCase, lowerCase4)) {
                        return y(uri);
                    }
                    String lowerCase5 = "NEWS_MAIN".toLowerCase(locale);
                    lowerCase5.getClass();
                    if (Intrinsics.d(lowerCase, lowerCase5)) {
                        return l(uri);
                    }
                    String lowerCase6 = "NEWS_PAGER".toLowerCase(locale);
                    lowerCase6.getClass();
                    if (Intrinsics.d(lowerCase, lowerCase6)) {
                        return m(uri);
                    }
                    String lowerCase7 = "ONE_X_GAMES_BONUSES".toLowerCase(locale);
                    lowerCase7.getClass();
                    if (Intrinsics.d(lowerCase, lowerCase7)) {
                        return new onj();
                    }
                    String lowerCase8 = "ONE_X_GAMES_JACKPOT".toLowerCase(locale);
                    lowerCase8.getClass();
                    if (Intrinsics.d(lowerCase, lowerCase8)) {
                        return new rnj();
                    }
                    String lowerCase9 = "ONE_X_GAMES_GAME".toLowerCase(locale);
                    lowerCase9.getClass();
                    if (Intrinsics.d(lowerCase, lowerCase9)) {
                        return n(uri);
                    }
                    if (Intrinsics.d(lowerCase, hrj.CYBER_TEAM_DETAILS_AND_PARTNER_TEAM.toString())) {
                        return j(uri);
                    }
                    if (Intrinsics.d(lowerCase, hrj.UFC_MAIN.toString())) {
                        return new lpj();
                    }
                    if (Intrinsics.d(lowerCase, hrj.UFC_FIGHTER.toString())) {
                        return new kpj(C(this, uri, ParameterNames.ID));
                    }
                    if (Intrinsics.d(lowerCase, hrj.UFC_CHAMP.toString())) {
                        return new ipj(C(this, uri, ParameterNames.ID));
                    }
                    if (Intrinsics.d(lowerCase, hrj.UFC_FIGHT.toString())) {
                        long jC = C(this, uri, ParameterNames.ID);
                        String strE40 = sj3.e0(uri, Payload.TYPE);
                        return new jpj(kotlin.text.c.o("live", strE40 == null ? "" : strE40), jC);
                    }
                }
            }
        }
        return xmjVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(String str, Intent intent, boolean z, zje zjeVar) {
        orj orjVar;
        upj upjVar;
        Uri data;
        String strE0;
        if (zjeVar instanceof orj) {
            orjVar = (orj) zjeVar;
            int i = orjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                orjVar.l = i - Integer.MIN_VALUE;
            } else {
                orjVar = new orj(this, zjeVar);
            }
        } else {
            orjVar = new orj(this, zjeVar);
        }
        Object objD = orjVar.j;
        Object obj = wne.f39444a;
        int i2 = orjVar.l;
        if (i2 == 0) {
            z1x.P(objD);
            Uri data2 = intent.getData();
            String strE1 = data2 != null ? sj3.e0(data2, "deeplink") : null;
            if (strE1 == null) {
                strE1 = "";
            }
            if (strE1.length() == 0) {
                upjVar = xmj.f41127a;
            } else {
                Uri uri = Uri.parse(str + "://" + strE1);
                orjVar.i = intent;
                orjVar.l = 1;
                objD = D(uri, intent, z, orjVar);
                if (objD == obj) {
                    return obj;
                }
            }
            data = intent.getData();
            if (data != null) {
                strE0 = sj3.e0(data, "botId");
            } else {
                strE0 = null;
            }
            if (strE0 == null) {
                strE0 = "";
            }
            Uri data3 = intent.getData();
            String strE2 = data3 != null ? sj3.e0(data3, "tgUserToken") : null;
            return new dpj(upjVar, strE0, strE2 != null ? strE2 : "");
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        intent = orjVar.i;
        z1x.P(objD);
        upjVar = (upj) objD;
        data = intent.getData();
        if (data != null) {
            strE0 = sj3.e0(data, "botId");
        } else {
            strE0 = null;
        }
        if (strE0 == null) {
            strE0 = "";
        }
        Uri data4 = intent.getData();
        if (data4 != null) {
        }
        return new dpj(upjVar, strE0, strE2 != null ? strE2 : "");
    }

    public final vlj c(Uri uri) {
        return new vlj(A(this, uri, ParameterNames.ID));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(zje zjeVar) throws Throwable {
        lrj lrjVar;
        if (zjeVar instanceof lrj) {
            lrjVar = (lrj) zjeVar;
            int i = lrjVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lrjVar.k = i - Integer.MIN_VALUE;
            } else {
                lrjVar = new lrj(this, zjeVar);
            }
        } else {
            lrjVar = new lrj(this, zjeVar);
        }
        Object objJ = lrjVar.i;
        wne wneVar = wne.f39444a;
        int i2 = lrjVar.k;
        if (i2 == 0) {
            z1x.P(objJ);
            lrjVar.k = 1;
            objJ = this.c.j(lrjVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        cmg cmgVar = (cmg) objJ;
        return new kmj(CyberGamesPage.Virtual.INSTANCE.f46556a, cmgVar != null ? cmgVar.f4602a : 0L, true);
    }

    public final upj j(Uri uri) {
        long jC = C(this, uri, "subsportid");
        String strE0 = sj3.e0(uri, "team_name");
        if (strE0 == null) {
            strE0 = "";
        }
        String str = strE0;
        long jC2 = C(this, uri, "feedid");
        return (jC == 0 || jC2 == 0) ? new omj(str, jC2) : new qmj(jC, jC2, str);
    }

    public final mnj l(Uri uri) {
        return new mnj(A(this, uri, "PARAMETER_KEY_POSITION"), A(this, uri, "PARAMETER_KEY_BANNER_ID"), A(this, uri, "PARAMETER_KEY_BANNER_TYPE"), a(uri, "PARAMETER_KEY_FROM_AGGREGATOR", false), a(uri, "PARAMETER_KEY_SHOW_NAV_BAR", true));
    }

    public final nnj m(Uri uri) {
        boolean zA = a(uri, "PARAMETER_KEY_SHOW_NAV_BAR", true);
        boolean zA2 = a(uri, "PARAMETER_KEY_NEED_AUTH", true);
        String strE0 = sj3.e0(uri, "PARAMETER_KEY_BANNER_TRANSLATE_ID");
        if (strE0 == null) {
            strE0 = "";
        }
        String strE1 = sj3.e0(uri, "PARAMETER_KEY_BANNER_TITLE");
        String str = strE1 != null ? strE1 : "";
        bj5 bj5Var = oo5.b;
        Integer numValueOf = Integer.valueOf(A(this, uri, "PARAMETER_KEY_BANNER_ACTION_TYPE"));
        bj5Var.getClass();
        oo5 oo5VarC = bj5.c(numValueOf);
        if (oo5VarC == null) {
            oo5VarC = oo5.ACTION_INFO;
        }
        return new nnj(zA, zA2, strE0, str, oo5VarC, A(this, uri, "PARAMETER_KEY_BANNER_PRIZE_FLAG"));
    }

    public final qnj n(Uri uri) {
        return new qnj(C(this, uri, "PARAMETER_KEY_GAME_ID"), "");
    }

    public final Object r(Intent intent, mqj mqjVar) {
        long longExtra = intent.getLongExtra("selected_game_id", 0L);
        k9h0 k9h0VarA = blx.a(intent);
        if (longExtra != 0) {
            intent.removeExtra("selected_game_id");
            long longExtra2 = intent.getLongExtra("sportId", 0L);
            intent.removeExtra("sportId");
            long longExtra3 = intent.getLongExtra("subSportId", 0L);
            intent.removeExtra("subSportId");
            boolean booleanExtra = intent.getBooleanExtra("is_live", false);
            intent.removeExtra("is_live");
            long longExtra4 = intent.getLongExtra("selected_sub_game_id", 0L);
            intent.removeExtra("selected_sub_game_id");
            return new woj(longExtra, longExtra4, longExtra2, (longExtra2 != 40 || longExtra3 == 0) ? 0L : longExtra3, booleanExtra);
        }
        if (intent.getLongExtra("selected_game_id", 0L) != 0) {
            long longExtra5 = intent.getLongExtra("SPORT_ID", 0L);
            intent.removeExtra("SPORT_ID");
            long longExtra6 = intent.getLongExtra("selected_game_id", 0L);
            intent.removeExtra("selected_game_id");
            long longExtra7 = intent.getLongExtra("selected_sub_game_id", 0L);
            intent.removeExtra("selected_sub_game_id");
            long longExtra8 = intent.getLongExtra("subSportId", 0L);
            intent.removeExtra("subSportId");
            boolean booleanExtra2 = intent.getBooleanExtra("is_live", false);
            intent.removeExtra("is_live");
            return new bnj(longExtra6, longExtra7, longExtra5, longExtra8, booleanExtra2);
        }
        String stringExtra = intent.getStringExtra("mass_mailing_key");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() > 0) {
            return new lnj();
        }
        if (intent.getBooleanExtra("link_start_key", false)) {
            String stringExtra2 = intent.getStringExtra("link_start_url");
            if (stringExtra2 != null) {
                return new gnj(stringExtra2);
            }
        } else {
            if (intent.getBooleanExtra("SHOW_AUTHORIZATION", false)) {
                intent.removeExtra("SHOW_AUTHORIZATION");
                return new slj(false);
            }
            if (intent.getBooleanExtra("limited_blocked_logon", false)) {
                intent.removeExtra("limited_blocked_logon");
                return new slj(true);
            }
            if (intent.getBooleanExtra("SHOW_SETTINGS", false)) {
                intent.removeExtra("SHOW_SETTINGS");
                return new toj();
            }
            if (intent.getBooleanExtra("SHOW_POPULAR", false)) {
                intent.removeExtra("SHOW_POPULAR");
                return new eoj();
            }
            if (intent.getBooleanExtra("SHOW_SUPPORT_CHAT", false)) {
                intent.removeExtra("SHOW_SUPPORT_CHAT");
                return new apj();
            }
            if (intent.getBooleanExtra("REQUEST_FAVORITES_WIDGET", false)) {
                return new ooj();
            }
            if (intent.getBooleanExtra("SHOW_FAVORITES", false)) {
                return new anj(frj.Unknown);
            }
            if (intent.getBooleanExtra("OPEN_PAYMENT", false)) {
                intent.removeExtra("OPEN_PAYMENT");
                return new znj();
            }
            if (k9h0VarA != null) {
                intent.removeExtra("OPEN_SCREEN");
                Object objT = t(intent, k9h0VarA, mqjVar);
                return objT == wne.f39444a ? objT : (upj) objT;
            }
        }
        return xmj.f41127a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(zje zjeVar, Intent intent, String str) {
        mrj mrjVar;
        Uri uri;
        String scheme;
        if (zjeVar instanceof mrj) {
            mrjVar = (mrj) zjeVar;
            int i = mrjVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrjVar.m = i - Integer.MIN_VALUE;
            } else {
                mrjVar = new mrj(this, zjeVar);
            }
        } else {
            mrjVar = new mrj(this, zjeVar);
        }
        Object obj = mrjVar.k;
        Object obj2 = wne.f39444a;
        int i2 = mrjVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            Uri uri2 = Uri.parse(str);
            boolean z = ((sff0) this.d.getValue()).f1;
            mrjVar.i = str;
            mrjVar.j = uri2;
            mrjVar.m = 1;
            Object objD = D(uri2, intent, z, mrjVar);
            if (objD == obj2) {
                return obj2;
            }
            uri = uri2;
            obj = objD;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri = mrjVar.j;
            str = mrjVar.i;
            z1x.P(obj);
        }
        upj upjVar = (upj) obj;
        return (!(upjVar instanceof xmj) || (scheme = uri.getScheme()) == null || scheme.length() <= 0 || scheme.equalsIgnoreCase(this.f27468a.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0)))) ? upjVar : new ynj(tw70.f34636a, "", str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x0305  */
    /* JADX WARN: Code duplicated, block: B:220:0x042f  */
    /* JADX WARN: Code duplicated, block: B:227:0x045e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object t(Intent intent, k9h0 k9h0Var, zje zjeVar) {
        nrj nrjVar;
        Object obj;
        String stringExtra;
        String str;
        Uri uri;
        long[] longArrayExtra;
        List listF0;
        lr1 fr1Var;
        long j;
        fs80 fs80Var;
        jr1 jr1Var;
        boolean z;
        long[] longArrayExtra2;
        List listF1;
        String scheme;
        if (zjeVar instanceof nrj) {
            nrjVar = (nrj) zjeVar;
            int i = nrjVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrjVar.m = i - Integer.MIN_VALUE;
            } else {
                nrjVar = new nrj(this, zjeVar);
            }
        } else {
            nrjVar = new nrj(this, zjeVar);
        }
        Object obj2 = nrjVar.k;
        Object obj3 = wne.f39444a;
        int i2 = nrjVar.m;
        String str2 = "";
        if (i2 == 0) {
            z1x.P(obj2);
            boolean booleanExtra = intent.getBooleanExtra("IS_PUSH_NOTIFICATION", false);
            nrj nrjVar2 = nrjVar;
            switch (k9h0Var.ordinal()) {
                case 1:
                    return new jnj(intent.getIntExtra("AUTH_NOTIFICATION_TYPE", 0), z(intent));
                case 2:
                    return new noj(z(intent));
                case 3:
                    return new eoj();
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
                    return xmj.f41127a;
                case 7:
                    return new doj();
                case 11:
                    return new wlj(intent.getLongExtra("PARAM_TYPE", 0L), intent.getLongExtra("PARAM_ID", 0L));
                case 16:
                    return new cnj(j700.f16016a);
                case 17:
                case 18:
                    return w(intent, j700.f16016a);
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                case 23:
                    return new bnj(intent.getLongExtra("PARAM_ID", 0L), 0L, intent.getLongExtra("SPORT_ID", 0L), intent.getLongExtra("subSportId", 0L), k9h0Var == k9h0.t);
                case 20:
                    return new cnj(j700.b);
                case 21:
                case 22:
                    return w(intent, j700.b);
                case 24:
                    return new xoj();
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    return new zmj();
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    return new hoj(0);
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    return new hoj(intent.getIntExtra("PARAM_ID", 0));
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    return new ymj(true);
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    obj = obj3;
                    boolean booleanExtra2 = intent.getBooleanExtra("ACTIVITY_RECREATED", false);
                    intent.removeExtra("ACTIVITY_RECREATED");
                    if (!booleanExtra2 && (stringExtra = intent.getStringExtra("PARAM_URL")) != null) {
                        str2 = stringExtra;
                    }
                    if (str2.length() == 0) {
                        return new mpj();
                    }
                    nrjVar2.i = null;
                    nrjVar2.m = 1;
                    Object objS = s(nrjVar2, intent, str2);
                    return objS == obj ? obj : objS;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    String stringExtra2 = intent.getStringExtra("PARAM_URL");
                    str = (stringExtra2 == null && (stringExtra2 = intent.getStringExtra("PARAM_DEEPLINK")) == null) ? "" : stringExtra2;
                    Uri uri2 = Uri.parse(str);
                    boolean z2 = ((sff0) this.d.getValue()).f1;
                    nrjVar2.i = str;
                    nrjVar2.j = uri2;
                    nrjVar2.m = 2;
                    Object objD = D(uri2, intent, z2, nrjVar2);
                    obj = obj3;
                    if (objD != obj) {
                        obj2 = objD;
                        uri = uri2;
                    }
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    return new foj();
                case 32:
                    String stringExtra3 = intent.getStringExtra("PARAM_ID");
                    str2 = stringExtra3 != null ? stringExtra3 : "";
                    Serializable serializableExtra = intent.getSerializableExtra("PARAM_TYPE");
                    r080 r080Var = serializableExtra instanceof r080 ? (r080) serializableExtra : null;
                    if (r080Var == null) {
                        r080Var = r080.f29619a;
                    }
                    return new rlj(str2, r080Var);
                case 34:
                    long longExtra = intent.getLongExtra("PARAM_ID", 0L);
                    String stringExtra4 = intent.getStringExtra("PARAM_SCREEN_TYPE");
                    str2 = stringExtra4 != null ? stringExtra4 : "";
                    Serializable serializableExtra2 = intent.getSerializableExtra("PARAM_TYPE");
                    d270 d270Var = serializableExtra2 instanceof d270 ? (d270) serializableExtra2 : null;
                    if (d270Var == null) {
                        d270Var = d270.UNKNOWN;
                    }
                    return new tnj(longExtra, d270Var, str2);
                case 35:
                    return new znj();
                case 36:
                    return new goj();
                case 37:
                    String stringExtra5 = intent.getStringExtra("PARAM_URL");
                    return new aoj(stringExtra5 != null ? stringExtra5 : "");
                case 38:
                    return new epj();
                case 39:
                    String stringExtra6 = intent.getStringExtra("PARAM_ID");
                    return new hmj(stringExtra6 != null ? stringExtra6 : "", false);
                case 40:
                    return new joj(intent.getLongExtra("PARAM_ID", 0L), aue0.c);
                case 41:
                    String stringExtra7 = intent.getStringExtra("PARAM_URL");
                    return new koj(stringExtra7 != null ? stringExtra7 : "");
                case 42:
                    String stringExtra8 = intent.getStringExtra("PARAM_URL");
                    return new loj(stringExtra8 != null ? stringExtra8 : "");
                case 43:
                    String stringExtra9 = intent.getStringExtra("PARAM_URL");
                    return new gnj(stringExtra9 != null ? stringExtra9 : "");
                case 44:
                    return new cmj();
                case 45:
                    return new qoj();
                case 47:
                    return new imj(intent.getIntExtra("CYBER_TYPE", 0), intent.getBooleanExtra("IS_EWC", false));
                case 48:
                    return new soj();
                case 49:
                    return new poj();
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                case 66:
                    String stringExtra10 = intent.getStringExtra("PARAM_TYPE");
                    String lowerCase = (stringExtra10 != null ? stringExtra10 : "").toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    return new olj(lowerCase.equals("vipcashback") ? new hr1(-10L, 2) : new hr1(0L, 3));
                case 51:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                    boolean booleanExtra3 = intent.getBooleanExtra("ACTIVITY_RECREATED", false);
                    long longExtra2 = booleanExtra3 ? Long.MIN_VALUE : intent.getLongExtra("PARAM_ID", Long.MIN_VALUE);
                    long longExtra3 = booleanExtra3 ? 0L : intent.getLongExtra("PARTITION_ID", 0L);
                    if (booleanExtra3 || (longArrayExtra = intent.getLongArrayExtra("FILTER_IDS")) == null || (listF0 = tx3.f0(longArrayExtra)) == null) {
                        listF0 = iun.f15405a;
                    }
                    List list = listF0;
                    q91 q91Var = booleanExtra ? q91.c : q91.b;
                    String stringExtra11 = intent.getStringExtra("PARAM_TYPE");
                    String lowerCase2 = (stringExtra11 != null ? stringExtra11 : "").toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    switch (lowerCase2.hashCode()) {
                        case -987494927:
                            j = longExtra2;
                            if (!lowerCase2.equals("provider")) {
                                fr1Var = new fr1(null, q91Var, 1);
                            } else {
                                if (longExtra3 != nw80.b.getId() || longExtra3 == nw80.f24223a.getId()) {
                                    fs80Var = new fs80(null, longExtra3, iun.f15405a, cs0.u(j), 0L, false, 113);
                                } else {
                                    fs80Var = new fs80(null, 0L, null, null, 0L, false, 127);
                                }
                                fr1Var = new fr1(fs80Var, q91Var);
                            }
                            break;
                        case 3165170:
                            long j2 = longExtra2;
                            if (!lowerCase2.equals("game")) {
                                fr1Var = new fr1(null, q91Var, 1);
                            } else {
                                fr1Var = new fr1(new fs80(null, 0L, null, null, j2, false, 111), q91Var);
                            }
                            break;
                        case 68589901:
                            long j3 = longExtra2;
                            if (!lowerCase2.equals("casinobrandid")) {
                                fr1Var = new fr1(null, q91Var, 1);
                            } else {
                                fr1Var = new er1(true, j3);
                            }
                            break;
                        case 93997959:
                            long j4 = longExtra2;
                            if (!lowerCase2.equals("brand")) {
                                fr1Var = new fr1(null, q91Var, 1);
                            } else {
                                j = j4;
                                if (longExtra3 != nw80.b.getId()) {
                                    fs80Var = new fs80(null, longExtra3, iun.f15405a, cs0.u(j), 0L, false, 113);
                                } else {
                                    fs80Var = new fs80(null, longExtra3, iun.f15405a, cs0.u(j), 0L, false, 113);
                                }
                                fr1Var = new fr1(fs80Var, q91Var);
                            }
                            break;
                        case 1300380478:
                            if (!lowerCase2.equals("subcategory")) {
                                fr1Var = new fr1(null, q91Var, 1);
                            } else {
                                fr1Var = new fr1(new fs80(null, longExtra2, list, null, 0L, false, 121), q91Var);
                            }
                            break;
                        default:
                            fr1Var = new fr1(null, q91Var, 1);
                            break;
                    }
                    return new olj(fr1Var);
                case 52:
                case 53:
                case 54:
                    long longExtra4 = intent.getBooleanExtra("ACTIVITY_RECREATED", false) ? 0L : intent.getLongExtra("PARAM_ID", 0L);
                    long longExtra5 = intent.getBooleanExtra("OPEN_NATIVE_TOURNAMENT", false) ? intent.getLongExtra("casinoNativeTournamentId", 0L) : intent.getLongExtra("casinoTournamentId", 0L);
                    String stringExtra12 = intent.getStringExtra("PARAM_TYPE");
                    return new olj((stringExtra12 != null ? stringExtra12 : "").equals("tournament") ? new jr1(new evc0(false, longExtra4)) : new jr1(new evc0(false, longExtra5)));
                case 55:
                    long longExtra6 = intent.getBooleanExtra("ACTIVITY_RECREATED", false) ? 0L : intent.getLongExtra("PARAM_ID", 0L);
                    String stringExtra13 = intent.getStringExtra("PARAM_TYPE");
                    switch (stringExtra13 != null ? stringExtra13 : "") {
                        case "tournament":
                            jr1Var = new jr1(new evc0(false, longExtra6));
                            break;
                        case "prizes":
                            jr1Var = new jr1(new cvc0(d7v.b));
                            break;
                        case "tournaments":
                            jr1Var = new jr1(new evc0(false, 0L));
                            break;
                        case "promocode":
                            jr1Var = new jr1(new dvc0((int) longExtra6));
                            break;
                        case "freespins":
                            jr1Var = new jr1(new cvc0(d7v.d));
                            break;
                        case "bonuses":
                            jr1Var = new jr1(new cvc0(d7v.c));
                            break;
                        case "nativetournament":
                            jr1Var = new jr1(new evc0(false, longExtra6));
                            break;
                        default:
                            jr1Var = new jr1();
                            break;
                    }
                    return new olj(jr1Var);
                case 57:
                    return new olj(new jr1(new dvc0((int) (intent.getBooleanExtra("ACTIVITY_RECREATED", false) ? 0L : intent.getLongExtra("PARAM_ID", 0L)))));
                case 58:
                    return new gpj();
                case 65:
                    return new plj(intent.getBooleanExtra("needTransfer", false), intent.getBooleanExtra("ACTIVITY_RECREATED", false) ? 0L : intent.getLongExtra("PARAM_ID", 0L));
                case 67:
                    return new olj(new jr1(new cvc0(d7v.b)));
                case 68:
                    return new olj(new jr1(new cvc0(d7v.d)));
                case 69:
                    return new olj(new jr1(new cvc0(d7v.c)));
                case 70:
                    return new qlj();
                case 71:
                    long longExtra7 = intent.getLongExtra("GAME_ID", 0L);
                    long longExtra8 = intent.getLongExtra("SPORT_ID", 0L);
                    long longExtra9 = intent.getLongExtra("subSportId", 0L);
                    String stringExtra14 = intent.getStringExtra("GAME_TYPE");
                    if (Intrinsics.d(stringExtra14, "live")) {
                        z = true;
                    } else {
                        Intrinsics.d(stringExtra14, "line");
                        z = false;
                    }
                    return new mmj(longExtra7, longExtra8, longExtra9, z);
                case 72:
                    long longExtra10 = intent.getLongExtra("SPORT_ID", 0L);
                    long longExtra11 = intent.getLongExtra("subSportId", 0L);
                    int intExtra = intent.getIntExtra("CYBER_TYPE", 0);
                    if (intExtra == CyberGamesPage.Real.INSTANCE.f46556a) {
                        longExtra10 = longExtra11;
                    }
                    return new kmj(intExtra, longExtra10, false);
                case 73:
                    int intExtra2 = intent.getIntExtra("CYBER_TYPE", 0);
                    long longExtra12 = intent.getLongExtra("CHAMP_ID", 0L);
                    long longExtra13 = intent.getLongExtra("SPORT_ID", 0L);
                    long longExtra14 = intent.getLongExtra("subSportId", 0L);
                    if (intExtra2 == CyberGamesPage.Real.INSTANCE.f46556a) {
                        longExtra13 = longExtra14;
                    }
                    return new jmj(intExtra2, longExtra12, longExtra13);
                case 74:
                    return new rmj(intent.getBooleanExtra("live", false), intent.getIntExtra("CYBER_TYPE", 0));
                case 75:
                    String stringExtra15 = intent.getStringExtra("team_name");
                    return new omj(stringExtra15 != null ? stringExtra15 : "", 0L);
                case 76:
                    return new snj();
                case 77:
                    long longExtra15 = intent.getLongExtra("PARAM_ID", -1L);
                    if (longExtra15 >= 0) {
                        return new qnj(longExtra15, "");
                    }
                    return xmj.f41127a;
                case 78:
                    return new wnj(t270.b);
                case 79:
                    return new wnj(t270.c);
                case 80:
                    return new wnj(t270.d);
                case 81:
                    return new hnj();
                case 83:
                case 87:
                    return new tpj(new hr1(0L, 3));
                case 84:
                case 85:
                case 86:
                    boolean booleanExtra4 = intent.getBooleanExtra("ACTIVITY_RECREATED", false);
                    long longExtra16 = booleanExtra4 ? Long.MIN_VALUE : intent.getLongExtra("PARAM_ID", Long.MIN_VALUE);
                    if (booleanExtra4 || (longArrayExtra2 = intent.getLongArrayExtra("FILTER_IDS")) == null || (listF1 = tx3.f0(longArrayExtra2)) == null) {
                        listF1 = iun.f15405a;
                    }
                    List list2 = listF1;
                    q91 q91Var2 = booleanExtra ? q91.c : q91.b;
                    String stringExtra16 = intent.getStringExtra("PARAM_TYPE");
                    str2 = stringExtra16 != null ? stringExtra16 : "";
                    return new tpj(str2.equals("subcategory") ? new fr1(new fs80(null, longExtra16, list2, null, 0L, false, 121), q91Var2) : str2.equals("game") ? new fr1(new fs80(null, 0L, null, null, longExtra16, false, 111), q91Var2) : new fr1(null, q91Var2, 1));
                case 88:
                    return new yoj();
                case 89:
                    return new smj();
                case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                    return new voj(intent.getIntExtra("SPECIAL_EVENT_TOP_CHAMP_ID", 0));
            }
        }
        if (i2 == 1) {
            z1x.P(obj2);
            return obj2;
        }
        if (i2 != 2) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uri = nrjVar.j;
        str = nrjVar.i;
        z1x.P(obj2);
        upj upjVar = (upj) obj2;
        return (!(upjVar instanceof xmj) || (scheme = uri.getScheme()) == null || scheme.length() <= 0 || scheme.equalsIgnoreCase(this.f27468a.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0)))) ? upjVar : new ynj(tw70.f34636a, "", str);
    }

    public final upj u(Intent intent) {
        upj imjVar;
        intent.getClass();
        String action = intent.getAction();
        if (action == null) {
            action = "null";
        }
        String action2 = intent.getAction();
        boolean zD = Intrinsics.d(action2, csj0.LINE_SHORTCUT.a());
        xmj xmjVar = xmj.f41127a;
        if (zD) {
            imjVar = new uoj(j700.f16016a);
        } else if (Intrinsics.d(action2, csj0.LIVE_SHORTCUT.a())) {
            imjVar = new uoj(j700.b);
        } else if (Intrinsics.d(action2, csj0.ONE_X_GAMES_SHORTCUT.a())) {
            imjVar = new vnj();
        } else if (Intrinsics.d(action2, csj0.HISTORY_SHORTCUT.a())) {
            imjVar = new enj();
        } else {
            imjVar = Intrinsics.d(action2, csj0.CYBER_SPORT_SHORTCUT.a()) ? new imj(CyberGamesPage.Real.INSTANCE.f46556a, false) : xmjVar;
        }
        List list = ((sff0) this.d.getValue()).R;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((csj0) it.next()).a().equals(action)) {
                    return imjVar;
                }
            }
        }
        return xmjVar;
    }
}
