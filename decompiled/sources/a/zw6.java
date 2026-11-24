package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zw6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f45091a;
    public final double b;
    public final double c;
    public final double d;

    public zw6(pz40 pz40Var, double d, double d2, double d3) {
        this.f45091a = pz40Var;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    public static zw6 a(zw6 zw6Var, pz40 pz40Var, double d, double d2, double d3, int i) {
        if ((i & 1) != 0) {
            pz40Var = zw6Var.f45091a;
        }
        pz40 pz40Var2 = pz40Var;
        if ((i & 2) != 0) {
            d = zw6Var.b;
        }
        double d4 = d;
        if ((i & 4) != 0) {
            d2 = zw6Var.c;
        }
        double d5 = d2;
        if ((i & 8) != 0) {
            d3 = zw6Var.d;
        }
        return new zw6(pz40Var2, d4, d5, d3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw6)) {
            return false;
        }
        zw6 zw6Var = (zw6) obj;
        return this.f45091a.equals(zw6Var.f45091a) && Double.compare(this.b, zw6Var.b) == 0 && Double.compare(this.c, zw6Var.c) == 0 && Double.compare(this.d, zw6Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + brm0.d(this.c, brm0.d(this.b, this.f45091a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetFieldState(fieldValueState=");
        sb.append(this.f45091a);
        sb.append(", currentValue=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", minValue=", ", maxValue=");
        return axq.l(sb, this.d, Separators.RPAREN);
    }
}
