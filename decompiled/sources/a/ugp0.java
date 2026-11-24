package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ugp0 {
    public static final tgp0 Companion = new tgp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f35636a;
    public final Integer b;
    public final php0 c;

    static {
        ohp0 ohp0Var = php0.Companion;
    }

    public /* synthetic */ ugp0(int i, Integer num, Integer num2, php0 php0Var) {
        if ((i & 1) == 0) {
            this.f35636a = null;
        } else {
            this.f35636a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = php0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugp0)) {
            return false;
        }
        ugp0 ugp0Var = (ugp0) obj;
        return Intrinsics.d(this.f35636a, ugp0Var.f35636a) && Intrinsics.d(this.b, ugp0Var.b) && Intrinsics.d(this.c, ugp0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f35636a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        php0 php0Var = this.c;
        return iHashCode2 + (php0Var != null ? php0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("TeamRatingChartBaseResponse(sportId=", this.f35636a, ", subSportId=", this.b, ", response=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
