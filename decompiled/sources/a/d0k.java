package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class d0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5271a;

    public final boolean equals(Object obj) {
        if (obj instanceof d0k) {
            return this.f5271a == ((d0k) obj).f5271a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5271a);
    }

    public final String toString() {
        return axq.h(this.f5271a, "OnEditCouponClicked(balanceId=", Separators.RPAREN);
    }
}
