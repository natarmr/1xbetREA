package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zp50 implements dq50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44744a;
    public final String b;

    public zp50(int i, String str) {
        this.f44744a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp50)) {
            return false;
        }
        zp50 zp50Var = (zp50) obj;
        return this.f44744a == zp50Var.f44744a && Intrinsics.d(this.b, zp50Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f44744a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return defpackage.c.b(this.f44744a, "OnBannerClick(bannerId=", ", loadedImageUrl=", this.b, Separators.RPAREN);
    }
}
