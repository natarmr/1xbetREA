package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.presentation.LeaderBoardScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ihz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderBoardScreenParams f14803a;
    public final long b;
    public final int c;
    public final xhz d;
    public final qgz e;
    public final epe f;
    public final ypl0 g;
    public final List h;
    public final l2h i;
    public final j0g0 j;
    public final Pair k;
    public final j0g0 l;
    public final j0g0 m;
    public final j0g0 n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public ihz(LeaderBoardScreenParams leaderBoardScreenParams, long j, int i, xhz xhzVar, qgz qgzVar, epe epeVar, ypl0 ypl0Var, List list, l2h l2hVar, j0g0 j0g0Var, Pair pair, j0g0 j0g0Var2, j0g0 j0g0Var3, j0g0 j0g0Var4, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f14803a = leaderBoardScreenParams;
        this.b = j;
        this.c = i;
        this.d = xhzVar;
        this.e = qgzVar;
        this.f = epeVar;
        this.g = ypl0Var;
        this.h = list;
        this.i = l2hVar;
        this.j = j0g0Var;
        this.k = pair;
        this.l = j0g0Var2;
        this.m = j0g0Var3;
        this.n = j0g0Var4;
        this.o = z;
        this.p = z2;
        this.q = z3;
    }

    public static ihz a(ihz ihzVar, long j, int i, xhz xhzVar, qgz qgzVar, epe epeVar, ypl0 ypl0Var, List list, l2h l2hVar, j0g0 j0g0Var, Pair pair, j0g0 j0g0Var2, j0g0 j0g0Var3, j0g0 j0g0Var4, boolean z, boolean z2, boolean z3, int i2) {
        LeaderBoardScreenParams leaderBoardScreenParams = ihzVar.f14803a;
        long j2 = (i2 & 2) != 0 ? ihzVar.b : j;
        int i3 = (i2 & 4) != 0 ? ihzVar.c : i;
        xhz xhzVar2 = (i2 & 8) != 0 ? ihzVar.d : xhzVar;
        qgz qgzVar2 = (i2 & 16) != 0 ? ihzVar.e : qgzVar;
        epe epeVar2 = (i2 & 32) != 0 ? ihzVar.f : epeVar;
        ypl0 ypl0Var2 = (i2 & 64) != 0 ? ihzVar.g : ypl0Var;
        List list2 = (i2 & 128) != 0 ? ihzVar.h : list;
        l2h l2hVar2 = (i2 & 256) != 0 ? ihzVar.i : l2hVar;
        j0g0 j0g0Var5 = (i2 & 512) != 0 ? ihzVar.j : j0g0Var;
        Pair pair2 = (i2 & 1024) != 0 ? ihzVar.k : pair;
        j0g0 j0g0Var6 = (i2 & 2048) != 0 ? ihzVar.l : j0g0Var2;
        j0g0 j0g0Var7 = (i2 & 4096) != 0 ? ihzVar.m : j0g0Var3;
        j0g0 j0g0Var8 = (i2 & 8192) != 0 ? ihzVar.n : j0g0Var4;
        boolean z4 = (i2 & 16384) != 0 ? ihzVar.o : z;
        boolean z5 = (i2 & 32768) != 0 ? ihzVar.p : z2;
        boolean z6 = (i2 & 65536) != 0 ? ihzVar.q : z3;
        ihzVar.getClass();
        ypl0Var2.getClass();
        list2.getClass();
        return new ihz(leaderBoardScreenParams, j2, i3, xhzVar2, qgzVar2, epeVar2, ypl0Var2, list2, l2hVar2, j0g0Var5, pair2, j0g0Var6, j0g0Var7, j0g0Var8, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihz)) {
            return false;
        }
        ihz ihzVar = (ihz) obj;
        return this.f14803a.equals(ihzVar.f14803a) && this.b == ihzVar.b && this.c == ihzVar.c && this.d == ihzVar.d && this.e == ihzVar.e && this.f == ihzVar.f && this.g.equals(ihzVar.g) && Intrinsics.d(this.h, ihzVar.h) && this.i.equals(ihzVar.i) && Intrinsics.d(this.j, ihzVar.j) && Intrinsics.d(this.k, ihzVar.k) && Intrinsics.d(this.l, ihzVar.l) && Intrinsics.d(this.m, ihzVar.m) && Intrinsics.d(this.n, ihzVar.n) && this.o == ihzVar.o && this.p == ihzVar.p && this.q == ihzVar.q;
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + dw9.a((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + twn.a(this.c, rw2.b(this.f14803a.hashCode() * 31, 31, this.b), 31)) * 31)) * 31)) * 31)) * 31, 31, this.h)) * 31;
        j0g0 j0g0Var = this.j;
        int iB = (iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31;
        Pair pair = this.k;
        int iHashCode2 = (iB + (pair == null ? 0 : pair.hashCode())) * 31;
        j0g0 j0g0Var2 = this.l;
        int iB2 = (iHashCode2 + (j0g0Var2 == null ? 0 : j0g0.b(j0g0Var2.f15681a))) * 31;
        j0g0 j0g0Var3 = this.m;
        int iB3 = (iB2 + (j0g0Var3 == null ? 0 : j0g0.b(j0g0Var3.f15681a))) * 31;
        j0g0 j0g0Var4 = this.n;
        return Boolean.hashCode(this.q) + brm0.e(brm0.e((iB3 + (j0g0Var4 != null ? j0g0.b(j0g0Var4.f15681a) : 0)) * 31, 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardStateModel(params=");
        sb.append(this.f14803a);
        sb.append(", selectedSubSportId=");
        sb.append(this.b);
        sb.append(", selectedYear=");
        sb.append(this.c);
        sb.append(", selectedType=");
        sb.append(this.d);
        sb.append(", selectedRegions=");
        sb.append(this.e);
        sb.append(", selectedTeamsType=");
        sb.append(this.f);
        sb.append(", sportSimpleModel=");
        sb.append(this.g);
        sb.append(", disciplineFilter=");
        sb.append(this.h);
        sb.append(", analyticsCardStyle=");
        sb.append(this.i);
        sb.append(", leaderboard=");
        sb.append(this.j);
        sb.append(", availableYearsBySubSportId=");
        sb.append(this.k);
        sb.append(", dotaTeams=");
        sb.append(this.l);
        sb.append(", csTeams=");
        sb.append(this.m);
        sb.append(", players=");
        sb.append(this.n);
        w6x.A(", resetScroll=", ", connected=", sb, this.o, this.p);
        return f140.n(sb, ", contentLoaded=", this.q, Separators.RPAREN);
    }
}
