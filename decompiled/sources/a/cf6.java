package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cf6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an5 f4244a;
    public final double b;
    public final fo7 c;
    public final boolean d;

    public cf6(an5 an5Var, double d, fo7 fo7Var, boolean z) {
        this.f4244a = an5Var;
        this.b = d;
        this.c = fo7Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf6)) {
            return false;
        }
        cf6 cf6Var = (cf6) obj;
        return this.f4244a.equals(cf6Var.f4244a) && Double.compare(this.b, cf6Var.b) == 0 && this.c.equals(cf6Var.c) && this.d == cf6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + brm0.d(this.b, this.f4244a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "BetBalanceKeyModel(balanceState=" + this.f4244a + ", betSum=" + this.b + ", betTypeStateModel=" + this.c + ", forceLoading=" + this.d + Separators.RPAREN;
    }
}
