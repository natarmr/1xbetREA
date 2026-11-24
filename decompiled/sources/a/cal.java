package a;

import android.view.View;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.playerstatistics.kills.TeamKillsStatisticView;

/* JADX INFO: loaded from: classes5.dex */
public final class cal implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TeamKillsStatisticView f4017a;
    public final TeamKillsStatisticView b;

    public cal(TeamKillsStatisticView teamKillsStatisticView, TeamKillsStatisticView teamKillsStatisticView2) {
        this.f4017a = teamKillsStatisticView;
        this.b = teamKillsStatisticView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4017a;
    }
}
