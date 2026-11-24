package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class egh {
    public static final dgh Companion = new dgh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7765a;
    public final Long b;
    public final Integer c;

    public /* synthetic */ egh(int i, Boolean bool, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f7765a = null;
        } else {
            this.f7765a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egh)) {
            return false;
        }
        egh eghVar = (egh) obj;
        return Intrinsics.d(this.f7765a, eghVar.f7765a) && Intrinsics.d(this.b, eghVar.b) && Intrinsics.d(this.c, eghVar.c);
    }

    public final int hashCode() {
        Boolean bool = this.f7765a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberStatisticDotaPicksResponse(isBanned=");
        sb.append(this.f7765a);
        sb.append(", heroId=");
        sb.append(this.b);
        sb.append(", teamNumber=");
        return dw9.q(sb, this.c, Separators.RPAREN);
    }
}
