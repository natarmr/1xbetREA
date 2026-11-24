package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j1s0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1s0 f15751a = new j1s0(1, x6j.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/games_section/feature/daily_tournament/databinding/DailyTournamentScreenFgBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.descriptions;
        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.descriptions);
        if (recyclerView != null) {
            i = R.id.emptyView;
            DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.emptyView);
            if (dSLottieEmptyContainer != null) {
                i = R.id.error_view;
                FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.error_view);
                if (frameLayout != null) {
                    return new x6j((FrameLayout) view, recyclerView, dSLottieEmptyContainer, frameLayout);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
