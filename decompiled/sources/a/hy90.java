package a;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class hy90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s88 f13849a = new s88((byte) 6);

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {16, 17, 18, 21, 22, 23, 28, 30};
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            x0x.K(!false);
            sparseBooleanArray.append(i2, true);
        }
        x0x.K(!false);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        int[] iArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32};
        for (int i3 = 0; i3 < 27; i3++) {
            int i4 = iArr2[i3];
            x0x.K(!false);
            sparseBooleanArray2.append(i4, true);
        }
        x0x.K(!false);
    }

    public final void a(int i, boolean z) {
        if (z) {
            this.f13849a.b(i);
        }
    }
}
