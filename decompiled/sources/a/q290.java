package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q290 extends z290 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public q290(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q290)) {
            return false;
        }
        q290 q290Var = (q290) obj;
        return Float.compare(this.c, q290Var.c) == 0 && Float.compare(this.d, q290Var.d) == 0 && Float.compare(this.e, q290Var.e) == 0 && Float.compare(this.f, q290Var.f) == 0 && Float.compare(this.g, q290Var.g) == 0 && Float.compare(this.h, q290Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.c, this.d, "RelativeCurveTo(dx1=", ", dy1=", ", dx2=");
        vqd.v(sbS, this.e, ", dy2=", this.f, ", dx3=");
        sbS.append(this.g);
        sbS.append(", dy3=");
        sbS.append(this.h);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
