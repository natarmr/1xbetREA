package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gma0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f11534a;
    public final j9m0 b;

    public gma0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f11534a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gma0)) {
            return false;
        }
        gma0 gma0Var = (gma0) obj;
        return this.f11534a.equals(gma0Var.f11534a) && this.b.equals(gma0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11534a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayersStatisticsHeaderUiModel(statisticHeaderUiModel=" + this.f11534a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
