package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eex f15402a;
    public final a4x b;
    public final yd90 c;
    public final yd90 d;
    public final yd90 e;

    public iul0(eex eexVar, i4 i4Var, yd90 yd90Var, yd90 yd90Var2, yd90 yd90Var3) {
        i4Var.getClass();
        this.f15402a = eexVar;
        this.b = i4Var;
        this.c = yd90Var;
        this.d = yd90Var2;
        this.e = yd90Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iul0)) {
            return false;
        }
        iul0 iul0Var = (iul0) obj;
        return this.f15402a == iul0Var.f15402a && Intrinsics.d(this.b, iul0Var.b) && this.c.equals(iul0Var.c) && Intrinsics.d(this.d, iul0Var.d) && Intrinsics.d(this.e, iul0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cs0.b(this.b, this.f15402a.hashCode() * 31, 31)) * 31;
        yd90 yd90Var = this.d;
        int iHashCode2 = (iHashCode + (yd90Var == null ? 0 : yd90Var.hashCode())) * 31;
        yd90 yd90Var2 = this.e;
        return iHashCode2 + (yd90Var2 != null ? yd90Var2.hashCode() : 0);
    }

    public final String toString() {
        return "SpreadSheetScoreUiModel(inningType=" + this.f15402a + ", periodList=" + this.b + ", totalCellUiModel=" + this.c + ", gameCellUiModel=" + this.d + ", pointCellUiModel=" + this.e + Separators.RPAREN;
    }
}
