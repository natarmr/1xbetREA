package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iep extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iep f14644a = new iep(1, yzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/favorites/impl/databinding/FragmentFavoritesCategoryBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.lottieEmptyView;
        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
        if (dSLottieEmptyContainer != null) {
            i = R.id.navigationBar;
            DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
            if (dsNavigationBar != null) {
                i = R.id.recyclerFeed;
                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerFeed);
                if (recyclerView != null) {
                    i = R.id.swipeRefreshView;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) yum0.f(view, R.id.swipeRefreshView);
                    if (swipeRefreshLayout != null) {
                        return new yzq((ConstraintLayout) view, dSLottieEmptyContainer, dsNavigationBar, recyclerView, swipeRefreshLayout);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
