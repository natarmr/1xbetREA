package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y350 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41936a;
    public final gzr0 b;

    public y350(long j, gzr0 gzr0Var) {
        this.f41936a = j;
        this.b = gzr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y350)) {
            return false;
        }
        y350 y350Var = (y350) obj;
        return this.f41936a == y350Var.f41936a && this.b == y350Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f41936a) * 31);
    }

    public final String toString() {
        return "OnClickTournament(tournamentId=" + this.f41936a + ", tournamentCategoryType=" + this.b + Separators.RPAREN;
    }
}
