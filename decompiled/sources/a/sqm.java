package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sqm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f32636a;
    public final float b;
    public final float c;
    public final long d;
    public final zcl e;

    public sqm(float f, float f2, float f3, long j, zcl zclVar) {
        this.f32636a = f;
        this.b = f2;
        this.c = f3;
        this.d = j;
        this.e = zclVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqm)) {
            return false;
        }
        sqm sqmVar = (sqm) obj;
        if (!ycl.b(this.f32636a, sqmVar.f32636a) || !ycl.b(this.b, sqmVar.b) || !ycl.b(this.c, sqmVar.c) || !ycl.b(0.0f, 0.0f)) {
            return false;
        }
        long j = sqmVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e.equals(sqmVar.e);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(this.f32636a) * 31, this.b, 31), this.c, 31), 0.0f, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Float.hashCode(this.e.f44172a) + rw2.b(iA, 31, this.d);
    }

    public final String toString() {
        String strC = ycl.c(this.f32636a);
        String strC2 = ycl.c(this.b);
        String strC3 = ycl.c(this.c);
        String strC4 = ycl.c(0.0f);
        String strI = y3d.i(this.d);
        StringBuilder sbN = b1j.n("DsShadowConfig(offsetX=", strC, ", offsetY=", strC2, ", blur=");
        f140.v(sbN, strC3, ", spread=", strC4, ", color=");
        sbN.append(strI);
        sbN.append(", radius=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
