package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26383a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;

    public p52(int i, String str, int i2, int i3, boolean z) {
        this.f26383a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p52)) {
            return false;
        }
        p52 p52Var = (p52) obj;
        return this.f26383a == p52Var.f26383a && this.b.equals(p52Var.b) && this.c == p52Var.c && this.d == p52Var.d && this.e == p52Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(this.d, twn.a(this.c, ua80.b(Integer.hashCode(this.f26383a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f26383a, "AllowedCountry(id=", ", name=", this.b, ", phonePrefix=");
        axq.r(this.c, this.d, ", defaultCurrencyId=", ", top=", sbR);
        return rw2.p(sbR, this.e, Separators.RPAREN);
    }
}
