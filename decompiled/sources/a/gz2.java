package a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f12159a;

    static {
        float f;
        float fZ;
        float f2;
        float f3;
        float f4;
        float f5;
        float fZ2;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        f12159a = fArr;
        float[] fArr2 = new float[101];
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f12 = i / 100.0f;
            float f13 = 1.0f;
            while (true) {
                f = 2.0f;
                fZ = rw2.z(f13, f9, 2.0f, f9);
                f2 = f11 - fZ;
                f3 = fZ * 3.0f * f2;
                f4 = fZ * fZ * fZ;
                float f14 = (((fZ * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                f5 = f11;
                if (Math.abs(f14 - f12) < 1.0E-5d) {
                    break;
                }
                if (f14 > f12) {
                    f13 = fZ;
                } else {
                    f9 = fZ;
                }
                f11 = f5;
            }
            float f15 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + fZ) * f3) + f4;
            float f16 = f5;
            while (true) {
                fZ2 = rw2.z(f16, f10, f, f10);
                f6 = f5 - fZ2;
                f7 = fZ2 * 3.0f * f6;
                f8 = fZ2 * fZ2 * fZ2;
                float f17 = (((f6 * f15) + fZ2) * f7) + f8;
                if (Math.abs(f17 - f12) >= 1.0E-5d) {
                    if (f17 > f12) {
                        f16 = fZ2;
                    } else {
                        f10 = fZ2;
                    }
                    f15 = 0.5f;
                    f = 2.0f;
                }
            }
            fArr2[i] = (((fZ2 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
            i++;
        }
    }

    public static fz2 a(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float fC = l1e0.c(f, 0.0f, 1.0f);
        int i = (int) (100.0f * fC);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = f12159a;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            float fA = rw2.a(fC, f4, f6, f5);
            f2 = f6;
            f3 = fA;
        }
        return new fz2(f3, f2);
    }
}
