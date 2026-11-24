package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17792a;
    public final long b;

    public k6x(long j, long j2) {
        this.f17792a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6x)) {
            return false;
        }
        k6x k6xVar = (k6x) obj;
        long j = k6xVar.f17792a;
        int i = y3d.h;
        return h2t0.a(this.f17792a, j) && h2t0.a(this.b, k6xVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f17792a) * 31);
    }

    public final String toString() {
        return b1j.k("IndicatorColorsUiModel(activeColor=", y3d.i(this.f17792a), ", inactiveColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
