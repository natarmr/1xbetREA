package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class is1 implements ss1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15283a;
    public final bv1 b;

    public is1(long j, bv1 bv1Var) {
        bv1Var.getClass();
        this.f15283a = j;
        this.b = bv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is1)) {
            return false;
        }
        is1 is1Var = (is1) obj;
        return this.f15283a == is1Var.f15283a && this.b == is1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f15283a) * 31);
    }

    public final String toString() {
        return "OnGameClick(gameId=" + this.f15283a + ", tab=" + this.b + Separators.RPAREN;
    }
}
