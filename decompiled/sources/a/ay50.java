package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ay50 implements by50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1655a;

    public ay50(long j) {
        this.f1655a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay50) && this.f1655a == ((ay50) obj).f1655a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1655a);
    }

    public final String toString() {
        return axq.h(this.f1655a, "OnRemoveFromAggregatorClicked(gameId=", Separators.RPAREN);
    }
}
