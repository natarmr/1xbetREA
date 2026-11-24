package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uwz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36415a;
    public final List b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;

    public uwz(List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str) {
        list.getClass();
        list2.getClass();
        this.f36415a = list;
        this.b = list2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = str;
    }

    public static uwz a(uwz uwzVar, List list, List list2, int i, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            list = uwzVar.f36415a;
        }
        List list3 = list;
        if ((i2 & 2) != 0) {
            list2 = uwzVar.b;
        }
        List list4 = list2;
        int i3 = (i2 & 4) != 0 ? uwzVar.c : i;
        boolean z3 = (i2 & 8) != 0 ? uwzVar.d : z;
        boolean z4 = (i2 & 16) != 0 ? uwzVar.e : z2;
        boolean z5 = uwzVar.f;
        boolean z6 = uwzVar.g;
        boolean z7 = uwzVar.h;
        boolean z8 = uwzVar.i;
        boolean z9 = uwzVar.j;
        uwzVar.getClass();
        String str = uwzVar.k;
        uwzVar.getClass();
        list3.getClass();
        list4.getClass();
        return new uwz(list3, list4, i3, z3, z4, z5, z6, z7, z8, z9, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwz)) {
            return false;
        }
        uwz uwzVar = (uwz) obj;
        return Intrinsics.d(this.f36415a, uwzVar.f36415a) && Intrinsics.d(this.b, uwzVar.b) && this.c == uwzVar.c && this.d == uwzVar.d && this.e == uwzVar.e && this.f == uwzVar.f && this.g == uwzVar.g && this.h == uwzVar.h && this.i == uwzVar.i && this.j == uwzVar.j && this.k.equals(uwzVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.c, dw9.a(this.f36415a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 961, this.j);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("LimitsIeState(financialLimitModels=", ", timeLimitModels=", this.f36415a, ", currentTab=", this.b);
        brm0.w(this.c, ", isLoading=", ", hasErrorWhileLoadingLimits=", sbT, this.d);
        ua80.u(", hasFinancialSecurityBetsLimits=", ", hasFinancialSecurityDepositLimits=", sbT, this.e, this.f);
        ua80.u(", hasFinancialSecuritySelfLimits=", ", hasFinancialSecurityRealChkLimits=", sbT, this.g, this.h);
        ua80.u(", hasFinancialSecurityTimeoutLimits=", ", selectedLimit=null, initialLimitValue=", sbT, this.i, this.j);
        return axq.n(sbT, this.k, Separators.RPAREN);
    }
}
