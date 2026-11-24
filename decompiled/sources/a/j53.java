package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15914a;
    public final long b;

    public j53(int i, long j) {
        this.f15914a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j53)) {
            return false;
        }
        j53 j53Var = (j53) obj;
        if (this.f15914a != j53Var.f15914a) {
            return false;
        }
        long j = j53Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && ycl.b(14.0f, 14.0f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f15914a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Float.hashCode(14.0f) + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        return axq.n(vqd.r(this.f15914a, "AnimatedDeltaIconParams(iconResId=", ", iconTint=", strI, ", iconSize="), ycl.c(14.0f), Separators.RPAREN);
    }
}
