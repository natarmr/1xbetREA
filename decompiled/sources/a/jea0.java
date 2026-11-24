package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f16365a;
    public final xda0 b;

    public jea0(l7m0 l7m0Var, xda0 xda0Var) {
        l7m0Var.getClass();
        this.f16365a = l7m0Var;
        this.b = xda0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jea0)) {
            return false;
        }
        jea0 jea0Var = (jea0) obj;
        return Intrinsics.d(this.f16365a, jea0Var.f16365a) && this.b.equals(jea0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16365a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerTransfersUiState(toolbarState=" + this.f16365a + ", screenState=" + this.b + Separators.RPAREN;
    }
}
