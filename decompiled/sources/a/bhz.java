package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.discipline_filter.model.LeaderboardDisciplineFilterParams;

/* JADX INFO: loaded from: classes4.dex */
public final class bhz implements hhz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderboardDisciplineFilterParams f2633a;

    public bhz(LeaderboardDisciplineFilterParams leaderboardDisciplineFilterParams) {
        this.f2633a = leaderboardDisciplineFilterParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhz) && this.f2633a.equals(((bhz) obj).f2633a);
    }

    public final int hashCode() {
        return this.f2633a.hashCode();
    }

    public final String toString() {
        return "ShowDisciplineDialog(params=" + this.f2633a + Separators.RPAREN;
    }
}
