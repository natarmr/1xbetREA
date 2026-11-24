package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yn50 implements mo50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42922a;
    public final int b;
    public final String c;

    public yn50(int i, int i2, String str) {
        this.f42922a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn50)) {
            return false;
        }
        yn50 yn50Var = (yn50) obj;
        return this.f42922a == yn50Var.f42922a && this.b == yn50Var.b && Intrinsics.d(this.c, yn50Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Integer.hashCode(this.f42922a) * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return axq.n(dw9.t("OnBannerClick(bannerId=", this.f42922a, ", bannerCategoryId=", ", loadedImageUrl=", this.b), this.c, Separators.RPAREN);
    }
}
