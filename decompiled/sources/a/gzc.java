package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12175a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;
    public final float f;

    public gzc(int i, long j, long j2, float f, float f2, float f3) {
        this.f12175a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzc)) {
            return false;
        }
        gzc gzcVar = (gzc) obj;
        if (this.f12175a != gzcVar.f12175a) {
            return false;
        }
        long j = gzcVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, gzcVar.c) && ycl.b(this.d, gzcVar.d) && ycl.b(this.e, gzcVar.e) && ycl.b(this.f, gzcVar.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f12175a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Float.hashCode(this.f) + defpackage.c.a(defpackage.c.a(rw2.b(rw2.b(iHashCode, 31, this.b), 31, this.c), this.d, 31), this.e, 31);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.c);
        String strC = ycl.c(this.d);
        String strC2 = ycl.c(this.e);
        String strC3 = ycl.c(this.f);
        StringBuilder sbR = vqd.r(this.f12175a, "CoefIconParams(iconResId=", ", iconTint=", strI, ", iconBackgroundColor=");
        f140.v(sbR, strI2, ", iconShapeCornerRadius=", strC, ", iconPadding=");
        return ua80.m(sbR, strC2, ", iconSize=", strC3, Separators.RPAREN);
    }
}
