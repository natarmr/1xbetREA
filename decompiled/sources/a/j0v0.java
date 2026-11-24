package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15700a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final Map f;
    public final ql5 g;
    public final ql5 h;
    public final ql5 i;
    public final long j;
    public final boolean k;

    public j0v0(boolean z, boolean z2, boolean z3, boolean z4, List list, Map map, ql5 ql5Var, ql5 ql5Var2, ql5 ql5Var3, long j, boolean z5) {
        list.getClass();
        this.f15700a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
        this.f = map;
        this.g = ql5Var;
        this.h = ql5Var2;
        this.i = ql5Var3;
        this.j = j;
        this.k = z5;
    }

    public static j0v0 a(j0v0 j0v0Var, boolean z, boolean z2, boolean z3, boolean z4, List list, Map map, ql5 ql5Var, ql5 ql5Var2, ql5 ql5Var3, long j, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = j0v0Var.f15700a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = j0v0Var.b;
        }
        boolean z7 = z2;
        boolean z8 = (i & 4) != 0 ? j0v0Var.c : z3;
        boolean z9 = (i & 8) != 0 ? j0v0Var.d : z4;
        List list2 = (i & 16) != 0 ? j0v0Var.e : list;
        Map map2 = (i & 32) != 0 ? j0v0Var.f : map;
        ql5 ql5Var4 = (i & 64) != 0 ? j0v0Var.g : ql5Var;
        ql5 ql5Var5 = (i & 128) != 0 ? j0v0Var.h : ql5Var2;
        ql5 ql5Var6 = (i & 256) != 0 ? j0v0Var.i : ql5Var3;
        long j2 = (i & 512) != 0 ? j0v0Var.j : j;
        boolean z10 = (i & 1024) != 0 ? j0v0Var.k : z5;
        j0v0Var.getClass();
        list2.getClass();
        map2.getClass();
        return new j0v0(z6, z7, z8, z9, list2, map2, ql5Var4, ql5Var5, ql5Var6, j2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0v0)) {
            return false;
        }
        j0v0 j0v0Var = (j0v0) obj;
        return this.f15700a == j0v0Var.f15700a && this.b == j0v0Var.b && this.c == j0v0Var.c && this.d == j0v0Var.d && Intrinsics.d(this.e, j0v0Var.e) && this.f.equals(j0v0Var.f) && Intrinsics.d(this.g, j0v0Var.g) && Intrinsics.d(this.h, j0v0Var.h) && Intrinsics.d(this.i, j0v0Var.i) && this.j == j0v0Var.j && this.k == j0v0Var.k;
    }

    public final int hashCode() {
        int iF = ohs0.f(this.f, dw9.a(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f15700a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
        ql5 ql5Var = this.g;
        int iHashCode = (iF + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31;
        ql5 ql5Var2 = this.h;
        int iHashCode2 = (iHashCode + (ql5Var2 == null ? 0 : ql5Var2.hashCode())) * 31;
        ql5 ql5Var3 = this.i;
        return Boolean.hashCode(this.k) + rw2.b((iHashCode2 + (ql5Var3 != null ? ql5Var3.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("WalletsState(isLoading=", ", isError=", ", hasAddWalletAccess=", this.f15700a, this.b);
        ua80.u(", enablePullToRefresh=", ", walletsItems=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", balanceMap=");
        sbQ.append(this.f);
        sbQ.append(", itemToDelete=");
        sbQ.append(this.g);
        sbQ.append(", lastSelectedBalance=");
        sbQ.append(this.h);
        sbQ.append(", bonusAccountBalance=");
        sbQ.append(this.i);
        sbQ.append(", currentCurrencyId=");
        sbQ.append(this.j);
        return f140.n(sbQ, ", isRefreshing=", this.k, Separators.RPAREN);
    }
}
