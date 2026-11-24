package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nnd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23816a;
    public final double b;
    public final double c;
    public final double d;
    public final boolean e;
    public final boolean f;

    public nnd0(boolean z, double d, double d2, double d3, boolean z2, boolean z3) {
        this.f23816a = z;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = z2;
        this.f = z3;
    }

    public static nnd0 a(nnd0 nnd0Var, boolean z, double d, double d2, double d3, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = nnd0Var.f23816a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            d = nnd0Var.b;
        }
        double d4 = d;
        if ((i & 4) != 0) {
            d2 = nnd0Var.c;
        }
        return new nnd0(z3, d4, d2, (i & 8) != 0 ? nnd0Var.d : d3, (i & 16) != 0 ? nnd0Var.e : z2, nnd0Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnd0)) {
            return false;
        }
        nnd0 nnd0Var = (nnd0) obj;
        return this.f23816a == nnd0Var.f23816a && Double.compare(this.b, nnd0Var.b) == 0 && Double.compare(this.c, nnd0Var.c) == 0 && Double.compare(this.d, nnd0Var.d) == 0 && this.e == nnd0Var.e && this.f == nnd0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Boolean.hashCode(this.f23816a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickBetStateModel(isVisible=");
        sb.append(this.f23816a);
        sb.append(", firstBetValue=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", secondBetValue=", ", thirdBetValue=");
        rz4.x(sb, this.d, ", isEnabled=", this.e);
        return f140.n(sb, ", hasMaxValue=", this.f, Separators.RPAREN);
    }
}
