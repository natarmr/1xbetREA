package a;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzao;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ezw0 extends bmw0 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ b1x0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezw0(b1x0 b1x0Var, syw0 syw0Var, byte b) {
        super(syw0Var);
        this.e = b;
        switch (b) {
            case 2:
                Objects.requireNonNull(b1x0Var);
                this.f = b1x0Var;
                super(syw0Var);
                break;
            default:
                Objects.requireNonNull(b1x0Var);
                this.f = b1x0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175  */
    /* JADX WARN: Code duplicated, block: B:61:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:67:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0288 A[Catch: IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, TryCatch #5 {IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, blocks: (B:80:0x0240, B:82:0x0288, B:87:0x0293, B:89:0x0299, B:91:0x02a1, B:92:0x02a7, B:93:0x02ab), top: B:116:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0299 A[Catch: IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, TryCatch #5 {IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, blocks: (B:80:0x0240, B:82:0x0288, B:87:0x0293, B:89:0x0299, B:91:0x02a1, B:92:0x02a7, B:93:0x02ab), top: B:116:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a1 A[Catch: IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, TryCatch #5 {IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, blocks: (B:80:0x0240, B:82:0x0288, B:87:0x0293, B:89:0x0299, B:91:0x02a1, B:92:0x02a7, B:93:0x02ab), top: B:116:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c5  */
    @Override // a.bmw0
    public final void a() throws Throwable {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        a4x0 a4x0VarI;
        kxw0 kxw0Var;
        gtw0 gtw0Var;
        zzao zzaoVarS;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        kxw0 kxw0Var2;
        URL url;
        String strConcat;
        byte b = this.e;
        byte b2 = 0;
        b1x0 b1x0Var = this.f;
        switch (b) {
            case 0:
                b1x0 b1x0Var2 = ((kxw0) b1x0Var.b).m;
                kxw0.f(b1x0Var2);
                new Thread(new dzw0(b1x0Var2, b2)).start();
                break;
            case 1:
                b1x0Var.K1();
                break;
            case 2:
                b1x0Var.r1();
                break;
            default:
                kxw0 kxw0Var3 = (kxw0) b1x0Var.b;
                wvw0 wvw0Var = kxw0Var3.e;
                uuw0 uuw0Var = kxw0Var3.f;
                fxw0 fxw0Var = kxw0Var3.g;
                kxw0.g(fxw0Var);
                fxw0Var.m1();
                k1x0 k1x0Var = kxw0Var3.o;
                kxw0.g(k1x0Var);
                kxw0 kxw0Var4 = (kxw0) k1x0Var.b;
                kxw0.g(k1x0Var);
                String strR1 = kxw0Var3.k().r1();
                Boolean boolZ1 = kxw0Var3.d.z1("google_analytics_adid_collection_enabled");
                if (boolZ1 == null || boolZ1.booleanValue()) {
                    kxw0.e(wvw0Var);
                    kxw0 kxw0Var5 = (kxw0) wvw0Var.b;
                    wvw0Var.m1();
                    if (wvw0Var.t1().i(wyw0.AD_STORAGE)) {
                        kxw0Var5.k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = wvw0Var.i;
                        if (str3 == null || jElapsedRealtime >= wvw0Var.k) {
                            wvw0Var.k = kxw0Var5.d.u1(strR1, btw0.b) + jElapsedRealtime;
                            try {
                                t40 t40VarA = u40.a(kxw0Var5.f19080a);
                                wvw0Var.i = "";
                                String str4 = t40VarA.c;
                                if (str4 != null) {
                                    wvw0Var.i = str4;
                                }
                                wvw0Var.j = t40VarA.b;
                            } catch (Exception e) {
                                uuw0 uuw0Var2 = kxw0Var5.f;
                                kxw0.g(uuw0Var2);
                                uuw0Var2.n.b(e, "Unable to get advertising id");
                                wvw0Var.i = "";
                            }
                            pair = new Pair(wvw0Var.i, Boolean.valueOf(wvw0Var.j));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(wvw0Var.j));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        kxw0.g(k1x0Var);
                        k1x0Var.o1();
                        ConnectivityManager connectivityManager = (ConnectivityManager) kxw0Var4.f19080a.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            a4x0 a4x0VarI2 = kxw0Var3.i();
                            a4x0VarI2.m1();
                            a4x0VarI2.n1();
                            if (!a4x0VarI2.s1()) {
                                b1x0 b1x0Var3 = kxw0Var3.m;
                                kxw0.f(b1x0Var3);
                                kxw0 kxw0Var6 = (kxw0) b1x0Var3.b;
                                b1x0Var3.m1();
                                a4x0VarI = kxw0Var6.i();
                                kxw0Var = (kxw0) a4x0VarI.b;
                                a4x0VarI.m1();
                                a4x0VarI.n1();
                                gtw0Var = a4x0VarI.e;
                                if (gtw0Var == null) {
                                    a4x0VarI.r1();
                                    uuw0 uuw0Var3 = kxw0Var.f;
                                    kxw0.g(uuw0Var3);
                                    uuw0Var3.n.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        zzaoVarS = gtw0Var.s(a4x0VarI.B1(false));
                                        a4x0VarI.y1();
                                    } catch (RemoteException e2) {
                                        uuw0 uuw0Var4 = kxw0Var.f;
                                        kxw0.g(uuw0Var4);
                                        uuw0Var4.g.b(e2, "Failed to get consents; remote exception");
                                        zzaoVarS = null;
                                    }
                                    if (zzaoVarS != null) {
                                        bundle = zzaoVarS.f45542a;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = kxw0Var3.B;
                                        kxw0Var3.B = i + 1;
                                        b2 = i < 10 ? (byte) 1 : (byte) 0;
                                        kxw0.g(uuw0Var);
                                        quw0 quw0Var = uuw0Var.n;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        quw0Var.b(Integer.valueOf(kxw0Var3.B), axq.n(sb2, str2, " retryCount"));
                                    } else {
                                        xyw0 xyw0VarB = xyw0.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(xyw0VarB.f());
                                        jmw0 jmw0VarC = jmw0.c(100, bundle);
                                        str = jmw0VarC.d;
                                        sb.append("&dma=");
                                        Boolean bool2 = jmw0VarC.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = xyw0.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i2 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i2);
                                        kxw0.g(uuw0Var);
                                        uuw0Var.o.b(sb, "Consent query parameters to Bow");
                                        x6x0 x6x0Var = kxw0Var3.i;
                                        kxw0.e(x6x0Var);
                                        ((kxw0) kxw0Var3.k().b).d.s1();
                                        String str5 = (String) pair.first;
                                        long jA = wvw0Var.v.a() - 1;
                                        string = sb.toString();
                                        kxw0Var2 = (kxw0) x6x0Var.b;
                                        try {
                                            s0x.E(str5);
                                            s0x.E(strR1);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + x6x0Var.X1()) + "&rdid=" + str5 + "&bundleid=" + strR1 + "&retry=" + jA;
                                            if (strR1.equals(kxw0Var2.d.q1("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            uuw0 uuw0Var5 = kxw0Var2.f;
                                            kxw0.g(uuw0Var5);
                                            uuw0Var5.g.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            uuw0 uuw0Var6 = kxw0Var2.f;
                                            kxw0.g(uuw0Var6);
                                            uuw0Var6.g.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            kxw0.g(k1x0Var);
                                            w4p0 w4p0Var = new w4p0(kxw0Var3, (byte) 24);
                                            k1x0Var.o1();
                                            fxw0 fxw0Var2 = kxw0Var4.g;
                                            kxw0.g(fxw0Var2);
                                            fxw0Var2.y1(new cvw0(k1x0Var, strR1, url, (byte[]) null, (HashMap) null, w4p0Var));
                                        }
                                    }
                                }
                                zzaoVarS = null;
                                if (zzaoVarS != null) {
                                    bundle = zzaoVarS.f45542a;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = kxw0Var3.B;
                                    kxw0Var3.B = i + 1;
                                    if (i < 10) {
                                    }
                                    kxw0.g(uuw0Var);
                                    quw0 quw0Var2 = uuw0Var.n;
                                    StringBuilder sb3 = new StringBuilder(69);
                                    sb3.append("Failed to retrieve DMA consent from the service, ");
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    quw0Var2.b(Integer.valueOf(kxw0Var3.B), axq.n(sb3, str2, " retryCount"));
                                } else {
                                    xyw0 xyw0VarB2 = xyw0.b(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(xyw0VarB2.f());
                                    jmw0 jmw0VarC2 = jmw0.c(100, bundle);
                                    str = jmw0VarC2.d;
                                    sb.append("&dma=");
                                    Boolean bool3 = jmw0VarC2.c;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = xyw0.d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i3 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i3);
                                    kxw0.g(uuw0Var);
                                    uuw0Var.o.b(sb, "Consent query parameters to Bow");
                                    x6x0 x6x0Var2 = kxw0Var3.i;
                                    kxw0.e(x6x0Var2);
                                    ((kxw0) kxw0Var3.k().b).d.s1();
                                    String str6 = (String) pair.first;
                                    long jA2 = wvw0Var.v.a() - 1;
                                    string = sb.toString();
                                    kxw0Var2 = (kxw0) x6x0Var2.b;
                                    s0x.E(str6);
                                    s0x.E(strR1);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + x6x0Var2.X1()) + "&rdid=" + str6 + "&bundleid=" + strR1 + "&retry=" + jA2;
                                    if (strR1.equals(kxw0Var2.d.q1("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        kxw0.g(k1x0Var);
                                        w4p0 w4p0Var2 = new w4p0(kxw0Var3, (byte) 24);
                                        k1x0Var.o1();
                                        fxw0 fxw0Var3 = kxw0Var4.g;
                                        kxw0.g(fxw0Var3);
                                        fxw0Var3.y1(new cvw0(k1x0Var, strR1, url, (byte[]) null, (HashMap) null, w4p0Var2));
                                    }
                                }
                                break;
                            } else {
                                x6x0 x6x0Var3 = ((kxw0) a4x0VarI2.b).i;
                                kxw0.e(x6x0Var3);
                                if (x6x0Var3.X1() >= 234200) {
                                    b1x0 b1x0Var4 = kxw0Var3.m;
                                    kxw0.f(b1x0Var4);
                                    kxw0 kxw0Var7 = (kxw0) b1x0Var4.b;
                                    b1x0Var4.m1();
                                    a4x0VarI = kxw0Var7.i();
                                    kxw0Var = (kxw0) a4x0VarI.b;
                                    a4x0VarI.m1();
                                    a4x0VarI.n1();
                                    gtw0Var = a4x0VarI.e;
                                    if (gtw0Var == null) {
                                        a4x0VarI.r1();
                                        uuw0 uuw0Var7 = kxw0Var.f;
                                        kxw0.g(uuw0Var7);
                                        uuw0Var7.n.a("Failed to get consents; not connected to service yet.");
                                    } else {
                                        zzaoVarS = gtw0Var.s(a4x0VarI.B1(false));
                                        a4x0VarI.y1();
                                        if (zzaoVarS != null) {
                                            bundle = zzaoVarS.f45542a;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i = kxw0Var3.B;
                                            kxw0Var3.B = i + 1;
                                            if (i < 10) {
                                            }
                                            kxw0.g(uuw0Var);
                                            quw0 quw0Var3 = uuw0Var.n;
                                            StringBuilder sb4 = new StringBuilder(69);
                                            sb4.append("Failed to retrieve DMA consent from the service, ");
                                            if (i < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            quw0Var3.b(Integer.valueOf(kxw0Var3.B), axq.n(sb4, str2, " retryCount"));
                                        } else {
                                            xyw0 xyw0VarB3 = xyw0.b(100, bundle);
                                            sb.append("&gcs=");
                                            sb.append(xyw0VarB3.f());
                                            jmw0 jmw0VarC3 = jmw0.c(100, bundle);
                                            str = jmw0VarC3.d;
                                            sb.append("&dma=");
                                            Boolean bool4 = jmw0VarC3.c;
                                            bool = Boolean.FALSE;
                                            sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            iOrdinal = xyw0.d(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i4);
                                            kxw0.g(uuw0Var);
                                            uuw0Var.o.b(sb, "Consent query parameters to Bow");
                                            x6x0 x6x0Var4 = kxw0Var3.i;
                                            kxw0.e(x6x0Var4);
                                            ((kxw0) kxw0Var3.k().b).d.s1();
                                            String str7 = (String) pair.first;
                                            long jA3 = wvw0Var.v.a() - 1;
                                            string = sb.toString();
                                            kxw0Var2 = (kxw0) x6x0Var4.b;
                                            s0x.E(str7);
                                            s0x.E(strR1);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + x6x0Var4.X1()) + "&rdid=" + str7 + "&bundleid=" + strR1 + "&retry=" + jA3;
                                            if (strR1.equals(kxw0Var2.d.q1("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                kxw0.g(k1x0Var);
                                                w4p0 w4p0Var3 = new w4p0(kxw0Var3, (byte) 24);
                                                k1x0Var.o1();
                                                fxw0 fxw0Var4 = kxw0Var4.g;
                                                kxw0.g(fxw0Var4);
                                                fxw0Var4.y1(new cvw0(k1x0Var, strR1, url, (byte[]) null, (HashMap) null, w4p0Var3));
                                            }
                                        }
                                    }
                                    zzaoVarS = null;
                                    if (zzaoVarS != null) {
                                        bundle = zzaoVarS.f45542a;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = kxw0Var3.B;
                                        kxw0Var3.B = i + 1;
                                        if (i < 10) {
                                        }
                                        kxw0.g(uuw0Var);
                                        quw0 quw0Var4 = uuw0Var.n;
                                        StringBuilder sb5 = new StringBuilder(69);
                                        sb5.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        quw0Var4.b(Integer.valueOf(kxw0Var3.B), axq.n(sb5, str2, " retryCount"));
                                    } else {
                                        xyw0 xyw0VarB4 = xyw0.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(xyw0VarB4.f());
                                        jmw0 jmw0VarC4 = jmw0.c(100, bundle);
                                        str = jmw0VarC4.d;
                                        sb.append("&dma=");
                                        Boolean bool5 = jmw0VarC4.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = xyw0.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i5);
                                        kxw0.g(uuw0Var);
                                        uuw0Var.o.b(sb, "Consent query parameters to Bow");
                                        x6x0 x6x0Var5 = kxw0Var3.i;
                                        kxw0.e(x6x0Var5);
                                        ((kxw0) kxw0Var3.k().b).d.s1();
                                        String str8 = (String) pair.first;
                                        long jA4 = wvw0Var.v.a() - 1;
                                        string = sb.toString();
                                        kxw0Var2 = (kxw0) x6x0Var5.b;
                                        s0x.E(str8);
                                        s0x.E(strR1);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + x6x0Var5.X1()) + "&rdid=" + str8 + "&bundleid=" + strR1 + "&retry=" + jA4;
                                        if (strR1.equals(kxw0Var2.d.q1("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            kxw0.g(k1x0Var);
                                            w4p0 w4p0Var4 = new w4p0(kxw0Var3, (byte) 24);
                                            k1x0Var.o1();
                                            fxw0 fxw0Var5 = kxw0Var4.g;
                                            kxw0.g(fxw0Var5);
                                            fxw0Var5.y1(new cvw0(k1x0Var, strR1, url, (byte[]) null, (HashMap) null, w4p0Var4));
                                        }
                                    }
                                } else {
                                    x6x0 x6x0Var6 = kxw0Var3.i;
                                    kxw0.e(x6x0Var6);
                                    ((kxw0) kxw0Var3.k().b).d.s1();
                                    String str9 = (String) pair.first;
                                    long jA5 = wvw0Var.v.a() - 1;
                                    string = sb.toString();
                                    kxw0Var2 = (kxw0) x6x0Var6.b;
                                    s0x.E(str9);
                                    s0x.E(strR1);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + x6x0Var6.X1()) + "&rdid=" + str9 + "&bundleid=" + strR1 + "&retry=" + jA5;
                                    if (strR1.equals(kxw0Var2.d.q1("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        kxw0.g(k1x0Var);
                                        w4p0 w4p0Var5 = new w4p0(kxw0Var3, (byte) 24);
                                        k1x0Var.o1();
                                        fxw0 fxw0Var6 = kxw0Var4.g;
                                        kxw0.g(fxw0Var6);
                                        fxw0Var6.y1(new cvw0(k1x0Var, strR1, url, (byte[]) null, (HashMap) null, w4p0Var5));
                                    }
                                }
                            }
                        } else {
                            kxw0.g(uuw0Var);
                            uuw0Var.j.a("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        kxw0.g(uuw0Var);
                        uuw0Var.o.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    kxw0.g(uuw0Var);
                    uuw0Var.o.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (b2 != 0) {
                    b1x0Var.t.b(2000L);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ezw0(b1x0 b1x0Var, syw0 syw0Var, byte b, boolean z) {
        super(syw0Var);
        this.e = b;
        this.f = b1x0Var;
    }
}
