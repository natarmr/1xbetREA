package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s0g0 implements v0g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31407a;
    public final g1g0 b;

    public s0g0(long j, g1g0 g1g0Var) {
        this.f31407a = j;
        this.b = g1g0Var;
    }

    @Override // a.v0g0
    public final long a() {
        return this.f31407a;
    }

    @Override // a.v0g0
    public final n1g0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0g0)) {
            return false;
        }
        s0g0 s0g0Var = (s0g0) obj;
        return this.f31407a == s0g0Var.f31407a && this.b.equals(s0g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f31407a) * 31);
    }

    public final String toString() {
        return "LargeCardWatermark(gameId=" + this.f31407a + ", middleBlock=" + this.b + Separators.RPAREN;
    }
}
