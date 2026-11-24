package a;

/* JADX INFO: loaded from: classes.dex */
public final class be9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2438a;
    public final long b;
    public final long c;
    public final long d;

    public be9(long j, long j2, long j3, long j4) {
        this.f2438a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof be9)) {
            return false;
        }
        be9 be9Var = (be9) obj;
        long j = be9Var.f2438a;
        int i = y3d.h;
        return h2t0.a(this.f2438a, j) && h2t0.a(this.b, be9Var.b) && h2t0.a(this.c, be9Var.c) && h2t0.a(this.d, be9Var.d);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + rw2.b(rw2.b(Long.hashCode(this.f2438a) * 31, 31, this.b), 31, this.c);
    }
}
