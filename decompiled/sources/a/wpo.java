package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wpo implements hqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39553a;

    public wpo(long j) {
        this.f39553a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wpo) && this.f39553a == ((wpo) obj).f39553a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39553a);
    }

    public final String toString() {
        return axq.h(this.f39553a, "OnAddToCouponClick(couponId=", Separators.RPAREN);
    }
}
