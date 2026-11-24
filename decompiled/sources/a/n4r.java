package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class n4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f22911a;
    public final DsBottomBar b;
    public final DSLottieEmptyContainer c;
    public final DsNavigationBarBasic d;
    public final LinearLayout e;
    public final RecyclerView f;
    public final SwipeRefreshLayout g;

    public n4r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DSLottieEmptyContainer dSLottieEmptyContainer, DsNavigationBarBasic dsNavigationBarBasic, LinearLayout linearLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f22911a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dSLottieEmptyContainer;
        this.d = dsNavigationBarBasic;
        this.e = linearLayout;
        this.f = recyclerView;
        this.g = swipeRefreshLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22911a;
    }
}
