package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43953a;
    public final bm5 b;
    public final boolean c;
    public final boolean d;
    public final ql5 e;
    public final boolean f;

    public z870(int i, bm5 bm5Var, boolean z, boolean z2, ql5 ql5Var, boolean z3) {
        this.f43953a = i;
        this.b = bm5Var;
        this.c = z;
        this.d = z2;
        this.e = ql5Var;
        this.f = z3;
    }

    public static z870 a(z870 z870Var, int i, bm5 bm5Var, boolean z, boolean z2, ql5 ql5Var, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            i = z870Var.f43953a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            bm5Var = z870Var.b;
        }
        bm5 bm5Var2 = bm5Var;
        if ((i2 & 4) != 0) {
            z = z870Var.c;
        }
        boolean z4 = z;
        if ((i2 & 8) != 0) {
            z2 = z870Var.d;
        }
        boolean z5 = z2;
        if ((i2 & 16) != 0) {
            ql5Var = z870Var.e;
        }
        ql5 ql5Var2 = ql5Var;
        if ((i2 & 32) != 0) {
            z3 = z870Var.f;
        }
        bm5Var2.getClass();
        ql5Var2.getClass();
        return new z870(i3, bm5Var2, z4, z5, ql5Var2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z870)) {
            return false;
        }
        z870 z870Var = (z870) obj;
        return this.f43953a == z870Var.f43953a && this.b == z870Var.b && this.c == z870Var.c && this.d == z870Var.d && this.e.equals(z870Var.e) && this.f == z870Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + brm0.e(brm0.e((this.b.hashCode() + (Integer.hashCode(this.f43953a) * 31)) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesWebGameBalanceState(accountsCount=");
        sb.append(this.f43953a);
        sb.append(", balanceScreenType=");
        sb.append(this.b);
        sb.append(", bonusAccountsAllowed=");
        ua80.u(", freezeAccount=", ", balanceModel=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", balanceChangeFlowActive=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
