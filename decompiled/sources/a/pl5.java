package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pl5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27166a;
    public final long b;
    public final double c;
    public final double d;
    public final int e;
    public final int f;

    public pl5(long j, long j2, double d, double d2, int i, int i2) {
        this.f27166a = j;
        this.b = j2;
        this.c = d;
        this.d = d2;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl5)) {
            return false;
        }
        pl5 pl5Var = (pl5) obj;
        return this.f27166a == pl5Var.f27166a && this.b == pl5Var.b && Double.compare(this.c, pl5Var.c) == 0 && Double.compare(this.d, pl5Var.d) == 0 && this.e == pl5Var.e && this.f == pl5Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, brm0.d(this.d, brm0.d(this.c, rw2.b(Long.hashCode(this.f27166a) * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f27166a, "BalanceModel(userId=", ", accountId=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", accountBalance=", ", priceRotation=");
        rz4.w(sbQ, this.d, ", bonusBalance=", this.e);
        return vqd.p(sbQ, ", rotationCount=", this.f, Separators.RPAREN);
    }
}
