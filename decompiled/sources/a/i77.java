package a;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class i77 {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final gm7 E;
    public final List F;
    public final List G;
    public final HashMap H;
    public final List I;
    public final Map J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final int N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14279a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final ql5 e;
    public final BetHistoryScreenModel f;
    public final String g;
    public final ov7 h;
    public final HistoryTypeModel i;
    public final String j;
    public final boolean k;
    public final wdj l;
    public final List m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final Map r;
    public final boolean s;
    public final List t;
    public final dyv u;
    public final qgv0 v;
    public final boolean w;
    public final List x;
    public final boolean y;
    public final boolean z;

    public i77(boolean z, boolean z2, boolean z3, long j, ql5 ql5Var, BetHistoryScreenModel betHistoryScreenModel, String str, ov7 ov7Var, HistoryTypeModel historyTypeModel, String str2, boolean z4, wdj wdjVar, List list, boolean z5, boolean z6, boolean z7, boolean z8, Map map, boolean z9, List list2, dyv dyvVar, qgv0 qgv0Var, boolean z10, List list3, boolean z11, boolean z12, int i, boolean z13, boolean z14, boolean z15, gm7 gm7Var, List list4, List list5, HashMap map2, List list6, Map map3, boolean z16, boolean z17, boolean z18, int i2, boolean z19, boolean z20, boolean z21) {
        rz4.B(list, list2, list3, list4, list5);
        list6.getClass();
        this.f14279a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
        this.e = ql5Var;
        this.f = betHistoryScreenModel;
        this.g = str;
        this.h = ov7Var;
        this.i = historyTypeModel;
        this.j = str2;
        this.k = z4;
        this.l = wdjVar;
        this.m = list;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.q = z8;
        this.r = map;
        this.s = z9;
        this.t = list2;
        this.u = dyvVar;
        this.v = qgv0Var;
        this.w = z10;
        this.x = list3;
        this.y = z11;
        this.z = z12;
        this.A = i;
        this.B = z13;
        this.C = z14;
        this.D = z15;
        this.E = gm7Var;
        this.F = list4;
        this.G = list5;
        this.H = map2;
        this.I = list6;
        this.J = map3;
        this.K = z16;
        this.L = z17;
        this.M = z18;
        this.N = i2;
        this.O = z19;
        this.P = z20;
        this.Q = z21;
    }

    public static i77 a(i77 i77Var, boolean z, boolean z2, boolean z3, ql5 ql5Var, String str, ov7 ov7Var, HistoryTypeModel historyTypeModel, boolean z4, wdj wdjVar, List list, boolean z5, boolean z6, boolean z7, Map map, List list2, dyv dyvVar, qgv0 qgv0Var, boolean z8, List list3, boolean z9, boolean z10, boolean z11, List list4, List list5, HashMap map2, List list6, LinkedHashMap linkedHashMap, int i, int i2) {
        boolean z12 = (i & 1) != 0 ? i77Var.f14279a : z;
        boolean z13 = (i & 2) != 0 ? i77Var.b : z2;
        boolean z14 = (i & 4) != 0 ? i77Var.c : z3;
        long j = (i & 8) != 0 ? i77Var.d : 0L;
        ql5 ql5Var2 = (i & 16) != 0 ? i77Var.e : ql5Var;
        BetHistoryScreenModel betHistoryScreenModel = i77Var.f;
        String str2 = (i & 64) != 0 ? i77Var.g : str;
        ov7 ov7Var2 = (i & 128) != 0 ? i77Var.h : ov7Var;
        HistoryTypeModel historyTypeModel2 = (i & 256) != 0 ? i77Var.i : historyTypeModel;
        String str3 = i77Var.j;
        boolean z15 = (i & 1024) != 0 ? i77Var.k : z4;
        wdj wdjVar2 = (i & 2048) != 0 ? i77Var.l : wdjVar;
        List list7 = (i & 4096) != 0 ? i77Var.m : list;
        boolean z16 = i77Var.n;
        boolean z17 = (i & 16384) != 0 ? i77Var.o : z5;
        boolean z18 = (32768 & i) != 0 ? i77Var.p : z6;
        boolean z19 = (65536 & i) != 0 ? i77Var.q : z7;
        Map map3 = (131072 & i) != 0 ? i77Var.r : map;
        boolean z20 = i77Var.s;
        List list8 = (i & 524288) != 0 ? i77Var.t : list2;
        dyv dyvVar2 = (i & 1048576) != 0 ? i77Var.u : dyvVar;
        qgv0 qgv0Var2 = (i & 2097152) != 0 ? i77Var.v : qgv0Var;
        boolean z21 = (i & 4194304) != 0 ? i77Var.w : z8;
        List list9 = (i & 8388608) != 0 ? i77Var.x : list3;
        boolean z22 = (i & 16777216) != 0 ? i77Var.y : z9;
        boolean z23 = (i & 33554432) != 0 ? i77Var.z : z10;
        int i3 = i77Var.A;
        boolean z24 = i77Var.B;
        boolean z25 = (i & 268435456) != 0 ? i77Var.C : z11;
        boolean z26 = i77Var.D;
        gm7 gm7Var = i77Var.E;
        List list10 = (i & Integer.MIN_VALUE) != 0 ? i77Var.F : list4;
        List list11 = (i2 & 1) != 0 ? i77Var.G : list5;
        HashMap map4 = (i2 & 2) != 0 ? i77Var.H : map2;
        List list12 = (i2 & 4) != 0 ? i77Var.I : list6;
        Map map5 = (i2 & 8) != 0 ? i77Var.J : linkedHashMap;
        boolean z27 = i77Var.K;
        boolean z28 = i77Var.L;
        boolean z29 = i77Var.M;
        int i4 = i77Var.N;
        boolean z30 = (i2 & 256) != 0 ? i77Var.O : true;
        boolean z31 = i77Var.P;
        boolean z32 = i77Var.Q;
        i77Var.getClass();
        ov7Var2.getClass();
        historyTypeModel2.getClass();
        wdjVar2.getClass();
        list7.getClass();
        map3.getClass();
        list8.getClass();
        list9.getClass();
        list10.getClass();
        list11.getClass();
        map4.getClass();
        list12.getClass();
        return new i77(z12, z13, z14, j, ql5Var2, betHistoryScreenModel, str2, ov7Var2, historyTypeModel2, str3, z15, wdjVar2, list7, z16, z17, z18, z19, map3, z20, list8, dyvVar2, qgv0Var2, z21, list9, z22, z23, i3, z24, z25, z26, gm7Var, list10, list11, map4, list12, map5, z27, z28, z29, i4, z30, z31, z32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i77) {
            i77 i77Var = (i77) obj;
            if (this.f14279a == i77Var.f14279a && this.b == i77Var.b && this.c == i77Var.c && this.d == i77Var.d && Intrinsics.d(this.e, i77Var.e) && this.f.equals(i77Var.f) && this.g.equals(i77Var.g) && this.h.equals(i77Var.h) && this.i == i77Var.i && this.j.equals(i77Var.j) && this.k == i77Var.k && this.l.equals(i77Var.l) && Intrinsics.d(this.m, i77Var.m) && this.n == i77Var.n && this.o == i77Var.o && this.p == i77Var.p && this.q == i77Var.q && this.r.equals(i77Var.r) && this.s == i77Var.s && Intrinsics.d(this.t, i77Var.t) && Intrinsics.d(this.u, i77Var.u) && Intrinsics.d(this.v, i77Var.v) && this.w == i77Var.w && Intrinsics.d(this.x, i77Var.x) && this.y == i77Var.y && this.z == i77Var.z && this.A == i77Var.A && this.B == i77Var.B && this.C == i77Var.C && this.D == i77Var.D && this.E == i77Var.E && Intrinsics.d(this.F, i77Var.F) && Intrinsics.d(this.G, i77Var.G) && this.H.equals(i77Var.H) && Intrinsics.d(this.I, i77Var.I) && this.J.equals(i77Var.J) && this.K == i77Var.K && this.L == i77Var.L && this.M == i77Var.M && this.N == i77Var.N && this.O == i77Var.O && this.P == i77Var.P && this.Q == i77Var.Q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = rw2.b(brm0.e(brm0.e(Boolean.hashCode(this.f14279a) * 31, 31, this.b), 31, this.c), 31, this.d);
        ql5 ql5Var = this.e;
        int iA = dw9.a(brm0.e(ohs0.f(this.r, brm0.e(brm0.e(brm0.e(brm0.e(dw9.a((this.l.hashCode() + brm0.e(ua80.b((this.i.hashCode() + ((this.h.hashCode() + ua80.b((this.f.hashCode() + ((iB + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31)) * 31, 31, this.g)) * 31)) * 31, 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31), 31, this.s), 31, this.t);
        dyv dyvVar = this.u;
        int iHashCode = (iA + (dyvVar == null ? 0 : dyvVar.hashCode())) * 31;
        qgv0 qgv0Var = this.v;
        return Boolean.hashCode(this.Q) + brm0.e(brm0.e(twn.a(this.N, brm0.e(brm0.e(brm0.e(ohs0.f(this.J, dw9.a((this.H.hashCode() + dw9.a(dw9.a((this.E.hashCode() + brm0.e(brm0.e(brm0.e(twn.a(this.A, brm0.e(brm0.e(dw9.a(brm0.e((iHashCode + (qgv0Var != null ? qgv0Var.hashCode() : 0)) * 31, 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31), 31, this.B), 31, this.C), 31, this.D)) * 31, 31, this.F), 31, this.G)) * 31, 31, this.I), 31), 31, this.K), 31, this.L), 31, this.M), 31), 31, this.O), 31, this.P);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BetHistoryState(isLoading=", ", isFullScreenLoader=", ", isError=", this.f14279a, this.b);
        rw2.v(this.d, ", betIdToOpen=", sbQ, this.c);
        sbQ.append(", balanceModel=");
        sbQ.append(this.e);
        sbQ.append(", betHistoryScreenModel=");
        sbQ.append(this.f);
        sbQ.append(", lastBalanceTitle=");
        sbQ.append(this.g);
        sbQ.append(", betsSummaryInfoModelState=");
        sbQ.append(this.h);
        sbQ.append(", historyTypeModel=");
        sbQ.append(this.i);
        sbQ.append(", totoName=");
        sbQ.append(this.j);
        sbQ.append(", isAuthorize=");
        sbQ.append(this.k);
        sbQ.append(", datePeriod=");
        sbQ.append(this.l);
        esw0.k(sbQ, ", filterList=", this.m, ", hasBetHistoryFreeBetRemoteKeyValue=", this.n);
        w6x.A(", isLoadingNextPage=", ", isLastPage=", sbQ, this.o, this.p);
        sbQ.append(", isExpandable=");
        sbQ.append(this.q);
        sbQ.append(", sportModelMap=");
        sbQ.append(this.r);
        esw0.l(sbQ, ", hasHistoryPossibleWin=", this.s, ", historyModelList=", this.t);
        sbQ.append(", historyAdditionalInfo=");
        sbQ.append(this.u);
        sbQ.append(", winBackBannerUiModel=");
        sbQ.append(this.v);
        esw0.l(sbQ, ", pullToRefreshState=", this.w, ", subscribeList=", this.x);
        w6x.A(", scrollToTop=", ", scrollToTopAnimated=", sbQ, this.y, this.z);
        dw9.v(this.A, ", maxPeriod=", ", hasHistoryPeriodFilter=", sbQ, this.B);
        w6x.A(", lastConnection=", ", hasHistoryHide=", sbQ, this.C, this.D);
        sbQ.append(", betSettingsModel=");
        sbQ.append(this.E);
        sbQ.append(", betTypeFilterList=");
        sbQ.append(this.F);
        sbQ.append(", eventGroupsList=");
        sbQ.append(this.G);
        sbQ.append(", historyMenuItemMap=");
        sbQ.append(this.H);
        sbQ.append(", availableHistoryTypeList=");
        sbQ.append(this.I);
        sbQ.append(", expandedItemMapByTab=");
        sbQ.append(this.J);
        w6x.A(", isNewEventParams=", ", logNewEventParams=", sbQ, this.K, this.L);
        cs0.v(this.N, ", hasHistoryRateApp=", ", numberOfSuccessfulBets=", sbQ, this.M);
        w6x.A(", rateAppDialogChecked=", ", betCoeffTypeVisibleInHistory=", sbQ, this.O, this.P);
        return f140.n(sbQ, ", isCalendarEnable=", this.Q, Separators.RPAREN);
    }
}
