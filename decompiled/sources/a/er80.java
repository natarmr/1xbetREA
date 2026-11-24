package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class er80 implements lr80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8268a;

    public er80(long j) {
        this.f8268a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er80) && this.f8268a == ((er80) obj).f8268a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8268a);
    }

    public final String toString() {
        return axq.h(this.f8268a, "OnGameClick(gameId=", Separators.RPAREN);
    }
}
