package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15867a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final yto0 f;
    public final int g;

    public j440(long j, long j2, long j3, long j4, boolean z, yto0 yto0Var, int i) {
        this.f15867a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = yto0Var;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j440)) {
            return false;
        }
        j440 j440Var = (j440) obj;
        return this.f15867a == j440Var.f15867a && this.b == j440Var.b && this.c == j440Var.c && this.d == j440Var.d && this.e == j440Var.e && this.f == j440Var.f && this.g == j440Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ((this.f.hashCode() + brm0.e(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f15867a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f15867a, "CyberLineLive(gameId=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", champId=");
        hne.t(this.d, ", live=", sbQ, this.e);
        sbQ.append(", targetScreen=");
        sbQ.append(this.f);
        sbQ.append(", cyberPageId=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
