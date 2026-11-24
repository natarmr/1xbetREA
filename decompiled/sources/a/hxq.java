package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes4.dex */
public final class hxq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f13822a;
    public final LottieView b;
    public final DsNavigationBarBasic c;
    public final ProgressBar d;
    public final FixedWebView e;

    public hxq(ConstraintLayout constraintLayout, LottieView lottieView, DsNavigationBarBasic dsNavigationBarBasic, ProgressBar progressBar, FixedWebView fixedWebView) {
        this.f13822a = constraintLayout;
        this.b = lottieView;
        this.c = dsNavigationBarBasic;
        this.d = progressBar;
        this.e = fixedWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13822a;
    }
}
