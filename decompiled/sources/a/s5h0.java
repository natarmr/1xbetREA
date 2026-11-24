package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s5h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gex f31653a;
    public final ArrayList b;
    public final hgr0 c;
    public final x0s d;
    public final loa0 e;

    public /* synthetic */ s5h0(gex gexVar, ArrayList arrayList, hgr0 hgr0Var, loa0 loa0Var, int i) {
        this(gexVar, arrayList, hgr0Var, (x0s) null, (i & 16) != 0 ? null : loa0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5h0)) {
            return false;
        }
        s5h0 s5h0Var = (s5h0) obj;
        return this.f31653a == s5h0Var.f31653a && Intrinsics.d(this.b, s5h0Var.b) && Intrinsics.d(this.c, s5h0Var.c) && Intrinsics.d(this.d, s5h0Var.d) && Intrinsics.d(this.e, s5h0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + twn.g(this.b, this.f31653a.hashCode() * 31, 31)) * 31;
        x0s x0sVar = this.d;
        int iHashCode2 = (iHashCode + (x0sVar == null ? 0 : x0sVar.hashCode())) * 31;
        loa0 loa0Var = this.e;
        return iHashCode2 + (loa0Var != null ? loa0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SpreadSheet(inningType=" + this.f31653a + ", periodList=" + this.b + ", totalCellUiModel=" + this.c + ", gameCellUiModel=" + this.d + ", pointCellUiModel=" + this.e + Separators.RPAREN;
    }

    public s5h0(gex gexVar, ArrayList arrayList, hgr0 hgr0Var, x0s x0sVar, loa0 loa0Var) {
        this.f31653a = gexVar;
        this.b = arrayList;
        this.c = hgr0Var;
        this.d = x0sVar;
        this.e = loa0Var;
    }
}
