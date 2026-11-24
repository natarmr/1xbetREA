package a;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class v6r implements fvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f36890a;
    public final SparseArray b;
    public final long c;
    public final long d;
    public final int e;

    public v6r(SparseArray sparseArray, SparseArray sparseArray2, long j, long j2, int i) {
        this.f36890a = sparseArray;
        this.b = sparseArray2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // a.fvh0
    public final evh0 b(long j) {
        SparseArray sparseArray = this.f36890a;
        int i = this.e;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j < jArr[0]) {
            hvh0 hvh0Var = new hvh0(0L, this.d);
            return new evh0(hvh0Var, hvh0Var);
        }
        int iF = vtt0.f(jArr, j, true);
        hvh0 hvh0Var2 = new hvh0(jArr[iF], jArr2[iF]);
        return new evh0(hvh0Var2, hvh0Var2);
    }

    @Override // a.fvh0
    public final boolean d() {
        return true;
    }

    @Override // a.fvh0
    public final long g() {
        return this.c;
    }
}
