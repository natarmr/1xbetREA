package a;

import android.view.View;
import org.xplatform.cyber.game.core.presentation.team_statistic.view.TeamStatisticView;

/* JADX INFO: loaded from: classes5.dex */
public final class eal implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TeamStatisticView f7471a;
    public final TeamStatisticView b;

    public eal(TeamStatisticView teamStatisticView, TeamStatisticView teamStatisticView2) {
        this.f7471a = teamStatisticView;
        this.b = teamStatisticView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7471a;
    }
}
