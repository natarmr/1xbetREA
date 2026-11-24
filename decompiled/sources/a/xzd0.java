package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xzd0 {
    public static final wzd0 Companion = new wzd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41750a;
    public final Integer b;

    public /* synthetic */ xzd0(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f41750a = null;
        } else {
            this.f41750a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzd0)) {
            return false;
        }
        xzd0 xzd0Var = (xzd0) obj;
        return Intrinsics.d(this.f41750a, xzd0Var.f41750a) && Intrinsics.d(this.b, xzd0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f41750a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("RainbowStatisticMatchesMatchRoundResponse(winnerTeamId=", this.f41750a, ", winType=", this.b, Separators.RPAREN);
    }
}
