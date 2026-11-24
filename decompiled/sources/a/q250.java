package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class q250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27985a;
    public final long b;

    public q250(long j, long j2) {
        this.f27985a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q250)) {
            return false;
        }
        q250 q250Var = (q250) obj;
        return this.f27985a == q250Var.f27985a && this.b == q250Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f27985a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f27985a, "Screen(screenId=", ", partitionId="));
    }
}
