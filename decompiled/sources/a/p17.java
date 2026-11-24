package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p17 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26186a;
    public final long b;

    public p17(long j, long j2) {
        this.f26186a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p17)) {
            return false;
        }
        p17 p17Var = (p17) obj;
        return this.f26186a == p17Var.f26186a && this.b == p17Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f26186a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f26186a, "OnDatePeriodMailApply(fromTimeStamp=", ", toTimeStamp="));
    }
}
