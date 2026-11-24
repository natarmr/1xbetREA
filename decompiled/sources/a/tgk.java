package a;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.gov.nist.core.Separators;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class tgk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f33916a;
    public final q7d0 b;
    public Pair c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public boolean j;
    public final n0o0 k;
    public String l;
    public final n0o0 m;

    public tgk(us00 us00Var, q7d0 q7d0Var) {
        q7d0Var.getClass();
        this.f33916a = us00Var;
        this.b = q7d0Var;
        final byte b = 1;
        this.d = maz.b(new Function0(this) { // from class: a.sgk
            public final /* synthetic */ tgk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                boolean zIsLowRamDevice = false;
                tgk tgkVar = this.b;
                switch (b2) {
                    case 0:
                        return new jeg0(tgkVar.f33916a);
                    case 1:
                        Object systemService = tgkVar.f33916a.getSystemService("activity");
                        if (systemService instanceof ActivityManager) {
                            return (ActivityManager) systemService;
                        }
                        return null;
                    case 2:
                        Object systemService2 = tgkVar.f33916a.getSystemService("connectivity");
                        if (systemService2 instanceof ConnectivityManager) {
                            return (ConnectivityManager) systemService2;
                        }
                        return null;
                    case 3:
                        Object systemService3 = tgkVar.f33916a.getSystemService("wifi");
                        if (systemService3 instanceof WifiManager) {
                            return (WifiManager) systemService3;
                        }
                        return null;
                    case 4:
                        Object systemService4 = tgkVar.f33916a.getSystemService("phone");
                        if (systemService4 instanceof TelephonyManager) {
                            return (TelephonyManager) systemService4;
                        }
                        return null;
                    case 5:
                        Object systemService5 = tgkVar.f33916a.getSystemService(RemoteMessageConst.NOTIFICATION);
                        if (systemService5 instanceof NotificationManager) {
                            return (NotificationManager) systemService5;
                        }
                        return null;
                    case 6:
                        try {
                            ActivityManager activityManager = (ActivityManager) tgkVar.d.getValue();
                            if (activityManager != null) {
                                zIsLowRamDevice = activityManager.isLowRamDevice();
                            }
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return Boolean.valueOf(zIsLowRamDevice);
                    default:
                        return Boolean.valueOf((tgkVar.f33916a.getResources().getConfiguration().screenLayout & 15) == 1);
                }
            }
        });
        final byte b2 = 2;
        this.e = maz.b(new Function0(this) { // from class: a.sgk
            public final /* synthetic */ tgk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                boolean zIsLowRamDevice = false;
                tgk tgkVar = this.b;
                switch (b3) {
                    case 0:
                        return new jeg0(tgkVar.f33916a);
                    case 1:
                        Object systemService = tgkVar.f33916a.getSystemService("activity");
                        if (systemService instanceof ActivityManager) {
                            return (ActivityManager) systemService;
                        }
                        return null;
                    case 2:
                        Object systemService2 = tgkVar.f33916a.getSystemService("connectivity");
                        if (systemService2 instanceof ConnectivityManager) {
                            return (ConnectivityManager) systemService2;
                        }
                        return null;
                    case 3:
                        Object systemService3 = tgkVar.f33916a.getSystemService("wifi");
                        if (systemService3 instanceof WifiManager) {
                            return (WifiManager) systemService3;
                        }
                        return null;
                    case 4:
                        Object systemService4 = tgkVar.f33916a.getSystemService("phone");
                        if (systemService4 instanceof TelephonyManager) {
                            return (TelephonyManager) systemService4;
                        }
                        return null;
                    case 5:
                        Object systemService5 = tgkVar.f33916a.getSystemService(RemoteMessageConst.NOTIFICATION);
                        if (systemService5 instanceof NotificationManager) {
                            return (NotificationManager) systemService5;
                        }
                        return null;
                    case 6:
                        try {
                            ActivityManager activityManager = (ActivityManager) tgkVar.d.getValue();
                            if (activityManager != null) {
                                zIsLowRamDevice = activityManager.isLowRamDevice();
                            }
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return Boolean.valueOf(zIsLowRamDevice);
                    default:
                        return Boolean.valueOf((tgkVar.f33916a.getResources().getConfiguration().screenLayout & 15) == 1);
                }
            }
        });
        final byte b3 = 3;
        this.f = maz.b(new Function0(this) { // from class: a.sgk
            public final /* synthetic */ tgk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                boolean zIsLowRamDevice = false;
                tgk tgkVar = this.b;
                switch (b4) {
                    case 0:
                        return new jeg0(tgkVar.f33916a);
                    case 1:
                        Object systemService = tgkVar.f33916a.getSystemService("activity");
                        if (systemService instanceof ActivityManager) {
                            return (ActivityManager) systemService;
                        }
                        return null;
                    case 2:
                        Object systemService2 = tgkVar.f33916a.getSystemService("connectivity");
                        if (systemService2 instanceof ConnectivityManager) {
                            return (ConnectivityManager) systemService2;
                        }
                        return null;
                    case 3:
                        Object systemService3 = tgkVar.f33916a.getSystemService("wifi");
                        if (systemService3 instanceof WifiManager) {
                            return (WifiManager) systemService3;
                        }
                        return null;
                    case 4:
                        Object systemService4 = tgkVar.f33916a.getSystemService("phone");
                        if (systemService4 instanceof TelephonyManager) {
                            return (TelephonyManager) systemService4;
                        }
                        return null;
                    case 5:
                        Object systemService5 = tgkVar.f33916a.getSystemService(RemoteMessageConst.NOTIFICATION);
                        if (systemService5 instanceof NotificationManager) {
                            return (NotificationManager) systemService5;
                        }
                        return null;
                    case 6:
                        try {
                            ActivityManager activityManager = (ActivityManager) tgkVar.d.getValue();
                            if (activityManager != null) {
                                zIsLowRamDevice = activityManager.isLowRamDevice();
                            }
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return Boolean.valueOf(zIsLowRamDevice);
                    default:
                        return Boolean.valueOf((tgkVar.f33916a.getResources().getConfiguration().screenLayout & 15) == 1);
                }
            }
        });
        final byte b4 = 4;
        this.g = maz.b(new Function0(this) { // from class: a.sgk
            public final /* synthetic */ tgk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                boolean zIsLowRamDevice = false;
                tgk tgkVar = this.b;
                switch (b5) {
                    case 0:
                        return new jeg0(tgkVar.f33916a);
                    case 1:
                        Object systemService = tgkVar.f33916a.getSystemService("activity");
                        if (systemService instanceof ActivityManager) {
                            return (ActivityManager) systemService;
                        }
                        return null;
                    case 2:
                        Object systemService2 = tgkVar.f33916a.getSystemService("connectivity");
                        if (systemService2 instanceof ConnectivityManager) {
                            return (ConnectivityManager) systemService2;
                        }
                        return null;
                    case 3:
                        Object systemService3 = tgkVar.f33916a.getSystemService("wifi");
                        if (systemService3 instanceof WifiManager) {
                            return (WifiManager) systemService3;
                        }
                        return null;
                    case 4:
                        Object systemService4 = tgkVar.f33916a.getSystemService("phone");
                        if (systemService4 instanceof TelephonyManager) {
                            return (TelephonyManager) systemService4;
                        }
                        return null;
                    case 5:
                        Object systemService5 = tgkVar.f33916a.getSystemService(RemoteMessageConst.NOTIFICATION);
                        if (systemService5 instanceof NotificationManager) {
                            return (NotificationManager) systemService5;
                        }
                        return null;
                    case 6:
                        try {
                            ActivityManager activityManager = (ActivityManager) tgkVar.d.getValue();
                            if (activityManager != null) {
                                zIsLowRamDevice = activityManager.isLowRamDevice();
                            }
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return Boolean.valueOf(zIsLowRamDevice);
                    default:
                        return Boolean.valueOf((tgkVar.f33916a.getResources().getConfiguration().screenLayout & 15) == 1);
                }
            }
        });
        final byte b5 = 5;
        this.h = maz.b(new Function0(this) { // from class: a.sgk
            public final /* synthetic */ tgk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                boolean zIsLowRamDevice = false;
                tgk tgkVar = this.b;
                switch (b6) {
                    case 0:
                        return new jeg0(tgkVar.f33916a);
                    case 1:
                        Object systemService = tgkVar.f33916a.getSystemService("activity");
                        if (systemService instanceof ActivityManager) {
                            return (ActivityManager) systemService;
                        }
                        return null;
                    case 2:
                        Object systemService2 = tgkVar.f33916a.getSystemService("connectivity");
                        if (systemService2 instanceof ConnectivityManager) {
                            return (ConnectivityManager) systemService2;
                        }
                        return null;
                    case 3:
                        Object systemService3 = tgkVar.f33916a.getSystemService("wifi");
                        if (systemService3 instanceof WifiManager) {
                            return (WifiManager) systemService3;
                        }
                        return null;
                    case 4:
                        Object systemService4 = tgkVar.f33916a.getSystemService("phone");
                        if (systemService4 instanceof TelephonyManager) {
                            return (TelephonyManager) systemService4;
                        }
                        return null;
                    case 5:
                        Object systemService5 = tgkVar.f33916a.getSystemService(RemoteMessageConst.NOTIFICATION);
                        if (systemService5 instanceof NotificationManager) {
                            return (NotificationManager) systemService5;
                        }
                        return null;
                    case 6:
                        try {
                            ActivityManager activityManager = (ActivityManager) tgkVar.d.getValue();
                            if (activityManager != null) {
                                zIsLowRamDevice = activityManager.isLowRamDevice();
                            }
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return Boolean.valueOf(zIsLowRamDevice);
                    default:
                        return Boolean.valueOf((tgkVar.f33916a.getResources().getConfiguration().screenLayout & 15) == 1);
                }
            }
        });
        final byte b6 = 6;
        this.i = maz.b(new Function0(this) { // from class: a.sgk
            public final /* synthetic */ tgk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                boolean zIsLowRamDevice = false;
                tgk tgkVar = this.b;
                switch (b7) {
                    case 0:
                        return new jeg0(tgkVar.f33916a);
                    case 1:
                        Object systemService = tgkVar.f33916a.getSystemService("activity");
                        if (systemService instanceof ActivityManager) {
                            return (ActivityManager) systemService;
                        }
                        return null;
                    case 2:
                        Object systemService2 = tgkVar.f33916a.getSystemService("connectivity");
                        if (systemService2 instanceof ConnectivityManager) {
                            return (ConnectivityManager) systemService2;
                        }
                        return null;
                    case 3:
                        Object systemService3 = tgkVar.f33916a.getSystemService("wifi");
                        if (systemService3 instanceof WifiManager) {
                            return (WifiManager) systemService3;
                        }
                        return null;
                    case 4:
                        Object systemService4 = tgkVar.f33916a.getSystemService("phone");
                        if (systemService4 instanceof TelephonyManager) {
                            return (TelephonyManager) systemService4;
                        }
                        return null;
                    case 5:
                        Object systemService5 = tgkVar.f33916a.getSystemService(RemoteMessageConst.NOTIFICATION);
                        if (systemService5 instanceof NotificationManager) {
                            return (NotificationManager) systemService5;
                        }
                        return null;
                    case 6:
                        try {
                            ActivityManager activityManager = (ActivityManager) tgkVar.d.getValue();
                            if (activityManager != null) {
                                zIsLowRamDevice = activityManager.isLowRamDevice();
                            }
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return Boolean.valueOf(zIsLowRamDevice);
                    default:
                        return Boolean.valueOf((tgkVar.f33916a.getResources().getConfiguration().screenLayout & 15) == 1);
                }
            }
        });
        final byte b7 = 7;
        this.k = maz.b(new Function0(this) { // from class: a.sgk
            public final /* synthetic */ tgk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b8 = b7;
                boolean zIsLowRamDevice = false;
                tgk tgkVar = this.b;
                switch (b8) {
                    case 0:
                        return new jeg0(tgkVar.f33916a);
                    case 1:
                        Object systemService = tgkVar.f33916a.getSystemService("activity");
                        if (systemService instanceof ActivityManager) {
                            return (ActivityManager) systemService;
                        }
                        return null;
                    case 2:
                        Object systemService2 = tgkVar.f33916a.getSystemService("connectivity");
                        if (systemService2 instanceof ConnectivityManager) {
                            return (ConnectivityManager) systemService2;
                        }
                        return null;
                    case 3:
                        Object systemService3 = tgkVar.f33916a.getSystemService("wifi");
                        if (systemService3 instanceof WifiManager) {
                            return (WifiManager) systemService3;
                        }
                        return null;
                    case 4:
                        Object systemService4 = tgkVar.f33916a.getSystemService("phone");
                        if (systemService4 instanceof TelephonyManager) {
                            return (TelephonyManager) systemService4;
                        }
                        return null;
                    case 5:
                        Object systemService5 = tgkVar.f33916a.getSystemService(RemoteMessageConst.NOTIFICATION);
                        if (systemService5 instanceof NotificationManager) {
                            return (NotificationManager) systemService5;
                        }
                        return null;
                    case 6:
                        try {
                            ActivityManager activityManager = (ActivityManager) tgkVar.d.getValue();
                            if (activityManager != null) {
                                zIsLowRamDevice = activityManager.isLowRamDevice();
                            }
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return Boolean.valueOf(zIsLowRamDevice);
                    default:
                        return Boolean.valueOf((tgkVar.f33916a.getResources().getConfiguration().screenLayout & 15) == 1);
                }
            }
        });
        this.l = "";
        final byte b8 = 0;
        this.m = maz.b(new Function0(this) { // from class: a.sgk
            public final /* synthetic */ tgk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b9 = b8;
                boolean zIsLowRamDevice = false;
                tgk tgkVar = this.b;
                switch (b9) {
                    case 0:
                        return new jeg0(tgkVar.f33916a);
                    case 1:
                        Object systemService = tgkVar.f33916a.getSystemService("activity");
                        if (systemService instanceof ActivityManager) {
                            return (ActivityManager) systemService;
                        }
                        return null;
                    case 2:
                        Object systemService2 = tgkVar.f33916a.getSystemService("connectivity");
                        if (systemService2 instanceof ConnectivityManager) {
                            return (ConnectivityManager) systemService2;
                        }
                        return null;
                    case 3:
                        Object systemService3 = tgkVar.f33916a.getSystemService("wifi");
                        if (systemService3 instanceof WifiManager) {
                            return (WifiManager) systemService3;
                        }
                        return null;
                    case 4:
                        Object systemService4 = tgkVar.f33916a.getSystemService("phone");
                        if (systemService4 instanceof TelephonyManager) {
                            return (TelephonyManager) systemService4;
                        }
                        return null;
                    case 5:
                        Object systemService5 = tgkVar.f33916a.getSystemService(RemoteMessageConst.NOTIFICATION);
                        if (systemService5 instanceof NotificationManager) {
                            return (NotificationManager) systemService5;
                        }
                        return null;
                    case 6:
                        try {
                            ActivityManager activityManager = (ActivityManager) tgkVar.d.getValue();
                            if (activityManager != null) {
                                zIsLowRamDevice = activityManager.isLowRamDevice();
                            }
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return Boolean.valueOf(zIsLowRamDevice);
                    default:
                        return Boolean.valueOf((tgkVar.f33916a.getResources().getConfiguration().screenLayout & 15) == 1);
                }
            }
        });
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static String b(String str) {
        return (str == null || str.equals("<unknown ssid>") || str.equals("0x")) ? "" : kotlin.text.c.r(str, Separators.DOUBLE_QUOTE, "", false);
    }

    public static String c() {
        String str = Build.MODEL;
        str.getClass();
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (!kotlin.text.c.x(str, str2, false)) {
            return a(str);
        }
        String strR = kotlin.text.c.r(str, str2, "", false);
        int length = strR.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = strR.charAt(!z ? i : length) <= ' ';
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return a(strR.subSequence(i, length + 1).toString());
    }

    public static int h() {
        Integer intOrNull;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return 7;
        }
        if (26 <= i && i < 28) {
            return 8;
        }
        if (i == 28) {
            return 9;
        }
        if (i == 29) {
            return 10;
        }
        if (i == 30) {
            return 11;
        }
        if (31 <= i && i < 33) {
            return 12;
        }
        if (i == 33) {
            return 13;
        }
        if (i == 34) {
            return 14;
        }
        if (i == 35) {
            return 15;
        }
        if (i == 36) {
            return 16;
        }
        if (i == 37) {
            return 17;
        }
        String str = Build.VERSION.RELEASE;
        str.getClass();
        String str2 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(str, new String[]{Separators.DOT}, false, 0, 6, null));
        if (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    public static void i() {
        Build.VERSION.RELEASE.getClass();
    }

    public final String d() {
        String strC = this.l;
        if (StringsKt.W(strC)) {
            strC = q7d0.c(this.b, "DEVICE_FORM_FACTOR");
            if (strC == null) {
                strC = "";
            }
            this.l = strC;
        }
        return strC;
    }

    public final Pair e() {
        Pair pair = this.c;
        if (pair != null) {
            return pair;
        }
        String str = Build.MANUFACTURER;
        str.getClass();
        q7d0 q7d0Var = this.b;
        String strB = q7d0Var.b("RETAIL_BRANDING_DEVICE", str);
        if (strB != null) {
            str = strB;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        String strB2 = q7d0Var.b("MARKETING_NAME_DEVICE", str2);
        if (strB2 != null) {
            str2 = strB2;
        }
        Pair pair2 = new Pair(str, str2);
        this.c = pair2;
        return pair2;
    }

    public final String f() {
        String str;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.e.getValue();
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            TelephonyManager telephonyManager = (TelephonyManager) this.g.getValue();
            String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
            if (networkOperatorName == null) {
                networkOperatorName = "";
            }
            Object objValueOf = activeNetworkInfo != null ? Integer.valueOf(activeNetworkInfo.getType()) : "";
            if (objValueOf.equals(1)) {
                str = "WIFI";
            } else if (objValueOf.equals(0)) {
                str = "MOBILE";
            } else {
                str = (activeNetworkInfo != null ? Integer.valueOf(activeNetworkInfo.getType()) : "") + " - OTHER";
            }
            return networkOperatorName + Separators.SP + str;
        } catch (Exception unused) {
            return "null";
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    public final boolean g() {
        boolean z;
        String[] strArrSplit;
        boolean z2;
        String[] strArrSplit2;
        boolean z3;
        String[] strArr;
        String str;
        Process processExec;
        boolean z4;
        jeg0 jeg0Var = (jeg0) this.m.getValue();
        jeg0Var.getClass();
        if (jeg0Var.b(new ArrayList(Arrays.asList(j47.j)))) {
            z = true;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(j47.k));
            if (jeg0Var.b(arrayList) || jeg0.a("su")) {
                z = true;
            } else {
                HashMap map = new HashMap();
                map.put("ro.debuggable", "1");
                map.put("ro.secure", "0");
                try {
                    InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
                    strArrSplit = inputStream == null ? null : new Scanner(inputStream).useDelimiter("\\A").next().split(Separators.RETURN);
                } catch (IOException | NoSuchElementException e) {
                    e.printStackTrace();
                }
                if (strArrSplit == null) {
                    z2 = false;
                } else {
                    z2 = false;
                    for (String str2 : strArrSplit) {
                        for (String str3 : map.keySet()) {
                            if (str2.contains(str3)) {
                                String strL = kng0.l("[", (String) map.get(str3), "]");
                                if (str2.contains(strL)) {
                                    Log.v("RootBeer", vdx.N().concat(kng0.m(str3, " = ", strL, " detected!")));
                                    z2 = true;
                                }
                            }
                        }
                    }
                }
                if (z2) {
                    z = true;
                } else {
                    try {
                        InputStream inputStream2 = Runtime.getRuntime().exec("mount").getInputStream();
                        strArrSplit2 = inputStream2 == null ? null : new Scanner(inputStream2).useDelimiter("\\A").next().split(Separators.RETURN);
                    } catch (IOException | NoSuchElementException e2) {
                        e2.printStackTrace();
                    }
                    if (strArrSplit2 == null) {
                        z3 = false;
                    } else {
                        int length = strArrSplit2.length;
                        int i = 0;
                        z3 = false;
                        while (i < length) {
                            String str4 = strArrSplit2[i];
                            String[] strArrSplit3 = str4.split(Separators.SP);
                            if (strArrSplit3.length < 6) {
                                vdx.H("Error formatting mount line: ".concat(str4));
                            } else {
                                String str5 = strArrSplit3[2];
                                String strReplace = strArrSplit3[5];
                                String[] strArr2 = j47.m;
                                int i2 = 0;
                                while (i2 < 7) {
                                    String str6 = strArr2[i2];
                                    if (!str5.equalsIgnoreCase(str6)) {
                                        strArr = strArrSplit2;
                                        break;
                                        break;
                                    }
                                    strReplace = strReplace.replace(Separators.LPAREN, "").replace(Separators.RPAREN, "");
                                    String[] strArrSplit4 = strReplace.split(Separators.COMMA);
                                    int length2 = strArrSplit4.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length2) {
                                            strArr = strArrSplit2;
                                            break;
                                        }
                                        strArr = strArrSplit2;
                                        if (strArrSplit4[i3].equalsIgnoreCase("rw")) {
                                            Log.v("RootBeer", vdx.N().concat(w6x.q(str6, " path is mounted with rw permissions! ", str4)));
                                            z3 = true;
                                            break;
                                        }
                                        i3++;
                                        strArrSplit2 = strArr;
                                    }
                                    i2++;
                                    strArrSplit2 = strArr;
                                }
                            }
                            i++;
                            strArrSplit2 = strArrSplit2;
                        }
                    }
                    if (z3 || ((str = Build.TAGS) != null && str.contains("test-keys"))) {
                        z = true;
                    } else {
                        try {
                            processExec = Runtime.getRuntime().exec(new String[]{"which", "su"});
                            try {
                                z4 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
                                processExec.destroy();
                            } catch (Throwable unused) {
                                if (processExec != null) {
                                    processExec.destroy();
                                }
                                z4 = false;
                            }
                        } catch (Throwable unused2) {
                            processExec = null;
                        }
                        if (z4) {
                            z = true;
                        } else {
                            if (RootBeerNative.f46049a) {
                                String[] strArrY0 = j47.y0();
                                int length3 = strArrY0.length;
                                String[] strArr3 = new String[length3];
                                for (int i4 = 0; i4 < length3; i4++) {
                                    strArr3[i4] = axq.n(new StringBuilder(), strArrY0[i4], "su");
                                }
                                RootBeerNative rootBeerNative = new RootBeerNative();
                                z = true;
                                try {
                                    rootBeerNative.setLogDebugMessages(true);
                                    if (rootBeerNative.checkForRoot(strArr3) <= 0) {
                                    }
                                } catch (UnsatisfiedLinkError unused3) {
                                }
                            } else {
                                vdx.H("We could not load the native library to test for root");
                                z = true;
                            }
                            if (!jeg0.a("magisk")) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }
}
