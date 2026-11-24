package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g8e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f10860a;
    public final j9m0 b;

    public g8e0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f10860a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8e0)) {
            return false;
        }
        g8e0 g8e0Var = (g8e0) obj;
        return this.f10860a.equals(g8e0Var.f10860a) && this.b.equals(g8e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10860a.hashCode() * 31);
    }

    public final String toString() {
        return "RatingTableHeaderUiModel(statisticHeaderUiModel=" + this.f10860a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
