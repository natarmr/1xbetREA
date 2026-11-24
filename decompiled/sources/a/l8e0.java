package a;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l8e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19600a;
    public final boolean b;
    public final zdm0 c;
    public final nc5 d;
    public final eme e;
    public final HashMap f;
    public final h8e0 g;
    public final j6i0 h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public l8e0(boolean z, boolean z2, zdm0 zdm0Var, nc5 nc5Var, eme emeVar, HashMap map, h8e0 h8e0Var, j6i0 j6i0Var, int i, boolean z3, boolean z4) {
        this.f19600a = z;
        this.b = z2;
        this.c = zdm0Var;
        this.d = nc5Var;
        this.e = emeVar;
        this.f = map;
        this.g = h8e0Var;
        this.h = j6i0Var;
        this.i = i;
        this.j = z3;
        this.k = z4;
    }

    public static l8e0 a(l8e0 l8e0Var, boolean z, boolean z2, zdm0 zdm0Var, HashMap map, h8e0 h8e0Var, j6i0 j6i0Var, int i, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            z = l8e0Var.f19600a;
        }
        boolean z5 = z;
        boolean z6 = (i2 & 2) != 0 ? l8e0Var.b : z2;
        zdm0 zdm0Var2 = (i2 & 4) != 0 ? l8e0Var.c : zdm0Var;
        nc5 nc5Var = l8e0Var.d;
        eme emeVar = l8e0Var.e;
        HashMap map2 = (i2 & 32) != 0 ? l8e0Var.f : map;
        h8e0 h8e0Var2 = (i2 & 64) != 0 ? l8e0Var.g : h8e0Var;
        j6i0 j6i0Var2 = (i2 & 128) != 0 ? l8e0Var.h : j6i0Var;
        int i3 = (i2 & 256) != 0 ? l8e0Var.i : i;
        boolean z7 = (i2 & 512) != 0 ? l8e0Var.j : z3;
        boolean z8 = (i2 & 1024) != 0 ? l8e0Var.k : z4;
        l8e0Var.getClass();
        h8e0Var2.getClass();
        return new l8e0(z5, z6, zdm0Var2, nc5Var, emeVar, map2, h8e0Var2, j6i0Var2, i3, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8e0)) {
            return false;
        }
        l8e0 l8e0Var = (l8e0) obj;
        return this.f19600a == l8e0Var.f19600a && this.b == l8e0Var.b && Intrinsics.d(this.c, l8e0Var.c) && this.d.equals(l8e0Var.d) && this.e == l8e0Var.e && this.f.equals(l8e0Var.f) && this.g.equals(l8e0Var.g) && Intrinsics.d(this.h, l8e0Var.h) && this.i == l8e0Var.i && this.j == l8e0Var.j && this.k == l8e0Var.k;
    }

    public final int hashCode() {
        int iE = brm0.e(Boolean.hashCode(this.f19600a) * 31, 31, this.b);
        zdm0 zdm0Var = this.c;
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iE + (zdm0Var == null ? 0 : zdm0Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        j6i0 j6i0Var = this.h;
        return Boolean.hashCode(this.k) + brm0.e(twn.a(this.i, (iHashCode + (j6i0Var != null ? j6i0Var.hashCode() : 0)) * 31, 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("RatingTableState(isLoading=", ", hasError=", ", statisticHeaderUiModel=", this.f19600a, this.b);
        sbQ.append(this.c);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.d);
        sbQ.append(", coreHeaderModel=");
        sbQ.append(this.e);
        sbQ.append(", expandedRowMap=");
        sbQ.append(this.f);
        sbQ.append(", tableModel=");
        sbQ.append(this.g);
        sbQ.append(", selectorsModel=");
        sbQ.append(this.h);
        sbQ.append(", currentPage=");
        brm0.w(this.i, ", isLastPage=", ", isPageLoading=", sbQ, this.j);
        return rw2.p(sbQ, this.k, Separators.RPAREN);
    }
}
