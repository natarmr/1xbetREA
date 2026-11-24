package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nmr implements umr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23785a;
    public final boolean b;

    public nmr(boolean z, long j) {
        this.f23785a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmr)) {
            return false;
        }
        nmr nmrVar = (nmr) obj;
        return this.f23785a == nmrVar.f23785a && this.b == nmrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f23785a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f23785a, "FavouriteTeamClick(teamId=", ", favourite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
