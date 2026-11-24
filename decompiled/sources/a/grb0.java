package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class grb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final erb0 f11771a;
    public final cit0 b;

    public grb0(erb0 erb0Var, cit0 cit0Var) {
        this.f11771a = erb0Var;
        this.b = cit0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grb0)) {
            return false;
        }
        grb0 grb0Var = (grb0) obj;
        return this.f11771a.equals(grb0Var.f11771a) && this.b.equals(grb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11771a.hashCode() * 31);
    }

    public final String toString() {
        return "PowerbetModel(powerbetMarketModel=" + this.f11771a + ", updateCouponModel=" + this.b + Separators.RPAREN;
    }
}
