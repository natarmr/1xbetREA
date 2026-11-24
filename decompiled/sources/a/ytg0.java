package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ytg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f43216a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final String j;
    public final int k;
    public final boolean l;
    public final long m;

    public ytg0(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, String str, int i, boolean z, long j) {
        this.f43216a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        this.h = d8;
        this.i = d9;
        this.j = str;
        this.k = i;
        this.l = z;
        this.m = j;
    }

    public static ytg0 a(ytg0 ytg0Var, double d, double d2, double d3, int i) {
        double d4 = ytg0Var.f43216a;
        double d5 = ytg0Var.b;
        double d6 = ytg0Var.c;
        double d7 = (i & 16) != 0 ? ytg0Var.e : d2;
        double d8 = ytg0Var.f;
        double d9 = ytg0Var.g;
        double d10 = ytg0Var.h;
        String str = ytg0Var.j;
        int i2 = ytg0Var.k;
        boolean z = ytg0Var.l;
        long j = ytg0Var.m;
        ytg0Var.getClass();
        return new ytg0(d4, d5, d6, d, d7, d8, d9, d10, d3, str, i2, z, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytg0)) {
            return false;
        }
        ytg0 ytg0Var = (ytg0) obj;
        return Double.compare(this.f43216a, ytg0Var.f43216a) == 0 && Double.compare(this.b, ytg0Var.b) == 0 && Double.compare(this.c, ytg0Var.c) == 0 && Double.compare(this.d, ytg0Var.d) == 0 && Double.compare(this.e, ytg0Var.e) == 0 && Double.compare(this.f, ytg0Var.f) == 0 && Double.compare(this.g, ytg0Var.g) == 0 && Double.compare(this.h, ytg0Var.h) == 0 && Double.compare(this.i, ytg0Var.i) == 0 && this.j.equals(ytg0Var.j) && this.k == ytg0Var.k && this.l == ytg0Var.l && this.m == ytg0Var.m;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + brm0.e(twn.a(this.k, ua80.b(brm0.d(this.i, brm0.d(this.h, brm0.d(this.g, brm0.d(this.f, brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f43216a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f43216a, "SaleBetSumModel(availableBetSum=", ", balance=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", limitSumPartSale=", ", maxSaleSum=");
        sbP.append(this.d);
        ohs0.A(sbP, this.e, ", minSaleSum=", ", minAutoSaleOrder=");
        sbP.append(this.f);
        ohs0.A(sbP, this.g, ", maxAutoSaleOrder=", ", minBetSum=");
        sbP.append(this.h);
        ohs0.A(sbP, this.i, ", maxNewSum=", ", betGUID=");
        twn.w(this.k, this.j, ", waitTime=", ", hasOrder=", sbP);
        rw2.v(this.m, ", walletId=", sbP, this.l);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
