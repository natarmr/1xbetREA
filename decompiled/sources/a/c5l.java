package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c5l implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9l f3777a;
    public final y9l b;
    public final y9l c;
    public final List d;
    public final List e;

    public c5l(g9l g9lVar, y9l y9lVar, y9l y9lVar2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f3777a = g9lVar;
        this.b = y9lVar;
        this.c = y9lVar2;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5l)) {
            return false;
        }
        c5l c5lVar = (c5l) obj;
        return this.f3777a.equals(c5lVar.f3777a) && this.b.equals(c5lVar.b) && this.c.equals(c5lVar.c) && Intrinsics.d(this.d, c5lVar.d) && Intrinsics.d(this.e, c5lVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a((this.c.hashCode() + ((this.b.hashCode() + (this.f3777a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DotaInfoModel(statisticDetails=");
        sb.append(this.f3777a);
        sb.append(", firstTeamStatistic=");
        sb.append(this.b);
        sb.append(", secondTeamStatistic=");
        sb.append(this.c);
        sb.append(", heroesStatisticList=");
        sb.append(this.d);
        sb.append(", periodScores=");
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
