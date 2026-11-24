package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ye6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm5 f42473a;
    public final double b;
    public final ko7 c;
    public final boolean d;

    public ye6(xm5 xm5Var, double d, ko7 ko7Var, boolean z) {
        this.f42473a = xm5Var;
        this.b = d;
        this.c = ko7Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye6)) {
            return false;
        }
        ye6 ye6Var = (ye6) obj;
        return this.f42473a.equals(ye6Var.f42473a) && Double.compare(this.b, ye6Var.b) == 0 && this.c.equals(ye6Var.c) && this.d == ye6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + brm0.d(this.b, this.f42473a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "BetBalanceKeyModel(balanceState=" + this.f42473a + ", betSum=" + this.b + ", betTypeUiModel=" + this.c + ", forceLoading=" + this.d + Separators.RPAREN;
    }
}
