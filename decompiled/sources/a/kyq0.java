package a;

/* JADX INFO: loaded from: classes.dex */
public final class kyq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19119a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public kyq0(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f19119a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kyq0)) {
            return false;
        }
        kyq0 kyq0Var = (kyq0) obj;
        long j = kyq0Var.f19119a;
        int i = y3d.h;
        return h2t0.a(this.f19119a, j) && h2t0.a(this.b, kyq0Var.b) && h2t0.a(this.c, kyq0Var.c) && h2t0.a(this.d, kyq0Var.d) && h2t0.a(this.e, kyq0Var.e) && h2t0.a(this.f, kyq0Var.f);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f) + rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f19119a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
