package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l42 implements o42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19383a;
    public final long b;

    public l42(long j, long j2) {
        this.f19383a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l42)) {
            return false;
        }
        l42 l42Var = (l42) obj;
        return this.f19383a == l42Var.f19383a && this.b == l42Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f19383a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f19383a, "OnPeriodSelected(fromTimeStamp=", ", toTimeStamp="));
    }
}
