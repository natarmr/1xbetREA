package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b7c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bzc0 f2101a;
    public final xyc0 b;
    public final l85 c;
    public final a4x d;

    public b7c0(bzc0 bzc0Var, xyc0 xyc0Var, l85 l85Var, i4 i4Var) {
        this.f2101a = bzc0Var;
        this.b = xyc0Var;
        this.c = l85Var;
        this.d = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7c0)) {
            return false;
        }
        b7c0 b7c0Var = (b7c0) obj;
        return this.f2101a.equals(b7c0Var.f2101a) && this.b == b7c0Var.b && Intrinsics.d(this.c, b7c0Var.c) && Intrinsics.d(this.d, b7c0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f2101a.hashCode() * 31)) * 31;
        l85 l85Var = this.c;
        int iHashCode2 = (iHashCode + (l85Var == null ? 0 : l85Var.hashCode())) * 31;
        a4x a4xVar = this.d;
        return iHashCode2 + (a4xVar != null ? a4xVar.hashCode() : 0);
    }

    public final String toString() {
        return "PromoBetTabUiState(promocodeFieldUiState=" + this.f2101a + ", promocodeFieldStyle=" + this.b + ", availablePromocodeUiModel=" + this.c + ", promoInfoList=" + this.d + Separators.RPAREN;
    }
}
