package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o310 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24559a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final a610 f;
    public final a610 g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final zz00 l;
    public final long m;
    public final long n;
    public final List o;
    public final List p;
    public final List q;

    public o310(long j, long j2, int i, int i2, int i3, a610 a610Var, a610 a610Var2, List list, List list2, List list3, List list4, zz00 zz00Var, long j3, long j4, List list5, List list6, List list7) {
        rz4.B(list, list2, list3, list4, list5);
        list6.getClass();
        list7.getClass();
        this.f24559a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = a610Var;
        this.g = a610Var2;
        this.h = list;
        this.i = list2;
        this.j = list3;
        this.k = list4;
        this.l = zz00Var;
        this.m = j3;
        this.n = j4;
        this.o = list5;
        this.p = list6;
        this.q = list7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o310)) {
            return false;
        }
        o310 o310Var = (o310) obj;
        return this.f24559a == o310Var.f24559a && this.b == o310Var.b && this.c == o310Var.c && this.d == o310Var.d && this.e == o310Var.e && this.f.equals(o310Var.f) && this.g.equals(o310Var.g) && Intrinsics.d(this.h, o310Var.h) && Intrinsics.d(this.i, o310Var.i) && Intrinsics.d(this.j, o310Var.j) && Intrinsics.d(this.k, o310Var.k) && this.l == o310Var.l && znq0.e(this.m, o310Var.m) && this.n == o310Var.n && Intrinsics.d(this.o, o310Var.o) && Intrinsics.d(this.p, o310Var.p) && Intrinsics.d(this.q, o310Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + dw9.a(dw9.a(rw2.b(rw2.b((this.l.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a((this.g.hashCode() + ((this.f.hashCode() + twn.a(this.e, twn.a(this.d, twn.a(this.c, rw2.b(Long.hashCode(this.f24559a) * 31, 31, this.b), 31), 31), 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        String strH = znq0.h(this.m);
        StringBuilder sbQ = kng0.q(this.f24559a, "LolStatisticInfoGameModel(towerState=", ", ingibitorsState=");
        ua80.v(sbQ, this.b, ", nashorRespawnTimer=", this.c);
        rw2.s(this.d, this.e, ", haraldRespawnTimer=", ", dragonRespawnTimer=", sbQ);
        sbQ.append(", firstTeamStatistic=");
        sbQ.append(this.f);
        sbQ.append(", secondTeamStatistic=");
        sbQ.append(this.g);
        hne.v(", firstTeamHeroStatistic=", ", secondTeamHeroStatistic=", sbQ, this.h, this.i);
        hne.v(", allHeroesStatistics=", ", allDragons=", sbQ, this.j, this.k);
        sbQ.append(", gameStatus=");
        sbQ.append(this.l);
        sbQ.append(", gameDuration=");
        sbQ.append(strH);
        kng0.A(sbQ, ", dragonState=", this.n, ", firstTeamPicksModel=");
        b1j.y(", secondTeamPicksModel=", ", gameLog=", sbQ, this.o, this.p);
        return dw9.r(sbQ, this.q, Separators.RPAREN);
    }
}
