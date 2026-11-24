package a;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class bs3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3108a;
    public final gw2 b;

    public bs3(String str, gw2 gw2Var) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        hv00 hv00Var = hv00.LOG_ENVIRONMENT_PROD;
        brm0.B(str, str2, str3);
        this.f3108a = str;
        this.b = gw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs3)) {
            return false;
        }
        bs3 bs3Var = (bs3) obj;
        if (!Intrinsics.d(this.f3108a, bs3Var.f3108a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!Intrinsics.d(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        if (!Intrinsics.d(str2, str2)) {
            return false;
        }
        hv00 hv00Var = hv00.LOG_ENVIRONMENT_PROD;
        return this.b.equals(bs3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((hv00.LOG_ENVIRONMENT_PROD.hashCode() + ua80.b((((Build.MODEL.hashCode() + (this.f3108a.hashCode() * 31)) * 31) + 48517567) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f3108a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.8, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + hv00.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
