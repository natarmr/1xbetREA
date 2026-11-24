package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g3v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10631a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public g3v0(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f10631a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3v0)) {
            return false;
        }
        g3v0 g3v0Var = (g3v0) obj;
        long j = g3v0Var.f10631a;
        int i = y3d.h;
        return h2t0.a(this.f10631a, j) && h2t0.a(this.b, g3v0Var.b) && h2t0.a(this.c, g3v0Var.c) && h2t0.a(this.d, g3v0Var.d) && h2t0.a(this.e, g3v0Var.e) && h2t0.a(this.f, g3v0Var.f) && h2t0.a(this.g, g3v0Var.g);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.g) + rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f10631a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String strI = y3d.i(this.f10631a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        String strI6 = y3d.i(this.f);
        String strI7 = y3d.i(this.g);
        StringBuilder sbN = b1j.n("WebGamesGameCollectionTechColors(container=", strI, ", iconTint=", strI2, ", backgroundColor=");
        f140.v(sbN, strI3, ", placeholderBackgroundColor=", strI4, ", placeholderIconTintColor=");
        f140.v(sbN, strI5, ", label=", strI6, ", labelRectangle=");
        return axq.n(sbN, strI7, Separators.RPAREN);
    }
}
