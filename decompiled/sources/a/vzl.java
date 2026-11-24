package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vzl implements xzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38304a;

    public vzl(long j) {
        this.f38304a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzl)) {
            return false;
        }
        long j = ((vzl) obj).f38304a;
        int i = y3d.h;
        return h2t0.a(this.f38304a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f38304a);
    }

    public final String toString() {
        return kng0.l("Base(background=", y3d.i(this.f38304a), Separators.RPAREN);
    }
}
