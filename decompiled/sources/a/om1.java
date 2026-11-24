package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class om1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25481a;
    public final String b;
    public final long c;

    public om1(long j, long j2, String str) {
        this.f25481a = j;
        this.b = str;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om1)) {
            return false;
        }
        om1 om1Var = (om1) obj;
        return this.f25481a == om1Var.f25481a && this.b.equals(om1Var.b) && this.c == om1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ua80.b(Long.hashCode(this.f25481a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(axq.o(this.f25481a, "TournamentStagePrizesScreen(tournamentId=", ", tournamentTitle=", this.b), this.c, ", stageTournamentID=", Separators.RPAREN);
    }
}
