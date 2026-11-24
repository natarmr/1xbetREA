package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u5p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f35107a;
    public final j9m0 b;

    public u5p0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f35107a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5p0)) {
            return false;
        }
        u5p0 u5p0Var = (u5p0) obj;
        return this.f35107a.equals(u5p0Var.f35107a) && this.b.equals(u5p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35107a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamCharacteristicsHeaderUiModel(statisticHeaderUiModel=" + this.f35107a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
