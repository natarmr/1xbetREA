package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r0p0 implements s0p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f29641a;
    public final Integer b;
    public final String c;
    public final String d;
    public final Integer e;

    public r0p0(Integer num, Integer num2, Integer num3, String str, String str2) {
        this.f29641a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
        this.e = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0p0)) {
            return false;
        }
        r0p0 r0p0Var = (r0p0) obj;
        return Intrinsics.d(this.f29641a, r0p0Var.f29641a) && Intrinsics.d(this.b, r0p0Var.b) && Intrinsics.d(this.c, r0p0Var.c) && Intrinsics.d(this.d, r0p0Var.d) && Intrinsics.d(this.e, r0p0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f29641a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.e;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("Tennis(holdServe=", this.f29641a, ", twoSetRate=", this.b, ", winCount3Set=");
        f140.v(sbQ, this.c, ", winCountLossOneSet=", this.d, ", countSet95=");
        return dw9.q(sbQ, this.e, Separators.RPAREN);
    }
}
