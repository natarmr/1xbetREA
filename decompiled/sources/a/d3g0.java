package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public class d3g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5402a;
    public final float b;

    public d3g0(float f, float f2) {
        this.f5402a = f;
        this.b = f2;
    }

    public static float a(d3g0 d3g0Var, d3g0 d3g0Var2) {
        return q7x.v(d3g0Var.f5402a, d3g0Var.b, d3g0Var2.f5402a, d3g0Var2.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d3g0) {
            d3g0 d3g0Var = (d3g0) obj;
            if (this.f5402a == d3g0Var.f5402a && this.b == d3g0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.f5402a) * 31);
    }

    public final String toString() {
        return Separators.LPAREN + this.f5402a + ',' + this.b + ')';
    }
}
