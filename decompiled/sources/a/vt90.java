package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vt90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37995a;
    public final long b;

    public vt90(int i, long j) {
        this.f37995a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt90)) {
            return false;
        }
        vt90 vt90Var = (vt90) obj;
        if (this.f37995a != vt90Var.f37995a) {
            return false;
        }
        long j = vt90Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f37995a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return defpackage.c.b(this.f37995a, "PieDataUiModel(value=", ", color=", y3d.i(this.b), Separators.RPAREN);
    }
}
