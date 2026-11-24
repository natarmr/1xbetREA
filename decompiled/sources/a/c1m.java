package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c1m implements d1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3579a;
    public final long b;
    public final long c;

    public c1m(long j, long j2, long j3) {
        this.f3579a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1m)) {
            return false;
        }
        c1m c1mVar = (c1m) obj;
        long j = c1mVar.f3579a;
        int i = y3d.h;
        return h2t0.a(this.f3579a, j) && h2t0.a(this.b, c1mVar.b) && h2t0.a(this.c, c1mVar.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f3579a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.f3579a);
        String strI2 = y3d.i(this.b);
        return axq.n(b1j.n("Outline(borderColor=", strI, ", backgroundColor=", strI2, ", iconTint="), y3d.i(this.c), Separators.RPAREN);
    }
}
