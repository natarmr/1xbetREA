package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22814a;
    public final long b;
    public final long c;

    public n2q(long j, long j2, long j3) {
        this.f22814a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2q)) {
            return false;
        }
        n2q n2qVar = (n2q) obj;
        long j = n2qVar.f22814a;
        int i = y3d.h;
        return h2t0.a(this.f22814a, j) && h2t0.a(this.b, n2qVar.b) && h2t0.a(this.c, n2qVar.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f22814a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.f22814a);
        String strI2 = y3d.i(this.b);
        return axq.n(b1j.n("FilledUnitedAllMarketsColorsConfig(containerBackgroundColor=", strI, ", labelColor=", strI2, ", iconTint="), y3d.i(this.c), Separators.RPAREN);
    }
}
