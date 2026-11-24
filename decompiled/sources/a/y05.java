package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class y05 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41789a;
    public final ank0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final ank0 g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final AutoMaxUiModel k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final boolean o;
    public final boolean p;

    public y05(String str, ank0 ank0Var, boolean z, boolean z2, boolean z3, String str2, ank0 ank0Var2, boolean z4, boolean z5, String str3, AutoMaxUiModel autoMaxUiModel, boolean z6, boolean z7, String str4, boolean z8, boolean z9) {
        str.getClass();
        str2.getClass();
        this.f41789a = str;
        this.b = ank0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str2;
        this.g = ank0Var2;
        this.h = z4;
        this.i = z5;
        this.j = str3;
        this.k = autoMaxUiModel;
        this.l = z6;
        this.m = z7;
        this.n = str4;
        this.o = z8;
        this.p = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y05)) {
            return false;
        }
        y05 y05Var = (y05) obj;
        return Intrinsics.d(this.f41789a, y05Var.f41789a) && this.b.equals(y05Var.b) && this.c == y05Var.c && this.d == y05Var.d && this.e == y05Var.e && Intrinsics.d(this.f, y05Var.f) && this.g.equals(y05Var.g) && this.h == y05Var.h && this.i == y05Var.i && this.j.equals(y05Var.j) && this.k.equals(y05Var.k) && this.l == y05Var.l && this.m == y05Var.m && this.n.equals(y05Var.n) && this.o == y05Var.o && this.p == y05Var.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + brm0.e(ua80.b(brm0.e(brm0.e((this.k.hashCode() + ua80.b(brm0.e(brm0.e(dw9.a(ua80.b(brm0.e(brm0.e(brm0.e(dw9.a(this.f41789a.hashCode() * 31, 31, this.b.f1159a), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g.f1159a), 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoStepInputState(currentCoefValueText=");
        sb.append(this.f41789a);
        sb.append(", coefLimitsTest=");
        sb.append(this.b);
        sb.append(", isStepUpEnabled=");
        ua80.u(", isStepDownEnabled=", ", isActionButtonEnabled=", sb, this.c, this.d);
        f140.s(", currentBetSumValueText=", this.f, ", betSumLimitsText=", sb, this.e);
        sb.append(this.g);
        sb.append(", isCoefUserInput=");
        sb.append(this.h);
        sb.append(", isBetSumUserInput=");
        f140.s(", coefHint=", this.j, ", autoMaxUiModel=", sb, this.i);
        sb.append(this.k);
        sb.append(", showErrorInputCoef=");
        sb.append(this.l);
        sb.append(", showErrorInputSum=");
        f140.s(", coefLimitsPlaceholder=", this.n, ", coefMaxLimitReached=", sb, this.m);
        return ohs0.p(", isLoading=", Separators.RPAREN, sb, this.o, this.p);
    }
}
