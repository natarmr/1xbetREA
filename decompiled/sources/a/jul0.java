package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dex f17160a;
    public final a4x b;
    public final xd90 c;
    public final xd90 d;
    public final xd90 e;

    public jul0(dex dexVar, i4 i4Var, xd90 xd90Var, xd90 xd90Var2, xd90 xd90Var3) {
        i4Var.getClass();
        this.f17160a = dexVar;
        this.b = i4Var;
        this.c = xd90Var;
        this.d = xd90Var2;
        this.e = xd90Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jul0)) {
            return false;
        }
        jul0 jul0Var = (jul0) obj;
        return this.f17160a == jul0Var.f17160a && Intrinsics.d(this.b, jul0Var.b) && this.c.equals(jul0Var.c) && Intrinsics.d(this.d, jul0Var.d) && Intrinsics.d(this.e, jul0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cs0.b(this.b, this.f17160a.hashCode() * 31, 31)) * 31;
        xd90 xd90Var = this.d;
        int iHashCode2 = (iHashCode + (xd90Var == null ? 0 : xd90Var.hashCode())) * 31;
        xd90 xd90Var2 = this.e;
        return iHashCode2 + (xd90Var2 != null ? xd90Var2.hashCode() : 0);
    }

    public final String toString() {
        return "SpreadSheetScoreUiModel(inningType=" + this.f17160a + ", periodList=" + this.b + ", totalCellUiModel=" + this.c + ", gameCellUiModel=" + this.d + ", pointCellUiModel=" + this.e + Separators.RPAREN;
    }
}
