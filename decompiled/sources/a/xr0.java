package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f41345a;
    public final gq0 b;

    public xr0(imm immVar, gq0 gq0Var) {
        immVar.getClass();
        this.f41345a = immVar;
        this.b = gq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0)) {
            return false;
        }
        xr0 xr0Var = (xr0) obj;
        return Intrinsics.d(this.f41345a, xr0Var.f41345a) && this.b.equals(xr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41345a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorFiltersUiState(dsNavigationBarUiModel=" + this.f41345a + ", contentUiState=" + this.b + Separators.RPAREN;
    }
}
