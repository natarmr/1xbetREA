package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jsn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f17062a;
    public final long b;

    public jsn0(double d, long j) {
        this.f17062a = d;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsn0)) {
            return false;
        }
        jsn0 jsn0Var = (jsn0) obj;
        return Double.compare(this.f17062a, jsn0Var.f17062a) == 0 && this.b == jsn0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Double.hashCode(this.f17062a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, brm0.p(this.f17062a, "SwipexBetSettings(betSum=", ", balanceId="));
    }
}
