package a;

import android.gov.nist.core.Separators;
import org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class tw6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f34633a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final AutoMaxUiModel i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public tw6(double d, double d2, double d3, double d4, double d5, String str, boolean z, boolean z2, AutoMaxUiModel autoMaxUiModel, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f34633a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = str;
        this.g = z;
        this.h = z2;
        this.i = autoMaxUiModel;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = z9;
    }

    public static tw6 a(tw6 tw6Var, double d, double d2, double d3, double d4, double d5, String str, boolean z, boolean z2, AutoMaxUiModel autoMaxUiModel, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        double d6 = (i & 1) != 0 ? tw6Var.f34633a : d;
        double d7 = (i & 2) != 0 ? tw6Var.b : d2;
        double d8 = (i & 4) != 0 ? tw6Var.c : d3;
        double d9 = (i & 8) != 0 ? tw6Var.d : d4;
        double d10 = (i & 16) != 0 ? tw6Var.e : d5;
        String str2 = (i & 32) != 0 ? tw6Var.f : str;
        boolean z9 = (i & 64) != 0 ? tw6Var.g : z;
        boolean z10 = (i & 128) != 0 ? tw6Var.h : z2;
        AutoMaxUiModel autoMaxUiModel2 = (i & 256) != 0 ? tw6Var.i : autoMaxUiModel;
        double d11 = d6;
        boolean z11 = (i & 512) != 0 ? tw6Var.j : z3;
        boolean z12 = (i & 1024) != 0 ? tw6Var.k : z4;
        boolean z13 = z11;
        boolean z14 = (i & 2048) != 0 ? tw6Var.l : z5;
        boolean z15 = (i & 4096) != 0 ? tw6Var.m : z6;
        boolean z16 = (i & 8192) != 0 ? tw6Var.n : false;
        boolean z17 = (i & 16384) != 0 ? tw6Var.o : z7;
        boolean z18 = (i & 32768) != 0 ? tw6Var.p : z8;
        tw6Var.getClass();
        str2.getClass();
        return new tw6(d11, d7, d8, d9, d10, str2, z9, z10, autoMaxUiModel2, z13, z12, z14, z15, z16, z17, z18);
    }

    public final double b() {
        return this.e / c();
    }

    public final double c() {
        return this.p ? 2.0d : 1.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw6)) {
            return false;
        }
        tw6 tw6Var = (tw6) obj;
        return Double.compare(this.f34633a, tw6Var.f34633a) == 0 && Double.compare(this.b, tw6Var.b) == 0 && Double.compare(this.c, tw6Var.c) == 0 && Double.compare(this.d, tw6Var.d) == 0 && Double.compare(this.e, tw6Var.e) == 0 && this.f.equals(tw6Var.f) && this.g == tw6Var.g && this.h == tw6Var.h && this.i.equals(tw6Var.i) && this.j == tw6Var.j && this.k == tw6Var.k && this.l == tw6Var.l && this.m == tw6Var.m && this.n == tw6Var.n && this.o == tw6Var.o && this.p == tw6Var.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((this.i.hashCode() + brm0.e(brm0.e(ua80.b(brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f34633a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f34633a, "BetFieldParamsStateModel(currentValue=", ", initValue=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", stepValue=", ", minValue=");
        sbP.append(this.d);
        ohs0.A(sbP, this.e, ", maxValue=", ", currencySymbol=");
        brm0.C(this.f, ", isUnlimitedBet=", ", hasInitValue=", sbP, this.g);
        sbP.append(this.h);
        sbP.append(", autoMaxModel=");
        sbP.append(this.i);
        sbP.append(", isVisible=");
        ua80.u(", isActionButtonEnabled=", ", isStepControlsVisible=", sbP, this.j, this.k);
        ua80.u(", isVipBet=", ", isLoading=", sbP, this.l, this.m);
        ua80.u(", isNeedResetFocus=", ", isEachWay=", sbP, this.n, this.o);
        return rw2.p(sbP, this.p, Separators.RPAREN);
    }
}
