package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8895a;
    public final long b;
    public final long c;

    public f440(long j, long j2, long j3) {
        this.f8895a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f440)) {
            return false;
        }
        f440 f440Var = (f440) obj;
        return this.f8895a == f440Var.f8895a && this.b == f440Var.b && this.c == f440Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f8895a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f8895a, "AggregatorSlotsLive(gameId=", ", aggregatorProviderId=");
        sbQ.append(this.b);
        return rw2.n(sbQ, this.c, ", aggregatorPartId=", Separators.RPAREN);
    }
}
