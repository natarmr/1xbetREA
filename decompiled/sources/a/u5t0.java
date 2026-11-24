package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f35112a;
    public final l7m0 b;
    public final l7m0 c;
    public final l7m0 d;

    public u5t0(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, l7m0 l7m0Var4) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        l7m0Var3.getClass();
        l7m0Var4.getClass();
        this.f35112a = l7m0Var;
        this.b = l7m0Var2;
        this.c = l7m0Var3;
        this.d = l7m0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5t0)) {
            return false;
        }
        u5t0 u5t0Var = (u5t0) obj;
        return Intrinsics.d(this.f35112a, u5t0Var.f35112a) && Intrinsics.d(this.b, u5t0Var.b) && Intrinsics.d(this.c, u5t0Var.c) && Intrinsics.d(this.d, u5t0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h97.c(this.c, h97.c(this.b, this.f35112a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "UfcPostGameUiState(toolbarState=" + this.f35112a + ", gameBackgroundUiState=" + this.b + ", matchInfoUiState=" + this.c + ", contentUiState=" + this.d + Separators.RPAREN;
    }
}
