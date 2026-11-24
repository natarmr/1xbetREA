package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x0q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40083a;
    public final long b;

    public x0q(long j, long j2) {
        this.f40083a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0q)) {
            return false;
        }
        x0q x0qVar = (x0q) obj;
        long j = x0qVar.f40083a;
        int i = y3d.h;
        return h2t0.a(this.f40083a, j) && h2t0.a(this.b, x0qVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f40083a) * 31);
    }

    public final String toString() {
        return b1j.k("FilledLMoreColorsConfig(containerBackgroundColor=", y3d.i(this.f40083a), ", iconTint=", y3d.i(this.b), Separators.RPAREN);
    }
}
