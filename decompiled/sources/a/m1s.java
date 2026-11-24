package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m1s implements v1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21024a;

    public final boolean equals(Object obj) {
        if (obj instanceof m1s) {
            return this.f21024a.equals(((m1s) obj).f21024a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21024a.hashCode();
    }

    public final String toString() {
        return kng0.l("MatchReviewPlayerClick(playerId=", this.f21024a, Separators.RPAREN);
    }
}
