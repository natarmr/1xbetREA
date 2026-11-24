package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rma0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f30735a;
    public final a4x b;
    public final a4x c;
    public final gka0 d;

    public rma0(a4x a4xVar, a4x a4xVar2, a4x a4xVar3, gka0 gka0Var) {
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        this.f30735a = a4xVar;
        this.b = a4xVar2;
        this.c = a4xVar3;
        this.d = gka0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rma0)) {
            return false;
        }
        rma0 rma0Var = (rma0) obj;
        return Intrinsics.d(this.f30735a, rma0Var.f30735a) && Intrinsics.d(this.b, rma0Var.b) && Intrinsics.d(this.c, rma0Var.c) && this.d.equals(rma0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, this.f30735a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("PlayersStatisticsTableCellsUiModel(columnHeaderList=", this.f30735a, ", cellList=", this.b, ", rowHeaderList=");
        sbQ.append(this.c);
        sbQ.append(", cornerCell=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
