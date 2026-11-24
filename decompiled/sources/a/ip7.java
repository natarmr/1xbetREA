package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ip7 implements jp7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15148a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final boolean f;

    public ip7(long j, long j2, long j3, long j4, String str, boolean z) {
        this.f15148a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip7)) {
            return false;
        }
        ip7 ip7Var = (ip7) obj;
        return this.f15148a == ip7Var.f15148a && this.b == ip7Var.b && this.c == ip7Var.c && this.d == ip7Var.d && this.e.equals(ip7Var.e) && this.f == ip7Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f15148a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f15148a, "OnSubscribeClick(gameId=", ", constId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", sportId=", this.c, ", subSportId=");
        kng0.z(sbQ, this.d, ", champName=", this.e);
        return f140.n(sbQ, ", live=", this.f, Separators.RPAREN);
    }
}
