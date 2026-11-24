package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f198a;
    public final String b;

    public a40(String str, double d) {
        str.getClass();
        this.f198a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a40)) {
            return false;
        }
        a40 a40Var = (a40) obj;
        return Double.compare(this.f198a, a40Var.f198a) == 0 && Intrinsics.d(this.b, a40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f198a) * 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("AdvanceModel(advanceValue=", this.f198a, ", currencySymbol=", this.b);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
