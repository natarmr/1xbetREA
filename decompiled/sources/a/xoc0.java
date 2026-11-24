package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xoc0 implements cpc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41211a;

    public xoc0(long j) {
        this.f41211a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xoc0) && this.f41211a == ((xoc0) obj).f41211a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f41211a);
    }

    public final String toString() {
        return axq.h(this.f41211a, "OnPromoClick(promoId=", Separators.RPAREN);
    }
}
