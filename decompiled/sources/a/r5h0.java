package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r5h0 implements t5h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cex f29885a;
    public final ArrayList b;
    public final ggr0 c;
    public final w0s d;
    public final koa0 e;

    public r5h0(cex cexVar, ArrayList arrayList, ggr0 ggr0Var, w0s w0sVar, koa0 koa0Var) {
        this.f29885a = cexVar;
        this.b = arrayList;
        this.c = ggr0Var;
        this.d = w0sVar;
        this.e = koa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5h0)) {
            return false;
        }
        r5h0 r5h0Var = (r5h0) obj;
        return this.f29885a == r5h0Var.f29885a && this.b.equals(r5h0Var.b) && this.c.equals(r5h0Var.c) && Intrinsics.d(this.d, r5h0Var.d) && Intrinsics.d(this.e, r5h0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + twn.g(this.b, this.f29885a.hashCode() * 31, 31)) * 31;
        w0s w0sVar = this.d;
        int iHashCode2 = (iHashCode + (w0sVar == null ? 0 : w0sVar.hashCode())) * 31;
        koa0 koa0Var = this.e;
        return iHashCode2 + (koa0Var != null ? koa0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SpreadSheet(inningType=" + this.f29885a + ", periodList=" + this.b + ", totalCellUiModel=" + this.c + ", gameCellUiModel=" + this.d + ", pointCellUiModel=" + this.e + Separators.RPAREN;
    }
}
