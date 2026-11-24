package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mh8 implements ci8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21777a;

    public mh8(long j) {
        this.f21777a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mh8) && this.f21777a == ((mh8) obj).f21777a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21777a);
    }

    public final String toString() {
        return axq.h(this.f21777a, "OnGameUMResultReceive(gameId=", Separators.RPAREN);
    }
}
