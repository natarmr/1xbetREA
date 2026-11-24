package a;

/* JADX INFO: loaded from: classes.dex */
public final class ncg0 implements d6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23292a;
    public final float b;
    public final long c;

    public ncg0(boolean z, float f, long j) {
        this.f23292a = z;
        this.b = f;
        this.c = j;
    }

    @Override // a.d6x
    public final yzj a(gy40 gy40Var) {
        return new v3k(gy40Var, this.f23292a, this.b, new u3k(this, (byte) 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncg0)) {
            return false;
        }
        ncg0 ncg0Var = (ncg0) obj;
        if (this.f23292a != ncg0Var.f23292a || !ycl.b(this.b, ncg0Var.b)) {
            return false;
        }
        long j = ncg0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    @Override // a.d6x
    public final int hashCode() {
        int iA = defpackage.c.a(Boolean.hashCode(this.f23292a) * 31, this.b, 961);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iA;
    }
}
