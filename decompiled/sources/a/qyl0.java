package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.layouts.linear.ShimmerLinearLayout;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qyl0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qyl0 f29540a = new qyl0(1, c5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/statistic/stage/impl/databinding/FragmentStageNetComposeBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
        if (composeView != null) {
            i = R.id.lottieEmptyView;
            DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
            if (dSLottieEmptyContainer != null) {
                i = R.id.mainLayout;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) yum0.f(view, R.id.mainLayout);
                if (coordinatorLayout != null) {
                    i = R.id.parentLayout;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.parentLayout);
                    if (frameLayout != null) {
                        i = R.id.shimmerBottom;
                        ShimmerLinearLayout shimmerLinearLayout = (ShimmerLinearLayout) yum0.f(view, R.id.shimmerBottom);
                        if (shimmerLinearLayout != null) {
                            i = R.id.stageNetRecyclerView;
                            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.stageNetRecyclerView);
                            if (recyclerView != null) {
                                return new c5r((FrameLayout) view, composeView, dSLottieEmptyContainer, coordinatorLayout, frameLayout, shimmerLinearLayout, recyclerView);
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
