package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class omr implements umr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25516a;

    public final boolean equals(Object obj) {
        if (obj instanceof omr) {
            return this.f25516a.equals(((omr) obj).f25516a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25516a.hashCode();
    }

    public final String toString() {
        return kng0.l("MatchReviewPlayerClick(playerId=", this.f25516a, Separators.RPAREN);
    }
}
