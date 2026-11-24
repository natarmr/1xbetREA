package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ugh0 {
    public static final ngh0 Companion = new ngh0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new igh0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f35624a;
    public final List b;

    public /* synthetic */ ugh0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f35624a = null;
        } else {
            this.f35624a = num;
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
        if (!(obj instanceof ugh0)) {
            return false;
        }
        ugh0 ugh0Var = (ugh0) obj;
        return Intrinsics.d(this.f35624a, ugh0Var.f35624a) && Intrinsics.d(this.b, ugh0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f35624a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f35624a, "SearchResultsResponse(count=", ", items=", Separators.RPAREN, this.b);
    }
}
