package a;

/* JADX INFO: loaded from: classes.dex */
public final class v3u0 implements rvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f36748a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public v3u0(long[] jArr, long[] jArr2, long j, long j2, long j3) {
        this.f36748a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = m7x.v(j3 - j2, j);
    }

    @Override // a.fvh0
    public final evh0 b(long j) {
        long[] jArr = this.f36748a;
        int iF = vtt0.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.b;
        hvh0 hvh0Var = new hvh0(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new evh0(hvh0Var, hvh0Var);
        }
        int i = iF + 1;
        return new evh0(hvh0Var, new hvh0(jArr[i], jArr2[i]));
    }

    @Override // a.rvh0
    public final long c() {
        return this.d;
    }

    @Override // a.fvh0
    public final boolean d() {
        return true;
    }

    @Override // a.rvh0
    public final long e(long j) {
        return this.f36748a[vtt0.f(this.b, j, true)];
    }

    @Override // a.rvh0
    public final int f() {
        return this.e;
    }

    @Override // a.fvh0
    public final long g() {
        return this.c;
    }
}
