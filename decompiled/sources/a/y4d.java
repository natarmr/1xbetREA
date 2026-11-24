package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public abstract class y4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41997a;
    public final long b;
    public final int c;

    public y4d(String str, long j, int i) {
        this.f41997a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            jf4.o("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            jf4.o("The id must be between -1 and 63");
            throw null;
        }
    }

    public float a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    public float b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    public boolean c() {
        return false;
    }

    public long d(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = rf60.g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = rf60.f;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8))));
    }

    public float e(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = rf60.g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = rf60.f;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y4d y4dVar = (y4d) obj;
        if (this.c == y4dVar.c && this.f41997a.equals(y4dVar.f41997a)) {
            return kbc.T(this.b, y4dVar.b);
        }
        return false;
    }

    public long f(float f, float f2, float f3, float f4, y4d y4dVar) {
        float[] fArr = rf60.d;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float fI = l7x.I(f5);
        float fI2 = l7x.I(f6);
        float fI3 = l7x.I(f7);
        float[] fArr2 = rf60.e;
        return fbc.c((fArr2[6] * fI3) + (fArr2[3] * fI2) + (fArr2[0] * fI), (fArr2[7] * fI3) + (fArr2[4] * fI2) + (fArr2[1] * fI), (fArr2[8] * fI3) + (fArr2[5] * fI2) + (fArr2[2] * fI), f4, y4dVar);
    }

    public int hashCode() {
        return rw2.b(this.f41997a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return this.f41997a + " (id=" + this.c + ", model=" + kbc.k0(this.b) + Separators.RPAREN;
    }
}
