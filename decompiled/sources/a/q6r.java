package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class q6r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f28214a;
    public final LoadableImageView b;
    public final LottieView c;
    public final DsNavigationBar d;
    public final FrameLayout e;
    public final FixedWebView f;

    public q6r(ConstraintLayout constraintLayout, LoadableImageView loadableImageView, LottieView lottieView, DsNavigationBar dsNavigationBar, FrameLayout frameLayout, FixedWebView fixedWebView) {
        this.f28214a = constraintLayout;
        this.b = loadableImageView;
        this.c = lottieView;
        this.d = dsNavigationBar;
        this.e = frameLayout;
        this.f = fixedWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f28214a;
    }
}
