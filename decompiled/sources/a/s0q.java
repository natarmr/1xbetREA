package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s0q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31420a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public s0q(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f31420a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0q)) {
            return false;
        }
        s0q s0qVar = (s0q) obj;
        long j = s0qVar.f31420a;
        int i = y3d.h;
        return h2t0.a(this.f31420a, j) && h2t0.a(this.b, s0qVar.b) && h2t0.a(this.c, s0qVar.c) && h2t0.a(this.d, s0qVar.d) && h2t0.a(this.e, s0qVar.e) && h2t0.a(this.f, s0qVar.f) && h2t0.a(this.g, s0qVar.g) && h2t0.a(this.h, s0qVar.h);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.h) + rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f31420a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strI = y3d.i(this.f31420a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        String strI6 = y3d.i(this.f);
        String strI7 = y3d.i(this.g);
        String strI8 = y3d.i(this.h);
        StringBuilder sbN = b1j.n("FilledCompactDefaultColorsConfig(containerBackgroundColor=", strI, ", highlightedContainerBackgroundColor=", strI2, ", highlightedContainerBorderColor=");
        f140.v(sbN, strI3, ", marketLabelColor=", strI4, ", coefficientLabelColor=");
        f140.v(sbN, strI5, ", badgesBackgroundColor=", strI6, ", trackIconTint=");
        return ua80.m(sbN, strI7, ", lockIconTint=", strI8, Separators.RPAREN);
    }
}
