package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q1m implements s1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27961a;
    public final long b;
    public final long c;

    public q1m(long j, long j2, long j3) {
        this.f27961a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1m)) {
            return false;
        }
        q1m q1mVar = (q1m) obj;
        long j = q1mVar.f27961a;
        int i = y3d.h;
        return h2t0.a(this.f27961a, j) && h2t0.a(this.b, q1mVar.b) && h2t0.a(this.c, q1mVar.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f27961a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.f27961a);
        String strI2 = y3d.i(this.b);
        return axq.n(b1j.n("FilledUnited(borderColor=", strI, ", backgroundColor=", strI2, ", iconTint="), y3d.i(this.c), Separators.RPAREN);
    }
}
