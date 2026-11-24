package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class rs80 {
    public final Pair A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31020a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final ai0 i;
    public final kg j;
    public final ot0 k;
    public final hr10 l;
    public final String m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final AggregatorScreenModel q;
    public final List r;
    public final Set s;
    public final pr80 t;
    public final ql5 u;
    public final long v;
    public final wr80 w;
    public final List x;
    public final List y;
    public final boolean z;

    public rs80(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, ai0 ai0Var, kg kgVar, ot0 ot0Var, hr10 hr10Var, String str, String str2, boolean z8, boolean z9, AggregatorScreenModel aggregatorScreenModel, List list, Set set, pr80 pr80Var, ql5 ql5Var, long j, wr80 wr80Var, List list2, List list3, boolean z10, Pair pair) {
        kgVar.getClass();
        list.getClass();
        set.getClass();
        list2.getClass();
        list3.getClass();
        this.f31020a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = i;
        this.i = ai0Var;
        this.j = kgVar;
        this.k = ot0Var;
        this.l = hr10Var;
        this.m = str;
        this.n = str2;
        this.o = z8;
        this.p = z9;
        this.q = aggregatorScreenModel;
        this.r = list;
        this.s = set;
        this.t = pr80Var;
        this.u = ql5Var;
        this.v = j;
        this.w = wr80Var;
        this.x = list2;
        this.y = list3;
        this.z = z10;
        this.A = pair;
    }

    public static rs80 a(rs80 rs80Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, String str2, AggregatorScreenModel aggregatorScreenModel, List list, Set set, pr80 pr80Var, ql5 ql5Var, wr80 wr80Var, List list2, List list3, boolean z8, Pair pair, int i) {
        boolean z9 = (i & 1) != 0 ? rs80Var.f31020a : z;
        boolean z10 = (i & 2) != 0 ? rs80Var.b : z2;
        boolean z11 = (i & 4) != 0 ? rs80Var.c : z3;
        boolean z12 = (i & 8) != 0 ? rs80Var.d : z4;
        boolean z13 = (i & 16) != 0 ? rs80Var.e : z5;
        boolean z14 = (i & 32) != 0 ? rs80Var.f : z6;
        boolean z15 = (i & 64) != 0 ? rs80Var.g : z7;
        int i2 = rs80Var.h;
        ai0 ai0Var = rs80Var.i;
        kg kgVar = rs80Var.j;
        ot0 ot0Var = rs80Var.k;
        hr10 hr10Var = rs80Var.l;
        String str3 = (i & 4096) != 0 ? rs80Var.m : str;
        String str4 = (i & 8192) != 0 ? rs80Var.n : str2;
        boolean z16 = rs80Var.o;
        boolean z17 = rs80Var.p;
        AggregatorScreenModel aggregatorScreenModel2 = (i & 65536) != 0 ? rs80Var.q : aggregatorScreenModel;
        List list4 = (i & 131072) != 0 ? rs80Var.r : list;
        Set set2 = (i & 262144) != 0 ? rs80Var.s : set;
        pr80 pr80Var2 = (i & 524288) != 0 ? rs80Var.t : pr80Var;
        ql5 ql5Var2 = (i & 1048576) != 0 ? rs80Var.u : ql5Var;
        long j = rs80Var.v;
        wr80 wr80Var2 = (i & 4194304) != 0 ? rs80Var.w : wr80Var;
        List list5 = (i & 8388608) != 0 ? rs80Var.x : list2;
        List list6 = (i & 16777216) != 0 ? rs80Var.y : list3;
        boolean z18 = (i & 33554432) != 0 ? rs80Var.z : z8;
        Pair pair2 = (i & 67108864) != 0 ? rs80Var.A : pair;
        rs80Var.getClass();
        kgVar.getClass();
        list4.getClass();
        set2.getClass();
        wr80Var2.getClass();
        list5.getClass();
        list6.getClass();
        return new rs80(z9, z10, z11, z12, z13, z14, z15, i2, ai0Var, kgVar, ot0Var, hr10Var, str3, str4, z16, z17, aggregatorScreenModel2, list4, set2, pr80Var2, ql5Var2, j, wr80Var2, list5, list6, z18, pair2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs80)) {
            return false;
        }
        rs80 rs80Var = (rs80) obj;
        return this.f31020a == rs80Var.f31020a && this.b == rs80Var.b && this.c == rs80Var.c && this.d == rs80Var.d && this.e == rs80Var.e && this.f == rs80Var.f && this.g == rs80Var.g && this.h == rs80Var.h && this.i == rs80Var.i && this.j == rs80Var.j && this.k == rs80Var.k && this.l == rs80Var.l && Intrinsics.d(this.m, rs80Var.m) && Intrinsics.d(this.n, rs80Var.n) && this.o == rs80Var.o && this.p == rs80Var.p && Intrinsics.d(this.q, rs80Var.q) && Intrinsics.d(this.r, rs80Var.r) && Intrinsics.d(this.s, rs80Var.s) && this.t.equals(rs80Var.t) && Intrinsics.d(this.u, rs80Var.u) && this.v == rs80Var.v && this.w.equals(rs80Var.w) && Intrinsics.d(this.x, rs80Var.x) && Intrinsics.d(this.y, rs80Var.y) && this.z == rs80Var.z && this.A.equals(rs80Var.A);
    }

    public final int hashCode() {
        int iHashCode = (this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + twn.a(this.h, brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f31020a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.m;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int iE = brm0.e(brm0.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.o), 31, this.p);
        AggregatorScreenModel aggregatorScreenModel = this.q;
        int iHashCode3 = (this.t.hashCode() + ohs0.g(this.s, dw9.a((iE + (aggregatorScreenModel == null ? 0 : aggregatorScreenModel.hashCode())) * 31, 31, this.r), 31)) * 31;
        ql5 ql5Var = this.u;
        return this.A.hashCode() + brm0.e(dw9.a(dw9.a((this.w.hashCode() + rw2.b((iHashCode3 + (ql5Var != null ? ql5Var.hashCode() : 0)) * 31, 31, this.v)) * 31, 31, this.x), 31, this.y), 31, this.z);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PartTypeOneState(isLoading=", ", isError=", ", isEmpty=", this.f31020a, this.b);
        ua80.u(", isAuthorized=", ", lastConnection=", sbQ, this.c, this.d);
        ua80.u(", isErrorPromotedCategories=", ", isLoadFilters=", sbQ, this.e, this.f);
        ua80.q(this.h, ", lottieType=", ", aggregatorFilterType=", sbQ, this.g);
        sbQ.append(this.i);
        sbQ.append(", accountSelectionStyle=");
        sbQ.append(this.j);
        sbQ.append(", gameCardCollectionStyle=");
        sbQ.append(this.k);
        sbQ.append(", bannerCollectionStyle=");
        sbQ.append(this.l);
        sbQ.append(", sortingOptionAttribute=");
        f140.v(sbQ, this.m, ", sortingOptionDirection=", this.n, ", isVirtual=");
        ua80.u(", isNewBanners=", ", aggregatorScreenModel=", sbQ, this.o, this.p);
        sbQ.append(this.q);
        sbQ.append(", games=");
        sbQ.append(this.r);
        sbQ.append(", favorites=");
        sbQ.append(this.s);
        sbQ.append(", bannerModel=");
        sbQ.append(this.t);
        sbQ.append(", balanceModel=");
        sbQ.append(this.u);
        sbQ.append(", partitionId=");
        sbQ.append(this.v);
        sbQ.append(", partTypeOneFilterModel=");
        sbQ.append(this.w);
        sbQ.append(", allFilters=");
        sbQ.append(this.x);
        esw0.k(sbQ, ", allProviders=", this.y, ", hasCheckedFilters=", this.z);
        sbQ.append(", isAllChipChecked=");
        sbQ.append(this.A);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
