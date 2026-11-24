package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y6g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f42095a;
    public final j9m0 b;

    public y6g0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f42095a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6g0)) {
            return false;
        }
        y6g0 y6g0Var = (y6g0) obj;
        return this.f42095a.equals(y6g0Var.f42095a) && this.b.equals(y6g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42095a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultsGridHeaderUiModel(statisticHeaderUiModel=" + this.f42095a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
