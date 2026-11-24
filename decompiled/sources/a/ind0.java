package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ind0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15069a;
    public final double b;
    public final double c;
    public final double d;

    public ind0(long j, double d, double d2, double d3) {
        this.f15069a = j;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ind0)) {
            return false;
        }
        ind0 ind0Var = (ind0) obj;
        return this.f15069a == ind0Var.f15069a && Double.compare(this.b, ind0Var.b) == 0 && Double.compare(this.c, ind0Var.c) == 0 && Double.compare(this.d, ind0Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + brm0.d(this.c, brm0.d(this.b, Long.hashCode(this.f15069a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f15069a, "QuickBetSettingsModelEntity(balanceId=", ", firstValue=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", secondValue=", ", thirdValue=");
        return axq.l(sbQ, this.d, Separators.RPAREN);
    }
}
