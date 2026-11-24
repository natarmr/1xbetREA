package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ea50 implements ga50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7451a;

    public ea50(long j) {
        this.f7451a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea50)) {
            return false;
        }
        long j = ((ea50) obj).f7451a;
        int i = y3d.h;
        return h2t0.a(this.f7451a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f7451a);
    }

    public final String toString() {
        return kng0.l("Chevron(chevronColor=", y3d.i(this.f7451a), Separators.RPAREN);
    }
}
