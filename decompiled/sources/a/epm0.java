package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class epm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f8196a;
    public final double b;
    public final double c;
    public final double d;
    public final String e;
    public final boolean f;

    public epm0(double d, double d2, double d3, double d4, String str, boolean z) {
        str.getClass();
        this.f8196a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = str;
        this.f = z;
    }

    public static epm0 a(epm0 epm0Var, double d, int i) {
        if ((i & 1) != 0) {
            d = epm0Var.f8196a;
        }
        double d2 = d;
        double d3 = epm0Var.b;
        double d4 = epm0Var.c;
        double d5 = epm0Var.d;
        String str = epm0Var.e;
        boolean z = (i & 32) != 0 ? epm0Var.f : true;
        str.getClass();
        return new epm0(d2, d3, d4, d5, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epm0)) {
            return false;
        }
        epm0 epm0Var = (epm0) obj;
        return Double.compare(this.f8196a, epm0Var.f8196a) == 0 && Double.compare(this.b, epm0Var.b) == 0 && Double.compare(this.c, epm0Var.c) == 0 && Double.compare(this.d, epm0Var.d) == 0 && Intrinsics.d(this.e, epm0Var.e) && this.f == epm0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f8196a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f8196a, "StepInputState(currentValue=", ", stepValue=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", minValue=", ", maxValue=");
        hne.w(sbP, this.d, ", currencySymbol=", this.e);
        return f140.n(sbP, ", isLoading=", this.f, Separators.RPAREN);
    }
}
