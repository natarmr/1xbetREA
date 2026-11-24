package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i290 extends z290 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public i290(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof i290)) {
            return false;
        }
        i290 i290Var = (i290) obj;
        return Float.compare(this.c, i290Var.c) == 0 && Float.compare(this.d, i290Var.d) == 0 && Float.compare(this.e, i290Var.e) == 0 && Float.compare(this.f, i290Var.f) == 0 && Float.compare(this.g, i290Var.g) == 0 && Float.compare(this.h, i290Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.c, this.d, "CurveTo(x1=", ", y1=", ", x2=");
        vqd.v(sbS, this.e, ", y2=", this.f, ", x3=");
        sbS.append(this.g);
        sbS.append(", y3=");
        sbS.append(this.h);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
