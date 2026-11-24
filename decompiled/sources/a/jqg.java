package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16951a;
    public final long b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final o4i0 h;
    public final hyx i;

    public jqg(long j, long j2, long j3, int i, long j4, long j5, long j6, o4i0 o4i0Var, hyx hyxVar) {
        this.f16951a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = o4i0Var;
        this.i = hyxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqg)) {
            return false;
        }
        jqg jqgVar = (jqg) obj;
        return this.f16951a == jqgVar.f16951a && this.b == jqgVar.b && this.c == jqgVar.c && this.d == jqgVar.d && this.e == jqgVar.e && this.f == jqgVar.f && this.g == jqgVar.g && this.h.equals(jqgVar.h) && this.i.equals(jqgVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + rw2.b(rw2.b(rw2.b(twn.a(this.d, rw2.b(rw2.b(Long.hashCode(this.f16951a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f16951a, "CyberGameStatisticSelectedStateModel(lastMatchesSelectedTabId=", ", stageSelectedTabId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", futureGamesSelectedTabId=", this.c, ", mapsSelectedTabIndex=");
        sbQ.append(this.d);
        sbQ.append(", playerStatisticsKillsTabId=");
        sbQ.append(this.e);
        kng0.A(sbQ, ", graphSelectedTabId=", this.f, ", bestHeroesSelectedTabId=");
        sbQ.append(this.g);
        sbQ.append(", selectedPlayersState=");
        sbQ.append(this.h);
        sbQ.append(", itemStatisticsState=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
