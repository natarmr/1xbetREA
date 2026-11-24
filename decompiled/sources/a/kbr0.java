package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kbr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f18028a;
    public final j9m0 b;

    public kbr0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f18028a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbr0)) {
            return false;
        }
        kbr0 kbr0Var = (kbr0) obj;
        return this.f18028a.equals(kbr0Var.f18028a) && this.b.equals(kbr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18028a.hashCode() * 31);
    }

    public final String toString() {
        return "TopPlayersStatisticHeaderUiModel(statisticHeaderUiModel=" + this.f18028a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
