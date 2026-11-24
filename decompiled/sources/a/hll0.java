package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hll0 implements ill0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13268a;

    public hll0(long j) {
        this.f13268a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hll0) && this.f13268a == ((hll0) obj).f13268a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13268a);
    }

    public final String toString() {
        return axq.h(this.f13268a, "OnItemClick(gameId=", Separators.RPAREN);
    }
}
