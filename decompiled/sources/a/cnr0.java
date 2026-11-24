package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class cnr0 {
    public static final anr0 Companion = new anr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f4670a;
    public final Long b;
    public final Long c;

    public /* synthetic */ cnr0(int i, Long l, Long l2, Long l3) {
        if ((i & 1) == 0) {
            this.f4670a = null;
        } else {
            this.f4670a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnr0)) {
            return false;
        }
        cnr0 cnr0Var = (cnr0) obj;
        return Intrinsics.d(this.f4670a, cnr0Var.f4670a) && Intrinsics.d(this.b, cnr0Var.b) && Intrinsics.d(this.c, cnr0Var.c);
    }

    public final int hashCode() {
        Long l = this.f4670a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.r(rz4.o(this.f4670a, this.b, "TotoGameOutcomeResponse(outcome=", ", playerPercentage=", ", bukPercentage="), this.c, Separators.RPAREN);
    }
}
