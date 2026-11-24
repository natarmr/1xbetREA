package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1764a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final boolean f;

    public b0h(long j, long j2, long j3, long j4, int i, boolean z) {
        this.f1764a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0h)) {
            return false;
        }
        b0h b0hVar = (b0h) obj;
        return this.f1764a == b0hVar.f1764a && this.b == b0hVar.b && this.c == b0hVar.c && this.d == b0hVar.d && this.e == b0hVar.e && this.f == b0hVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.a(this.e, rw2.b(rw2.b(rw2.b(Long.hashCode(this.f1764a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f1764a, "CyberGamesRankingLeaderBoardModel(mixed=", ", offline=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", online=", this.c, ", total=");
        ua80.v(sbQ, this.d, ", year=", this.e);
        return f140.n(sbQ, ", isCurrencySymbolOnLeft=", this.f, Separators.RPAREN);
    }
}
