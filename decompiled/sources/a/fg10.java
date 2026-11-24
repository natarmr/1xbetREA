package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class fg10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final twa f9470a;
    public final sg10 b;

    public fg10(twa twaVar, sg10 sg10Var) {
        this.f9470a = twaVar;
        this.b = sg10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg10)) {
            return false;
        }
        fg10 fg10Var = (fg10) obj;
        return this.f9470a.equals(fg10Var.f9470a) && this.b.equals(fg10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9470a.hashCode() * 31);
    }

    public final String toString() {
        return "LoyaltyProgramBasicContentPageUiModel(cashbackCardUiModel=" + this.f9470a + ", loyaltyProgramBasicPageContentUiModel=" + this.b + Separators.RPAREN;
    }
}
