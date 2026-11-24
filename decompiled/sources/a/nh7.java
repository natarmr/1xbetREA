package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class nh7 {
    public static final mh7 Companion = new mh7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f23520a;
    public final Double b;
    public final Double c;

    public /* synthetic */ nh7(int i, Integer num, Double d, Double d2) {
        if ((i & 1) == 0) {
            this.f23520a = null;
        } else {
            this.f23520a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh7)) {
            return false;
        }
        nh7 nh7Var = (nh7) obj;
        return Intrinsics.d(this.f23520a, nh7Var.f23520a) && Intrinsics.d(this.b, nh7Var.b) && Intrinsics.d(this.c, nh7Var.c);
    }

    public final int hashCode() {
        Integer num = this.f23520a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "BetOutcomeResponse(outcome=" + this.f23520a + ", playerPercentage=" + this.b + ", bukPercentage=" + this.c + Separators.RPAREN;
    }
}
