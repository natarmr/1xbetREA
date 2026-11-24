package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lgr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20021a;
    public final long b;
    public final double c;

    public lgr0(double d, long j, long j2) {
        this.f20021a = j;
        this.b = j2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgr0)) {
            return false;
        }
        lgr0 lgr0Var = (lgr0) obj;
        return this.f20021a == lgr0Var.f20021a && this.b == lgr0Var.b && Double.compare(this.c, lgr0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + rw2.b(Long.hashCode(this.f20021a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f20021a, "TotalExactSelectedModel(marketGroupId=", ", selectedBetId=");
        sbQ.append(this.b);
        return brm0.m(sbQ, this.c, ", selectedBetParam=", Separators.RPAREN);
    }
}
