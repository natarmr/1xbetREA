package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k1m implements m1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17532a;
    public final long b;

    public k1m(long j, long j2) {
        this.f17532a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1m)) {
            return false;
        }
        k1m k1mVar = (k1m) obj;
        long j = k1mVar.f17532a;
        int i = y3d.h;
        return h2t0.a(this.f17532a, j) && h2t0.a(this.b, k1mVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f17532a) * 31);
    }

    public final String toString() {
        return b1j.k("FilledUnited(borderColor=", y3d.i(this.f17532a), ", backgroundColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
