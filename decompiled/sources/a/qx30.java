package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class qx30 implements sx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f29462a;
    public final long b;
    public final miz c;
    public final int d;
    public final long e;
    public final float f;

    public qx30(o0x o0xVar, long j, miz mizVar, int i, float f, int i2) {
        if ((i2 & 2) != 0) {
            pz40 pz40Var = s6t0.f31722a;
            j = s6t0.b().f33626a.getPrimary();
        }
        if ((i2 & 32) != 0) {
            zcl zclVar = qmk.f28987a;
            f = 24.0f;
        }
        this.f29462a = o0xVar;
        this.b = j;
        this.c = mizVar;
        this.d = i;
        this.e = j;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx30)) {
            return false;
        }
        qx30 qx30Var = (qx30) obj;
        if (!this.f29462a.equals(qx30Var.f29462a)) {
            return false;
        }
        long j = qx30Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && this.c.equals(qx30Var.c) && this.d == qx30Var.d && h2t0.a(this.e, qx30Var.e) && ycl.b(this.f, qx30Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f29462a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Float.hashCode(this.f) + rw2.b(twn.a(this.d, (this.c.hashCode() + rw2.b(iHashCode, 31, this.b)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.e);
        String strC = ycl.c(this.f);
        StringBuilder sb = new StringBuilder("Icon(imageLink=");
        sb.append(this.f29462a);
        sb.append(", imageTintColor=");
        sb.append(strI);
        sb.append(", badge=");
        sb.append(this.c);
        sb.append(", placeholderResId=");
        sb.append(this.d);
        sb.append(", placeholderTintColor=");
        return ua80.m(sb, strI2, ", iconSize=", strC, Separators.RPAREN);
    }
}
