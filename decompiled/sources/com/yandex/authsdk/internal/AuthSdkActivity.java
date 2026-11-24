package com.yandex.authsdk.internal;

import a.bsr0;
import a.c3x;
import a.d2w0;
import a.f5v0;
import a.go;
import a.k2w0;
import a.kn4;
import a.ouu;
import a.q3d;
import a.q950;
import a.r3d;
import a.r8x;
import a.sg80;
import a.t9f;
import a.v4i0;
import a.vw00;
import a.wwb;
import a.x2x;
import a.xic;
import a.yc3;
import a.yfd;
import a.yn4;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.verify.domain.DomainVerificationManager;
import android.content.pm.verify.domain.DomainVerificationUserState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.yandex.authsdk.YandexAuthLoginOptions;
import com.yandex.authsdk.YandexAuthOptions;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthSdkActivity extends yc3 {
    public static final /* synthetic */ int Z = 0;
    public vw00 B;
    public YandexAuthOptions Y;

    /* JADX WARN: Code duplicated, block: B:59:0x0196  */
    @Override // a.kxq, a.agd, a.zfd, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Throwable th;
        r8x q950Var;
        List<ApplicationInfo> installedApplications;
        Iterator<ApplicationInfo> it;
        ArrayList arrayList;
        DomainVerificationUserState domainVerificationUserState;
        Integer num;
        ActivityInfo activityInfo;
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        Object objU = x2x.U(intent, "com.yandex.authsdk.EXTRA_OPTIONS", YandexAuthOptions.class);
        objU.getClass();
        YandexAuthOptions yandexAuthOptions = (YandexAuthOptions) objU;
        Object objU2 = x2x.U(intent, "com.yandex.authsdk.EXTRA_LOGIN_OPTIONS", YandexAuthLoginOptions.class);
        objU2.getClass();
        YandexAuthLoginOptions yandexAuthLoginOptions = (YandexAuthLoginOptions) objU2;
        String stringExtra = intent.getStringExtra("com.yandex.authsdk.EXTRA_STATE");
        stringExtra.getClass();
        k2w0 k2w0Var = new k2w0(yandexAuthOptions, yandexAuthLoginOptions, stringExtra);
        this.Y = yandexAuthOptions;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        String packageName = getPackageName();
        packageName.getClass();
        PackageManager packageManager = getPackageManager();
        packageManager.getClass();
        ouu ouuVar = new ouu(packageName, packageManager, yandexAuthOptions);
        PackageManager packageManager2 = (PackageManager) ouuVar.c;
        List listJ = q3d.j(vw00.f38127a, vw00.b, vw00.c);
        int iIndexOf = listJ.indexOf(yandexAuthLoginOptions.f46054a);
        Integer numValueOf = Integer.valueOf(iIndexOf);
        if (iIndexOf == -1) {
            numValueOf = null;
        }
        Iterator it2 = listJ.subList(numValueOf != null ? numValueOf.intValue() : 0, listJ.size()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                th = null;
                q950Var = null;
                break;
            }
            int iOrdinal = ((vw00) it2.next()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    YandexAuthOptions yandexAuthOptions2 = k2w0Var.f17592a;
                    if (yandexAuthOptions2.d) {
                        q950Var = null;
                    } else {
                        Set set = xic.d;
                        PackageManager packageManager3 = applicationContext.getPackageManager();
                        th = null;
                        Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://ya.ru"));
                        packageManager3.getClass();
                        List listN = wwb.N(packageManager3, intent2);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : listN) {
                            String str = ((ResolveInfo) obj).activityInfo.packageName;
                            if (xic.d.contains(str)) {
                                Intent intent3 = new Intent();
                                intent3.setAction("android.support.customtabs.action.CustomTabsService");
                                intent3.setPackage(str);
                                if ((Build.VERSION.SDK_INT >= 33 ? packageManager3.resolveService(intent3, PackageManager.ResolveInfoFlags.of(0L)) : packageManager3.resolveService(intent3, 0)) != null) {
                                    arrayList2.add(obj);
                                }
                            }
                        }
                        ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.W(0, arrayList2);
                        String str2 = (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) ? null : activityInfo.packageName;
                        if (str2 != null) {
                            xic xicVar = new xic(str2);
                            String str3 = "yx" + yandexAuthOptions2.f46055a + '.' + yandexAuthOptions2.c;
                            if (Build.VERSION.SDK_INT >= 31) {
                                try {
                                    DomainVerificationManager domainVerificationManagerD = kn4.d(applicationContext.getSystemService(kn4.D()));
                                    if (domainVerificationManagerD == null || (domainVerificationUserState = domainVerificationManagerD.getDomainVerificationUserState(applicationContext.getPackageName())) == null || !domainVerificationUserState.isLinkHandlingAllowed() || (num = (Integer) domainVerificationUserState.getHostToStateMap().get(str3)) == null || num.intValue() != 2) {
                                        q950Var = null;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            q950Var = xicVar;
                        } else {
                            q950Var = null;
                        }
                        applicationContext = applicationContext;
                        ouuVar = ouuVar;
                        it2 = it2;
                    }
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return;
                    }
                    q950Var = new f5v0();
                }
                th = null;
            } else {
                th = null;
                YandexAuthOptions yandexAuthOptions3 = (YandexAuthOptions) ouuVar.d;
                boolean z = yandexAuthOptions3.b;
                ArrayList<sg80> arrayList3 = new ArrayList();
                packageManager2.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    installedApplications = packageManager2.getInstalledApplications(PackageManager.ApplicationInfoFlags.of(128L));
                    installedApplications.getClass();
                } else {
                    installedApplications = packageManager2.getInstalledApplications(128);
                    installedApplications.getClass();
                }
                Iterator<ApplicationInfo> it3 = installedApplications.iterator();
                while (it3.hasNext()) {
                    ApplicationInfo next = it3.next();
                    if (!TextUtils.equals(next.packageName, (String) ouuVar.b) && next.enabled) {
                        Bundle bundle2 = next.metaData;
                        String str4 = next.packageName;
                        if (bundle2 != null) {
                            Context context = applicationContext;
                            if (bundle2.containsKey("com.yandex.auth.LOGIN_SDK_VERSION")) {
                                ouu ouuVar2 = ouuVar;
                                if (bundle2.containsKey("com.yandex.auth.VERSION")) {
                                    str4.getClass();
                                    Iterator it4 = it2;
                                    boolean z2 = z;
                                    try {
                                        ArrayList arrayListG = wwb.G(packageManager2, str4);
                                        it = it3;
                                        try {
                                            arrayList = new ArrayList(r3d.q(arrayListG, 10));
                                            Iterator it5 = arrayListG.iterator();
                                            while (it5.hasNext()) {
                                                arrayList.add(c3x.G((byte[]) it5.next()));
                                            }
                                        } catch (PackageManager.NameNotFoundException e) {
                                            e = e;
                                            if (z2) {
                                                Log.e("ouu", "Error getting fingerprint", e);
                                            }
                                            arrayList = null;
                                        } catch (NoSuchAlgorithmException e2) {
                                            e = e2;
                                            if (z2) {
                                                Log.e("ouu", "Error getting fingerprint", e);
                                            }
                                            arrayList = null;
                                        }
                                    } catch (PackageManager.NameNotFoundException e3) {
                                        e = e3;
                                        it = it3;
                                    } catch (NoSuchAlgorithmException e4) {
                                        e = e4;
                                        it = it3;
                                    }
                                    if (arrayList != null && arrayList.contains("5D224274D9377C35DA777AD934C65C8CCA6E7A20")) {
                                        String str5 = next.packageName;
                                        str5.getClass();
                                        Intent intent4 = new Intent("com.yandex.auth.action.YA_SDK_LOGIN");
                                        intent4.setPackage(str5);
                                        if (!wwb.N(packageManager2, intent4).isEmpty()) {
                                            bundle2.getInt("com.yandex.auth.LOGIN_SDK_VERSION");
                                            arrayList3.add(new sg80(bundle2.getFloat("com.yandex.auth.VERSION"), bundle2.getInt("com.yandex.auth.INTERNAL_VERSION", -1), str4));
                                        }
                                    }
                                    applicationContext = context;
                                    ouuVar = ouuVar2;
                                    it2 = it4;
                                    z = z2;
                                    it3 = it;
                                } else {
                                    applicationContext = context;
                                    ouuVar = ouuVar2;
                                }
                            } else {
                                applicationContext = context;
                            }
                        }
                    }
                }
                applicationContext = applicationContext;
                ouuVar = ouuVar;
                it2 = it2;
                sg80 sg80Var = null;
                for (sg80 sg80Var2 : arrayList3) {
                    if (sg80Var == null || sg80Var2.b > sg80Var.b || sg80Var2.c > sg80Var.c) {
                        sg80Var = sg80Var2;
                    }
                }
                if (sg80Var != null) {
                    String str6 = sg80Var.f32149a;
                    str6.getClass();
                    Intent intent5 = new Intent("com.yandex.auth.action.YA_SDK_LOGIN");
                    intent5.setPackage(str6);
                    q950Var = new q950(intent5, yandexAuthOptions3.f46055a);
                } else {
                    q950Var = null;
                }
            }
            if (q950Var != null) {
                break;
            }
            applicationContext = applicationContext;
            ouuVar = ouuVar;
            it2 = it2;
        }
        if (q950Var == null) {
            v4i0.o("No element of the collection was transformed to a non-null value.");
            return;
        }
        bsr0 bsr0VarK = q950Var.K();
        yn4 yn4Var = new yn4(this, (byte) 0);
        bsr0VarK.getClass();
        yfd yfdVar = this.i;
        yfdVar.getClass();
        go goVarC = yfdVar.c("activity_rq#" + this.h.getAndIncrement(), this, bsr0VarK, yn4Var);
        if (bundle != null) {
            this.B = vw00.values()[bundle.getInt("com.yandex.authsdk.STATE_LOGIN_TYPE")];
            return;
        }
        try {
            this.B = q950Var.P();
            goVarC.a(k2w0Var);
        } catch (Exception e5) {
            YandexAuthOptions yandexAuthOptions4 = this.Y;
            if (yandexAuthOptions4 == null) {
                Intrinsics.h("options");
                throw th;
            }
            if (yandexAuthOptions4.b) {
                Log.e("AuthSdkActivity", "Unknown error:", e5);
            }
            Intent intent6 = new Intent();
            intent6.putExtra("com.yandex.authsdk.EXTRA_ERROR", new d2w0(new String[]{"unknown.error"}));
            setResult(-1, intent6);
            finish();
        }
    }

    @Override // a.agd, a.zfd, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        vw00 vw00Var = this.B;
        if (vw00Var != null) {
            bundle.putInt("com.yandex.authsdk.STATE_LOGIN_TYPE", vw00Var.ordinal());
        } else {
            Intrinsics.h("loginType");
            throw null;
        }
    }
}
