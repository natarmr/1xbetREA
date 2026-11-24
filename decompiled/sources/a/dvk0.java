package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dvk0 {
    public final wcb A;
    public final mtk0 B;
    public final ttk0 C;
    public final boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6747a;
    public final xl9 b;
    public final a9l0 c;
    public final sdt d;
    public final List e;
    public final ptk0 f;
    public final cvk0 g;
    public final gvk0 h;
    public final evk0 i;
    public final lpp0 j;
    public final pvk0 k;
    public final rtk0 l;
    public final fvk0 m;
    public final bvk0 n;
    public final otk0 o;
    public final jwk0 p;
    public final gqk0 q;
    public final gtk0 r;
    public final ltk0 s;
    public final etk0 t;
    public final qtk0 u;
    public final ntk0 v;
    public final dtk0 w;
    public final avk0 x;
    public final ctk0 y;
    public final stk0 z;

    public dvk0(boolean z, xl9 xl9Var, a9l0 a9l0Var, sdt sdtVar, List list, ptk0 ptk0Var, cvk0 cvk0Var, gvk0 gvk0Var, evk0 evk0Var, lpp0 lpp0Var, pvk0 pvk0Var, rtk0 rtk0Var, fvk0 fvk0Var, bvk0 bvk0Var, otk0 otk0Var, jwk0 jwk0Var, gqk0 gqk0Var, gtk0 gtk0Var, ltk0 ltk0Var, etk0 etk0Var, qtk0 qtk0Var, ntk0 ntk0Var, dtk0 dtk0Var, avk0 avk0Var, ctk0 ctk0Var, stk0 stk0Var, wcb wcbVar, mtk0 mtk0Var, ttk0 ttk0Var, boolean z2) {
        this.f6747a = z;
        this.b = xl9Var;
        this.c = a9l0Var;
        this.d = sdtVar;
        this.e = list;
        this.f = ptk0Var;
        this.g = cvk0Var;
        this.h = gvk0Var;
        this.i = evk0Var;
        this.j = lpp0Var;
        this.k = pvk0Var;
        this.l = rtk0Var;
        this.m = fvk0Var;
        this.n = bvk0Var;
        this.o = otk0Var;
        this.p = jwk0Var;
        this.q = gqk0Var;
        this.r = gtk0Var;
        this.s = ltk0Var;
        this.t = etk0Var;
        this.u = qtk0Var;
        this.v = ntk0Var;
        this.w = dtk0Var;
        this.x = avk0Var;
        this.y = ctk0Var;
        this.z = stk0Var;
        this.A = wcbVar;
        this.B = mtk0Var;
        this.C = ttk0Var;
        this.D = z2;
    }

    public static dvk0 a(dvk0 dvk0Var, boolean z, xl9 xl9Var, a9l0 a9l0Var, sdt sdtVar, ptk0 ptk0Var, cvk0 cvk0Var, gvk0 gvk0Var, evk0 evk0Var, lpp0 lpp0Var, pvk0 pvk0Var, rtk0 rtk0Var, fvk0 fvk0Var, bvk0 bvk0Var, otk0 otk0Var, jwk0 jwk0Var, gqk0 gqk0Var, gtk0 gtk0Var, ltk0 ltk0Var, etk0 etk0Var, qtk0 qtk0Var, ntk0 ntk0Var, dtk0 dtk0Var, avk0 avk0Var, ctk0 ctk0Var, stk0 stk0Var, wcb wcbVar, mtk0 mtk0Var, int i) {
        boolean z2 = (i & 1) != 0 ? dvk0Var.f6747a : z;
        xl9 xl9Var2 = (i & 2) != 0 ? dvk0Var.b : xl9Var;
        a9l0 a9l0Var2 = (i & 4) != 0 ? dvk0Var.c : a9l0Var;
        sdt sdtVar2 = (i & 8) != 0 ? dvk0Var.d : sdtVar;
        List list = dvk0Var.e;
        ptk0 ptk0Var2 = (i & 32) != 0 ? dvk0Var.f : ptk0Var;
        cvk0 cvk0Var2 = (i & 64) != 0 ? dvk0Var.g : cvk0Var;
        gvk0 gvk0Var2 = (i & 128) != 0 ? dvk0Var.h : gvk0Var;
        evk0 evk0Var2 = (i & 256) != 0 ? dvk0Var.i : evk0Var;
        lpp0 lpp0Var2 = (i & 512) != 0 ? dvk0Var.j : lpp0Var;
        pvk0 pvk0Var2 = (i & 1024) != 0 ? dvk0Var.k : pvk0Var;
        rtk0 rtk0Var2 = (i & 2048) != 0 ? dvk0Var.l : rtk0Var;
        fvk0 fvk0Var2 = (i & 4096) != 0 ? dvk0Var.m : fvk0Var;
        bvk0 bvk0Var2 = (i & 8192) != 0 ? dvk0Var.n : bvk0Var;
        otk0 otk0Var2 = (i & 16384) != 0 ? dvk0Var.o : otk0Var;
        jwk0 jwk0Var2 = (32768 & i) != 0 ? dvk0Var.p : jwk0Var;
        gqk0 gqk0Var2 = (65536 & i) != 0 ? dvk0Var.q : gqk0Var;
        gtk0 gtk0Var2 = (131072 & i) != 0 ? dvk0Var.r : gtk0Var;
        ltk0 ltk0Var2 = (262144 & i) != 0 ? dvk0Var.s : ltk0Var;
        etk0 etk0Var2 = (524288 & i) != 0 ? dvk0Var.t : etk0Var;
        qtk0 qtk0Var2 = (1048576 & i) != 0 ? dvk0Var.u : qtk0Var;
        ntk0 ntk0Var2 = (2097152 & i) != 0 ? dvk0Var.v : ntk0Var;
        dtk0 dtk0Var2 = (4194304 & i) != 0 ? dvk0Var.w : dtk0Var;
        avk0 avk0Var2 = (8388608 & i) != 0 ? dvk0Var.x : avk0Var;
        ctk0 ctk0Var2 = (16777216 & i) != 0 ? dvk0Var.y : ctk0Var;
        stk0 stk0Var2 = (33554432 & i) != 0 ? dvk0Var.z : stk0Var;
        wcb wcbVar2 = (67108864 & i) != 0 ? dvk0Var.A : wcbVar;
        mtk0 mtk0Var2 = (i & 134217728) != 0 ? dvk0Var.B : mtk0Var;
        ttk0 ttk0Var = dvk0Var.C;
        boolean z3 = dvk0Var.D;
        dvk0Var.getClass();
        return new dvk0(z2, xl9Var2, a9l0Var2, sdtVar2, list, ptk0Var2, cvk0Var2, gvk0Var2, evk0Var2, lpp0Var2, pvk0Var2, rtk0Var2, fvk0Var2, bvk0Var2, otk0Var2, jwk0Var2, gqk0Var2, gtk0Var2, ltk0Var2, etk0Var2, qtk0Var2, ntk0Var2, dtk0Var2, avk0Var2, ctk0Var2, stk0Var2, wcbVar2, mtk0Var2, ttk0Var, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvk0)) {
            return false;
        }
        dvk0 dvk0Var = (dvk0) obj;
        return this.f6747a == dvk0Var.f6747a && this.b.equals(dvk0Var.b) && this.c.equals(dvk0Var.c) && this.d.equals(dvk0Var.d) && this.e.equals(dvk0Var.e) && Intrinsics.d(this.f, dvk0Var.f) && Intrinsics.d(this.g, dvk0Var.g) && Intrinsics.d(this.h, dvk0Var.h) && this.i.equals(dvk0Var.i) && this.j.equals(dvk0Var.j) && this.k.equals(dvk0Var.k) && this.l.equals(dvk0Var.l) && this.m.equals(dvk0Var.m) && this.n.equals(dvk0Var.n) && this.o.equals(dvk0Var.o) && this.p.equals(dvk0Var.p) && this.q.equals(dvk0Var.q) && this.r.equals(dvk0Var.r) && this.s.equals(dvk0Var.s) && this.t.equals(dvk0Var.t) && this.u.equals(dvk0Var.u) && this.v.equals(dvk0Var.v) && this.w.equals(dvk0Var.w) && this.x.equals(dvk0Var.x) && this.y.equals(dvk0Var.y) && this.z.equals(dvk0Var.z) && Intrinsics.d(this.A, dvk0Var.A) && this.B == dvk0Var.B && this.C.equals(dvk0Var.C) && this.D == dvk0Var.D;
    }

    public final int hashCode() {
        int iA = dw9.a((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f6747a) * 31)) * 31)) * 31)) * 31, 31, this.e);
        ptk0 ptk0Var = this.f;
        int iHashCode = (((iA + (ptk0Var == null ? 0 : ptk0Var.hashCode())) * 31) + (this.g == null ? 0 : 847888384)) * 31;
        gvk0 gvk0Var = this.h;
        int iHashCode2 = (this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((iHashCode + (gvk0Var == null ? 0 : gvk0Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        wcb wcbVar = this.A;
        return Boolean.hashCode(this.D) + ((this.C.hashCode() + ((this.B.hashCode() + ((iHashCode2 + (wcbVar != null ? wcbVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SpecialEventTabState(scrollToTop=" + this.f6747a + ", calendarState=" + this.b + ", sportFilterState=" + this.c + ", gamesSection=" + this.d + ", activeSectionList=" + this.e + ", myBetsHistorySection=" + this.f + ", standingsSection=" + this.g + ", tournamentGrid=" + this.h + ", teamsSection=" + this.i + ", teamsGamesSubSection=" + this.j + ", venuesSection=" + this.k + ", promotionsSection=" + this.l + ", topPlayersSection=" + this.m + ", stadiumsSection=" + this.n + ", medalTableSection=" + this.o + ", whoWinSection=" + this.p + ", aboutTournamentSection=" + this.q + ", dotaPopularHeroes=" + this.r + ", lolPopularChampions=" + this.s + ", cyberTopPlayersSection=" + this.t + ", prizeDistributionSection=" + this.u + ", mapStatisticSection=" + this.v + ", cyberTeamsSection=" + this.w + ", socialNetsSection=" + this.x + ", cyberGroupsSection=" + this.y + ", rankingsSection=" + this.z + ", champImagesHolder=" + this.A + ", lottieErrorType=" + this.B + ", settingsModel=" + this.C + ", rtlSupport=" + this.D + Separators.RPAREN;
    }
}
