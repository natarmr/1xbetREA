package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wmm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39414a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final o4i0 g;
    public final hyx h;
    public final long i;
    public final List j;

    public wmm0(long j, long j2, long j3, long j4, long j5, long j6, o4i0 o4i0Var, hyx hyxVar, long j7, List list) {
        list.getClass();
        this.f39414a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = o4i0Var;
        this.h = hyxVar;
        this.i = j7;
        this.j = list;
    }

    public static wmm0 a(wmm0 wmm0Var, long j, long j2, long j3, long j4, long j5, long j6, o4i0 o4i0Var, hyx hyxVar, long j7, ArrayList arrayList, int i) {
        long j8 = (i & 1) != 0 ? wmm0Var.f39414a : j;
        long j9 = (i & 2) != 0 ? wmm0Var.b : j2;
        long j10 = (i & 4) != 0 ? wmm0Var.c : j3;
        long j11 = (i & 8) != 0 ? wmm0Var.d : j4;
        long j12 = (i & 16) != 0 ? wmm0Var.e : j5;
        long j13 = (i & 32) != 0 ? wmm0Var.f : j6;
        o4i0 o4i0Var2 = (i & 64) != 0 ? wmm0Var.g : o4i0Var;
        hyx hyxVar2 = (i & 128) != 0 ? wmm0Var.h : hyxVar;
        long j14 = j8;
        long j15 = (i & 256) != 0 ? wmm0Var.i : j7;
        List list = (i & 512) != 0 ? wmm0Var.j : arrayList;
        wmm0Var.getClass();
        list.getClass();
        return new wmm0(j14, j9, j10, j11, j12, j13, o4i0Var2, hyxVar2, j15, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmm0)) {
            return false;
        }
        wmm0 wmm0Var = (wmm0) obj;
        return this.f39414a == wmm0Var.f39414a && this.b == wmm0Var.b && this.c == wmm0Var.c && this.d == wmm0Var.d && this.e == wmm0Var.e && this.f == wmm0Var.f && this.g.equals(wmm0Var.g) && this.h.equals(wmm0Var.h) && this.i == wmm0Var.i && Intrinsics.d(this.j, wmm0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + rw2.b((this.h.hashCode() + ((this.g.hashCode() + rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f39414a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f39414a, "StatisticsSelectedStateModel(lastMatchesSelectedTabState=", ", stageSelectedTabState=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", futureGamesSelectedTabState=", this.c, ", playerStatisticsKillsTabStat=");
        sbQ.append(this.d);
        kng0.A(sbQ, ", graphSelectedTabState=", this.e, ", bestHeroesTabState=");
        sbQ.append(this.f);
        sbQ.append(", selectedPlayersState=");
        sbQ.append(this.g);
        sbQ.append(", itemStatisticsState=");
        sbQ.append(this.h);
        sbQ.append(", playerAbilitiesTabId=");
        hne.x(sbQ, this.i, ", expandedBestHeroPlayers=", this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
