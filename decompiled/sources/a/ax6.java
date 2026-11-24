package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ax6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f1608a;
    public final double b;
    public final double c;
    public final double d;

    public ax6(pz40 pz40Var, double d, double d2, double d3) {
        this.f1608a = pz40Var;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    public static ax6 a(ax6 ax6Var, pz40 pz40Var, double d, double d2, double d3, int i) {
        if ((i & 1) != 0) {
            pz40Var = ax6Var.f1608a;
        }
        pz40 pz40Var2 = pz40Var;
        if ((i & 2) != 0) {
            d = ax6Var.b;
        }
        double d4 = d;
        if ((i & 4) != 0) {
            d2 = ax6Var.c;
        }
        double d5 = d2;
        if ((i & 8) != 0) {
            d3 = ax6Var.d;
        }
        return new ax6(pz40Var2, d4, d5, d3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax6)) {
            return false;
        }
        ax6 ax6Var = (ax6) obj;
        return this.f1608a.equals(ax6Var.f1608a) && Double.compare(this.b, ax6Var.b) == 0 && Double.compare(this.c, ax6Var.c) == 0 && Double.compare(this.d, ax6Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + brm0.d(this.c, brm0.d(this.b, this.f1608a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetFieldState(fieldValueState=");
        sb.append(this.f1608a);
        sb.append(", currentValue=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", minValue=", ", maxValue=");
        return axq.l(sb, this.d, Separators.RPAREN);
    }
}
