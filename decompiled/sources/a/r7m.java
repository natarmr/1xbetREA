package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r7m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29983a;
    public final long b;
    public final long c;

    public r7m(long j, long j2, long j3) {
        this.f29983a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7m)) {
            return false;
        }
        r7m r7mVar = (r7m) obj;
        long j = r7mVar.f29983a;
        int i = y3d.h;
        return h2t0.a(this.f29983a, j) && h2t0.a(this.b, r7mVar.b) && h2t0.a(this.c, r7mVar.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f29983a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.f29983a);
        String strI2 = y3d.i(this.b);
        return axq.n(b1j.n("DsCyberHeaderColors(labelColor=", strI, ", buttonBackgroundColor=", strI2, ", buttonIconTint="), y3d.i(this.c), Separators.RPAREN);
    }
}
