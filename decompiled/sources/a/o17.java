package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o17 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24465a;
    public final long b;

    public o17(long j, long j2) {
        this.f24465a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o17)) {
            return false;
        }
        o17 o17Var = (o17) obj;
        return this.f24465a == o17Var.f24465a && this.b == o17Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f24465a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f24465a, "OnDatePeriodApply(fromTimeStamp=", ", toTimeStamp="));
    }
}
