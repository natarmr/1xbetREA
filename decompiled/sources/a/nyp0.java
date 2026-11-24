package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;

/* JADX INFO: loaded from: classes6.dex */
public final class nyp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TennisSummaryFilterModel f24340a;
    public final TennisSummaryFilterModel b;
    public final TennisSummaryFilterModel c;

    static {
        wxp0 wxp0Var = TennisSummaryFilterModel.Companion;
    }

    public nyp0(TennisSummaryFilterModel tennisSummaryFilterModel, TennisSummaryFilterModel tennisSummaryFilterModel2, TennisSummaryFilterModel tennisSummaryFilterModel3) {
        tennisSummaryFilterModel.getClass();
        tennisSummaryFilterModel2.getClass();
        tennisSummaryFilterModel3.getClass();
        this.f24340a = tennisSummaryFilterModel;
        this.b = tennisSummaryFilterModel2;
        this.c = tennisSummaryFilterModel3;
    }

    public static nyp0 a(nyp0 nyp0Var, TennisSummaryFilterModel tennisSummaryFilterModel) {
        TennisSummaryFilterModel tennisSummaryFilterModel2 = nyp0Var.f24340a;
        TennisSummaryFilterModel tennisSummaryFilterModel3 = nyp0Var.c;
        tennisSummaryFilterModel2.getClass();
        tennisSummaryFilterModel.getClass();
        tennisSummaryFilterModel3.getClass();
        return new nyp0(tennisSummaryFilterModel2, tennisSummaryFilterModel, tennisSummaryFilterModel3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyp0)) {
            return false;
        }
        nyp0 nyp0Var = (nyp0) obj;
        return Intrinsics.d(this.f24340a, nyp0Var.f24340a) && Intrinsics.d(this.b, nyp0Var.b) && Intrinsics.d(this.c, nyp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f24340a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TennisSummaryFiltersState(startFilterModel=" + this.f24340a + ", currentFilterModel=" + this.b + ", defaultFilterModel=" + this.c + Separators.RPAREN;
    }
}
