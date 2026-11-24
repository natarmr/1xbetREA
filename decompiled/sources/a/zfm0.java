package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import org.xplatform.statistic.common.presentation.MainStatisticScreen;
import org.xplatform.statistic.cycling.impl.cycling_menu.presentation.screen.CyclingMainFragmentScreen;
import org.xplatform.statistic.horses_race_menu.presentation.screen.HorsesRaceMenuScreen;
import org.xplatform.statistic.races.presentation.screens.RacesStatisticScreen;
import org.xplatform.statistic.winter_games.impl.winter_game.presentation.screen.WinterGamesMainFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class zfm0 implements yfm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nai f44307a;
    public final qzt b;
    public final pru c;

    public zfm0(bzs0 bzs0Var, nwd nwdVar, y2m0 y2m0Var, bst bstVar, nai naiVar, rl70 rl70Var, qzt qztVar, htz htzVar, pru pruVar, s2m0 s2m0Var, cge0 cge0Var, g9m0 g9m0Var) {
        this.f44307a = naiVar;
        this.b = qztVar;
        this.c = pruVar;
    }

    public final FragmentScreen a(long j, String str) {
        str.getClass();
        llm0 llm0Var = this.c.a().g.t;
        if (j == 44 || j == 133 || j == 132 || j == 92) {
            return new HorsesRaceMenuScreen(str, j, llm0Var);
        }
        if (j == 26) {
            return new RacesStatisticScreen(str, j, this.b.f29594a.a().g.t);
        }
        if (j == 36) {
            return new CyclingMainFragmentScreen(str, j);
        }
        int i = gql0.f11739a;
        return q3d.j(19L, 23L, 24L, 22L).contains(Long.valueOf(j)) ? new WinterGamesMainFragmentScreen(str, j) : new MainStatisticScreen(str, j, llm0Var);
    }
}
