package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fi6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9574a;
    public final double b;
    public final long c;

    public fi6(double d, long j, long j2) {
        this.f9574a = j;
        this.b = d;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi6)) {
            return false;
        }
        fi6 fi6Var = (fi6) obj;
        return this.f9574a == fi6Var.f9574a && Double.compare(this.b, fi6Var.b) == 0 && this.c == fi6Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + brm0.d(this.b, Long.hashCode(this.f9574a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f9574a, "BetBuilderMarketSelectionModel(marketTypeId=", ", parameter=");
        sbQ.append(this.b);
        return rw2.n(sbQ, this.c, ", playerId=", Separators.RPAREN);
    }
}
