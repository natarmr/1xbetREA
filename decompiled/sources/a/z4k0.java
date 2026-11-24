package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f43774a;
    public final j9m0 b;

    public z4k0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f43774a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4k0)) {
            return false;
        }
        z4k0 z4k0Var = (z4k0) obj;
        return this.f43774a.equals(z4k0Var.f43774a) && this.b.equals(z4k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43774a.hashCode() * 31);
    }

    public final String toString() {
        return "SingleTeamStatisticMenuHeaderUiModel(statisticHeaderUiModel=" + this.f43774a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
