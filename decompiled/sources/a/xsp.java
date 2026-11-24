package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xsp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41428a;
    public final String b;
    public final String c;
    public final Long d;

    public xsp(Integer num, String str, String str2, Long l) {
        this.f41428a = num;
        this.b = str;
        this.c = str2;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsp)) {
            return false;
        }
        xsp xspVar = (xsp) obj;
        return Intrinsics.d(this.f41428a, xspVar.f41428a) && Intrinsics.d(this.b, xspVar.b) && Intrinsics.d(this.c, xspVar.c) && Intrinsics.d(this.d, xspVar.d);
    }

    public final int hashCode() {
        Integer num = this.f41428a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f41428a, "FightResultModel(endRound=", ", method=", this.b, ", endTime=");
        sbN.append(this.c);
        sbN.append(", winnerFeedId=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
