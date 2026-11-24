package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m0p0 implements s0p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f20966a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public m0p0(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.f20966a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0p0)) {
            return false;
        }
        m0p0 m0p0Var = (m0p0) obj;
        return Intrinsics.d(this.f20966a, m0p0Var.f20966a) && Intrinsics.d(this.b, m0p0Var.b) && Intrinsics.d(this.c, m0p0Var.c) && Intrinsics.d(this.d, m0p0Var.d) && Intrinsics.d(this.e, m0p0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f20966a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("Basketball(diffScore=", this.f20966a, ", totalAvgQuarter=", this.b, ", totalAvgTeamQuarter=");
        rz4.y(sbQ, this.c, ", winCountHalf1=", this.d, ", win3QuarterPlus=");
        return dw9.q(sbQ, this.e, Separators.RPAREN);
    }
}
