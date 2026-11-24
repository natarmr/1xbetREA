package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ono {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25557a;
    public final long b;

    public ono(long j, long j2) {
        this.f25557a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ono)) {
            return false;
        }
        ono onoVar = (ono) obj;
        return this.f25557a == onoVar.f25557a && this.b == onoVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f25557a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f25557a, "ExpandedMarketsKey(categoryId=", ", subGameId="));
    }
}
