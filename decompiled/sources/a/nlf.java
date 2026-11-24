package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nlf extends slf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23723a;

    public nlf(String str) {
        this.f23723a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlf) && this.f23723a.equals(((nlf) obj).f23723a);
    }

    public final int hashCode() {
        return this.f23723a.hashCode();
    }

    public final String toString() {
        return kng0.l("Cs2MatchStartedGameLogModel(map=", this.f23723a, Separators.RPAREN);
    }
}
