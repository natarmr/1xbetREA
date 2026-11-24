package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yhh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f42637a;
    public final l7m0 b;
    public final boolean c;
    public final hfh0 d;

    public yhh0(imm immVar, l7m0 l7m0Var, boolean z, hfh0 hfh0Var) {
        immVar.getClass();
        l7m0Var.getClass();
        hfh0Var.getClass();
        this.f42637a = immVar;
        this.b = l7m0Var;
        this.c = z;
        this.d = hfh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhh0)) {
            return false;
        }
        yhh0 yhh0Var = (yhh0) obj;
        return Intrinsics.d(this.f42637a, yhh0Var.f42637a) && Intrinsics.d(this.b, yhh0Var.b) && this.c == yhh0Var.c && Intrinsics.d(this.d, yhh0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(h97.c(this.b, this.f42637a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "SearchUiState(navigationBarUiModel=" + this.f42637a + ", sportFilterUiModel=" + this.b + ", isFiltersVisible=" + this.c + ", searchContentUiState=" + this.d + Separators.RPAREN;
    }
}
