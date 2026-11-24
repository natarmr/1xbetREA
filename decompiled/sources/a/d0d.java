package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5262a;
    public final double b;

    public d0d(double d, double d2) {
        this.f5262a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0d)) {
            return false;
        }
        d0d d0dVar = (d0d) obj;
        return Double.compare(this.f5262a, d0dVar.f5262a) == 0 && Double.compare(this.b, d0dVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.f5262a) * 31);
    }

    public final String toString() {
        return axq.l(brm0.p(this.f5262a, "CoefficientModel(coefficient=", ", price="), this.b, Separators.RPAREN);
    }
}
