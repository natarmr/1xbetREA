package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z0m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f43575a;
    public final j9m0 b;
    public final vhh0 c;

    public z0m0(zdm0 zdm0Var, j9m0 j9m0Var, vhh0 vhh0Var) {
        this.f43575a = zdm0Var;
        this.b = j9m0Var;
        this.c = vhh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0m0)) {
            return false;
        }
        z0m0 z0m0Var = (z0m0) obj;
        return this.f43575a.equals(z0m0Var.f43575a) && this.b.equals(z0m0Var.b) && this.c.equals(z0m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w6x.h(this.b, this.f43575a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "StageNetHeaderUiModel(statisticHeaderUiModel=" + this.f43575a + ", statisticBackgroundUiModel=" + this.b + ", searchState=" + this.c + Separators.RPAREN;
    }
}
