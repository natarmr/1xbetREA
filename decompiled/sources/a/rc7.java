package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.bet_info.presentation.model.BetInfoScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class rc7 {
    public final boolean A;
    public final boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s9x f30223a;
    public final boolean b;
    public final BetInfoScreenModel c;
    public final a5w d;
    public final List e;
    public final z760 f;
    public final List g;
    public final ql5 h;
    public final List i;
    public final List j;
    public final boolean k;
    public final boolean l;
    public final Map m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final long w;
    public final uaq0 x;
    public final boolean y;
    public final long z;

    public rc7(s9x s9xVar, boolean z, BetInfoScreenModel betInfoScreenModel, a5w a5wVar, List list, z760 z760Var, List list2, ql5 ql5Var, List list3, List list4, boolean z2, boolean z3, Map map, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, long j, uaq0 uaq0Var, boolean z13, long j2, boolean z14, boolean z15) {
        hne.C(list, list2, list3, list4);
        this.f30223a = s9xVar;
        this.b = z;
        this.c = betInfoScreenModel;
        this.d = a5wVar;
        this.e = list;
        this.f = z760Var;
        this.g = list2;
        this.h = ql5Var;
        this.i = list3;
        this.j = list4;
        this.k = z2;
        this.l = z3;
        this.m = map;
        this.n = z4;
        this.o = z5;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = z9;
        this.t = z10;
        this.u = z11;
        this.v = z12;
        this.w = j;
        this.x = uaq0Var;
        this.y = z13;
        this.z = j2;
        this.A = z14;
        this.B = z15;
    }

    public static rc7 a(rc7 rc7Var, s9x s9xVar, boolean z, a5w a5wVar, z760 z760Var, List list, ql5 ql5Var, List list2, List list3, Map map, boolean z2, boolean z3, boolean z4, long j, long j2, int i) {
        s9x s9xVar2 = (i & 1) != 0 ? rc7Var.f30223a : s9xVar;
        boolean z5 = (i & 2) != 0 ? rc7Var.b : z;
        BetInfoScreenModel betInfoScreenModel = rc7Var.c;
        a5w a5wVar2 = (i & 8) != 0 ? rc7Var.d : a5wVar;
        List list4 = rc7Var.e;
        z760 z760Var2 = (i & 32) != 0 ? rc7Var.f : z760Var;
        List list5 = (i & 64) != 0 ? rc7Var.g : list;
        ql5 ql5Var2 = (i & 128) != 0 ? rc7Var.h : ql5Var;
        List list6 = (i & 256) != 0 ? rc7Var.i : list2;
        List list7 = (i & 512) != 0 ? rc7Var.j : list3;
        boolean z6 = rc7Var.k;
        boolean z7 = rc7Var.l;
        Map map2 = (i & 4096) != 0 ? rc7Var.m : map;
        boolean z8 = rc7Var.n;
        boolean z9 = rc7Var.o;
        boolean z10 = rc7Var.p;
        boolean z11 = rc7Var.q;
        boolean z12 = rc7Var.r;
        boolean z13 = rc7Var.s;
        boolean z14 = (i & 524288) != 0 ? rc7Var.t : z2;
        boolean z15 = (i & 1048576) != 0 ? rc7Var.u : z3;
        boolean z16 = (i & 2097152) != 0 ? rc7Var.v : z4;
        long j3 = (i & 4194304) != 0 ? rc7Var.w : j;
        uaq0 uaq0Var = rc7Var.x;
        boolean z17 = rc7Var.y;
        long j4 = (i & 33554432) != 0 ? rc7Var.z : j2;
        boolean z18 = rc7Var.A;
        boolean z19 = rc7Var.B;
        rc7Var.getClass();
        list4.getClass();
        z760Var2.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        map2.getClass();
        return new rc7(s9xVar2, z5, betInfoScreenModel, a5wVar2, list4, z760Var2, list5, ql5Var2, list6, list7, z6, z7, map2, z8, z9, z10, z11, z12, z13, z14, z15, z16, j3, uaq0Var, z17, j4, z18, z19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc7)) {
            return false;
        }
        rc7 rc7Var = (rc7) obj;
        return this.f30223a.equals(rc7Var.f30223a) && this.b == rc7Var.b && this.c.equals(rc7Var.c) && Intrinsics.d(this.d, rc7Var.d) && Intrinsics.d(this.e, rc7Var.e) && this.f.equals(rc7Var.f) && Intrinsics.d(this.g, rc7Var.g) && Intrinsics.d(this.h, rc7Var.h) && Intrinsics.d(this.i, rc7Var.i) && Intrinsics.d(this.j, rc7Var.j) && this.k == rc7Var.k && this.l == rc7Var.l && this.m.equals(rc7Var.m) && this.n == rc7Var.n && this.o == rc7Var.o && this.p == rc7Var.p && this.q == rc7Var.q && this.r == rc7Var.r && this.s == rc7Var.s && this.t == rc7Var.t && this.u == rc7Var.u && this.v == rc7Var.v && this.w == rc7Var.w && this.x == rc7Var.x && this.y == rc7Var.y && this.z == rc7Var.z && this.A == rc7Var.A && this.B == rc7Var.B;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + brm0.e(this.f30223a.hashCode() * 31, 31, this.b)) * 31;
        a5w a5wVar = this.d;
        int iA = dw9.a((this.f.hashCode() + dw9.a((iHashCode + (a5wVar == null ? 0 : a5wVar.hashCode())) * 31, 31, this.e)) * 31, 31, this.g);
        ql5 ql5Var = this.h;
        return Boolean.hashCode(this.B) + brm0.e(rw2.b(brm0.e((this.x.hashCode() + rw2.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ohs0.f(this.m, brm0.e(brm0.e(dw9.a(dw9.a((iA + (ql5Var != null ? ql5Var.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w)) * 31, 31, this.y), 31, this.z), 31, this.A);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetInfoState(infoState=");
        sb.append(this.f30223a);
        sb.append(", lastConnection=");
        sb.append(this.b);
        sb.append(", betInfoScreenModel=");
        sb.append(this.c);
        sb.append(", historyModel=");
        sb.append(this.d);
        sb.append(", specialEvent=");
        sb.append(this.e);
        sb.append(", notificationState=");
        sb.append(this.f);
        sb.append(", subscribeList=");
        sb.append(this.g);
        sb.append(", balanceModel=");
        sb.append(this.h);
        sb.append(", eventModelList=");
        b1j.y(", eventGroupsList=", ", hasHistoryPossibleWin=", sb, this.i, this.j);
        ua80.u(", hasBetHistoryFreeBetRemoteKeyValue=", ", sportModelMap=", sb, this.k, this.l);
        sb.append(this.m);
        sb.append(", marketGroupIdEnable=");
        sb.append(this.n);
        sb.append(", showParsingNumber=");
        ua80.u(", isNewEventParams=", ", logNewEventParams=", sb, this.o, this.p);
        ua80.u(", hasBetSellFull=", ", powerBetEnabled=", sb, this.q, this.r);
        ua80.u(", isFullScreenLoader=", ", isRefreshing=", sb, this.s, this.t);
        ua80.u(", canUpdateLiveGames=", ", lastUpdateTime=", sb, this.u, this.v);
        sb.append(this.w);
        sb.append(", theme=");
        sb.append(this.x);
        rz4.A(sb, ", showOrganizer=", this.y, ", userId=");
        hne.t(this.z, ", betCoeffTypeVisibleInHistory=", sb, this.A);
        return f140.n(sb, ", rtlSupport=", this.B, Separators.RPAREN);
    }
}
