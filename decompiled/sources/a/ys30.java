package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ys30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43151a;
    public final long b;
    public final int c;
    public final int d;
    public final tr30 e;

    public ys30(long j, long j2, int i, int i2, tr30 tr30Var) {
        this.f43151a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = tr30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys30)) {
            return false;
        }
        ys30 ys30Var = (ys30) obj;
        return this.f43151a == ys30Var.f43151a && this.b == ys30Var.b && this.c == ys30Var.c && this.d == ys30Var.d && this.e.equals(ys30Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, rw2.b(Long.hashCode(this.f43151a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f43151a, "MemoryModel(userId=", ", accountId=");
        ua80.v(sbQ, this.b, ", bonusBalance=", this.c);
        sbQ.append(", rotationCount=");
        sbQ.append(this.d);
        sbQ.append(", game=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
