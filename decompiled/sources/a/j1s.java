package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j1s implements v1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15750a;
    public final boolean b;

    public j1s(boolean z, long j) {
        this.f15750a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1s)) {
            return false;
        }
        j1s j1sVar = (j1s) obj;
        return this.f15750a == j1sVar.f15750a && this.b == j1sVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f15750a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f15750a, "FavouriteTeamClick(teamId=", ", favourite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
