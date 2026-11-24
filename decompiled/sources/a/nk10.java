package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nk10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23661a;
    public final double b;

    public nk10(double d, long j) {
        this.f23661a = j;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk10)) {
            return false;
        }
        nk10 nk10Var = (nk10) obj;
        return this.f23661a == nk10Var.f23661a && Double.compare(this.b, nk10Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Long.hashCode(this.f23661a) * 31);
    }

    public final String toString() {
        return axq.l(kng0.q(this.f23661a, "LuckyWheelBalance(accountId=", ", money="), this.b, Separators.RPAREN);
    }
}
