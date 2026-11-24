package a;

/* JADX INFO: loaded from: classes.dex */
public final class kjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18389a;
    public final long b;
    public final byte c;
    public final long d;
    public final float e;

    public kjj0(float f, int i, long j, long j2) {
        this(3, (i & 8) != 0 ? 0L : j2, f, 1.0f, j == 16 ? y3d.b : j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjj0)) {
            return false;
        }
        kjj0 kjj0Var = (kjj0) obj;
        if (!ycl.b(this.f18389a, kjj0Var.f18389a) || !ycl.b(0.0f, 0.0f) || this.b != kjj0Var.b || this.e != kjj0Var.e || this.c != kjj0Var.c) {
            return false;
        }
        long j = kjj0Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, defpackage.c.a(rw2.b(defpackage.c.a(Float.hashCode(this.f18389a) * 31, 0.0f, 31), 31, this.b), this.e, 31), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return rw2.b(iA, 31, this.d);
    }

    public final String toString() {
        String strC = ycl.c(this.f18389a);
        String strC2 = ycl.c(0.0f);
        String strC3 = adl.c(this.b);
        String strA = l78.a(this.c);
        String strI = y3d.i(this.d);
        StringBuilder sbN = b1j.n("Shadow(radius=", strC, ", spread=", strC2, ", offset=");
        sbN.append(strC3);
        sbN.append(", alpha=");
        sbN.append(this.e);
        sbN.append(", blendMode=");
        return ua80.m(sbN, strA, ", color=", strI, ", brush=null)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kjj0(int i, long j, float f, float f2, long j2) {
        this.f18389a = f;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = l1e0.c(f2, 0.0f, 1.0f);
    }
}
