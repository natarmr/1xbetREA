package a;

/* JADX INFO: loaded from: classes.dex */
public final class dzn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6949a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;

    public dzn0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f6949a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dzn0)) {
            return false;
        }
        dzn0 dzn0Var = (dzn0) obj;
        long j = dzn0Var.f6949a;
        int i = y3d.h;
        return h2t0.a(this.f6949a, j) && h2t0.a(this.b, dzn0Var.b) && h2t0.a(this.c, dzn0Var.c) && h2t0.a(this.d, dzn0Var.d) && h2t0.a(this.e, dzn0Var.e) && h2t0.a(this.f, dzn0Var.f) && h2t0.a(this.g, dzn0Var.g) && h2t0.a(this.h, dzn0Var.h) && h2t0.a(this.i, dzn0Var.i) && h2t0.a(this.j, dzn0Var.j) && h2t0.a(this.k, dzn0Var.k) && h2t0.a(this.l, dzn0Var.l) && h2t0.a(this.m, dzn0Var.m) && h2t0.a(this.n, dzn0Var.n) && h2t0.a(this.o, dzn0Var.o) && h2t0.a(this.p, dzn0Var.p);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.p) + rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f6949a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }
}
