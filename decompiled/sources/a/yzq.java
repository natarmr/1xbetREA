package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public final class yzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43528a;
    public final DSLottieEmptyContainer b;
    public final DsNavigationBar c;
    public final RecyclerView d;
    public final SwipeRefreshLayout e;

    public yzq(ConstraintLayout constraintLayout, DSLottieEmptyContainer dSLottieEmptyContainer, DsNavigationBar dsNavigationBar, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f43528a = constraintLayout;
        this.b = dSLottieEmptyContainer;
        this.c = dsNavigationBar;
        this.d = recyclerView;
        this.e = swipeRefreshLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43528a;
    }
}
