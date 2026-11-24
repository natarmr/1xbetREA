package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bd30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f2381a;
    public final j9m0 b;

    public bd30(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f2381a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd30)) {
            return false;
        }
        bd30 bd30Var = (bd30) obj;
        return this.f2381a.equals(bd30Var.f2381a) && this.b.equals(bd30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2381a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchProgressHeaderUiModel(statisticHeaderUiModel=" + this.f2381a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
