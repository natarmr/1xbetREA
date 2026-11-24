package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16053a;
    public final long b;
    public final long c;
    public final long d;

    public j7p(long j, long j2, long j3, long j4) {
        this.f16053a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7p)) {
            return false;
        }
        j7p j7pVar = (j7p) obj;
        return this.f16053a == j7pVar.f16053a && this.b == j7pVar.b && this.c == j7pVar.c && this.d == j7pVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + rw2.b(rw2.b(Long.hashCode(this.f16053a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f16053a, "FavoriteConfigurationModel(maxChampionshipsCount=", ", maxGamesCount=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", maxTeamsCount=", this.c, ", gameStorageAfterStartSeconds=");
        return brm0.k(this.d, Separators.RPAREN, sbQ);
    }
}
