package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bjy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2726a;
    public final long b;
    public final long c;
    public final long d;

    public bjy(long j, long j2, long j3, long j4) {
        this.f2726a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjy)) {
            return false;
        }
        bjy bjyVar = (bjy) obj;
        return this.f2726a == bjyVar.f2726a && this.b == bjyVar.b && this.c == bjyVar.c && this.d == bjyVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + rw2.b(rw2.b(Long.hashCode(this.f2726a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f2726a, "KabaddiStatisticsModel(raidsAttempted=", ", raidPoints=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", tacklesAttempted=", this.c, ", tacklePoints=");
        return brm0.k(this.d, Separators.RPAREN, sbQ);
    }
}
