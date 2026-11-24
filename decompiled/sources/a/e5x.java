package a;

/* JADX INFO: loaded from: classes.dex */
public final class e5x implements fvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v610 f7254a;
    public final v610 b;
    public long c;

    public e5x(long j, long[] jArr, long[] jArr2) {
        v610 v610Var;
        v610 v610Var2;
        x0x.A(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            v610Var = new v610(length);
            this.f7254a = v610Var;
            v610Var2 = new v610(length);
            this.b = v610Var2;
        } else {
            int i = length + 1;
            v610Var = new v610(i);
            this.f7254a = v610Var;
            v610Var2 = new v610(i);
            this.b = v610Var2;
            v610Var.a(0L);
            v610Var2.a(0L);
        }
        v610Var.b(jArr);
        v610Var2.b(jArr2);
        this.c = j;
    }

    @Override // a.fvh0
    public final evh0 b(long j) {
        v610 v610Var = this.b;
        if (v610Var.b == 0) {
            hvh0 hvh0Var = hvh0.c;
            return new evh0(hvh0Var, hvh0Var);
        }
        int iC = vtt0.c(v610Var, j);
        long jD = v610Var.d(iC);
        v610 v610Var2 = this.f7254a;
        hvh0 hvh0Var2 = new hvh0(jD, v610Var2.d(iC));
        if (jD == j || iC == v610Var.b - 1) {
            return new evh0(hvh0Var2, hvh0Var2);
        }
        int i = iC + 1;
        return new evh0(hvh0Var2, new hvh0(v610Var.d(i), v610Var2.d(i)));
    }

    @Override // a.fvh0
    public final boolean d() {
        return this.b.b > 0;
    }

    @Override // a.fvh0
    public final long g() {
        return this.c;
    }
}
