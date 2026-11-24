package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mop0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9m0 f22146a;
    public final zdm0 b;

    public mop0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f22146a = j9m0Var;
        this.b = zdm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mop0)) {
            return false;
        }
        mop0 mop0Var = (mop0) obj;
        return this.f22146a.equals(mop0Var.f22146a) && this.b.equals(mop0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22146a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamsChampStatisticHeaderUiModel(statisticBackgroundUiModel=" + this.f22146a + ", statisticHeaderUiModel=" + this.b + Separators.RPAREN;
    }
}
