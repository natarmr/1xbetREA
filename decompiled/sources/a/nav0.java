package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class nav0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23211a;
    public final float b;

    public nav0(float f, float f2) {
        this.f23211a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.f23211a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nav0)) {
            return false;
        }
        nav0 nav0Var = (nav0) obj;
        return Float.compare(this.f23211a, nav0Var.f23211a) == 0 && Float.compare(this.b, nav0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f23211a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f23211a, this.b, "WhitePoint(x=", ", y=", Separators.RPAREN);
    }
}
