package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16796a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public jn5(String str, String str2, String str3, boolean z, boolean z2) {
        this.f16796a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn5)) {
            return false;
        }
        jn5 jn5Var = (jn5) obj;
        return this.f16796a == jn5Var.f16796a && this.b == jn5Var.b && this.c.equals(jn5Var.c) && this.d.equals(jn5Var.d) && this.e.equals(jn5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f16796a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BalanceUiState(showBalance=", ", showRegistrationsButtons=", ", money=", this.f16796a, this.b);
        f140.v(sbQ, this.c, ", currency=", this.d, ", balanceName=");
        return axq.n(sbQ, this.e, Separators.RPAREN);
    }
}
