package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.layouts.linear.ShimmerLinearLayout;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class egb extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final egb f7756a = new egb(1, xyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/statistic/stage/impl/databinding/FragmentChampStatisticTourNetBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.contentLayout;
        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.contentLayout);
        if (frameLayout != null) {
            i = R.id.lottieEmptyView;
            DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
            if (dSLottieEmptyContainer != null) {
                i = R.id.navigationBar;
                DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBar != null) {
                    i = R.id.shimmerBottom;
                    ShimmerLinearLayout shimmerLinearLayout = (ShimmerLinearLayout) yum0.f(view, R.id.shimmerBottom);
                    if (shimmerLinearLayout != null) {
                        i = R.id.stageNetRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.stageNetRecyclerView);
                        if (recyclerView != null) {
                            return new xyq((ConstraintLayout) view, frameLayout, dSLottieEmptyContainer, dsNavigationBar, shimmerLinearLayout, recyclerView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
