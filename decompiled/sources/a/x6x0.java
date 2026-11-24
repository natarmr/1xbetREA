package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.clientauthutils.DigestServerAuthenticationHelper;
import android.javax.sip.header.SubscriptionStateHeader;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public final class x6x0 extends ryw0 {
    public static final String[] j = {"firebase_", "google_", "ga_"};
    public static final String[] k = {"_err"};
    public SecureRandom d;
    public final AtomicLong e;
    public int f;
    public zj30 g;
    public Boolean h;
    public Integer i;

    public x6x0(kxw0 kxw0Var) {
        super(kxw0Var);
        this.i = null;
        this.e = new AtomicLong(0L);
    }

    public static void E1(zlt0 zlt0Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        K1(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        zlt0Var.p(bundle, str, "_err");
    }

    public static MessageDigest F1() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long G1(byte[] bArr) {
        s0x.H(bArr);
        int length = bArr.length;
        long j2 = 0;
        if (length <= 0) {
            v4i0.e();
            return 0L;
        }
        int i = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j2 += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j2;
    }

    public static boolean H1(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final boolean K1(int i, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean N1(String str, String[] strArr) {
        s0x.H(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean O1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(Separators.STAR) || Arrays.asList(str.split(Separators.COMMA)).contains(str2);
    }

    public static boolean Q1(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(BundleUtil.UNDERLINE_TAG);
    }

    public static byte[] V1(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList g2(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(HiAnalyticsConstant.BI_KEY_APP_ID, zzahVar.f45541a);
            bundle.putString("origin", zzahVar.b);
            bundle.putLong("creation_timestamp", zzahVar.d);
            bundle.putString("name", zzahVar.c.b);
            Object objM = zzahVar.c.m();
            s0x.H(objM);
            u4n0.x(bundle, objM);
            bundle.putBoolean(SubscriptionStateHeader.ACTIVE, zzahVar.e);
            String str = zzahVar.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbh zzbhVar = zzahVar.g;
            if (zzbhVar != null) {
                bundle.putString("timed_out_event_name", zzbhVar.f45544a);
                zzbf zzbfVar = zzbhVar.b;
                if (zzbfVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbfVar.s());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.h);
            zzbh zzbhVar2 = zzahVar.i;
            if (zzbhVar2 != null) {
                bundle.putString("triggered_event_name", zzbhVar2.f45544a);
                zzbf zzbfVar2 = zzbhVar2.b;
                if (zzbfVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbfVar2.s());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.c.c);
            bundle.putLong("time_to_live", zzahVar.j);
            zzbh zzbhVar3 = zzahVar.k;
            if (zzbhVar3 != null) {
                bundle.putString("expired_event_name", zzbhVar3.f45544a);
                zzbf zzbfVar3 = zzbhVar3.b;
                if (zzbfVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbfVar3.s());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean h2(Context context) {
        ActivityInfo receiverInfo;
        s0x.H(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void i2(r1x0 r1x0Var, Bundle bundle, boolean z) {
        if (bundle != null && r1x0Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = r1x0Var.f29705a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = r1x0Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", r1x0Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && r1x0Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean m2(String str) {
        s0x.E(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean o2(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String t1(String str, int i, boolean z) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z) {
                return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
            }
        }
        return null;
    }

    public static boolean y2(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final void A1(Bundle bundle, int i, String str, Object obj) {
        if (K1(i, bundle)) {
            bkw0 bkw0Var = ((kxw0) this.b).d;
            bundle.putString("_ev", t1(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int B1(Object obj, String str) {
        return "_ldl".equals(str) ? q1(obj, "user property referrer", M1(str), str) : q1(obj, "user property", M1(str), str) ? 0 : 7;
    }

    public final Object C1(Object obj, String str) {
        return "_ldl".equals(str) ? L1(M1(str), obj, true, false) : L1(M1(str), obj, false, false);
    }

    public final void D1(String str, Bundle bundle, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            kxw0 kxw0Var = (kxw0) this.b;
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.l.c(kxw0Var.j.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final zj30 I1() {
        ak30 yj30Var;
        Object objInvoke;
        zj30 zj30Var = this.g;
        if (zj30Var != null) {
            return zj30Var;
        }
        Context context = ((kxw0) this.b).f19080a;
        context.getClass();
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        wo woVar = wo.f39469a;
        sb.append(i >= 33 ? woVar.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        if ((i >= 33 ? woVar.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) mmv.r());
            systemService.getClass();
            yj30Var = new yj30(mmv.c(systemService));
        } else {
            vo voVar = vo.f37741a;
            if (((i == 31 || i == 32) ? voVar.a() : 0) >= 9) {
                try {
                    objInvoke = new s43(context, (byte) 11).invoke(context);
                } catch (NoClassDefFoundError unused) {
                    StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                    int i2 = Build.VERSION.SDK_INT;
                    sb2.append((i2 == 31 || i2 == 32) ? voVar.a() : 0);
                    Log.d("MeasurementManager", sb2.toString());
                    objInvoke = null;
                }
                yj30Var = (ak30) objInvoke;
            } else {
                yj30Var = null;
            }
        }
        zj30 zj30Var2 = yj30Var != null ? new zj30(yj30Var) : null;
        this.g = zj30Var2;
        return zj30Var2;
    }

    public final long J1() {
        long j2;
        Object e;
        Integer num;
        m1();
        kxw0 kxw0Var = (kxw0) this.b;
        vtw0 vtw0VarK = kxw0Var.k();
        uuw0 uuw0Var = kxw0Var.f;
        Integer num2 = null;
        if (!O1((String) btw0.q0.a(null), vtw0VarK.r1())) {
            return 0L;
        }
        int i = Build.VERSION.SDK_INT;
        boolean zBooleanValue = false;
        if (i < 30) {
            j2 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j2 = 8;
        } else {
            j2 = ((i < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? 0 : SdkExtensions.getExtensionVersion(1000000)) < ((Integer) btw0.k0.a(null)).intValue() ? 16L : 0L;
        }
        if (!P1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0) {
            if (this.h != null) {
                zBooleanValue = this.h.booleanValue();
            } else {
                zj30 zj30VarI1 = I1();
                if (zj30VarI1 != null) {
                    try {
                        num = (Integer) zj30VarI1.a().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                num2 = num;
                                kxw0.g(uuw0Var);
                                uuw0Var.j.b(e, "Measurement manager api exception");
                                this.h = Boolean.FALSE;
                                num = num2;
                            } catch (CancellationException e3) {
                                e = e3;
                                num2 = num;
                                kxw0.g(uuw0Var);
                                uuw0Var.j.b(e, "Measurement manager api exception");
                                this.h = Boolean.FALSE;
                                num = num2;
                            } catch (ExecutionException e4) {
                                e = e4;
                                num2 = num;
                                kxw0.g(uuw0Var);
                                uuw0Var.j.b(e, "Measurement manager api exception");
                                this.h = Boolean.FALSE;
                                num = num2;
                            } catch (TimeoutException e5) {
                                e = e5;
                                num2 = num;
                                kxw0.g(uuw0Var);
                                uuw0Var.j.b(e, "Measurement manager api exception");
                                this.h = Boolean.FALSE;
                                num = num2;
                            }
                        }
                        this.h = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                        e = e6;
                    }
                    kxw0.g(uuw0Var);
                    uuw0Var.o.b(num, "Measurement manager api status result");
                    zBooleanValue = this.h.booleanValue();
                }
            }
            if (!zBooleanValue) {
                j2 = 64;
            }
        }
        if (j2 == 0) {
            return 1L;
        }
        return j2;
    }

    public final Object L1(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return t1(obj.toString(), i, z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleS1 = S1((Bundle) parcelable);
                if (!bundleS1.isEmpty()) {
                    arrayList.add(bundleS1);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int M1(String str) {
        kxw0 kxw0Var = (kxw0) this.b;
        if ("_ldl".equals(str)) {
            bkw0 bkw0Var = kxw0Var.d;
            return 2048;
        }
        if ("_id".equals(str)) {
            bkw0 bkw0Var2 = kxw0Var.d;
            return 256;
        }
        if ("_lgclid".equals(str)) {
            bkw0 bkw0Var3 = kxw0Var.d;
            return 100;
        }
        bkw0 bkw0Var4 = kxw0Var.d;
        return 36;
    }

    public final boolean P1(String str) {
        m1();
        kxw0 kxw0Var = (kxw0) this.b;
        if (grv0.a(kxw0Var.f19080a).f24675a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(uuw0Var);
        uuw0Var.n.b(str, "Permission not granted");
        return false;
    }

    public final boolean R1(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((kxw0) this.b).d.q1("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle S1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objV1 = v1(bundle.get(str), str);
                if (objV1 == null) {
                    kxw0 kxw0Var = (kxw0) this.b;
                    uuw0 uuw0Var = kxw0Var.f;
                    kxw0.g(uuw0Var);
                    uuw0Var.l.b(kxw0Var.j.b(str), "Param value can't be null");
                } else {
                    D1(str, bundle2, objV1);
                }
            }
        }
        return bundle2;
    }

    public final zzbh T1(String str, Bundle bundle, String str2, long j2, long j3, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (t2(str) != 0) {
            kxw0 kxw0Var = (kxw0) this.b;
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.b(kxw0Var.j.c(str), "Invalid conditional property event name");
            e9d0.o();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleW1 = w1(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleW1 = S1(bundleW1);
        }
        s0x.H(bundleW1);
        return new zzbh(str, new zzbf(bundleW1), str2, j2, j3);
    }

    public final boolean U1(Context context, String str) {
        Signature[] signatureArr;
        kxw0 kxw0Var = (kxw0) this.b;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = grv0.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.g.b(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean W1(int i) {
        Boolean bool = ((kxw0) this.b).i().f;
        if (X1() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int X1() {
        Integer numValueOf = this.i;
        if (numValueOf == null) {
            kxw0 kxw0Var = (kxw0) this.b;
            pav pavVar = pav.b;
            Context context = kxw0Var.f19080a;
            pavVar.getClass();
            AtomicBoolean atomicBoolean = bbv.f2326a;
            int i = 0;
            try {
                i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            numValueOf = Integer.valueOf(i / 1000);
            this.i = numValueOf;
        }
        return numValueOf.intValue();
    }

    public final void Y1(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.j.b(Long.valueOf(j3), "Params already contained engagement");
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void Z1(String str, gpw0 gpw0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            gpw0Var.u(bundle);
        } catch (RemoteException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.j.b(e, "Error returning string value to wrapper");
        }
    }

    public final void a2(gpw0 gpw0Var, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            gpw0Var.u(bundle);
        } catch (RemoteException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.j.b(e, "Error returning long value to wrapper");
        }
    }

    public final void b2(gpw0 gpw0Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            gpw0Var.u(bundle);
        } catch (RemoteException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.j.b(e, "Error returning int value to wrapper");
        }
    }

    public final void c2(gpw0 gpw0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            gpw0Var.u(bundle);
        } catch (RemoteException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.j.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void d2(gpw0 gpw0Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            gpw0Var.u(bundle);
        } catch (RemoteException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.j.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void e2(gpw0 gpw0Var, Bundle bundle) {
        try {
            gpw0Var.u(bundle);
        } catch (RemoteException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.j.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void f2(gpw0 gpw0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            gpw0Var.u(bundle);
        } catch (RemoteException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.j.b(e, "Error returning bundle list to wrapper");
        }
    }

    public final String j2() {
        byte[] bArr = new byte[16];
        l2().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long k2() {
        long andIncrement;
        long j2;
        AtomicLong atomicLong = this.e;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.e;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((kxw0) this.b).k.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f + 1;
            this.f = i;
            j2 = jNextLong + ((long) i);
        }
        return j2;
    }

    public final SecureRandom l2() {
        m1();
        SecureRandom secureRandom = this.d;
        if (secureRandom != null) {
            return secureRandom;
        }
        SecureRandom secureRandom2 = new SecureRandom();
        this.d = secureRandom2;
        return secureRandom2;
    }

    @Override // a.ryw0
    public final boolean n1() {
        return true;
    }

    public final Bundle n2(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        kxw0 kxw0Var = (kxw0) this.b;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter2 = uri.getQueryParameter("utm_campaign");
                    queryParameter3 = uri.getQueryParameter("utm_source");
                    queryParameter4 = uri.getQueryParameter("utm_medium");
                    queryParameter5 = uri.getQueryParameter("gclid");
                    queryParameter6 = uri.getQueryParameter("gbraid");
                    queryParameter7 = uri.getQueryParameter("utm_id");
                    queryParameter8 = uri.getQueryParameter("dclid");
                    queryParameter9 = uri.getQueryParameter("srsltid");
                    queryParameter = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9) || !TextUtils.isEmpty(queryParameter)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("campaign", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString(Payload.SOURCE, queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("medium", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gclid", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("gbraid", queryParameter6);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString(RemoteMessageConst.Notification.CONTENT, queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString(Payload.CAMPAIGN_ID, queryParameter7);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("dclid", queryParameter8);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("srsltid", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("sfmc_id", queryParameter);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (kxw0Var.d.x1(null, btw0.a1)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        kxw0Var.d.getClass();
                        int iMax = Math.max(500, 256);
                        if (string.length() > iMax) {
                            string = t1(string, iMax - 3, true);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.j.b(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean p2(String str, String str2) {
        kxw0 kxw0Var = (kxw0) this.b;
        if (str2 == null) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.i.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            uuw0 uuw0Var3 = kxw0Var.f;
            kxw0.g(uuw0Var3);
            uuw0Var3.i.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                uuw0 uuw0Var4 = kxw0Var.f;
                kxw0.g(uuw0Var4);
                uuw0Var4.i.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean q1(Object obj, String str, int i, String str2) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) <= i) {
            return true;
        }
        uuw0 uuw0Var = ((kxw0) this.b).f;
        kxw0.g(uuw0Var);
        uuw0Var.l.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
        return false;
    }

    public final boolean q2(String str, String str2) {
        kxw0 kxw0Var = (kxw0) this.b;
        if (str2 == null) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.i.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                uuw0 uuw0Var3 = kxw0Var.f;
                kxw0.g(uuw0Var3);
                uuw0Var3.i.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                uuw0 uuw0Var4 = kxw0Var.f;
                kxw0.g(uuw0Var4);
                uuw0Var4.i.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final void r1(String str, String str2, Bundle bundle, List list, boolean z) {
        int iW2;
        int iU1;
        list = list;
        kxw0 kxw0Var = (kxw0) this.b;
        bkw0 bkw0Var = kxw0Var.d;
        uuw0 uuw0Var = kxw0Var.f;
        iuw0 iuw0Var = kxw0Var.j;
        x6x0 x6x0Var = ((kxw0) bkw0Var.b).i;
        kxw0.e(x6x0Var);
        int i = true != x6x0Var.W1(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iW2 = !z ? w2(str3) : 0;
                if (iW2 == 0) {
                    iW2 = x2(str3);
                }
            } else {
                iW2 = 0;
            }
            if (iW2 != 0) {
                A1(bundle, iW2, str3, iW2 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (y2(bundle.get(str3))) {
                    kxw0.g(uuw0Var);
                    uuw0Var.l.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iU1 = 22;
                } else {
                    iU1 = u1(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iU1 != 0 && !"_ev".equals(str3)) {
                    A1(bundle, iU1, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (m2(str3) && !N1(str3, phu0.n)) {
                    i2++;
                    if (!W1(231100000)) {
                        kxw0.g(uuw0Var);
                        uuw0Var.i.c(iuw0Var.a(str), iuw0Var.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        K1(23, bundle);
                        bundle.remove(str3);
                    } else if (i2 > i) {
                        if (!z2) {
                            kxw0.g(uuw0Var);
                            uuw0Var.i.c(iuw0Var.a(str), iuw0Var.e(bundle), vqd.p(new StringBuilder(String.valueOf(i).length() + 55), "Item can't contain more than ", i, " item-scoped custom params"));
                        }
                        K1(28, bundle);
                        bundle.remove(str3);
                        z2 = true;
                    }
                }
            }
        }
    }

    public final boolean r2(String str, String[] strArr, String[] strArr2, String str2) {
        kxw0 kxw0Var = (kxw0) this.b;
        if (str2 == null) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(j[i])) {
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.i.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !N1(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && N1(str2, strArr2)) {
            return true;
        }
        uuw0 uuw0Var3 = kxw0Var.f;
        kxw0.g(uuw0Var3);
        uuw0Var3.i.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean s1(String str) {
        kxw0 kxw0Var = (kxw0) this.b;
        if (TextUtils.isEmpty(str)) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.i.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        s0x.H(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        uuw0 uuw0Var2 = kxw0Var.f;
        kxw0.g(uuw0Var2);
        uuw0Var2.i.b(uuw0.q1(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean s2(int i, String str, String str2) {
        kxw0 kxw0Var = (kxw0) this.b;
        if (str2 == null) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        uuw0 uuw0Var2 = kxw0Var.f;
        kxw0.g(uuw0Var2);
        uuw0Var2.i.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final int t2(String str) {
        if (!q2("event", str)) {
            return 2;
        }
        if (r2("event", cwr0.j, ((kxw0) this.b).d.x1(null, btw0.f1) ? cwr0.l : cwr0.k, str)) {
            return !s2(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    public final int u1(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int size;
        kxw0 kxw0Var = (kxw0) this.b;
        m1();
        int i2 = 0;
        if (!y2(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!N1(str2, phu0.m)) {
                return 20;
            }
            a4x0 a4x0VarI = kxw0Var.i();
            a4x0VarI.m1();
            a4x0VarI.n1();
            if (a4x0VarI.s1()) {
                x6x0 x6x0Var = ((kxw0) a4x0VarI.b).i;
                kxw0.e(x6x0Var);
                if (x6x0Var.X1() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.l.d("Parameter array is too long; discarded. Value kind, name, array length", RemoteMessageConst.MessageBody.PARAM, str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, Response.OK));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, Response.OK)));
                    }
                }
            } else {
                i = 0;
            }
        }
        int iMax = 500;
        if (Q1(str) || Q1(str2)) {
            kxw0Var.d.getClass();
            iMax = Math.max(500, 256);
        } else {
            kxw0Var.d.getClass();
        }
        if (!q1(obj, RemoteMessageConst.MessageBody.PARAM, iMax, str2)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                r1(str, str2, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i2 < length) {
                    Parcelable parcelable = parcelableArr2[i2];
                    if (!(parcelable instanceof Bundle)) {
                        uuw0 uuw0Var2 = kxw0Var.f;
                        kxw0.g(uuw0Var2);
                        uuw0Var2.l.c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    r1(str, str2, (Bundle) parcelable, list, z);
                    i2++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    if (!(obj2 instanceof Bundle)) {
                        uuw0 uuw0Var3 = kxw0Var.f;
                        kxw0.g(uuw0Var3);
                        uuw0Var3.l.c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    r1(str, str2, (Bundle) obj2, list, z);
                    i2++;
                }
            }
        }
        return i;
    }

    public final boolean u2(String str) {
        return ((kxw0) this.b).d.x1(null, btw0.f1) ? N1(str, cwr0.n) : N1(str, cwr0.m);
    }

    public final Object v1(Object obj, String str) {
        kxw0 kxw0Var = (kxw0) this.b;
        int iMax = 500;
        if ("_ev".equals(str)) {
            kxw0Var.d.getClass();
            return L1(Math.max(500, 256), obj, true, true);
        }
        if (Q1(str)) {
            kxw0Var.d.getClass();
            iMax = Math.max(500, 256);
        } else {
            kxw0Var.d.getClass();
        }
        return L1(iMax, obj, false, true);
    }

    public final int v2(String str) {
        if (!q2("user property", str)) {
            return 6;
        }
        if (!r2("user property", epv0.p, null, str)) {
            return 15;
        }
        bkw0 bkw0Var = ((kxw0) this.b).d;
        return !s2(24, "user property", str) ? 6 : 0;
    }

    public final Bundle w1(String str, Bundle bundle, List list, boolean z) {
        int iW2;
        boolean zN1 = N1(str, cwr0.p);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        kxw0 kxw0Var = (kxw0) this.b;
        bkw0 bkw0Var = kxw0Var.d;
        iuw0 iuw0Var = kxw0Var.j;
        x6x0 x6x0Var = ((kxw0) bkw0Var.b).i;
        kxw0.e(x6x0Var);
        int i = x6x0Var.W1(201500000) ? 100 : 25;
        int i2 = 0;
        boolean z2 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iW2 = !z ? w2(str2) : 0;
                if (iW2 == 0) {
                    iW2 = x2(str2);
                }
            } else {
                iW2 = 0;
            }
            if (iW2 != 0) {
                A1(bundle2, iW2, str2, iW2 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iU1 = u1(str, str2, bundle.get(str2), bundle2, list, z, zN1);
                if (iU1 == 17) {
                    A1(bundle2, 17, str2, Boolean.FALSE);
                } else if (iU1 != 0 && !"_ev".equals(str2)) {
                    A1(bundle2, iU1, iU1 == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (m2(str2)) {
                    i2++;
                    if (i2 > i) {
                        if (!z2) {
                            String strP = vqd.p(new StringBuilder(String.valueOf(i).length() + 37), "Event can't contain more than ", i, " params");
                            uuw0 uuw0Var = kxw0Var.f;
                            kxw0.g(uuw0Var);
                            uuw0Var.i.c(iuw0Var.a(str), iuw0Var.e(bundle), strP);
                        }
                        K1(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                }
            }
        }
        return bundle2;
    }

    public final int w2(String str) {
        if (!p2("event param", str)) {
            return 3;
        }
        if (!r2("event param", null, null, str)) {
            return 14;
        }
        bkw0 bkw0Var = ((kxw0) this.b).d;
        return !s2(40, "event param", str) ? 3 : 0;
    }

    public final void x1(xuw0 xuw0Var, int i) {
        Bundle bundle = xuw0Var.e;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (m2(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    String strP = vqd.p(new StringBuilder(String.valueOf(i).length() + 37), "Event can't contain more than ", i, " params");
                    kxw0 kxw0Var = (kxw0) this.b;
                    uuw0 uuw0Var = kxw0Var.f;
                    iuw0 iuw0Var = kxw0Var.j;
                    kxw0.g(uuw0Var);
                    uuw0Var.i.c(iuw0Var.a(xuw0Var.f41532a), iuw0Var.e(bundle), strP);
                    K1(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final int x2(String str) {
        if (!q2("event param", str)) {
            return 3;
        }
        if (!r2("event param", null, null, str)) {
            return 14;
        }
        bkw0 bkw0Var = ((kxw0) this.b).d;
        return !s2(40, "event param", str) ? 3 : 0;
    }

    public final void y1(Parcelable[] parcelableArr, int i) {
        s0x.H(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m2(str) && !N1(str, phu0.n) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        kxw0 kxw0Var = (kxw0) this.b;
                        uuw0 uuw0Var = kxw0Var.f;
                        iuw0 iuw0Var = kxw0Var.j;
                        kxw0.g(uuw0Var);
                        uuw0Var.i.c(iuw0Var.b(str), iuw0Var.e(bundle), vqd.p(new StringBuilder(String.valueOf(i).length() + 60), "Param can't contain more than ", i, " item-scoped custom parameters"));
                    }
                    K1(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final void z1(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                x6x0 x6x0Var = ((kxw0) this.b).i;
                kxw0.e(x6x0Var);
                x6x0Var.D1(str, bundle, bundle2.get(str));
            }
        }
    }
}
