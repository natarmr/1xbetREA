package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12417a;

    public h440(long j) {
        this.f12417a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h440) && this.f12417a == ((h440) obj).f12417a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12417a);
    }

    public final String toString() {
        return axq.h(this.f12417a, "AggregatorTournament(id=", Separators.RPAREN);
    }
}
