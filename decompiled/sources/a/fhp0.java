package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fhp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9554a;
    public final int b;

    public fhp0(int i, int i2) {
        this.f9554a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhp0)) {
            return false;
        }
        fhp0 fhp0Var = (fhp0) obj;
        return this.f9554a == fhp0Var.f9554a && this.b == fhp0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f9554a) * 31);
    }

    public final String toString() {
        return ohs0.m("TeamRatingChartPointStateModel(year=", this.f9554a, ", position=", Separators.RPAREN, this.b);
    }
}
