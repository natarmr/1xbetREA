package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ng50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23469a;
    public final long b;
    public final double c;
    public final String d;

    public ng50(long j, long j2, double d, String str) {
        this.f23469a = j;
        this.b = j2;
        this.c = d;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng50)) {
            return false;
        }
        ng50 ng50Var = (ng50) obj;
        return this.f23469a == ng50Var.f23469a && this.b == ng50Var.b && Double.compare(this.c, ng50Var.c) == 0 && this.d.equals(ng50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.d(this.c, rw2.b(Long.hashCode(this.f23469a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f23469a, "NearestGameDetailsInnsStatsModel(team=", ", wickets=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", over=", ", overStr=");
        return axq.n(sbQ, this.d, Separators.RPAREN);
    }
}
