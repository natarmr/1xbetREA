package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n1m implements s1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22757a;
    public final long b;

    public n1m(long j, long j2) {
        this.f22757a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1m)) {
            return false;
        }
        n1m n1mVar = (n1m) obj;
        long j = n1mVar.f22757a;
        int i = y3d.h;
        return h2t0.a(this.f22757a, j) && h2t0.a(this.b, n1mVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f22757a) * 31);
    }

    public final String toString() {
        return b1j.k("FilledCompact(backgroundColor=", y3d.i(this.f22757a), ", iconTint=", y3d.i(this.b), Separators.RPAREN);
    }
}
