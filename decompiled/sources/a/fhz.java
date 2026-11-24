package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.time_filter.LeaderboardTimeFilterModelParams;

/* JADX INFO: loaded from: classes4.dex */
public final class fhz implements hhz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderboardTimeFilterModelParams f9563a;

    public fhz(LeaderboardTimeFilterModelParams leaderboardTimeFilterModelParams) {
        this.f9563a = leaderboardTimeFilterModelParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhz) && this.f9563a.equals(((fhz) obj).f9563a);
    }

    public final int hashCode() {
        return this.f9563a.hashCode();
    }

    public final String toString() {
        return "ShowTimeFilterDialog(params=" + this.f9563a + Separators.RPAREN;
    }
}
