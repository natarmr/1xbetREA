package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class df6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm5 f5983a;
    public final ko7 b;
    public final boolean c;
    public final boolean d;

    public df6(xm5 xm5Var, ko7 ko7Var, boolean z, boolean z2) {
        this.f5983a = xm5Var;
        this.b = ko7Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df6)) {
            return false;
        }
        df6 df6Var = (df6) obj;
        return this.f5983a.equals(df6Var.f5983a) && this.b.equals(df6Var.b) && this.c == df6Var.c && this.d == df6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f5983a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetBalanceKeyModel(balanceState=");
        sb.append(this.f5983a);
        sb.append(", betTypeUiModel=");
        sb.append(this.b);
        sb.append(", isBetSumGreaterThanBalance=");
        return ohs0.p(", forceLoading=", Separators.RPAREN, sb, this.c, this.d);
    }
}
