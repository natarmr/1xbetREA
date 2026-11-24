package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r0g0 implements v0g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29628a;
    public final d1g0 b;

    public r0g0(long j, d1g0 d1g0Var) {
        this.f29628a = j;
        this.b = d1g0Var;
    }

    @Override // a.v0g0
    public final long a() {
        return this.f29628a;
    }

    @Override // a.v0g0
    public final n1g0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0g0)) {
            return false;
        }
        r0g0 r0g0Var = (r0g0) obj;
        return this.f29628a == r0g0Var.f29628a && this.b.equals(r0g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f29628a) * 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(gameId=" + this.f29628a + ", middleBlock=" + this.b + Separators.RPAREN;
    }
}
