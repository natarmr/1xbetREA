package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ze6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm5 f44237a;
    public final double b;
    public final ko7 c;
    public final boolean d;

    public ze6(xm5 xm5Var, double d, ko7 ko7Var, boolean z) {
        this.f44237a = xm5Var;
        this.b = d;
        this.c = ko7Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze6)) {
            return false;
        }
        ze6 ze6Var = (ze6) obj;
        return this.f44237a.equals(ze6Var.f44237a) && Double.compare(this.b, ze6Var.b) == 0 && this.c.equals(ze6Var.c) && this.d == ze6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + brm0.d(this.b, this.f44237a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "BetBalanceKeyModel(balanceState=" + this.f44237a + ", betSum=" + this.b + ", betTypeUiModel=" + this.c + ", forceLoading=" + this.d + Separators.RPAREN;
    }
}
