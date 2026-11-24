package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2499a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final lm40 g;

    public bff0(long j, long j2, long j3, long j4, long j5, float[] fArr, lm40 lm40Var) {
        this.f2499a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = lm40Var;
    }

    public final float a() {
        long j = this.e;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = this.f2499a;
        int i3 = (int) (j2 >> 32);
        int iMin = Math.min(Math.max(i3, 0), i);
        int i4 = (int) j2;
        int iMin2 = Math.min(Math.max(i4, 0), i2);
        long j3 = this.b;
        int i5 = (int) (j3 >> 32);
        int iMax = Math.max(Math.min(i5, i), 0);
        int i6 = (int) j3;
        return Math.max((Math.max(Math.min(i6, i2), 0) - iMin2) * (iMax - iMin), 0) / Math.min(i2 * i, (i6 - i4) * (i5 - i3));
    }

    public final mkx b() {
        long j = this.f2499a;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = this.b;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) j2;
        float[] fArr = this.f;
        if (fArr == null) {
            long j3 = this.d;
            long j4 = this.c;
            int i5 = ((int) (j3 >> 32)) - ((int) (j4 >> 32));
            int i6 = ((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L));
            return new mkx(i + i5, i2 + i6, i3 + i5, i4 + i6);
        }
        float f = i;
        float f2 = i2;
        float f3 = i3;
        float f4 = i4;
        jge0 jge0Var = new jge0(f, f2, f3, f4);
        if (fArr.length >= 16) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[3];
            float f8 = fArr[4];
            float f9 = fArr[5];
            float f10 = fArr[7];
            float f11 = fArr[12];
            float f12 = fArr[13];
            float f13 = fArr[15];
            float f14 = f7 * f;
            float f15 = f10 * f2;
            float f16 = 1.0f / ((f14 + f15) + f13);
            if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
                f16 = 0.0f;
            }
            float f17 = f5 * f;
            float f18 = f8 * f2;
            float f19 = (f17 + f18 + f11) * f16;
            float f20 = f * f6;
            float f21 = f2 * f9;
            float f22 = f16 * (f20 + f21 + f12);
            float f23 = f10 * f4;
            float f24 = 1.0f / ((f14 + f23) + f13);
            if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
                f24 = 0.0f;
            }
            float f25 = f8 * f4;
            float f26 = (f17 + f25 + f11) * f24;
            float f27 = f9 * f4;
            float f28 = (f20 + f27 + f12) * f24;
            float f29 = f7 * f3;
            float f30 = 1.0f / ((f15 + f29) + f13);
            if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
                f30 = 0.0f;
            }
            float f31 = f5 * f3;
            float f32 = (f31 + f18 + f11) * f30;
            float f33 = f6 * f3;
            float f34 = f30 * (f33 + f21 + f12);
            float f35 = 1.0f / ((f29 + f23) + f13);
            float f36 = (Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
            float f37 = (f31 + f25 + f11) * f36;
            float f38 = (f33 + f27 + f12) * f36;
            jge0Var = new jge0(Math.min(f19, Math.min(f26, Math.min(f32, f37))), Math.min(f22, Math.min(f28, Math.min(f34, f38))), Math.max(f19, Math.max(f26, Math.max(f32, f37))), Math.max(f22, Math.max(f28, Math.max(f34, f38))));
        }
        return m2x.C(jge0Var);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && bff0.class == obj.getClass()) {
                bff0 bff0Var = (bff0) obj;
                if (this.f2499a == bff0Var.f2499a && this.b == bff0Var.b && this.e == bff0Var.e && ikx.b(this.c, bff0Var.c) && ikx.b(this.d, bff0Var.d)) {
                    float[] fArr = bff0Var.f;
                    float[] fArr2 = this.f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr2.equals(fArr);
                    }
                    if (zEquals && this.g.equals(bff0Var.g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iB = rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f2499a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iB + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
