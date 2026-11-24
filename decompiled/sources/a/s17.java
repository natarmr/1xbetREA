package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s17 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31440a;
    public final long b;

    public s17(long j, long j2) {
        this.f31440a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s17)) {
            return false;
        }
        s17 s17Var = (s17) obj;
        return this.f31440a == s17Var.f31440a && this.b == s17Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f31440a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f31440a, "OnPeriodDateMailApply(fromTimeStamp=", ", toTimeStamp="));
    }
}
