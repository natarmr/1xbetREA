package a;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final class f4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f8929a;
    public final LottieView b;
    public final MaterialToolbar c;
    public final nq8 d;
    public final FixedWebView e;

    public f4r(FrameLayout frameLayout, LottieView lottieView, MaterialToolbar materialToolbar, nq8 nq8Var, FixedWebView fixedWebView) {
        this.f8929a = frameLayout;
        this.b = lottieView;
        this.c = materialToolbar;
        this.d = nq8Var;
        this.e = fixedWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8929a;
    }
}
