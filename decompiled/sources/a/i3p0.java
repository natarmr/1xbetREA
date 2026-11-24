package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.favorites.impl.presentation.teambet.presentation.models.TeamBetScreenParams;
import org.xplatform.statistic.player.impl.player.winter_full_description.presentation.actual.FullDescriptionScreen;
import org.xplatform.statistic.rating.impl.rating_history.screen.RatingHistoryScreen;
import org.xplatform.statistic.team.impl.team_completed_match.presentation.screen.CompletedMatchesTeamScreen;
import org.xplatform.statistic.team.impl.team_future_match.presentation.screen.FeatureMatchTeamScreen;
import org.xplatform.statistic.team.impl.team_rating_chart.presentation.screen.TeamRatingChartScreen;
import org.xplatform.statistic.team.impl.team_squad.presentation.TeamSquadStatisticScreen;
import org.xplatform.statistic.team.impl.team_transfer.presentation.screen.TeamTransfersScreen;
import org.xplatform.statistic.tennis.impl.biography.presentation.screen.PlayerBiographyScreens;
import org.xplatform.statistic.tennis.impl.earned_points.presentation.screen.EarnedPointsScreen;
import org.xplatform.statistic.tennis.impl.summary.presentation.screen.TennisSummaryScreens;
import org.xplatform.statistic.tennis.impl.wins_and_losses.presentation.actual.TennisWinLossScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class i3p0 extends i3t0 {
    public static final /* synthetic */ int C = 0;
    public bby A;
    public c4m0 B;
    public final TeamBetScreenParams o;
    public final dyu p;
    public final dyu q;
    public final clc r;
    public final pru s;
    public final r9u t;
    public final m1e u;
    public final duj v;
    public final mne w;
    public final ctf0 x;
    public final yfm0 y;
    public final i1w0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public i3p0(vzg0 vzg0Var, TeamBetScreenParams teamBetScreenParams, dyu dyuVar, dyu dyuVar2, clc clcVar, pru pruVar, r9u r9uVar, m1e m1eVar, duj dujVar, mne mneVar, ctf0 ctf0Var, yfm0 yfm0Var, i1w0 i1w0Var, g2v g2vVar) {
        r9uVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        super(new nxo0(teamBetScreenParams, (byte) 3), g090VarP, new o20(ctf0Var, g2vVar, (byte) 28), (yzn0) null);
        this.o = teamBetScreenParams;
        this.p = dyuVar;
        this.q = dyuVar2;
        this.r = clcVar;
        this.s = pruVar;
        this.t = r9uVar;
        this.u = m1eVar;
        this.v = dujVar;
        this.w = mneVar;
        this.x = ctf0Var;
        this.y = yfm0Var;
        this.z = i1w0Var;
        i3t0.K(this, null, null, new m91(this, null, (byte) 21), 3);
    }

    public final void M(boolean z) {
        e3c.n(this.A);
        this.A = i3t0.K(this, null, new g0p0(1, this, i3p0.class, "onDataLoadError", "onDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 2), new vnn((byte) 8, (yje) null, (i3t0) this, z), 1);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        n2p0 n2p0Var = (n2p0) obj;
        n2p0Var.getClass();
        super.x(n2p0Var);
        final byte b = 4;
        final byte b2 = 5;
        final byte b3 = 1;
        if (n2p0Var instanceof h2p0) {
            c4m0 c4m0Var = this.B;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.B = sac.T(new fnq(this.u.b(), new z2n0(this, null, b2), (byte) 4), d5c.S(jiu0.a(this), this.w.f22085a), foe.h);
                return;
            }
            return;
        }
        if (n2p0Var instanceof g2p0) {
            e3c.n(this.A);
            e3c.n(this.B);
            return;
        }
        if (n2p0Var instanceof j2p0) {
            M(true);
            return;
        }
        if (n2p0Var instanceof l2p0) {
            M(true);
            return;
        }
        boolean z = n2p0Var instanceof i2p0;
        final byte b4 = 6;
        i1w0 i1w0Var = this.z;
        if (z) {
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b5 = b4;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b5) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str2 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str2.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str2));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str3.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str3));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str4.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str4));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str5.getClass();
                            str6.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str5, str6));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str7.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str7));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str8.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str8));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str9.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str9));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str10.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str10));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str11.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str11));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str12.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str12));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (!(n2p0Var instanceof k2p0)) {
            if (!(n2p0Var instanceof m2p0)) {
                t9f.b();
                return;
            } else {
                final String str = ((m2p0) n2p0Var).f21074a;
                i1w0Var.d(new Function1(this) { // from class: a.g3p0
                    public final /* synthetic */ i3p0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b5 = b3;
                        String str2 = str;
                        i3p0 i3p0Var = this.b;
                        k0w0 k0w0Var = (k0w0) obj2;
                        switch (b5) {
                            case 0:
                                k0w0Var.getClass();
                                yfm0 yfm0Var = i3p0Var.y;
                                long j = i3p0Var.o.c;
                                ((zfm0) yfm0Var).getClass();
                                k0w0Var.h(cge0.g(str2, j, true));
                                break;
                            default:
                                k0w0Var.getClass();
                                yfm0 yfm0Var2 = i3p0Var.y;
                                t1p0 t1p0Var = ((z2p0) i3p0Var.D()).f43682a;
                                k0w0Var.h(((zfm0) yfm0Var2).a(t1p0Var != null ? t1p0Var.f33178a : i3p0Var.o.c, str2));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            }
        }
        dtp0 dtp0Var = ((k2p0) n2p0Var).f17585a;
        if (dtp0Var instanceof ysp0) {
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b5 = b;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b5) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str2 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str2.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str2));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str3.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str3));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str4.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str4));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str5.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str5));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str6.getClass();
                            str7.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str6, str7));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str8.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str8));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str9.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str9));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str10.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str10));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str11.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str11));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str12.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str12));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str13 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str13.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str13));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (dtp0Var instanceof rsp0) {
            final byte b5 = 9;
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b6 = b5;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b6) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str2 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str2.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str2));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str3.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str3));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str4.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str4));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str5.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str5));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str6.getClass();
                            str7.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str6, str7));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str8.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str8));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str9.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str9));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str10.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str10));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str11.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str11));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str12.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str12));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str13 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str13.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str13));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (dtp0Var instanceof psp0) {
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b6 = b4;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b6) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str2 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str2.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str2));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str3.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str3));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str4.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str4));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str5.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str5));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str6.getClass();
                            str7.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str6, str7));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str8.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str8));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str9.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str9));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str10.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str10));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str11.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str11));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str12.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str12));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str13 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str13.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str13));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        final byte b6 = 0;
        if (dtp0Var instanceof ssp0) {
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b7 = b6;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b7) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str2 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str2.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str2));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str3.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str3));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str4.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str4));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str5.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str5));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str6.getClass();
                            str7.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str6, str7));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str8.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str8));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str9.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str9));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str10.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str10));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str11.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str11));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str12.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str12));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str13 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str13.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str13));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (dtp0Var instanceof jsp0) {
            final byte b7 = 2;
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b8 = b7;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b8) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str2 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str2.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str2));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str3.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str3));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str4.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str4));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str5.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str5));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str6.getClass();
                            str7.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str6, str7));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str8.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str8));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str9.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str9));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str10.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str10));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str11.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str11));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str12.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str12));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str13 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str13.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str13));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (dtp0Var instanceof vsp0) {
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b8 = b2;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b8) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str2 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str2.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str2));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str3.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str3));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str4.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str4));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str5.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str5));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str6.getClass();
                            str7.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str6, str7));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str8.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str8));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str9.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str9));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str10.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str10));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str11.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str11));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str12.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str12));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str13 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str13.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str13));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (dtp0Var instanceof btp0) {
            final byte b8 = 10;
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b9 = b8;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b9) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str2 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str2.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str2));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str3.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str3));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str4.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str4));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str5.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str5));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str6.getClass();
                            str7.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str6, str7));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str8.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str8));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str9.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str9));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str10.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str10));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str11.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str11));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str12.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str12));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str13 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str13.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str13));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (dtp0Var instanceof isp0) {
            nfp0 nfp0Var = ((z2p0) D()).b;
            if (nfp0Var != null) {
                final String str2 = nfp0Var.b;
                i1w0Var.d(new Function1(this) { // from class: a.g3p0
                    public final /* synthetic */ i3p0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b9 = b6;
                        String str3 = str2;
                        i3p0 i3p0Var = this.b;
                        k0w0 k0w0Var = (k0w0) obj2;
                        switch (b9) {
                            case 0:
                                k0w0Var.getClass();
                                yfm0 yfm0Var = i3p0Var.y;
                                long j = i3p0Var.o.c;
                                ((zfm0) yfm0Var).getClass();
                                k0w0Var.h(cge0.g(str3, j, true));
                                break;
                            default:
                                k0w0Var.getClass();
                                yfm0 yfm0Var2 = i3p0Var.y;
                                t1p0 t1p0Var = ((z2p0) i3p0Var.D()).f43682a;
                                k0w0Var.h(((zfm0) yfm0Var2).a(t1p0Var != null ? t1p0Var.f33178a : i3p0Var.o.c, str3));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            }
            return;
        }
        if (dtp0Var instanceof ksp0) {
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b9 = b3;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b9) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str3.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str3));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str4.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str4));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str5.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str5));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str6.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str6));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str7.getClass();
                            str8.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str7, str8));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str9.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str9));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str10.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str10));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str11.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str11));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str12.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str12));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str13 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str13.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str13));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str14 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str14.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str14));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (dtp0Var instanceof lsp0) {
            final byte b9 = 8;
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b10 = b9;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b10) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str3.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str3));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str4.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str4));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str5.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str5));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str6.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str6));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str7.getClass();
                            str8.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str7, str8));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str9.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str9));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str10.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str10));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str11.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str11));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str12.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str12));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str13 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str13.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str13));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str14 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str14.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str14));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (dtp0Var instanceof msp0) {
            final byte b10 = 7;
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b11 = b10;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b11) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str3.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str3));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str4.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str4));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str5.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str5));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str6.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str6));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str7.getClass();
                            str8.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str7, str8));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str9.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str9));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str10.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str10));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str11.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str11));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str12.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str12));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str13 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str13.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str13));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str14 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str14.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str14));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        } else if (dtp0Var instanceof wsp0) {
            final byte b11 = 3;
            i1w0Var.d(new Function1(this) { // from class: a.f3p0
                public final /* synthetic */ i3p0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b12 = b11;
                    i3p0 i3p0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b12) {
                        case 0:
                            k0w0Var.getClass();
                            yfm0 yfm0Var = i3p0Var.y;
                            String str3 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var).getClass();
                            str3.getClass();
                            k0w0Var.h(new EarnedPointsScreen(str3));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            yfm0 yfm0Var2 = i3p0Var.y;
                            String str4 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var2).getClass();
                            str4.getClass();
                            k0w0Var.h(new TeamRatingChartScreen(str4));
                            break;
                        case 2:
                            k0w0Var.getClass();
                            yfm0 yfm0Var3 = i3p0Var.y;
                            String str5 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var3).getClass();
                            str5.getClass();
                            k0w0Var.h(new PlayerBiographyScreens(str5));
                            break;
                        case 3:
                            k0w0Var.getClass();
                            yfm0 yfm0Var4 = i3p0Var.y;
                            String str6 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var4).getClass();
                            str6.getClass();
                            k0w0Var.h(new RatingHistoryScreen(str6));
                            break;
                        case 4:
                            k0w0Var.getClass();
                            yfm0 yfm0Var5 = i3p0Var.y;
                            String str7 = ((z2p0) i3p0Var.D()).c;
                            String str8 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var5).getClass();
                            str7.getClass();
                            str8.getClass();
                            k0w0Var.h(new TeamSquadStatisticScreen(str7, str8));
                            break;
                        case 5:
                            k0w0Var.getClass();
                            yfm0 yfm0Var6 = i3p0Var.y;
                            String str9 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var6).getClass();
                            str9.getClass();
                            k0w0Var.h(new TennisSummaryScreens(str9));
                            break;
                        case 6:
                            k0w0Var.getClass();
                            yfm0 yfm0Var7 = i3p0Var.y;
                            String str10 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var7).getClass();
                            str10.getClass();
                            k0w0Var.h(new CompletedMatchesTeamScreen(str10));
                            break;
                        case 7:
                            k0w0Var.getClass();
                            yfm0 yfm0Var8 = i3p0Var.y;
                            String str11 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var8).getClass();
                            str11.getClass();
                            k0w0Var.h(new FeatureMatchTeamScreen(str11));
                            break;
                        case 8:
                            k0w0Var.getClass();
                            yfm0 yfm0Var9 = i3p0Var.y;
                            String str12 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var9).getClass();
                            str12.getClass();
                            k0w0Var.h(new FullDescriptionScreen(str12));
                            break;
                        case 9:
                            k0w0Var.getClass();
                            yfm0 yfm0Var10 = i3p0Var.y;
                            String str13 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var10).getClass();
                            str13.getClass();
                            k0w0Var.h(new TeamTransfersScreen(str13));
                            break;
                        default:
                            k0w0Var.getClass();
                            yfm0 yfm0Var11 = i3p0Var.y;
                            String str14 = ((z2p0) i3p0Var.D()).c;
                            ((zfm0) yfm0Var11).getClass();
                            str14.getClass();
                            k0w0Var.h(new TennisWinLossScreen(str14));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        } else {
            if (dtp0Var instanceof atp0) {
                return;
            }
            t9f.b();
        }
    }
}
