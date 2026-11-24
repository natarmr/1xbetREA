package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s78 extends ay3 {
    public final double p;
    public final double q;
    public final String r;

    public s78(double d, double d2, String str) {
        str.getClass();
        this.p = d;
        this.q = d2;
        this.r = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s78)) {
            return false;
        }
        s78 s78Var = (s78) obj;
        return Double.compare(this.p, s78Var.p) == 0 && Double.compare(this.q, s78Var.q) == 0 && Intrinsics.d(this.r, s78Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + brm0.d(this.q, Double.hashCode(this.p) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.p, "CorrectForMultiSingle(minBet=", ", maxBet=");
        hne.w(sbP, this.q, ", currencySymbol=", this.r);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
