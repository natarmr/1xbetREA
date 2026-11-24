package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f4375a;
    public final String b;

    public cht(String str, double d) {
        str.getClass();
        this.f4375a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cht)) {
            return false;
        }
        cht chtVar = (cht) obj;
        return Double.compare(this.f4375a, chtVar.f4375a) == 0 && Intrinsics.d(this.b, chtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f4375a) * 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("GenerateCouponInitialStateModel(minFactor=", this.f4375a, ", currencySymbol=", this.b);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
