package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a49 implements b49 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f212a;
    public final long b;
    public final long c;
    public final v39 d;
    public final long e;

    public a49(long j, long j2, long j3, v39 v39Var, long j4) {
        this.f212a = j;
        this.b = j2;
        this.c = j3;
        this.d = v39Var;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a49)) {
            return false;
        }
        a49 a49Var = (a49) obj;
        return this.f212a == a49Var.f212a && this.b == a49Var.b && this.c == a49Var.c && this.d == a49Var.d && this.e == a49Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f212a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f212a, "Completed(gameId=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", sourceType=");
        sbQ.append(this.d);
        sbQ.append(", durationSeconds=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
