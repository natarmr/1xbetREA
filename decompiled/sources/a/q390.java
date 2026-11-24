package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class q390 {
    public static final p390 Companion = new p390();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28041a;
    public final Integer b;
    public final Integer c;
    public final Long d;
    public final Double e;

    public /* synthetic */ q390(int i, Long l, Integer num, Integer num2, Long l2, Double d) {
        if ((i & 1) == 0) {
            this.f28041a = null;
        } else {
            this.f28041a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q390)) {
            return false;
        }
        q390 q390Var = (q390) obj;
        return Intrinsics.d(this.f28041a, q390Var.f28041a) && Intrinsics.d(this.b, q390Var.b) && Intrinsics.d(this.c, q390Var.c) && Intrinsics.d(this.d, q390Var.d) && Intrinsics.d(this.e, q390Var.e);
    }

    public final int hashCode() {
        Long l = this.f28041a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.e;
        return iHashCode4 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f28041a, "PayRotationResponse(userId=", ", bonusBalance=", ", rotationCount=");
        cs0.w(this.c, this.d, ", accountId=", ", balanceNew=", sbQ);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
