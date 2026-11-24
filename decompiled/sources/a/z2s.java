package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z2s {
    public final boolean A;
    public final boolean B;
    public final String C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final fsr I;
    public final xvm0 J;
    public final js20 K;
    public final dja L;
    public final irs M;
    public final dja N;
    public final gna O;
    public final anq0 P;
    public final bg30 Q;
    public final ui9 R;
    public final List S;
    public final boolean T;
    public final boolean U;
    public final List V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43686a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final Long g;
    public final Long h;
    public final t3z i;
    public final String j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final vzj0 w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public z2s(long j, String str, Long l, boolean z, long j2, long j3, Long l2, Long l3, t3z t3zVar, String str2, boolean z2, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, vzj0 vzj0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str6, String str7, boolean z16, boolean z17, boolean z18, boolean z19, fsr fsrVar, xvm0 xvm0Var, js20 js20Var, dja djaVar, irs irsVar, dja djaVar2, gna gnaVar, anq0 anq0Var, bg30 bg30Var, ui9 ui9Var, List list, boolean z20, boolean z21, List list2) {
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.f43686a = j;
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = j2;
        this.f = j3;
        this.g = l2;
        this.h = l3;
        this.i = t3zVar;
        this.j = str2;
        this.k = z2;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = z6;
        this.s = z7;
        this.t = z8;
        this.u = z9;
        this.v = z10;
        this.w = vzj0Var;
        this.x = z11;
        this.y = z12;
        this.z = z13;
        this.A = z14;
        this.B = z15;
        this.C = str6;
        this.D = str7;
        this.E = z16;
        this.F = z17;
        this.G = z18;
        this.H = z19;
        this.I = fsrVar;
        this.J = xvm0Var;
        this.K = js20Var;
        this.L = djaVar;
        this.M = irsVar;
        this.N = djaVar2;
        this.O = gnaVar;
        this.P = anq0Var;
        this.Q = bg30Var;
        this.R = ui9Var;
        this.S = list;
        this.T = z20;
        this.U = z21;
        this.V = list2;
    }

    public static z2s a(z2s z2sVar, long j, String str, Long l, boolean z, long j2, long j3, Long l2, t3z t3zVar, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, vzj0 vzj0Var, boolean z10, boolean z11, boolean z12, String str5, String str6, boolean z13, boolean z14, fsr fsrVar, xvm0 xvm0Var, js20 js20Var, dja djaVar, irs irsVar, dja djaVar2, gna gnaVar, anq0 anq0Var, bg30 bg30Var, ui9 ui9Var, List list, boolean z15, List list2, int i, int i2) {
        long j4 = (i & 1) != 0 ? z2sVar.f43686a : j;
        String str7 = (i & 2) != 0 ? z2sVar.b : str;
        Long l3 = (i & 4) != 0 ? z2sVar.c : l;
        boolean z16 = (i & 8) != 0 ? z2sVar.d : z;
        long j5 = (i & 16) != 0 ? z2sVar.e : j2;
        long j6 = (i & 32) != 0 ? z2sVar.f : j3;
        Long l4 = (i & 64) != 0 ? z2sVar.g : l2;
        Long l5 = z2sVar.h;
        t3z t3zVar2 = (i & 256) != 0 ? z2sVar.i : t3zVar;
        String str8 = z2sVar.j;
        boolean z17 = z2sVar.k;
        String str9 = (i & 2048) != 0 ? z2sVar.l : str2;
        String str10 = (i & 4096) != 0 ? z2sVar.m : str3;
        String str11 = (i & 8192) != 0 ? z2sVar.n : str4;
        boolean z18 = (i & 16384) != 0 ? z2sVar.o : z2;
        boolean z19 = (i & 32768) != 0 ? z2sVar.p : z3;
        boolean z20 = (65536 & i) != 0 ? z2sVar.q : z4;
        boolean z21 = (131072 & i) != 0 ? z2sVar.r : z5;
        boolean z22 = (262144 & i) != 0 ? z2sVar.s : z6;
        boolean z23 = (524288 & i) != 0 ? z2sVar.t : z7;
        boolean z24 = (1048576 & i) != 0 ? z2sVar.u : z8;
        boolean z25 = (2097152 & i) != 0 ? z2sVar.v : z9;
        vzj0 vzj0Var2 = (4194304 & i) != 0 ? z2sVar.w : vzj0Var;
        boolean z26 = z2sVar.x;
        boolean z27 = z2sVar.y;
        boolean z28 = (i & 33554432) != 0 ? z2sVar.z : z10;
        boolean z29 = (i & 67108864) != 0 ? z2sVar.A : z11;
        boolean z30 = (i & 134217728) != 0 ? z2sVar.B : z12;
        String str12 = (i & 268435456) != 0 ? z2sVar.C : str5;
        String str13 = (i & 536870912) != 0 ? z2sVar.D : str6;
        boolean z31 = (i & 1073741824) != 0 ? z2sVar.E : false;
        boolean z32 = (i & Integer.MIN_VALUE) != 0 ? z2sVar.F : z13;
        boolean z33 = (i2 & 1) != 0 ? z2sVar.G : z14;
        boolean z34 = (i2 & 2) != 0 ? z2sVar.H : false;
        fsr fsrVar2 = (i2 & 4) != 0 ? z2sVar.I : fsrVar;
        xvm0 xvm0Var2 = (i2 & 8) != 0 ? z2sVar.J : xvm0Var;
        js20 js20Var2 = (i2 & 16) != 0 ? z2sVar.K : js20Var;
        dja djaVar3 = (i2 & 32) != 0 ? z2sVar.L : djaVar;
        irs irsVar2 = (i2 & 64) != 0 ? z2sVar.M : irsVar;
        dja djaVar4 = (i2 & 128) != 0 ? z2sVar.N : djaVar2;
        gna gnaVar2 = (i2 & 256) != 0 ? z2sVar.O : gnaVar;
        anq0 anq0Var2 = (i2 & 512) != 0 ? z2sVar.P : anq0Var;
        bg30 bg30Var2 = (i2 & 1024) != 0 ? z2sVar.Q : bg30Var;
        ui9 ui9Var2 = (i2 & 2048) != 0 ? z2sVar.R : ui9Var;
        List list3 = (i2 & 4096) != 0 ? z2sVar.S : list;
        boolean z35 = (i2 & 8192) != 0 ? z2sVar.T : z15;
        boolean z36 = z2sVar.U;
        List list4 = (i2 & 32768) != 0 ? z2sVar.V : list2;
        z2sVar.getClass();
        str8.getClass();
        str9.getClass();
        irsVar2.getClass();
        list3.getClass();
        list4.getClass();
        return new z2s(j4, str7, l3, z16, j5, j6, l4, l5, t3zVar2, str8, z17, str9, str10, str11, z18, z19, z20, z21, z22, z23, z24, z25, vzj0Var2, z26, z27, z28, z29, z30, str12, str13, z31, z32, z33, z34, fsrVar2, xvm0Var2, js20Var2, djaVar3, irsVar2, djaVar4, gnaVar2, anq0Var2, bg30Var2, ui9Var2, list3, z35, z36, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2s)) {
            return false;
        }
        z2s z2sVar = (z2s) obj;
        return this.f43686a == z2sVar.f43686a && this.b.equals(z2sVar.b) && Intrinsics.d(this.c, z2sVar.c) && this.d == z2sVar.d && this.e == z2sVar.e && this.f == z2sVar.f && Intrinsics.d(this.g, z2sVar.g) && this.h.equals(z2sVar.h) && this.i == z2sVar.i && Intrinsics.d(this.j, z2sVar.j) && this.k == z2sVar.k && this.l.equals(z2sVar.l) && this.m.equals(z2sVar.m) && this.n.equals(z2sVar.n) && this.o == z2sVar.o && this.p == z2sVar.p && this.q == z2sVar.q && this.r == z2sVar.r && this.s == z2sVar.s && this.t == z2sVar.t && this.u == z2sVar.u && this.v == z2sVar.v && Intrinsics.d(this.w, z2sVar.w) && this.x == z2sVar.x && this.y == z2sVar.y && this.z == z2sVar.z && this.A == z2sVar.A && this.B == z2sVar.B && this.C.equals(z2sVar.C) && this.D.equals(z2sVar.D) && this.E == z2sVar.E && this.F == z2sVar.F && this.G == z2sVar.G && this.H == z2sVar.H && Intrinsics.d(this.I, z2sVar.I) && Intrinsics.d(this.J, z2sVar.J) && Intrinsics.d(this.K, z2sVar.K) && this.L == z2sVar.L && this.M == z2sVar.M && this.N == z2sVar.N && Intrinsics.d(this.O, z2sVar.O) && Intrinsics.d(this.P, z2sVar.P) && Intrinsics.d(this.Q, z2sVar.Q) && Intrinsics.d(this.R, z2sVar.R) && Intrinsics.d(this.S, z2sVar.S) && this.T == z2sVar.T && this.U == z2sVar.U && Intrinsics.d(this.V, z2sVar.V);
    }

    public final int hashCode() {
        int iB = ua80.b(Long.hashCode(this.f43686a) * 31, 31, this.b);
        Long l = this.c;
        int iB2 = rw2.b(rw2.b(brm0.e((iB + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        Long l2 = this.g;
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(brm0.e(ua80.b((this.i.hashCode() + ((this.h.hashCode() + ((iB2 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
        vzj0 vzj0Var = this.w;
        int iE2 = brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iE + (vzj0Var == null ? 0 : vzj0Var.hashCode())) * 31, 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H);
        fsr fsrVar = this.I;
        int iHashCode = (iE2 + (fsrVar == null ? 0 : fsrVar.hashCode())) * 31;
        xvm0 xvm0Var = this.J;
        int iHashCode2 = (iHashCode + (xvm0Var == null ? 0 : xvm0Var.hashCode())) * 31;
        js20 js20Var = this.K;
        int iHashCode3 = (iHashCode2 + (js20Var == null ? 0 : js20Var.hashCode())) * 31;
        dja djaVar = this.L;
        int iHashCode4 = (this.M.hashCode() + ((iHashCode3 + (djaVar == null ? 0 : djaVar.hashCode())) * 31)) * 31;
        dja djaVar2 = this.N;
        int iHashCode5 = (iHashCode4 + (djaVar2 == null ? 0 : djaVar2.hashCode())) * 31;
        gna gnaVar = this.O;
        int iHashCode6 = (iHashCode5 + (gnaVar == null ? 0 : gnaVar.hashCode())) * 31;
        anq0 anq0Var = this.P;
        int iHashCode7 = (iHashCode6 + (anq0Var == null ? 0 : anq0Var.hashCode())) * 31;
        bg30 bg30Var = this.Q;
        int iHashCode8 = (iHashCode7 + (bg30Var == null ? 0 : bg30Var.hashCode())) * 31;
        ui9 ui9Var = this.R;
        return this.V.hashCode() + brm0.e(brm0.e(dw9.a((iHashCode8 + (ui9Var != null ? ui9Var.hashCode() : 0)) * 31, 31, this.S), 31, this.T), 31, this.U);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f43686a, "GameClassicStateModel(gameId=", ", statGameId=", this.b);
        sbO.append(", constId=");
        sbO.append(this.c);
        sbO.append(", live=");
        sbO.append(this.d);
        kng0.A(sbO, ", sportId=", this.e, ", subGameId=");
        sbO.append(this.f);
        sbO.append(", categoryId=");
        sbO.append(this.g);
        sbO.append(", champId=");
        sbO.append(this.h);
        sbO.append(", gameConditionType=");
        sbO.append(this.i);
        w6x.z(", componentKey=", this.j, ", isBettingDisabled=", sbO, this.k);
        f140.v(sbO, ", sportName=", this.l, ", champName=", this.m);
        w6x.z(", extraInfo=", this.n, ", quickBetEnabled=", sbO, this.o);
        w6x.A(", toolbarButtonsEnabled=", ", hasMarketsGraph=", sbO, this.p, this.q);
        w6x.A(", marketsAvailable=", ", statisticAvailable=", sbO, this.r, this.s);
        w6x.A(", settingAvailable=", ", duelAvailable=", sbO, this.t, this.u);
        sbO.append(", subscriptionAvailable=");
        sbO.append(this.v);
        sbO.append(", simulation=");
        sbO.append(this.w);
        w6x.A(", needPlayBroadcast=", ", needPlayZone=", sbO, this.x, this.y);
        w6x.A(", expandAvailable=", ", betsOnPlayersAvailable=", sbO, this.z, this.A);
        hne.u(", isNightModeEnable=", ", specialEventBackgroundUrl=", this.C, sbO, this.B);
        w6x.z(", individualBackgroundUrl=", this.D, ", isLoading=", sbO, this.E);
        w6x.A(", showMarkets=", ", transferContinue=", sbO, this.F, this.G);
        sbO.append(", transferFailed=");
        sbO.append(this.H);
        sbO.append(", gameBroadcastModel=");
        sbO.append(this.I);
        sbO.append(", currentSubGameModel=");
        sbO.append(this.J);
        sbO.append(", currentMarketCategoryModel=");
        sbO.append(this.K);
        sbO.append(", currentGameInfoCardType=");
        sbO.append(this.L);
        sbO.append(", currentTab=");
        sbO.append(this.M);
        sbO.append(", currentBroadcastingType=");
        sbO.append(this.N);
        sbO.append(", cardSectionModel=");
        sbO.append(this.O);
        sbO.append(", timerModel=");
        sbO.append(this.P);
        sbO.append(", matchCacheScoreModel=");
        sbO.append(this.Q);
        sbO.append(", cachePenaltyModel=");
        sbO.append(this.R);
        sbO.append(", favoriteTeamModelList=");
        sbO.append(this.S);
        w6x.A(", isCardsSectionExpanded=", ", rtlSupport=", sbO, this.T, this.U);
        return ohs0.s(sbO, ", cardsOrder=", this.V, Separators.RPAREN);
    }
}
