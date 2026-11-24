package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ih50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14766a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;

    public ih50(long j, long j2, long j3, String str, String str2, long j4) {
        this.f14766a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih50)) {
            return false;
        }
        ih50 ih50Var = (ih50) obj;
        return this.f14766a == ih50Var.f14766a && this.b == ih50Var.b && this.c == ih50Var.c && this.d.equals(ih50Var.d) && this.e.equals(ih50Var.e) && this.f == ih50Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + ua80.b(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f14766a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f14766a, "NearestGameDetailsPeriodScoreModel(period=", ", scoreOpp1=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", scoreOpp2=", this.c, ", periodName=");
        f140.v(sbQ, this.d, ", periodNameFull=", this.e, ", winner=");
        return brm0.k(this.f, Separators.RPAREN, sbQ);
    }
}
