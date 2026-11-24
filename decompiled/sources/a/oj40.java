package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oj40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f25344a;
    public final Integer b;
    public final Integer c;

    public oj40(Integer num, Integer num2, Integer num3) {
        this.f25344a = num;
        this.b = num2;
        this.c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj40)) {
            return false;
        }
        oj40 oj40Var = (oj40) obj;
        return Intrinsics.d(this.f25344a, oj40Var.f25344a) && Intrinsics.d(this.b, oj40Var.b) && Intrinsics.d(this.c, oj40Var.c);
    }

    public final int hashCode() {
        Integer num = this.f25344a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("MlbbPlayerStatsModel(wins=", this.f25344a, ", losses=", this.b, ", draws="), this.c, Separators.RPAREN);
    }
}
