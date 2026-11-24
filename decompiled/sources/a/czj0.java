package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class czj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5227a;
    public final boolean b;
    public final ank0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final AutoMaxUiModel j;
    public final boolean k;
    public final boolean l;
    public final String m;

    public czj0(String str, boolean z, ank0 ank0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, AutoMaxUiModel autoMaxUiModel, boolean z8, boolean z9, String str2) {
        str.getClass();
        this.f5227a = str;
        this.b = z;
        this.c = ank0Var;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = autoMaxUiModel;
        this.k = z8;
        this.l = z9;
        this.m = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czj0)) {
            return false;
        }
        czj0 czj0Var = (czj0) obj;
        return Intrinsics.d(this.f5227a, czj0Var.f5227a) && this.b == czj0Var.b && this.c.equals(czj0Var.c) && this.d == czj0Var.d && this.e == czj0Var.e && this.f == czj0Var.f && this.g == czj0Var.g && this.h == czj0Var.h && this.i == czj0Var.i && this.j.equals(czj0Var.j) && this.k == czj0Var.k && this.l == czj0Var.l && Intrinsics.d(this.m, czj0Var.m);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e((this.j.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(brm0.e(this.f5227a.hashCode() * 31, 31, this.b), 31, this.c.f1159a), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l);
        String str = this.m;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("SimpleStepInputState(currentValueText=", this.f5227a, ", isUserInput=", this.b, ", limitsText=");
        sbU.append(this.c);
        sbU.append(", isStepControlsVisible=");
        sbU.append(this.d);
        sbU.append(", isStepUpEnabled=");
        ua80.u(", isStepDownEnabled=", ", isActionButtonEnabled=", sbU, this.e, this.f);
        ua80.u(", isEditFieldEnabled=", ", isVipBet=", sbU, this.g, this.h);
        sbU.append(this.i);
        sbU.append(", autoMaxUiModel=");
        sbU.append(this.j);
        sbU.append(", showError=");
        ua80.u(", isLoading=", ", eachWayBadge=", sbU, this.k, this.l);
        return axq.n(sbU, this.m, Separators.RPAREN);
    }
}
