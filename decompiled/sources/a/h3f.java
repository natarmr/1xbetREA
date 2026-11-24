package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class h3f implements c4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12381a;

    public h3f(String str) {
        this.f12381a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3f) && this.f12381a.equals(((h3f) obj).f12381a);
    }

    public final int hashCode() {
        return this.f12381a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShareCouponDialogDeepLink(couponDeepLink=", this.f12381a, Separators.RPAREN);
    }
}
