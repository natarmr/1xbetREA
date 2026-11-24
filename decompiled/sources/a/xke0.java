package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xke0 extends w8b {
    public final String d;
    public final int e;

    public xke0(String str, int i) {
        super(new h9b(str), Integer.valueOf(i), Integer.valueOf(i), 6);
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xke0)) {
            return false;
        }
        xke0 xke0Var = (xke0) obj;
        return this.d.equals(xke0Var.d) && this.e == xke0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.e, "RowHeaderCell(value=", this.d, ", fixedWidth=", Separators.RPAREN);
    }
}
