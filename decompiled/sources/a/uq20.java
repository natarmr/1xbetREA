package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class uq20 {
    public static final tq20 Companion = new tq20();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f36097a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ uq20(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f36097a = null;
        } else {
            this.f36097a = num;
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
        if (!(obj instanceof uq20)) {
            return false;
        }
        uq20 uq20Var = (uq20) obj;
        return Intrinsics.d(this.f36097a, uq20Var.f36097a) && Intrinsics.d(this.b, uq20Var.b) && Intrinsics.d(this.c, uq20Var.c);
    }

    public final int hashCode() {
        Integer num = this.f36097a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("MarbleGamesPeriodResponse(numberOfPeriod=", this.f36097a, ", firstTeamScore=", this.b, ", secondTeamScore="), this.c, Separators.RPAREN);
    }
}
