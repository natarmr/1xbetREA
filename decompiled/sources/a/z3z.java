package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z3z implements b4z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43742a;

    public z3z(long j) {
        this.f43742a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3z) && this.f43742a == ((z3z) obj).f43742a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43742a);
    }

    public final String toString() {
        return axq.h(this.f43742a, "NextGame(nextGameId=", Separators.RPAREN);
    }
}
