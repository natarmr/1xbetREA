package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jtv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qtv0 f17122a;
    public final long b;
    public final ntv0 c;
    public final float d;
    public final long e;

    public jtv0(qtv0 qtv0Var, long j, ntv0 ntv0Var, float f, long j2) {
        this.f17122a = qtv0Var;
        this.b = j;
        this.c = ntv0Var;
        this.d = f;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jtv0) {
            jtv0 jtv0Var = (jtv0) obj;
            if (Intrinsics.d(this.f17122a, jtv0Var.f17122a)) {
                long j = jtv0Var.b;
                int i = y3d.h;
                return h2t0.a(this.b, j) && this.c.equals(jtv0Var.c) && ycl.b(this.d, jtv0Var.d) && this.e == jtv0Var.e;
            }
        }
        return false;
    }

    public final int hashCode() {
        qtv0 qtv0Var = this.f17122a;
        int iHashCode = qtv0Var == null ? 0 : qtv0Var.hashCode();
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + defpackage.c.a((this.c.hashCode() + rw2.b(iHashCode * 31, 31, this.b)) * 31, this.d, 31);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strC = ycl.c(this.d);
        String strC2 = bdl.c(this.e);
        StringBuilder sb = new StringBuilder("XBottomSheetDragHandleConfig(style=");
        sb.append(this.f17122a);
        sb.append(", backgroundColor=");
        sb.append(strI);
        sb.append(", placement=");
        sb.append(this.c);
        sb.append(", zoneHeight=");
        sb.append(strC);
        sb.append(", size=");
        return axq.n(sb, strC2, Separators.RPAREN);
    }
}
