package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lis implements sis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20120a;
    public final boolean b;

    public lis(boolean z, long j) {
        this.f20120a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lis)) {
            return false;
        }
        lis lisVar = (lis) obj;
        return this.f20120a == lisVar.f20120a && this.b == lisVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f20120a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f20120a, "FavouriteTeamClick(teamId=", ", favourite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
