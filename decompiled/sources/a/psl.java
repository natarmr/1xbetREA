package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class psl implements ssl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27521a;

    public psl(long j) {
        this.f27521a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psl)) {
            return false;
        }
        long j = ((psl) obj).f27521a;
        int i = y3d.h;
        return h2t0.a(this.f27521a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f27521a);
    }

    public final String toString() {
        return kng0.l("FilledS(backgroundColor=", y3d.i(this.f27521a), Separators.RPAREN);
    }
}
