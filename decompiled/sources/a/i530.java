package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i530 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14175a;
    public final long b;

    public i530(long j, long j2) {
        this.f14175a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i530)) {
            return false;
        }
        i530 i530Var = (i530) obj;
        return this.f14175a == i530Var.f14175a && this.b == i530Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f14175a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f14175a, "MarketsCacheKey(categoryId=", ", subGameId="));
    }
}
