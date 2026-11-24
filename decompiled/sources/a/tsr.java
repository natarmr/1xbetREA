package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tsr implements usr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34474a;
    public final long b;
    public final int c;
    public final long d;

    public tsr(int i, long j, long j2, long j3) {
        this.f34474a = j;
        this.b = j2;
        this.c = i;
        this.d = j3;
    }

    @Override // a.usr
    public final long a() {
        return this.f34474a;
    }

    @Override // a.usr
    public final long c() {
        return this.b;
    }

    @Override // a.usr
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsr)) {
            return false;
        }
        tsr tsrVar = (tsr) obj;
        return this.f34474a == tsrVar.f34474a && this.b == tsrVar.b && this.c == tsrVar.c && this.d == tsrVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + twn.a(this.c, rw2.b(Long.hashCode(this.f34474a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f34474a, "Zone(gameId=", ", sportId=");
        ua80.v(sbQ, this.b, ", zoneId=", this.c);
        return rw2.n(sbQ, this.d, ", subSportId=", Separators.RPAREN);
    }
}
