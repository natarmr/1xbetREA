package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y8s0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y8s0 f42210a = new y8s0(1, w6j.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/games_section/feature/daily_tournament/databinding/DailyTournamentResultsWinnerFgBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.cLayout2;
        if (((ConstraintLayout) yum0.f(view, R.id.cLayout2)) != null) {
            i = R.id.chip_recycler_view;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.chip_recycler_view);
            if (recyclerView != null) {
                i = R.id.daily_winner_divider;
                View viewF = yum0.f(view, R.id.daily_winner_divider);
                if (viewF != null) {
                    i = R.id.daily_winner_shadow;
                    View viewF2 = yum0.f(view, R.id.daily_winner_shadow);
                    if (viewF2 != null) {
                        i = R.id.empty_view;
                        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.empty_view);
                        if (dSLottieEmptyContainer != null) {
                            i = R.id.recycler_view;
                            RecyclerView recyclerView2 = (RecyclerView) yum0.f(view, R.id.recycler_view);
                            if (recyclerView2 != null) {
                                i = R.id.tvPlace;
                                if (((TextView) yum0.f(view, R.id.tvPlace)) != null) {
                                    i = R.id.tvPlaceValue;
                                    if (((TextView) yum0.f(view, R.id.tvPlaceValue)) != null) {
                                        i = R.id.tvPoints;
                                        if (((TextView) yum0.f(view, R.id.tvPoints)) != null) {
                                            i = R.id.tvPointsValue;
                                            if (((TextView) yum0.f(view, R.id.tvPointsValue)) != null) {
                                                return new w6j((FrameLayout) view, recyclerView, viewF, viewF2, dSLottieEmptyContainer, recyclerView2);
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
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
