package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bac implements kpm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2250a;

    public bac(long j) {
        this.f2250a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bac)) {
            return false;
        }
        long j = ((bac) obj).f2250a;
        int i = y3d.h;
        return h2t0.a(this.f2250a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f2250a);
    }

    public final String toString() {
        return kng0.l("ChevronStepProgressUiModel(color=", y3d.i(this.f2250a), Separators.RPAREN);
    }
}
