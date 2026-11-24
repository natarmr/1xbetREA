package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43834a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;

    public z5s(long j, long j2, long j3, long j4, boolean z) {
        this.f43834a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5s)) {
            return false;
        }
        z5s z5sVar = (z5s) obj;
        return this.f43834a == z5sVar.f43834a && this.b == z5sVar.b && this.c == z5sVar.c && this.d == z5sVar.d && this.e == z5sVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + rw2.b(brm0.e(rw2.b(Long.hashCode(this.f43834a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f43834a, "GameContentParams(gameId=", ", subGameId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        kng0.A(sbQ, ", sportId=", this.d, ", subSportId=");
        return brm0.k(this.e, Separators.RPAREN, sbQ);
    }
}
