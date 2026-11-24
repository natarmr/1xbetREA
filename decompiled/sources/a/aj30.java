package a;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aj30 implements fvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zic f955a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public aj30(SparseArray sparseArray, long j, int i, long j2, long j3) {
        zic zicVar;
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            zicVar = null;
        } else {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                zi30 zi30Var = (zi30) list.get(i4);
                jArrCopyOf3[i4] = zi30Var.f44422a;
                jArrCopyOf[i4] = zi30Var.b;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
                jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArrCopyOf3[i6] >= j) {
                i6--;
            }
            iArrCopyOf[i6] = (int) ((j2 + j3) - jArrCopyOf[i6]);
            jArrCopyOf2[i6] = j - jArrCopyOf3[i6];
            if (i6 < i2) {
                f1t0.g0("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i7);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i7);
            }
            zicVar = new zic(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.f955a = zicVar;
    }

    @Override // a.fvh0
    public final evh0 b(long j) {
        zic zicVar = this.f955a;
        if (zicVar != null) {
            return zicVar.b(j);
        }
        hvh0 hvh0Var = hvh0.c;
        return new evh0(hvh0Var, hvh0Var);
    }

    @Override // a.fvh0
    public final boolean d() {
        List list = (List) this.b.get(this.d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // a.fvh0
    public final long g() {
        return this.c;
    }
}
