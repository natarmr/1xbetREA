package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ngn0 implements pgn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23495a;

    public final boolean equals(Object obj) {
        if (obj instanceof ngn0) {
            return this.f23495a.equals(((ngn0) obj).f23495a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23495a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShareCoupon(couponDeepLink=", this.f23495a, Separators.RPAREN);
    }
}
