package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y8w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8w0 f42215a;
    public final u8w0 b;
    public final u8w0 c;
    public final float d;
    public final float e;
    public final float f;

    public y8w0(u8w0 u8w0Var, u8w0 u8w0Var2, u8w0 u8w0Var3, float f, float f2, float f3) {
        u8w0Var2.getClass();
        this.f42215a = u8w0Var;
        this.b = u8w0Var2;
        this.c = u8w0Var3;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8w0)) {
            return false;
        }
        y8w0 y8w0Var = (y8w0) obj;
        return this.f42215a.equals(y8w0Var.f42215a) && Intrinsics.d(this.b, y8w0Var.b) && this.c.equals(y8w0Var.c) && Float.compare(this.d, y8w0Var.d) == 0 && Float.compare(this.e, y8w0Var.e) == 0 && Float.compare(this.f, y8w0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + defpackage.c.a(defpackage.c.a((this.c.hashCode() + ((this.b.hashCode() + (this.f42215a.hashCode() * 31)) * 31)) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        return "SensorFingerprint(accelerometer=" + this.f42215a + ", gyroscope=" + this.b + ", magnetometer=" + this.c + ", azimuth=" + this.d + ", pitch=" + this.e + ", roll=" + this.f + ')';
    }
}
