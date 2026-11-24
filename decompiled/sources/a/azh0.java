package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class azh0 implements ezh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1717a;

    public azh0(long j) {
        this.f1717a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azh0) && this.f1717a == ((azh0) obj).f1717a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1717a);
    }

    public final String toString() {
        return axq.h(this.f1717a, "OnBetLongClick(playerId=", Separators.RPAREN);
    }
}
