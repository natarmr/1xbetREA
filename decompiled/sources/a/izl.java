package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class izl implements mzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15639a;
    public final boolean b;

    public izl(boolean z, long j) {
        this.f15639a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izl)) {
            return false;
        }
        izl izlVar = (izl) obj;
        return this.f15639a == izlVar.f15639a && this.b == izlVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f15639a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f15639a, "OnEventCardClicked(gameId=", ", isLive=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
