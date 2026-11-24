package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6530a;
    public final double b;
    public final double c;

    public dqr(double d, double d2, double d3) {
        this.f6530a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqr)) {
            return false;
        }
        dqr dqrVar = (dqr) obj;
        return Double.compare(this.f6530a, dqrVar.f6530a) == 0 && Double.compare(this.b, dqrVar.b) == 0 && Double.compare(this.c, dqrVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + brm0.d(this.b, Double.hashCode(this.f6530a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f6530a, "GameBetLimits(min=", ", max=");
        sbP.append(this.b);
        return brm0.m(sbP, this.c, ", recommendedBetSum=", Separators.RPAREN);
    }
}
