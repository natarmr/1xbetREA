package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jp6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16886a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final List f;
    public final List g;
    public final Set h;
    public final List i;
    public final boolean j;
    public final Map k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final jg7 o;
    public final boolean p;
    public final Long q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    static {
        jg7 jg7Var = jg7.i;
    }

    public jp6(boolean z, boolean z2, boolean z3, boolean z4, List list, List list2, List list3, Set set, List list4, boolean z5, Map map, boolean z6, boolean z7, boolean z8, jg7 jg7Var, boolean z9, Long l, boolean z10, boolean z11, boolean z12, boolean z13) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        set.getClass();
        list4.getClass();
        jg7Var.getClass();
        this.f16886a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = set;
        this.i = list4;
        this.j = z5;
        this.k = map;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = jg7Var;
        this.p = z9;
        this.q = l;
        this.r = z10;
        this.s = z11;
        this.t = z12;
        this.u = z13;
    }

    public static jp6 a(jp6 jp6Var, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, ArrayList arrayList2, List list, LinkedHashSet linkedHashSet, List list2, boolean z5, Map map, boolean z6, boolean z7, boolean z8, jg7 jg7Var, boolean z9, Long l, boolean z10, int i) {
        boolean z11 = (i & 1) != 0 ? jp6Var.f16886a : z;
        boolean z12 = (i & 2) != 0 ? jp6Var.b : z2;
        boolean z13 = (i & 4) != 0 ? jp6Var.c : z3;
        boolean z14 = (i & 8) != 0 ? jp6Var.d : z4;
        List list3 = (i & 16) != 0 ? jp6Var.e : arrayList;
        List list4 = (i & 32) != 0 ? jp6Var.f : arrayList2;
        List list5 = (i & 64) != 0 ? jp6Var.g : list;
        Set set = (i & 128) != 0 ? jp6Var.h : linkedHashSet;
        List list6 = (i & 256) != 0 ? jp6Var.i : list2;
        boolean z15 = (i & 512) != 0 ? jp6Var.j : z5;
        Map map2 = (i & 1024) != 0 ? jp6Var.k : map;
        boolean z16 = (i & 2048) != 0 ? jp6Var.l : z6;
        boolean z17 = (i & 4096) != 0 ? jp6Var.m : z7;
        boolean z18 = (i & 8192) != 0 ? jp6Var.n : z8;
        jg7 jg7Var2 = (i & 16384) != 0 ? jp6Var.o : jg7Var;
        boolean z19 = (32768 & i) != 0 ? jp6Var.p : z9;
        Long l2 = (65536 & i) != 0 ? jp6Var.q : l;
        boolean z20 = (i & 131072) != 0 ? jp6Var.r : z10;
        boolean z21 = jp6Var.s;
        boolean z22 = jp6Var.t;
        boolean z23 = jp6Var.u;
        jp6Var.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        set.getClass();
        list6.getClass();
        map2.getClass();
        jg7Var2.getClass();
        return new jp6(z11, z12, z13, z14, list3, list4, list5, set, list6, z15, map2, z16, z17, z18, jg7Var2, z19, l2, z20, z21, z22, z23);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp6)) {
            return false;
        }
        jp6 jp6Var = (jp6) obj;
        return this.f16886a == jp6Var.f16886a && this.b == jp6Var.b && this.c == jp6Var.c && this.d == jp6Var.d && Intrinsics.d(this.e, jp6Var.e) && Intrinsics.d(this.f, jp6Var.f) && Intrinsics.d(this.g, jp6Var.g) && Intrinsics.d(this.h, jp6Var.h) && Intrinsics.d(this.i, jp6Var.i) && this.j == jp6Var.j && this.k.equals(jp6Var.k) && this.l == jp6Var.l && this.m == jp6Var.m && this.n == jp6Var.n && Intrinsics.d(this.o, jp6Var.o) && this.p == jp6Var.p && Intrinsics.d(this.q, jp6Var.q) && this.r == jp6Var.r && this.s == jp6Var.s && this.t == jp6Var.t && this.u == jp6Var.u;
    }

    public final int hashCode() {
        int iE = brm0.e((this.o.hashCode() + brm0.e(brm0.e(brm0.e(ohs0.f(this.k, brm0.e(dw9.a(ohs0.g(this.h, dw9.a(dw9.a(dw9.a(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f16886a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n)) * 31, 31, this.p);
        Long l = this.q;
        return Boolean.hashCode(this.u) + brm0.e(brm0.e(brm0.e((iE + (l == null ? 0 : l.hashCode())) * 31, 31, this.r), 31, this.s), 31, this.t);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BetConstructorBetsState(isLoading=", ", isError=", ", isEmpty=", this.f16886a, this.b);
        ua80.u(", playersExpanded=", ", firstTeamPlayers=", sbQ, this.c, this.d);
        b1j.y(", secondTeamPlayers=", ", bets=", sbQ, this.e, this.f);
        sbQ.append(this.g);
        sbQ.append(", expandedGroupIds=");
        sbQ.append(this.h);
        sbQ.append(", cachedBets=");
        rz4.z(sbQ, ", betTypeIsDecimal=", this.i, ", selectedAccuracyMap=", this.j);
        sbQ.append(this.k);
        sbQ.append(", needToCheckAllCoefs=");
        sbQ.append(this.l);
        sbQ.append(", showRelatedGames=");
        ua80.u(", oneClickEnabled=", ", selectedBet=", sbQ, this.m, this.n);
        sbQ.append(this.o);
        sbQ.append(", needToMakeBet=");
        sbQ.append(this.p);
        sbQ.append(", savedGroup=");
        sbQ.append(this.q);
        sbQ.append(", lastConnected=");
        sbQ.append(this.r);
        sbQ.append(", isNewEventParams=");
        ua80.u(", isNewEventParamsLogsEnabled=", ", hasPromocodes=", sbQ, this.s, this.t);
        return rw2.p(sbQ, this.u, Separators.RPAREN);
    }
}
