package a;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class c1v0 implements fvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1v0 f3594a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public c1v0(b1v0 b1v0Var, int i, long j, long j2) {
        this.f3594a = b1v0Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) b1v0Var.c);
        this.d = j3;
        this.e = h(j3);
    }

    @Override // a.fvh0
    public final evh0 b(long j) {
        b1v0 b1v0Var = this.f3594a;
        long j2 = (((long) b1v0Var.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.d - 1;
        long j4 = vtt0.j(j2, 0L, j3);
        int i = b1v0Var.c;
        long j5 = this.c;
        long jH = h(j4);
        hvh0 hvh0Var = new hvh0(jH, (((long) i) * j4) + j5);
        if (jH >= j || j4 == j3) {
            return new evh0(hvh0Var, hvh0Var);
        }
        long j6 = j4 + 1;
        return new evh0(hvh0Var, new hvh0(h(j6), (((long) i) * j6) + j5));
    }

    @Override // a.fvh0
    public final boolean d() {
        return true;
    }

    @Override // a.fvh0
    public final long g() {
        return this.e;
    }

    public final long h(long j) {
        long j2 = j * ((long) this.b);
        long j3 = this.f3594a.b;
        String str = vtt0.f38024a;
        return vtt0.T(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
