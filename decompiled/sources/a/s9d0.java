package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s9d0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31848a;
    public final long b;

    public s9d0(long j, long j2) {
        this.f31848a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9d0)) {
            return false;
        }
        s9d0 s9d0Var = (s9d0) obj;
        return this.f31848a == s9d0Var.f31848a && this.b == s9d0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f31848a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f31848a, "BetResult(currencyAccId=", ", betId="));
    }
}
