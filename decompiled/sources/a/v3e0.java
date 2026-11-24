package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v3e0 extends w8b {
    public final String d;
    public final String e;
    public final String f;

    public v3e0(String str, String str2, String str3) {
        super(new h9b(str3), null, null, 30);
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3e0)) {
            return false;
        }
        v3e0 v3e0Var = (v3e0) obj;
        return this.d.equals(v3e0Var.d) && this.e.equals(v3e0Var.e) && this.f.equals(v3e0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(this.d.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        return axq.n(b1j.n("RatingColumnHeaderUiModel(title=", this.d, ", subTitle=", this.e, ", cellContent="), this.f, Separators.RPAREN);
    }
}
