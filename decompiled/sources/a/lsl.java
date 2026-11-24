package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lsl implements ssl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20585a;

    public lsl(long j) {
        this.f20585a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsl)) {
            return false;
        }
        long j = ((lsl) obj).f20585a;
        int i = y3d.h;
        return h2t0.a(this.f20585a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f20585a);
    }

    public final String toString() {
        return kng0.l("FilledCompact(backgroundColor=", y3d.i(this.f20585a), Separators.RPAREN);
    }
}
