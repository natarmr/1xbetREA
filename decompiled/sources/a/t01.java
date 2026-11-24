package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t01 implements b11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33096a;
    public final long b;

    public t01(long j, long j2) {
        this.f33096a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t01)) {
            return false;
        }
        t01 t01Var = (t01) obj;
        return this.f33096a == t01Var.f33096a && this.b == t01Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f33096a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f33096a, "OnGameClick(gameId=", ", categoryId="));
    }
}
