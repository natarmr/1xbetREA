package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4050a;

    public cb80(long j) {
        this.f4050a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cb80) && this.f4050a == ((cb80) obj).f4050a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4050a);
    }

    public final String toString() {
        return axq.h(this.f4050a, "OnAggregatorGameClick(gameId=", Separators.RPAREN);
    }
}
