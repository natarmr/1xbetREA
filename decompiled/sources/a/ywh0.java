package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ywh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43369a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final y3d f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ ywh0(long j, long j2, long j3, long j4, long j5, y3d y3dVar, int i) {
        this(j, j2, j3, j4, j5, y3dVar, (i & 64) == 0, (i & 128) == 0, (i & 256) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywh0)) {
            return false;
        }
        ywh0 ywh0Var = (ywh0) obj;
        long j = ywh0Var.f43369a;
        int i = y3d.h;
        return h2t0.a(this.f43369a, j) && h2t0.a(this.b, ywh0Var.b) && h2t0.a(this.c, ywh0Var.c) && h2t0.a(this.d, ywh0Var.d) && h2t0.a(this.e, ywh0Var.e) && Intrinsics.d(this.f, ywh0Var.f) && this.g == ywh0Var.g && this.h == ywh0Var.h && this.i == ywh0Var.i;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f43369a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        y3d y3dVar = this.f;
        return Boolean.hashCode(this.i) + brm0.e(brm0.e((iB + (y3dVar == null ? 0 : Long.hashCode(y3dVar.f41946a))) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        String strI = y3d.i(this.f43369a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        StringBuilder sbN = b1j.n("SegmentedControlColorSchemeData(backgroundColor=", strI, ", indicatorColor=", strI2, ", dividerColor=");
        f140.v(sbN, strI3, ", segmentTextColorSelected=", strI4, ", segmentTextColorUnselected=");
        sbN.append(strI5);
        sbN.append(", borderColor=");
        sbN.append(this.f);
        sbN.append(", upperCase=");
        ua80.u(", hasBorder=", ", hasDivider=", sbN, this.g, this.h);
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }

    public ywh0(long j, long j2, long j3, long j4, long j5, y3d y3dVar, boolean z, boolean z2, boolean z3) {
        this.f43369a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = y3dVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }
}
