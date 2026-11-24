package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sl3 implements wl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32378a;
    public final String b;

    public sl3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f32378a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl3)) {
            return false;
        }
        sl3 sl3Var = (sl3) obj;
        return Intrinsics.d(this.f32378a, sl3Var.f32378a) && Intrinsics.d(this.b, sl3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32378a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("DownloadApk(appVersion=", this.f32378a, ", apkUrl=", this.b, Separators.RPAREN);
    }
}
