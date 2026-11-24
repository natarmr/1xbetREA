package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class stg0 implements ttg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f32771a;
    public final h8k0 b;

    public stg0(float f, h8k0 h8k0Var) {
        this.f32771a = f;
        this.b = h8k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stg0)) {
            return false;
        }
        stg0 stg0Var = (stg0) obj;
        return Float.compare(this.f32771a, stg0Var.f32771a) == 0 && this.b == stg0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.f32771a) * 31);
    }

    public final String toString() {
        return "OnValueChange(value=" + this.f32771a + ", sliderType=" + this.b + Separators.RPAREN;
    }
}
