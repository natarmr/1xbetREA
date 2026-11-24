package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pi20 implements ri20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f27024a;
    public final int b;

    public pi20(double d, int i) {
        this.f27024a = d;
        this.b = i;
    }

    @Override // a.ri20
    public final double a() {
        return this.f27024a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi20)) {
            return false;
        }
        pi20 pi20Var = (pi20) obj;
        return Double.compare(this.f27024a, pi20Var.f27024a) == 0 && this.b == pi20Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Double.hashCode(this.f27024a) * 31);
    }

    public final String toString() {
        return "Empty(coefficient=" + this.f27024a + ", enCoefViewId=" + this.b + Separators.RPAREN;
    }
}
