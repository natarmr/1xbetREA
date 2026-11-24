package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zl1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44559a;
    public final boolean b;

    public zl1(boolean z, long j) {
        this.f44559a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl1)) {
            return false;
        }
        zl1 zl1Var = (zl1) obj;
        return this.f44559a == zl1Var.f44559a && this.b == zl1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f44559a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f44559a, "BrandListScreen(brandId=", ", fromDeeplink=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
