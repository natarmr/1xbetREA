package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class la0 implements qa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19681a;

    public la0(long j) {
        this.f19681a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la0) && this.f19681a == ((la0) obj).f19681a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19681a);
    }

    public final String toString() {
        return axq.h(this.f19681a, "OnRemoveFromAggregatorClicked(gameId=", Separators.RPAREN);
    }
}
