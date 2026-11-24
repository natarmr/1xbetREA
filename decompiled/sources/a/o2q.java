package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24543a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;

    public o2q(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f24543a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2q)) {
            return false;
        }
        o2q o2qVar = (o2q) obj;
        long j = o2qVar.f24543a;
        int i = y3d.h;
        return h2t0.a(this.f24543a, j) && h2t0.a(this.b, o2qVar.b) && h2t0.a(this.c, o2qVar.c) && h2t0.a(this.d, o2qVar.d) && h2t0.a(this.e, o2qVar.e) && h2t0.a(this.f, o2qVar.f) && h2t0.a(this.g, o2qVar.g) && h2t0.a(this.h, o2qVar.h) && h2t0.a(this.i, o2qVar.i);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.i) + rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f24543a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String strI = y3d.i(this.f24543a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        String strI6 = y3d.i(this.f);
        String strI7 = y3d.i(this.g);
        String strI8 = y3d.i(this.h);
        String strI9 = y3d.i(this.i);
        StringBuilder sbN = b1j.n("FilledUnitedDefaultColorsConfig(containerBackgroundColor=", strI, ", highlightedContainerBackgroundColor=", strI2, ", marketLabelColor=");
        f140.v(sbN, strI3, ", coefficientLabelColor=", strI4, ", badgesBackgroundColor=");
        f140.v(sbN, strI5, ", badgeBorderColor=", strI6, ", trackIconTint=");
        f140.v(sbN, strI7, ", lockIconTint=", strI8, ", couponIndicatorTint=");
        return axq.n(sbN, strI9, Separators.RPAREN);
    }
}
