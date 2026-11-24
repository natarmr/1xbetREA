package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke f27268a;
    public final double b;
    public final boolean c;
    public final boolean d;

    public pn5(ke keVar, double d, boolean z, boolean z2) {
        this.f27268a = keVar;
        this.b = d;
        this.c = z;
        this.d = z2;
    }

    public static pn5 a(pn5 pn5Var, ke keVar, double d, boolean z, int i) {
        if ((i & 1) != 0) {
            keVar = pn5Var.f27268a;
        }
        ke keVar2 = keVar;
        if ((i & 2) != 0) {
            d = pn5Var.b;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            z = pn5Var.c;
        }
        boolean z2 = z;
        boolean z3 = (i & 8) != 0 ? pn5Var.d : false;
        pn5Var.getClass();
        return new pn5(keVar2, d2, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn5)) {
            return false;
        }
        pn5 pn5Var = (pn5) obj;
        return this.f27268a.equals(pn5Var.f27268a) && Double.compare(this.b, pn5Var.b) == 0 && this.c == pn5Var.c && this.d == pn5Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.d(this.b, this.f27268a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalanceUiStateModel(accountInfo=");
        sb.append(this.f27268a);
        sb.append(", balanceMoney=");
        sb.append(this.b);
        w6x.A(", isMultipleBalance=", ", isLoading=", sb, this.c, this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
