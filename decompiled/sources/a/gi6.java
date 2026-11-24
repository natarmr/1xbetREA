package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gi6 implements ji6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11330a;
    public final long b;

    public gi6(long j, long j2) {
        this.f11330a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi6)) {
            return false;
        }
        gi6 gi6Var = (gi6) obj;
        return this.f11330a == gi6Var.f11330a && this.b == gi6Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f11330a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f11330a, "AllMarketsHidden(selectedSubGameId=", ", hiddenMarketsCount="));
    }
}
