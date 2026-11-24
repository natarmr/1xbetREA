package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bi70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2647a;
    public final double b;
    public final double c;
    public final String d;
    public final double e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public bi70(boolean z, double d, double d2, String str, double d3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f2647a = z;
        this.b = d;
        this.c = d2;
        this.d = str;
        this.e = d3;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = z9;
    }

    public static bi70 a(bi70 bi70Var, double d, double d2, String str, double d3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        boolean z8 = (i & 1) != 0 ? bi70Var.f2647a : true;
        double d4 = (i & 2) != 0 ? bi70Var.b : d;
        double d5 = (i & 4) != 0 ? bi70Var.c : d2;
        String str2 = (i & 8) != 0 ? bi70Var.d : str;
        double d6 = (i & 16) != 0 ? bi70Var.e : d3;
        boolean z9 = (i & 32) != 0 ? bi70Var.f : z;
        boolean z10 = (i & 64) != 0 ? bi70Var.g : z2;
        boolean z11 = (i & 128) != 0 ? bi70Var.h : z3;
        boolean z12 = (i & 256) != 0 ? bi70Var.i : z4;
        boolean z13 = (i & 512) != 0 ? bi70Var.j : z5;
        boolean z14 = (i & 1024) != 0 ? bi70Var.k : z6;
        boolean z15 = (i & 2048) != 0 ? bi70Var.l : false;
        boolean z16 = (i & 4096) != 0 ? bi70Var.m : z7;
        bi70Var.getClass();
        str2.getClass();
        return new bi70(z8, d4, d5, str2, d6, z9, z10, z11, z12, z13, z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi70)) {
            return false;
        }
        bi70 bi70Var = (bi70) obj;
        return this.f2647a == bi70Var.f2647a && Double.compare(this.b, bi70Var.b) == 0 && Double.compare(this.c, bi70Var.c) == 0 && this.d.equals(bi70Var.d) && Double.compare(this.e, bi70Var.e) == 0 && this.f == bi70Var.f && this.g == bi70Var.g && this.h == bi70Var.h && this.i == bi70Var.i && this.j == bi70Var.j && this.k == bi70Var.k && this.l == bi70Var.l && this.m == bi70Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.d(this.e, ua80.b(brm0.d(this.c, brm0.d(this.b, Boolean.hashCode(this.f2647a) * 31, 31), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewState(enable=");
        sb.append(this.f2647a);
        sb.append(", minBet=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", maxBet=", ", currency=");
        hne.A(sb, this.d, ", betSum=", this.e);
        w6x.A(", minButtonDisabled=", ", maxButtonDisabled=", sb, this.f, this.g);
        w6x.A(", doubleButtonDisabled=", ", halfButtonDisabled=", sb, this.h, this.i);
        w6x.A(", fitsLimits=", ", needDecimalPoint=", sb, this.j, this.k);
        w6x.A(", showLoader=", ", showBetContainer=", sb, this.l, this.m);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
