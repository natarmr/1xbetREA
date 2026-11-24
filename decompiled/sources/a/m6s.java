package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m6s implements v6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21287a;
    public final boolean b;

    public m6s(boolean z, long j) {
        this.f21287a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6s)) {
            return false;
        }
        m6s m6sVar = (m6s) obj;
        return this.f21287a == m6sVar.f21287a && this.b == m6sVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f21287a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f21287a, "FavouriteTeamClick(teamId=", ", favourite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
