package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t0q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33131a;
    public final long b;

    public t0q(long j, long j2) {
        this.f33131a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0q)) {
            return false;
        }
        t0q t0qVar = (t0q) obj;
        long j = t0qVar.f33131a;
        int i = y3d.h;
        return h2t0.a(this.f33131a, j) && h2t0.a(this.b, t0qVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f33131a) * 31);
    }

    public final String toString() {
        return b1j.k("FilledCompactMoreColorsConfig(containerBackgroundColor=", y3d.i(this.f33131a), ", iconTint=", y3d.i(this.b), Separators.RPAREN);
    }
}
