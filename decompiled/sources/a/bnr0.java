package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bnr0 {
    public static final zmr0 Companion = new zmr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f2899a;
    public final Long b;
    public final Long c;

    public /* synthetic */ bnr0(int i, Long l, Long l2, Long l3) {
        if ((i & 1) == 0) {
            this.f2899a = null;
        } else {
            this.f2899a = l;
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
        if (!(obj instanceof bnr0)) {
            return false;
        }
        bnr0 bnr0Var = (bnr0) obj;
        return Intrinsics.d(this.f2899a, bnr0Var.f2899a) && Intrinsics.d(this.b, bnr0Var.b) && Intrinsics.d(this.c, bnr0Var.c);
    }

    public final int hashCode() {
        Long l = this.f2899a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.r(rz4.o(this.f2899a, this.b, "TotoGameOutcomeResponse(outcome=", ", playerPercentage=", ", bukPercentage="), this.c, Separators.RPAREN);
    }
}
