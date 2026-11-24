package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class a2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f137a;
    public final ewe b;
    public final vr9 c;
    public final DSLottieEmptyContainer d;
    public final RecyclerView e;
    public final SwipeRefreshLayout f;
    public final DsNavigationBarBasic g;
    public final View h;

    public a2r(ConstraintLayout constraintLayout, ewe eweVar, vr9 vr9Var, DSLottieEmptyContainer dSLottieEmptyContainer, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, DsNavigationBarBasic dsNavigationBarBasic, View view) {
        this.f137a = constraintLayout;
        this.b = eweVar;
        this.c = vr9Var;
        this.d = dSLottieEmptyContainer;
        this.e = recyclerView;
        this.f = swipeRefreshLayout;
        this.g = dsNavigationBarBasic;
        this.h = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f137a;
    }
}
