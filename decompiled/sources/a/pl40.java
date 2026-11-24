package a;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class pl40 implements rvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f27165a;
    public final long[] b;
    public final long c;

    public pl40(long j, long[] jArr, long[] jArr2) {
        this.f27165a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? vtt0.M(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair h(long j, long[] jArr, long[] jArr2) {
        int iF = vtt0.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // a.fvh0
    public final evh0 b(long j) {
        Pair pairH = h(vtt0.Y(vtt0.j(j, 0L, this.c)), this.b, this.f27165a);
        hvh0 hvh0Var = new hvh0(vtt0.M(((Long) pairH.first).longValue()), ((Long) pairH.second).longValue());
        return new evh0(hvh0Var, hvh0Var);
    }

    @Override // a.rvh0
    public final long c() {
        return -1L;
    }

    @Override // a.fvh0
    public final boolean d() {
        return true;
    }

    @Override // a.rvh0
    public final long e(long j) {
        return vtt0.M(((Long) h(j, this.f27165a, this.b).second).longValue());
    }

    @Override // a.rvh0
    public final int f() {
        return -2147483647;
    }

    @Override // a.fvh0
    public final long g() {
        return this.c;
    }
}
