package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pf6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26886a;
    public final long b;
    public final long c;
    public final long d;

    public pf6(long j, long j2, long j3, long j4) {
        this.f26886a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf6)) {
            return false;
        }
        pf6 pf6Var = (pf6) obj;
        long j = pf6Var.f26886a;
        int i = y3d.h;
        return h2t0.a(this.f26886a, j) && h2t0.a(this.b, pf6Var.b) && h2t0.a(this.c, pf6Var.c) && h2t0.a(this.d, pf6Var.d);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + rw2.b(rw2.b(Long.hashCode(this.f26886a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strI = y3d.i(this.f26886a);
        String strI2 = y3d.i(this.b);
        return ua80.m(b1j.n("BetBuilderButtonColors(collapsedBackground=", strI, ", expandedBackground=", strI2, ", collapsedIconColor="), y3d.i(this.c), ", expandedIconColor=", y3d.i(this.d), Separators.RPAREN);
    }
}
