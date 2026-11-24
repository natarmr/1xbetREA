package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class njs {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final fsr L;
    public final xvm0 M;
    public final js20 N;
    public final Long O;
    public final gna P;
    public final anq0 Q;
    public final bg30 R;
    public final ui9 S;
    public final List T;
    public final boolean U;
    public final List V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23650a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final Long g;
    public final t3z h;
    public final boolean i;
    public final tf50 j;
    public final o49 k;
    public final List l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final vzj0 y;
    public final boolean z;

    public njs(long j, String str, Long l, boolean z, long j2, long j3, Long l2, t3z t3zVar, boolean z2, tf50 tf50Var, o49 o49Var, List list, String str2, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, vzj0 vzj0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, fsr fsrVar, xvm0 xvm0Var, js20 js20Var, Long l3, gna gnaVar, anq0 anq0Var, bg30 bg30Var, ui9 ui9Var, List list2, boolean z23, List list3) {
        b1j.B(list, list2, list3);
        this.f23650a = j;
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = j2;
        this.f = j3;
        this.g = l2;
        this.h = t3zVar;
        this.i = z2;
        this.j = tf50Var;
        this.k = o49Var;
        this.l = list;
        this.m = str2;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = z8;
        this.w = z9;
        this.x = z10;
        this.y = vzj0Var;
        this.z = z11;
        this.A = z12;
        this.B = z13;
        this.C = z14;
        this.D = z15;
        this.E = z16;
        this.F = z17;
        this.G = z18;
        this.H = z19;
        this.I = z20;
        this.J = z21;
        this.K = z22;
        this.L = fsrVar;
        this.M = xvm0Var;
        this.N = js20Var;
        this.O = l3;
        this.P = gnaVar;
        this.Q = anq0Var;
        this.R = bg30Var;
        this.S = ui9Var;
        this.T = list2;
        this.U = z23;
        this.V = list3;
    }

    public static njs a(njs njsVar, long j, String str, Long l, boolean z, long j2, long j3, t3z t3zVar, tf50 tf50Var, o49 o49Var, List list, String str2, String str3, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, vzj0 vzj0Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, fsr fsrVar, xvm0 xvm0Var, js20 js20Var, Long l2, gna gnaVar, anq0 anq0Var, bg30 bg30Var, ui9 ui9Var, List list2, List list3, int i, int i2) {
        long j4 = (i & 1) != 0 ? njsVar.f23650a : j;
        String str6 = (i & 2) != 0 ? njsVar.b : str;
        Long l3 = (i & 4) != 0 ? njsVar.c : l;
        boolean z17 = (i & 8) != 0 ? njsVar.d : z;
        long j5 = (i & 16) != 0 ? njsVar.e : j2;
        long j6 = (i & 32) != 0 ? njsVar.f : j3;
        Long l4 = njsVar.g;
        t3z t3zVar2 = (i & 128) != 0 ? njsVar.h : t3zVar;
        boolean z18 = njsVar.i;
        tf50 tf50Var2 = (i & 512) != 0 ? njsVar.j : tf50Var;
        o49 o49Var2 = (i & 1024) != 0 ? njsVar.k : o49Var;
        List list4 = (i & 2048) != 0 ? njsVar.l : list;
        String str7 = (i & 4096) != 0 ? njsVar.m : str2;
        String str8 = (i & 8192) != 0 ? njsVar.n : str3;
        String str9 = (i & 16384) != 0 ? njsVar.o : str4;
        String str10 = (i & 32768) != 0 ? njsVar.p : str5;
        boolean z19 = (65536 & i) != 0 ? njsVar.q : z2;
        boolean z20 = (131072 & i) != 0 ? njsVar.r : z3;
        boolean z21 = (262144 & i) != 0 ? njsVar.s : z4;
        boolean z22 = (524288 & i) != 0 ? njsVar.t : z5;
        boolean z23 = (1048576 & i) != 0 ? njsVar.u : z6;
        boolean z24 = (2097152 & i) != 0 ? njsVar.v : z7;
        boolean z25 = (4194304 & i) != 0 ? njsVar.w : z8;
        boolean z26 = (8388608 & i) != 0 ? njsVar.x : z9;
        vzj0 vzj0Var2 = (16777216 & i) != 0 ? njsVar.y : vzj0Var;
        boolean z27 = (33554432 & i) != 0 ? njsVar.z : z10;
        boolean z28 = (67108864 & i) != 0 ? njsVar.A : z11;
        boolean z29 = (134217728 & i) != 0 ? njsVar.B : z12;
        boolean z30 = (268435456 & i) != 0 ? njsVar.C : false;
        boolean z31 = (536870912 & i) != 0 ? njsVar.D : false;
        boolean z32 = (1073741824 & i) != 0 ? njsVar.E : false;
        boolean z33 = (i & Integer.MIN_VALUE) != 0 ? njsVar.F : z13;
        boolean z34 = (i2 & 1) != 0 ? njsVar.G : z14;
        boolean z35 = (i2 & 2) != 0 ? njsVar.H : false;
        boolean z36 = (i2 & 4) != 0 ? njsVar.I : z15;
        boolean z37 = (i2 & 8) != 0 ? njsVar.J : z16;
        boolean z38 = (i2 & 16) != 0 ? njsVar.K : false;
        fsr fsrVar2 = (i2 & 32) != 0 ? njsVar.L : fsrVar;
        xvm0 xvm0Var2 = (i2 & 64) != 0 ? njsVar.M : xvm0Var;
        js20 js20Var2 = (i2 & 128) != 0 ? njsVar.N : js20Var;
        Long l5 = (i2 & 256) != 0 ? njsVar.O : l2;
        gna gnaVar2 = (i2 & 512) != 0 ? njsVar.P : gnaVar;
        anq0 anq0Var2 = (i2 & 1024) != 0 ? njsVar.Q : anq0Var;
        bg30 bg30Var2 = (i2 & 2048) != 0 ? njsVar.R : bg30Var;
        ui9 ui9Var2 = (i2 & 4096) != 0 ? njsVar.S : ui9Var;
        List list5 = (i2 & 8192) != 0 ? njsVar.T : list2;
        boolean z39 = njsVar.U;
        List list6 = (i2 & 32768) != 0 ? njsVar.V : list3;
        njsVar.getClass();
        tf50Var2.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        return new njs(j4, str6, l3, z17, j5, j6, l4, t3zVar2, z18, tf50Var2, o49Var2, list4, str7, str8, str9, str10, z19, z20, z21, z22, z23, z24, z25, z26, vzj0Var2, z27, z28, z29, z30, z31, z32, z33, z34, z35, z36, z37, z38, fsrVar2, xvm0Var2, js20Var2, l5, gnaVar2, anq0Var2, bg30Var2, ui9Var2, list5, z39, list6);
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(tf50.f33851a);
        fsr fsrVar = this.L;
        if ((fsrVar != null && fsrVar.b) || (fsrVar != null && fsrVar.c)) {
            arrayList.add(tf50.b);
        }
        gna gnaVar = this.P;
        if (gnaVar instanceof ena) {
            ena enaVar = (ena) gnaVar;
            if (enaVar.j != null || enaVar.k != null || enaVar.h != null || enaVar.i != null || enaVar.l != null) {
                arrayList.add(tf50.c);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njs)) {
            return false;
        }
        njs njsVar = (njs) obj;
        return this.f23650a == njsVar.f23650a && this.b.equals(njsVar.b) && Intrinsics.d(this.c, njsVar.c) && this.d == njsVar.d && this.e == njsVar.e && this.f == njsVar.f && Intrinsics.d(this.g, njsVar.g) && this.h == njsVar.h && this.i == njsVar.i && this.j == njsVar.j && this.k == njsVar.k && Intrinsics.d(this.l, njsVar.l) && Intrinsics.d(this.m, njsVar.m) && Intrinsics.d(this.n, njsVar.n) && Intrinsics.d(this.o, njsVar.o) && Intrinsics.d(this.p, njsVar.p) && this.q == njsVar.q && this.r == njsVar.r && this.s == njsVar.s && this.t == njsVar.t && this.u == njsVar.u && this.v == njsVar.v && this.w == njsVar.w && this.x == njsVar.x && Intrinsics.d(this.y, njsVar.y) && this.z == njsVar.z && this.A == njsVar.A && this.B == njsVar.B && this.C == njsVar.C && this.D == njsVar.D && this.E == njsVar.E && this.F == njsVar.F && this.G == njsVar.G && this.H == njsVar.H && this.I == njsVar.I && this.J == njsVar.J && this.K == njsVar.K && Intrinsics.d(this.L, njsVar.L) && Intrinsics.d(this.M, njsVar.M) && Intrinsics.d(this.N, njsVar.N) && Intrinsics.d(this.O, njsVar.O) && Intrinsics.d(this.P, njsVar.P) && Intrinsics.d(this.Q, njsVar.Q) && Intrinsics.d(this.R, njsVar.R) && Intrinsics.d(this.S, njsVar.S) && Intrinsics.d(this.T, njsVar.T) && this.U == njsVar.U && Intrinsics.d(this.V, njsVar.V);
    }

    public final int hashCode() {
        int iB = ua80.b(Long.hashCode(this.f23650a) * 31, 31, this.b);
        Long l = this.c;
        int iB2 = rw2.b(rw2.b(brm0.e((iB + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        Long l2 = this.g;
        int iHashCode = (this.j.hashCode() + brm0.e((this.h.hashCode() + ((iB2 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31, 31, this.i)) * 31;
        o49 o49Var = this.k;
        int iA = dw9.a((iHashCode + (o49Var == null ? 0 : o49Var.hashCode())) * 31, 31, this.l);
        String str = this.m;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x);
        vzj0 vzj0Var = this.y;
        int iE2 = brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iE + (vzj0Var == null ? 0 : vzj0Var.hashCode())) * 31, 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I), 31, this.J), 31, this.K);
        fsr fsrVar = this.L;
        int iHashCode5 = (iE2 + (fsrVar == null ? 0 : fsrVar.hashCode())) * 31;
        xvm0 xvm0Var = this.M;
        int iHashCode6 = (iHashCode5 + (xvm0Var == null ? 0 : xvm0Var.hashCode())) * 31;
        js20 js20Var = this.N;
        int iHashCode7 = (iHashCode6 + (js20Var == null ? 0 : js20Var.hashCode())) * 31;
        Long l3 = this.O;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        gna gnaVar = this.P;
        int iHashCode9 = (iHashCode8 + (gnaVar == null ? 0 : gnaVar.hashCode())) * 31;
        anq0 anq0Var = this.Q;
        int iHashCode10 = (iHashCode9 + (anq0Var == null ? 0 : anq0Var.hashCode())) * 31;
        bg30 bg30Var = this.R;
        int iHashCode11 = (iHashCode10 + (bg30Var == null ? 0 : bg30Var.hashCode())) * 31;
        ui9 ui9Var = this.S;
        return this.V.hashCode() + brm0.e(dw9.a((iHashCode11 + (ui9Var != null ? ui9Var.hashCode() : 0)) * 31, 31, this.T), 31, this.U);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f23650a, "GameLiteStateModel(gameId=", ", statGameId=", this.b);
        sbO.append(", constId=");
        sbO.append(this.c);
        sbO.append(", live=");
        sbO.append(this.d);
        kng0.A(sbO, ", sportId=", this.e, ", subGameId=");
        sbO.append(this.f);
        sbO.append(", champId=");
        sbO.append(this.g);
        sbO.append(", gameConditionType=");
        sbO.append(this.h);
        sbO.append(", isBettingDisabled=");
        sbO.append(this.i);
        sbO.append(", currentNavigationTabType=");
        sbO.append(this.j);
        sbO.append(", currentBroadcastingTab=");
        sbO.append(this.k);
        sbO.append(", infoExpandedSections=");
        sbO.append(this.l);
        sbO.append(", sportName=");
        sbO.append(this.m);
        f140.v(sbO, ", champName=", this.n, ", champUrl=", this.o);
        w6x.z(", extraInfo=", this.p, ", quickBetEnabled=", sbO, this.q);
        w6x.A(", toolbarButtonsEnabled=", ", hasMarketsGraph=", sbO, this.r, this.s);
        w6x.A(", marketsAvailable=", ", statisticAvailable=", sbO, this.t, this.u);
        w6x.A(", settingAvailable=", ", duelAvailable=", sbO, this.v, this.w);
        sbO.append(", subscriptionAvailable=");
        sbO.append(this.x);
        sbO.append(", simulation=");
        sbO.append(this.y);
        w6x.A(", isVideoServiceRun=", ", isZoneServiceRun=", sbO, this.z, this.A);
        w6x.A(", needPlayBroadcast=", ", needPlayZone=", sbO, this.B, this.C);
        w6x.A(", returnToBroadcast=", ", returnToZone=", sbO, this.D, this.E);
        w6x.A(", expandAvailable=", ", betsOnPlayersAvailable=", sbO, this.F, this.G);
        w6x.A(", isLoading=", ", showSubGames=", sbO, this.H, this.I);
        w6x.A(", transferContinue=", ", transferFailed=", sbO, this.J, this.K);
        sbO.append(", gameBroadcastModel=");
        sbO.append(this.L);
        sbO.append(", currentSubGameModel=");
        sbO.append(this.M);
        sbO.append(", currentMarketCategoryModel=");
        sbO.append(this.N);
        sbO.append(", categoryId=");
        sbO.append(this.O);
        sbO.append(", cardSectionModel=");
        sbO.append(this.P);
        sbO.append(", timerModel=");
        sbO.append(this.Q);
        sbO.append(", matchScoreModel=");
        sbO.append(this.R);
        sbO.append(", cachePenaltyModel=");
        sbO.append(this.S);
        esw0.k(sbO, ", favoriteTeamModelList=", this.T, ", rtlSupport=", this.U);
        return ohs0.s(sbO, ", cardsOrder=", this.V, Separators.RPAREN);
    }
}
