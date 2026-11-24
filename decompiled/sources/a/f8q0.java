package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class f8q0 {
    public static final f8q0 c = new f8q0(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9121a;
    public final float b;

    public f8q0(float f, float f2) {
        this.f9121a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8q0)) {
            return false;
        }
        f8q0 f8q0Var = (f8q0) obj;
        return this.f9121a == f8q0Var.f9121a && this.b == f8q0Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f9121a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f9121a, this.b, "TextGeometricTransform(scaleX=", ", skewX=", Separators.RPAREN);
    }
}
