package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ri10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30517a;
    public final vi10 b;
    public final long c;
    public final double d;
    public final th10 e;

    public ri10(long j, vi10 vi10Var, long j2, double d, th10 th10Var) {
        this.f30517a = j;
        this.b = vi10Var;
        this.c = j2;
        this.d = d;
        this.e = th10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri10)) {
            return false;
        }
        ri10 ri10Var = (ri10) obj;
        return this.f30517a == ri10Var.f30517a && this.b == ri10Var.b && this.c == ri10Var.c && Double.compare(this.d, ri10Var.d) == 0 && this.e.equals(ri10Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.d(this.d, rw2.b((this.b.hashCode() + (Long.hashCode(this.f30517a) * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoyaltyProgramUserCashbackModel(paymentAvailableFrom=");
        sb.append(this.f30517a);
        sb.append(", cashbackState=");
        sb.append(this.b);
        kng0.A(sb, ", updatedTime=", this.c, ", cashbackSum=");
        sb.append(this.d);
        sb.append(", userCurrencyModel=");
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
