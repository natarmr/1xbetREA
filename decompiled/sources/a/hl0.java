package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hl0 implements pl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13232a;
    public final long b;

    public hl0(long j, long j2) {
        this.f13232a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl0)) {
            return false;
        }
        hl0 hl0Var = (hl0) obj;
        return this.f13232a == hl0Var.f13232a && this.b == hl0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f13232a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f13232a, "OnGameClick(gameId=", ", categoryId="));
    }
}
