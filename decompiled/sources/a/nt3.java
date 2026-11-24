package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nt3 implements vt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24077a;
    public final long b;

    public nt3(long j, long j2) {
        this.f24077a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt3)) {
            return false;
        }
        nt3 nt3Var = (nt3) obj;
        return this.f24077a == nt3Var.f24077a && this.b == nt3Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f24077a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f24077a, "ShowProphylaxisSnackbar(startDate=", ", endDate="));
    }
}
