package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class k390 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17607a;
    public final long b;
    public final double c;
    public final int d;
    public final int e;

    public k390(long j, long j2, double d, int i, int i2) {
        this.f17607a = j;
        this.b = j2;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k390)) {
            return false;
        }
        k390 k390Var = (k390) obj;
        return this.f17607a == k390Var.f17607a && this.b == k390Var.b && Double.compare(this.c, k390Var.c) == 0 && this.d == k390Var.d && this.e == k390Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, brm0.d(this.c, rw2.b(Long.hashCode(this.f17607a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f17607a, "PayRotationModel(userId=", ", accountId=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", accountBalance=", ", bonusBalance=");
        return w6x.o(this.d, this.e, ", rotationCount=", Separators.RPAREN, sbQ);
    }
}
