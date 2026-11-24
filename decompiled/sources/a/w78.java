package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w78 extends ay3 {
    public final double p;
    public final String q;

    public w78(String str, double d) {
        str.getClass();
        this.p = d;
        this.q = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w78)) {
            return false;
        }
        w78 w78Var = (w78) obj;
        return Double.compare(this.p, w78Var.p) == 0 && Intrinsics.d(this.q, w78Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + (Double.hashCode(this.p) * 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("TooLowBet(minBet=", this.p, ", currencySymbol=", this.q);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
