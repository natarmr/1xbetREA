package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final class bfs0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f2518a;
    public final LinearLayout b;
    public final LottieView c;
    public final zkk d;
    public final RecyclerView e;
    public final SwipeRefreshLayout f;
    public final DsNavigationBar g;

    public bfs0(ConstraintLayout constraintLayout, LinearLayout linearLayout, LottieView lottieView, zkk zkkVar, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, DsNavigationBar dsNavigationBar) {
        this.f2518a = constraintLayout;
        this.b = linearLayout;
        this.c = lottieView;
        this.d = zkkVar;
        this.e = recyclerView;
        this.f = swipeRefreshLayout;
        this.g = dsNavigationBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f2518a;
    }
}
