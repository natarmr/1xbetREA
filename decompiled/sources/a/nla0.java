package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nla0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f23717a;
    public final a4x b;
    public final a4x c;
    public final qka0 d;

    public nla0(a4x a4xVar, a4x a4xVar2, a4x a4xVar3, qka0 qka0Var) {
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        this.f23717a = a4xVar;
        this.b = a4xVar2;
        this.c = a4xVar3;
        this.d = qka0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nla0)) {
            return false;
        }
        nla0 nla0Var = (nla0) obj;
        return Intrinsics.d(this.f23717a, nla0Var.f23717a) && Intrinsics.d(this.b, nla0Var.b) && Intrinsics.d(this.c, nla0Var.c) && this.d.equals(nla0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, this.f23717a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("PlayersStatisticsCricketTableCellsUiModel(columnHeaderList=", this.f23717a, ", cellList=", this.b, ", rowHeaderList=");
        sbQ.append(this.c);
        sbQ.append(", cornerCell=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
