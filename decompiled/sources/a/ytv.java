package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ytv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f43239a;
    public final j9m0 b;

    public ytv(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f43239a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytv)) {
            return false;
        }
        ytv ytvVar = (ytv) obj;
        return this.f43239a.equals(ytvVar.f43239a) && this.b.equals(ytvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43239a.hashCode() * 31);
    }

    public final String toString() {
        return "HeatMapHeaderUiModel(statisticHeaderUiModel=" + this.f43239a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
