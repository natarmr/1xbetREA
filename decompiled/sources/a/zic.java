package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zic implements fvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44433a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public zic(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f44433a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // a.fvh0
    public final evh0 b(long j) {
        long[] jArr = this.e;
        int iF = vtt0.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.c;
        hvh0 hvh0Var = new hvh0(j2, jArr2[iF]);
        if (j2 >= j || iF == this.f44433a - 1) {
            return new evh0(hvh0Var, hvh0Var);
        }
        int i = iF + 1;
        return new evh0(hvh0Var, new hvh0(jArr[i], jArr2[i]));
    }

    @Override // a.fvh0
    public final boolean d() {
        return true;
    }

    @Override // a.fvh0
    public final long g() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f44433a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + Separators.RPAREN;
    }
}
