package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lhv0 implements mhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20076a;
    public final long b;
    public final int c;
    public final long d;
    public final String e;

    public lhv0(long j, long j2, int i, long j3, String str) {
        this.f20076a = j;
        this.b = j2;
        this.c = i;
        this.d = j3;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhv0)) {
            return false;
        }
        lhv0 lhv0Var = (lhv0) obj;
        return this.f20076a == lhv0Var.f20076a && this.b == lhv0Var.b && this.c == lhv0Var.c && this.d == lhv0Var.d && this.e.equals(lhv0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rw2.b(twn.a(this.c, rw2.b(Long.hashCode(this.f20076a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f20076a, "Zone(gameId=", ", sportId=");
        ua80.v(sbQ, this.b, ", zoneId=", this.c);
        kng0.A(sbQ, ", subSportId=", this.d, ", url=");
        return axq.n(sbQ, this.e, Separators.RPAREN);
    }
}
