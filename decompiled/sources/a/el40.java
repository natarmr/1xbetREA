package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class el40 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl40 f7980a;
    public final fl40 b;
    public final ni40 c;
    public final List d;
    public final long e;
    public final Long f;
    public final Long g;
    public final List h;
    public final int i;
    public final long j;

    public el40(fl40 fl40Var, fl40 fl40Var2, ni40 ni40Var, List list, long j, Long l, Long l2, List list2, int i, long j2) {
        list.getClass();
        list2.getClass();
        this.f7980a = fl40Var;
        this.b = fl40Var2;
        this.c = ni40Var;
        this.d = list;
        this.e = j;
        this.f = l;
        this.g = l2;
        this.h = list2;
        this.i = i;
        this.j = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el40)) {
            return false;
        }
        el40 el40Var = (el40) obj;
        return this.f7980a.equals(el40Var.f7980a) && this.b.equals(el40Var.b) && this.c == el40Var.c && Intrinsics.d(this.d, el40Var.d) && this.e == el40Var.e && Intrinsics.d(this.f, el40Var.f) && Intrinsics.d(this.g, el40Var.g) && Intrinsics.d(this.h, el40Var.h) && this.i == el40Var.i && znq0.e(this.j, el40Var.j);
    }

    public final int hashCode() {
        int iB = rw2.b(dw9.a((this.c.hashCode() + ((this.b.hashCode() + (this.f7980a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        Long l = this.f;
        int iHashCode = (iB + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        return Long.hashCode(this.j) + twn.a(this.i, dw9.a((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.h), 31);
    }

    public final String toString() {
        String strH = znq0.h(this.j);
        StringBuilder sb = new StringBuilder("MlbbStatisticInfoModel(firstTeamStatistic=");
        sb.append(this.f7980a);
        sb.append(", secondTeamStatistic=");
        sb.append(this.b);
        sb.append(", gameStatus=");
        sb.append(this.c);
        sb.append(", draft=");
        sb.append(this.d);
        sb.append(", towerState=");
        sb.append(this.e);
        sb.append(", turtleRespawnTimer=");
        sb.append(this.f);
        sb.append(", lordRespawnTimer=");
        sb.append(this.g);
        sb.append(", periodScores=");
        sb.append(this.h);
        w6x.w(this.i, ", currentPeriod=", ", gameDuration=", strH, sb);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
