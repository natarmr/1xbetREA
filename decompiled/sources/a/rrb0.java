package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rrb0 implements ivw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f30975a;
    public final a4x b;

    public rrb0(a4x a4xVar, a4x a4xVar2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f30975a = a4xVar;
        this.b = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrb0)) {
            return false;
        }
        rrb0 rrb0Var = (rrb0) obj;
        return Intrinsics.d(this.f30975a, rrb0Var.f30975a) && Intrinsics.d(this.b, rrb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30975a.hashCode() * 31);
    }

    public final String toString() {
        return "PreMatchUiState(periodsListUiModel=" + this.f30975a + ", tabsTitlesListUiModel=" + this.b + Separators.RPAREN;
    }
}
