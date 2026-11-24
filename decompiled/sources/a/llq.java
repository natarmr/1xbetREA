package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class llq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f20261a;

    static {
        long[] jArr = u1h0.f34903a;
        int iD = u1h0.d(0);
        int iMax = iD > 0 ? Math.max(7, u1h0.c(iD)) : 0;
        if (iMax != 0) {
            int i = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[iMax];
        f20261a = new float[0];
    }
}
