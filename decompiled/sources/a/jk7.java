package a;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class jk7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16653a;
    public final boolean b;
    public final long c;
    public final BetHistoryScreenModel d;
    public final boolean e;
    public final ql5 f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final List j;
    public final List k;
    public final boolean l;
    public final List m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final List r;
    public final List s;
    public final boolean t;
    public final Map u;
    public final boolean v;
    public final HashMap w;
    public final boolean x;
    public final boolean y;

    public jk7(boolean z, boolean z2, long j, BetHistoryScreenModel betHistoryScreenModel, boolean z3, ql5 ql5Var, boolean z4, boolean z5, String str, List list, List list2, boolean z6, List list3, boolean z7, boolean z8, boolean z9, boolean z10, List list4, List list5, boolean z11, Map map, boolean z12, HashMap map2, boolean z13, boolean z14) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.f16653a = z;
        this.b = z2;
        this.c = j;
        this.d = betHistoryScreenModel;
        this.e = z3;
        this.f = ql5Var;
        this.g = z4;
        this.h = z5;
        this.i = str;
        this.j = list;
        this.k = list2;
        this.l = z6;
        this.m = list3;
        this.n = z7;
        this.o = z8;
        this.p = z9;
        this.q = z10;
        this.r = list4;
        this.s = list5;
        this.t = z11;
        this.u = map;
        this.v = z12;
        this.w = map2;
        this.x = z13;
        this.y = z14;
    }

    public static jk7 a(jk7 jk7Var, boolean z, boolean z2, long j, boolean z3, ql5 ql5Var, boolean z4, boolean z5, List list, List list2, boolean z6, List list3, boolean z7, boolean z8, List list4, List list5, boolean z9, Map map, boolean z10, HashMap map2, boolean z11, int i) {
        boolean z12 = (i & 1) != 0 ? jk7Var.f16653a : z;
        boolean z13 = (i & 2) != 0 ? jk7Var.b : z2;
        long j2 = (i & 4) != 0 ? jk7Var.c : j;
        BetHistoryScreenModel betHistoryScreenModel = jk7Var.d;
        boolean z14 = (i & 16) != 0 ? jk7Var.e : z3;
        ql5 ql5Var2 = (i & 32) != 0 ? jk7Var.f : ql5Var;
        boolean z15 = (i & 64) != 0 ? jk7Var.g : z4;
        boolean z16 = (i & 128) != 0 ? jk7Var.h : z5;
        String str = jk7Var.i;
        List list6 = (i & 512) != 0 ? jk7Var.j : list;
        List list7 = (i & 1024) != 0 ? jk7Var.k : list2;
        boolean z17 = (i & 2048) != 0 ? jk7Var.l : z6;
        List list8 = (i & 4096) != 0 ? jk7Var.m : list3;
        boolean z18 = (i & 8192) != 0 ? jk7Var.n : z7;
        boolean z19 = jk7Var.o;
        boolean z20 = jk7Var.p;
        boolean z21 = (i & 65536) != 0 ? jk7Var.q : z8;
        List list9 = (i & 131072) != 0 ? jk7Var.r : list4;
        List list10 = (i & 262144) != 0 ? jk7Var.s : list5;
        boolean z22 = (i & 524288) != 0 ? jk7Var.t : z9;
        Map map3 = (i & 1048576) != 0 ? jk7Var.u : map;
        boolean z23 = (i & 2097152) != 0 ? jk7Var.v : z10;
        HashMap map4 = (i & 4194304) != 0 ? jk7Var.w : map2;
        boolean z24 = jk7Var.x;
        boolean z25 = (i & 16777216) != 0 ? jk7Var.y : z11;
        jk7Var.getClass();
        str.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        list10.getClass();
        map3.getClass();
        return new jk7(z12, z13, j2, betHistoryScreenModel, z14, ql5Var2, z15, z16, str, list6, list7, z17, list8, z18, z19, z20, z21, list9, list10, z22, map3, z23, map4, z24, z25);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk7)) {
            return false;
        }
        jk7 jk7Var = (jk7) obj;
        return this.f16653a == jk7Var.f16653a && this.b == jk7Var.b && this.c == jk7Var.c && this.d.equals(jk7Var.d) && this.e == jk7Var.e && Intrinsics.d(this.f, jk7Var.f) && this.g == jk7Var.g && this.h == jk7Var.h && Intrinsics.d(this.i, jk7Var.i) && Intrinsics.d(this.j, jk7Var.j) && Intrinsics.d(this.k, jk7Var.k) && this.l == jk7Var.l && Intrinsics.d(this.m, jk7Var.m) && this.n == jk7Var.n && this.o == jk7Var.o && this.p == jk7Var.p && this.q == jk7Var.q && Intrinsics.d(this.r, jk7Var.r) && Intrinsics.d(this.s, jk7Var.s) && this.t == jk7Var.t && this.u.equals(jk7Var.u) && this.v == jk7Var.v && this.w.equals(jk7Var.w) && this.x == jk7Var.x && this.y == jk7Var.y;
    }

    public final int hashCode() {
        int iE = brm0.e((this.d.hashCode() + rw2.b(brm0.e(Boolean.hashCode(this.f16653a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        ql5 ql5Var = this.f;
        return Boolean.hashCode(this.y) + brm0.e((this.w.hashCode() + brm0.e(ohs0.f(this.u, brm0.e(dw9.a(dw9.a(brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(brm0.e(dw9.a(dw9.a(ua80.b(brm0.e(brm0.e((iE + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31), 31, this.v)) * 31, 31, this.x);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BetSaleModel(isLoading=", ", isError=", ", dateFrom=", this.f16653a, this.b);
        sbQ.append(this.c);
        sbQ.append(", betHistoryScreenModel=");
        sbQ.append(this.d);
        sbQ.append(", pullToRefreshState=");
        sbQ.append(this.e);
        sbQ.append(", balanceModel=");
        sbQ.append(this.f);
        w6x.A(", isLoadingNextPage=", ", isLastPage=", sbQ, this.g, this.h);
        ua80.t(", title=", this.i, ", historyBetItemModelList=", sbQ, this.j);
        esw0.k(sbQ, ", specialEvents=", this.k, ", marketGroupIdEnable=", this.l);
        esw0.k(sbQ, ", eventModelList=", this.m, ", showParsingNumber=", this.n);
        w6x.A(", hasBetSellPart=", ", historySaleDsToggle=", sbQ, this.o, this.p);
        esw0.l(sbQ, ", isFullScreenLoader=", this.q, ", eventGroupsList=", this.r);
        esw0.k(sbQ, ", subscribeList=", this.s, ", scrollToTop=", this.t);
        sbQ.append(", sportModelMap=");
        sbQ.append(this.u);
        sbQ.append(", lastConnection=");
        sbQ.append(this.v);
        sbQ.append(", historyMenuItemMap=");
        sbQ.append(this.w);
        sbQ.append(", isNewEventParams=");
        sbQ.append(this.x);
        return f140.n(sbQ, ", logNewEventParams=", this.y, Separators.RPAREN);
    }
}
