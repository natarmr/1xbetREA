package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class phh {
    public static final ohh Companion = new ohh();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f26996a;
    public final List b;
    public final List c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;

    static {
        wez wezVar = wez.f39042a;
        h = new a8z[]{null, maz.a(wezVar, new gch((byte) 9)), maz.a(wezVar, new gch((byte) 10)), null, null, null, null};
    }

    public /* synthetic */ phh(int i, Integer num, List list, List list2, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i & 1) == 0) {
            this.f26996a = null;
        } else {
            this.f26996a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phh)) {
            return false;
        }
        phh phhVar = (phh) obj;
        return Intrinsics.d(this.f26996a, phhVar.f26996a) && Intrinsics.d(this.b, phhVar.b) && Intrinsics.d(this.c, phhVar.c) && Intrinsics.d(this.d, phhVar.d) && Intrinsics.d(this.e, phhVar.e) && Intrinsics.d(this.f, phhVar.f) && Intrinsics.d(this.g, phhVar.g);
    }

    public final int hashCode() {
        Integer num = this.f26996a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.g;
        return iHashCode6 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberTeamStatisticsResponse(race=");
        sb.append(this.f26996a);
        sb.append(", heroesStatistics=");
        sb.append(this.b);
        sb.append(", bannedHeroesIds=");
        sb.append(this.c);
        sb.append(", netWorth=");
        sb.append(this.d);
        sb.append(", tormentorRespawnTimer=");
        rz4.y(sb, this.e, ", roshanScore=", this.f, ", tormentorScore=");
        return dw9.q(sb, this.g, Separators.RPAREN);
    }
}
