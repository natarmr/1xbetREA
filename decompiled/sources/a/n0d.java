package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f22694a;
    public final double b;

    public n0d(double d, double d2) {
        this.f22694a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0d)) {
            return false;
        }
        n0d n0dVar = (n0d) obj;
        return Double.compare(this.f22694a, n0dVar.f22694a) == 0 && Double.compare(this.b, n0dVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.f22694a) * 31);
    }

    public final String toString() {
        return axq.l(brm0.p(this.f22694a, "CoefficientUiModel(coef=", ", price="), this.b, Separators.RPAREN);
    }
}
