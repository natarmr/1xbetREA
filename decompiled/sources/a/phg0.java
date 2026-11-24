package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class phg0 extends w8b {
    public final String d;
    public final int e;

    public phg0(String str, int i) {
        super(new h9b(str), Integer.valueOf(i), Integer.valueOf(i), 6);
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phg0)) {
            return false;
        }
        phg0 phg0Var = (phg0) obj;
        return this.d.equals(phg0Var.d) && this.e == phg0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.e, "RowHeaderNumberUiModel(number=", this.d, ", width=", Separators.RPAREN);
    }
}
