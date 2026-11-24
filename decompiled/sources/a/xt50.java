package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xt50 implements bu50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41448a;
    public final int b;
    public final String c;

    public xt50(int i, int i2, String str) {
        this.f41448a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt50)) {
            return false;
        }
        xt50 xt50Var = (xt50) obj;
        return this.f41448a == xt50Var.f41448a && this.b == xt50Var.b && Intrinsics.d(this.c, xt50Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Integer.hashCode(this.f41448a) * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return axq.n(dw9.t("OnBannerClick(bannerId=", this.f41448a, ", bannerCategoryId=", ", loadedImageUrl=", this.b), this.c, Separators.RPAREN);
    }
}
