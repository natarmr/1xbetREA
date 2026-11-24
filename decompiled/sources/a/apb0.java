package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class apb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f1244a;
    public final l7m0 b;
    public final l7m0 c;

    public apb0(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        l7m0Var3.getClass();
        this.f1244a = l7m0Var;
        this.b = l7m0Var2;
        this.c = l7m0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apb0)) {
            return false;
        }
        apb0 apb0Var = (apb0) obj;
        return Intrinsics.d(this.f1244a, apb0Var.f1244a) && Intrinsics.d(this.b, apb0Var.b) && Intrinsics.d(this.c, apb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h97.c(this.b, this.f1244a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PowerBetUiState(fullScreenUiState=" + this.f1244a + ", powerBetUiStateModel=" + this.b + ", headerUiState=" + this.c + Separators.RPAREN;
    }
}
