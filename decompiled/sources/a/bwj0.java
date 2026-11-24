package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bwj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw6 f3328a;
    public final gxo0 b;
    public final epd0 c;

    public bwj0(aw6 aw6Var, gxo0 gxo0Var, epd0 epd0Var) {
        this.f3328a = aw6Var;
        this.b = gxo0Var;
        this.c = epd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwj0)) {
            return false;
        }
        bwj0 bwj0Var = (bwj0) obj;
        return this.f3328a.equals(bwj0Var.f3328a) && Intrinsics.d(this.b, bwj0Var.b) && Intrinsics.d(this.c, bwj0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f3328a.hashCode() * 31;
        gxo0 gxo0Var = this.b;
        int iHashCode2 = (iHashCode + (gxo0Var == null ? 0 : gxo0Var.hashCode())) * 31;
        epd0 epd0Var = this.c;
        return iHashCode2 + (epd0Var != null ? epd0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SimpleBetTabUiState(betFieldContentUiState=" + this.f3328a + ", taxesUiModel=" + this.b + ", quickBetsUiModel=" + this.c + Separators.RPAREN;
    }
}
