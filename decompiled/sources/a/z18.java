package a;

/* JADX INFO: loaded from: classes.dex */
public final class z18 implements fvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b28 f43606a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public z18(b28 b28Var, long j, long j2, long j3, long j4, long j5) {
        this.f43606a = b28Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // a.fvh0
    public final evh0 b(long j) {
        hvh0 hvh0Var = new hvh0(j, a28.a(this.f43606a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new evh0(hvh0Var, hvh0Var);
    }

    @Override // a.fvh0
    public final boolean d() {
        return true;
    }

    @Override // a.fvh0
    public final long g() {
        return this.b;
    }
}
