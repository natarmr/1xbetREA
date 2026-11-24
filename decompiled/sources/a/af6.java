package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class af6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an5 f763a;
    public final fo7 b;
    public final boolean c;
    public final boolean d;

    public af6(an5 an5Var, fo7 fo7Var, boolean z, boolean z2) {
        this.f763a = an5Var;
        this.b = fo7Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af6)) {
            return false;
        }
        af6 af6Var = (af6) obj;
        return this.f763a.equals(af6Var.f763a) && this.b.equals(af6Var.b) && this.c == af6Var.c && this.d == af6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f763a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetBalanceKeyModel(balanceState=");
        sb.append(this.f763a);
        sb.append(", betTypeStateModel=");
        sb.append(this.b);
        sb.append(", isBetSumGreaterThanBalance=");
        return ohs0.p(", forceLoading=", Separators.RPAREN, sb, this.c, this.d);
    }
}
