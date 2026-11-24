package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uw6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f36378a;
    public final double b;
    public final double c;
    public final double d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public uw6(double d, double d2, double d3, double d4, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f36378a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
    }

    public static uw6 a(uw6 uw6Var, double d, double d2, double d3, double d4, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        double d5 = (i & 1) != 0 ? uw6Var.f36378a : d;
        double d6 = (i & 2) != 0 ? uw6Var.b : d2;
        double d7 = (i & 4) != 0 ? uw6Var.c : d3;
        double d8 = (i & 8) != 0 ? uw6Var.d : d4;
        uw6Var.getClass();
        String str2 = (i & 32) != 0 ? uw6Var.e : str;
        boolean z7 = (i & 64) != 0 ? uw6Var.f : true;
        boolean z8 = (i & 128) != 0 ? uw6Var.g : z;
        boolean z9 = (i & 256) != 0 ? uw6Var.h : z2;
        boolean z10 = (i & 512) != 0 ? uw6Var.i : z3;
        boolean z11 = (i & 1024) != 0 ? uw6Var.j : z4;
        boolean z12 = (i & 2048) != 0 ? uw6Var.k : false;
        boolean z13 = (i & 4096) != 0 ? uw6Var.l : z5;
        boolean z14 = (i & 8192) != 0 ? uw6Var.m : z6;
        uw6Var.getClass();
        str2.getClass();
        return new uw6(d5, d6, d7, d8, str2, z7, z8, z9, z10, z11, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw6)) {
            return false;
        }
        uw6 uw6Var = (uw6) obj;
        return Double.compare(this.f36378a, uw6Var.f36378a) == 0 && Double.compare(this.b, uw6Var.b) == 0 && Double.compare(this.c, uw6Var.c) == 0 && Double.compare(this.d, uw6Var.d) == 0 && Double.compare(9.99999999999999E12d, 9.99999999999999E12d) == 0 && this.e.equals(uw6Var.e) && this.f == uw6Var.f && this.g == uw6Var.g && this.h == uw6Var.h && this.i == uw6Var.i && this.j == uw6Var.j && this.k == uw6Var.k && this.l == uw6Var.l && this.m == uw6Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.d(9.99999999999999E12d, brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f36378a) * 31, 31), 31), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f36378a, "BetFieldParamsStateModel(currentValue=", ", initValue=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", stepValue=", ", minValue=");
        hne.w(sbP, this.d, ", maxValue=9.99999999999999E12, currencySymbol=", this.e);
        w6x.A(", isUnlimitedBet=", ", hasInitValue=", sbP, this.f, this.g);
        w6x.A(", isEditEnabled=", ", isActionButtonEnabled=", sbP, this.h, this.i);
        w6x.A(", isStepControlsVisible=", ", isLoading=", sbP, this.j, this.k);
        w6x.A(", isNeedResetFocus=", ", marketIsOpen=", sbP, this.l, this.m);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
