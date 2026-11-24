package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3678a;
    public final double b;

    public c3j0(double d, long j) {
        this.f3678a = j;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3j0)) {
            return false;
        }
        c3j0 c3j0Var = (c3j0) obj;
        return this.f3678a == c3j0Var.f3678a && Double.compare(this.b, c3j0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Long.hashCode(this.f3678a) * 31);
    }

    public final String toString() {
        return axq.l(kng0.q(this.f3678a, "SettingsMakeBetDefaultBetSumParamModel(balanceId=", ", defaultSum="), this.b, Separators.RPAREN);
    }
}
