package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17507a;
    public final kg b;
    public final ql5 c;

    public k170(boolean z, kg kgVar, ql5 ql5Var) {
        this.f17507a = z;
        this.b = kgVar;
        this.c = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k170)) {
            return false;
        }
        k170 k170Var = (k170) obj;
        return this.f17507a == k170Var.f17507a && this.b == k170Var.b && Intrinsics.d(this.c, k170Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f17507a) * 31;
        kg kgVar = this.b;
        int iHashCode2 = (iHashCode + (kgVar == null ? 0 : kgVar.hashCode())) * 31;
        ql5 ql5Var = this.c;
        return iHashCode2 + (ql5Var != null ? ql5Var.hashCode() : 0);
    }

    public final String toString() {
        return "OneXGamesPromoBalanceState(authorized=" + this.f17507a + ", accountSelectionStyleConfigType=" + this.b + ", balanceModel=" + this.c + Separators.RPAREN;
    }
}
