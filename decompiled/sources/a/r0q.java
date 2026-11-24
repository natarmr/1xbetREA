package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r0q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29642a;
    public final long b;
    public final long c;

    public r0q(long j, long j2, long j3) {
        this.f29642a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0q)) {
            return false;
        }
        r0q r0qVar = (r0q) obj;
        long j = r0qVar.f29642a;
        int i = y3d.h;
        return h2t0.a(this.f29642a, j) && h2t0.a(this.b, r0qVar.b) && h2t0.a(this.c, r0qVar.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f29642a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.f29642a);
        String strI2 = y3d.i(this.b);
        return axq.n(b1j.n("FilledCompactAllMarketsColorsConfig(containerBackgroundColor=", strI, ", labelColor=", strI2, ", iconTint="), y3d.i(this.c), Separators.RPAREN);
    }
}
