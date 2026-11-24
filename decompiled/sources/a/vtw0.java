package a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class vtw0 extends etw0 {
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public long i;
    public final long j;
    public final long k;
    public List l;
    public String m;
    public final String n;
    public int o;
    public String p;
    public String q;
    public long r;
    public String s;

    public vtw0(kxw0 kxw0Var, long j, long j2, String str) {
        super(kxw0Var);
        this.r = 0L;
        this.s = null;
        this.j = j;
        this.k = j2;
        this.n = str;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026c A[Catch: NameNotFoundException -> 0x0274, TRY_LEAVE, TryCatch #6 {NameNotFoundException -> 0x0274, blocks: (B:98:0x0266, B:100:0x026c), top: B:140:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x026f A[PHI: r5 r37
  0x026f: PHI (r5v16 int) = (r5v15 int), (r5v17 int) binds: [B:104:0x0274, B:99:0x026a] A[DONT_GENERATE, DONT_INLINE]
  0x026f: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:104:0x0274, B:99:0x026a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02af  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:118:0x02db  */
    /* JADX WARN: Code duplicated, block: B:121:0x030d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:44:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0203  */
    /* JADX WARN: Code duplicated, block: B:78:0x0206  */
    /* JADX WARN: Code duplicated, block: B:87:0x022d  */
    /* JADX WARN: Code duplicated, block: B:91:0x023a  */
    /* JADX WARN: Code duplicated, block: B:92:0x023c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0257  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final com.google.android.gms.measurement.internal.zzr p1(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean zA;
        boolean z2;
        boolean z3;
        String str3;
        Class<?> clsLoadClass;
        Object objInvoke;
        long jA;
        long jMin;
        Boolean boolZ1;
        boolean z4;
        boolean z5;
        String strJ2;
        boolean z6;
        String str4;
        Boolean boolZ2;
        boolean zBooleanValue;
        kxw0 kxw0Var;
        String strR1;
        boolean z7;
        int i;
        int i2;
        long j3;
        ApplicationInfo applicationInfoA;
        atw0 atw0Var;
        long j4;
        int extensionVersion;
        long jJ1;
        m1();
        String strR2 = r1();
        String strS1 = s1();
        n1();
        String str5 = this.e;
        n1();
        long j5 = this.f;
        n1();
        s0x.H(this.g);
        String str6 = this.g;
        kxw0 kxw0Var2 = (kxw0) this.b;
        bkw0 bkw0Var = kxw0Var2.d;
        uuw0 uuw0Var = kxw0Var2.f;
        bkw0 bkw0Var2 = kxw0Var2.d;
        Context context = kxw0Var2.f19080a;
        x6x0 x6x0Var = kxw0Var2.i;
        wvw0 wvw0Var = kxw0Var2.e;
        bkw0Var.s1();
        n1();
        m1();
        long j6 = this.i;
        if (j6 == 0) {
            kxw0.e(x6x0Var);
            kxw0 kxw0Var3 = (kxw0) x6x0Var.b;
            String packageName = context.getPackageName();
            x6x0Var.m1();
            s0x.E(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest messageDigestF1 = x6x0.F1();
            long jG1 = -1;
            if (messageDigestF1 == null) {
                uuw0 uuw0Var2 = kxw0Var3.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.g.a("Could not get MD5 instance");
                str2 = str5;
                j = j5;
            } else {
                if (packageManager != null) {
                    try {
                        if (x6x0Var.U1(context, packageName)) {
                            str2 = str5;
                            j = j5;
                            jG1 = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j5;
                                try {
                                    Signature[] signatureArr = grv0.a(context).b(64, kxw0Var3.f19080a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        uuw0 uuw0Var3 = kxw0Var3.f;
                                        kxw0.g(uuw0Var3);
                                        uuw0Var3.j.a("Could not get signatures");
                                    } else {
                                        jG1 = x6x0.G1(messageDigestF1.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    uuw0 uuw0Var4 = kxw0Var3.f;
                                    kxw0.g(uuw0Var4);
                                    uuw0Var4.g.b(e, "Package name not found");
                                    j2 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j5;
                                uuw0 uuw0Var5 = kxw0Var3.f;
                                kxw0.g(uuw0Var5);
                                uuw0Var5.g.b(e, "Package name not found");
                                j2 = 0;
                                this.i = j2;
                                zA = kxw0Var2.a();
                                kxw0.e(wvw0Var);
                                z2 = !wvw0Var.s;
                                m1();
                                if (kxw0Var2.a()) {
                                    if (bkw0Var2.x1(null, btw0.H0)) {
                                        kxw0.g(uuw0Var);
                                        uuw0Var.o.a("Disabled IID for tests.");
                                        z3 = zA;
                                        str3 = null;
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                z3 = zA;
                                            } else {
                                                z3 = zA;
                                                try {
                                                    Object[] objArr = {context};
                                                    str3 = null;
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                                                    if (objInvoke != null) {
                                                        try {
                                                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            kxw0.g(uuw0Var);
                                                            uuw0Var.l.a("Failed to retrieve Firebase Instance Id");
                                                            str3 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    kxw0.g(uuw0Var);
                                                    uuw0Var.k.a("Failed to obtain Firebase Analytics instance");
                                                }
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                        str3 = null;
                                    }
                                } else {
                                    z3 = zA;
                                    str3 = null;
                                }
                                kxw0.e(wvw0Var);
                                jA = wvw0Var.g.a();
                                long j7 = j2;
                                jMin = kxw0Var2.Z;
                                if (jA != 0) {
                                    jMin = Math.min(jMin, jA);
                                }
                                n1();
                                int i3 = this.o;
                                boolZ1 = bkw0Var2.z1("google_analytics_adid_collection_enabled");
                                if (boolZ1 != null) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                kxw0.e(wvw0Var);
                                wvw0Var.m1();
                                long j8 = jMin;
                                boolean z8 = wvw0Var.q1().getBoolean("deferred_analytics_collection", z);
                                if (bkw0Var2.C1("google_analytics_default_allow_ad_personalization_signals", true) != tyw0.GRANTED) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z5);
                                List list = this.l;
                                String strG = wvw0Var.t1().g();
                                strJ2 = this.m;
                                if (strJ2 == null) {
                                    kxw0.e(x6x0Var);
                                    strJ2 = x6x0Var.j2();
                                    this.m = strJ2;
                                }
                                String str7 = strJ2;
                                if (wvw0Var.t1().i(wyw0.ANALYTICS_STORAGE)) {
                                    m1();
                                    if (this.r == 0) {
                                        z6 = z2;
                                    } else {
                                        kxw0Var2.k.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.r;
                                        z6 = z2;
                                        if (this.q != null) {
                                            q1();
                                        }
                                    }
                                    if (this.q == null) {
                                        q1();
                                    }
                                    str4 = this.q;
                                } else {
                                    z6 = z2;
                                    str4 = null;
                                }
                                boolZ2 = bkw0Var2.z1("google_analytics_sgtm_upload_enabled");
                                if (boolZ2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolZ2.booleanValue();
                                }
                                kxw0.e(x6x0Var);
                                kxw0Var = (kxw0) x6x0Var.b;
                                String str8 = str4;
                                strR1 = r1();
                                boolean z9 = zBooleanValue;
                                if (kxw0Var.f19080a.getPackageManager() == null) {
                                    z7 = z4;
                                    j3 = 0;
                                } else {
                                    try {
                                        z7 = z4;
                                        i = 0;
                                        try {
                                            applicationInfoA = grv0.a(kxw0Var.f19080a).a(0, strR1);
                                            if (applicationInfoA != null) {
                                                i2 = applicationInfoA.targetSdkVersion;
                                            } else {
                                                i2 = i;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            uuw0 uuw0Var6 = kxw0Var.f;
                                            kxw0.g(uuw0Var6);
                                            uuw0Var6.m.b(strR1, "PackageManager failed to find running app: app_id");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                        z7 = z4;
                                        i = 0;
                                    }
                                    j3 = i2;
                                }
                                kxw0.e(wvw0Var);
                                int i4 = wvw0Var.t1().b;
                                kxw0.e(wvw0Var);
                                wvw0Var.m1();
                                String str9 = jmw0.b(wvw0Var.q1().getString("dma_consent_settings", null)).b;
                                miw0.a();
                                atw0Var = btw0.P0;
                                if (bkw0Var2.x1(null, atw0Var)) {
                                    kxw0.e(x6x0Var);
                                    j4 = j3;
                                    if (Build.VERSION.SDK_INT < 30) {
                                    }
                                    miw0.a();
                                    if (bkw0Var2.x1(null, atw0Var)) {
                                        kxw0.e(x6x0Var);
                                        jJ1 = x6x0Var.J1();
                                    } else {
                                        jJ1 = 0;
                                    }
                                    String str10 = bkw0Var2.d;
                                    String strValueOf = String.valueOf(xyw0.h(bkw0Var2.C1("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j9 = jJ1;
                                    long j10 = kxw0Var2.Z;
                                    kxw0.d(kxw0Var2.u);
                                    return new com.google.android.gms.measurement.internal.zzr(strR2, strS1, str2, j, str6, 161000L, j7, str, z3, z6, str3, j8, i3, z7, z8, boolValueOf, this.j, list, strG, str7, str8, z9, j4, i4, str9, extensionVersion, j9, str10, strValueOf, j10, esw0.h(kxw0Var2.u.q1()), bkw0Var2.x1(null, btw0.e1) ? kxw0Var2.f1 : 0L);
                                }
                                j4 = j3;
                                extensionVersion = 0;
                                miw0.a();
                                if (bkw0Var2.x1(null, atw0Var)) {
                                    kxw0.e(x6x0Var);
                                    jJ1 = x6x0Var.J1();
                                } else {
                                    jJ1 = 0;
                                }
                                String str11 = bkw0Var2.d;
                                String strValueOf2 = String.valueOf(xyw0.h(bkw0Var2.C1("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j11 = jJ1;
                                long j12 = kxw0Var2.Z;
                                kxw0.d(kxw0Var2.u);
                                return new com.google.android.gms.measurement.internal.zzr(strR2, strS1, str2, j, str6, 161000L, j7, str, z3, z6, str3, j8, i3, z7, z8, boolValueOf, this.j, list, strG, str7, str8, z9, j4, i4, str9, extensionVersion, j11, str11, strValueOf2, j12, esw0.h(kxw0Var2.u.q1()), bkw0Var2.x1(null, btw0.e1) ? kxw0Var2.f1 : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j5;
                }
                j2 = 0;
                this.i = j2;
            }
            j2 = jG1;
            this.i = j2;
        } else {
            str2 = str5;
            j = j5;
            z = false;
            j2 = j6;
        }
        zA = kxw0Var2.a();
        kxw0.e(wvw0Var);
        z2 = !wvw0Var.s;
        m1();
        if (kxw0Var2.a()) {
            z3 = zA;
            str3 = null;
        } else {
            if (bkw0Var2.x1(null, btw0.H0)) {
                kxw0.g(uuw0Var);
                uuw0Var.o.a("Disabled IID for tests.");
                z3 = zA;
                str3 = null;
            } else {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    z3 = zA;
                } else {
                    z3 = zA;
                    Object[] objArr2 = {context};
                    str3 = null;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr2);
                    if (objInvoke != null) {
                        str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str3 = null;
            }
        }
        kxw0.e(wvw0Var);
        jA = wvw0Var.g.a();
        long j13 = j2;
        jMin = kxw0Var2.Z;
        if (jA != 0) {
            jMin = Math.min(jMin, jA);
        }
        n1();
        int i5 = this.o;
        boolZ1 = bkw0Var2.z1("google_analytics_adid_collection_enabled");
        if (boolZ1 != null || boolZ1.booleanValue()) {
            z4 = true;
        } else {
            z4 = z;
        }
        kxw0.e(wvw0Var);
        wvw0Var.m1();
        long j14 = jMin;
        boolean z10 = wvw0Var.q1().getBoolean("deferred_analytics_collection", z);
        if (bkw0Var2.C1("google_analytics_default_allow_ad_personalization_signals", true) != tyw0.GRANTED) {
            z5 = true;
        } else {
            z5 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z5);
        List list2 = this.l;
        String strG2 = wvw0Var.t1().g();
        strJ2 = this.m;
        if (strJ2 == null) {
            kxw0.e(x6x0Var);
            strJ2 = x6x0Var.j2();
            this.m = strJ2;
        }
        String str12 = strJ2;
        if (wvw0Var.t1().i(wyw0.ANALYTICS_STORAGE)) {
            z6 = z2;
            str4 = null;
        } else {
            m1();
            if (this.r == 0) {
                z6 = z2;
            } else {
                kxw0Var2.k.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.r;
                z6 = z2;
                if (this.q != null && jCurrentTimeMillis2 > 86400000 && this.s == null) {
                    q1();
                }
            }
            if (this.q == null) {
                q1();
            }
            str4 = this.q;
        }
        boolZ2 = bkw0Var2.z1("google_analytics_sgtm_upload_enabled");
        if (boolZ2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolZ2.booleanValue();
        }
        kxw0.e(x6x0Var);
        kxw0Var = (kxw0) x6x0Var.b;
        String str13 = str4;
        strR1 = r1();
        boolean z11 = zBooleanValue;
        if (kxw0Var.f19080a.getPackageManager() == null) {
            z7 = z4;
            j3 = 0;
        } else {
            z7 = z4;
            i = 0;
            applicationInfoA = grv0.a(kxw0Var.f19080a).a(0, strR1);
            if (applicationInfoA != null) {
                i2 = applicationInfoA.targetSdkVersion;
            } else {
                i2 = i;
            }
            j3 = i2;
        }
        kxw0.e(wvw0Var);
        int i6 = wvw0Var.t1().b;
        kxw0.e(wvw0Var);
        wvw0Var.m1();
        String str14 = jmw0.b(wvw0Var.q1().getString("dma_consent_settings", null)).b;
        miw0.a();
        atw0Var = btw0.P0;
        if (bkw0Var2.x1(null, atw0Var)) {
            kxw0.e(x6x0Var);
            j4 = j3;
            if (Build.VERSION.SDK_INT < 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
            miw0.a();
            if (bkw0Var2.x1(null, atw0Var)) {
                kxw0.e(x6x0Var);
                jJ1 = x6x0Var.J1();
            } else {
                jJ1 = 0;
            }
            String str15 = bkw0Var2.d;
            String strValueOf3 = String.valueOf(xyw0.h(bkw0Var2.C1("google_analytics_default_allow_ad_personalization_signals", true)));
            long j15 = jJ1;
            long j16 = kxw0Var2.Z;
            kxw0.d(kxw0Var2.u);
            return new com.google.android.gms.measurement.internal.zzr(strR2, strS1, str2, j, str6, 161000L, j13, str, z3, z6, str3, j14, i5, z7, z10, boolValueOf2, this.j, list2, strG2, str12, str13, z11, j4, i6, str14, extensionVersion, j15, str15, strValueOf3, j16, esw0.h(kxw0Var2.u.q1()), bkw0Var2.x1(null, btw0.e1) ? kxw0Var2.f1 : 0L);
        }
        j4 = j3;
        extensionVersion = 0;
        miw0.a();
        if (bkw0Var2.x1(null, atw0Var)) {
            kxw0.e(x6x0Var);
            jJ1 = x6x0Var.J1();
        } else {
            jJ1 = 0;
        }
        String str16 = bkw0Var2.d;
        String strValueOf4 = String.valueOf(xyw0.h(bkw0Var2.C1("google_analytics_default_allow_ad_personalization_signals", true)));
        long j17 = jJ1;
        long j18 = kxw0Var2.Z;
        kxw0.d(kxw0Var2.u);
        return new com.google.android.gms.measurement.internal.zzr(strR2, strS1, str2, j, str6, 161000L, j13, str, z3, z6, str3, j14, i5, z7, z10, boolValueOf2, this.j, list2, strG2, str12, str13, z11, j4, i6, str14, extensionVersion, j17, str16, strValueOf4, j18, esw0.h(kxw0Var2.u.q1()), bkw0Var2.x1(null, btw0.e1) ? kxw0Var2.f1 : 0L);
    }

    public final void q1() {
        String str;
        m1();
        kxw0 kxw0Var = (kxw0) this.b;
        wvw0 wvw0Var = kxw0Var.e;
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.e(wvw0Var);
        if (wvw0Var.t1().i(wyw0.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            x6x0 x6x0Var = kxw0Var.i;
            kxw0.e(x6x0Var);
            x6x0Var.l2().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            kxw0.g(uuw0Var);
            uuw0Var.n.a("Analytics Storage consent is not granted");
            str = null;
        }
        kxw0.g(uuw0Var);
        uuw0Var.n.a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.q = str;
        kxw0Var.k.getClass();
        this.r = System.currentTimeMillis();
    }

    public final String r1() {
        n1();
        s0x.H(this.d);
        return this.d;
    }

    public final String s1() {
        m1();
        n1();
        s0x.H(this.p);
        return this.p;
    }
}
