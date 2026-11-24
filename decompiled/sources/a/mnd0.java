package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mnd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22084a;
    public final double b;
    public final double c;
    public final double d;
    public final String e;
    public final boolean f;

    public mnd0(boolean z, double d, double d2, double d3, String str, boolean z2) {
        this.f22084a = z;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = str;
        this.f = z2;
    }

    public static mnd0 a(mnd0 mnd0Var, boolean z, double d, double d2, double d3, String str, int i) {
        if ((i & 1) != 0) {
            z = mnd0Var.f22084a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            d = mnd0Var.b;
        }
        double d4 = d;
        if ((i & 4) != 0) {
            d2 = mnd0Var.c;
        }
        double d5 = d2;
        double d6 = (i & 8) != 0 ? mnd0Var.d : d3;
        String str2 = (i & 16) != 0 ? mnd0Var.e : str;
        boolean z3 = mnd0Var.f;
        str2.getClass();
        return new mnd0(z2, d4, d5, d6, str2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnd0)) {
            return false;
        }
        mnd0 mnd0Var = (mnd0) obj;
        return this.f22084a == mnd0Var.f22084a && Double.compare(this.b, mnd0Var.b) == 0 && Double.compare(this.c, mnd0Var.c) == 0 && Double.compare(this.d, mnd0Var.d) == 0 && this.e.equals(mnd0Var.e) && this.f == mnd0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Boolean.hashCode(this.f22084a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickBetStateModel(isVisible=");
        sb.append(this.f22084a);
        sb.append(", firstBetValue=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", secondBetValue=", ", thirdBetValue=");
        hne.w(sb, this.d, ", currencySymbol=", this.e);
        return f140.n(sb, ", hasMaxValue=", this.f, Separators.RPAREN);
    }
}
