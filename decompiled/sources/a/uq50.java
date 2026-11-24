package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uq50 implements zq50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36103a;
    public final int b;
    public final String c;
    public final String d;

    public uq50(int i, String str, int i2, String str2) {
        this.f36103a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq50)) {
            return false;
        }
        uq50 uq50Var = (uq50) obj;
        return this.f36103a == uq50Var.f36103a && this.b == uq50Var.b && this.c.equals(uq50Var.c) && Intrinsics.d(this.d, uq50Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b(twn.a(this.b, Integer.hashCode(this.f36103a) * 31, 31), 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ua80.m(dw9.t("OnBannerClick(bannerId=", this.f36103a, ", bannerCategoryId=", ", screenName=", this.b), this.c, ", loadedImageUrl=", this.d, Separators.RPAREN);
    }
}
