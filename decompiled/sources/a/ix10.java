package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ix10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f15519a;
    public final long b;

    public ix10(iz30 iz30Var, long j) {
        this.f15519a = iz30Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix10)) {
            return false;
        }
        ix10 ix10Var = (ix10) obj;
        return this.f15519a == ix10Var.f15519a && this.b == ix10Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f15519a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuItemBalanceManagementModel(menuItem=" + this.f15519a + ", currencyId=" + this.b + Separators.RPAREN;
    }
}
