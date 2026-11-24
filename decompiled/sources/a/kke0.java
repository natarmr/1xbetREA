package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kke0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f18434a;
    public final a4x b;
    public final a4x c;
    public final ake0 d;

    public kke0(i4 i4Var, i4 i4Var2, i4 i4Var3, ake0 ake0Var) {
        i4Var.getClass();
        i4Var2.getClass();
        i4Var3.getClass();
        this.f18434a = i4Var;
        this.b = i4Var2;
        this.c = i4Var3;
        this.d = ake0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kke0)) {
            return false;
        }
        kke0 kke0Var = (kke0) obj;
        return Intrinsics.d(this.f18434a, kke0Var.f18434a) && Intrinsics.d(this.b, kke0Var.b) && Intrinsics.d(this.c, kke0Var.c) && this.d.equals(kke0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, this.f18434a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("RefereeTeamsTableCellsUiModel(columnHeaderUiModelList=", this.f18434a, ", cellList=", this.b, ", rowHeaderList=");
        sbQ.append(this.c);
        sbQ.append(", cornerCell=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
