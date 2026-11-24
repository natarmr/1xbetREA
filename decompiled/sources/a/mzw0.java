package a;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbf;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class mzw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22672a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public mzw0(b1x0 b1x0Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.e = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = z;
        Objects.requireNonNull(b1x0Var);
        this.f = b1x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0147 A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:66:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x015e A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0165 A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0180 A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundleN2;
        String str;
        quw0 quw0Var;
        byte b = this.f22672a;
        boolean z = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                a4x0 a4x0VarI = ((AppMeasurementDynamiteService) obj4).f45539a.i();
                a4x0VarI.m1();
                a4x0VarI.n1();
                a4x0VarI.z1(new e2x0(a4x0VarI, (String) obj2, (String) obj, a4x0VarI.B1(false), this.d, (gpw0) obj3));
                break;
            case 1:
                a4x0 a4x0VarI2 = ((kxw0) ((b1x0) obj4).b).i();
                a4x0VarI2.m1();
                a4x0VarI2.n1();
                a4x0VarI2.z1(new e2x0(a4x0VarI2, (AtomicReference) obj3, (String) obj2, (String) obj, a4x0VarI2.B1(false), this.d));
                break;
            case 2:
                b1x0 b1x0Var = (b1x0) ((cgp) obj4).b;
                kxw0 kxw0Var = (kxw0) b1x0Var.b;
                b1x0Var.m1();
                zlt0 zlt0Var = b1x0Var.r;
                String str2 = (String) obj;
                Uri uri = (Uri) obj3;
                try {
                    x6x0 x6x0Var = kxw0Var.i;
                    uuw0 uuw0Var = kxw0Var.f;
                    kxw0.e(x6x0Var);
                    String str3 = "utm_medium";
                    if (TextUtils.isEmpty(str2)) {
                        bundleN2 = null;
                    } else if (str2.contains("gclid") || str2.contains("gbraid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id")) {
                        bundleN2 = x6x0Var.n2(Uri.parse("https://google.com/search?".concat(str2)));
                        if (bundleN2 != null) {
                            bundleN2.putString("_cis", Payload.RFR);
                        }
                    } else {
                        uuw0 uuw0Var2 = ((kxw0) x6x0Var.b).f;
                        kxw0.g(uuw0Var2);
                        uuw0Var2.n.a("Activity created with data 'referrer' without required params");
                        bundleN2 = null;
                    }
                    String str4 = (String) obj2;
                    if (z) {
                        str = "Activity created with data 'referrer' without required params";
                        x6x0 x6x0Var2 = kxw0Var.i;
                        kxw0.e(x6x0Var2);
                        Bundle bundleN3 = x6x0Var2.n2(uri);
                        if (bundleN3 != null) {
                            bundleN3.putString("_cis", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                            if (!bundleN3.containsKey("gclid") && bundleN2 != null && bundleN2.containsKey("gclid")) {
                                bundleN3.putString("_cer", "gclid=" + bundleN2.getString("gclid"));
                            }
                            b1x0Var.s1(bundleN3, str4, "_cmp");
                            zlt0Var.r(bundleN3, str4);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            kxw0.g(uuw0Var);
                            quw0Var = uuw0Var.n;
                            quw0Var.b(str2, "Activity created with referrer");
                            if (!kxw0Var.d.x1(null, btw0.G0)) {
                                if (bundleN2 != null) {
                                    b1x0Var.s1(bundleN2, str4, "_cmp");
                                    zlt0Var.r(bundleN2, str4);
                                } else {
                                    kxw0.g(uuw0Var);
                                    quw0Var.b(str2, "Referrer does not contain valid parameters");
                                }
                                kxw0Var.k.getClass();
                                b1x0Var.v1("auto", "_ldl", null, true, System.currentTimeMillis());
                            } else if (str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains(str3) && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                                kxw0.g(uuw0Var);
                                quw0Var.a(str);
                            } else if (!TextUtils.isEmpty(str2)) {
                                kxw0Var.k.getClass();
                                b1x0Var.v1("auto", "_ldl", str2, true, System.currentTimeMillis());
                            }
                        }
                    } else {
                        str = "Activity created with data 'referrer' without required params";
                    }
                    str3 = "utm_medium";
                    if (!TextUtils.isEmpty(str2)) {
                        kxw0.g(uuw0Var);
                        quw0Var = uuw0Var.n;
                        quw0Var.b(str2, "Activity created with referrer");
                        if (!kxw0Var.d.x1(null, btw0.G0)) {
                            if (str2.contains("gclid")) {
                            }
                            kxw0.g(uuw0Var);
                            quw0Var.a(str);
                        } else {
                            if (bundleN2 != null) {
                                b1x0Var.s1(bundleN2, str4, "_cmp");
                                zlt0Var.r(bundleN2, str4);
                            } else {
                                kxw0.g(uuw0Var);
                                quw0Var.b(str2, "Referrer does not contain valid parameters");
                            }
                            kxw0Var.k.getClass();
                            b1x0Var.v1("auto", "_ldl", null, true, System.currentTimeMillis());
                        }
                    }
                } catch (RuntimeException e) {
                    uuw0 uuw0Var3 = ((kxw0) b1x0Var.b).f;
                    kxw0.g(uuw0Var3);
                    uuw0Var3.g.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                break;
            default:
                a4x0 a4x0Var = (a4x0) obj4;
                gtw0 gtw0Var = a4x0Var.e;
                kxw0 kxw0Var2 = (kxw0) a4x0Var.b;
                if (gtw0Var == null) {
                    uuw0 uuw0Var4 = kxw0Var2.f;
                    kxw0.g(uuw0Var4);
                    uuw0Var4.g.a("Failed to send default event parameters to service");
                } else {
                    com.google.android.gms.measurement.internal.zzr zzrVar = (com.google.android.gms.measurement.internal.zzr) obj3;
                    if (kxw0Var2.d.x1(null, btw0.W0)) {
                        a4x0Var.D1(gtw0Var, z ? null : (zzbf) obj2, zzrVar);
                    } else {
                        try {
                            gtw0Var.t((Bundle) obj, zzrVar);
                            a4x0Var.y1();
                        } catch (RemoteException e2) {
                            uuw0 uuw0Var5 = kxw0Var2.f;
                            kxw0.g(uuw0Var5);
                            uuw0Var5.g.b(e2, "Failed to send default event parameters to service");
                        }
                    }
                }
                break;
        }
    }

    public mzw0(cgp cgpVar, boolean z, Uri uri, String str, String str2) {
        this.d = z;
        this.e = uri;
        this.b = str;
        this.c = str2;
        this.f = cgpVar;
    }

    public mzw0(a4x0 a4x0Var, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z, zzbf zzbfVar, Bundle bundle) {
        this.e = zzrVar;
        this.d = z;
        this.b = zzbfVar;
        this.c = bundle;
        Objects.requireNonNull(a4x0Var);
        this.f = a4x0Var;
    }

    public mzw0(AppMeasurementDynamiteService appMeasurementDynamiteService, gpw0 gpw0Var, String str, String str2, boolean z) {
        this.e = gpw0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.f = appMeasurementDynamiteService;
    }
}
