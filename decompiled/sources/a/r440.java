package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29819a;

    public r440(long j) {
        this.f29819a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r440) && this.f29819a == ((r440) obj).f29819a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29819a);
    }

    public final String toString() {
        return axq.h(this.f29819a, "OneXGame(gameId=", Separators.RPAREN);
    }
}
