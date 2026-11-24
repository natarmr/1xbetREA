package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class hyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f13870a;
    public final ewe b;
    public final DSLottieEmptyContainer c;
    public final RecyclerView d;
    public final SwipeRefreshLayout e;

    public hyq(FrameLayout frameLayout, ewe eweVar, DSLottieEmptyContainer dSLottieEmptyContainer, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f13870a = frameLayout;
        this.b = eweVar;
        this.c = dSLottieEmptyContainer;
        this.d = recyclerView;
        this.e = swipeRefreshLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13870a;
    }
}
