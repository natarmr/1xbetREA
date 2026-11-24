package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qi70 extends si70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxo f28777a;
    public final double b;
    public final String c;

    public qi70(gxo gxoVar, double d, String str) {
        gxoVar.getClass();
        str.getClass();
        this.f28777a = gxoVar;
        this.b = d;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi70)) {
            return false;
        }
        qi70 qi70Var = (qi70) obj;
        return this.f28777a == qi70Var.f28777a && Double.compare(this.b, qi70Var.b) == 0 && Intrinsics.d(this.c, qi70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.d(this.b, this.f28777a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetFastBetButtonValue(betType=");
        sb.append(this.f28777a);
        sb.append(", value=");
        sb.append(this.b);
        return rw2.o(sb, ", currencySymbol=", this.c, Separators.RPAREN);
    }
}
