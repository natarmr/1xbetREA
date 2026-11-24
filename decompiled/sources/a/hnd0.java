package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hnd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13347a;
    public final double b;
    public final double c;
    public final double d;

    public hnd0(long j, double d, double d2, double d3) {
        this.f13347a = j;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    public static hnd0 a(hnd0 hnd0Var, double d, double d2, double d3, int i) {
        long j = hnd0Var.f13347a;
        if ((i & 2) != 0) {
            d = hnd0Var.b;
        }
        double d4 = d;
        if ((i & 4) != 0) {
            d2 = hnd0Var.c;
        }
        double d5 = d2;
        if ((i & 8) != 0) {
            d3 = hnd0Var.d;
        }
        hnd0Var.getClass();
        return new hnd0(j, d4, d5, d3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnd0)) {
            return false;
        }
        hnd0 hnd0Var = (hnd0) obj;
        return this.f13347a == hnd0Var.f13347a && Double.compare(this.b, hnd0Var.b) == 0 && Double.compare(this.c, hnd0Var.c) == 0 && Double.compare(this.d, hnd0Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + brm0.d(this.c, brm0.d(this.b, Long.hashCode(this.f13347a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f13347a, "QuickBetSettingsModel(balanceId=", ", firstValue=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", secondValue=", ", thirdValue=");
        return axq.l(sbQ, this.d, Separators.RPAREN);
    }
}
