package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class t5r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33382a;
    public final DsBottomBar b;
    public final DSLottieEmptyContainer c;
    public final DsNavigationBarBasic d;
    public final RecyclerView e;
    public final vr9 f;

    public t5r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DSLottieEmptyContainer dSLottieEmptyContainer, DsNavigationBarBasic dsNavigationBarBasic, RecyclerView recyclerView, vr9 vr9Var) {
        this.f33382a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dSLottieEmptyContainer;
        this.d = dsNavigationBarBasic;
        this.e = recyclerView;
        this.f = vr9Var;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f33382a;
    }
}
