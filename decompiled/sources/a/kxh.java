package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kxh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f19055a;
    public final a4x b;
    public final a4x c;
    public final wwh d;

    public kxh(i4 i4Var, a4x a4xVar, a4x a4xVar2, wwh wwhVar) {
        i4Var.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f19055a = i4Var;
        this.b = a4xVar;
        this.c = a4xVar2;
        this.d = wwhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxh)) {
            return false;
        }
        kxh kxhVar = (kxh) obj;
        return Intrinsics.d(this.f19055a, kxhVar.f19055a) && Intrinsics.d(this.b, kxhVar.b) && Intrinsics.d(this.c, kxhVar.c) && this.d.equals(kxhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, this.f19055a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("CyclingResultsTableCellsUiModel(columnHeaderUiModelList=", this.f19055a, ", cellList=", this.b, ", rowHeaderList=");
        sbQ.append(this.c);
        sbQ.append(", cornerCell=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
