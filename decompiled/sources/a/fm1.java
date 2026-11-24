package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class fm1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9764a;
    public final long b;

    public fm1(long j, long j2) {
        this.f9764a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm1)) {
            return false;
        }
        fm1 fm1Var = (fm1) obj;
        return this.f9764a == fm1Var.f9764a && this.b == fm1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f9764a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f9764a, "MyAggregatorScreen(idToOpen=", ", partitionId="));
    }
}
