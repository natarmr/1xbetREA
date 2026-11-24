package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p290 extends z290 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public p290(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p290)) {
            return false;
        }
        p290 p290Var = (p290) obj;
        return Float.compare(this.c, p290Var.c) == 0 && Float.compare(this.d, p290Var.d) == 0 && Float.compare(this.e, p290Var.e) == 0 && this.f == p290Var.f && this.g == p290Var.g && Float.compare(this.h, p290Var.h) == 0 && Float.compare(this.i, p290Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + defpackage.c.a(brm0.e(brm0.e(defpackage.c.a(defpackage.c.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), 31, this.f), 31, this.g), this.h, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.c, this.d, "RelativeArcTo(horizontalEllipseRadius=", ", verticalEllipseRadius=", ", theta=");
        sbS.append(this.e);
        sbS.append(", isMoreThanHalf=");
        sbS.append(this.f);
        sbS.append(", isPositiveArc=");
        sbS.append(this.g);
        sbS.append(", arcStartDx=");
        sbS.append(this.h);
        sbS.append(", arcStartDy=");
        return kng0.o(sbS, this.i, Separators.RPAREN);
    }
}
