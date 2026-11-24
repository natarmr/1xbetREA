package a;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class cw3 extends f290 {
    public static final float d = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f5061a;
    public float b;
    public float c;

    public static float b(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians(f / 2.0f));
        }
        jf4.o("Arc must be between 0 and 90 degrees");
        return 0.0f;
    }

    @Override // a.f290
    public final Path a(float f, float f2, float f3, float f4) {
        float fA;
        float fA2;
        float f5;
        Path path = new Path();
        path.moveTo(f, f2);
        float f6 = f3 - f;
        float f7 = f4 - f2;
        float f8 = (f7 * f7) + (f6 * f6);
        float f9 = (f + f3) / 2.0f;
        float f10 = (f2 + f4) / 2.0f;
        float f11 = 0.25f * f8;
        boolean z = f2 > f4;
        if (Math.abs(f6) < Math.abs(f7)) {
            float fAbs = Math.abs(f8 / (f7 * 2.0f));
            if (z) {
                fA2 = fAbs + f4;
                fA = f3;
            } else {
                fA2 = fAbs + f2;
                fA = f;
            }
            f5 = this.b;
        } else {
            float f12 = f8 / (f6 * 2.0f);
            if (z) {
                fA2 = f2;
                fA = f12 + f;
            } else {
                fA = f3 - f12;
                fA2 = f4;
            }
            f5 = this.f5061a;
        }
        float f13 = f11 * f5 * f5;
        float f14 = f9 - fA;
        float f15 = f10 - fA2;
        float f16 = (f15 * f15) + (f14 * f14);
        float f17 = this.c;
        float f18 = f11 * f17 * f17;
        if (f16 >= f13) {
            f13 = f16 > f18 ? f18 : 0.0f;
        }
        if (f13 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f13 / f16);
            fA = rw2.a(fA, f9, fSqrt, f9);
            fA2 = rw2.a(fA2, f10, fSqrt, f10);
        }
        path.cubicTo((f + fA) / 2.0f, (f2 + fA2) / 2.0f, (fA + f3) / 2.0f, (fA2 + f4) / 2.0f, f3, f4);
        return path;
    }
}
