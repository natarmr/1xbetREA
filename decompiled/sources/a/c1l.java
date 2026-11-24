package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c1l implements kpm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3577a;

    public c1l(long j) {
        this.f3577a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1l)) {
            return false;
        }
        long j = ((c1l) obj).f3577a;
        int i = y3d.h;
        return h2t0.a(this.f3577a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f3577a);
    }

    public final String toString() {
        return kng0.l("DotStepProgressUiModel(color=", y3d.i(this.f3577a), Separators.RPAREN);
    }
}
