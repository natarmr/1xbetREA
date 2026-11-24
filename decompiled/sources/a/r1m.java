package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r1m implements s1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29688a;
    public final long b;
    public final long c;

    public r1m(long j, long j2, long j3) {
        this.f29688a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1m)) {
            return false;
        }
        r1m r1mVar = (r1m) obj;
        long j = r1mVar.f29688a;
        int i = y3d.h;
        return h2t0.a(this.f29688a, j) && h2t0.a(this.b, r1mVar.b) && h2t0.a(this.c, r1mVar.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f29688a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.f29688a);
        String strI2 = y3d.i(this.b);
        return axq.n(b1j.n("Outline(borderColor=", strI, ", backgroundColor=", strI2, ", iconTint="), y3d.i(this.c), Separators.RPAREN);
    }
}
