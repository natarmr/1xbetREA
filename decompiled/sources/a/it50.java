package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class it50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15340a;
    public final int b;
    public final String c;
    public final String d;
    public final wyq0 e;

    public it50(int i, int i2, String str, String str2, wyq0 wyq0Var) {
        str.getClass();
        this.f15340a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = wyq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it50)) {
            return false;
        }
        it50 it50Var = (it50) obj;
        return this.f15340a == it50Var.f15340a && this.b == it50Var.b && Intrinsics.d(this.c, it50Var.c) && this.d.equals(it50Var.d) && this.e.equals(it50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(twn.a(this.b, Integer.hashCode(this.f15340a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("NewsCatalogTopBannerUiModel(bannerId=", this.f15340a, ", bannerCategoryId=", ", bannerTitle=", this.b);
        f140.v(sbT, this.c, ", tagText=", this.d, ", images=");
        sbT.append(this.e);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
