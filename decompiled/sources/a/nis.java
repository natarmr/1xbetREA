package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nis implements sis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23604a;

    public final boolean equals(Object obj) {
        if (obj instanceof nis) {
            return this.f23604a.equals(((nis) obj).f23604a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23604a.hashCode();
    }

    public final String toString() {
        return kng0.l("MatchReviewPlayerClick(playerId=", this.f23604a, Separators.RPAREN);
    }
}
