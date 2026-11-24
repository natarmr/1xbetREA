package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class hr1 extends lr1 {
    public final long c;
    public final long d;

    public /* synthetic */ hr1(long j, int i) {
        this((i & 1) != 0 ? 0L : j, nw80.t.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr1)) {
            return false;
        }
        hr1 hr1Var = (hr1) obj;
        return this.c == hr1Var.c && this.d == hr1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        return brm0.k(this.d, Separators.RPAREN, kng0.q(this.c, "MyAggregator(idToOpen=", ", partitionId="));
    }

    public hr1(long j, long j2) {
        super(mr1.d, new fm1(j, j2));
        this.c = j;
        this.d = j2;
    }
}
