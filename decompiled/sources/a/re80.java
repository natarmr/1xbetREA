package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class re80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30323a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public re80(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f30323a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re80)) {
            return false;
        }
        re80 re80Var = (re80) obj;
        long j = re80Var.f30323a;
        int i = y3d.h;
        return h2t0.a(this.f30323a, j) && h2t0.a(this.b, re80Var.b) && h2t0.a(this.c, re80Var.c) && h2t0.a(this.d, re80Var.d) && h2t0.a(this.e, re80Var.e) && h2t0.a(this.f, re80Var.f) && h2t0.a(this.g, re80Var.g) && h2t0.a(this.h, re80Var.h) && h2t0.a(this.i, re80Var.i) && h2t0.a(this.j, re80Var.j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.j) + rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f30323a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        String strI = y3d.i(this.f30323a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        String strI6 = y3d.i(this.f);
        String strI7 = y3d.i(this.g);
        String strI8 = y3d.i(this.h);
        String strI9 = y3d.i(this.i);
        String strI10 = y3d.i(this.j);
        StringBuilder sbN = b1j.n("OutlineDefaultColorsConfig(containerBackgroundColor=", strI, ", containerBorderColor=", strI2, ", highlightedContainerBackgroundColor=");
        f140.v(sbN, strI3, ", highlightedContainerBorderColor=", strI4, ", marketLabelColor=");
        f140.v(sbN, strI5, ", coefficientLabelColor=", strI6, ", badgesBackgroundColor=");
        f140.v(sbN, strI7, ", badgeBorderColor=", strI8, ", trackIconTint=");
        return ua80.m(sbN, strI9, ", lockIconTint=", strI10, Separators.RPAREN);
    }
}
