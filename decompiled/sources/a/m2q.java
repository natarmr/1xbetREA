package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21075a;
    public final long b;

    public m2q(long j, long j2) {
        this.f21075a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2q)) {
            return false;
        }
        m2q m2qVar = (m2q) obj;
        long j = m2qVar.f21075a;
        int i = y3d.h;
        return h2t0.a(this.f21075a, j) && h2t0.a(this.b, m2qVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f21075a) * 31);
    }

    public final String toString() {
        return b1j.k("FilledSMoreColorsConfig(containerBackgroundColor=", y3d.i(this.f21075a), ", iconTint=", y3d.i(this.b), Separators.RPAREN);
    }
}
