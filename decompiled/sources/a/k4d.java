package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k4d extends mbc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17663a;

    public k4d(long j) {
        this.f17663a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4d)) {
            return false;
        }
        long j = ((k4d) obj).f17663a;
        int i = y3d.h;
        return h2t0.a(this.f17663a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f17663a);
    }

    public final String toString() {
        return kng0.l("Single(color=", y3d.i(this.f17663a), Separators.RPAREN);
    }
}
