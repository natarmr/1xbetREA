package a;

/* JADX INFO: loaded from: classes.dex */
public final class q2e implements rvh0, fvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27995a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final long j;

    public q2e(int i, int i2, long j, long j2, long j3, boolean z, boolean z2) {
        this.f27995a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        this.h = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j4 = j - j2;
            this.d = j4;
            this.f = (Math.max(0L, j4) * 8000000) / ((long) i);
        }
        this.i = j3;
        this.j = j == -1 ? -1L : j;
    }

    @Override // a.fvh0
    public final boolean a() {
        return this.h;
    }

    @Override // a.fvh0
    public final evh0 b(long j) {
        long j2 = this.i;
        if (j2 != -9223372036854775807L && j >= j2) {
            long j3 = this.j;
            if (j3 != -1) {
                long j4 = this.c;
                long j5 = this.b;
                hvh0 hvh0Var = new hvh0(Math.max(0L, j2 - ((Math.max(0L, (j4 + j5) - j5) * 8000000) / ((long) this.e))), Math.max(j5, j3 - j4));
                return new evh0(hvh0Var, hvh0Var);
            }
        }
        long j6 = this.d;
        long j7 = this.b;
        if (j6 == -1 && !this.g) {
            hvh0 hvh0Var2 = new hvh0(0L, j7);
            return new evh0(hvh0Var2, hvh0Var2);
        }
        int i = this.e;
        long j8 = this.c;
        long jMin = (((((long) i) * j) / 8000000) / j8) * j8;
        if (j6 != -1) {
            jMin = Math.min(jMin, j6 - j8);
        }
        long jMax = Math.max(jMin, 0L) + j7;
        long jMax2 = (Math.max(0L, jMax - j7) * 8000000) / ((long) i);
        hvh0 hvh0Var3 = new hvh0(jMax2, jMax);
        if (j6 != -1 && jMax2 < j) {
            long j9 = jMax + j8;
            if (j9 < this.f27995a) {
                return new evh0(hvh0Var3, new hvh0((Math.max(0L, j9 - j7) * 8000000) / ((long) i), j9));
            }
        }
        return new evh0(hvh0Var3, hvh0Var3);
    }

    @Override // a.rvh0
    public final long c() {
        return this.j;
    }

    @Override // a.fvh0
    public final boolean d() {
        return this.d != -1 || this.g;
    }

    @Override // a.rvh0
    public final long e(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // a.rvh0
    public final int f() {
        return this.e;
    }

    @Override // a.fvh0
    public final long g() {
        long j = this.i;
        return j != -9223372036854775807L ? j : this.f;
    }
}
