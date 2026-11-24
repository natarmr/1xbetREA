package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class er1 extends lr1 {
    public final long c;
    public final boolean d;

    public er1(boolean z, long j) {
        super(mr1.c, new zl1(z, j));
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er1)) {
            return false;
        }
        er1 er1Var = (er1) obj;
        return this.c == er1Var.c && this.d == er1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.c, "Brands(brandId=", ", fromDeeplink=", this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
