package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qzr0 extends w8b {
    public final String d;
    public final int e;

    public qzr0(int i) {
        super(new h9b(""), null, null, 26);
        this.d = "";
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzr0)) {
            return false;
        }
        qzr0 qzr0Var = (qzr0) obj;
        return this.d.equals(qzr0Var.d) && this.e == qzr0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.e, "Footer(title=", this.d, ", height=", Separators.RPAREN);
    }
}
