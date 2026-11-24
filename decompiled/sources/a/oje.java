package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class oje {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25354a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public oje(long j, long j2, long j3, long j4, long j5) {
        this.f25354a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof oje)) {
            return false;
        }
        oje ojeVar = (oje) obj;
        long j = ojeVar.f25354a;
        int i = y3d.h;
        return h2t0.a(this.f25354a, j) && h2t0.a(this.b, ojeVar.b) && h2t0.a(this.c, ojeVar.c) && h2t0.a(this.d, ojeVar.d) && h2t0.a(this.e, ojeVar.e);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + rw2.b(rw2.b(rw2.b(Long.hashCode(this.f25354a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strI = y3d.i(this.f25354a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        StringBuilder sbN = b1j.n("ContextMenuColors(backgroundColor=", strI, ", textColor=", strI2, ", iconColor=");
        f140.v(sbN, strI3, ", disabledTextColor=", strI4, ", disabledIconColor=");
        return axq.n(sbN, strI5, Separators.RPAREN);
    }
}
