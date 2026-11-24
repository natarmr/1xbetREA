package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t0g0 implements v0g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33117a;
    public final j1g0 b;

    public t0g0(long j, j1g0 j1g0Var) {
        this.f33117a = j;
        this.b = j1g0Var;
    }

    @Override // a.v0g0
    public final long a() {
        return this.f33117a;
    }

    @Override // a.v0g0
    public final n1g0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0g0)) {
            return false;
        }
        t0g0 t0g0Var = (t0g0) obj;
        return this.f33117a == t0g0Var.f33117a && this.b.equals(t0g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f33117a) * 31);
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(gameId=" + this.f33117a + ", middleBlock=" + this.b + Separators.RPAREN;
    }
}
