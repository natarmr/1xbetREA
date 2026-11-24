package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class n9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23139a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public n9h0(boolean z, int i, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f23139a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = i2;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
    }

    public static n9h0 a(n9h0 n9h0Var, boolean z, boolean z2, boolean z3, String str, int i, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2) {
        if ((i2 & 1) != 0) {
            z = n9h0Var.f23139a;
        }
        boolean z9 = z;
        int i3 = n9h0Var.b;
        if ((i2 & 4) != 0) {
            z2 = n9h0Var.c;
        }
        boolean z10 = z2;
        if ((i2 & 8) != 0) {
            z3 = n9h0Var.d;
        }
        boolean z11 = z3;
        String str2 = (i2 & 16) != 0 ? n9h0Var.e : str;
        int i4 = (i2 & 32) != 0 ? n9h0Var.f : i;
        boolean z12 = (i2 & 64) != 0 ? n9h0Var.g : z4;
        boolean z13 = (i2 & 128) != 0 ? n9h0Var.h : z5;
        boolean z14 = (i2 & 256) != 0 ? n9h0Var.i : z6;
        boolean z15 = (i2 & 512) != 0 ? n9h0Var.j : z7;
        boolean z16 = (i2 & 1024) != 0 ? n9h0Var.k : z8;
        n9h0Var.getClass();
        return new n9h0(z9, i3, z10, z11, str2, i4, z12, z13, z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9h0)) {
            return false;
        }
        n9h0 n9h0Var = (n9h0) obj;
        return this.f23139a == n9h0Var.f23139a && this.b == n9h0Var.b && this.c == n9h0Var.c && this.d == n9h0Var.d && this.e.equals(n9h0Var.e) && this.f == n9h0Var.f && this.g == n9h0Var.g && this.h == n9h0Var.h && this.i == n9h0Var.i && this.j == n9h0Var.j && this.k == n9h0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.f, ua80.b(brm0.e(brm0.e(twn.a(this.b, Boolean.hashCode(this.f23139a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "ScreenUiState(loading=", ", couponCardShimmerLayout=", ", contentVisible=", this.f23139a);
        ua80.u(", optionsVisible=", ", optionsRefillDescription=", sbT, this.c, this.d);
        twn.w(this.f, this.e, ", optionsEmptyCouponTextTopPadding=", ", authorized=", sbT);
        ua80.u(", generateVisible=", ", uploadVisible=", sbT, this.g, this.h);
        ua80.u(", dayExpressVisible=", ", betsOnFavoriteVisible=", sbT, this.i, this.j);
        return rw2.p(sbT, this.k, Separators.RPAREN);
    }
}
