package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xpu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wpu0 f41284a;
    public final spu0 b;

    public xpu0(wpu0 wpu0Var, spu0 spu0Var) {
        this.f41284a = wpu0Var;
        this.b = spu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpu0)) {
            return false;
        }
        xpu0 xpu0Var = (xpu0) obj;
        return this.f41284a.equals(xpu0Var.f41284a) && this.b.equals(xpu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41284a.hashCode() * 31);
    }

    public final String toString() {
        return "VirtualGameCategoryMainUiState(toolbarState=" + this.f41284a + ", screenState=" + this.b + Separators.RPAREN;
    }
}
