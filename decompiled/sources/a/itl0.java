package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class itl0 {
    public static final etl0 Companion = new etl0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new fzk0(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f15359a;
    public final List b;

    public /* synthetic */ itl0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f15359a = null;
        } else {
            this.f15359a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itl0)) {
            return false;
        }
        itl0 itl0Var = (itl0) obj;
        return Intrinsics.d(this.f15359a, itl0Var.f15359a) && Intrinsics.d(this.b, itl0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f15359a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f15359a, "SportsResultsResponse(count=", ", items=", Separators.RPAREN, this.b);
    }
}
