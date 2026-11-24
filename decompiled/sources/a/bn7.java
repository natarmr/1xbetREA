package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bn7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f2869a;
    public final double b;

    public bn7(double d, double d2) {
        this.f2869a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn7)) {
            return false;
        }
        bn7 bn7Var = (bn7) obj;
        return Double.compare(this.f2869a, bn7Var.f2869a) == 0 && Double.compare(this.b, bn7Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.f2869a) * 31);
    }

    public final String toString() {
        return axq.l(brm0.p(this.f2869a, "BetSumModel(minBetSum=", ", maxBetSum="), this.b, Separators.RPAREN);
    }
}
