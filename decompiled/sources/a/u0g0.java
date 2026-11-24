package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u0g0 implements v0g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34853a;
    public final m1g0 b;

    public u0g0(long j, m1g0 m1g0Var) {
        this.f34853a = j;
        this.b = m1g0Var;
    }

    @Override // a.v0g0
    public final long a() {
        return this.f34853a;
    }

    @Override // a.v0g0
    public final n1g0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0g0)) {
            return false;
        }
        u0g0 u0g0Var = (u0g0) obj;
        return this.f34853a == u0g0Var.f34853a && this.b.equals(u0g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f34853a) * 31);
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(gameId=" + this.f34853a + ", middleBlock=" + this.b + Separators.RPAREN;
    }
}
