package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mkh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21943a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public mkh(int i, long j, String str, String str2, boolean z) {
        this.f21943a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkh)) {
            return false;
        }
        mkh mkhVar = (mkh) obj;
        return this.f21943a == mkhVar.f21943a && this.b.equals(mkhVar.b) && this.c.equals(mkhVar.c) && this.d == mkhVar.d && this.e == mkhVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(this.d, ua80.b(ua80.b(Long.hashCode(this.f21943a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f21943a, "CyberTournamentBracketMatchTeamModel(feedId=", ", name=", this.b);
        axq.s(this.d, ", imageS3=", this.c, ", score=", sbO);
        return f140.n(sbO, ", isWinner=", this.e, Separators.RPAREN);
    }
}
