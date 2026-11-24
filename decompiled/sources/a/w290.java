package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w290 extends z290 {
    public final float c;
    public final float d;

    public w290(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w290)) {
            return false;
        }
        w290 w290Var = (w290) obj;
        return Float.compare(this.c, w290Var.c) == 0 && Float.compare(this.d, w290Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return rw2.i(this.c, this.d, "RelativeReflectiveQuadTo(dx=", ", dy=", Separators.RPAREN);
    }
}
