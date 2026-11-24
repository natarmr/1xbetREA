package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qrd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f29205a;
    public final a4x b;
    public final a4x c;
    public final hsd0 d;

    public qrd0(i4 i4Var, a4x a4xVar, a4x a4xVar2, hsd0 hsd0Var) {
        i4Var.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f29205a = i4Var;
        this.b = a4xVar;
        this.c = a4xVar2;
        this.d = hsd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrd0)) {
            return false;
        }
        qrd0 qrd0Var = (qrd0) obj;
        return Intrinsics.d(this.f29205a, qrd0Var.f29205a) && Intrinsics.d(this.b, qrd0Var.b) && Intrinsics.d(this.c, qrd0Var.c) && this.d.equals(qrd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, this.f29205a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("RaceResultCellsUiModel(columnHeaderUiModelList=", this.f29205a, ", cellList=", this.b, ", rowHeaderList=");
        sbQ.append(this.c);
        sbQ.append(", cornerCell=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
