package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ohw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25285a;

    public ohw(long j) {
        this.f25285a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ohw) && this.f25285a == ((ohw) obj).f25285a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25285a);
    }

    public final String toString() {
        return axq.h(this.f25285a, "OnRealChampionshipClick(id=", Separators.RPAREN);
    }
}
