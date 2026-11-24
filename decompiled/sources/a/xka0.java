package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xka0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f41023a;
    public final j9m0 b;

    public xka0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f41023a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xka0)) {
            return false;
        }
        xka0 xka0Var = (xka0) obj;
        return this.f41023a.equals(xka0Var.f41023a) && this.b.equals(xka0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41023a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayersStatisticsCricketHeaderUiModel(statisticHeaderUiModel=" + this.f41023a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
