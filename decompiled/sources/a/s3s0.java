package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s3s0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s3s0 f31574a = new s3s0(1, q6j.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/games_section/feature/daily_tournament/databinding/DailyTournamentPrizesFgBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.daily_prize_divider;
        View viewF = yum0.f(view, R.id.daily_prize_divider);
        if (viewF != null) {
            i = R.id.daily_prize_shadow;
            View viewF2 = yum0.f(view, R.id.daily_prize_shadow);
            if (viewF2 != null) {
                i = R.id.emptyView;
                DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.emptyView);
                if (dSLottieEmptyContainer != null) {
                    i = R.id.error_view;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.error_view);
                    if (frameLayout != null) {
                        i = R.id.progress;
                        if (((ProgressBar) yum0.f(view, R.id.progress)) != null) {
                            i = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recycler_view);
                            if (recyclerView != null) {
                                return new q6j((FrameLayout) view, viewF, viewF2, dSLottieEmptyContainer, frameLayout, recyclerView);
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
