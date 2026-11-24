package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class td1 implements ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33742a;
    public final String b;

    public td1(long j, String str) {
        this.f33742a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td1)) {
            return false;
        }
        td1 td1Var = (td1) obj;
        return this.f33742a == td1Var.f33742a && this.b.equals(td1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f33742a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f33742a, "OnTournamentClick(tournamentId=", ", title=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
