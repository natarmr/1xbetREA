package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f1m implements g1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8770a;

    public f1m(long j) {
        this.f8770a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1m)) {
            return false;
        }
        long j = ((f1m) obj).f8770a;
        int i = y3d.h;
        return h2t0.a(this.f8770a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f8770a);
    }

    public final String toString() {
        return kng0.l("Theme(backgroundColor=", y3d.i(this.f8770a), Separators.RPAREN);
    }
}
