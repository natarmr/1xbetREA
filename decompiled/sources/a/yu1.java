package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43246a;
    public final String b;
    public final bv1 c;
    public final qu1 d;
    public final boolean e;
    public final ql5 f;
    public final zvh0 g;
    public final dt1 h;
    public final dt1 i;
    public final dt1 j;
    public final dt1 k;
    public final int l;
    public final boolean m;
    public final String n;
    public final ot0 o;
    public final gu1 p;
    public final Map q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final String u;
    public final List v;
    public final Map w;
    public final Set x;
    public final Set y;

    public yu1(long j, String str, bv1 bv1Var, qu1 qu1Var, boolean z, ql5 ql5Var, zvh0 zvh0Var, dt1 dt1Var, dt1 dt1Var2, dt1 dt1Var3, dt1 dt1Var4, int i, boolean z2, String str2, ot0 ot0Var, gu1 gu1Var, Map map, boolean z3, boolean z4, boolean z5, String str3, List list, Map map2, Set set, Set set2) {
        bv1Var.getClass();
        list.getClass();
        set.getClass();
        set2.getClass();
        this.f43246a = j;
        this.b = str;
        this.c = bv1Var;
        this.d = qu1Var;
        this.e = z;
        this.f = ql5Var;
        this.g = zvh0Var;
        this.h = dt1Var;
        this.i = dt1Var2;
        this.j = dt1Var3;
        this.k = dt1Var4;
        this.l = i;
        this.m = z2;
        this.n = str2;
        this.o = ot0Var;
        this.p = gu1Var;
        this.q = map;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.u = str3;
        this.v = list;
        this.w = map2;
        this.x = set;
        this.y = set2;
    }

    public static yu1 a(yu1 yu1Var, bv1 bv1Var, boolean z, ql5 ql5Var, dt1 dt1Var, dt1 dt1Var2, dt1 dt1Var3, dt1 dt1Var4, gu1 gu1Var, LinkedHashMap linkedHashMap, boolean z2, boolean z3, boolean z4, String str, List list, Map map, Set set, LinkedHashSet linkedHashSet, int i) {
        long j = yu1Var.f43246a;
        String str2 = yu1Var.b;
        bv1 bv1Var2 = (i & 4) != 0 ? yu1Var.c : bv1Var;
        qu1 qu1Var = yu1Var.d;
        boolean z5 = (i & 16) != 0 ? yu1Var.e : z;
        ql5 ql5Var2 = (i & 32) != 0 ? yu1Var.f : ql5Var;
        zvh0 zvh0Var = yu1Var.g;
        dt1 dt1Var5 = (i & 128) != 0 ? yu1Var.h : dt1Var;
        dt1 dt1Var6 = (i & 256) != 0 ? yu1Var.i : dt1Var2;
        dt1 dt1Var7 = (i & 512) != 0 ? yu1Var.j : dt1Var3;
        dt1 dt1Var8 = (i & 1024) != 0 ? yu1Var.k : dt1Var4;
        int i2 = yu1Var.l;
        boolean z6 = z5;
        bv1 bv1Var3 = bv1Var2;
        ql5 ql5Var3 = ql5Var2;
        dt1 dt1Var9 = dt1Var5;
        dt1 dt1Var10 = dt1Var6;
        dt1 dt1Var11 = dt1Var7;
        dt1 dt1Var12 = dt1Var8;
        boolean z7 = yu1Var.m;
        String str3 = yu1Var.n;
        ot0 ot0Var = yu1Var.o;
        gu1 gu1Var2 = (i & 32768) != 0 ? yu1Var.p : gu1Var;
        Map map2 = (i & 65536) != 0 ? yu1Var.q : linkedHashMap;
        boolean z8 = (i & 131072) != 0 ? yu1Var.r : z2;
        boolean z9 = (i & 262144) != 0 ? yu1Var.s : z3;
        boolean z10 = (i & 524288) != 0 ? yu1Var.t : z4;
        String str4 = (i & 1048576) != 0 ? yu1Var.u : str;
        List list2 = (i & 2097152) != 0 ? yu1Var.v : list;
        Map map3 = (i & 4194304) != 0 ? yu1Var.w : map;
        Set set2 = (i & 8388608) != 0 ? yu1Var.x : set;
        Set set3 = (i & 16777216) != 0 ? yu1Var.y : linkedHashSet;
        yu1Var.getClass();
        bv1Var3.getClass();
        str4.getClass();
        list2.getClass();
        map3.getClass();
        set2.getClass();
        set3.getClass();
        return new yu1(j, str2, bv1Var3, qu1Var, z6, ql5Var3, zvh0Var, dt1Var9, dt1Var10, dt1Var11, dt1Var12, i2, z7, str3, ot0Var, gu1Var2, map2, z8, z9, z10, str4, list2, map3, set2, set3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu1)) {
            return false;
        }
        yu1 yu1Var = (yu1) obj;
        return this.f43246a == yu1Var.f43246a && this.b.equals(yu1Var.b) && this.c == yu1Var.c && this.d == yu1Var.d && this.e == yu1Var.e && Intrinsics.d(this.f, yu1Var.f) && this.g == yu1Var.g && this.h.equals(yu1Var.h) && this.i.equals(yu1Var.i) && this.j.equals(yu1Var.j) && this.k.equals(yu1Var.k) && this.l == yu1Var.l && this.m == yu1Var.m && this.n.equals(yu1Var.n) && this.o == yu1Var.o && Intrinsics.d(this.p, yu1Var.p) && this.q.equals(yu1Var.q) && this.r == yu1Var.r && this.s == yu1Var.s && this.t == yu1Var.t && this.u.equals(yu1Var.u) && Intrinsics.d(this.v, yu1Var.v) && this.w.equals(yu1Var.w) && Intrinsics.d(this.x, yu1Var.x) && Intrinsics.d(this.y, yu1Var.y);
    }

    public final int hashCode() {
        int iE = brm0.e((this.d.hashCode() + ((this.c.hashCode() + ua80.b(Long.hashCode(this.f43246a) * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        ql5 ql5Var = this.f;
        int iHashCode = (this.o.hashCode() + ua80.b(brm0.e(twn.a(this.l, (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((iE + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31, this.m), 31, this.n)) * 31;
        gu1 gu1Var = this.p;
        return this.y.hashCode() + ohs0.g(this.x, ohs0.f(this.w, dw9.a(ua80.b(brm0.e(brm0.e(brm0.e(ohs0.f(this.q, (iHashCode + (gu1Var != null ? gu1Var.hashCode() : 0)) * 31, 31), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f43246a, "AggregatorTournamentFullInfoState(tournamentId=", ", tournamentTitle=", this.b);
        sbO.append(", selectedTab=");
        sbO.append(this.c);
        sbO.append(", screenStyle=");
        sbO.append(this.d);
        sbO.append(", isLoggedIn=");
        sbO.append(this.e);
        sbO.append(", balance=");
        sbO.append(this.f);
        sbO.append(", segmentControlStyleModel=");
        sbO.append(this.g);
        sbO.append(", descriptionState=");
        sbO.append(this.h);
        sbO.append(", gamesState=");
        sbO.append(this.i);
        sbO.append(", resultsState=");
        sbO.append(this.j);
        sbO.append(", conditionsState=");
        sbO.append(this.k);
        sbO.append(", lottieTypeId=");
        sbO.append(this.l);
        hne.u(", isVirtual=", ", aggregatorProviderStyle=", this.n, sbO, this.m);
        sbO.append(", aggregatorGameCardCollectionStyleType=");
        sbO.append(this.o);
        sbO.append(", tournamentFullInfo=");
        sbO.append(this.p);
        sbO.append(", gamesMap=");
        sbO.append(this.q);
        sbO.append(", isRefreshingByTimer=");
        sbO.append(this.r);
        w6x.A(", isOpenSingleGameOnStart=", ", isBottomButtonLoading=", sbO, this.s, this.t);
        ua80.t(", currencySymbol=", this.u, ", conditionGames=", sbO, this.v);
        sbO.append(", conditionStageGames=");
        sbO.append(this.w);
        sbO.append(", favoriteGameIds=");
        sbO.append(this.x);
        sbO.append(", expandedConditionKeys=");
        sbO.append(this.y);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
