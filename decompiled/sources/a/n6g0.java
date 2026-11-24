package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n6g0 extends w8b {
    public final int d;
    public final int e;

    public n6g0(int i, int i2) {
        super(new h9b(""), Integer.valueOf(i2), Integer.valueOf(i), 6);
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6g0)) {
            return false;
        }
        n6g0 n6g0Var = (n6g0) obj;
        return this.d == n6g0Var.d && this.e == n6g0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
    }

    public final String toString() {
        return ohs0.m("CornerCell(minWidthCell=", this.d, ", maxWidthCell=", Separators.RPAREN, this.e);
    }
}
