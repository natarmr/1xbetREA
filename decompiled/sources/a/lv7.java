package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20704a;
    public final long b;
    public final long c;
    public final double d;
    public final double e;
    public final double f;

    public lv7(int i, long j, long j2, double d, double d2, double d3) {
        this.f20704a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = d2;
        this.f = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv7)) {
            return false;
        }
        lv7 lv7Var = (lv7) obj;
        return this.f20704a == lv7Var.f20704a && this.b == lv7Var.b && this.c == lv7Var.c && Double.compare(this.d, lv7Var.d) == 0 && Double.compare(this.e, lv7Var.e) == 0 && Double.compare(this.f, lv7Var.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + brm0.d(this.e, brm0.d(this.d, rw2.b(rw2.b(Integer.hashCode(this.f20704a) * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f20704a, this.b, "BetsSummaryInfoModel(count=", ", startDate=");
        kng0.A(sbQ, ", endDate=", this.c, ", betsSum=");
        sbQ.append(this.d);
        ohs0.A(sbQ, this.e, ", payoutWithSellSum=", ", unsettledSum=");
        return axq.l(sbQ, this.f, Separators.RPAREN);
    }
}
