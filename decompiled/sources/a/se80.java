package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class se80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32066a;
    public final long b;
    public final long c;

    public se80(long j, long j2, long j3) {
        this.f32066a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se80)) {
            return false;
        }
        se80 se80Var = (se80) obj;
        long j = se80Var.f32066a;
        int i = y3d.h;
        return h2t0.a(this.f32066a, j) && h2t0.a(this.b, se80Var.b) && h2t0.a(this.c, se80Var.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f32066a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.f32066a);
        String strI2 = y3d.i(this.b);
        return axq.n(b1j.n("OutlineMoreColorsConfig(containerBackgroundColor=", strI, ", containerBorderColor=", strI2, ", iconTint="), y3d.i(this.c), Separators.RPAREN);
    }
}
