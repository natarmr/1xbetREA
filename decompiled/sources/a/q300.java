package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class q300 {
    public static final i300 Companion = new i300();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f28026a;
    public final Double b;
    public final Double c;

    public /* synthetic */ q300(int i, Double d, Double d2, Double d3) {
        if ((i & 1) == 0) {
            this.f28026a = null;
        } else {
            this.f28026a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q300)) {
            return false;
        }
        q300 q300Var = (q300) obj;
        return Intrinsics.d(this.f28026a, q300Var.f28026a) && Intrinsics.d(this.b, q300Var.b) && Intrinsics.d(this.c, q300Var.c);
    }

    public final int hashCode() {
        Double d = this.f28026a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        return iHashCode2 + (d3 != null ? d3.hashCode() : 0);
    }

    public final String toString() {
        return "LimitsResponse(min=" + this.f28026a + ", max=" + this.b + ", recommendedBetSum=" + this.c + Separators.RPAREN;
    }
}
