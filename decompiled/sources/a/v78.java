package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v78 extends ay3 {
    public final double p;
    public final String q;

    public v78(String str, double d) {
        str.getClass();
        this.p = d;
        this.q = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v78)) {
            return false;
        }
        v78 v78Var = (v78) obj;
        return Double.compare(this.p, v78Var.p) == 0 && Intrinsics.d(this.q, v78Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + (Double.hashCode(this.p) * 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("TooHighBet(maxBet=", this.p, ", currencySymbol=", this.q);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
