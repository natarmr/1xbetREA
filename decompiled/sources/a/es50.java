package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class es50 implements os50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8313a;
    public final int b;
    public final String c;

    public es50(int i, int i2, String str) {
        this.f8313a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es50)) {
            return false;
        }
        es50 es50Var = (es50) obj;
        return this.f8313a == es50Var.f8313a && this.b == es50Var.b && Intrinsics.d(this.c, es50Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Integer.hashCode(this.f8313a) * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return axq.n(dw9.t("OnBannerClick(bannerId=", this.f8313a, ", bannerCategoryId=", ", loadedImageUrl=", this.b), this.c, Separators.RPAREN);
    }
}
