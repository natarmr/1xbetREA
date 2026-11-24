package a;

/* JADX INFO: loaded from: classes.dex */
public final class jv40 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17190a;
    public final float b;

    public jv40(float f, float f2) {
        x0x.z("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.f17190a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jv40.class == obj.getClass()) {
            jv40 jv40Var = (jv40) obj;
            if (this.f17190a == jv40Var.f17190a && this.b == jv40Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + defpackage.c.a(527, this.f17190a, 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f17190a + ", longitude=" + this.b;
    }
}
