package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40128a;

    public x1m() {
        pz40 pz40Var = s6t0.f31722a;
        this.f40128a = s6t0.b().f33626a.getBackgroundContent();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1m)) {
            return false;
        }
        long j = ((x1m) obj).f40128a;
        int i = y3d.h;
        return h2t0.a(this.f40128a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f40128a);
    }

    public final String toString() {
        return kng0.l("Theme(scoreCellBgColor=", y3d.i(this.f40128a), Separators.RPAREN);
    }
}
