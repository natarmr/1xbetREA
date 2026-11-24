package a;

/* JADX INFO: loaded from: classes6.dex */
public final class unm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tnm f35970a;
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final boolean i;

    public /* synthetic */ unm(tnm tnmVar, long j, long j2, long j3, float f, float f2, int i, int i2, boolean z, int i3) {
        this(tnmVar, j, j2, j3, f, f2, i, (i3 & 128) != 0 ? 100 : i2, (i3 & 256) != 0 ? true : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unm)) {
            return false;
        }
        unm unmVar = (unm) obj;
        if (this.f35970a != unmVar.f35970a) {
            return false;
        }
        long j = unmVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, unmVar.c) && h2t0.a(this.d, unmVar.d) && ycl.b(this.e, unmVar.e) && ycl.b(this.f, unmVar.f) && this.g == unmVar.g && this.h == unmVar.h && this.i == unmVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.f35970a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(false) + brm0.e(twn.a(this.h, twn.a(this.g, defpackage.c.a(defpackage.c.a(rw2.b(rw2.b(rw2.b(iHashCode, 31, this.b), 31, this.c), 31, this.d), this.e, 31), this.f, 31), 31), 31), 31, this.i);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.c);
        String strI3 = y3d.i(this.d);
        String strC = ycl.c(this.e);
        String strC2 = ycl.c(this.f);
        StringBuilder sb = new StringBuilder("DsProgressIndicatorUiModel(style=");
        sb.append(this.f35970a);
        sb.append(", progressColorStart=");
        sb.append(strI);
        sb.append(", progressColorEnd=");
        f140.v(sb, strI2, ", trackColor=", strI3, ", thickness=");
        f140.v(sb, strC, ", cornerRadius=", strC2, ", progress=");
        axq.r(this.g, this.h, ", maxProgress=", ", hasTrackLine=", sb);
        return rw2.p(sb, this.i, ", animateProgress=false)");
    }

    public unm(tnm tnmVar, long j, long j2, long j3, float f, float f2, int i, int i2, boolean z) {
        this.f35970a = tnmVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = f;
        this.f = f2;
        this.g = i;
        this.h = i2;
        this.i = z;
    }
}
