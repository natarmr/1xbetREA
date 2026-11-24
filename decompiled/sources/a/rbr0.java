package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rbr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9m0 f30203a;
    public final zdm0 b;

    public rbr0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f30203a = j9m0Var;
        this.b = zdm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbr0)) {
            return false;
        }
        rbr0 rbr0Var = (rbr0) obj;
        return this.f30203a.equals(rbr0Var.f30203a) && this.b.equals(rbr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30203a.hashCode() * 31);
    }

    public final String toString() {
        return "TopPlayersStatisticKabaddiHeaderUiModel(statisticBackgroundUiModel=" + this.f30203a + ", statisticHeaderUiModel=" + this.b + Separators.RPAREN;
    }
}
