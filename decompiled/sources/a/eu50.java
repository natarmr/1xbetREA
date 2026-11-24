package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eu50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f8402a;
    public final j9m0 b;

    public eu50(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f8402a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu50)) {
            return false;
        }
        eu50 eu50Var = (eu50) obj;
        return this.f8402a.equals(eu50Var.f8402a) && this.b.equals(eu50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8402a.hashCode() * 31);
    }

    public final String toString() {
        return "NewsHeaderUiModel(statisticHeaderUiModel=" + this.f8402a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
