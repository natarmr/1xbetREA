package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z0m implements d1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43574a;
    public final long b;

    public z0m(long j, long j2) {
        this.f43574a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0m)) {
            return false;
        }
        z0m z0mVar = (z0m) obj;
        long j = z0mVar.f43574a;
        int i = y3d.h;
        return h2t0.a(this.f43574a, j) && h2t0.a(this.b, z0mVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f43574a) * 31);
    }

    public final String toString() {
        return b1j.k("FilledCompact(backgroundColor=", y3d.i(this.f43574a), ", iconTint=", y3d.i(this.b), Separators.RPAREN);
    }
}
