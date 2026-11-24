package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jvo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f17212a;
    public final j9m0 b;

    public jvo(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f17212a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvo)) {
            return false;
        }
        jvo jvoVar = (jvo) obj;
        return this.f17212a.equals(jvoVar.f17212a) && this.b.equals(jvoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17212a.hashCode() * 31);
    }

    public final String toString() {
        return "FactsHeaderUiModel(statisticHeaderUiModel=" + this.f17212a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
