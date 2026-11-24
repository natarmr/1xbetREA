package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q0g0 implements v0g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27896a;
    public final a1g0 b;

    public q0g0(long j, a1g0 a1g0Var) {
        this.f27896a = j;
        this.b = a1g0Var;
    }

    @Override // a.v0g0
    public final long a() {
        return this.f27896a;
    }

    @Override // a.v0g0
    public final n1g0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0g0)) {
            return false;
        }
        q0g0 q0g0Var = (q0g0) obj;
        return this.f27896a == q0g0Var.f27896a && this.b.equals(q0g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f27896a) * 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(gameId=" + this.f27896a + ", middleBlock=" + this.b + Separators.RPAREN;
    }
}
