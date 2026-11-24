package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.statistic.champ_statistic.presentation.screens.ChampStatisticScreen;
import org.xplatform.statistic.facts.presentation.screen.FactsStatisticScreen;
import org.xplatform.statistic.fight_statistic.presentatiton.screen.FightStatisticScreen;
import org.xplatform.statistic.forecast.presentation.screen.ForecastStatisticScreen;
import org.xplatform.statistic.game_events.presentation.screen.GameEventsScreen;
import org.xplatform.statistic.heat_map.impl.presentation.screen.HeatMapStatisticScreen;
import org.xplatform.statistic.lastgames.presentation.screen.LastGamesScreen;
import org.xplatform.statistic.lineup.presentation.LineUpScreen;
import org.xplatform.statistic.news.presenation.screens.StatisticsNewsScreen;
import org.xplatform.statistic.player.impl.player.kabaddi_top_players.presentation.screens.TopPlayersStatisticKabaddiScreen;
import org.xplatform.statistic.player.impl.player.player_menu.presentation.screen.PlayerMainScreen;
import org.xplatform.statistic.player.impl.player.player_menu.presentation.screen.RefereesListScreen;
import org.xplatform.statistic.player.impl.player.top_players.presentation.screens.TopPlayersStatisticScreen;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;
import org.xplatform.statistic.rating.impl.rating_statistic.presentation.screen.RatingStatisticScreen;
import org.xplatform.statistic.stadium.impl.stadium.screen.StadiumScreen;
import org.xplatform.statistic.stage.api.domain.TypeStageId;
import org.xplatform.statistic.stat_results.impl.results_grid.presentation.screen.ResultsGridScreen;
import org.xplatform.statistic.team.impl.team_champ_statistic.presentation.screen.TeamsChampStatisticScreen;
import org.xplatform.statistic.team.impl.team_characterstic_statistic.presentation.screen.TeamsCharacteristicsFragmentScreen;
import org.xplatform.statistic.team.impl.team_statistic.presentation.screen.TeamsStatisticFragmentScreen;
import org.xplatform.statistic.tennis.impl.player_menu.presentation.screen.PlayersMenuScreen;
import org.xplatform.statistic.tennis.impl.player_menu.presentation.screen.PlayersStatisticScreen;
import org.xplatform.statistic.text_broadcast.presentation.screens.TextBroadcastScreen;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w020 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38328a;
    public final /* synthetic */ f120 b;

    public /* synthetic */ w020(f120 f120Var, byte b) {
        this.f38328a = b;
        this.b = f120Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        m7h0 playersStatisticScreen;
        ixs0 ixs0Var;
        byte b = this.f38328a;
        f120 f120Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                y2m0 y2m0Var = f120Var.G;
                String str = ((v020) f120Var.D()).f;
                long j = f120Var.p;
                y2m0Var.getClass();
                k0w0Var.h(new TeamsCharacteristicsFragmentScreen(str, j));
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                cge0 cge0Var = f120Var.D;
                ixs0 ixs0Var2 = ((v020) f120Var.D()).i;
                String strValueOf = ixs0Var2 != null ? String.valueOf(ixs0Var2.e.c) : null;
                if (strValueOf == null) {
                    strValueOf = "";
                }
                long j2 = f120Var.p;
                cge0Var.getClass();
                k0w0Var2.h(new StadiumScreen(strValueOf, j2, R.string.statistic_info_stadium));
                break;
            case 2:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                xak xakVar = f120Var.X;
                String str2 = ((v020) f120Var.D()).f;
                long j3 = f120Var.p;
                xakVar.getClass();
                k0w0Var3.h(new FightStatisticScreen(str2, j3));
                break;
            case 3:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                s9m0 s9m0Var = f120Var.K;
                String str3 = ((v020) f120Var.D()).f;
                long j4 = f120Var.p;
                s9m0Var.getClass();
                k0w0Var4.h(new ResultsGridScreen(str3, j4));
                break;
            case 4:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                ddk ddkVar = f120Var.W;
                String str4 = ((v020) f120Var.D()).f;
                long j5 = f120Var.p;
                ddkVar.getClass();
                k0w0Var5.h(new GameEventsScreen(j5, str4));
                break;
            case 5:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                nek nekVar = f120Var.V;
                String str5 = ((v020) f120Var.D()).f;
                long j6 = f120Var.p;
                nekVar.getClass();
                k0w0Var6.h(new ForecastStatisticScreen(str5, j6));
                break;
            case 6:
                k0w0 k0w0Var7 = (k0w0) obj;
                k0w0Var7.getClass();
                tqt tqtVar = f120Var.Z;
                String str6 = ((v020) f120Var.D()).f;
                long j7 = f120Var.p;
                n3q n3qVar = n3q.f22862a;
                int i = ((v020) f120Var.D()).g;
                tqtVar.getClass();
                k0w0Var7.h(new LastGamesScreen(str6, j7, n3qVar, i));
                break;
            case 7:
                k0w0 k0w0Var8 = (k0w0) obj;
                k0w0Var8.getClass();
                uuz uuzVar = f120Var.Y;
                String str7 = ((v020) f120Var.D()).f;
                long j8 = f120Var.p;
                int i2 = ((v020) f120Var.D()).o.b;
                uuzVar.getClass();
                k0w0Var8.h(new LineUpScreen(str7, j8, i2));
                break;
            case 8:
                k0w0 k0w0Var9 = (k0w0) obj;
                k0w0Var9.getClass();
                y2m0 y2m0Var2 = f120Var.G;
                String str8 = ((v020) f120Var.D()).f;
                long j9 = f120Var.p;
                y2m0Var2.getClass();
                k0w0Var9.h(new TeamsStatisticFragmentScreen(str8, j9));
                break;
            case 9:
                k0w0 k0w0Var10 = (k0w0) obj;
                k0w0Var10.getClass();
                g9m0 g9m0Var = f120Var.S;
                String str9 = ((v020) f120Var.D()).f;
                long j10 = f120Var.p;
                g9m0Var.getClass();
                k0w0Var10.h(new TextBroadcastScreen(str9, j10));
                break;
            case 10:
                k0w0 k0w0Var11 = (k0w0) obj;
                k0w0Var11.getClass();
                ddk ddkVar2 = f120Var.U;
                String str10 = ((v020) f120Var.D()).f;
                long j11 = f120Var.p;
                ddkVar2.getClass();
                k0w0Var11.h(new FactsStatisticScreen(str10, j11));
                break;
            case 11:
                k0w0 k0w0Var12 = (k0w0) obj;
                k0w0Var12.getClass();
                bst bstVar = f120Var.C;
                String str11 = ((v020) f120Var.D()).f;
                long j12 = f120Var.p;
                bstVar.getClass();
                k0w0Var12.h(new HeatMapStatisticScreen(str11, j12));
                break;
            case 12:
                k0w0 k0w0Var13 = (k0w0) obj;
                k0w0Var13.getClass();
                k0w0Var13.h(f120Var.H.a(new TypeStageId.Game(((v020) f120Var.D()).f), f120Var.p, -1L, ((v020) f120Var.D()).h.s));
                break;
            case 13:
                k0w0 k0w0Var14 = (k0w0) obj;
                k0w0Var14.getClass();
                g9m0 g9m0Var2 = f120Var.F;
                RatingStatisticScreenParams.GameParamsStatistic gameParamsStatistic = new RatingStatisticScreenParams.GameParamsStatistic(((v020) f120Var.D()).f, f120Var.p);
                g9m0Var2.getClass();
                k0w0Var14.h(new RatingStatisticScreen(gameParamsStatistic));
                break;
            case 14:
                k0w0 k0w0Var15 = (k0w0) obj;
                k0w0Var15.getClass();
                y2m0 y2m0Var3 = f120Var.G;
                String str12 = ((v020) f120Var.D()).f;
                long j13 = f120Var.p;
                y2m0Var3.getClass();
                k0w0Var15.h(new TeamsChampStatisticScreen(str12, j13));
                break;
            case 15:
                k0w0 k0w0Var16 = (k0w0) obj;
                k0w0Var16.getClass();
                rl70 rl70Var = f120Var.v;
                String str13 = ((v020) f120Var.D()).f;
                long j14 = f120Var.p;
                rl70Var.getClass();
                k0w0Var16.h(new TopPlayersStatisticKabaddiScreen(str13, j14));
                break;
            case 16:
                Throwable th = (Throwable) obj;
                th.getClass();
                if (th instanceof el50) {
                    bby bbyVar = f120Var.h0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    c4m0 c4m0Var = f120Var.i0;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                }
                p7m0 p7m0Var = f120Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    f120Var.f.getClass();
                } while (!p7m0Var.m(value, v020.a((v020) value, false, true, 0L, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388604)));
                break;
            case 17:
                k0w0 k0w0Var17 = (k0w0) obj;
                k0w0Var17.getClass();
                gl5 gl5Var = f120Var.R;
                String str14 = ((v020) f120Var.D()).f;
                long j15 = f120Var.p;
                gl5Var.getClass();
                k0w0Var17.h(new ChampStatisticScreen(str14, j15));
                break;
            case 18:
                ((Throwable) obj).getClass();
                f120Var.H(new x020(f120Var.O(jam0.b), (byte) 8));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                k0w0 k0w0Var18 = (k0w0) obj;
                k0w0Var18.getClass();
                rl70 rl70Var2 = f120Var.v;
                String str15 = ((v020) f120Var.D()).f;
                long j16 = f120Var.p;
                rl70Var2.getClass();
                k0w0Var18.h(new TopPlayersStatisticScreen(str15, j16));
                break;
            case 20:
                k0w0 k0w0Var19 = (k0w0) obj;
                k0w0Var19.getClass();
                nek nekVar2 = f120Var.V;
                String str16 = ((v020) f120Var.D()).f;
                long j17 = f120Var.p;
                nekVar2.getClass();
                k0w0Var19.h(new ForecastStatisticScreen(str16, j17));
                break;
            case 21:
                k0w0 k0w0Var20 = (k0w0) obj;
                k0w0Var20.getClass();
                ddk ddkVar3 = f120Var.W;
                String str17 = ((v020) f120Var.D()).f;
                long j18 = f120Var.p;
                ddkVar3.getClass();
                k0w0Var20.h(new GameEventsScreen(j18, str17));
                break;
            case 22:
                k0w0 k0w0Var21 = (k0w0) obj;
                k0w0Var21.getClass();
                uuz uuzVar2 = f120Var.Y;
                String str18 = ((v020) f120Var.D()).f;
                long j19 = f120Var.p;
                int i3 = ((v020) f120Var.D()).o.b;
                uuzVar2.getClass();
                k0w0Var21.h(new LineUpScreen(str18, j19, i3));
                break;
            case 23:
                k0w0 k0w0Var22 = (k0w0) obj;
                k0w0Var22.getClass();
                atz atzVar = f120Var.T;
                String str19 = ((v020) f120Var.D()).f;
                long j20 = f120Var.p;
                atzVar.getClass();
                k0w0Var22.h(new StatisticsNewsScreen(str19, j20));
                break;
            case 24:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                f120Var.t.b(th2, new k110(f120Var, th2, (byte) 12));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                k0w0 k0w0Var23 = (k0w0) obj;
                k0w0Var23.getClass();
                rl70 rl70Var3 = f120Var.v;
                List<b9a0> list = ((v020) f120Var.D()).h.l;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (b9a0 b9a0Var : list) {
                    b9a0Var.getClass();
                    arrayList.add(new e9a0(b9a0Var.f2199a, b9a0Var.f, b9a0Var.b));
                }
                String str20 = ((v020) f120Var.D()).f;
                long j21 = f120Var.p;
                rl70Var3.getClass();
                k0w0Var23.h(arrayList.size() == 1 ? new PlayerMainScreen(((e9a0) CollectionsKt.U(arrayList)).f7411a, j21, str20, oaa0.b) : new RefereesListScreen(str20, j21));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Throwable) obj).getClass();
                f120Var.H(new x020(f120Var.O(jam0.e), (byte) 10));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                f120Var.H(new x020(th3 instanceof ff5 ? new vam0(ocl.b(f120Var.e0, pb10.r1, pdm.c, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 988)) : f120Var.O(jam0.f16197a), (byte) 9));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                if (th4 instanceof ff5) {
                    f120Var.H(new gm10((byte) 18));
                } else {
                    f120Var.H(new a21((byte) 28, f120Var.M(jam0.c)));
                }
                break;
            default:
                k0w0 k0w0Var24 = (k0w0) obj;
                k0w0Var24.getClass();
                Object objD = f120Var.D();
                s2m0 s2m0Var = f120Var.J;
                ixs0 ixs0Var3 = ((v020) objD).i;
                if (ixs0Var3 == null || !ixs0Var3.f15559a.f || (ixs0Var = ((v020) f120Var.D()).i) == null || !ixs0Var.b.f) {
                    String str21 = ((v020) f120Var.D()).f;
                    s2m0Var.getClass();
                    playersStatisticScreen = new PlayersStatisticScreen(str21, false);
                } else {
                    String str22 = ((v020) f120Var.D()).f;
                    s2m0Var.getClass();
                    playersStatisticScreen = new PlayersMenuScreen(str22);
                }
                k0w0Var24.h(playersStatisticScreen);
                break;
        }
        return Unit.f46060a;
    }
}
