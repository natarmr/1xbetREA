package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17586a;
    public final long b;
    public final long c;

    public k2q(long j, long j2, long j3) {
        this.f17586a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2q)) {
            return false;
        }
        k2q k2qVar = (k2q) obj;
        long j = k2qVar.f17586a;
        int i = y3d.h;
        return h2t0.a(this.f17586a, j) && h2t0.a(this.b, k2qVar.b) && h2t0.a(this.c, k2qVar.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f17586a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.f17586a);
        String strI2 = y3d.i(this.b);
        return axq.n(b1j.n("FilledSAllMarketsColorsConfig(containerBackgroundColor=", strI, ", labelColor=", strI2, ", iconTint="), y3d.i(this.c), Separators.RPAREN);
    }
}
