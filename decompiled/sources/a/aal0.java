package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aal0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fex f532a;
    public final a4x b;
    public final zd90 c;
    public final zd90 d;
    public final zd90 e;

    public aal0(fex fexVar, i4 i4Var, zd90 zd90Var, zd90 zd90Var2, zd90 zd90Var3) {
        i4Var.getClass();
        this.f532a = fexVar;
        this.b = i4Var;
        this.c = zd90Var;
        this.d = zd90Var2;
        this.e = zd90Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aal0)) {
            return false;
        }
        aal0 aal0Var = (aal0) obj;
        return this.f532a == aal0Var.f532a && Intrinsics.d(this.b, aal0Var.b) && this.c.equals(aal0Var.c) && Intrinsics.d(this.d, aal0Var.d) && Intrinsics.d(this.e, aal0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cs0.b(this.b, this.f532a.hashCode() * 31, 31)) * 31;
        zd90 zd90Var = this.d;
        int iHashCode2 = (iHashCode + (zd90Var == null ? 0 : zd90Var.hashCode())) * 31;
        zd90 zd90Var2 = this.e;
        return iHashCode2 + (zd90Var2 != null ? zd90Var2.hashCode() : 0);
    }

    public final String toString() {
        return "SportGameBoardTableScore(inningType=" + this.f532a + ", periodList=" + this.b + ", totalCellUiModel=" + this.c + ", gameCellUiModel=" + this.d + ", pointCellUiModel=" + this.e + Separators.RPAREN;
    }
}
