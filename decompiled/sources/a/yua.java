package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yua extends v8b {
    public final String d;
    public final int e;

    public yua(String str, int i) {
        super(30, null, null, q3d.j(new g9b(i), new h9b(str)));
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yua)) {
            return false;
        }
        yua yuaVar = (yua) obj;
        return this.d.equals(yuaVar.d) && this.e == yuaVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.e, "Title(title=", this.d, ", padding=", Separators.RPAREN);
    }
}
