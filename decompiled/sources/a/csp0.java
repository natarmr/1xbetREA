package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class csp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f4902a;
    public final j9m0 b;

    public csp0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f4902a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csp0)) {
            return false;
        }
        csp0 csp0Var = (csp0) obj;
        return this.f4902a.equals(csp0Var.f4902a) && this.b.equals(csp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4902a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamsStatisticMenuHeaderUiModel(statisticHeaderUiModel=" + this.f4902a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
