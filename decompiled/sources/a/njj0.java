package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/njj0;", "La/um40;", "La/i88;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class njj0 extends um40 {
    public final float b;
    public final yjj0 c;
    public final boolean d;
    public final long e;
    public final long f;

    public njj0(float f, yjj0 yjj0Var, boolean z, long j, long j2) {
        this.b = f;
        this.c = yjj0Var;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njj0)) {
            return false;
        }
        njj0 njj0Var = (njj0) obj;
        if (!ycl.b(this.b, njj0Var.b) || !Intrinsics.d(this.c, njj0Var.c) || this.d != njj0Var.d) {
            return false;
        }
        long j = njj0Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && h2t0.a(this.f, njj0Var.f);
    }

    @Override // a.um40
    public final lm40 f() {
        return new i88(new rai0(this, (byte) 12));
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        s460 s460Var;
        i88 i88Var = (i88) lm40Var;
        rai0 rai0Var = new rai0(this, (byte) 12);
        i88Var.o = rai0Var;
        if (i88Var.f20279a.n && (s460Var = vcc.X(i88Var, 2).v) != null) {
            s460Var.G1(rai0Var, true);
        }
    }

    public final int hashCode() {
        int iE = brm0.e((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31, 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f) + rw2.b(iE, 31, this.e);
    }

    public final String toString() {
        String strC = ycl.c(this.b);
        String strI = y3d.i(this.e);
        String strI2 = y3d.i(this.f);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(strC);
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", clip=");
        f140.s(", ambientColor=", strI, ", spotColor=", sb, this.d);
        return axq.n(sb, strI2, Separators.RPAREN);
    }
}
