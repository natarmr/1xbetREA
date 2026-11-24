package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y3z implements b4z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41975a;
    public final long b;

    public y3z(long j, long j2) {
        this.f41975a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3z)) {
            return false;
        }
        y3z y3zVar = (y3z) obj;
        return this.f41975a == y3zVar.f41975a && this.b == y3zVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f41975a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f41975a, "Ended(gameId=", ", sportId="));
    }
}
