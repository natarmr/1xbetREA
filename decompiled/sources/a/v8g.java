package a;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class v8g {
    public static final float t = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float[] u = new float[101];
    public static final float v;
    public static final float w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Interpolator f36980a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;
    public float m;
    public float n;
    public float o;
    public boolean p;
    public float q;
    public final n0o0 r;
    public final n0o0 s;

    static {
        float f;
        float f2;
        float f3 = 0.0f;
        for (int i = 0; i < 101; i++) {
            float f4 = i / 100.0f;
            float f5 = 1.0f;
            while (true) {
                float fZ = rw2.z(f5, f3, 2.0f, f3);
                float f6 = 1.0f - fZ;
                f = 3.0f * fZ * f6;
                float f7 = ((0.6f * fZ) + (f6 * 0.4f)) * f;
                f2 = fZ * fZ * fZ;
                float f8 = f7 + f2;
                if (Math.abs(f8 - f4) >= 1.0E-5d) {
                    if (f8 > f4) {
                        f5 = fZ;
                    } else {
                        f3 = fZ;
                    }
                }
            }
            u[i] = f + f2;
        }
        u[100] = 1.0f;
        v = 8.0f;
        w = 1.0f;
        w = 1.0f / sac.u0(1.0f);
    }

    public v8g(Context context, DecelerateInterpolator decelerateInterpolator) {
        context.getClass();
        this.f36980a = decelerateInterpolator;
        this.p = true;
        this.r = maz.b(new e8g(this, (byte) 1));
        this.s = maz.b(new yg3(context, (byte) 22));
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3;
        int i8 = i4;
        if (!this.p) {
            float fFloatValue = this.q - ((((Number) this.r.getValue()).floatValue() * ((int) (AnimationUtils.currentAnimationTimeMillis() - this.k))) / 2000.0f);
            float f = this.e - this.c;
            float f2 = this.f - this.d;
            float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            float f3 = (f / fSqrt) * fFloatValue;
            float f4 = (f2 / fSqrt) * fFloatValue;
            if (Math.signum(i7) == Math.signum(f3) && Math.signum(i8) == Math.signum(f4)) {
                i7 += (int) f3;
                i8 += (int) f4;
            }
        }
        this.b = true;
        this.p = false;
        float fSqrt2 = (float) Math.sqrt((i8 * i8) + (i7 * i7));
        this.q = fSqrt2;
        double dLog = (float) Math.log((0.4f * fSqrt2) / 800.0f);
        double d = t;
        double d2 = d - 1.0d;
        this.l = (int) (Math.exp(dLog / d2) * 1000.0d);
        this.k = AnimationUtils.currentAnimationTimeMillis();
        this.c = i;
        this.d = i2;
        float f5 = fSqrt2 == 0.0f ? 1.0f : i7 / fSqrt2;
        float f6 = fSqrt2 != 0.0f ? i8 / fSqrt2 : 1.0f;
        int iExp = (int) (Math.exp((d / d2) * dLog) * 800.0d);
        this.g = i5;
        this.h = i6;
        float f7 = iExp;
        int iRint = i + ((int) Math.rint(f5 * f7));
        this.e = iRint;
        int iMin = Math.min(iRint, this.g);
        this.e = iMin;
        this.e = Math.max(iMin, 0);
        int iRint2 = ((int) Math.rint(f7 * f6)) + i2;
        this.f = iRint2;
        int iMin2 = Math.min(iRint2, this.h);
        this.f = iMin2;
        this.f = Math.max(iMin2, 0);
    }

    public final void b(int i, int i2, int i3) {
        this.b = false;
        this.p = false;
        this.l = i3;
        this.k = AnimationUtils.currentAnimationTimeMillis();
        this.c = 0;
        this.d = 0;
        this.e = i;
        this.f = i2;
        this.n = i;
        this.o = i2;
        this.m = 1.0f / this.l;
    }
}
