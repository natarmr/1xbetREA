package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tg70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33896a;
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

    public tg70(boolean z, double d, double d2, String str, double d3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f33896a = z;
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

    public static tg70 a(tg70 tg70Var, double d, double d2, String str, double d3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        boolean z8 = (i & 1) != 0 ? tg70Var.f33896a : true;
        double d4 = (i & 2) != 0 ? tg70Var.b : d;
        double d5 = (i & 4) != 0 ? tg70Var.c : d2;
        String str2 = (i & 8) != 0 ? tg70Var.d : str;
        double d6 = (i & 16) != 0 ? tg70Var.e : d3;
        boolean z9 = (i & 32) != 0 ? tg70Var.f : z;
        boolean z10 = (i & 64) != 0 ? tg70Var.g : z2;
        boolean z11 = (i & 128) != 0 ? tg70Var.h : z3;
        boolean z12 = (i & 256) != 0 ? tg70Var.i : z4;
        boolean z13 = (i & 512) != 0 ? tg70Var.j : z5;
        boolean z14 = (i & 1024) != 0 ? tg70Var.k : z6;
        boolean z15 = (i & 2048) != 0 ? tg70Var.l : false;
        boolean z16 = (i & 4096) != 0 ? tg70Var.m : z7;
        tg70Var.getClass();
        str2.getClass();
        return new tg70(z8, d4, d5, str2, d6, z9, z10, z11, z12, z13, z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg70)) {
            return false;
        }
        tg70 tg70Var = (tg70) obj;
        return this.f33896a == tg70Var.f33896a && Double.compare(this.b, tg70Var.b) == 0 && Double.compare(this.c, tg70Var.c) == 0 && this.d.equals(tg70Var.d) && Double.compare(this.e, tg70Var.e) == 0 && this.f == tg70Var.f && this.g == tg70Var.g && this.h == tg70Var.h && this.i == tg70Var.i && this.j == tg70Var.j && this.k == tg70Var.k && this.l == tg70Var.l && this.m == tg70Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.d(this.e, ua80.b(brm0.d(this.c, brm0.d(this.b, Boolean.hashCode(this.f33896a) * 31, 31), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewState(enable=");
        sb.append(this.f33896a);
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
