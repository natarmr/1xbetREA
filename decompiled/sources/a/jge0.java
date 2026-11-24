package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class jge0 {
    public static final jge0 e = new jge0(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16474a;
    public final float b;
    public final float c;
    public final float d;

    public jge0(float f, float f2, float f3, float f4) {
        this.f16474a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static jge0 b(jge0 jge0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = jge0Var.f16474a;
        }
        float f3 = (i & 2) != 0 ? jge0Var.b : Float.NEGATIVE_INFINITY;
        if ((i & 4) != 0) {
            f2 = jge0Var.c;
        }
        return new jge0(f, f3, f2, (i & 8) != 0 ? jge0Var.d : Float.POSITIVE_INFINITY);
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f16474a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long c() {
        return (((long) Float.floatToRawIntBits(this.f16474a)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.c)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final long e() {
        float f = this.c;
        float f2 = this.f16474a;
        float fZ = rw2.z(f, f2, 2.0f, f2);
        float f3 = this.b;
        float fZ2 = rw2.z(this.d, f3, 2.0f, f3);
        return (((long) Float.floatToRawIntBits(fZ)) << 32) | (((long) Float.floatToRawIntBits(fZ2)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jge0)) {
            return false;
        }
        jge0 jge0Var = (jge0) obj;
        return Float.compare(this.f16474a, jge0Var.f16474a) == 0 && Float.compare(this.b, jge0Var.b) == 0 && Float.compare(this.c, jge0Var.c) == 0 && Float.compare(this.d, jge0Var.d) == 0;
    }

    public final long f() {
        float f = this.c - this.f16474a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long g() {
        return (((long) Float.floatToRawIntBits(this.f16474a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final long h() {
        return (((long) Float.floatToRawIntBits(this.c)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f16474a) * 31, this.b, 31), this.c, 31);
    }

    public final jge0 i(jge0 jge0Var) {
        return new jge0(Math.max(this.f16474a, jge0Var.f16474a), Math.max(this.b, jge0Var.b), Math.min(this.c, jge0Var.c), Math.min(this.d, jge0Var.d));
    }

    public final boolean j() {
        return (this.f16474a >= this.c) | (this.b >= this.d);
    }

    public final boolean k(jge0 jge0Var) {
        return (this.f16474a < jge0Var.c) & (jge0Var.f16474a < this.c) & (this.b < jge0Var.d) & (jge0Var.b < this.d);
    }

    public final jge0 l(float f, float f2) {
        return new jge0(this.f16474a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final jge0 m(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new jge0(Float.intBitsToFloat(i) + this.f16474a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String strR = plc.R(this.f16474a);
        String strR2 = plc.R(this.b);
        return ua80.m(b1j.n("Rect.fromLTRB(", strR, ", ", strR2, ", "), plc.R(this.c), ", ", plc.R(this.d), Separators.RPAREN);
    }
}
