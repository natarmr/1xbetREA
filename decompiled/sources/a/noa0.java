package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class noa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f23859a;
    public final double b;

    public noa0(double d, double d2) {
        this.f23859a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noa0)) {
            return false;
        }
        noa0 noa0Var = (noa0) obj;
        return Double.compare(this.f23859a, noa0Var.f23859a) == 0 && Double.compare(this.b, noa0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.f23859a) * 31);
    }

    public final String toString() {
        return axq.l(brm0.p(this.f23859a, "PointModel(x=", ", y="), this.b, Separators.RPAREN);
    }
}
