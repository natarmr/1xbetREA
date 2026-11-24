package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lo50 implements mo50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20376a;
    public final int b;
    public final String c;

    public lo50(int i, int i2, String str) {
        this.f20376a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo50)) {
            return false;
        }
        lo50 lo50Var = (lo50) obj;
        return this.f20376a == lo50Var.f20376a && this.b == lo50Var.b && Intrinsics.d(this.c, lo50Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Integer.hashCode(this.f20376a) * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return axq.n(dw9.t("OnTopBannerClick(bannerId=", this.f20376a, ", bannerCategoryId=", ", loadedImageUrl=", this.b), this.c, Separators.RPAREN);
    }
}
