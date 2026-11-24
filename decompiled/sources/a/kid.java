package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18331a;

    public kid(long j) {
        this.f18331a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kid) && this.f18331a == ((kid) obj).f18331a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18331a);
    }

    public final String toString() {
        return axq.h(this.f18331a, "OnAllMarketClick(gameId=", Separators.RPAREN);
    }
}
