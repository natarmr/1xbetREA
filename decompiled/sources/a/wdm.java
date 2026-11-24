package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wdm implements bem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38979a;
    public final boolean b;

    public wdm(boolean z, long j) {
        this.f38979a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdm)) {
            return false;
        }
        wdm wdmVar = (wdm) obj;
        return this.f38979a == wdmVar.f38979a && this.b == wdmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f38979a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f38979a, "OnEventCardClicked(gameId=", ", isLive=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
