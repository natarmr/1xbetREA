package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class it20 extends gfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15334a;
    public final long b;

    public it20(long j, long j2) {
        this.f15334a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it20)) {
            return false;
        }
        it20 it20Var = (it20) obj;
        long j = it20Var.f15334a;
        int i = y3d.h;
        return h2t0.a(this.f15334a, j) && h2t0.a(this.b, it20Var.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f15334a) * 31);
    }

    public final String toString() {
        return b1j.k("TwoTone(firstColor=", y3d.i(this.f15334a), ", secondColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
