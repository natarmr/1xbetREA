package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26263a;
    public final long b;

    public p2q(long j, long j2) {
        this.f26263a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2q)) {
            return false;
        }
        p2q p2qVar = (p2q) obj;
        long j = p2qVar.f26263a;
        int i = y3d.h;
        return h2t0.a(this.f26263a, j) && h2t0.a(this.b, p2qVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f26263a) * 31);
    }

    public final String toString() {
        return b1j.k("FilledUnitedMoreColorsConfig(containerBackgroundColor=", y3d.i(this.f26263a), ", iconTint=", y3d.i(this.b), Separators.RPAREN);
    }
}
