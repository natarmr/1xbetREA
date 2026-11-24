package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.type.model.LeaderboardTypeModelParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ghz implements hhz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderboardTypeModelParams f11321a;

    public ghz(LeaderboardTypeModelParams leaderboardTypeModelParams) {
        this.f11321a = leaderboardTypeModelParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ghz) && this.f11321a.equals(((ghz) obj).f11321a);
    }

    public final int hashCode() {
        return this.f11321a.hashCode();
    }

    public final String toString() {
        return "ShowTypeDialog(params=" + this.f11321a + Separators.RPAREN;
    }
}
