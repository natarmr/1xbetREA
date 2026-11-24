package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dpm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6476a;
    public final double b;
    public final double c;
    public final double d;
    public final String e;
    public final boolean f;

    public dpm0(double d, double d2, double d3, double d4, String str, boolean z) {
        str.getClass();
        this.f6476a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = str;
        this.f = z;
    }

    public static dpm0 a(dpm0 dpm0Var, double d, int i) {
        if ((i & 1) != 0) {
            d = dpm0Var.f6476a;
        }
        double d2 = d;
        double d3 = dpm0Var.b;
        double d4 = dpm0Var.c;
        double d5 = dpm0Var.d;
        String str = dpm0Var.e;
        boolean z = (i & 32) != 0 ? dpm0Var.f : true;
        str.getClass();
        return new dpm0(d2, d3, d4, d5, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpm0)) {
            return false;
        }
        dpm0 dpm0Var = (dpm0) obj;
        return Double.compare(this.f6476a, dpm0Var.f6476a) == 0 && Double.compare(this.b, dpm0Var.b) == 0 && Double.compare(this.c, dpm0Var.c) == 0 && Double.compare(this.d, dpm0Var.d) == 0 && Intrinsics.d(this.e, dpm0Var.e) && this.f == dpm0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f6476a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f6476a, "StepInputState(currentValue=", ", stepValue=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", minValue=", ", maxValue=");
        hne.w(sbP, this.d, ", currencySymbol=", this.e);
        return f140.n(sbP, ", isLoading=", this.f, Separators.RPAREN);
    }
}
