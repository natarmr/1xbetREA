package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p6s implements v6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26472a;

    public final boolean equals(Object obj) {
        if (obj instanceof p6s) {
            return this.f26472a.equals(((p6s) obj).f26472a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26472a.hashCode();
    }

    public final String toString() {
        return kng0.l("MatchReviewPlayerClick(playerId=", this.f26472a, Separators.RPAREN);
    }
}
