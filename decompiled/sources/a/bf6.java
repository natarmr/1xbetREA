package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bf6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an5 f2487a;
    public final double b;
    public final fo7 c;
    public final boolean d;

    public bf6(an5 an5Var, double d, fo7 fo7Var, boolean z) {
        this.f2487a = an5Var;
        this.b = d;
        this.c = fo7Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf6)) {
            return false;
        }
        bf6 bf6Var = (bf6) obj;
        return this.f2487a.equals(bf6Var.f2487a) && Double.compare(this.b, bf6Var.b) == 0 && this.c.equals(bf6Var.c) && this.d == bf6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + brm0.d(this.b, this.f2487a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "BetBalanceKeyModel(balanceState=" + this.f2487a + ", betSum=" + this.b + ", betTypeStateModel=" + this.c + ", forceLoading=" + this.d + Separators.RPAREN;
    }
}
