package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f39292a;
    public final imm b;
    public final mi5 c;
    public final int d;

    public wk5(imm immVar, imm immVar2, mi5 mi5Var, int i) {
        immVar.getClass();
        immVar2.getClass();
        mi5Var.getClass();
        this.f39292a = immVar;
        this.b = immVar2;
        this.c = mi5Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk5)) {
            return false;
        }
        wk5 wk5Var = (wk5) obj;
        return Intrinsics.d(this.f39292a, wk5Var.f39292a) && Intrinsics.d(this.b, wk5Var.b) && Intrinsics.d(this.c, wk5Var.c) && this.d == wk5Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + h97.a(this.b, this.f39292a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SinglePageBalanceManagementUiState(expandedTopBarNavigationBarUiModel=" + this.f39292a + ", collapsedTopBarNavigationBarUiModel=" + this.b + ", balanceManagementContentUiState=" + this.c + ", prefetchDistance=" + this.d + Separators.RPAREN;
    }
}
