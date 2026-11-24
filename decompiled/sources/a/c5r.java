package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.layouts.linear.ShimmerLinearLayout;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes6.dex */
public final class c5r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f3785a;
    public final ComposeView b;
    public final DSLottieEmptyContainer c;
    public final CoordinatorLayout d;
    public final FrameLayout e;
    public final ShimmerLinearLayout f;
    public final RecyclerView g;

    public c5r(FrameLayout frameLayout, ComposeView composeView, DSLottieEmptyContainer dSLottieEmptyContainer, CoordinatorLayout coordinatorLayout, FrameLayout frameLayout2, ShimmerLinearLayout shimmerLinearLayout, RecyclerView recyclerView) {
        this.f3785a = frameLayout;
        this.b = composeView;
        this.c = dSLottieEmptyContainer;
        this.d = coordinatorLayout;
        this.e = frameLayout2;
        this.f = shimmerLinearLayout;
        this.g = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3785a;
    }
}
