package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ww6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f39872a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final String f;
    public final boolean g;
    public final qz4 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public ww6(double d, double d2, double d3, double d4, double d5, String str, boolean z, qz4 qz4Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f39872a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = str;
        this.g = z;
        this.h = qz4Var;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
    }

    public static ww6 a(ww6 ww6Var, double d, double d2, double d3, double d4, double d5, String str, boolean z, qz4 qz4Var, boolean z2, boolean z3, int i) {
        double d6 = (i & 1) != 0 ? ww6Var.f39872a : d;
        double d7 = (i & 2) != 0 ? ww6Var.b : d2;
        double d8 = (i & 4) != 0 ? ww6Var.c : d3;
        double d9 = (i & 8) != 0 ? ww6Var.d : d4;
        double d10 = (i & 16) != 0 ? ww6Var.e : d5;
        String str2 = (i & 32) != 0 ? ww6Var.f : str;
        ww6Var.getClass();
        boolean z4 = (i & 128) != 0 ? ww6Var.g : z;
        qz4 qz4Var2 = (i & 256) != 0 ? ww6Var.h : qz4Var;
        boolean z5 = (i & 512) != 0 ? ww6Var.i : true;
        boolean z6 = (i & 1024) != 0 ? ww6Var.j : true;
        boolean z7 = (i & 2048) != 0 ? ww6Var.k : z2;
        boolean z8 = (i & 4096) != 0 ? ww6Var.l : false;
        boolean z9 = (i & 8192) != 0 ? ww6Var.m : z3;
        ww6Var.getClass();
        str2.getClass();
        return new ww6(d6, d7, d8, d9, d10, str2, z4, qz4Var2, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww6)) {
            return false;
        }
        ww6 ww6Var = (ww6) obj;
        return Double.compare(this.f39872a, ww6Var.f39872a) == 0 && Double.compare(this.b, ww6Var.b) == 0 && Double.compare(this.c, ww6Var.c) == 0 && Double.compare(this.d, ww6Var.d) == 0 && Double.compare(this.e, ww6Var.e) == 0 && this.f.equals(ww6Var.f) && this.g == ww6Var.g && this.h.equals(ww6Var.h) && this.i == ww6Var.i && this.j == ww6Var.j && this.k == ww6Var.k && this.l == ww6Var.l && this.m == ww6Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + brm0.e(brm0.e(brm0.e(brm0.e((this.h.hashCode() + brm0.e(brm0.e(ua80.b(brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f39872a) * 31, 31), 31), 31), 31), 31, this.f), 31, false), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f39872a, "BetFieldParamsStateModel(currentValue=", ", initValue=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", stepValue=", ", minValue=");
        sbP.append(this.d);
        ohs0.A(sbP, this.e, ", maxValue=", ", currencySymbol=");
        brm0.C(this.f, ", isUnlimitedBet=false, hasInitValue=", ", autoMaxModel=", sbP, this.g);
        sbP.append(this.h);
        sbP.append(", isEditEnabled=");
        sbP.append(this.i);
        sbP.append(", isActionButtonEnabled=");
        ua80.u(", isStepControlsVisible=", ", isLoading=", sbP, this.j, this.k);
        return ohs0.p(", isNeedResetFocus=", Separators.RPAREN, sbP, this.l, this.m);
    }
}
