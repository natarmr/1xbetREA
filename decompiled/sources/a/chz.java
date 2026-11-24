package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.regions.LeaderboardRegionModelParams;

/* JADX INFO: loaded from: classes4.dex */
public final class chz implements hhz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderboardRegionModelParams f4386a;

    public chz(LeaderboardRegionModelParams leaderboardRegionModelParams) {
        this.f4386a = leaderboardRegionModelParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chz) && this.f4386a.equals(((chz) obj).f4386a);
    }

    public final int hashCode() {
        return this.f4386a.f46579a.hashCode();
    }

    public final String toString() {
        return "ShowRegionDialog(params=" + this.f4386a + Separators.RPAREN;
    }
}
