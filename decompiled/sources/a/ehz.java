package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.teams_type.model.LeaderboardTeamsTypeModelParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ehz implements hhz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderboardTeamsTypeModelParams f7831a;

    public ehz(LeaderboardTeamsTypeModelParams leaderboardTeamsTypeModelParams) {
        this.f7831a = leaderboardTeamsTypeModelParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehz) && this.f7831a.equals(((ehz) obj).f7831a);
    }

    public final int hashCode() {
        return this.f7831a.f46580a.hashCode();
    }

    public final String toString() {
        return "ShowTeamsTypeDialog(params=" + this.f7831a + Separators.RPAREN;
    }
}
