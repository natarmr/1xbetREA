package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j1m implements m1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15743a;

    public j1m(long j) {
        this.f15743a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1m)) {
            return false;
        }
        long j = ((j1m) obj).f15743a;
        int i = y3d.h;
        return h2t0.a(this.f15743a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f15743a);
    }

    public final String toString() {
        return kng0.l("FilledS(backgroundColor=", y3d.i(this.f15743a), Separators.RPAREN);
    }
}
