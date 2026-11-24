package a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.dicepoker.DicePokerView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.counter.DsCounter;
import org.xplatform.uikit.components.snackbar.DsSnackBarView;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCyber;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddlePairTeams;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleTwoTeams;
import org.xplatform.uikit_sport.score.SportScore;
import org.xplatform.uikit_sport.victoryindiacator.SportVictoryIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class zkk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44538a = 9;
    public final Object b;
    public final Object c;
    public final TextView d;
    public final View e;
    public final ViewGroup f;
    public final Object g;
    public final Object h;
    public final View i;

    public zkk(DicePokerView dicePokerView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, ImageView imageView12, SyntheticTimerView syntheticTimerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f = dicePokerView;
        this.b = imageView6;
        this.c = imageView7;
        this.g = syntheticTimerView;
        this.d = textView;
        this.e = textView2;
        this.h = textView3;
        this.i = textView4;
    }

    public static zkk a(View view) {
        int i = R.id.iBronzeMedal;
        View viewF = yum0.f(view, R.id.iBronzeMedal);
        if (viewF != null) {
            jk30 jk30VarA = jk30.a(viewF);
            i = R.id.iGoldMedal;
            View viewF2 = yum0.f(view, R.id.iGoldMedal);
            if (viewF2 != null) {
                jk30 jk30VarA2 = jk30.a(viewF2);
                i = R.id.iSilverMedal;
                View viewF3 = yum0.f(view, R.id.iSilverMedal);
                if (viewF3 != null) {
                    jk30 jk30VarA3 = jk30.a(viewF3);
                    i = R.id.iTotalMedal;
                    View viewF4 = yum0.f(view, R.id.iTotalMedal);
                    if (viewF4 != null) {
                        jk30 jk30VarA4 = jk30.a(viewF4);
                        i = R.id.ivFlag;
                        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(view, R.id.ivFlag);
                        if (roundCornerImageView != null) {
                            i = R.id.llMedalRank;
                            if (((LinearLayout) yum0.f(view, R.id.llMedalRank)) != null) {
                                DsSettingsCell dsSettingsCell = (DsSettingsCell) view;
                                i = R.id.tvCounter;
                                TextView textView = (TextView) yum0.f(view, R.id.tvCounter);
                                if (textView != null) {
                                    i = R.id.tvTitle;
                                    TextView textView2 = (TextView) yum0.f(view, R.id.tvTitle);
                                    if (textView2 != null) {
                                        return new zkk(dsSettingsCell, jk30VarA, jk30VarA2, jk30VarA3, jk30VarA4, roundCornerImageView, textView, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f44538a;
        ViewGroup viewGroup = this.f;
        switch (b) {
            case 0:
                return (DicePokerView) viewGroup;
            case 1:
                return (DsChip) viewGroup;
            case 2:
                return (EventCardMiddleCyber) viewGroup;
            case 3:
                return (EventCardMiddlePairTeams) viewGroup;
            case 4:
                return (EventCardMiddleTwoTeams) viewGroup;
            case 5:
                return (LinearLayout) viewGroup;
            case 6:
                return (ConstraintLayout) viewGroup;
            case 7:
                return (DsSnackBarView) viewGroup;
            case 8:
                return (DsSettingsCell) viewGroup;
            case 9:
                return (FrameLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    public zkk(EventCardMiddleTwoTeams eventCardMiddleTwoTeams, DsCounter dsCounter, DsTeamLogo dsTeamLogo, AppCompatTextView appCompatTextView, SportScore sportScore, DsCounter dsCounter2, DsTeamLogo dsTeamLogo2, AppCompatTextView appCompatTextView2) {
        this.f = eventCardMiddleTwoTeams;
        this.b = dsCounter;
        this.c = dsTeamLogo;
        this.g = appCompatTextView;
        this.d = sportScore;
        this.e = dsCounter2;
        this.h = dsTeamLogo2;
        this.i = appCompatTextView2;
    }

    public zkk(LinearLayout linearLayout, MaterialButton materialButton, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView, TextView textView, LinearLayout linearLayout4, TextView textView2) {
        this.f = linearLayout;
        this.b = materialButton;
        this.c = linearLayout2;
        this.g = linearLayout3;
        this.h = recyclerView;
        this.d = textView;
        this.i = linearLayout4;
        this.e = textView2;
    }

    public zkk(EventCardMiddleCyber eventCardMiddleCyber, DsTeamLogo dsTeamLogo, TextView textView, SportVictoryIndicator sportVictoryIndicator, SportScore sportScore, DsTeamLogo dsTeamLogo2, TextView textView2, SportVictoryIndicator sportVictoryIndicator2) {
        this.f = eventCardMiddleCyber;
        this.b = dsTeamLogo;
        this.d = textView;
        this.c = sportVictoryIndicator;
        this.g = sportScore;
        this.h = dsTeamLogo2;
        this.e = textView2;
        this.i = sportVictoryIndicator2;
    }

    public zkk(EventCardMiddlePairTeams eventCardMiddlePairTeams, DsTeamLogo dsTeamLogo, DsTeamLogo dsTeamLogo2, TextView textView, SportScore sportScore, TextView textView2, DsTeamLogo dsTeamLogo3, DsTeamLogo dsTeamLogo4) {
        this.f = eventCardMiddlePairTeams;
        this.b = dsTeamLogo;
        this.c = dsTeamLogo2;
        this.d = textView;
        this.g = sportScore;
        this.e = textView2;
        this.h = dsTeamLogo3;
        this.i = dsTeamLogo4;
    }

    public zkk(DsSnackBarView dsSnackBarView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, FrameLayout frameLayout, AppCompatImageView appCompatImageView2, TextView textView, TextView textView2, TextView textView3) {
        this.f = dsSnackBarView;
        this.b = appCompatImageView;
        this.c = constraintLayout;
        this.g = frameLayout;
        this.i = appCompatImageView2;
        this.d = textView;
        this.e = textView2;
        this.h = textView3;
    }

    public zkk(ConstraintLayout constraintLayout, ImageView imageView, View view, TextView textView, TextView textView2, MaterialButton materialButton, MaterialToolbar materialToolbar, TextView textView3) {
        this.f = constraintLayout;
        this.b = imageView;
        this.c = view;
        this.d = textView;
        this.e = textView2;
        this.g = materialButton;
        this.i = materialToolbar;
        this.h = textView3;
    }

    public zkk(DsSettingsCell dsSettingsCell, jk30 jk30Var, jk30 jk30Var2, jk30 jk30Var3, jk30 jk30Var4, RoundCornerImageView roundCornerImageView, TextView textView, TextView textView2) {
        this.f = dsSettingsCell;
        this.b = jk30Var;
        this.c = jk30Var2;
        this.g = jk30Var3;
        this.h = jk30Var4;
        this.i = roundCornerImageView;
        this.d = textView;
        this.e = textView2;
    }

    public zkk(ConstraintLayout constraintLayout, FrameLayout frameLayout, RoundCornerImageView roundCornerImageView, ImageView imageView, ImageView imageView2, RoundCornerImageView roundCornerImageView2, TextView textView, TextView textView2) {
        this.f = constraintLayout;
        this.g = frameLayout;
        this.h = roundCornerImageView;
        this.b = imageView;
        this.c = imageView2;
        this.i = roundCornerImageView2;
        this.d = textView;
        this.e = textView2;
    }

    public zkk(FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f = frameLayout;
        this.d = textView;
        this.e = textView2;
        this.h = textView3;
        this.i = textView4;
        this.b = textView5;
        this.c = textView6;
        this.g = textView7;
    }

    public zkk(DsChip dsChip, LinearLayout linearLayout, ImageView imageView, CardView cardView, ImageView imageView2, CardView cardView2, TextView textView, TextView textView2) {
        this.f = dsChip;
        this.g = linearLayout;
        this.b = imageView;
        this.h = cardView;
        this.c = imageView2;
        this.i = cardView2;
        this.d = textView;
        this.e = textView2;
    }
}
