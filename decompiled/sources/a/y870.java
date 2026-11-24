package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42183a;
    public final ql5 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public y870(boolean z, ql5 ql5Var, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f42183a = z;
        this.b = ql5Var;
        this.c = i;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y870)) {
            return false;
        }
        y870 y870Var = (y870) obj;
        return this.f42183a == y870Var.f42183a && this.b.equals(y870Var.b) && this.c == y870Var.c && this.d == y870Var.d && this.e == y870Var.e && this.f == y870Var.f && this.g == y870Var.g && this.h == y870Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.c, (this.b.hashCode() + (Boolean.hashCode(this.f42183a) * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesWebGameBalanceSelectorState(freezeAccount=");
        sb.append(this.f42183a);
        sb.append(", balanceModel=");
        sb.append(this.b);
        sb.append(", accountsCount=");
        brm0.w(this.c, ", gameStarted=", ", gameLoaded=", sb, this.d);
        ua80.u(", connected=", ", authorized=", sb, this.e, this.f);
        return ohs0.p(", balanceChangeFlowActive=", Separators.RPAREN, sb, this.g, this.h);
    }
}
