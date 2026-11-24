package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class a5r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f285a;
    public final DsBottomBar b;
    public final DSLottieEmptyContainer c;
    public final RecyclerView d;
    public final DsNavigationBarBasic e;

    public a5r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DSLottieEmptyContainer dSLottieEmptyContainer, RecyclerView recyclerView, DsNavigationBarBasic dsNavigationBarBasic) {
        this.f285a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dSLottieEmptyContainer;
        this.d = recyclerView;
        this.e = dsNavigationBarBasic;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f285a;
    }
}
