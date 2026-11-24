package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class iur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15410a;
    public final String b;
    public final j43 c;
    public final double d;
    public final double e;
    public final double f;

    public iur(String str, String str2, j43 j43Var, double d, double d2, double d3) {
        str.getClass();
        str2.getClass();
        this.f15410a = str;
        this.b = str2;
        this.c = j43Var;
        this.d = d;
        this.e = d2;
        this.f = d3;
    }

    public static iur a(iur iurVar, j43 j43Var, double d, double d2, double d3, int i) {
        String str = iurVar.f15410a;
        String str2 = iurVar.b;
        if ((i & 8) != 0) {
            d = iurVar.d;
        }
        double d4 = d;
        if ((i & 16) != 0) {
            d2 = iurVar.e;
        }
        double d5 = d2;
        double d6 = (i & 32) != 0 ? iurVar.f : d3;
        str.getClass();
        str2.getClass();
        return new iur(str, str2, j43Var, d4, d5, d6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iur)) {
            return false;
        }
        iur iurVar = (iur) obj;
        return Intrinsics.d(this.f15410a, iurVar.f15410a) && Intrinsics.d(this.b, iurVar.b) && this.c.equals(iurVar.c) && Double.compare(this.d, iurVar.d) == 0 && Double.compare(this.e, iurVar.e) == 0 && Double.compare(this.f, iurVar.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + brm0.d(this.e, brm0.d(this.d, (this.c.hashCode() + ua80.b(this.f15410a.hashCode() * 31, 31, this.b)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GameCardStateModel(marketTitle=", this.f15410a, ", levelTitle=", this.b, ", animatedCoefficientModel=");
        sbN.append(this.c);
        sbN.append(", price=");
        sbN.append(this.d);
        ohs0.A(sbN, this.e, ", curCoefDec=", ", oldCoefDec=");
        return axq.l(sbN, this.f, Separators.RPAREN);
    }
}
