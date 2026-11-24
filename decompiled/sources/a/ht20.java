package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ht20 extends gfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13611a;

    public ht20(long j) {
        this.f13611a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht20)) {
            return false;
        }
        long j = ((ht20) obj).f13611a;
        int i = y3d.h;
        return h2t0.a(this.f13611a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f13611a);
    }

    public final String toString() {
        return kng0.l("Single(color=", y3d.i(this.f13611a), Separators.RPAREN);
    }
}
