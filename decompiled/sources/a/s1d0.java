package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s1d0 implements t1d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31451a;
    public final long b;

    public s1d0(long j, long j2) {
        this.f31451a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1d0)) {
            return false;
        }
        s1d0 s1d0Var = (s1d0) obj;
        return this.f31451a == s1d0Var.f31451a && this.b == s1d0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f31451a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f31451a, "ProphylaxisNotification(startDate=", ", endDate="));
    }
}
