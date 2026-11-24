package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zvj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv6 f45061a;
    public final ixo0 b;

    public zvj0(yv6 yv6Var, ixo0 ixo0Var) {
        this.f45061a = yv6Var;
        this.b = ixo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvj0)) {
            return false;
        }
        zvj0 zvj0Var = (zvj0) obj;
        return this.f45061a.equals(zvj0Var.f45061a) && this.b.equals(zvj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f45061a.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleBetTabUiState(betFieldContentUiState=" + this.f45061a + ", taxesUiState=" + this.b + Separators.RPAREN;
    }
}
