package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final class m590 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21210a;
    public final LottieView b;
    public final FrameLayout c;
    public final DsNavigationBar d;
    public final FixedWebView e;

    public m590(ConstraintLayout constraintLayout, LottieView lottieView, FrameLayout frameLayout, DsNavigationBar dsNavigationBar, FixedWebView fixedWebView) {
        this.f21210a = constraintLayout;
        this.b = lottieView;
        this.c = frameLayout;
        this.d = dsNavigationBar;
        this.e = fixedWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21210a;
    }
}
