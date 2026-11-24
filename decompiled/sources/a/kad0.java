package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17958a;
    public final long b;
    public final long c;
    public final boolean d;

    public kad0(long j, long j2, long j3, boolean z) {
        this.f17958a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kad0)) {
            return false;
        }
        kad0 kad0Var = (kad0) obj;
        return this.f17958a == kad0Var.f17958a && this.b == kad0Var.b && this.c == kad0Var.c && this.d == kad0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rw2.b(rw2.b(Long.hashCode(this.f17958a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f17958a, "CyberGame(gameId=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", live=");
        return rw2.p(sbQ, this.d, Separators.RPAREN);
    }
}
