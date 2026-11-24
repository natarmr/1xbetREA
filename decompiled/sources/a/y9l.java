package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6l f42253a;
    public final List b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public y9l(i6l i6lVar, List list, List list2, int i, int i2, int i3, int i4) {
        list.getClass();
        list2.getClass();
        this.f42253a = i6lVar;
        this.b = list;
        this.c = list2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9l)) {
            return false;
        }
        y9l y9lVar = (y9l) obj;
        return this.f42253a == y9lVar.f42253a && Intrinsics.d(this.b, y9lVar.b) && Intrinsics.d(this.c, y9lVar.c) && this.d == y9lVar.d && this.e == y9lVar.e && this.f == y9lVar.f && this.g == y9lVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, twn.a(this.e, twn.a(this.d, dw9.a(dw9.a(this.f42253a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DotaStatisticTeamModel(race=");
        sb.append(this.f42253a);
        sb.append(", heroesStatisticList=");
        sb.append(this.b);
        sb.append(", bannedHeroesIds=");
        brm0.v(this.d, ", netWorth=", ", tormentorRespawnTimer=", sb, this.c);
        axq.r(this.e, this.f, ", roshanScore=", ", tormentorScore=", sb);
        return rz4.j(this.g, Separators.RPAREN, sb);
    }
}
