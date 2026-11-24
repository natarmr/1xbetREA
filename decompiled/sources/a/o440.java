package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24615a;
    public final long b;
    public final long c;
    public final boolean d;
    public final yto0 e;

    public o440(long j, long j2, long j3, boolean z, yto0 yto0Var) {
        this.f24615a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = yto0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o440)) {
            return false;
        }
        o440 o440Var = (o440) obj;
        return this.f24615a == o440Var.f24615a && this.b == o440Var.b && this.c == o440Var.c && this.d == o440Var.d && this.e == o440Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(rw2.b(rw2.b(Long.hashCode(this.f24615a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f24615a, "LineLive(gameId=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", champId=", this.c, ", live=");
        sbQ.append(this.d);
        sbQ.append(", targetScreen=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
