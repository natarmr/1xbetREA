package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k290 extends z290 {
    public final float c;
    public final float d;

    public k290(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k290)) {
            return false;
        }
        k290 k290Var = (k290) obj;
        return Float.compare(this.c, k290Var.c) == 0 && Float.compare(this.d, k290Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return rw2.i(this.c, this.d, "LineTo(x=", ", y=", Separators.RPAREN);
    }
}
