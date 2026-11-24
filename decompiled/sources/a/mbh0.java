package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class mbh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21509a;
    public final long b;
    public final float c;
    public final float d;

    public mbh0(float f, float f2, float f3, long j) {
        this.f21509a = f;
        this.b = j;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbh0)) {
            return false;
        }
        mbh0 mbh0Var = (mbh0) obj;
        if (!ycl.b(0.0f, 0.0f) || !ycl.b(this.f21509a, mbh0Var.f21509a)) {
            return false;
        }
        long j = mbh0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && ycl.b(this.c, mbh0Var.c) && ycl.b(this.d, mbh0Var.d);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(Float.hashCode(0.0f) * 31, this.f21509a, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Float.hashCode(this.d) + defpackage.c.a(rw2.b(iA, 31, this.b), this.c, 31);
    }

    public final String toString() {
        String strC = ycl.c(0.0f);
        String strC2 = ycl.c(this.f21509a);
        String strI = y3d.i(this.b);
        String strC3 = ycl.c(this.c);
        String strC4 = ycl.c(this.d);
        StringBuilder sbN = b1j.n("ScrollableRowConfig(containerCornerRadius=", strC, ", gap=", strC2, ", containerColor=");
        f140.v(sbN, strI, ", startPadding=", strC3, ", endPadding=");
        return axq.n(sbN, strC4, Separators.RPAREN);
    }
}
