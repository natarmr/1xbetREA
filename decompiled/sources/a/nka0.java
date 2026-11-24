package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nka0 extends w8b {
    public final String d;
    public final int e;
    public final int f;

    public nka0(String str, int i, int i2) {
        super(new h9b(str), Integer.valueOf(i2), Integer.valueOf(i), 6);
        this.d = str;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nka0)) {
            return false;
        }
        nka0 nka0Var = (nka0) obj;
        return this.d.equals(nka0Var.d) && this.e == nka0Var.e && this.f == nka0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, this.d.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.f, Separators.RPAREN, kng0.p(this.e, "DigitsCell(value=", this.d, ", minWidthCell=", ", maxWidthCell="));
    }
}
