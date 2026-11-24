package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class u8h0 implements e9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35231a;

    public u8h0(String str) {
        this.f35231a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8h0) && this.f35231a.equals(((u8h0) obj).f35231a);
    }

    public final int hashCode() {
        return this.f35231a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShareCouponDeepLink(couponDeepLink=", this.f35231a, Separators.RPAREN);
    }
}
