package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l4m0 implements m4m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19414a;
    public final long b;
    public final long c;
    public final float d;
    public final byte e;
    public final float f;
    public final float g;

    /* JADX WARN: Multi-variable type inference failed */
    public l4m0(String str, long j, long j2, float f, int i, float f2, float f3) {
        str.getClass();
        this.f19414a = str;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = i;
        this.f = f2;
        this.g = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4m0)) {
            return false;
        }
        l4m0 l4m0Var = (l4m0) obj;
        if (!Intrinsics.d(this.f19414a, l4m0Var.f19414a)) {
            return false;
        }
        long j = l4m0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && daq0.a(this.c, l4m0Var.c) && ycl.b(this.d, l4m0Var.d) && this.e == l4m0Var.e && ycl.b(this.f, l4m0Var.f) && ycl.b(this.g, l4m0Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.f19414a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(iHashCode, 31, this.b);
        eaq0[] eaq0VarArr = daq0.b;
        return Float.hashCode(this.g) + defpackage.c.a(twn.a(this.e, defpackage.c.a(rw2.b(iB, 31, this.c), this.d, 31), 31), this.f, 31);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strF = daq0.f(this.c);
        String strC = ycl.c(this.d);
        String strA = f2q0.a(this.e);
        String strC2 = ycl.c(this.f);
        String strC3 = ycl.c(this.g);
        StringBuilder sbN = b1j.n("ValueCellUiModel(title=", this.f19414a, ", background=", strI, ", textSize=");
        f140.v(sbN, strF, ", width=", strC, ", align=");
        f140.v(sbN, strA, ", startPadding=", strC2, ", verticalPadding=");
        return axq.n(sbN, strC3, Separators.RPAREN);
    }
}
