package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ht50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13617a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final n0x f;

    public ht50(int i, int i2, String str, String str2, String str3, n0x n0xVar) {
        str.getClass();
        str2.getClass();
        this.f13617a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht50)) {
            return false;
        }
        ht50 ht50Var = (ht50) obj;
        return this.f13617a == ht50Var.f13617a && this.b == ht50Var.b && Intrinsics.d(this.c, ht50Var.c) && Intrinsics.d(this.d, ht50Var.d) && this.e.equals(ht50Var.e) && this.f.equals(ht50Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(twn.a(this.b, Integer.hashCode(this.f13617a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("NewsCatalogTopBannerUiModel(bannerId=", this.f13617a, ", bannerCategoryId=", ", bannerTitle=", this.b);
        f140.v(sbT, this.c, ", bannerSubtitle=", this.d, ", tagText=");
        sbT.append(this.e);
        sbT.append(", image=");
        sbT.append(this.f);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
