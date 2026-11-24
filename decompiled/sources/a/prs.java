package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class prs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0s f27481a;
    public final d0k0 b;

    public prs(r0s r0sVar, d0k0 d0k0Var) {
        this.f27481a = r0sVar;
        this.b = d0k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prs)) {
            return false;
        }
        prs prsVar = (prs) obj;
        return this.f27481a.equals(prsVar.f27481a) && Intrinsics.d(this.b, prsVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f27481a.hashCode() * 31;
        d0k0 d0k0Var = this.b;
        return iHashCode + (d0k0Var == null ? 0 : d0k0Var.hashCode());
    }

    public final String toString() {
        return "GameScreenUiModel(gameCardsUiModel=" + this.f27481a + ", simulationNavigateUiModel=" + this.b + Separators.RPAREN;
    }
}
