package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class h1m implements m1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12290a;

    public h1m(long j) {
        this.f12290a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1m)) {
            return false;
        }
        long j = ((h1m) obj).f12290a;
        int i = y3d.h;
        return h2t0.a(this.f12290a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f12290a);
    }

    public final String toString() {
        return kng0.l("FilledCompact(backgroundColor=", y3d.i(this.f12290a), Separators.RPAREN);
    }
}
