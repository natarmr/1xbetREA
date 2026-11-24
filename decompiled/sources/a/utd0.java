package a;

/* JADX INFO: loaded from: classes6.dex */
public final class utd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36251a;
    public final long b;
    public final long c;
    public final long d;

    public utd0(long j, long j2, long j3, long j4) {
        this.f36251a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof utd0)) {
            return false;
        }
        utd0 utd0Var = (utd0) obj;
        long j = utd0Var.f36251a;
        int i = y3d.h;
        return h2t0.a(this.f36251a, j) && h2t0.a(this.b, utd0Var.b) && h2t0.a(this.c, utd0Var.c) && h2t0.a(this.d, utd0Var.d);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + rw2.b(rw2.b(Long.hashCode(this.f36251a) * 31, 31, this.b), 31, this.c);
    }
}
