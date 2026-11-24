package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p0p0 implements s0p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f26164a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public p0p0(Integer num, String str, Integer num2, Integer num3, Integer num4) {
        this.f26164a = num;
        this.b = str;
        this.c = num2;
        this.d = num3;
        this.e = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0p0)) {
            return false;
        }
        p0p0 p0p0Var = (p0p0) obj;
        return Intrinsics.d(this.f26164a, p0p0Var.f26164a) && Intrinsics.d(this.b, p0p0Var.b) && Intrinsics.d(this.c, p0p0Var.c) && Intrinsics.d(this.d, p0p0Var.d) && Intrinsics.d(this.e, p0p0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f26164a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f26164a, "Football(diffGoals=", ", teamsScored=", this.b, ", totalGoals3=");
        rz4.y(sbN, this.c, ", totalCorners10=", this.d, ", totalYellowCards5=");
        return dw9.q(sbN, this.e, Separators.RPAREN);
    }
}
