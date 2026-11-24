package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l400 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19381a;
    public final List b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public l400(List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        list.getClass();
        list2.getClass();
        this.f19381a = list;
        this.b = list2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
    }

    public static l400 a(l400 l400Var, List list, List list2, int i, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            list = l400Var.f19381a;
        }
        List list3 = list;
        if ((i2 & 2) != 0) {
            list2 = l400Var.b;
        }
        List list4 = list2;
        if ((i2 & 4) != 0) {
            i = l400Var.c;
        }
        int i3 = i;
        boolean z3 = (i2 & 8) != 0 ? l400Var.d : z;
        boolean z4 = (i2 & 16) != 0 ? l400Var.e : z2;
        boolean z5 = l400Var.f;
        boolean z6 = l400Var.g;
        boolean z7 = l400Var.h;
        boolean z8 = l400Var.i;
        boolean z9 = l400Var.j;
        l400Var.getClass();
        list3.getClass();
        list4.getClass();
        return new l400(list3, list4, i3, z3, z4, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l400)) {
            return false;
        }
        l400 l400Var = (l400) obj;
        return Intrinsics.d(this.f19381a, l400Var.f19381a) && Intrinsics.d(this.b, l400Var.b) && this.c == l400Var.c && this.d == l400Var.d && this.e == l400Var.e && this.f == l400Var.f && this.g == l400Var.g && this.h == l400Var.h && this.i == l400Var.i && this.j == l400Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.c, dw9.a(this.f19381a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("LimitsRsState(financialLimitModels=", ", timeLimitModels=", this.f19381a, ", currentTab=", this.b);
        brm0.w(this.c, ", isLoading=", ", hasErrorWhileLoadingLimits=", sbT, this.d);
        ua80.u(", hasFinancialSecurityBetsLimits=", ", hasFinancialSecurityLossLimits=", sbT, this.e, this.f);
        ua80.u(", hasFinancialSecurityDepositLimits=", ", hasFinancialSecuritySessionTimeLimits=", sbT, this.g, this.h);
        return ohs0.p(", hasFinancialSecuritySelfLimits=", Separators.RPAREN, sbT, this.i, this.j);
    }
}
