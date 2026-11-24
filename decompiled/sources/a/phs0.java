package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class phs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f27012a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public phs0(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f27012a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            jf4.o("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            jf4.o("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            jf4.o("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            jf4.o("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            jf4.o("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            jf4.o("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phs0)) {
            return false;
        }
        phs0 phs0Var = (phs0) obj;
        return Double.compare(this.f27012a, phs0Var.f27012a) == 0 && Double.compare(this.b, phs0Var.b) == 0 && Double.compare(this.c, phs0Var.c) == 0 && Double.compare(this.d, phs0Var.d) == 0 && Double.compare(this.e, phs0Var.e) == 0 && Double.compare(this.f, phs0Var.f) == 0 && Double.compare(this.g, phs0Var.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + brm0.d(this.f, brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f27012a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f27012a, "TransferParameters(gamma=", ", a=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", b=", ", c=");
        sbP.append(this.d);
        ohs0.A(sbP, this.e, ", d=", ", e=");
        sbP.append(this.f);
        return brm0.m(sbP, this.g, ", f=", Separators.RPAREN);
    }

    public /* synthetic */ phs0(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
