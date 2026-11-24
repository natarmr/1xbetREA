package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nrm implements orm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24008a;

    public nrm() {
        pz40 pz40Var = s6t0.f31722a;
        this.f24008a = s6t0.b().f33626a.getBackground();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrm)) {
            return false;
        }
        long j = ((nrm) obj).f24008a;
        int i = y3d.h;
        return h2t0.a(this.f24008a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f24008a);
    }

    public final String toString() {
        return kng0.l("Shown(indicatorColor=", y3d.i(this.f24008a), Separators.RPAREN);
    }
}
