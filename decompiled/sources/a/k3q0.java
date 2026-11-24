package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k3q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f17632a;
    public final j9m0 b;

    public k3q0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f17632a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3q0)) {
            return false;
        }
        k3q0 k3q0Var = (k3q0) obj;
        return this.f17632a.equals(k3q0Var.f17632a) && this.b.equals(k3q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17632a.hashCode() * 31);
    }

    public final String toString() {
        return "TextBroadcastHeaderUiModel(statisticHeaderUiModel=" + this.f17632a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
