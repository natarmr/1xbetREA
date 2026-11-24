package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y2k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2k0 f41909a;
    public final boolean b;

    public y2k0(x2k0 x2k0Var, boolean z) {
        this.f41909a = x2k0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2k0)) {
            return false;
        }
        y2k0 y2k0Var = (y2k0) obj;
        return this.f41909a.equals(y2k0Var.f41909a) && this.b == y2k0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f41909a.hashCode() * 31);
    }

    public final String toString() {
        return "SinglePageTransactionButtonUiState(transactionButtonType=" + this.f41909a + ", enabled=" + this.b + Separators.RPAREN;
    }
}
