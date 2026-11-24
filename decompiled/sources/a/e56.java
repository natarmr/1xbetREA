package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e56 implements f56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7216a;
    public final long b;

    public e56(long j, long j2) {
        this.f7216a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e56)) {
            return false;
        }
        e56 e56Var = (e56) obj;
        return this.f7216a == e56Var.f7216a && this.b == e56Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f7216a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f7216a, "Prophylaxis(dateStart=", ", dateEnd="));
    }
}
