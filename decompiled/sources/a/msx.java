package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.MatchTimerView;

/* JADX INFO: loaded from: classes5.dex */
public final class msx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f22345a;
    public final RecyclerView b;
    public final RecyclerView c;
    public final TextView d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;
    public final MatchTimerView g;

    public msx(ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MatchTimerView matchTimerView) {
        this.f22345a = constraintLayout;
        this.b = recyclerView;
        this.c = recyclerView2;
        this.d = textView;
        this.e = appCompatTextView;
        this.f = appCompatTextView2;
        this.g = matchTimerView;
    }

    public static msx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_card_common_multi_teams, viewGroup, false);
        int i = R.id.bScoreEnd;
        if (((Barrier) yum0.f(viewInflate, R.id.bScoreEnd)) != null) {
            i = R.id.bScoreStart;
            if (((Barrier) yum0.f(viewInflate, R.id.bScoreStart)) != null) {
                i = R.id.mathInfoGroup;
                if (((Flow) yum0.f(viewInflate, R.id.mathInfoGroup)) != null) {
                    i = R.id.rvOneTeam;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvOneTeam);
                    if (recyclerView != null) {
                        i = R.id.rvTwoTeam;
                        RecyclerView recyclerView2 = (RecyclerView) yum0.f(viewInflate, R.id.rvTwoTeam);
                        if (recyclerView2 != null) {
                            i = R.id.tvMatchDescription;
                            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvMatchDescription);
                            if (textView != null) {
                                i = R.id.tvMatchPeriodInfo;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(viewInflate, R.id.tvMatchPeriodInfo);
                                if (appCompatTextView != null) {
                                    i = R.id.tvScore;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) yum0.f(viewInflate, R.id.tvScore);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.vMatchTimer;
                                        MatchTimerView matchTimerView = (MatchTimerView) yum0.f(viewInflate, R.id.vMatchTimer);
                                        if (matchTimerView != null) {
                                            return new msx((ConstraintLayout) viewInflate, recyclerView, recyclerView2, textView, appCompatTextView, appCompatTextView2, matchTimerView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22345a;
    }
}
