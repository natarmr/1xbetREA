package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ehp0 {
    public static final dhp0 Companion = new dhp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f7818a;
    public final Integer b;

    public /* synthetic */ ehp0(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f7818a = null;
        } else {
            this.f7818a = num;
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
        if (!(obj instanceof ehp0)) {
            return false;
        }
        ehp0 ehp0Var = (ehp0) obj;
        return Intrinsics.d(this.f7818a, ehp0Var.f7818a) && Intrinsics.d(this.b, ehp0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f7818a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("TeamRatingChartPointResponse(year=", this.f7818a, ", rank=", this.b, Separators.RPAREN);
    }
}
