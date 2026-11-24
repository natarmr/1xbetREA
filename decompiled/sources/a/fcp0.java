package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class fcp0 {
    public static final ecp0 Companion = new ecp0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new ccp0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9321a;
    public final List b;

    public /* synthetic */ fcp0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f9321a = null;
        } else {
            this.f9321a = num;
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
        if (!(obj instanceof fcp0)) {
            return false;
        }
        fcp0 fcp0Var = (fcp0) obj;
        return Intrinsics.d(this.f9321a, fcp0Var.f9321a) && Intrinsics.d(this.b, fcp0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f9321a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f9321a, "TeamEventResultsResponse(count=", ", items=", Separators.RPAREN, this.b);
    }
}
