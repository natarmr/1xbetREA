package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class b3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1922a;
    public final DsBottomBar b;
    public final LottieView c;
    public final DsNavigationBarBasic d;
    public final FrameLayout e;
    public final RecyclerView f;

    public b3r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, LottieView lottieView, DsNavigationBarBasic dsNavigationBarBasic, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f1922a = constraintLayout;
        this.b = dsBottomBar;
        this.c = lottieView;
        this.d = dsNavigationBarBasic;
        this.e = frameLayout;
        this.f = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1922a;
    }
}
