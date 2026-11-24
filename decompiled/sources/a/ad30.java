package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ad30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f659a;
    public final j9m0 b;

    public ad30(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f659a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad30)) {
            return false;
        }
        ad30 ad30Var = (ad30) obj;
        return this.f659a.equals(ad30Var.f659a) && this.b.equals(ad30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f659a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchProgressHeaderCricketUiModel(statisticHeaderUiModel=" + this.f659a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
