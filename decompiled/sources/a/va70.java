package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class va70 implements wb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm5 f37072a;
    public final boolean b;

    public va70(bm5 bm5Var, boolean z) {
        this.f37072a = bm5Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va70)) {
            return false;
        }
        va70 va70Var = (va70) obj;
        return this.f37072a == va70Var.f37072a && this.b == va70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f37072a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowBalanceSelector(balanceScreenType=" + this.f37072a + ", bonusAccountsAllowed=" + this.b + Separators.RPAREN;
    }
}
