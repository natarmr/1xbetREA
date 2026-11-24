package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class et1 implements ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw1 f8354a;
    public final fw1 b;

    public et1(cw1 cw1Var, fw1 fw1Var) {
        this.f8354a = cw1Var;
        this.b = fw1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et1)) {
            return false;
        }
        et1 et1Var = (et1) obj;
        return this.f8354a == et1Var.f8354a && this.b.equals(et1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8354a.hashCode() * 31);
    }

    public final String toString() {
        return "PrizePoolUiModel(style=" + this.f8354a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
