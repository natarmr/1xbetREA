package a;

import android.gov.nist.core.Separators;
import org.xplatform.statistic.rating.impl.rating_statistic.domain.model.SelectorOptionModel;

/* JADX INFO: loaded from: classes6.dex */
public final class z3e0 implements d4e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6i0 f43713a;
    public final SelectorOptionModel b;

    public z3e0(i6i0 i6i0Var, SelectorOptionModel selectorOptionModel) {
        this.f43713a = i6i0Var;
        this.b = selectorOptionModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3e0)) {
            return false;
        }
        z3e0 z3e0Var = (z3e0) obj;
        return this.f43713a == z3e0Var.f43713a && this.b.equals(z3e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43713a.hashCode() * 31);
    }

    public final String toString() {
        return "OnFilterSelected(selectorUiType=" + this.f43713a + ", selectorOptionModel=" + this.b + Separators.RPAREN;
    }
}
