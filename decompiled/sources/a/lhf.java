package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.gov.nist.core.Separators;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.xbet.client1.R;
import org.xplatform.crystal.presentation.views.CrystalStatusView;
import org.xplatform.cyber.calendar.impl.presentation.content.day.CyberCalendarDaySwitcher;
import org.xplatform.cyber.game.counterstrike.impl.presentation.game_log.bomb.Cs2GameLogBombTimerView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.map_movement.Cs2MapMovementView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.statistic.tablet.Cs2StatisticTabletView;
import org.xplatform.cyber.game.universal.impl.presentation.dartslive.view.DartsLiveView;
import org.xplatform.cyber.game.universal.impl.presentation.dartslive.view.SectorView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberDurakCardDeckView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberDurakGameView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayedCardsTableView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayerCardsView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldCellGameView;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldGameView;
import org.xplatform.eastern_nights.presentation.views.EasternNightsCellGameView;
import org.xplatform.eastern_nights.presentation.views.EasternNightsGameView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.ExpandBtnView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.FootballEventsView;
import org.xplatform.ui_core.viewcomponents.layouts.constraint.EmptySearchViewNew;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes4.dex */
public final class lhf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20052a;
    public final Object b;
    public final Object c;

    public lhf(oer oerVar, xzs0 xzs0Var) {
        this.f20052a = (byte) 29;
        this.c = oerVar;
        this.b = xzs0Var;
    }

    private final Object a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(((FootballEventsView) this.b).getContext());
        layoutInflaterFrom.getClass();
        FootballEventsView footballEventsView = (FootballEventsView) this.c;
        layoutInflaterFrom.inflate(R.layout.view_football_events, footballEventsView);
        int i = R.id.ivCorners;
        if (((ImageView) yum0.f(footballEventsView, R.id.ivCorners)) != null) {
            i = R.id.ivRedCards;
            if (((ImageView) yum0.f(footballEventsView, R.id.ivRedCards)) != null) {
                i = R.id.ivYellowCards;
                if (((ImageView) yum0.f(footballEventsView, R.id.ivYellowCards)) != null) {
                    i = R.id.tvCorners;
                    TextView textView = (TextView) yum0.f(footballEventsView, R.id.tvCorners);
                    if (textView != null) {
                        i = R.id.tvRedCards;
                        TextView textView2 = (TextView) yum0.f(footballEventsView, R.id.tvRedCards);
                        if (textView2 != null) {
                            i = R.id.tvYellowCards;
                            TextView textView3 = (TextView) yum0.f(footballEventsView, R.id.tvYellowCards);
                            if (textView3 != null) {
                                return new chu0(footballEventsView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(footballEventsView.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:232:0x066d A[PHI: r0
  0x066d: PHI (r0v166 int) = 
  (r0v165 int)
  (r0v170 int)
  (r0v171 int)
  (r0v172 int)
  (r0v173 int)
  (r0v174 int)
  (r0v175 int)
  (r0v176 int)
  (r0v177 int)
  (r0v178 int)
  (r0v179 int)
  (r0v180 int)
  (r0v181 int)
  (r0v182 int)
 binds: [B:170:0x0501, B:172:0x050a, B:174:0x0515, B:176:0x0522, B:178:0x052d, B:180:0x0538, B:182:0x0545, B:184:0x0550, B:186:0x055d, B:188:0x0568, B:190:0x0575, B:192:0x0582, B:194:0x058d, B:196:0x059a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wmv wmvVar;
        miu0 miu0VarN;
        miu0 miu0VarN2;
        KTypeProjection kTypeProjectionA;
        KTypeProjection kTypeProjection;
        miu0 miu0VarN3;
        byte b = this.f20052a;
        int i = R.id.mapIv;
        int i2 = R.id.shimmer;
        byte b2 = 1;
        switch (b) {
            case 0:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(((CrystalStatusView) this.b).getContext());
                layoutInflaterFrom.getClass();
                CrystalStatusView crystalStatusView = (CrystalStatusView) this.c;
                View viewInflate = layoutInflaterFrom.inflate(R.layout.crystal_status_view, (ViewGroup) crystalStatusView, false);
                crystalStatusView.addView(viewInflate);
                int i3 = R.id.backgroundImageView;
                if (((ImageView) yum0.f(viewInflate, R.id.backgroundImageView)) != null) {
                    i3 = R.id.currentWinTextView;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.currentWinTextView);
                    if (textView != null) {
                        i3 = R.id.recycler;
                        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.recycler);
                        if (recyclerView != null) {
                            return new mhf((ConstraintLayout) viewInflate, textView, recyclerView);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                return null;
            case 1:
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(((Cs2GameLogBombTimerView) this.b).getContext());
                layoutInflaterFrom2.getClass();
                Cs2GameLogBombTimerView cs2GameLogBombTimerView = (Cs2GameLogBombTimerView) this.c;
                layoutInflaterFrom2.inflate(R.layout.cybergame_cs2_game_log_bomb_timer_view, cs2GameLogBombTimerView);
                int i4 = R.id.bombIcon;
                ImageView imageView = (ImageView) yum0.f(cs2GameLogBombTimerView, R.id.bombIcon);
                if (imageView != null) {
                    i4 = R.id.bombTimerText;
                    TextView textView2 = (TextView) yum0.f(cs2GameLogBombTimerView, R.id.bombTimerText);
                    if (textView2 != null) {
                        return new ush(cs2GameLogBombTimerView, imageView, textView2);
                    }
                }
                hny.u("Missing required view with ID: ".concat(cs2GameLogBombTimerView.getResources().getResourceName(i4)));
                return null;
            case 2:
                LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(((Cs2MapMovementView) this.b).getContext());
                layoutInflaterFrom3.getClass();
                Cs2MapMovementView cs2MapMovementView = (Cs2MapMovementView) this.c;
                layoutInflaterFrom3.inflate(R.layout.cybergame_cs2_map_movement_view, cs2MapMovementView);
                ImageView imageView2 = (ImageView) yum0.f(cs2MapMovementView, R.id.mapIv);
                if (imageView2 != null) {
                    return new zsh(cs2MapMovementView, imageView2);
                }
                hny.u("Missing required view with ID: ".concat(cs2MapMovementView.getResources().getResourceName(R.id.mapIv)));
                return null;
            case 3:
                LayoutInflater layoutInflaterFrom4 = LayoutInflater.from(((Cs2StatisticTabletView) this.b).getContext());
                layoutInflaterFrom4.getClass();
                Cs2StatisticTabletView cs2StatisticTabletView = (Cs2StatisticTabletView) this.c;
                layoutInflaterFrom4.inflate(R.layout.cybergame_cs2_statistic_tablet_view, cs2StatisticTabletView);
                int i5 = R.id.imgFirstPlayerFirstWeapon;
                ImageView imageView3 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFirstPlayerFirstWeapon);
                if (imageView3 != null) {
                    i5 = R.id.imgFirstPlayerFiveWeapon;
                    ImageView imageView4 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFirstPlayerFiveWeapon);
                    if (imageView4 != null) {
                        i5 = R.id.imgFirstPlayerFourWeapon;
                        ImageView imageView5 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFirstPlayerFourWeapon);
                        if (imageView5 != null) {
                            i5 = R.id.imgFirstPlayerInfo;
                            ImageView imageView6 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFirstPlayerInfo);
                            if (imageView6 != null) {
                                i5 = R.id.imgFirstPlayerSecondWeapon;
                                ImageView imageView7 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFirstPlayerSecondWeapon);
                                if (imageView7 != null) {
                                    i5 = R.id.imgFirstPlayerThirdWeapon;
                                    ImageView imageView8 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFirstPlayerThirdWeapon);
                                    if (imageView8 != null) {
                                        i5 = R.id.imgFivePlayerFirstWeapon;
                                        ImageView imageView9 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFivePlayerFirstWeapon);
                                        if (imageView9 != null) {
                                            i5 = R.id.imgFivePlayerFiveWeapon;
                                            ImageView imageView10 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFivePlayerFiveWeapon);
                                            if (imageView10 != null) {
                                                i5 = R.id.imgFivePlayerFourWeapon;
                                                ImageView imageView11 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFivePlayerFourWeapon);
                                                if (imageView11 != null) {
                                                    i5 = R.id.imgFivePlayerInfo;
                                                    ImageView imageView12 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFivePlayerInfo);
                                                    if (imageView12 != null) {
                                                        i5 = R.id.imgFivePlayerSecondWeapon;
                                                        ImageView imageView13 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFivePlayerSecondWeapon);
                                                        if (imageView13 != null) {
                                                            i5 = R.id.imgFivePlayerThirdWeapon;
                                                            ImageView imageView14 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFivePlayerThirdWeapon);
                                                            if (imageView14 != null) {
                                                                i5 = R.id.imgFourPlayerFirstWeapon;
                                                                ImageView imageView15 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFourPlayerFirstWeapon);
                                                                if (imageView15 != null) {
                                                                    i5 = R.id.imgFourPlayerFiveWeapon;
                                                                    ImageView imageView16 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFourPlayerFiveWeapon);
                                                                    if (imageView16 != null) {
                                                                        i5 = R.id.imgFourPlayerFourWeapon;
                                                                        ImageView imageView17 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFourPlayerFourWeapon);
                                                                        if (imageView17 != null) {
                                                                            i5 = R.id.imgFourPlayerInfo;
                                                                            ImageView imageView18 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFourPlayerInfo);
                                                                            if (imageView18 != null) {
                                                                                i5 = R.id.imgFourPlayerSecondWeapon;
                                                                                ImageView imageView19 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFourPlayerSecondWeapon);
                                                                                if (imageView19 != null) {
                                                                                    i5 = R.id.imgFourPlayerThirdWeapon;
                                                                                    ImageView imageView20 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgFourPlayerThirdWeapon);
                                                                                    if (imageView20 != null) {
                                                                                        i5 = R.id.imgSecondPlayerFirstWeapon;
                                                                                        ImageView imageView21 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgSecondPlayerFirstWeapon);
                                                                                        if (imageView21 != null) {
                                                                                            i5 = R.id.imgSecondPlayerFiveWeapon;
                                                                                            ImageView imageView22 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgSecondPlayerFiveWeapon);
                                                                                            if (imageView22 != null) {
                                                                                                i5 = R.id.imgSecondPlayerFourWeapon;
                                                                                                ImageView imageView23 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgSecondPlayerFourWeapon);
                                                                                                if (imageView23 != null) {
                                                                                                    i5 = R.id.imgSecondPlayerInfo;
                                                                                                    ImageView imageView24 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgSecondPlayerInfo);
                                                                                                    if (imageView24 != null) {
                                                                                                        i5 = R.id.imgSecondPlayerSecondWeapon;
                                                                                                        ImageView imageView25 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgSecondPlayerSecondWeapon);
                                                                                                        if (imageView25 != null) {
                                                                                                            i5 = R.id.imgSecondPlayerThirdWeapon;
                                                                                                            ImageView imageView26 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgSecondPlayerThirdWeapon);
                                                                                                            if (imageView26 != null) {
                                                                                                                i5 = R.id.imgThirdPlayerFirstWeapon;
                                                                                                                ImageView imageView27 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgThirdPlayerFirstWeapon);
                                                                                                                if (imageView27 != null) {
                                                                                                                    i5 = R.id.imgThirdPlayerFiveWeapon;
                                                                                                                    ImageView imageView28 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgThirdPlayerFiveWeapon);
                                                                                                                    if (imageView28 != null) {
                                                                                                                        i5 = R.id.imgThirdPlayerFourWeapon;
                                                                                                                        ImageView imageView29 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgThirdPlayerFourWeapon);
                                                                                                                        if (imageView29 != null) {
                                                                                                                            i5 = R.id.imgThirdPlayerInfo;
                                                                                                                            ImageView imageView30 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgThirdPlayerInfo);
                                                                                                                            if (imageView30 != null) {
                                                                                                                                i5 = R.id.imgThirdPlayerSecondWeapon;
                                                                                                                                ImageView imageView31 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgThirdPlayerSecondWeapon);
                                                                                                                                if (imageView31 != null) {
                                                                                                                                    i5 = R.id.imgThirdPlayerThirdWeapon;
                                                                                                                                    ImageView imageView32 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.imgThirdPlayerThirdWeapon);
                                                                                                                                    if (imageView32 != null) {
                                                                                                                                        i5 = R.id.ivFirstPlayerMainWeapon;
                                                                                                                                        ImageView imageView33 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.ivFirstPlayerMainWeapon);
                                                                                                                                        if (imageView33 != null) {
                                                                                                                                            i5 = R.id.ivFivePlayerMainWeapon;
                                                                                                                                            ImageView imageView34 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.ivFivePlayerMainWeapon);
                                                                                                                                            if (imageView34 != null) {
                                                                                                                                                i5 = R.id.ivFourPlayerMainWeapon;
                                                                                                                                                ImageView imageView35 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.ivFourPlayerMainWeapon);
                                                                                                                                                if (imageView35 != null) {
                                                                                                                                                    i5 = R.id.ivSecondPlayerMainWeapon;
                                                                                                                                                    ImageView imageView36 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.ivSecondPlayerMainWeapon);
                                                                                                                                                    if (imageView36 != null) {
                                                                                                                                                        i5 = R.id.ivThirdPlayerMainWeapon;
                                                                                                                                                        ImageView imageView37 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.ivThirdPlayerMainWeapon);
                                                                                                                                                        if (imageView37 != null) {
                                                                                                                                                            i5 = R.id.teamImage;
                                                                                                                                                            ImageView imageView38 = (ImageView) yum0.f(cs2StatisticTabletView, R.id.teamImage);
                                                                                                                                                            if (imageView38 != null) {
                                                                                                                                                                i5 = R.id.tvAdr;
                                                                                                                                                                TextView textView3 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvAdr);
                                                                                                                                                                if (textView3 != null) {
                                                                                                                                                                    i5 = R.id.tvAssist;
                                                                                                                                                                    TextView textView4 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvAssist);
                                                                                                                                                                    if (textView4 != null) {
                                                                                                                                                                        i5 = R.id.tvDead;
                                                                                                                                                                        TextView textView5 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvDead);
                                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                                            i5 = R.id.tvFirstPlayerAdr;
                                                                                                                                                                            TextView textView6 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFirstPlayerAdr);
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                i5 = R.id.tvFirstPlayerAssist;
                                                                                                                                                                                TextView textView7 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFirstPlayerAssist);
                                                                                                                                                                                if (textView7 != null) {
                                                                                                                                                                                    i5 = R.id.tvFirstPlayerDead;
                                                                                                                                                                                    TextView textView8 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFirstPlayerDead);
                                                                                                                                                                                    if (textView8 != null) {
                                                                                                                                                                                        i5 = R.id.tvFirstPlayerHp;
                                                                                                                                                                                        TextView textView9 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFirstPlayerHp);
                                                                                                                                                                                        if (textView9 != null) {
                                                                                                                                                                                            i5 = R.id.tvFirstPlayerKill;
                                                                                                                                                                                            TextView textView10 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFirstPlayerKill);
                                                                                                                                                                                            if (textView10 != null) {
                                                                                                                                                                                                i5 = R.id.tvFirstPlayerMoney;
                                                                                                                                                                                                TextView textView11 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFirstPlayerMoney);
                                                                                                                                                                                                if (textView11 != null) {
                                                                                                                                                                                                    i5 = R.id.tvFirstPlayerName;
                                                                                                                                                                                                    TextView textView12 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFirstPlayerName);
                                                                                                                                                                                                    if (textView12 != null) {
                                                                                                                                                                                                        i5 = R.id.tvFivePlayerAdr;
                                                                                                                                                                                                        TextView textView13 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFivePlayerAdr);
                                                                                                                                                                                                        if (textView13 != null) {
                                                                                                                                                                                                            i5 = R.id.tvFivePlayerAssist;
                                                                                                                                                                                                            TextView textView14 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFivePlayerAssist);
                                                                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                                                                i5 = R.id.tvFivePlayerDead;
                                                                                                                                                                                                                TextView textView15 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFivePlayerDead);
                                                                                                                                                                                                                if (textView15 != null) {
                                                                                                                                                                                                                    i5 = R.id.tvFivePlayerHp;
                                                                                                                                                                                                                    TextView textView16 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFivePlayerHp);
                                                                                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                                                                                        i5 = R.id.tvFivePlayerKill;
                                                                                                                                                                                                                        TextView textView17 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFivePlayerKill);
                                                                                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                                                                                            i5 = R.id.tvFivePlayerMoney;
                                                                                                                                                                                                                            TextView textView18 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFivePlayerMoney);
                                                                                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                                                                                i5 = R.id.tvFivePlayerName;
                                                                                                                                                                                                                                TextView textView19 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFivePlayerName);
                                                                                                                                                                                                                                if (textView19 != null) {
                                                                                                                                                                                                                                    i5 = R.id.tvFourPlayerAdr;
                                                                                                                                                                                                                                    TextView textView20 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFourPlayerAdr);
                                                                                                                                                                                                                                    if (textView20 != null) {
                                                                                                                                                                                                                                        i5 = R.id.tvFourPlayerAssist;
                                                                                                                                                                                                                                        TextView textView21 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFourPlayerAssist);
                                                                                                                                                                                                                                        if (textView21 != null) {
                                                                                                                                                                                                                                            i5 = R.id.tvFourPlayerDead;
                                                                                                                                                                                                                                            TextView textView22 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFourPlayerDead);
                                                                                                                                                                                                                                            if (textView22 != null) {
                                                                                                                                                                                                                                                i5 = R.id.tvFourPlayerHp;
                                                                                                                                                                                                                                                TextView textView23 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFourPlayerHp);
                                                                                                                                                                                                                                                if (textView23 != null) {
                                                                                                                                                                                                                                                    i5 = R.id.tvFourPlayerKill;
                                                                                                                                                                                                                                                    TextView textView24 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFourPlayerKill);
                                                                                                                                                                                                                                                    if (textView24 != null) {
                                                                                                                                                                                                                                                        i5 = R.id.tvFourPlayerMoney;
                                                                                                                                                                                                                                                        TextView textView25 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFourPlayerMoney);
                                                                                                                                                                                                                                                        if (textView25 != null) {
                                                                                                                                                                                                                                                            i5 = R.id.tvFourPlayerName;
                                                                                                                                                                                                                                                            TextView textView26 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvFourPlayerName);
                                                                                                                                                                                                                                                            if (textView26 != null) {
                                                                                                                                                                                                                                                                i5 = R.id.tvHp;
                                                                                                                                                                                                                                                                TextView textView27 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvHp);
                                                                                                                                                                                                                                                                if (textView27 != null) {
                                                                                                                                                                                                                                                                    i5 = R.id.tvKill;
                                                                                                                                                                                                                                                                    TextView textView28 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvKill);
                                                                                                                                                                                                                                                                    if (textView28 != null) {
                                                                                                                                                                                                                                                                        i5 = R.id.tvMoney;
                                                                                                                                                                                                                                                                        TextView textView29 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvMoney);
                                                                                                                                                                                                                                                                        if (textView29 != null) {
                                                                                                                                                                                                                                                                            i5 = R.id.tvSecondPlayerAdr;
                                                                                                                                                                                                                                                                            TextView textView30 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvSecondPlayerAdr);
                                                                                                                                                                                                                                                                            if (textView30 != null) {
                                                                                                                                                                                                                                                                                i5 = R.id.tvSecondPlayerAssist;
                                                                                                                                                                                                                                                                                TextView textView31 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvSecondPlayerAssist);
                                                                                                                                                                                                                                                                                if (textView31 != null) {
                                                                                                                                                                                                                                                                                    i5 = R.id.tvSecondPlayerDead;
                                                                                                                                                                                                                                                                                    TextView textView32 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvSecondPlayerDead);
                                                                                                                                                                                                                                                                                    if (textView32 != null) {
                                                                                                                                                                                                                                                                                        i5 = R.id.tvSecondPlayerHp;
                                                                                                                                                                                                                                                                                        TextView textView33 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvSecondPlayerHp);
                                                                                                                                                                                                                                                                                        if (textView33 != null) {
                                                                                                                                                                                                                                                                                            i5 = R.id.tvSecondPlayerKill;
                                                                                                                                                                                                                                                                                            TextView textView34 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvSecondPlayerKill);
                                                                                                                                                                                                                                                                                            if (textView34 != null) {
                                                                                                                                                                                                                                                                                                i5 = R.id.tvSecondPlayerMoney;
                                                                                                                                                                                                                                                                                                TextView textView35 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvSecondPlayerMoney);
                                                                                                                                                                                                                                                                                                if (textView35 != null) {
                                                                                                                                                                                                                                                                                                    i5 = R.id.tvSecondPlayerName;
                                                                                                                                                                                                                                                                                                    TextView textView36 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvSecondPlayerName);
                                                                                                                                                                                                                                                                                                    if (textView36 != null) {
                                                                                                                                                                                                                                                                                                        i5 = R.id.tvTeamName;
                                                                                                                                                                                                                                                                                                        TextView textView37 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvTeamName);
                                                                                                                                                                                                                                                                                                        if (textView37 != null) {
                                                                                                                                                                                                                                                                                                            i5 = R.id.tvThirdPlayerAdr;
                                                                                                                                                                                                                                                                                                            TextView textView38 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvThirdPlayerAdr);
                                                                                                                                                                                                                                                                                                            if (textView38 != null) {
                                                                                                                                                                                                                                                                                                                i5 = R.id.tvThirdPlayerAssist;
                                                                                                                                                                                                                                                                                                                TextView textView39 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvThirdPlayerAssist);
                                                                                                                                                                                                                                                                                                                if (textView39 != null) {
                                                                                                                                                                                                                                                                                                                    i5 = R.id.tvThirdPlayerDead;
                                                                                                                                                                                                                                                                                                                    TextView textView40 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvThirdPlayerDead);
                                                                                                                                                                                                                                                                                                                    if (textView40 != null) {
                                                                                                                                                                                                                                                                                                                        i5 = R.id.tvThirdPlayerHp;
                                                                                                                                                                                                                                                                                                                        TextView textView41 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvThirdPlayerHp);
                                                                                                                                                                                                                                                                                                                        if (textView41 != null) {
                                                                                                                                                                                                                                                                                                                            i5 = R.id.tvThirdPlayerKill;
                                                                                                                                                                                                                                                                                                                            TextView textView42 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvThirdPlayerKill);
                                                                                                                                                                                                                                                                                                                            if (textView42 != null) {
                                                                                                                                                                                                                                                                                                                                i5 = R.id.tvThirdPlayerMoney;
                                                                                                                                                                                                                                                                                                                                TextView textView43 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvThirdPlayerMoney);
                                                                                                                                                                                                                                                                                                                                if (textView43 != null) {
                                                                                                                                                                                                                                                                                                                                    i5 = R.id.tvThirdPlayerName;
                                                                                                                                                                                                                                                                                                                                    TextView textView44 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvThirdPlayerName);
                                                                                                                                                                                                                                                                                                                                    if (textView44 != null) {
                                                                                                                                                                                                                                                                                                                                        i5 = R.id.tvTotalCash;
                                                                                                                                                                                                                                                                                                                                        TextView textView45 = (TextView) yum0.f(cs2StatisticTabletView, R.id.tvTotalCash);
                                                                                                                                                                                                                                                                                                                                        if (textView45 != null) {
                                                                                                                                                                                                                                                                                                                                            i5 = R.id.vFirstPlayer;
                                                                                                                                                                                                                                                                                                                                            View viewF = yum0.f(cs2StatisticTabletView, R.id.vFirstPlayer);
                                                                                                                                                                                                                                                                                                                                            if (viewF != null) {
                                                                                                                                                                                                                                                                                                                                                i5 = R.id.vFivePlayer;
                                                                                                                                                                                                                                                                                                                                                View viewF2 = yum0.f(cs2StatisticTabletView, R.id.vFivePlayer);
                                                                                                                                                                                                                                                                                                                                                if (viewF2 != null) {
                                                                                                                                                                                                                                                                                                                                                    i5 = R.id.vFourPlayer;
                                                                                                                                                                                                                                                                                                                                                    View viewF3 = yum0.f(cs2StatisticTabletView, R.id.vFourPlayer);
                                                                                                                                                                                                                                                                                                                                                    if (viewF3 != null) {
                                                                                                                                                                                                                                                                                                                                                        i5 = R.id.vHeader;
                                                                                                                                                                                                                                                                                                                                                        View viewF4 = yum0.f(cs2StatisticTabletView, R.id.vHeader);
                                                                                                                                                                                                                                                                                                                                                        if (viewF4 != null) {
                                                                                                                                                                                                                                                                                                                                                            i5 = R.id.vSecondPlayer;
                                                                                                                                                                                                                                                                                                                                                            View viewF5 = yum0.f(cs2StatisticTabletView, R.id.vSecondPlayer);
                                                                                                                                                                                                                                                                                                                                                            if (viewF5 != null) {
                                                                                                                                                                                                                                                                                                                                                                i5 = R.id.vThirdPlayer;
                                                                                                                                                                                                                                                                                                                                                                View viewF6 = yum0.f(cs2StatisticTabletView, R.id.vThirdPlayer);
                                                                                                                                                                                                                                                                                                                                                                if (viewF6 != null) {
                                                                                                                                                                                                                                                                                                                                                                    return new fth(cs2StatisticTabletView, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20, imageView21, imageView22, imageView23, imageView24, imageView25, imageView26, imageView27, imageView28, imageView29, imageView30, imageView31, imageView32, imageView33, imageView34, imageView35, imageView36, imageView37, imageView38, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40, textView41, textView42, textView43, textView44, textView45, viewF, viewF2, viewF3, viewF4, viewF5, viewF6);
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(cs2StatisticTabletView.getResources().getResourceName(i5)));
                return null;
            case 4:
                LayoutInflater layoutInflaterFrom5 = LayoutInflater.from(((CyberCalendarDaySwitcher) this.b).getContext());
                layoutInflaterFrom5.getClass();
                CyberCalendarDaySwitcher cyberCalendarDaySwitcher = (CyberCalendarDaySwitcher) this.c;
                layoutInflaterFrom5.inflate(R.layout.cyber_calendar_day_switcher, cyberCalendarDaySwitcher);
                int i6 = R.id.ivNextDayArrow;
                ImageView imageView39 = (ImageView) yum0.f(cyberCalendarDaySwitcher, R.id.ivNextDayArrow);
                if (imageView39 != null) {
                    i6 = R.id.ivPreviousDayArrow;
                    ImageView imageView40 = (ImageView) yum0.f(cyberCalendarDaySwitcher, R.id.ivPreviousDayArrow);
                    if (imageView40 != null) {
                        i6 = R.id.separator;
                        if (((DsSeparator) yum0.f(cyberCalendarDaySwitcher, R.id.separator)) != null) {
                            i6 = R.id.tvDay;
                            TextView textView46 = (TextView) yum0.f(cyberCalendarDaySwitcher, R.id.tvDay);
                            if (textView46 != null) {
                                return new b6g(cyberCalendarDaySwitcher, imageView39, imageView40, textView46);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(cyberCalendarDaySwitcher.getResources().getResourceName(i6)));
                return null;
            case 5:
                ((Function1) this.b).invoke(((ejg) this.c).f7908a);
                return Unit.f46060a;
            case 6:
                LayoutInflater layoutInflaterFrom6 = LayoutInflater.from(((CyberDurakGameView) this.b).getContext());
                layoutInflaterFrom6.getClass();
                CyberDurakGameView cyberDurakGameView = (CyberDurakGameView) this.c;
                layoutInflaterFrom6.inflate(R.layout.synthetic_durak_game_view, cyberDurakGameView);
                int i7 = R.id.countRebound;
                TextView textView47 = (TextView) yum0.f(cyberDurakGameView, R.id.countRebound);
                if (textView47 != null) {
                    i7 = R.id.countStep;
                    TextView textView48 = (TextView) yum0.f(cyberDurakGameView, R.id.countStep);
                    if (textView48 != null) {
                        i7 = R.id.countTaken;
                        TextView textView49 = (TextView) yum0.f(cyberDurakGameView, R.id.countTaken);
                        if (textView49 != null) {
                            i7 = R.id.durakDeck;
                            CyberDurakCardDeckView cyberDurakCardDeckView = (CyberDurakCardDeckView) yum0.f(cyberDurakGameView, R.id.durakDeck);
                            if (cyberDurakCardDeckView != null) {
                                i7 = R.id.firstPlayer;
                                View viewF7 = yum0.f(cyberDurakGameView, R.id.firstPlayer);
                                if (viewF7 != null) {
                                    int i8 = R.id.playerCards;
                                    CyberPlayerCardsView cyberPlayerCardsView = (CyberPlayerCardsView) yum0.f(viewF7, R.id.playerCards);
                                    if (cyberPlayerCardsView != null) {
                                        TextView textView50 = (TextView) yum0.f(viewF7, R.id.playerName);
                                        if (textView50 != null) {
                                            TextView textView51 = (TextView) yum0.f(viewF7, R.id.playerStatus);
                                            if (textView51 != null) {
                                                k1o0 k1o0Var = new k1o0((ConstraintLayout) viewF7, cyberPlayerCardsView, textView50, textView51, (byte) 0);
                                                int i9 = R.id.ivBackground;
                                                ImageView imageView41 = (ImageView) yum0.f(cyberDurakGameView, R.id.ivBackground);
                                                if (imageView41 != null) {
                                                    i9 = R.id.matchState;
                                                    TextView textView52 = (TextView) yum0.f(cyberDurakGameView, R.id.matchState);
                                                    if (textView52 != null) {
                                                        i9 = R.id.playedCardTable;
                                                        CyberPlayedCardsTableView cyberPlayedCardsTableView = (CyberPlayedCardsTableView) yum0.f(cyberDurakGameView, R.id.playedCardTable);
                                                        if (cyberPlayedCardsTableView != null) {
                                                            i9 = R.id.secondPlayer;
                                                            View viewF8 = yum0.f(cyberDurakGameView, R.id.secondPlayer);
                                                            if (viewF8 != null) {
                                                                CyberPlayerCardsView cyberPlayerCardsView2 = (CyberPlayerCardsView) yum0.f(viewF8, R.id.playerCards);
                                                                if (cyberPlayerCardsView2 != null) {
                                                                    TextView textView53 = (TextView) yum0.f(viewF8, R.id.playerName);
                                                                    if (textView53 != null) {
                                                                        TextView textView54 = (TextView) yum0.f(viewF8, R.id.playerStatus);
                                                                        if (textView54 != null) {
                                                                            return new m1o0(cyberDurakGameView, textView47, textView48, textView49, cyberDurakCardDeckView, k1o0Var, imageView41, textView52, cyberPlayedCardsTableView, new k1o0((ConstraintLayout) viewF8, cyberPlayerCardsView2, textView53, textView54, (byte) 1));
                                                                        }
                                                                        i8 = R.id.playerStatus;
                                                                    } else {
                                                                        i8 = R.id.playerName;
                                                                    }
                                                                }
                                                                hny.u("Missing required view with ID: ".concat(viewF8.getResources().getResourceName(i8)));
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                }
                                                i7 = i9;
                                            } else {
                                                i8 = R.id.playerStatus;
                                            }
                                        } else {
                                            i8 = R.id.playerName;
                                        }
                                    }
                                    hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i8)));
                                    return null;
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(cyberDurakGameView.getResources().getResourceName(i7)));
                return null;
            case 7:
                riu0 riu0Var = (riu0) ((a8z) this.c).getValue();
                wmvVar = riu0Var instanceof wmv ? (wmv) riu0Var : null;
                return (wmvVar == null || (miu0VarN = wmvVar.n()) == null) ? ((y4h) this.b).n() : miu0VarN;
            case 8:
                LayoutInflater layoutInflaterFrom7 = LayoutInflater.from(((CyberPlayedCardsTableView) this.b).getContext());
                layoutInflaterFrom7.getClass();
                CyberPlayedCardsTableView cyberPlayedCardsTableView2 = (CyberPlayedCardsTableView) this.c;
                layoutInflaterFrom7.inflate(R.layout.synthetic_durak_played_card_table, cyberPlayedCardsTableView2);
                int i10 = R.id.firstCard;
                View viewF9 = yum0.f(cyberPlayedCardsTableView2, R.id.firstCard);
                if (viewF9 != null) {
                    n1o0 n1o0VarA = n1o0.a(viewF9);
                    i10 = R.id.fiveCard;
                    View viewF10 = yum0.f(cyberPlayedCardsTableView2, R.id.fiveCard);
                    if (viewF10 != null) {
                        n1o0 n1o0VarA2 = n1o0.a(viewF10);
                        i10 = R.id.fourthCard;
                        View viewF11 = yum0.f(cyberPlayedCardsTableView2, R.id.fourthCard);
                        if (viewF11 != null) {
                            n1o0 n1o0VarA3 = n1o0.a(viewF11);
                            i10 = R.id.secondCard;
                            View viewF12 = yum0.f(cyberPlayedCardsTableView2, R.id.secondCard);
                            if (viewF12 != null) {
                                n1o0 n1o0VarA4 = n1o0.a(viewF12);
                                i10 = R.id.sixCard;
                                View viewF13 = yum0.f(cyberPlayedCardsTableView2, R.id.sixCard);
                                if (viewF13 != null) {
                                    n1o0 n1o0VarA5 = n1o0.a(viewF13);
                                    i10 = R.id.thirdCard;
                                    View viewF14 = yum0.f(cyberPlayedCardsTableView2, R.id.thirdCard);
                                    if (viewF14 != null) {
                                        return new o1o0(cyberPlayedCardsTableView2, n1o0VarA, n1o0VarA2, n1o0VarA3, n1o0VarA4, n1o0VarA5, n1o0.a(viewF14));
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(cyberPlayedCardsTableView2.getResources().getResourceName(i10)));
                return null;
            case 9:
                ComponentCallbacks2 componentCallbacks2 = (Application) this.b;
                af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ujh.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ujh)) {
                        ze3Var = null;
                    }
                    ujh ujhVar = (ujh) ze3Var;
                    if (ujhVar != null) {
                        CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams = ((kkh) this.c).f18439a;
                        cyberTournamentBracketMatchParams.getClass();
                        oeg0 oeg0Var = ujhVar.f35779a;
                        gr00 gr00Var = ujhVar.b;
                        cad cadVar = ujhVar.c;
                        pyg pygVar = ujhVar.d;
                        qv2 qv2Var = ujhVar.e;
                        h3c h3cVar = ujhVar.f;
                        pygVar.getClass();
                        oeg0Var.getClass();
                        return new zei(cadVar, oeg0Var, cyberTournamentBracketMatchParams, gr00Var, qv2Var, h3cVar);
                    }
                }
                jf4.n(b1j.i(ujh.class, "Cannot create dependency "));
                return null;
            case 10:
                ((Function1) this.b).invoke((smh) this.c);
                return Unit.f46060a;
            case 11:
                LayoutInflater layoutInflaterFrom8 = LayoutInflater.from(((DartsLiveView) this.b).getContext());
                layoutInflaterFrom8.getClass();
                DartsLiveView dartsLiveView = (DartsLiveView) this.c;
                layoutInflaterFrom8.inflate(R.layout.synthetic_darts_live_view, dartsLiveView);
                int i11 = R.id.centerGuideline;
                if (((Guideline) yum0.f(dartsLiveView, R.id.centerGuideline)) != null) {
                    i11 = R.id.firstDivider;
                    View viewF15 = yum0.f(dartsLiveView, R.id.firstDivider);
                    if (viewF15 != null) {
                        i11 = R.id.firstPlayerFirstThrowIv;
                        if (((ImageView) yum0.f(dartsLiveView, R.id.firstPlayerFirstThrowIv)) != null) {
                            i11 = R.id.firstPlayerFirstThrowTv;
                            TextView textView55 = (TextView) yum0.f(dartsLiveView, R.id.firstPlayerFirstThrowTv);
                            if (textView55 != null) {
                                i11 = R.id.firstPlayerNameTv;
                                if (((TextView) yum0.f(dartsLiveView, R.id.firstPlayerNameTv)) != null) {
                                    i11 = R.id.firstPlayerSecondThrowIv;
                                    if (((ImageView) yum0.f(dartsLiveView, R.id.firstPlayerSecondThrowIv)) != null) {
                                        i11 = R.id.firstPlayerSecondThrowTv;
                                        TextView textView56 = (TextView) yum0.f(dartsLiveView, R.id.firstPlayerSecondThrowTv);
                                        if (textView56 != null) {
                                            i11 = R.id.firstPlayerThirdThrowIv;
                                            if (((ImageView) yum0.f(dartsLiveView, R.id.firstPlayerThirdThrowIv)) != null) {
                                                i11 = R.id.firstPlayerThirdThrowTv;
                                                TextView textView57 = (TextView) yum0.f(dartsLiveView, R.id.firstPlayerThirdThrowTv);
                                                if (textView57 != null) {
                                                    i11 = R.id.firstPlayerThrowTitleTv;
                                                    if (((TextView) yum0.f(dartsLiveView, R.id.firstPlayerThrowTitleTv)) != null) {
                                                        i11 = R.id.firstPlayerThrowTv;
                                                        TextView textView58 = (TextView) yum0.f(dartsLiveView, R.id.firstPlayerThrowTv);
                                                        if (textView58 != null) {
                                                            i11 = R.id.firstPlayerThrowsTotalTv;
                                                            TextView textView59 = (TextView) yum0.f(dartsLiveView, R.id.firstPlayerThrowsTotalTv);
                                                            if (textView59 != null) {
                                                                i11 = R.id.firstPlayerTotalTitleTv;
                                                                if (((TextView) yum0.f(dartsLiveView, R.id.firstPlayerTotalTitleTv)) != null) {
                                                                    i11 = R.id.firstPlayerTotalTv;
                                                                    TextView textView60 = (TextView) yum0.f(dartsLiveView, R.id.firstPlayerTotalTv);
                                                                    if (textView60 != null) {
                                                                        ImageView imageView42 = (ImageView) yum0.f(dartsLiveView, R.id.mapIv);
                                                                        if (imageView42 != null) {
                                                                            i = R.id.secondDivider;
                                                                            View viewF16 = yum0.f(dartsLiveView, R.id.secondDivider);
                                                                            if (viewF16 != null) {
                                                                                i = R.id.secondPlayerFirstThrowIv;
                                                                                if (((ImageView) yum0.f(dartsLiveView, R.id.secondPlayerFirstThrowIv)) != null) {
                                                                                    i = R.id.secondPlayerFirstThrowTv;
                                                                                    TextView textView61 = (TextView) yum0.f(dartsLiveView, R.id.secondPlayerFirstThrowTv);
                                                                                    if (textView61 != null) {
                                                                                        i = R.id.secondPlayerNameTv;
                                                                                        if (((TextView) yum0.f(dartsLiveView, R.id.secondPlayerNameTv)) != null) {
                                                                                            i = R.id.secondPlayerSecondThrowIv;
                                                                                            if (((ImageView) yum0.f(dartsLiveView, R.id.secondPlayerSecondThrowIv)) != null) {
                                                                                                i = R.id.secondPlayerSecondThrowTv;
                                                                                                TextView textView62 = (TextView) yum0.f(dartsLiveView, R.id.secondPlayerSecondThrowTv);
                                                                                                if (textView62 != null) {
                                                                                                    i = R.id.secondPlayerThirdThrowIv;
                                                                                                    if (((ImageView) yum0.f(dartsLiveView, R.id.secondPlayerThirdThrowIv)) != null) {
                                                                                                        i = R.id.secondPlayerThirdThrowTv;
                                                                                                        TextView textView63 = (TextView) yum0.f(dartsLiveView, R.id.secondPlayerThirdThrowTv);
                                                                                                        if (textView63 != null) {
                                                                                                            i = R.id.secondPlayerThrowTitleTv;
                                                                                                            if (((TextView) yum0.f(dartsLiveView, R.id.secondPlayerThrowTitleTv)) != null) {
                                                                                                                i = R.id.secondPlayerThrowTv;
                                                                                                                TextView textView64 = (TextView) yum0.f(dartsLiveView, R.id.secondPlayerThrowTv);
                                                                                                                if (textView64 != null) {
                                                                                                                    i = R.id.secondPlayerThrowsTotalTv;
                                                                                                                    TextView textView65 = (TextView) yum0.f(dartsLiveView, R.id.secondPlayerThrowsTotalTv);
                                                                                                                    if (textView65 != null) {
                                                                                                                        i = R.id.secondPlayerTotalTitleTv;
                                                                                                                        if (((TextView) yum0.f(dartsLiveView, R.id.secondPlayerTotalTitleTv)) != null) {
                                                                                                                            i = R.id.secondPlayerTotalTv;
                                                                                                                            TextView textView66 = (TextView) yum0.f(dartsLiveView, R.id.secondPlayerTotalTv);
                                                                                                                            if (textView66 != null) {
                                                                                                                                i = R.id.sectorView;
                                                                                                                                SectorView sectorView = (SectorView) yum0.f(dartsLiveView, R.id.sectorView);
                                                                                                                                if (sectorView != null) {
                                                                                                                                    i = R.id.syntheticTimerView;
                                                                                                                                    SyntheticTimerView syntheticTimerView = (SyntheticTimerView) yum0.f(dartsLiveView, R.id.syntheticTimerView);
                                                                                                                                    if (syntheticTimerView != null) {
                                                                                                                                        i = R.id.winnerTv;
                                                                                                                                        TextView textView67 = (TextView) yum0.f(dartsLiveView, R.id.winnerTv);
                                                                                                                                        if (textView67 != null) {
                                                                                                                                            return new i1o0(dartsLiveView, viewF15, textView55, textView56, textView57, textView58, textView59, textView60, imageView42, viewF16, textView61, textView62, textView63, textView64, textView65, textView66, sectorView, syntheticTimerView, textView67);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i = i11;
                                                                    }
                                                                } else {
                                                                    i = i11;
                                                                }
                                                            } else {
                                                                i = i11;
                                                            }
                                                        } else {
                                                            i = i11;
                                                        }
                                                    } else {
                                                        i = i11;
                                                    }
                                                } else {
                                                    i = i11;
                                                }
                                            } else {
                                                i = i11;
                                            }
                                        } else {
                                            i = i11;
                                        }
                                    } else {
                                        i = i11;
                                    }
                                } else {
                                    i = i11;
                                }
                            } else {
                                i = i11;
                            }
                        } else {
                            i = i11;
                        }
                    } else {
                        i = i11;
                    }
                } else {
                    i = i11;
                }
                hny.u("Missing required view with ID: ".concat(dartsLiveView.getResources().getResourceName(i)));
                return null;
            case 12:
                riu0 riu0Var2 = (riu0) ((a8z) this.c).getValue();
                wmvVar = riu0Var2 instanceof wmv ? (wmv) riu0Var2 : null;
                return (wmvVar == null || (miu0VarN2 = wmvVar.n()) == null) ? ((ngj) this.b).n() : miu0VarN2;
            case 13:
                ock ockVar = (ock) this.b;
                rgy rgyVar = (rgy) this.c;
                List<hzs0> typeParameters = ockVar.z().getTypeParameters();
                typeParameters.getClass();
                ArrayList<niy> arrayList = new ArrayList(r3d.q(typeParameters, 10));
                for (hzs0 hzs0Var : typeParameters) {
                    dre0 dre0VarH0 = fre0.h0(ockVar);
                    hzs0Var.getClass();
                    arrayList.add(new niy(dre0VarH0, hzs0Var));
                }
                siy siyVarB = rgyVar.b(ockVar.getName(), arrayList);
                for (niy niyVar : arrayList) {
                    List upperBounds = niyVar.getUpperBounds();
                    ArrayList arrayList2 = new ArrayList(r3d.q(upperBounds, 10));
                    Iterator it = upperBounds.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(siyVarB.c((kiy) it.next(), ockVar.getName()));
                    }
                    niyVar.g = arrayList2;
                }
                return arrayList;
            case 14:
                qck qckVar = (qck) this.b;
                String str = (String) this.c;
                ihy ihyVar = qckVar.h;
                String str2 = qckVar.i;
                ihyVar.getClass();
                str.getClass();
                str2.getClass();
                Collection collectionL0 = str.equals("<init>") ? CollectionsKt.L0(ihyVar.D()) : ihyVar.F(g950.e(str));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : collectionL0) {
                    if (Intrinsics.d(sog0.c((mer) obj).H(), str2)) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.size() == 1) {
                    return (mer) CollectionsKt.v0(arrayList3);
                }
                String strB0 = CollectionsKt.b0(collectionL0, Separators.RETURN, null, null, j9x.m, 30);
                StringBuilder sbN = b1j.n("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbN.append(ihyVar);
                sbN.append(':');
                sbN.append(strB0.length() == 0 ? " no members found" : Separators.RETURN.concat(strB0));
                throw new poe(sbN.toString());
            case 15:
                wdk wdkVar = (wdk) this.b;
                Function0 function0 = (Function0) this.c;
                List listJ = wdkVar.b.J();
                if (listJ.isEmpty()) {
                    return iun.f15405a;
                }
                ArrayList arrayList4 = new ArrayList(r3d.q(listJ, 10));
                int i12 = 0;
                for (Object obj2 : listJ) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        q3d.p();
                        throw null;
                    }
                    pzs0 pzs0Var = (pzs0) obj2;
                    tfe tfeVar = function0 == null ? null : new tfe(new vdk(wdkVar, (byte) 2), i12, b2);
                    if (pzs0Var.c()) {
                        KTypeProjection.c.getClass();
                        kTypeProjectionA = KTypeProjection.d;
                    } else {
                        wsy wsyVarB = pzs0Var.b();
                        wsyVarB.getClass();
                        wdk wdkVar2 = new wdk(wsyVarB, tfeVar, false);
                        int iOrdinal = pzs0Var.a().ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                KTypeProjection.c.getClass();
                                kTypeProjection = new KTypeProjection(wdkVar2, uiy.b);
                            } else {
                                if (iOrdinal != 2) {
                                    t9f.b();
                                    return null;
                                }
                                KTypeProjection.c.getClass();
                                kTypeProjection = new KTypeProjection(wdkVar2, uiy.c);
                            }
                            kTypeProjectionA = kTypeProjection;
                        } else {
                            KTypeProjection.c.getClass();
                            kTypeProjectionA = piy.a(wdkVar2);
                        }
                    }
                    arrayList4.add(kTypeProjectionA);
                    i12 = i13;
                }
                return arrayList4;
            case 16:
                ffk ffkVar = (ffk) this.b;
                return CollectionsKt.L0(((m83) ((f6i) ffkVar.l.f10647a).g).a(ffkVar.u, (d3d0) this.c));
            case 17:
                riu0 riu0Var3 = (riu0) ((a8z) this.c).getValue();
                wmvVar = riu0Var3 instanceof wmv ? (wmv) riu0Var3 : null;
                return (wmvVar == null || (miu0VarN3 = wmvVar.n()) == null) ? ((ptk) this.b).n() : miu0VarN3;
            case 18:
                LayoutInflater layoutInflaterFrom9 = LayoutInflater.from(((w6l) this.b).getContext());
                layoutInflaterFrom9.getClass();
                w6l w6lVar = (w6l) this.c;
                layoutInflaterFrom9.inflate(R.layout.dota_selected_hero_view, w6lVar);
                int i14 = R.id.aegisImage;
                ImageView imageView43 = (ImageView) yum0.f(w6lVar, R.id.aegisImage);
                if (imageView43 != null) {
                    i14 = R.id.bgView;
                    View viewF17 = yum0.f(w6lVar, R.id.bgView);
                    if (viewF17 != null) {
                        i14 = R.id.heroImageIv;
                        ImageView imageView44 = (ImageView) yum0.f(w6lVar, R.id.heroImageIv);
                        if (imageView44 != null) {
                            i14 = R.id.timerText;
                            TextView textView68 = (TextView) yum0.f(w6lVar, R.id.timerText);
                            if (textView68 != null) {
                                return new x6l(w6lVar, imageView43, viewF17, imageView44, textView68);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(w6lVar.getResources().getResourceName(i14)));
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                LayoutInflater layoutInflaterFrom10 = LayoutInflater.from(((DragonsGoldCellGameView) this.b).getContext());
                layoutInflaterFrom10.getClass();
                DragonsGoldCellGameView dragonsGoldCellGameView = (DragonsGoldCellGameView) this.c;
                layoutInflaterFrom10.inflate(R.layout.dragons_gold_cell_game, dragonsGoldCellGameView);
                if (((AppCompatTextView) yum0.f(dragonsGoldCellGameView, R.id.bottomImageBackground)) != null) {
                    TextView textView69 = (TextView) yum0.f(dragonsGoldCellGameView, R.id.currentMoney);
                    if (textView69 != null) {
                        DragonsGoldGameView dragonsGoldGameView = (DragonsGoldGameView) yum0.f(dragonsGoldCellGameView, R.id.dragonsGoldGameField);
                        if (dragonsGoldGameView != null) {
                            Button button = (Button) yum0.f(dragonsGoldCellGameView, R.id.getMoney);
                            if (button == null) {
                                i2 = R.id.getMoney;
                            } else if (((Guideline) yum0.f(dragonsGoldCellGameView, R.id.guideline)) != null) {
                                View viewF18 = yum0.f(dragonsGoldCellGameView, R.id.shimmer);
                                if (viewF18 != null) {
                                    return new efl(dragonsGoldCellGameView, textView69, dragonsGoldGameView, button, viewF18);
                                }
                            } else {
                                i2 = R.id.guideline;
                            }
                        } else {
                            i2 = R.id.dragonsGoldGameField;
                        }
                    } else {
                        i2 = R.id.currentMoney;
                    }
                } else {
                    i2 = R.id.bottomImageBackground;
                }
                hny.u("Missing required view with ID: ".concat(dragonsGoldCellGameView.getResources().getResourceName(i2)));
                return null;
            case 20:
                LayoutInflater layoutInflaterFrom11 = LayoutInflater.from(((EasternNightsCellGameView) this.b).getContext());
                layoutInflaterFrom11.getClass();
                EasternNightsCellGameView easternNightsCellGameView = (EasternNightsCellGameView) this.c;
                layoutInflaterFrom11.inflate(R.layout.eastern_nights_cell_game, easternNightsCellGameView);
                if (((AppCompatTextView) yum0.f(easternNightsCellGameView, R.id.bottomImageBackground)) != null) {
                    TextView textView70 = (TextView) yum0.f(easternNightsCellGameView, R.id.currentMoney);
                    if (textView70 != null) {
                        EasternNightsGameView easternNightsGameView = (EasternNightsGameView) yum0.f(easternNightsCellGameView, R.id.easternNightsGameField);
                        if (easternNightsGameView != null) {
                            Button button2 = (Button) yum0.f(easternNightsCellGameView, R.id.getMoney);
                            if (button2 == null) {
                                i2 = R.id.getMoney;
                            } else if (((Guideline) yum0.f(easternNightsCellGameView, R.id.guideline)) != null) {
                                View viewF19 = yum0.f(easternNightsCellGameView, R.id.shimmer);
                                if (viewF19 != null) {
                                    return new qhn(easternNightsCellGameView, textView70, easternNightsGameView, button2, viewF19);
                                }
                            } else {
                                i2 = R.id.guideline;
                            }
                        } else {
                            i2 = R.id.easternNightsGameField;
                        }
                    } else {
                        i2 = R.id.currentMoney;
                    }
                } else {
                    i2 = R.id.bottomImageBackground;
                }
                hny.u("Missing required view with ID: ".concat(easternNightsCellGameView.getResources().getResourceName(i2)));
                return null;
            case 21:
                LayoutInflater layoutInflaterFrom12 = LayoutInflater.from(((EmptySearchViewNew) this.b).getContext());
                layoutInflaterFrom12.getClass();
                EmptySearchViewNew emptySearchViewNew = (EmptySearchViewNew) this.c;
                View viewInflate2 = layoutInflaterFrom12.inflate(R.layout.view_empty_search_new, (ViewGroup) emptySearchViewNew, false);
                emptySearchViewNew.addView(viewInflate2);
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2;
                int i15 = R.id.iv_empty_search;
                if (((ImageView) yum0.f(viewInflate2, R.id.iv_empty_search)) != null) {
                    i15 = R.id.tv_empty_search_info;
                    TextView textView71 = (TextView) yum0.f(viewInflate2, R.id.tv_empty_search_info);
                    if (textView71 != null) {
                        return new zgu0(constraintLayout, textView71);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i15)));
                return null;
            case 22:
                LayoutInflater layoutInflaterFrom13 = LayoutInflater.from(((ExpandBtnView) this.b).getContext());
                layoutInflaterFrom13.getClass();
                ExpandBtnView expandBtnView = (ExpandBtnView) this.c;
                layoutInflaterFrom13.inflate(R.layout.view_expand_btn, expandBtnView);
                TextView textView72 = (TextView) yum0.f(expandBtnView, R.id.tvAction);
                if (textView72 != null) {
                    return new ahu0(expandBtnView, textView72);
                }
                hny.u("Missing required view with ID: ".concat(expandBtnView.getResources().getResourceName(R.id.tvAction)));
                return null;
            case 23:
                ((wma0) this.b).invoke(Long.valueOf(((upo) ((cp) this.c).u()).f36076a));
                return Unit.f46060a;
            case 24:
                ((wma0) this.b).invoke(Long.valueOf(((upo) ((cp) this.c).u()).f36076a));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Function1) this.b).invoke(new m2p((x2p) this.c));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) this.b).invoke(new bhp(((zgp) this.c).f44355a));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                LayoutInflater layoutInflaterFrom14 = LayoutInflater.from(((shq) this.b).getContext());
                layoutInflaterFrom14.getClass();
                shq shqVar = (shq) this.c;
                View viewInflate3 = layoutInflaterFrom14.inflate(R.layout.vh_rating_first_column_title, (ViewGroup) shqVar, false);
                shqVar.addView(viewInflate3);
                int i16 = R.id.tvNumber;
                TextView textView73 = (TextView) yum0.f(viewInflate3, R.id.tvNumber);
                if (textView73 != null) {
                    i16 = R.id.tvTitle;
                    TextView textView74 = (TextView) yum0.f(viewInflate3, R.id.tvTitle);
                    if (textView74 != null) {
                        return new zcu0((ConstraintLayout) viewInflate3, textView73, textView74);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i16)));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return a();
            default:
                mbk0 mbk0Var = new mbk0();
                Iterator it2 = ((oer) this.c).k().iterator();
                while (it2.hasNext()) {
                    mbk0Var.add(((mer) it2.next()).f((xzs0) this.b));
                }
                return mbk0Var;
        }
    }

    public /* synthetic */ lhf(Object obj, Object obj2, byte b) {
        this.f20052a = b;
        this.b = obj;
        this.c = obj2;
    }
}
