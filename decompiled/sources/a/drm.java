package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class drm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6567a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public drm(long j, long j2, long j3, long j4, long j5) {
        this.f6567a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drm)) {
            return false;
        }
        drm drmVar = (drm) obj;
        long j = drmVar.f6567a;
        int i = y3d.h;
        return h2t0.a(this.f6567a, j) && h2t0.a(this.b, drmVar.b) && h2t0.a(this.c, drmVar.c) && h2t0.a(this.d, drmVar.d) && h2t0.a(this.e, drmVar.e);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + rw2.b(rw2.b(rw2.b(Long.hashCode(this.f6567a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strI = y3d.i(this.f6567a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        StringBuilder sbN = b1j.n("DsSliderColors(trackColor=", strI, ", progressColor=", strI2, ", handleColor=");
        f140.v(sbN, strI3, ", iconColor=", strI4, ", stepIndicatorColor=");
        return axq.n(sbN, strI5, Separators.RPAREN);
    }
}
