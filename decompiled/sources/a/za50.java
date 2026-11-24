package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class za50 extends cb50 {
    public final int b;
    public final long c;
    public final long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za50(int i, int i2, long j, long j2) {
        super("HISTORY");
        i = (i2 & 1) != 0 ? 0 : i;
        j = (i2 & 2) != 0 ? 0L : j;
        j2 = (i2 & 4) != 0 ? 0L : j2;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za50)) {
            return false;
        }
        za50 za50Var = (za50) obj;
        return this.b == za50Var.b && this.c == za50Var.c && this.d == za50Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + rw2.b(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return rw2.n(vqd.q(this.b, this.c, "History(betHistoryTypeId=", ", balanceId="), this.d, ", betIdToOpen=", Separators.RPAREN);
    }
}
