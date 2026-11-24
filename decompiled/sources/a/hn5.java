package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class hn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13334a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public hn5(int i, String str, String str2, String str3, boolean z) {
        this.f13334a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
    }

    public static hn5 a(hn5 hn5Var, String str, String str2, String str3, boolean z, int i) {
        if ((i & 1) != 0) {
            str = hn5Var.f13334a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = hn5Var.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = hn5Var.c;
        }
        String str6 = str3;
        int i2 = hn5Var.d;
        if ((i & 16) != 0) {
            z = hn5Var.e;
        }
        hn5Var.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        return new hn5(i2, str4, str5, str6, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn5)) {
            return false;
        }
        hn5 hn5Var = (hn5) obj;
        return this.f13334a.equals(hn5Var.f13334a) && this.b.equals(hn5Var.b) && this.c.equals(hn5Var.c) && this.d == hn5Var.d && this.e == hn5Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(this.d, ua80.b(ua80.b(this.f13334a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BalanceUiState(balanceTitle=", this.f13334a, ", money=", this.b, ", currency=");
        twn.w(this.d, this.c, ", style=", ", visible=", sbN);
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
