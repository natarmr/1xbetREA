package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xua extends v8b {
    public final int d;
    public final int e;

    public xua(int i, int i2) {
        super(30, null, null, kotlin.collections.a.c(new f9b(i2)));
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xua)) {
            return false;
        }
        xua xuaVar = (xua) obj;
        return this.d == xuaVar.d && this.e == xuaVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
    }

    public final String toString() {
        return ohs0.m("Icon(icon=", this.d, ", width=", Separators.RPAREN, this.e);
    }
}
