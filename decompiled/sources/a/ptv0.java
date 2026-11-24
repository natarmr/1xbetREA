package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ptv0 implements qtv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27584a;

    public ptv0(long j) {
        this.f27584a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptv0)) {
            return false;
        }
        long j = ((ptv0) obj).f27584a;
        int i = y3d.h;
        return h2t0.a(this.f27584a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f27584a);
    }

    public final String toString() {
        return kng0.l("Theme(color=", y3d.i(this.f27584a), Separators.RPAREN);
    }
}
