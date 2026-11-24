package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;

/* JADX INFO: loaded from: classes6.dex */
public final class fzp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10419a;
    public final boolean b;
    public final boolean c;
    public final uyp0 d;
    public final boolean e;
    public final TennisSummaryFilterModel f;

    static {
        wxp0 wxp0Var = TennisSummaryFilterModel.Companion;
    }

    public fzp0(boolean z, boolean z2, boolean z3, uyp0 uyp0Var, boolean z4, TennisSummaryFilterModel tennisSummaryFilterModel) {
        tennisSummaryFilterModel.getClass();
        this.f10419a = z;
        this.b = z2;
        this.c = z3;
        this.d = uyp0Var;
        this.e = z4;
        this.f = tennisSummaryFilterModel;
    }

    public static fzp0 a(fzp0 fzp0Var, boolean z, boolean z2, boolean z3, uyp0 uyp0Var, boolean z4, TennisSummaryFilterModel tennisSummaryFilterModel, int i) {
        if ((i & 1) != 0) {
            z = fzp0Var.f10419a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = fzp0Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = fzp0Var.c;
        }
        boolean z7 = z3;
        fzp0Var.getClass();
        if ((i & 16) != 0) {
            uyp0Var = fzp0Var.d;
        }
        uyp0 uyp0Var2 = uyp0Var;
        if ((i & 32) != 0) {
            z4 = fzp0Var.e;
        }
        boolean z8 = z4;
        if ((i & 64) != 0) {
            tennisSummaryFilterModel = fzp0Var.f;
        }
        TennisSummaryFilterModel tennisSummaryFilterModel2 = tennisSummaryFilterModel;
        fzp0Var.getClass();
        tennisSummaryFilterModel2.getClass();
        return new fzp0(z5, z6, z7, uyp0Var2, z8, tennisSummaryFilterModel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzp0)) {
            return false;
        }
        fzp0 fzp0Var = (fzp0) obj;
        return this.f10419a == fzp0Var.f10419a && this.b == fzp0Var.b && this.c == fzp0Var.c && Intrinsics.d(this.d, fzp0Var.d) && this.e == fzp0Var.e && Intrinsics.d(this.f, fzp0Var.f);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(Boolean.hashCode(this.f10419a) * 31, 31, this.b), 961, this.c);
        uyp0 uyp0Var = this.d;
        return this.f.hashCode() + brm0.e((iE + (uyp0Var == null ? 0 : uyp0Var.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TennisSummaryState(isLoading=", ", isError=", ", isEmpty=", this.f10419a, this.b);
        sbQ.append(this.c);
        sbQ.append(", lottieEmptyConfig=null, summaryStats=");
        sbQ.append(this.d);
        sbQ.append(", isFiltered=");
        sbQ.append(this.e);
        sbQ.append(", currentFilter=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
