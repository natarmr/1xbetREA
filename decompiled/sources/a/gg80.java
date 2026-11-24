package a;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gg80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f11243a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = y0x0.k;
            if (i2 >= 2787) {
                return;
            }
            int i3 = iArr[i2];
            int i4 = i3 & 1;
            int i5 = 0;
            while (i5 < 8) {
                float f = 0.0f;
                while (true) {
                    i = i3 & 1;
                    if (i == i4) {
                        f += 1.0f;
                        i3 >>= 1;
                    }
                }
                f11243a[i2][7 - i5] = f / 17.0f;
                i5++;
                i4 = i;
            }
            i2++;
        }
    }
}
