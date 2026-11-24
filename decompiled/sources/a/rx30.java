package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes2.dex */
public final class rx30 implements sx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f31245a;
    public final long b;
    public final miz c;
    public final int d;
    public final long e;
    public final long f;
    public final rc5 g;
    public final ene h;

    public rx30(o0x o0xVar, long j, miz mizVar, int i, long j2, rc5 rc5Var, int i2) {
        if ((i2 & 2) != 0) {
            pz40 pz40Var = s6t0.f31722a;
            j = s6t0.b().f33626a.getPrimary();
        }
        mizVar = (i2 & 4) != 0 ? liz.f20129a : mizVar;
        j2 = (i2 & 16) != 0 ? j : j2;
        pz40 pz40Var2 = s6t0.f31722a;
        long jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
        rc5Var = (i2 & 64) != 0 ? new pc5(null) : rc5Var;
        zcl zclVar = qmk.m;
        o0xVar.getClass();
        this.f31245a = o0xVar;
        this.b = j;
        this.c = mizVar;
        this.d = i;
        this.e = j2;
        this.f = jM121getTransparent0d7_KjU;
        this.g = rc5Var;
        this.h = zclVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx30)) {
            return false;
        }
        rx30 rx30Var = (rx30) obj;
        if (!Intrinsics.d(this.f31245a, rx30Var.f31245a)) {
            return false;
        }
        long j = rx30Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && this.c.equals(rx30Var.c) && this.d == rx30Var.d && h2t0.a(this.e, rx30Var.e) && h2t0.a(this.f, rx30Var.f) && this.g.equals(rx30Var.g) && this.h.equals(rx30Var.h) && ycl.b(24.0f, 24.0f);
    }

    public final int hashCode() {
        int iHashCode = this.f31245a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Float.hashCode(24.0f) + ((this.h.hashCode() + ((this.g.hashCode() + rw2.b(rw2.b(twn.a(this.d, (this.c.hashCode() + rw2.b(iHashCode, 31, this.b)) * 31, 31), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.e);
        String strI3 = y3d.i(this.f);
        String strC = ycl.c(24.0f);
        StringBuilder sb = new StringBuilder("IconBack(imageLink=");
        sb.append(this.f31245a);
        sb.append(", imageTintColor=");
        sb.append(strI);
        sb.append(", badge=");
        sb.append(this.c);
        sb.append(", placeholderResId=");
        sb.append(this.d);
        sb.append(", placeholderTintColor=");
        f140.v(sb, strI2, ", imageStrokeColor=", strI3, ", background=");
        sb.append(this.g);
        sb.append(", backgroundRadius=");
        sb.append(this.h);
        sb.append(", iconSize=");
        return axq.n(sb, strC, Separators.RPAREN);
    }
}
