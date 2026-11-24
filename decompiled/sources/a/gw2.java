package a;

import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12004a;
    public final String b;
    public final String c;
    public final ryb0 d;
    public final ArrayList e;

    public gw2(String str, String str2, String str3, ryb0 ryb0Var, ArrayList arrayList) {
        cs0.x(str, str2, str3, Build.MANUFACTURER);
        this.f12004a = str;
        this.b = str2;
        this.c = str3;
        this.d = ryb0Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw2)) {
            return false;
        }
        gw2 gw2Var = (gw2) obj;
        if (!Intrinsics.d(this.f12004a, gw2Var.f12004a) || !Intrinsics.d(this.b, gw2Var.b) || !Intrinsics.d(this.c, gw2Var.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return Intrinsics.d(str, str) && this.d.equals(gw2Var.d) && this.e.equals(gw2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(ua80.b(this.f12004a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f12004a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
