package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final class cmg0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4603a;
    public final DSLottieEmptyContainer b;
    public final DsNavigationBar c;
    public final FrameLayout d;
    public final RecyclerView e;

    public cmg0(ConstraintLayout constraintLayout, DSLottieEmptyContainer dSLottieEmptyContainer, DsNavigationBar dsNavigationBar, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f4603a = constraintLayout;
        this.b = dSLottieEmptyContainer;
        this.c = dsNavigationBar;
        this.d = frameLayout;
        this.e = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4603a;
    }
}
