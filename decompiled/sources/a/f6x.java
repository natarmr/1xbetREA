package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class f6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9033a;
    public final long b;

    public f6x(long j, long j2) {
        this.f9033a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6x)) {
            return false;
        }
        f6x f6xVar = (f6x) obj;
        if (!ycl.b(8.0f, 8.0f) || !ycl.b(14.0f, 14.0f)) {
            return false;
        }
        long j = f6xVar.f9033a;
        int i = y3d.h;
        return h2t0.a(this.f9033a, j) && h2t0.a(this.b, f6xVar.b);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(Float.hashCode(8.0f) * 31, 14.0f, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return l0q.f19214a.hashCode() + rw2.b(rw2.b(iA, 31, this.f9033a), 31, this.b);
    }

    public final String toString() {
        String strC = ycl.c(8.0f);
        String strC2 = ycl.c(14.0f);
        String strI = y3d.i(this.f9033a);
        String strI2 = y3d.i(this.b);
        StringBuilder sbN = b1j.n("Background(verticalPadding=", strC, ", cornerRadius=", strC2, ", selectedColor=");
        f140.v(sbN, strI, ", unselectedColor=", strI2, ", drawStyle=");
        sbN.append(l0q.f19214a);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
