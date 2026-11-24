package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tzb0 extends az5 {
    public final int c;
    public final String d;

    public tzb0(int i, String str) {
        super(i, str);
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzb0)) {
            return false;
        }
        tzb0 tzb0Var = (tzb0) obj;
        return this.c == tzb0Var.c && this.d.equals(tzb0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.c, "ProductResult(productId=", ", name=", this.d, Separators.RPAREN);
    }
}
