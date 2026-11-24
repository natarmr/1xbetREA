package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q0q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bxp0 f27915a;
    public final a4x b;

    public q0q0(bxp0 bxp0Var, i4 i4Var) {
        i4Var.getClass();
        this.f27915a = bxp0Var;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0q0)) {
            return false;
        }
        q0q0 q0q0Var = (q0q0) obj;
        return this.f27915a.equals(q0q0Var.f27915a) && Intrinsics.d(this.b, q0q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27915a.f3384a.hashCode() * 31);
    }

    public final String toString() {
        return "TennisWinLossUiModel(headerUiModel=" + this.f27915a + ", itemsUiModels=" + this.b + Separators.RPAREN;
    }
}
