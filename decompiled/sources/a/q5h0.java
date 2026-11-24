package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q5h0 implements t5h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28152a;
    public final ggr0 b;
    public final tsq c;
    public final tsq d;
    public final tsq e;

    public q5h0(ArrayList arrayList, ggr0 ggr0Var, tsq tsqVar, tsq tsqVar2, tsq tsqVar3) {
        this.f28152a = arrayList;
        this.b = ggr0Var;
        this.c = tsqVar;
        this.d = tsqVar2;
        this.e = tsqVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5h0)) {
            return false;
        }
        q5h0 q5h0Var = (q5h0) obj;
        return this.f28152a.equals(q5h0Var.f28152a) && this.b.equals(q5h0Var.b) && Intrinsics.d(this.c, q5h0Var.c) && Intrinsics.d(this.d, q5h0Var.d) && Intrinsics.d(this.e, q5h0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f28152a.hashCode() * 31)) * 31;
        tsq tsqVar = this.c;
        int iHashCode2 = (iHashCode + (tsqVar == null ? 0 : tsqVar.hashCode())) * 31;
        tsq tsqVar2 = this.d;
        int iHashCode3 = (iHashCode2 + (tsqVar2 == null ? 0 : tsqVar2.hashCode())) * 31;
        tsq tsqVar3 = this.e;
        return iHashCode3 + (tsqVar3 != null ? tsqVar3.hashCode() : 0);
    }

    public final String toString() {
        return "Football(periodList=" + this.f28152a + ", totalCellUiModel=" + this.b + ", redCards=" + this.c + ", yellowCards=" + this.d + ", corners=" + this.e + Separators.RPAREN;
    }
}
