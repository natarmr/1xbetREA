package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ko50 implements mo50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18615a;
    public final int b;
    public final String c;

    public ko50(int i, int i2, String str) {
        this.f18615a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko50)) {
            return false;
        }
        ko50 ko50Var = (ko50) obj;
        return this.f18615a == ko50Var.f18615a && this.b == ko50Var.b && Intrinsics.d(this.c, ko50Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Integer.hashCode(this.f18615a) * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return axq.n(dw9.t("OnTopBannerButtonClick(bannerId=", this.f18615a, ", bannerCategoryId=", ", loadedImageUrl=", this.b), this.c, Separators.RPAREN);
    }
}
