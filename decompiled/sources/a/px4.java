package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class px4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv6 f27737a;
    public final yv6 b;
    public final ixo0 c;

    public px4(yv6 yv6Var, yv6 yv6Var2, ixo0 ixo0Var) {
        this.f27737a = yv6Var;
        this.b = yv6Var2;
        this.c = ixo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px4)) {
            return false;
        }
        px4 px4Var = (px4) obj;
        return this.f27737a.equals(px4Var.f27737a) && this.b.equals(px4Var.b) && this.c.equals(px4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f27737a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AutoBetTabUiState(coefFieldUiState=" + this.f27737a + ", betSumFieldContentUiState=" + this.b + ", taxesUiState=" + this.c + Separators.RPAREN;
    }
}
