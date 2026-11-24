package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40547a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;

    public xad0(long j, long j2, long j3, long j4, boolean z) {
        this.f40547a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xad0)) {
            return false;
        }
        xad0 xad0Var = (xad0) obj;
        return this.f40547a == xad0Var.f40547a && this.b == xad0Var.b && this.c == xad0Var.c && this.d == xad0Var.d && this.e == xad0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.b(rw2.b(rw2.b(Long.hashCode(this.f40547a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f40547a, "Game(gameId=", ", subGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", sportId=", this.c, ", subSportId=");
        hne.t(this.d, ", live=", sbQ, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
