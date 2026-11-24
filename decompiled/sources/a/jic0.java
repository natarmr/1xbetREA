package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jic0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16568a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final int f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public jic0(String str, String str2, String str3, long j, String str4, int i, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f16568a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = i;
        this.g = j2;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jic0)) {
            return false;
        }
        jic0 jic0Var = (jic0) obj;
        return this.f16568a.equals(jic0Var.f16568a) && this.b.equals(jic0Var.b) && this.c.equals(jic0Var.c) && this.d == jic0Var.d && this.e.equals(jic0Var.e) && this.f == jic0Var.f && this.g == jic0Var.g && this.h == jic0Var.h && this.i == jic0Var.i && this.j == jic0Var.j && this.k == jic0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + brm0.e(brm0.e(brm0.e(rw2.b(twn.a(this.f, ua80.b(rw2.b(ua80.b(ua80.b(this.f16568a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PromoGameModel(imgPathDefault=", this.f16568a, ", imgPathDarkTheme=", this.b, ", imgPathLightTheme=");
        defpackage.c.i(sbN, this.d, this.c, ", gameId=");
        axq.s(this.f, ", gameName=", this.e, ", providerId=", sbN);
        kng0.A(sbN, ", productId=", this.g, ", needTransfer=");
        ua80.u(", hasDemo=", ", bonusWageringBan=", sbN, this.h, this.i);
        return ohs0.p(", configured=", Separators.RPAREN, sbN, this.j, this.k);
    }
}
