package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pgd implements p5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26949a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pgd(Object obj, Object obj2, byte b) {
        this.f26949a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // a.p5d0
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        byte b = this.f26949a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                pfd pfdVar = (pfd) obj;
                return pfdVar.f.x0(new pzu(pfdVar, (qgd) obj2));
            case 1:
                return new mtv((Context) obj2, (String) obj);
            default:
                nfq nfqVar = (nfq) obj2;
                String strF = nfqVar.f();
                raj rajVar = new raj();
                Context contextCreateDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strF), 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                rajVar.f30136a = z;
                return rajVar;
        }
    }
}
