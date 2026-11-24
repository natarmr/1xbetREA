package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ots {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25844a;
    public final boolean b;

    public ots(boolean z, long j) {
        this.f25844a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ots)) {
            return false;
        }
        ots otsVar = (ots) obj;
        return this.f25844a == otsVar.f25844a && this.b == otsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f25844a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f25844a, "GameSubscriptionModel(gameConstId=", ", isLiveGame=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
