package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kul extends sul {
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public kul(long j, long j2, long j3, long j4) {
        super(new jul((byte) 0, j), new jul((byte) 1, j2), new jul((byte) 2, j3), new jul((byte) 3, j4));
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kul)) {
            return false;
        }
        kul kulVar = (kul) obj;
        long j = kulVar.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && h2t0.a(this.f, kulVar.f) && h2t0.a(this.g, kulVar.g) && h2t0.a(this.h, kulVar.h);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.h) + rw2.b(rw2.b(Long.hashCode(this.e) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        String strI2 = y3d.i(this.f);
        return ua80.m(b1j.n("Custom(container=", strI, ", content=", strI2, ", disabledContainer="), y3d.i(this.g), ", disabledContent=", y3d.i(this.h), Separators.RPAREN);
    }
}
