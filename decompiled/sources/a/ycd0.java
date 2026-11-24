package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ycd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42380a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;

    public ycd0(long j, long j2, long j3, long j4, boolean z) {
        this.f42380a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycd0)) {
            return false;
        }
        ycd0 ycd0Var = (ycd0) obj;
        return this.f42380a == ycd0Var.f42380a && this.b == ycd0Var.b && this.c == ycd0Var.c && this.d == ycd0Var.d && this.e == ycd0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.b(rw2.b(rw2.b(Long.hashCode(this.f42380a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f42380a, "SportGame(gameId=", ", subGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", sportId=", this.c, ", subSportId=");
        hne.t(this.d, ", live=", sbQ, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
