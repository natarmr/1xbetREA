package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class hcg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12823a;
    public final float b;
    public final float c;
    public final float d;

    public hcg0(float f, float f2, float f3, float f4) {
        this.f12823a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcg0)) {
            return false;
        }
        hcg0 hcg0Var = (hcg0) obj;
        return this.f12823a == hcg0Var.f12823a && this.b == hcg0Var.b && this.c == hcg0Var.c && this.d == hcg0Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f12823a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f12823a, this.b, "RippleAlpha(draggedAlpha=", ", focusedAlpha=", ", hoveredAlpha=");
        sbS.append(this.c);
        sbS.append(", pressedAlpha=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
