package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rx4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw6 f31246a;
    public final aw6 b;
    public final gxo0 c;

    public rx4(aw6 aw6Var, aw6 aw6Var2, gxo0 gxo0Var) {
        this.f31246a = aw6Var;
        this.b = aw6Var2;
        this.c = gxo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4)) {
            return false;
        }
        rx4 rx4Var = (rx4) obj;
        return this.f31246a.equals(rx4Var.f31246a) && this.b.equals(rx4Var.b) && Intrinsics.d(this.c, rx4Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f31246a.hashCode() * 31)) * 31;
        gxo0 gxo0Var = this.c;
        return iHashCode + (gxo0Var == null ? 0 : gxo0Var.hashCode());
    }

    public final String toString() {
        return "AutoBetTabUiState(coefFieldUiState=" + this.f31246a + ", betSumFieldUiState=" + this.b + ", taxesUiModel=" + this.c + Separators.RPAREN;
    }
}
