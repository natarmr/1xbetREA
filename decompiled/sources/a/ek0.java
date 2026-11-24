package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ek0 implements ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7931a;
    public final String b;

    public ek0(long j, String str) {
        this.f7931a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek0)) {
            return false;
        }
        ek0 ek0Var = (ek0) obj;
        return this.f7931a == ek0Var.f7931a && this.b.equals(ek0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f7931a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f7931a, "TournamentClick(tournamentId=", ", title=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
