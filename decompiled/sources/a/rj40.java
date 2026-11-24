package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class rj40 {
    public static final qj40 Companion = new qj40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f30574a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ rj40(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f30574a = null;
        } else {
            this.f30574a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj40)) {
            return false;
        }
        rj40 rj40Var = (rj40) obj;
        return Intrinsics.d(this.f30574a, rj40Var.f30574a) && Intrinsics.d(this.b, rj40Var.b) && Intrinsics.d(this.c, rj40Var.c);
    }

    public final int hashCode() {
        Integer num = this.f30574a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("MlbbPlayerStatsResponse(wins=", this.f30574a, ", losses=", this.b, ", draws="), this.c, Separators.RPAREN);
    }
}
