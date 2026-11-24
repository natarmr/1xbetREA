package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z3t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43737a;
    public final long b;
    public final long c;

    public z3t0(long j, long j2, long j3) {
        this.f43737a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3t0)) {
            return false;
        }
        z3t0 z3t0Var = (z3t0) obj;
        return this.f43737a == z3t0Var.f43737a && this.b == z3t0Var.b && znq0.e(this.c, z3t0Var.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f43737a) * 31, 31, this.b);
    }

    public final String toString() {
        String strH = znq0.h(this.c);
        StringBuilder sbQ = kng0.q(this.f43737a, "FightRequestKey(opp1=", ", opp2=");
        kng0.z(sbQ, this.b, ", startTime=", strH);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
