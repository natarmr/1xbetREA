package a;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;

/* JADX INFO: loaded from: classes3.dex */
public final class rny implements ony {
    public static final MediaType m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f30810a;
    public final tgk b;
    public final trm0 c;
    public final knf0 d;
    public final kuy e;
    public final mne f;
    public final gst0 g;
    public final us3 h;
    public final po i;
    public final z7z j;
    public final sje k;
    public final n0o0 l;

    static {
        MediaType mediaTypeA;
        Regex regex = MediaType.e;
        try {
            mediaTypeA = MediaType.Companion.a("application/json; charset=utf-8");
        } catch (IllegalArgumentException unused) {
            mediaTypeA = null;
        }
        m = mediaTypeA;
    }

    public rny(us00 us00Var, tgk tgkVar, trm0 trm0Var, knf0 knf0Var, kuy kuyVar, mne mneVar, gst0 gst0Var, us3 us3Var, po poVar, z7z z7zVar) {
        tgkVar.getClass();
        knf0Var.getClass();
        kuyVar.getClass();
        gst0Var.getClass();
        us3Var.getClass();
        poVar.getClass();
        z7zVar.getClass();
        this.f30810a = us00Var;
        this.b = tgkVar;
        this.c = trm0Var;
        this.d = knf0Var;
        this.e = kuyVar;
        this.f = mneVar;
        this.g = gst0Var;
        this.h = us3Var;
        this.i = poVar;
        this.j = z7zVar;
        this.k = d5c.a(kotlin.coroutines.e.c(qem0.e(), mneVar.b));
        this.l = maz.b(new y2x(this, (byte) 19));
    }

