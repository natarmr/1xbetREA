package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class k3f implements c4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17614a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public k3f(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f17614a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3f)) {
            return false;
        }
        k3f k3fVar = (k3f) obj;
        return this.f17614a == k3fVar.f17614a && this.b == k3fVar.b && this.c == k3fVar.c && this.d == k3fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(Boolean.hashCode(this.f17614a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", showShareCoupon=", Separators.RPAREN, f140.q("ShowCouponActions(showGenerateCoupon=", ", showUploadCoupon=", ", showRemoveCoupon=", this.f17614a, this.b), this.c, this.d);
    }
}
