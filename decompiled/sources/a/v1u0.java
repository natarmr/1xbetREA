package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v1u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36650a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final float f;

    public v1u0(long j, int i, int i2, int i3, long j2, float f) {
        this.f36650a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j2;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1u0)) {
            return false;
        }
        v1u0 v1u0Var = (v1u0) obj;
        return this.f36650a == v1u0Var.f36650a && this.b == v1u0Var.b && this.c == v1u0Var.c && this.d == v1u0Var.d && this.e == v1u0Var.e && Float.compare(this.f, v1u0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + rw2.b(twn.a(this.d, twn.a(this.c, twn.a(this.b, Long.hashCode(this.f36650a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f36650a, "ValorantTeamStatisticModel(teamId=", ", combatScoreAvg=");
        rw2.s(this.c, this.d, ", roundWins=", ", kills=", sbQ);
        kng0.A(sbQ, ", damage=", this.e, ", economy=");
        return kng0.o(sbQ, this.f, Separators.RPAREN);
    }
}
