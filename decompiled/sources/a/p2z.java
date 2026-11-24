package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p2z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26273a;
    public final long b;
    public final double c;
    public final a0t0 d;

    public p2z(long j, long j2, double d, a0t0 a0t0Var) {
        this.f26273a = j;
        this.b = j2;
        this.c = d;
        this.d = a0t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2z)) {
            return false;
        }
        p2z p2zVar = (p2z) obj;
        return this.f26273a == p2zVar.f26273a && this.b == p2zVar.b && Double.compare(this.c, p2zVar.c) == 0 && this.d == p2zVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.d(this.c, rw2.b(Long.hashCode(this.f26273a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f26273a, "LastTransactionModel(date=", ", id=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", sum=", ", type=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
