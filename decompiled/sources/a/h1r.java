package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final class h1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12298a;
    public final DsBottomBar b;
    public final DSLottieEmptyContainer c;
    public final FrameLayout d;
    public final RecyclerView e;
    public final DsNavigationBar f;

    public h1r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DSLottieEmptyContainer dSLottieEmptyContainer, FrameLayout frameLayout, RecyclerView recyclerView, DsNavigationBar dsNavigationBar) {
        this.f12298a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dSLottieEmptyContainer;
        this.d = frameLayout;
        this.e = recyclerView;
        this.f = dsNavigationBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12298a;
    }
}
