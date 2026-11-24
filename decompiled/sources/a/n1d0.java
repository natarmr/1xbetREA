package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n1d0 extends o1d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22746a;
    public final long b;
    public final long c;

    public n1d0(long j, long j2, long j3) {
        this.f22746a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // a.o1d0
    public final long a() {
        return this.f22746a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1d0)) {
            return false;
        }
        n1d0 n1d0Var = (n1d0) obj;
        return this.f22746a == n1d0Var.f22746a && this.b == n1d0Var.b && this.c == n1d0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f22746a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f22746a, "ProphylaxisData(requestTimeMillis=", ", dateStart=");
        sbQ.append(this.b);
        return rw2.n(sbQ, this.c, ", dateEnd=", Separators.RPAREN);
    }
}
