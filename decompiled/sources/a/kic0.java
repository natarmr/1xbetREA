package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kic0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18330a;
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

    public kic0(String str, String str2, String str3, long j, String str4, int i, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f18330a = str;
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
        if (!(obj instanceof kic0)) {
            return false;
        }
        kic0 kic0Var = (kic0) obj;
        return this.f18330a.equals(kic0Var.f18330a) && this.b.equals(kic0Var.b) && this.c.equals(kic0Var.c) && this.d == kic0Var.d && this.e.equals(kic0Var.e) && this.f == kic0Var.f && this.g == kic0Var.g && this.h == kic0Var.h && this.i == kic0Var.i && this.j == kic0Var.j && this.k == kic0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + brm0.e(brm0.e(brm0.e(rw2.b(twn.a(this.f, ua80.b(rw2.b(ua80.b(ua80.b(this.f18330a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PromoGameModel(imgPathDefault=", this.f18330a, ", imgPathDarkTheme=", this.b, ", imgPathLightTheme=");
        defpackage.c.i(sbN, this.d, this.c, ", gameId=");
        axq.s(this.f, ", gameName=", this.e, ", providerId=", sbN);
        kng0.A(sbN, ", productId=", this.g, ", needTransfer=");
        ua80.u(", hasDemo=", ", bonusWageringBan=", sbN, this.h, this.i);
        return ohs0.p(", configured=", Separators.RPAREN, sbN, this.j, this.k);
    }
}
