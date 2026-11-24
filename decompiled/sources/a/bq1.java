package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class bq1 implements dq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3007a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public bq1(long j, long j2, boolean z, boolean z2, boolean z3) {
        this.f3007a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq1)) {
            return false;
        }
        bq1 bq1Var = (bq1) obj;
        return this.f3007a == bq1Var.f3007a && this.b == bq1Var.b && this.c == bq1Var.c && this.d == bq1Var.d && this.e == bq1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(rw2.b(Long.hashCode(this.f3007a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f3007a, "Game(gameId=", ", productId=");
        hne.t(this.b, ", isDemoAvailable=", sbQ, this.c);
        w6x.A(", needTransfer=", ", noLoyalty=", sbQ, this.d, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
