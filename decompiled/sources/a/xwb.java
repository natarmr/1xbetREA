package a;

/* JADX INFO: loaded from: classes6.dex */
public final class xwb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41602a;
    public final e900 b;
    public final long c;
    public final long d;
    public final y9q0 e;
    public final long f;
    public final long g;
    public final x03 h;
    public final long i;
    public final y9q0 j;
    public final long k;
    public final long l;

    public xwb(long j, e900 e900Var, long j2, long j3, y9q0 y9q0Var, long j4, long j5, x03 x03Var, long j6, y9q0 y9q0Var2, long j7, long j8) {
        this.f41602a = j;
        this.b = e900Var;
        this.c = j2;
        this.d = j3;
        this.e = y9q0Var;
        this.f = j4;
        this.g = j5;
        this.h = x03Var;
        this.i = j6;
        this.j = y9q0Var2;
        this.k = j7;
        this.l = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xwb) {
            xwb xwbVar = (xwb) obj;
            long j = xwbVar.f41602a;
            int i = y3d.h;
            if (h2t0.a(this.f41602a, j) && ycl.b(2.0f, 2.0f) && this.b.equals(xwbVar.b) && h2t0.a(this.c, xwbVar.c) && h2t0.a(this.d, xwbVar.d) && ycl.b(0.0f, 0.0f) && ycl.b(6.0f, 6.0f) && ycl.b(6.0f, 6.0f) && this.e.equals(xwbVar.e) && h2t0.a(this.f, xwbVar.f) && h2t0.a(this.g, xwbVar.g) && this.h == xwbVar.h && ycl.b(52.0f, 52.0f) && ycl.b(36.0f, 36.0f) && ycl.b(62.0f, 62.0f) && ycl.b(40.0f, 40.0f) && h2t0.a(this.i, xwbVar.i) && this.j.equals(xwbVar.j) && h2t0.a(this.k, xwbVar.k) && h2t0.a(this.l, xwbVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(false) + rw2.b(rw2.b(brm0.g(this.j, rw2.b(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a((this.h.hashCode() + rw2.b(rw2.b(brm0.g(this.e, defpackage.c.a(defpackage.c.a(defpackage.c.a(rw2.b(rw2.b((this.b.hashCode() + defpackage.c.a(Long.hashCode(this.f41602a) * 31, 2.0f, 31)) * 31, 31, this.c), 31, this.d), 0.0f, 31), 6.0f, 31), 6.0f, 31), 31), 31, this.f), 31, this.g)) * 31, 52.0f, 31), 36.0f, 31), 62.0f, 31), 40.0f, 31), 31, this.i), 31), 31, this.k), 31, this.l);
    }

    public final String toString() {
        String strI = y3d.i(this.f41602a);
        String strC = ycl.c(2.0f);
        String strI2 = y3d.i(this.c);
        String strI3 = y3d.i(this.d);
        String strC2 = ycl.c(0.0f);
        String strC3 = ycl.c(6.0f);
        String strC4 = ycl.c(6.0f);
        String strI4 = y3d.i(this.f);
        String strI5 = y3d.i(this.g);
        String strC5 = ycl.c(52.0f);
        String strC6 = ycl.c(36.0f);
        String strC7 = ycl.c(62.0f);
        String strC8 = ycl.c(40.0f);
        String strI6 = y3d.i(this.i);
        String strI7 = y3d.i(this.k);
        String strI8 = y3d.i(this.l);
        StringBuilder sbN = b1j.n("ChartStyle(lineColor=", strI, ", lineWidth=", strC, ", areaGradient=");
        sbN.append(this.b);
        sbN.append(", markerColor=");
        sbN.append(strI2);
        sbN.append(", markerBorderColor=");
        f140.v(sbN, strI3, ", markerBorderWidth=", strC2, ", markerRadius=");
        f140.v(sbN, strC3, ", selectedMarkerRadius=", strC4, ", labelTextStyle=");
        sbN.append(this.e);
        sbN.append(", labelTextColor=");
        sbN.append(strI4);
        sbN.append(", gridColor=");
        sbN.append(strI5);
        sbN.append(", guidelineStyle=");
        sbN.append(this.h);
        sbN.append(", horizontalPointSpacing=");
        f140.v(sbN, strC5, ", yAxisWidth=", strC6, ", xAxisHeight=");
        f140.v(sbN, strC7, ", chartPaddingTop=", strC8, ", tooltipColor=");
        sbN.append(strI6);
        sbN.append(", tooltipTextStyle=");
        sbN.append(this.j);
        sbN.append(", tooltipTextColor=");
        return ua80.m(sbN, strI7, ", backgroundColor=", strI8, ", isZoomEnabled=false)");
    }
}
