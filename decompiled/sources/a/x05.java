package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class x05 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40054a;
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
    public final boolean n;
    public final boolean o;

    public x05(String str, ank0 ank0Var, boolean z, boolean z2, boolean z3, String str2, ank0 ank0Var2, boolean z4, boolean z5, String str3, AutoMaxUiModel autoMaxUiModel, boolean z6, boolean z7, boolean z8, boolean z9) {
        str.getClass();
        str2.getClass();
        this.f40054a = str;
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
        this.n = z8;
        this.o = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x05)) {
            return false;
        }
        x05 x05Var = (x05) obj;
        return Intrinsics.d(this.f40054a, x05Var.f40054a) && this.b.equals(x05Var.b) && this.c == x05Var.c && this.d == x05Var.d && this.e == x05Var.e && Intrinsics.d(this.f, x05Var.f) && this.g.equals(x05Var.g) && this.h == x05Var.h && this.i == x05Var.i && this.j.equals(x05Var.j) && this.k.equals(x05Var.k) && this.l == x05Var.l && this.m == x05Var.m && this.n == x05Var.n && this.o == x05Var.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + brm0.e(brm0.e(brm0.e((this.k.hashCode() + ua80.b(brm0.e(brm0.e(dw9.a(ua80.b(brm0.e(brm0.e(brm0.e(dw9.a(this.f40054a.hashCode() * 31, 31, this.b.f1159a), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g.f1159a), 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoStepInputState(currentCoefValueText=");
        sb.append(this.f40054a);
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
        sb.append(", coefHasError=");
        sb.append(this.l);
        sb.append(", betSumHasError=");
        ua80.u(", coefMaxLimitReached=", ", isLoading=", sb, this.m, this.n);
        return rw2.p(sb, this.o, Separators.RPAREN);
    }
}
