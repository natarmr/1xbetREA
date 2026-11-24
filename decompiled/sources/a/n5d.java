package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22939a;
    public final long b;
    public final long c;
    public final long d;

    public n5d(long j, long j2, long j3, long j4) {
        this.f22939a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5d)) {
            return false;
        }
        n5d n5dVar = (n5d) obj;
        long j = n5dVar.f22939a;
        int i = y3d.h;
        return h2t0.a(this.f22939a, j) && h2t0.a(this.b, n5dVar.b) && h2t0.a(this.c, n5dVar.c) && h2t0.a(this.d, n5dVar.d);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + rw2.b(rw2.b(Long.hashCode(this.f22939a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strI = y3d.i(this.f22939a);
        String strI2 = y3d.i(this.b);
        return ua80.m(b1j.n("ColorsConfig(backgroundColor=", strI, ", titleTextColor=", strI2, ", imageBackgroundColor="), y3d.i(this.c), ", placeholderTint=", y3d.i(this.d), Separators.RPAREN);
    }
}
