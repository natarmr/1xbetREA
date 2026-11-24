package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fdt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f9374a;
    public final act0 b;

    public fdt0(l7m0 l7m0Var, act0 act0Var) {
        l7m0Var.getClass();
        this.f9374a = l7m0Var;
        this.b = act0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdt0)) {
            return false;
        }
        fdt0 fdt0Var = (fdt0) obj;
        return Intrinsics.d(this.f9374a, fdt0Var.f9374a) && this.b.equals(fdt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9374a.hashCode() * 31);
    }

    public final String toString() {
        return "UniversalChampUiState(toolbarState=" + this.f9374a + ", screenState=" + this.b + Separators.RPAREN;
    }
}
