package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bn1 implements fn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2859a;
    public final long b;

    public bn1(long j, long j2) {
        this.f2859a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn1)) {
            return false;
        }
        bn1 bn1Var = (bn1) obj;
        return this.f2859a == bn1Var.f2859a && this.b == bn1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f2859a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f2859a, "OnGameClick(gameId=", ", categoryId="));
    }
}
