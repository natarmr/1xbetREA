package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ugw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35646a;

    public ugw(long j) {
        this.f35646a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugw) && this.f35646a == ((ugw) obj).f35646a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35646a);
    }

    public final String toString() {
        return axq.h(this.f35646a, "OnChampFavoriteClick(champId=", Separators.RPAREN);
    }
}
