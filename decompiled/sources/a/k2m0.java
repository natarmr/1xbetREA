package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k2m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f17581a;
    public final j9m0 b;

    public k2m0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f17581a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2m0)) {
            return false;
        }
        k2m0 k2m0Var = (k2m0) obj;
        return this.f17581a.equals(k2m0Var.f17581a) && this.b.equals(k2m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17581a.hashCode() * 31);
    }

    public final String toString() {
        return "StageTableHeaderUiModel(statisticHeaderUiModel=" + this.f17581a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
