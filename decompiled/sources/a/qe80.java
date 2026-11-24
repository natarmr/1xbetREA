package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qe80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28571a;
    public final long b;
    public final long c;
    public final long d;

    public qe80(long j, long j2, long j3, long j4) {
        this.f28571a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe80)) {
            return false;
        }
        qe80 qe80Var = (qe80) obj;
        long j = qe80Var.f28571a;
        int i = y3d.h;
        return h2t0.a(this.f28571a, j) && h2t0.a(this.b, qe80Var.b) && h2t0.a(this.c, qe80Var.c) && h2t0.a(this.d, qe80Var.d);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + rw2.b(rw2.b(Long.hashCode(this.f28571a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strI = y3d.i(this.f28571a);
        String strI2 = y3d.i(this.b);
        return ua80.m(b1j.n("OutlineAllMarketsColorsConfig(containerBackgroundColor=", strI, ", containerBorderColor=", strI2, ", labelColor="), y3d.i(this.c), ", iconTint=", y3d.i(this.d), Separators.RPAREN);
    }
}
