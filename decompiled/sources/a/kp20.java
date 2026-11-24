package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kp20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18658a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public kp20(String str, Integer num, Integer num2, Integer num3) {
        this.f18658a = str;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp20)) {
            return false;
        }
        kp20 kp20Var = (kp20) obj;
        return this.f18658a.equals(kp20Var.f18658a) && Intrinsics.d(this.b, kp20Var.b) && Intrinsics.d(this.c, kp20Var.c) && Intrinsics.d(this.d, kp20Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f18658a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(axq.p(this.b, "MapStatisticModel(mapName=", this.f18658a, ", ctWinRate=", ", tWinRate="), this.c, ", mapCount=", this.d, Separators.RPAREN);
    }
}
