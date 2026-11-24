package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ieq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uk10 f14647a;
    public final String b;
    public final double c;
    public final String d;
    public final boolean e;
    public final double f;
    public final boolean g;

    public ieq0(uk10 uk10Var, String str, double d, String str2, boolean z, double d2, boolean z2) {
        uk10Var.getClass();
        this.f14647a = uk10Var;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = z;
        this.f = d2;
        this.g = z2;
    }

    public static ieq0 a(ieq0 ieq0Var, uk10 uk10Var, String str, double d, String str2, boolean z, double d2, boolean z2, int i) {
        if ((i & 1) != 0) {
            uk10Var = ieq0Var.f14647a;
        }
        uk10 uk10Var2 = uk10Var;
        if ((i & 2) != 0) {
            str = ieq0Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            d = ieq0Var.c;
        }
        double d3 = d;
        if ((i & 8) != 0) {
            str2 = ieq0Var.d;
        }
        String str4 = str2;
        boolean z3 = (i & 16) != 0 ? ieq0Var.e : z;
        double d4 = (i & 32) != 0 ? ieq0Var.f : d2;
        boolean z4 = (i & 64) != 0 ? ieq0Var.g : z2;
        ieq0Var.getClass();
        uk10Var2.getClass();
        str3.getClass();
        str4.getClass();
        return new ieq0(uk10Var2, str3, d3, str4, z3, d4, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieq0)) {
            return false;
        }
        ieq0 ieq0Var = (ieq0) obj;
        return this.f14647a == ieq0Var.f14647a && this.b.equals(ieq0Var.b) && Double.compare(this.c, ieq0Var.c) == 0 && this.d.equals(ieq0Var.d) && this.e == ieq0Var.e && Double.compare(this.f, ieq0Var.f) == 0 && this.g == ieq0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.d(this.f, brm0.e(ua80.b(brm0.d(this.c, ua80.b(this.f14647a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewState(bonus=");
        sb.append(this.f14647a);
        sb.append(", bonusDescription=");
        sb.append(this.b);
        sb.append(", winAmount=");
        hne.w(sb, this.c, ", currencySymbol=", this.d);
        rz4.A(sb, ", returnHalfBonus=", this.e, ", betSum=");
        rz4.x(sb, this.f, ", showPlayAgain=", this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
