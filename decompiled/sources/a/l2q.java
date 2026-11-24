package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class l2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19324a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public l2q(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f19324a = j;
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
        if (!(obj instanceof l2q)) {
            return false;
        }
        l2q l2qVar = (l2q) obj;
        long j = l2qVar.f19324a;
        int i = y3d.h;
        return h2t0.a(this.f19324a, j) && h2t0.a(this.b, l2qVar.b) && h2t0.a(this.c, l2qVar.c) && h2t0.a(this.d, l2qVar.d) && h2t0.a(this.e, l2qVar.e) && h2t0.a(this.f, l2qVar.f) && h2t0.a(this.g, l2qVar.g) && h2t0.a(this.h, l2qVar.h);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.h) + rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f19324a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strI = y3d.i(this.f19324a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        String strI6 = y3d.i(this.f);
        String strI7 = y3d.i(this.g);
        String strI8 = y3d.i(this.h);
        StringBuilder sbN = b1j.n("FilledSDefaultColorsConfig(containerBackgroundColor=", strI, ", highlightedContainerBackgroundColor=", strI2, ", highlightedContainerBorderColor=");
        f140.v(sbN, strI3, ", marketLabelColor=", strI4, ", coefficientLabelColor=");
        f140.v(sbN, strI5, ", badgesBackgroundColor=", strI6, ", trackIconTint=");
        return ua80.m(sbN, strI7, ", lockIconTint=", strI8, Separators.RPAREN);
    }
}
