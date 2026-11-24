package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v0q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36593a;
    public final long b;
    public final long c;

    public v0q(long j, long j2, long j3) {
        this.f36593a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0q)) {
            return false;
        }
        v0q v0qVar = (v0q) obj;
        long j = v0qVar.f36593a;
        int i = y3d.h;
        return h2t0.a(this.f36593a, j) && h2t0.a(this.b, v0qVar.b) && h2t0.a(this.c, v0qVar.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f36593a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.f36593a);
        String strI2 = y3d.i(this.b);
        return axq.n(b1j.n("FilledLAllMarketsColorsConfig(containerBackgroundColor=", strI, ", labelColor=", strI2, ", iconTint="), y3d.i(this.c), Separators.RPAREN);
    }
}
