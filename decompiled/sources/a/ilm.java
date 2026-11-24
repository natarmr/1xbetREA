package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ilm implements llm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14986a;

    public ilm(long j) {
        this.f14986a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilm)) {
            return false;
        }
        long j = ((ilm) obj).f14986a;
        int i = y3d.h;
        return h2t0.a(this.f14986a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f14986a);
    }

    public final String toString() {
        return kng0.l("BackButton(iconColor=", y3d.i(this.f14986a), Separators.RPAREN);
    }
}
