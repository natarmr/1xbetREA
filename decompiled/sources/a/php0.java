package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class php0 {
    public static final ohp0 Companion = new ohp0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new mhp0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f27010a;
    public final Integer b;
    public final List c;

    public /* synthetic */ php0(int i, Integer num, Integer num2, List list) {
        if ((i & 1) == 0) {
            this.f27010a = null;
        } else {
            this.f27010a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof php0)) {
            return false;
        }
        php0 php0Var = (php0) obj;
        return Intrinsics.d(this.f27010a, php0Var.f27010a) && Intrinsics.d(this.b, php0Var.b) && Intrinsics.d(this.c, php0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f27010a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(hne.q("TeamRatingChartValueResponse(currentFIFARanking=", this.f27010a, ", averagePosition=", this.b, ", pointList="), this.c, Separators.RPAREN);
    }
}
