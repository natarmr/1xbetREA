package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ubc0 {
    public static final tbc0 Companion = new tbc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f35374a;
    public final Long b;
    public final Long c;
    public final Integer d;

    public /* synthetic */ ubc0(int i, Integer num, Long l, Long l2, Integer num2) {
        if ((i & 1) == 0) {
            this.f35374a = null;
        } else {
            this.f35374a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubc0)) {
            return false;
        }
        ubc0 ubc0Var = (ubc0) obj;
        return Intrinsics.d(this.f35374a, ubc0Var.f35374a) && Intrinsics.d(this.b, ubc0Var.b) && Intrinsics.d(this.c, ubc0Var.c) && Intrinsics.d(this.d, ubc0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f35374a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f35374a, this.b, "PromoCmsGetPromotionStageResponse(stageId=", ", startDate=", ", endDate=");
        sbM.append(this.c);
        sbM.append(", isFinished=");
        sbM.append(this.d);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
