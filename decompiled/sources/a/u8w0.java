package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class u8w0 {
    public static final s8w0 Companion = new s8w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35253a;
    public final String b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;

    public u8w0(int i, String str, String str2, int i2, float f, float f2, float f3) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, r8w0.b);
            throw null;
        }
        this.f35253a = str;
        this.b = str2;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = new float[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!u8w0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        u8w0 u8w0Var = (u8w0) obj;
        return this.c == u8w0Var.c && this.d == u8w0Var.d && this.e == u8w0Var.e && this.f == u8w0Var.f && Intrinsics.d(this.f35253a, u8w0Var.f35253a) && Intrinsics.d(this.b, u8w0Var.b) && Arrays.equals(this.g, u8w0Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.g) + ua80.b(ua80.b(defpackage.c.a(defpackage.c.a(defpackage.c.a(this.c * 31, this.d, 31), this.e, 31), this.f, 31), 31, this.f35253a), 31, this.b);
    }

    public final String toString() {
        return "SensorData(name=" + this.f35253a + ", vendor=" + this.b + ", version=" + this.c + ", power=" + this.d + ", maxRange=" + this.e + ", resolution=" + this.f + ", values=" + Arrays.toString(this.g) + ')';
    }

    public u8w0(String str, String str2, int i, float f, float f2, float f3, float[] fArr) {
        this.f35253a = str;
        this.b = str2;
        this.c = i;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = fArr;
    }
}
