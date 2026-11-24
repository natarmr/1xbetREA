package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7308a;
    public final long b;

    public e6x(long j, long j2) {
        this.f7308a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6x)) {
            return false;
        }
        e6x e6xVar = (e6x) obj;
        if (!ycl.b(8.0f, 8.0f) || !ycl.b(14.0f, 14.0f)) {
            return false;
        }
        long j = e6xVar.f7308a;
        int i = y3d.h;
        return h2t0.a(this.f7308a, j) && h2t0.a(this.b, e6xVar.b);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(Float.hashCode(8.0f) * 31, 14.0f, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return l0q.f19214a.hashCode() + rw2.b(rw2.b(iA, 31, this.f7308a), 31, this.b);
    }

    public final String toString() {
        String strC = ycl.c(8.0f);
        String strC2 = ycl.c(14.0f);
        String strI = y3d.i(this.f7308a);
        String strI2 = y3d.i(this.b);
        StringBuilder sbN = b1j.n("Background(verticalPadding=", strC, ", cornerRadius=", strC2, ", selectedColor=");
        f140.v(sbN, strI, ", unselectedColor=", strI2, ", drawStyle=");
        sbN.append(l0q.f19214a);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
