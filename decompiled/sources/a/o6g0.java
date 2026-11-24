package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o6g0 extends v8b {
    public final String d;
    public final int e;

    public o6g0(String str, int i) {
        super(30, null, null, kotlin.collections.a.c(new f9b(i)));
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6g0)) {
            return false;
        }
        o6g0 o6g0Var = (o6g0) obj;
        return this.d.equals(o6g0Var.d) && this.e == o6g0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.e, "ImageColumnHeader(url=", this.d, ", iconWidth=", Separators.RPAREN);
    }
}
