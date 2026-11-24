package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ihq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14793a;
    public final long b;

    public ihq0(long j, long j2) {
        this.f14793a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihq0)) {
            return false;
        }
        ihq0 ihq0Var = (ihq0) obj;
        return this.f14793a == ihq0Var.f14793a && this.b == ihq0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f14793a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f14793a, "TimeFilterPeriod(startTime=", ", endTime="));
    }
}
