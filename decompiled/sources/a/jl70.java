package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jl70 extends ll70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxo f16702a;
    public final double b;
    public final String c;

    public jl70(gxo gxoVar, double d, String str) {
        gxoVar.getClass();
        str.getClass();
        this.f16702a = gxoVar;
        this.b = d;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl70)) {
            return false;
        }
        jl70 jl70Var = (jl70) obj;
        return this.f16702a == jl70Var.f16702a && Double.compare(this.b, jl70Var.b) == 0 && Intrinsics.d(this.c, jl70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.d(this.b, this.f16702a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetFastBetButtonValue(betType=");
        sb.append(this.f16702a);
        sb.append(", value=");
        sb.append(this.b);
        return rw2.o(sb, ", currencySymbol=", this.c, Separators.RPAREN);
    }
}
