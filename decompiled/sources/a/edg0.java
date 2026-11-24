package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class edg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7616a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public edg0(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f7616a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edg0)) {
            return false;
        }
        edg0 edg0Var = (edg0) obj;
        long j = edg0Var.f7616a;
        int i = y3d.h;
        return h2t0.a(this.f7616a, j) && h2t0.a(this.b, edg0Var.b) && h2t0.a(this.c, edg0Var.c) && h2t0.a(this.d, edg0Var.d) && h2t0.a(this.e, edg0Var.e) && h2t0.a(this.f, edg0Var.f);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f) + rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f7616a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strI = y3d.i(this.f7616a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        String strI6 = y3d.i(this.f);
        StringBuilder sbN = b1j.n("RollingCalendarPalette(selectedBackground=", strI, ", unselectedBackground=", strI2, ", selectedLabel=");
        f140.v(sbN, strI3, ", unselectedLabel=", strI4, ", selectedMonth=");
        return ua80.m(sbN, strI5, ", unselectedMonth=", strI6, Separators.RPAREN);
    }
}
