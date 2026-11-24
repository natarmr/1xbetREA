package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d3t extends l3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5421a;
    public final double b;
    public final String c;

    public d3t(double d, double d2, String str) {
        str.getClass();
        this.f5421a = d;
        this.b = d2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3t)) {
            return false;
        }
        d3t d3tVar = (d3t) obj;
        return Double.compare(this.f5421a, d3tVar.f5421a) == 0 && Double.compare(this.b, d3tVar.b) == 0 && Intrinsics.d(this.c, d3tVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.d(this.b, Double.hashCode(this.f5421a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f5421a, "ChangeLimits(minBet=", ", maxBet=");
        hne.w(sbP, this.b, ", currency=", this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