    public static edy c(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            mcy mcyVar = (mcy) entry.getValue();
            str.getClass();
            mcyVar.getClass();
        }
        return new edy(linkedHashMap);
    }

    public final void a(String str, tny tnyVar) {
        tnyVar.getClass();
        sac.V(this.k, pny.f27307a, null, this.f.b, new c6y((Object) this, (Object) str, (Object) tnyVar, (yje) null, (byte) 7), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(String str, tny tnyVar, zje zjeVar) {
        qny qnyVar;
        HttpUrl httpUrlB;
        String str2;
        WifiInfo connectionInfo;
        NetworkInfo.DetailedState detailedStateOf;
        if (zjeVar instanceof qny) {
            qnyVar = (qny) zjeVar;
            int i = qnyVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnyVar.k = i - Integer.MIN_VALUE;
            } else {
                qnyVar = new qny(this, zjeVar);
            }
        } else {
            qnyVar = new qny(this, zjeVar);
        }
        Object obj = qnyVar.i;
        wne wneVar = wne.f39444a;
        int i2 = qnyVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            if (((Boolean) this.i.f27308a.getValue()).booleanValue()) {
                String str3 = ujn.h;
                str3.getClass();
                try {
                    httpUrlB = HttpUrl.Companion.b(str3);
                } catch (IllegalArgumentException unused) {
                    httpUrlB = null;
                }
                if (httpUrlB != null && !Intrinsics.d(ujn.h, "https://mob-experience.space")) {
                    String str4 = tnyVar.b;
                    Map map = tnyVar.f34258a;
                    tgk tgkVar = this.b;
                    Pair pairE = tgkVar.e();
                    n0o0 n0o0Var = tgkVar.g;
                    String str5 = (String) pairE.f46059a;
                    String str6 = (String) pairE.b;
                    m9d m9dVar = (m9d) this.l.getValue();
                    m9dVar.getClass();
                    str5.getClass();
                    str6.getClass();
                    bzu bzuVar = new bzu((byte) 19);
                    cww.G(bzuVar, "applicationGUID", m9dVar.f21404a);
                    cww.G(bzuVar, "deviceSystemVersion", Build.VERSION.RELEASE);
                    cww.F(bzuVar, "deviceSystemVersionMajor", Integer.valueOf(m9dVar.b));
                    cww.G(bzuVar, "applicationName", m9dVar.c);
                    cww.G(bzuVar, "applicationVersion", m9dVar.d);
                    cww.G(bzuVar, "deviceManufacturer", Build.MANUFACTURER);
                    cww.G(bzuVar, "deviceModel", m9dVar.e);
                    cww.G(bzuVar, "deviceArchitecture", m9dVar.f);
                    cww.G(bzuVar, "deviceCompanyMarketingName", str5);
                    cww.G(bzuVar, "deviceMarketingModel", str6);
                    cww.G(bzuVar, "deviceABI", m9dVar.g);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(bzuVar.a());
                    us00 us00Var = this.f30810a;
                    try {
                        Object systemService = us00Var.getSystemService("connectivity");
                        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                        NetworkInfo networkInfo = connectivityManager != null ? connectivityManager.getNetworkInfo(1) : null;
                        NetworkInfo networkInfo2 = connectivityManager != null ? connectivityManager.getNetworkInfo(0) : null;
                        if (networkInfo == null || !networkInfo.isConnected()) {
                            str2 = (networkInfo2 == null || !networkInfo2.isConnected()) ? "noNetwork" : "cell";
                        } else {
                            str2 = "wifi";
                        }
                    } catch (Exception unused2) {
                        str2 = "fail";
                    }
                    linkedHashMap.put("deviceWiFiOn", ncy.a(Boolean.valueOf(str2.equals("wifi"))));
                    linkedHashMap.put("logType", ncy.c(str4));
                    linkedHashMap.put("deviseLanguage", ncy.c(this.e.a()));
                    q7d0 q7d0Var = this.d.b;
                    q7d0Var.getClass();
                    String string = q7d0Var.a().getString("WEB_VIEW_USER_AGENT", "");
                    if (string == null) {
                        string = "";
                    }
                    linkedHashMap.put("webViewUserAgent", ncy.c(string));
                    linkedHashMap.put("deviceFormFactor", ncy.c(tgkVar.d()));
                    gst0 gst0Var = this.g;
                    if (gst0Var.a()) {
                        try {
                            linkedHashMap.put("userId", ncy.b(Long.valueOf(gst0Var.f11847a.a().f18785a)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    Object systemService2 = us00Var.getSystemService("wifi");
                    WifiManager wifiManager = systemService2 instanceof WifiManager ? (WifiManager) systemService2 : null;
                    if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null && ((detailedStateOf = WifiInfo.getDetailedStateOf(connectionInfo.getSupplicantState())) == NetworkInfo.DetailedState.CONNECTED || detailedStateOf == NetworkInfo.DetailedState.OBTAINING_IPADDR)) {
                        linkedHashMap.put("wifiName", ncy.c(connectionInfo.getSSID()));
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) n0o0Var.getValue();
                    String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
                    if (networkOperatorName == null) {
                        networkOperatorName = "";
                    }
                    if (networkOperatorName.length() > 0) {
                        String upperCase = networkOperatorName.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        if (StringsKt.O(upperCase, "MTS", false)) {
                            networkOperatorName = "MTS";
                        } else if (StringsKt.O(upperCase, "MEGAFON", false)) {
                            networkOperatorName = "MegaFon";
                        } else if (StringsKt.O(upperCase, "TELE2", false)) {
                            networkOperatorName = "Tele2";
                        }
                        linkedHashMap.put("carrierName", ncy.c(networkOperatorName));
                    }
                    TelephonyManager telephonyManager2 = (TelephonyManager) n0o0Var.getValue();
                    String simCountryIso = telephonyManager2 != null ? telephonyManager2.getSimCountryIso() : null;
                    String str7 = simCountryIso != null ? simCountryIso : "";
                    if (str7.length() > 0) {
                        linkedHashMap.put("carrierCC", ncy.c(str7));
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(c(linkedHashMap));
                    if (str.length() == 0) {
                        linkedHashMap2.putAll(map);
                    } else {
                        linkedHashMap2.put("eventName", ncy.c(str));
                        if (!map.isEmpty()) {
                            linkedHashMap2.put("eventParameters", c(map));
                        }
                    }
                    edy edyVarC = c(linkedHashMap2);
                    int i3 = RequestBody.f46110a;
                    RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3A = RequestBody.Companion.a(edyVarC.toString(), m);
                    qnyVar.k = 1;
                    if (this.c.m(requestBody$Companion$toRequestBody$3A, "Basic YW5kcm9pZF91c2VyOmVpR2hvb0I0YWwteWllM1RoYWV0aC1lZVBodWRpdWI5", qnyVar) == wneVar) {
                        return wneVar;
                    }
                }
            }
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        return Boolean.TRUE;
    }
}
