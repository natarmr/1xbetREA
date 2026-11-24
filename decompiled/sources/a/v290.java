package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v290 extends z290 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public v290(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v290)) {
            return false;
        }
        v290 v290Var = (v290) obj;
        return Float.compare(this.c, v290Var.c) == 0 && Float.compare(this.d, v290Var.d) == 0 && Float.compare(this.e, v290Var.e) == 0 && Float.compare(this.f, v290Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.c, this.d, "RelativeReflectiveCurveTo(dx1=", ", dy1=", ", dx2=");
        sbS.append(this.e);
        sbS.append(", dy2=");
        sbS.append(this.f);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
