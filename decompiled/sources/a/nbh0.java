package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class nbh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23240a;
    public final long b;
    public final float c;

    public nbh0(float f, float f2, long j) {
        this.f23240a = f;
        this.b = j;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbh0)) {
            return false;
        }
        nbh0 nbh0Var = (nbh0) obj;
        if (!ycl.b(0.0f, 0.0f) || !ycl.b(this.f23240a, nbh0Var.f23240a)) {
            return false;
        }
        long j = nbh0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && ycl.b(this.c, nbh0Var.c);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(Float.hashCode(0.0f) * 31, this.f23240a, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Float.hashCode(this.c) + rw2.b(iA, 31, this.b);
    }

    public final String toString() {
        String strC = ycl.c(0.0f);
        String strC2 = ycl.c(this.f23240a);
        return ua80.m(b1j.n("ScrollableRowConfig(containerCornerRadius=", strC, ", gap=", strC2, ", containerColor="), y3d.i(this.b), ", endPadding=", ycl.c(this.c), Separators.RPAREN);
    }
}
