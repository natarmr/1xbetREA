package a;

import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xplatform.services.mobile_services.impl.workers.UpdateTokenWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class w940 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f38760a;
    public final myb b;
    public final qde0 c;
    public final nv20 d;
    public final qde0 e;
    public final zx10 f;
    public final h760 g;
    public final c1d0 h;
    public final rpt i;
    public final zlt0 j;
    public final ugf0 k;
    public final j1q0 l;
    public final sje m;
    public final sje n;
    public final Calendar o;
    public final Regex p;

    public w940(us00 us00Var, myb mybVar, kj5 kj5Var, qde0 qde0Var, nv20 nv20Var, qde0 qde0Var2, zx10 zx10Var, sd60 sd60Var, h760 h760Var, c1d0 c1d0Var, rpt rptVar, zlt0 zlt0Var, ugf0 ugf0Var, j1q0 j1q0Var, mne mneVar) {
        h760Var.getClass();
        c1d0Var.getClass();
        j1q0Var.getClass();
        this.f38760a = us00Var;
        this.b = mybVar;
        this.c = qde0Var;
        this.d = nv20Var;
        this.e = qde0Var2;
        this.f = zx10Var;
        this.g = h760Var;
        this.h = c1d0Var;
        this.i = rptVar;
        this.j = zlt0Var;
        this.k = ugf0Var;
        this.l = j1q0Var;
        this.m = d5c.a(kotlin.coroutines.e.c(qem0.e(), mneVar.b));
        this.n = d5c.a(kotlin.coroutines.e.c(qem0.e(), mneVar.c));
        this.o = Calendar.getInstance();
        this.p = new Regex("\\D+");
    }

    public final void a(k9h0 k9h0Var, Map map) {
        Intent intentJ = this.f.j(k9h0Var, map);
        Bundle bundleL = xvw.L(k9h0Var, map);
        String str = (String) map.get("title");
        String str2 = str == null ? "" : str;
        String str3 = (String) map.get(CrashHianalyticsData.MESSAGE);
        String str4 = str3 == null ? "" : str3;
        String str5 = (String) map.get("picUrl");
        String str6 = str5 == null ? "" : str5;
        String str7 = (String) map.get("campaignId");
        String str8 = str7 != null ? str7 : "";
        intentJ.putExtras(bundleL);
        intentJ.putExtra("IS_PUSH_NOTIFICATION", true);
        intentJ.putExtra("CAMPAIGN_ID", str8);
        sac.V(this.m, v940.f37016a, null, null, new c43(this, str6, intentJ, str2, str4, k9h0Var, (yje) null), 14);
    }

    public final void b() {
        kd30 kd30Var = this.c.f28531a;
        String strC = ((vwb0) kd30Var.b).c("HASHES_MEMORY", "");
        t940 t940Var = (t940) kd30Var.f18086a;
        t940Var.getClass();
        if (StringsKt.W(strC)) {
            return;
        }
        try {
            t940Var.b = new ConcurrentHashMap((Map) t940Var.f33544a.b(new inv(okx.f25427a, mnv.Companion.serializer(), (byte) 1), strC));
        } catch (Exception e) {
            e.printStackTrace();
            t940Var.b = new ConcurrentHashMap();
        }
    }

    public final void c() {
        String strD;
        kd30 kd30Var = (kd30) this.d.f24171a;
        vwb0 vwb0Var = (vwb0) kd30Var.b;
        t940 t940Var = (t940) kd30Var.f18086a;
        t940Var.getClass();
        try {
            strD = t940Var.f33544a.d(new inv(okx.f25427a, mnv.Companion.serializer(), (byte) 1), xp20.n(t940Var.b));
        } catch (Exception unused) {
            strD = "{}";
        }
        vwb0Var.h("HASHES_MEMORY", strD);
    }

    public final void d(Map map) {
        String str;
        Object objPutIfAbsent;
        Integer intOrNull;
        Long lT0;
        map.getClass();
        gle0 gle0Var = k9h0.f17916a;
        String str2 = (String) map.get("messageType");
        if (str2 == null) {
            str2 = "0";
        }
        Integer intOrNull2 = StringsKt.toIntOrNull(str2);
        int iIntValue = 0;
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        gle0Var.getClass();
        k9h0 k9h0VarG = gle0.g(iIntValue2);
        int iOrdinal = k9h0VarG.ordinal();
        if (iOrdinal == 5) {
            String str3 = (String) map.get("key");
            if (str3 == null || (str = (String) map.get("pushId")) == null) {
                return;
            }
            sac.V(v7v.f36948a, new tr20((byte) 29), null, null, new mw20((Object) this, (Object) str, (Object) str3, (yje) null, (byte) 25), 14);
            return;
        }
        if (iOrdinal != 6) {
            switch (iOrdinal) {
                case 8:
                    Calendar calendar = this.o;
                    String str4 = (String) map.get("dt");
                    if (((calendar.getTime().getTime() + ((long) calendar.get(15))) / 1000) - ((str4 == null || (lT0 = StringsKt.t0(str4)) == null) ? calendar.get(15) / 1000 : lT0.longValue()) > 5400) {
                        return;
                    }
                    a(k9h0VarG, map);
                    return;
                case 9:
                    String str5 = (String) map.get(CrashHianalyticsData.MESSAGE);
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = (String) map.get("link");
                    String str7 = str6 != null ? str6 : "";
                    if (str5.length() == 0 && str7.length() == 0) {
                        return;
                    }
                    a(k9h0VarG, map);
                    return;
                case 10:
                case 11:
                case 13:
                case 14:
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
                    h760 h760Var = this.g;
                    Intent intentJ = this.f.j(k9h0VarG, map);
                    String str8 = (String) map.get("title");
                    String str9 = str8 == null ? "" : str8;
                    String str10 = (String) map.get(CrashHianalyticsData.MESSAGE);
                    String str11 = str10 == null ? "" : str10;
                    t760.a(h760Var.a(), intentJ, str9, str11, xvw.I(k9h0VarG), null, null, k9h0VarG.toString(), 0, null, 432);
                    String strReplace = this.p.replace(str11, "");
                    us00 us00Var = this.f38760a;
                    Intent intent = new Intent("sms_code_broadcast");
                    intent.putExtra("sms_code_broadcast_code", strReplace);
                    us00Var.sendBroadcast(intent);
                    ((u760) h760Var.a()).b(k9h0VarG.toString(), kotlin.collections.a.c(Integer.valueOf(str11.hashCode())));
                    return;
                case 15:
                    break;
                default:
                    switch (iOrdinal) {
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            break;
                        case 32:
                            us00 us00Var2 = this.f38760a;
                            cpv0 cpv0VarD = cpv0.d(us00Var2);
                            cpv0VarD.getClass();
                            ga3.m(cpv0VarD, us00Var2, map);
                            return;
                        case 33:
                            myb mybVar = this.b;
                            lr4 lr4Var = lr4.f20510a;
                            vo4 vo4Var = mybVar.f22595a.e;
                            vo4Var.getClass();
                            vo4Var.f37746a.g(lr4Var);
                            t760 t760VarA = this.g.a();
                            String str12 = (String) map.get("approvalGuid");
                            if (str12 == null) {
                                str12 = "";
                            }
                            ((u760) t760VarA).b("", kotlin.collections.a.c(Integer.valueOf(str12.hashCode())));
                            return;
                        default:
                            switch (iOrdinal) {
                                case 35:
                                case 36:
                                case 37:
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                            break;
                                        default:
                                            switch (iOrdinal) {
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                    break;
                                                default:
                                                    switch (iOrdinal) {
                                                        case 76:
                                                        case 77:
                                                        case 78:
                                                        case 79:
                                                        case 80:
                                                            break;
                                                        default:
                                                            switch (iOrdinal) {
                                                                case 83:
                                                                case 84:
                                                                case 85:
                                                                case 86:
                                                                case 87:
                                                                    break;
                                                                default:
                                                                    a(k9h0.b, map);
                                                                    return;
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
            a(k9h0VarG, map);
            return;
        }
        qde0 qde0Var = this.e;
        String str13 = (String) map.get("GameId");
        if (str13 != null && (intOrNull = StringsKt.toIntOrNull(str13)) != null) {
            iIntValue = intOrNull.intValue();
        }
        String str14 = (String) map.get(CrashHianalyticsData.MESSAGE);
        if (str14 == null) {
            str14 = "";
        }
        int iHashCode = str14.hashCode();
        ConcurrentHashMap concurrentHashMap = ((t940) qde0Var.f28531a.f18086a).b;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Object mnvVar = concurrentHashMap.get(numValueOf);
        if (mnvVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (mnvVar = new mnv()))) != null) {
            mnvVar = objPutIfAbsent;
        }
        mnv mnvVar2 = (mnv) mnvVar;
        synchronized (mnvVar2.f22108a) {
            if (!mnvVar2.f22108a.contains(Integer.valueOf(iHashCode))) {
                mnvVar2.f22108a.add(Integer.valueOf(iHashCode));
            }
        }
        a(k9h0VarG, map);
    }

    public final void e(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("KEY_TOKEN", str);
        maj majVar = new maj(linkedHashMap);
        nkb.I(majVar);
        sl50 sl50Var = sl50.f32381a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o4e o4eVar = new o4e(new hl50(null), sl50.b, false, false, false, false, -1L, -1L, CollectionsKt.P0(linkedHashSet));
        xl60 xl60Var = new xl60(UpdateTokenWorker.class);
        ((ppv0) xl60Var.c).j = o4eVar;
        ((ppv0) xl60Var.c).e = majVar;
        yl60 yl60Var = (yl60) xl60Var.k();
        cpv0 cpv0VarD = cpv0.d(this.f38760a);
        cpv0VarD.getClass();
        cpv0VarD.c("UpdateTokenWorker", zko.f44542a, yl60Var);
    }

    public final void f(Map map) {
        if (this.l.f15748a.k()) {
            String strValueOf = String.valueOf(map);
            vdd0 vdd0Var = (vdd0) ((nr00) this.k.f35622a).f23980a;
            vdd0Var.getClass();
            vdd0Var.f37226a.g(strValueOf);
        }
    }
}
