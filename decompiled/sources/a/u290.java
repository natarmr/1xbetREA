package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u290 extends z290 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public u290(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u290)) {
            return false;
        }
        u290 u290Var = (u290) obj;
        return Float.compare(this.c, u290Var.c) == 0 && Float.compare(this.d, u290Var.d) == 0 && Float.compare(this.e, u290Var.e) == 0 && Float.compare(this.f, u290Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.c, this.d, "RelativeQuadTo(dx1=", ", dy1=", ", dx2=");
        sbS.append(this.e);
        sbS.append(", dy2=");
        sbS.append(this.f);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
