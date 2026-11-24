package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class d440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5437a;
    public final long b;

    public d440(long j, long j2) {
        this.f5437a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d440)) {
            return false;
        }
        d440 d440Var = (d440) obj;
        return this.f5437a == d440Var.f5437a && this.b == d440Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f5437a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f5437a, "AggregatorProvider(id=", ", partitionId="));
    }
}
