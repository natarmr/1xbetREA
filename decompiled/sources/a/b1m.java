package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class b1m implements d1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1813a;
    public final long b;
    public final long c;

    public b1m(long j, long j2, long j3) {
        this.f1813a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1m)) {
            return false;
        }
        b1m b1mVar = (b1m) obj;
        long j = b1mVar.f1813a;
        int i = y3d.h;
        return h2t0.a(this.f1813a, j) && h2t0.a(this.b, b1mVar.b) && h2t0.a(this.c, b1mVar.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f1813a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.f1813a);
        String strI2 = y3d.i(this.b);
        return axq.n(b1j.n("FilledUnited(borderColor=", strI, ", backgroundColor=", strI2, ", iconTint="), y3d.i(this.c), Separators.RPAREN);
    }
}
