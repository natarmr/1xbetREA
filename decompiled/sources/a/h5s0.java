package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class h5s0 extends w8b {
    public final String d;
    public final String e;
    public final String f;

    public h5s0(String str, String str2, String str3) {
        super(new h9b(str3), null, null, 30);
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5s0)) {
            return false;
        }
        h5s0 h5s0Var = (h5s0) obj;
        return this.d.equals(h5s0Var.d) && this.e.equals(h5s0Var.e) && this.f.equals(h5s0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(this.d.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        return axq.n(b1j.n("Column(title=", this.d, ", subTitle=", this.e, ", text="), this.f, Separators.RPAREN);
    }
}
