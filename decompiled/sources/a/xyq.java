package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.layouts.linear.ShimmerLinearLayout;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes6.dex */
public final class xyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f41716a;
    public final FrameLayout b;
    public final DSLottieEmptyContainer c;
    public final DsNavigationBar d;
    public final ShimmerLinearLayout e;
    public final RecyclerView f;

    public xyq(ConstraintLayout constraintLayout, FrameLayout frameLayout, DSLottieEmptyContainer dSLottieEmptyContainer, DsNavigationBar dsNavigationBar, ShimmerLinearLayout shimmerLinearLayout, RecyclerView recyclerView) {
        this.f41716a = constraintLayout;
        this.b = frameLayout;
        this.c = dSLottieEmptyContainer;
        this.d = dsNavigationBar;
        this.e = shimmerLinearLayout;
        this.f = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41716a;
    }
}
