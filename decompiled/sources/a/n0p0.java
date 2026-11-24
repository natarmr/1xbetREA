package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n0p0 implements s0p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f22711a;
    public final Double b;
    public final Double c;
    public final Double d;

    public n0p0(Double d, Double d2, Double d3, Double d4) {
        this.f22711a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0p0)) {
            return false;
        }
        n0p0 n0p0Var = (n0p0) obj;
        return Intrinsics.d(this.f22711a, n0p0Var.f22711a) && Intrinsics.d(this.b, n0p0Var.b) && Intrinsics.d(this.c, n0p0Var.c) && Intrinsics.d(this.d, n0p0Var.d);
    }

    public final int hashCode() {
        Double d = this.f22711a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        return iHashCode3 + (d4 != null ? d4.hashCode() : 0);
    }

    public final String toString() {
        return "Cricket(teamRunRate=" + this.f22711a + ", teamBatAvg=" + this.b + ", teamBowlAvg=" + this.c + ", netPro=" + this.d + Separators.RPAREN;
    }
}
